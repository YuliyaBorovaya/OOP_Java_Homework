package Homework4.data;

public class Teacher extends User{
    private String kafedra;

    public String getKafedra() {
        return kafedra;
    }

    public Teacher(String fio, int age, int numberPass, String kafedra) {
        super(fio, age, numberPass);
        this.kafedra = kafedra;
    }

}
