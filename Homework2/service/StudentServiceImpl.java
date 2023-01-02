package Homework2.service;

import Homework2.data.User;
import Homework2.util.ReaderFromTxt;
import Homework2.util.WriterToTxt;

public class StudentServiceImpl implements DataService{

    @Override
    public void create(User user) {
        WriterToTxt.write(user);

    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);

    }

}
