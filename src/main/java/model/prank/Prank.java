package model.prank;

/**
 * Created by lemdjo on 04.04.2017.
 */


import java.util.ArrayList;
import java.util.List;
import model.mail.Message;
import model.mail.Person;


public class Prank {

    private Person victimSender;
    private final List<Person> victimRecipients = new ArrayList<Person>();
    private final List<Person> witnessRecepients = new ArrayList<Person>();
    private Message message;

    public Person getVictimSender() {
        return victimSender;
    }


    public void addVictimRecipients(List<Person> victimRecipients) {
        this.victimRecipients.addAll(victimRecipients);
    }



    public void addWitnessvictim(List<Person> witnessrecipient) {
        this.witnessRecepients.addAll(witnessrecipient);
    }

    public Message getMessage() {
        return message;
    }


    public List<Person> getVictimRecipient() {
        return victimRecipients;
    }


    public List<Person> getwitnessrecipient() {
        return witnessRecepients;
    }

    public void setMessage(Message msg) {
        this.message = msg;
    }

    public void setVictimsender(Person victimesender) {
        this.victimSender = victimesender;
    }

}
