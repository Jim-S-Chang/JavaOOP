import model.Student;
public class JavaOOP {
    public static void main(String[] args){
        Student instance = new Student("jim", 23, "male", "123");
        System.out.println(instance.getName());
        System.out.println(instance.getAge());
        System.out.println(instance.getGender());
        System.out.println(instance.getID_NO());
    }
}