package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String ID_NO;
    public Student(String name, int age, String gender, String ID_NO) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID_NO = ID_NO;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getID_NO() {
        return this.ID_NO;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setID_NO(String ID_NO) {
        this.ID_NO = ID_NO;
    }

    public void setName(String name) {
        this.name = name;
    }
}
