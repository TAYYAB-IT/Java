public class task1{
    public static void main(String[] args) {
           
            System.out.print("Enter No. Of Students::");
            Integer students =Integer.parseInt(System.console().readLine()); // input
            System.out.print("Enter No. Of Subjects::");
            Integer subjects = Integer.parseInt(System.console().readLine());

            // Write code to initialize marks array of students x subjects;
            Integer marks[][]=new Integer[students][subjects];

            // write the conditions by yourself
            for(int i=0;i<marks.length; i++){
                System.out.println("\n-------Student #"+(i+1)+" -------");
                for(int j=0;j<marks[i].length; j++){
                   System.out.print("Enter marks of subject #"+(j+1)+"::");
                   marks[i][j] = Integer.parseInt(System.console().readLine());
                }
            }

         // Write code to display all entered marks

            //Marks of students of 0 are : 10, 20 
            //Marks of students of 1 are : 10, 20 
            //Marks of students of 2 are : 10, 20 

            System.out.println("---------Results--------");
            for (int i=0;i<marks.length;i++) {
                System.out.print("\nMarks of student #"+(i+1)+" are : ");
                for (Integer j : marks[i]) {
                    System.out.print(j+" , ");
                 }
            }
    }
}
