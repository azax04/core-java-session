package inheritance;

public class Person {
    private String lastName;
    private String genetics;
    private int age;
    private double height;

    public void setGenetics(String genetics) {
        this.genetics = genetics;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGenetics() {
        return genetics;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }


}
