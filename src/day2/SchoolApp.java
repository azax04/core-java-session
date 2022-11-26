package day2;

public class SchoolApp {

    public static void main(String[] args) {

        School student1 = new School();
        // student1.studentID = "123ABC";
        // student1.name = "Robert";
        student1.setName("Robert");

        // student1.gender = "male";
        student1.setGender("male");

        // student1.age = 12;
        student1.setAge(12);

        //student1.address = "Itahari, Nepal";
        student1.setAddress("Itahari, Nepal");

        //student1.studentClass = 5;
        student1.setStudentClass(5);

        // student1.rollNumber = 28;
        student1.setRollNumber(28);

        // student1.section = "A";
        student1.setSection("A");

        //student1.socialSecurityNumber = "123456789";

        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
        System.out.println(student1.getGender());



        School student2 = new School();
        // student2.studentID = "789XYZ";
        student2.setName("Yaman");
        student2.setAge(13);
        student2.setAddress("Sunsari, Nepal");
        student2.setGender("Female");
        student2.setStudentClass(6);
        student2.setRollNumber(36);
        student2.setSection("B");



    }



}
