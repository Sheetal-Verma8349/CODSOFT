
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

class Student
{
    int id;
    String name;
    String grade;
}

class StudentManagementSystem extends Student
{
    String url="jdbc:mysql://localhost:3306/Student";
    String username="root";
    String password="Code#me1";

    Scanner sc=new Scanner(System.in);
    void connectionMethod()
    {
    try {
    Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e) {
    System.out.println(e.getMessage());
    }}
void ShowMenu()
{
    System.out.println("\n\n * * *  WELCOME TO STUDENT MANAGEMENT STUDENT * * *");
    System.out.println("\n1. Add a student");
    System.out.println("2. Delete a student");
    System.out.println("3. Update student information");
    System.out.println("4. Show all students");
    System.out.println("5. Exit");
    System.out.print("\nEnter your choice : ");
    int choice=sc.nextInt();
    switch(choice)
    {
        case 1:
        {
            addStudent();
            ShowMenu();
            break;
        }
        case 2:
        {
            removeStudent();
            ShowMenu();
            break;
        }
        case 3:
        {
            updateStudent();
            ShowMenu();
            break;
        }
        case 4:
        {
            showStudent();
            ShowMenu();
            break;

        }
        case 5:
        {
            System.out.println("THANK YOU...");
        }
    }
}
void addStudent()
{
    try {
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();

        System.out.print ("Enter Student roll Number : ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student name : ");
        name=sc.nextLine();
        System.out.print("Enter Student grade :");
        grade=sc.next();
        String query = "insert into detail(id, name, grade) values (" + id + ", '" + name + "', '" + grade + "')";
        int rows =st.executeUpdate(query);
        if(rows>0)
            System.out.println("\n Student Added Successfully... ");
        else
            System.out.println("Unable to add Student");
        st.close();
        con.close();
    } catch(SQLException e1) {System.out.println(e1.getMessage());}
}

    void removeStudent()
    {
        try {
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();

            System.out.print("Enter Student roll Number to delete the record: ");
            id=sc.nextInt();
            String query = "delete from detail where id="+id;
            int rows =st.executeUpdate(query);
            if(rows>0)
                System.out.println("\n Record deleted Successfully... ");
            else
                System.out.println("Unable to remove Student");
            st.close();
            con.close();
        } catch(SQLException e1) {System.out.println(e1.getMessage());}
    }
    void updateStudent()
    {
        try {
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();

            System.out.print("Enter Student roll Number to Upadate the student record : ");
            id=sc.nextInt();

            String query ="update detail set name='sheet verma' where id="+id;
            int rows =st.executeUpdate(query);
            if(rows>0)
            {
                System.out.println("\n Record updated Successfully... ");
            }
            else {
                System.out.println("Unable to update Student");
            }

            st.close();
            con.close();
        } catch(SQLException e1) {System.out.println(e1.getMessage());}
    }
    void showStudent()
    {
        try {
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();

            System.out.println("\nStudents Records :");
            String query ="select * from detail";
            ResultSet rs =st.executeQuery(query);
            System.out.println("Id  | Name           | Grade   ");
            System.out.println("----------------------------------------------------------------");
           while(rs.next()) {

               System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"         "+rs.getString("grade"));
           }


            st.close();
            con.close();
        } catch(SQLException e1) {System.out.println(e1.getMessage());}
    }
}
public class  Task5{
    public static void main(String agr[]) throws ClassNotFoundException
    {
       StudentManagementSystem s=new StudentManagementSystem();
       s.connectionMethod();
       s.ShowMenu();


    }
}
