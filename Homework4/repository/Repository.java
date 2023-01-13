package Homework4.repository;

public interface Repository<E, I> {
    E save(E entity);

    E findById(I id);
}
