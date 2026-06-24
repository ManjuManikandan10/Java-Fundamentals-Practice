import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Student Details
        System.out.print("Enter Student Name:Manju ");
        String name = sc.nextLine();

        System.out.print("Enter Student Reg No:028 ");
        int regno = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Department: CS");
        String department = sc.nextLine();

        System.out.print("Enter Student Age: 20");
        int age = sc.nextInt();

        System.out.print("Enter Student Marks:80 ");
        double marks = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter Blood Group:B+ ");
        String bloodGroup = sc.nextLine();

        // Display Student Details
        System.out.println("\n----- Student Details -----");
        System.out.println("Name        : " + name);
        System.out.println("Reg No      : " + regno);
        System.out.println("Department  : " + department);
        System.out.println("Age         : " + age);
        System.out.println("Marks       : " + marks);
        System.out.println("Blood Group : " + bloodGroup);

        sc.close();
    }
}