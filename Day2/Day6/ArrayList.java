package Day2.Day6;
import java.util.Scanner;
import  java.util.ArrayList;





public class ArrayList {




    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList < String> student = new ArrayList<>();
        ArrayList <Double> grades = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String newstudent;

        System.out.println("Enter your students (or enter to finish):");

        // get the student
        do {
            newstudent = input.nextLine();
            if(!newstudent.equals("")) {
                student.add(newstudent);
            }

        }while(!newstudent.equals(""));

        //get the grads
        for(String stu : student)
            System.out.println(" Grade for "+stu +" : ");
        Double grade = input.nextDouble();
        grades.add(grade);

        //print
        System.out.println("\n Class data ");
        double sum = 0.0;
        for(int i =0 ;i<student.size() ;i++) {
            System.out.println(student.get(i)+" ("+grades.get(i)+")");
            sum = sum+ grades.get(i);
        }
        double avg = sum/student.size();
        System.out.println(" Average grade : "+ avg);

    }






}
