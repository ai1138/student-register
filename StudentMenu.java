import java.util.Scanner;
import java.util.ArrayList;
class StudentMenu
{
  public static void main(String[] args) 
  {
    int val;
    Scanner input = new Scanner(System.in);
    System.out.println("type 1: add new student");
    System.out.println("type 2: display all students");
    System.out.println("type 3: Search for student by ID");
    System.out.println("type 4: Search for student by last name");
    System.out.println("type 5: Modify a student's GPA");
    System.out.println("type 6: Obtain the First name and Last name of the students with the highest gpa");
    System.out.println("type 7: Remove student (by id)");
    System.out.println("type 8: Exit");
    
    ArrayList<Student> database = new ArrayList<Student>();
    while (!input.hasNextInt()) 
    {
        System.out.println("That's not a number!");
        input.next(); // this is important!
    }
    val = input.nextInt();
    while(val != 8)
    {
      if(val == 1)
      {
        System.out.println("Enter first name ");
        String firstName = input.next();
        System.out.println("Enter last name ");
        String lastName = input.next();
        System.out.println("Enter a new ID number");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        int idNumber = input.nextInt();
        while(checkID(database,idNumber))
        {
          System.out.println("sorry please try a new id");
          idNumber = input.nextInt();
        }
        System.out.println("Enter student gpa");
        while (!input.hasNextDouble()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        double gpa = input.nextDouble();
        database.add(new Student(firstName,lastName,idNumber,gpa));
        System.out.println("type 1: add new student");
        System.out.println("type 2: display all students");
        System.out.println("type 3: Search for student by ID");
        System.out.println("type 4: Search for student by last name");
        System.out.println("type 5: Modify a student's GPA");
        System.out.println("type 6: Obtain the First name and Last name of the students with the highest gpa");
        System.out.println("type 7: Remove student (by id)");
        System.out.println("type 8: Exit");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        val = input.nextInt();
      }
      if(val == 2)
      {
        printArr(database);
        System.out.println("type 1: add new student");
        System.out.println("type 2: display all students");
        System.out.println("type 3: Search for student by ID");
        System.out.println("type 4: Search for student by last name");
        System.out.println("type 5: Modify a student's GPA");
        System.out.println("type 6: Obtain the First name and Last name of the students with the highest gpa");
        System.out.println("type 7: Remove student (by id)");
        System.out.println("type 8: Exit");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next();
        }
        val = input.nextInt();
      }
      if(val == 3)
      {
        System.out.println("Enter id number");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        int id = input.nextInt();
        searchByID(database,id); 
        System.out.println("type 1: add new student");
        System.out.println("type 2: display all students");
        System.out.println("type 3: Search for student by ID");
        System.out.println("type 4: Search for student by last name");
        System.out.println("type 5: Modify a student's GPA");
        System.out.println("type 6: Obtain the First name and Last name of the students with the highest gpa");
        System.out.println("type 7: Remove student (by id)");
        System.out.println("type 8: Exit");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        val = input.nextInt();
      }
      if(val == 4)
      {
        System.out.println("Enter last name");
        String name = input.next();
        searchByLastName(database,name); 
        System.out.println("type 1: add new student");
        System.out.println("type 2: display all students");
        System.out.println("type 3: Search for student by ID");
        System.out.println("type 4: Search for student by last name");
        System.out.println("type 5: Modify a student's GPA");
        System.out.println("type 6: Obtain the First name and Last name of the students with the highest gpa");
        System.out.println("type 7: Remove student (by id)");
        System.out.println("type 8: Exit");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        val = input.nextInt();
      }
      if(val == 5)
      { 
        System.out.println("Enter id number");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        int id = input.nextInt();
        System.out.println("Enter student gpa");
        while (!input.hasNextDouble()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        double gpa = input.nextDouble();
        modifyGPA(database, id, gpa);
        System.out.println("type 1: add new student");
        System.out.println("type 2: display all students");
        System.out.println("type 3: Search for student by ID");
        System.out.println("type 4: Search for student by last name");
        System.out.println("type 5: Modify a student's GPA");
        System.out.println("type 6: Obtain the First name and Last name of the students with the highest gpa");
        System.out.println("type 7: Remove student (by id)");
        System.out.println("type 8: Exit");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        val = input.nextInt();

      }
      if(val == 6)
      {
        highestGPA(database);
        System.out.println("type 1: add new student");
        System.out.println("type 2: display all students");
        System.out.println("type 3: Search for student by ID");
        System.out.println("type 4: Search for student by last name");
        System.out.println("type 5: Modify a student's GPA");
        System.out.println("type 6: Obtain the First name and Last name of the students with the highest gpa");
        System.out.println("type 7: Remove student (by id)");
        System.out.println("type 8: Exit");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        val = input.nextInt();
      }
      if(val == 7)
      {
        System.out.println("Enter id number");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        int id = input.nextInt();
        removeStudent(database,id); 
        System.out.println("type 1: add new student");
        System.out.println("type 2: display all students");
        System.out.println("type 3: Search for student by ID");
        System.out.println("type 4: Search for student by last name");
        System.out.println("type 5: Modify a student's GPA");
        System.out.println("type 6: Obtain the First name and Last name of the students with the highest gpa");
        System.out.println("type 7: Remove student (by id)");
        System.out.println("type 8: Exit");
        while (!input.hasNextInt()) 
        {
            System.out.println("That's not a number!");
            input.next(); 
        }
        val = input.nextInt();
      }
      
    }

  }
  public static boolean checkID(ArrayList<Student> arr, int id) 
  {
    for(int i = 0; i < arr.size();i++)
    {
      if(arr.get(i).getIdnumber() == id)
      {
        return true;
      }
    }
    return false;
  }
  public static void printArr (ArrayList<Student> arr) 
  {
    for(int i = 0; i < arr.size();i++)
    {
      System.out.println(arr.get(i));
    }
  }
  public static void searchByID(ArrayList<Student> arr,int id)
  {
    for(int i = 0; i < arr.size();i++)
    {
      if(arr.get(i).getIdnumber() == id)
      {
        System.out.println(arr.get(i));
      }
    }
    
    
  }
  public static void searchByLastName(ArrayList<Student> arr,String last)
  {
    for(int i = 0; i < arr.size();i++)
    {
      if(arr.get(i).getLastname().toLowerCase().equals(last.toLowerCase()))
      {
        System.out.println(arr.get(i));
      }
    }
  }
  public static void modifyGPA(ArrayList<Student> arr,int id,double gpa)
  {
    for(int i = 0; i < arr.size();i++)
    {
      if(arr.get(i).getIdnumber() == id)
      {
        arr.get(i).setGpa(gpa);;
        System.out.println(arr.get(i));
      }
    }
  }
  public static double findHighestGPA(ArrayList<Student> arr)
  {
    double max = 0;
    for(int i = 0; i < arr.size();i++)
    {
      if(arr.get(i).getGpa() > max)
      {
        max = arr.get(i).getGpa();
      }
    }
    return max;
  }
  public static void highestGPA(ArrayList<Student> arr)
  {
      double highest = findHighestGPA(arr);
      for(int i = 0; i < arr.size();i++)
      {
        if(arr.get(i).getGpa() == highest)
        {
           System.out.println(arr.get(i));
        }
      }
  }
  public static void removeStudent(ArrayList<Student> arr,int id)
  {
    if(arr.size() == 0)
    {
      System.out.println("nothing to remove");
    }
    else
    {
      for(int i = 0; i < arr.size();i++)
      {
        if(arr.get(i).getIdnumber() == id)
        {
          arr.remove(i);
          System.out.println("student removed");
        }
      }
    }
  }

}
