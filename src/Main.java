import javax.tools.JavaCompiler;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args)
    {
        System.out.println("Hello EAR!");
        ContactManager myContactManager = new ContactManager();


        Contact alma = new Contact();
        Contact barack = new Contact();
        Contact korte = new Contact();

        alma.setName("Alma");
        alma.phoneNumber = "+3630111";
        barack.setName("Barack");
        barack.phoneNumber = "+3630222";
        korte.setName("Korte");
        korte.phoneNumber = "+3630333";

        myContactManager.addContact(alma);
        myContactManager.addContact(barack);
        myContactManager.addContact(korte);

        System.out.println((myContactManager.searchContact("Alma")).phoneNumber);
    }

}
