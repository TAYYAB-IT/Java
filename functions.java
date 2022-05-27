public class functions {
    static void sum(Integer arr[]){
     Integer sum=0;
     for(Integer x:arr){
         sum+=x;
     }
     System.out.println("Sum="+sum);
    }
    public static void main(String[] args) {
        Integer arr[]={1,2,3};
        sum(arr);
    }
}
