package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student zupa = new Student(name: "Zupa Schwartz", studentId: 1232456, numberOfCredits: 1, gpa: 4.0);
        Student alex = new Student(name: "Alex Cole", studentId: 603275);

        System.out.println("Zupa's gpa:" + zupa.getGpa());
        System.out.println("Alex's gpa:" + alex.getGpa());
    }
}
