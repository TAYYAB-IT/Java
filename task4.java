import java.util.HashSet;
import java.util.Random;
/**
 * task4
 */
public class task4 {
public static void main(String[] args) {
    Integer array[]=new Integer[1000];
    Random rnd=new Random();
    HashSet<Integer>set= new HashSet<Integer>();
    for(int i=0;i<array.length;i++){
        array[i]=rnd.nextInt(1001);
        set.add(array[i]);
    }
    System.out.println("Array Size::"+array.length);
    System.out.println("Set Size::"+set.size());
    System.out.print("Set={ ");
    for (Integer integer : set) {
        System.out.print(integer+", ");
    }
    System.out.print(" }");
}
    
}