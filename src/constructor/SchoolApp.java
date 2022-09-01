package constructor;



public class SchoolApp {

    public static void main(String[] args) {

        School student = new School();
//        School student1 = new School("Kathmandu");
//        School student02 = new School("Itahari");

//        // student1.studentID = "123ABC";
//        // student1.name = "Robert";
//        student1.setName("Robert");
//
//        // student1.gender = "male";
//        student1.setGender("male");
//
//        // student1.age = 12;
//        student1.setAge(12);
//
//        //student1.address = "Itahari, Nepal";
//        student1.setAddress("Itahari, Nepal");
//
//        //student1.studentClass = 5;
//        student1.setStudentClass(5);
//
//        // student1.rollNumber = 28;
//        student1.setRollNumber(28);
//
//        // student1.section = "A";
//        student1.setSection("A");
//
//        //student1.socialSecurityNumber = "123456789";

//        System.out.println(student1.getName());
//        System.out.println(student1.getAddress());
//        System.out.println(student1.getGender());



        School student2 = new School();
//        School student3 = new School("Yaman");
//        School student4 = new School("BBB");
        // student2.studentID = "789XYZ";
//        student2.setName("Yaman");
//        student2.setAge(13);
//        student2.setAddress("Sunsari, Nepal");
//        student2.setGender("Female");
//        student2.setStudentClass(6);
//        student2.setRollNumber(36);
//        student2.setSection("B");




        School student5 = new School("567NBA", "Ram", 10, "Male", "Itahari", "987654321");
        School student6 = new School("567ABC", "Sita", 12, "Female", 5, "A", 1,  "Biratnagar", "123456789");

        System.out.println(student5.getName());
        System.out.println(student5.getGender());
        System.out.println(student5.getStudentID());

        School student7 = new School("567123", "Harry", 12, "Male", "Ktm", "453235678");

    }



}
