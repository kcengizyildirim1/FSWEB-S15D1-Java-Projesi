package com.workintech.mobile;

public class MobileMain {
    public static void main(String[] args) {
        Contact mehmet = new Contact("mehmet", "234235443");
        Contact ahmet = new Contact("ahmet", "33333333");
        Contact ayse = new Contact("ayşe", "111111112");
        Contact murat = new Contact("murat", "3331123322");


        MobilePhone mobilePhone = new MobilePhone("2323423422");
        mobilePhone.addNewContact(mehmet);
        mobilePhone.addNewContact(ahmet);
        mobilePhone.addNewContact(ayse);
        mobilePhone.addNewContact(murat);
        System.out.println("-- initial contacts started");
        mobilePhone.printContacts();
        System.out.println("-- initial contacts ended");

        System.out.println("update contacts started");
        boolean updateResult = mobilePhone.updateContact(ahmet, new Contact("ahmet", "444444"));
        mobilePhone.printContacts();
        System.out.println("update contacts ended:" + updateResult);

        System.out.println("remove contact start");
        boolean removeResult = mobilePhone.removeContact(murat);
        mobilePhone.printContacts();
        System.out.println("remove contact ended: " + removeResult);

        System.out.println("query started");
        Contact contact = mobilePhone.queryContact("ayşe");
        if (contact != null) {
            System.out.println("query ended: " + contact.getName() + "--" + contact.getPhoneNumber());
        } else {
            System.out.println("result null for query");
        }


        System.out.println("find contact 1 started");
        int indexResult = mobilePhone.findContact(ahmet);
        System.out.println("find contact 1 ended: " + indexResult);

        System.out.println("find contact 2 started");
        int indexResult2 = mobilePhone.findContact("mehmet");
        System.out.println("find contact 2 ended : " + indexResult2);
    }
}
