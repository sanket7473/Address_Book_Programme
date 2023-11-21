package com.address_book;
import java.util.ArrayList;
import java.util.List;
public class AddressBookMain {

    private List<Contacts> Contactlist =new ArrayList<>();
    private void addContacts(Contacts contacts)
    {
        Contactlist.add(contacts);
    }
    private void showContacts()
    {
        for(Contacts contacts : Contactlist)
        {
            System.out.println(contacts.getFirstName()+ " "+contacts.getLastName()+" "+contacts.getAddress()+" "+contacts.getCity()+" "+contacts.getState()+" "+contacts.getZipcode()+" "+contacts.getPhoneNumber()+" "+contacts.getEmail());

        }
    }
    public void print_msg()
    {
        System.out.println("Welcome to Address Book Programme");
    }
    public static void main(String[] args)
    {
        AddressBookMain s1= new AddressBookMain();
        s1.print_msg();
        Contacts contacts1=new Contacts("sanket","garde", "ghatkopar","mumbai","maharashtra",40075,"8999999999","sanket@email.com");
        Contacts contacts2=new Contacts("rohan","shinde", "wakad","pune ","maharashtra",411048, "8975612434","rohan@gmail.com");
        Contacts contacts3=new Contacts("mohit","pisal", "pimpri","pune ","maharashtra",411042, "8975612456","mohit@gmail.com");

        s1.addContacts(contacts1);
        s1.addContacts(contacts2);
        s1.addContacts(contacts3);
        s1.showContacts();


    }
}
