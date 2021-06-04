
import java.util.Scanner;

class Agenda {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int length;
        System.out.println("How many courses do you want to add?");
        length = reader.nextInt();

        String[] course = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the course " + (i + 1));
            course[i] = reader.next();
        }

        System.out.println("Your courses are: ");
        for (int i = 0; i < length; i++) {
            System.out.print(course[i]);
            System.out.print(", ");
        }
        
        System.out.println();
        
        double[] mark;
        mark = new double[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter your mark for " + course[i]);
            mark[i] = reader.nextDouble();
        }

        System.out.println("Your marks are: ");
        for (int i = 0; i < length; i++) {
            System.out.println(mark[i] + " " + course[i]);
        }
        reader.close();
    } 
}