package Homework4.Controller;

public interface Controller <U, I> {
    U create(U entity);

    void save(U entity);

    U findById(I id);
}