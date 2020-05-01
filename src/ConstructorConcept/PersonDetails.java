package ConstructorConcept;

public class PersonDetails {
    String first_name;
    String last_name;
    String Address;
    String email;
    int contact;

    public void printData(){
        System.out.println("Name of person is: "+ first_name +" "+ last_name );
        System.out.println("Address: "+ Address);
        System.out.println("Email ID "+ email);
        System.out.println("Mobile Number: "+ contact);
    }
    public PersonDetails( String fname, String lname, String add, String mail, int con){
        first_name = fname;
        last_name = lname;
        Address = add;
        email = mail;
        contact = con;
    }
}

