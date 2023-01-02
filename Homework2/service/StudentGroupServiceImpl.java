package Homework2.service;

import Homework2.data.StudentGroup;
import Homework2.util.ReaderFromTxt;
import Homework2.util.WriterToTxt;

public class StudentGroupServiceImpl implements DataServiceGroup {

    @Override
    public StudentGroup readGroup(int groupNumber) {
        return ReaderFromTxt.readGroup(groupNumber);       
    }

    @Override
    public void createGroup(int groupNumber) {
        WriterToTxt.writeGroup(new StudentGroup(groupNumber));
    }

}
