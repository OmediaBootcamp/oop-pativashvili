package dev.omedia.section7;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getFullName() {
        int lengthOfName = this.getFirstName().length();
        int lengthOfLastName = this.getLastName().length();
        if (lengthOfLastName == 0 && lengthOfName == 0) {
            return "";
        } else if (lengthOfLastName == 0) {
            return firstName;
        } else if (lengthOfName == 0) {
            return lastName;
        } else {
            return this.getFirstName() +" " + this.getLastName();
        }
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }
}
