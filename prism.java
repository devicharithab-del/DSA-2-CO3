chimport java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Student Performance Prediction using PRISM Algorithm\n");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Attendance Percentage: ");
        int attendance = sc.nextInt();

        System.out.print("Enter Internal Marks: ");
        int marks = sc.nextInt();

        String performance;

        if (attendance > 90 && marks > 80) {
            performance = "Excellent";
        } else if (attendance > 75 && marks > 60) {
            performance = "Good";
        } else if (attendance > 60 && marks > 40) {
            performance = "Average";
        } else {
            performance = "Poor";
        }

        System.out.println("\nGenerated Rule:");

        if (attendance > 90 && marks > 80) {
            System.out.println("IF Attendance > 90 AND Internal Marks > 80");
            System.out.println("THEN Performance = Excellent");
        } else if (attendance > 75 && marks > 60) {
            System.out.println("IF Attendance > 75 AND Internal Marks > 60");
            System.out.println("THEN Performance = Good");
        } else if (attendance > 60 && marks > 40) {
            System.out.println("IF Attendance > 60 AND Internal Marks > 40");
            System.out.println("THEN Performance = Average");
        } else {
            System.out.println("IF Attendance <= 60");
            System.out.println("THEN Performance = Poor");
        }

        System.out.println("\nPrediction Result:");
        System.out.println("Student Name : " + name);
        System.out.println("Performance Category : " + performance);

        System.out.println("\nClassification Completed Successfully");

        sc.close();
    }
}