
//5.  SearchTree (concrete class)
//
//    -  It implements NodeList.
//
//    -  It has one field of type ListItem called root.
//
//    -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
//
//    -  And five methods:
//
//        -  getRoot(), getter for root.
//
//        -  addItem(), similar to MyLinkedList. See second TIP below.
//
//        -  removeItem(), same as MyLinkedList.
//
//        -  performRemoval(), takes two ListItems, the item to be removed and its parent. It doesn't return anything and is declared as private. Call this method from removeItem() when the item is found.
//
//        -  traverse(), takes the root as an argument and does not return anything. It uses recursion to visit all the branches in the tree (Inorder). Print each value on a seperate line.


//class SearchTree implements NodeList {
//    private ListItem root;
//
//    public SearchTree(ListItem root) {
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
//            this.root = newItem;
//            return true;
//        }
//
//        ListItem currentItem = this.root;
//        while (currentItem != null) {
//            int comparison = currentItem.compareTo(newItem);
//            if (comparison < 0) {
//                if (currentItem.next() != null) {
//                    currentItem = currentItem.next();
//                } else {
//                    currentItem.setNext(newItem);
//                    return true;
//                }
//            } else if (comparison > 0) {
//                if (currentItem.previous() != null) {
//                    currentItem = currentItem.previous();
//                } else {
//                    currentItem.setPrevious(newItem);
//                    return true;
//                }
//            } else {
//                return false;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean removeItem(ListItem item) {
//        if (item != null) {
//            System.out.println("Removing item " + item.getValue());
//        }
//
//        ListItem currentItem = this.root;
//        ListItem parentItem = currentItem;
//
//        while (currentItem != null) {
//            int comparison = currentItem.compareTo(item);
//            if (comparison == 0) {
//                performRemoval(currentItem, parentItem);
//                return true;
//            } else if (comparison < 0) {
//                parentItem = currentItem;
//                currentItem = currentItem.next();
//            } else {
//                parentItem = currentItem;
//                currentItem = currentItem.previous();
//            }
//        }
//        return false;
//    }
//
//    private void performRemoval(ListItem item, ListItem parent) {
//        // Simple removal of a node
//        if (item.next() == null && item.previous() == null) {
//            if (parent.next() == item) {
//                parent.setNext(null);
//            } else if (parent.previous() == item) {
//                parent.setPrevious(null);
//            }
//        }
//    }
//
//    @Override
//    public void traverse(ListItem root) {
//        if (root != null) {
//            traverse(root.previous());
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
//    }
//}