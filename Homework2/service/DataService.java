package Homework2.service;

import Homework2.data.User;

public interface DataService {//абстрактные методы, каждый класс, который имплементирует этот интерфейс обязан реализовать эти методы
   void create(User user); 
   User read(User user);
}
