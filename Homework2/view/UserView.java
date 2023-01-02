package Homework2.view;
// создаем абстрактный класс, с абстрактным методом
import java.util.List;

import Homework2.data.User;

public abstract class UserView {
    public void showTheBest(List<User> userList){
        User user = findTheBest(userList);
        System.out.println(user);
    }
    protected abstract User findTheBest(List<User> users);
}
