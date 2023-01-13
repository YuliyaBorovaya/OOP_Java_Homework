package Homework4.view;

import java.util.List;

import Homework4.data.User;

public abstract class UserView {
    public void showTheBest(List<User> userList){
        User user = findTheBest(userList);
        System.out.println(user);
    }
    protected abstract User findTheBest(List<User> users);
}
