import java.util.Scanner;

public class Gread_calculator {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Students Gread calculator");
        System.out.println("Enter No Of Subjects");
        int noOfSubjects=s.nextInt();
        int tot=0;
        for(int i=0;i<noOfSubjects;i++){
            System.out.println("Enter Marks Obtain In "+i+": ");
            int marks=s.nextInt();
            tot=tot+marks;
        }
        double average=(double) tot/noOfSubjects;
        char studentGread;
        if(average>=90){
            studentGread='O';
        }else if (average>=80){
            studentGread='A';
        } else if (average>=70) {
            studentGread='B';
        } else if (average>=60) {
            studentGread='C';
        } else if (average>=50) {
            studentGread='D';
        }else if (average>=40){
            studentGread='E';
        }else {
            studentGread='F';
        }
        System.out.println("Total MArks Scored is"+tot);
        System.out.println("Average Percentage Gained is"+average+"%");
        System.out.println("Gread :"+studentGread);

    }
}

