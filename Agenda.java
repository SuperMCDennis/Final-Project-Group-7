/*
 * Date: Friday, June 4th, 2021
 * Name: Amir
 * Teacher: Mr. Ho
 * Description: Students Personal Agenda
 */

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

class Agenda {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int length;
        System.out.println("How many courses do you want to add?");
        length = reader.nextInt();
        reader.nextLine();  // Consume newline left-over
        Course[] courses = new Course[length];
        for (int i = 0; i < length; i++) {
            Course course = new Course();
            System.out.println("Enter the course name of " + (i + 1));
            String name = "";
            name += reader.nextLine();
            course.SetCourseName(name); 
            courses[i] = course;
        }

        System.out.println("Your courses are: ");
        for (int i = 0; i < length; i++) {
            System.out.print(courses[i].courseName);
            
            System.out.print(", ");
        }
        
        System.out.println();
        DecimalFormat df = new DecimalFormat("####0.00");
        for (int i = 0; i < length; i++) {
            System.out.println("How many Assignments do you have for " + courses[i].courseName + " ?");
            int lengthAssignment =  reader.nextInt();
            if( lengthAssignment <= 0 || lengthAssignment >= 5 ){
                System.out.println("Please enter number from 1 to 5 " + courses[i].courseName + " ?");
                lengthAssignment =  reader.nextInt();
            }
            courses[i].SetNumberOfAssignments(lengthAssignment);
          
            for( int j=0; j < lengthAssignment; j++ ){
                reader.nextLine();  // Consume newline left-over
                System.out.println("Please enter name of the Assignments " + ( j + 1) + " " + courses[i].courseName);
                String name = "";
                name +=reader.nextLine();
                
                try{
                    System.out.println("Please enter weight for   " + name);

                    double weight = reader.nextDouble();
                  
                    System.out.println("Please enter mark for   " + name);
                    double mark = reader.nextDouble();
                    courses[i].SetAssignment(j,name,weight,mark);
                }catch(InputMismatchException ex){

                }
               
            }

            double weightAverage = courses[i].CalculateWeightAverage();
            System.out.println("Weight average for course    " + courses[i].courseName + " " + df.format(weightAverage));
        
        }

        double totalweigthCourses = 0.0;
        for (int i = 0; i < length; i++) {
            totalweigthCourses += courses[i].CalculateWeightAverage();
        }

        System.out.println("Weight average for all courses    " + df.format(totalweigthCourses/length));
      
        reader.close();
    } 



}