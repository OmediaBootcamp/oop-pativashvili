package dev.omedia.section11.Abstract;
//3.  MyLinkedList (concrete class)
//
//    -  It implements NodeList.
//
//    -  It has one field of type ListItem called root.
//
//    -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
//
//    -  And four methods:
//
//        -  getRoot(), getter for root.
//
//        -  addItem(), takes a ListItem and returns true if it was added successfully or false otherwise.
//        If the item is already present, it doesn't get added. Use compareTo() to place the item in its proper order.
//
//        -  removeItem(), takes a ListItem and returns true if it was removed successfully or false otherwise.
//
//        -  traverse(), takes the root as an argument and does not return anything.
//        If the root is null it prints out: The list is empty, otherwise print each value on a separate line.
//}


//class MyLinkedList implements NodeList {
//    private ListItem root;
//
//    public MyLinkedList(ListItem root) {
//        this.root = root;
//    }
//
//    @Override
//    public ListItem getRoot() {
//        return this.root;
//    }
//
//    @Override
//    public boolean addItem(ListItem newItem) {
//        if (this.root == null) {
//            // The list is empty, so this item becomes the head of the list
//            this.root = newItem;
//            return true;
//        }
//
//        ListItem currentItem = this.root;
//        while (currentItem != null) {
//            int comparison = currentItem.compareTo(newItem);
//            if (comparison < 0) {
//                // newItem is greater, move right if possible
//                if (currentItem.next() != null) {
//                    currentItem = currentItem.next();
//                } else {
//                    // There's no next, so place it here
//                    currentItem.setNext(newItem).setPrevious(currentItem);
//                    return true;
//                }
//            } else if (comparison > 0) {
//                // newItem is smaller, move left if possible
//                if (currentItem.previous() != null) {
//                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
//                    newItem.setNext(currentItem).setPrevious(newItem);
//                } else {
//                    // The root is smaller than newItem, insert before root
//                    newItem.setNext(this.root).setPrevious(newItem);
//                    this.root = newItem;
//                }
//                return true;
//            } else {
//                // equal, do not add
//                return false;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean removeItem(ListItem item) {
//        if (item != null) {
//            System.out.println("Deleting item " + item.getValue());
//        }
//
//        ListItem currentItem = this.root;
//        while (currentItem != null) {
//            int comparison = currentItem.compareTo(item);
//            if (comparison == 0) {
//                // Found the item to delete
//                if (currentItem == this.root) {
//                    this.root = currentItem.next();
//                } else {
//                    currentItem.previous().setNext(currentItem.next());
//                    if (currentItem.next() != null) {
//                        currentItem.next().setPrevious(currentItem.previous());
//                    }
//                }
//                return true;
//            } else if (comparison < 0) {
//                currentItem = currentItem.next();
//            } else {
//                // comparison > 0
//                return false;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public void traverse(ListItem root) {
//        if (root == null) {
//            System.out.println("The list is empty");
//        } else {
//            while (root != null) {
//                System.out.println(root.getValue());
//                root = root.next();
//            }
//        }
//    }
