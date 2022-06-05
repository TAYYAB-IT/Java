import java.util.HashMap;
import java.util.Map.Entry;
public class hashMap {
    static HashMap<String,Float> dict=new HashMap<String,Float>();

public static void main(String[] args) {
    String roll_no="";
    Float marks;
while(true){
 System.out.print("\nEnter Your Roll No#");
 roll_no=System.console().readLine();
 if(roll_no.equals("-1")){break;}
 if(dict.containsKey(roll_no)){
     System.out.println(roll_no+" marks are "+dict.get(roll_no));
 }
 else{
    System.out.print("\nEnter Your Marks#");
    marks=Float.parseFloat(System.console().readLine());
    dict.put(roll_no, marks);
 }
}
//dict.containsKey(key); //Check Either a key exist or not
//dict.containsValue(value); //Check Either a value exist or not
//dict.clear();// Clear the whole HashMap Data
//dict.keySet();// Get Key Set of HashMap 
//dict.put(key, value); // Add A new Or Update key value
//dict.remove(key);  //Remove a Value by key
//dict.get(key);   //Get A value by key
//dict.values()     //Get All Values
//Iterate A HashMap //dict.entrySet()
System.out.println("----------------------------------------------");
for(Entry <String,Float> entry:dict.entrySet()){
System.out.println(entry.getKey()+" : "+entry.getValue());
}
}
}
