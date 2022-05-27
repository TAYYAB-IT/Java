public class conditions {
    public static void main(String[] args) {
        System.out.print("Enter Your Marks=");
        Integer marks=Integer.parseInt(System.console().readLine());
        char grade;
        if(marks>=80){
          grade='A';
        }
        else if(marks>=70){
            grade='B';
        }
        else if(marks>=60){
            grade='C';
        }
        else if(marks>=50){
            grade='D';
        }
        else{
            grade='F';
        }

        System.out.println("Your Grade is "+grade);
    }
}
