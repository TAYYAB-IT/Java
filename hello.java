public class hello {
public static void main(String[] args) {
   // String var="Hey Alias!"; //Hey Alias!
  // String var="9"+9; //99
  // Integer var=7;   //7
 //  Double var=8.9;    //8.9
 //System.out.print(var);
 try{
  System.out.print("Number1::");
  //String v1= System.console().readLine();
  Double v1=Double.parseDouble( System.console().readLine());
  System.out.print("Number2::");
  //String v2= System.console().readLine();
  Double v2=Double.parseDouble( System.console().readLine());
    System.out.print("Sum::"+(v1+v2)+"\n");
    System.out.print("Sub::"+(v1-v2)+"\n");
    System.out.print("Div::"+(v1/v2)+"\n");
    System.out.print("Mul::"+(v1*v2)+"\n");
    System.out.print("Mod::"+(v1%v2)+"\n");
    System.out.print("Pow::"+Math.pow(v1, v2)+"\n");
}
catch(Error err){
    System.out.print(err.getMessage());
}
}

    
}