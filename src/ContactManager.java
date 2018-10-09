import java.util.ArrayList;
import java.util.List;

public class Contact
{
    String name;
    String email;
    String phoneNumber;
}

public class ContactManager {

    List<Contact> myFriends;
    int friendsCount;

    ContactManager()
    {
        this.friendsCount = 0;
        List<Contact> myFriends = new ArrayList<>();

    }

    void addContact(Contact contact)
    {
        myFriends.set(friendsCount, contact);
        friendsCount++;
    }

    Contact searchContact(String searchName)
    {
        for(int i = 0; i < friendsCount ; i++)
        {
            if(myFriends.get(i).name.equals(searchName))
            {
                return myFriends.get(i);
            }
        }
        return null;
    }
}
