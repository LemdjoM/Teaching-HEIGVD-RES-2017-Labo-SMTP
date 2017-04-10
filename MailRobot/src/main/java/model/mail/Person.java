package model.mail;

/**
 * Created by lemdjo on 04.04.2017.
 */
public class Person {

    private String address;
    private String firstname;
    private String lastname;
    public Person(String addr, String firstname, String lastname){
        this.address =  addr;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * retourne l'adresse
     * @return
     */
    public String getAddr(){
        return address;
    }

    /**
     * retourne le prenom
     * @return
     */
    public String getfirstname(){
        return firstname;
    }

    /**
     * returne le nom
     * @return
     */
    public String getlastname(){
        return lastname;
    }

}
