package Homework4.Controller;

import Homework4.data.User;

public interface UserController<U extends User, I> extends Controller<U,I>{
    U findByFio(String fio);
}

