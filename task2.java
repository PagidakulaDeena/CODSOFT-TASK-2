import java.util.Scanner;
/**
 * task2
 */
public class task2 {
    public static void main(String[] args) {
        int total=0;
        int average;
    Scanner myobj= new Scanner(System.in);
    //int marks=myobj.nextInt();
    for(int i=1;i<=5;i++){
        System.out.println("enter your marks of subject "+i);
        int marks=myobj.nextInt();
        if(marks>100){
            System.out.println("Invalid number");
            System.out.println("Enter valid numer form start again");
            break;
        }
        total=total+marks;
    }
    System.out.println("YOUR TOTAL MARKES "+total);
     average=total/5;
     System.out.println("YOUR AVERAGE PERCENTAGE"+average);
     if(average>=90 && average<=100)
     {
      System.out.println("YOUR GRADE IS A");
     }
     else if(average>=80 && average<90)
     {
        System.out.println("YOUR GRADE IS B");
     }
     else if(average>=70 && average<80)
     {
        System.out.println("YOUR GRADE IS C");
     }
     else if(average>=60 && average<70)
     {
        System.out.println("YOUR GRADE IS D");
     }
     else if(average>=50 && average<60)
     {
        System.out.println("YOUR GRADE IS E");
     }
     else{
        System.out.println("YOUR GRADE IS F");
     }
}
}
