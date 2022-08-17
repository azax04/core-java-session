package Inheritance;

public class Child {
    public static void main(String[] args) {
        Father child1 = new Father();
        child1.setLastName("AK");
        child1.setAge(30);
        child1.setHeight(5.9);
        child1.setGenetics("Biological");


        Mother child2 = new Mother();
        child2.setLastName("AK");
        child2.setAge(28);
        child2.setHeight(5.2);
        child2.setGenetics("Biological");

        System.out.println(child1.getLastName());
        System.out.println(child1.getAge());
        System.out.println(child1.getHeight());
        System.out.println(child1.getGenetics());

        System.out.println(child2.getLastName());
        System.out.println(child2.getHeight());
        System.out.println(child2.getGenetics());


    }
}
