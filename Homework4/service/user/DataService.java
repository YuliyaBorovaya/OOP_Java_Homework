package Homework4.service.user;

import Homework4.data.User;

public interface DataService<U extends User> {
   void create(U user); 
   U read(U user);
}
