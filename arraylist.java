import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Ali");
        namesList.add("Ahmed");
        //namesList.size() 2
        //namesList[0] // Ali
        for (String name : namesList) {
            System.out.println(name);
        }

    }
}
