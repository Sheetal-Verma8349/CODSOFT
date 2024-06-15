/*
CodSoft Task 2
Sheetal Verma
 */
import java.util.*;
class StudentGradeCalculator
{
    float englishMarks,mathMarks,hindiMarks,sanskritMarks,scienceMarks;
    float total,averagePercentage;
    Scanner sc=new Scanner(System.in);
    void welcome()
    {
        System.out.println("\n                         STUDENT GRADE CALCULATOR");
        System.out.println("--------------------------------------------------------------------");
    }
    void insertMarks()
    {

        System.out.print("Enter marks of English  : ");
        englishMarks=sc.nextFloat();
        System.out.print("Enter marks of Hindi    : ");
        hindiMarks=sc.nextFloat();
        System.out.print("Enter marks of Science  : ");
        scienceMarks=sc.nextFloat();
        System.out.print("Enter marks of Sanskrit : ");
        sanskritMarks=sc.nextFloat();
        System.out.print("Enter marks of Maths    : ");
        mathMarks=sc.nextFloat();
    }
    void gradeCalculation()
    {
       total=englishMarks+mathMarks+hindiMarks+sanskritMarks+scienceMarks;
       averagePercentage=total/5;
    }
    void displayResult()
    {
        System.out.println("\n* * * RESULT * * *");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Subjects           Marks");
        System.out.println("English            "+englishMarks);
        System.out.println("Maths              "+mathMarks);
        System.out.println("Science            "+scienceMarks);
        System.out.println("Hindi              "+hindiMarks);
        System.out.println("Sanskrit           "+sanskritMarks);

        System.out.println("\nAverage Percentage : "+averagePercentage);
    }
    void grade()
    {
        if(averagePercentage>30 && averagePercentage<50)
        {
            System.out.println("Grade D");
            System.out.println(" Your performance is very poor");
        }
        else if(averagePercentage>=50 && averagePercentage<=70)
        {
            System.out.println("Grade C");
            System.out.println("Your performance is average");
        }
        else if(averagePercentage>=70 && averagePercentage<=80)
        {
            System.out.println("Grade B");
            System.out.println("Your performance is good");
        }
        else if(averagePercentage>80 && averagePercentage<90)
        {
            System.out.println("Grade A");
            System.out.println("your performance is excellent");
        }
        else if(averagePercentage>90 && averagePercentage<=100)
        {
            System.out.println("Grade O");
            System.out.println("your performance is outstanding");
        }
        else
        {
            System.out.println("You Fail in Exam");
        }
        System.out.println("\n                    THANK YOU");
    }
}
public class Task2 {
    public static void main(String arg[])
    {
    StudentGradeCalculator s=new StudentGradeCalculator();
    s.welcome();
    s.insertMarks();
    s.gradeCalculation();
    s.displayResult();
    s.grade();
    }
}
