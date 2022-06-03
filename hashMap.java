import java.util.HashMap;
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
}
}
