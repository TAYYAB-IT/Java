package Classes;

public class Electronics {
   protected Boolean status=false;
   protected Integer currunt_value=0;
   public Boolean isOn(){
    return this.status;
   }
   public void On(){
    System.out.print((this.status)?" is Already ON":" is ON\n");
    this.status=true;
   }
   public void Off(){
    System.out.print((!this.status)?" is Already OFF":" is OFF\n");
    this.status=false;
   }
   public void next(){
    this.currunt_value++;
   }
   public void prev(){
    this.currunt_value--;
   }

}
