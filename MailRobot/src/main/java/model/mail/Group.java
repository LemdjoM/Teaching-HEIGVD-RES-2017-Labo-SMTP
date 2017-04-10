package model.mail;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lemdjo on 04.04.2017.
 */
public class Group {
    private  List<Person> members = new LinkedList<Person>();

    public void addMember(Person p){
        members.add(p);
    }

    public List<Person> getmembers(){
        return members;
    }
}
