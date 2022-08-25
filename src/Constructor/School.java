package Constructor;

public class School {

    //State

    // get but not set
    private String studentID;

    // get and set both allowed
   private String name;

    // get and set both allowed
    private int age;

    // get and set both allowed
    private String gender;

    // get and set both allowed
    private int studentClass;

    // get and set both allowed
    private String section;

    // get and set both allowed
    private int rollNumber;

    // get and set both allowed
    private String address;


    // get but not set
    private String socialSecurityNumber;


    //
    //Constructor
    public School() {}
    public School(String name) {}



    //
    //
    //Parameterized Constructor

    public School(String studentID, String name, int age, String gender, String address, String socialSecurityNumber) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    //
    //
    //Parameterized Constructor

    public School(String studentID, String name, int age, String gender, int studentClass, String section, int rollNumber, String address, String socialSecurityNumber) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentClass = studentClass;
        this.section = section;
        this.rollNumber = rollNumber;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    //
    //
    //

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


}


