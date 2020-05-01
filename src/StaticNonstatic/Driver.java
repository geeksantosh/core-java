package StaticNonstatic;

public class Driver {
    public static void main(String[] args) {
        /*Student s1 = new Student();
        System.out.println(s1.name);
        s1.name = "Shyam";
        //System.out.println(s1.name);

        Student s2 = new Student();
        System.out.println(s2.name);
    */
        System.out.println(Student.name);
        Student.name = "Shyam";
        System.out.println(Student.name);
    }

}

