import java.util.ArrayList;
/* 
 In arrayList a new array is replaced with a newer array 
 & Old one array is removed/deleted
 That's why better to use linked list 
 */
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Ali");
        namesList.add("Ahmed");
        //namesList.get(index)
        //namesList.set(index, element)
        // namesList.add(index, element);
       // namesList.remove(index)
       //namesList.clear(); //clear whole arraylist
        //namesList.size() 2
        //namesList[0] // Ali
        for (String name : namesList) {
            System.out.println(name);
        }

    }
}
