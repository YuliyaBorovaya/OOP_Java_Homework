package Homework4.data.comparators;

import java.util.Comparator;

import Homework4.data.User;

public class UserComparator implements Comparator<User>{

    @Override
    public int compare(User user1, User user2) {
        return user1.getFio().compareTo(user2.getFio()); 
    }
}
