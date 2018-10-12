import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    List<Contact> myFriends;
    int friendsCount;

    ContactManager()
    {
        this.friendsCount = 0;
        myFriends = new ArrayList<Contact>();

    }

    void addContact(Contact contact)
    {
        myFriends.add(contact);
        friendsCount++;
    }

    Contact searchContact(String searchName)
    {
        for(int i = 0; i < friendsCount ; i++)
        {
            if(myFriends.get(i).getName().equals(searchName))
            {
                return myFriends.get(i);
            }
        }
        return null;
    }
}
