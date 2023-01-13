package Homework4.repository;

import Homework4.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByFio(String fio);
}
