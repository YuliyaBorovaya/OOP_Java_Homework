package Homework3.service;

import java.util.Collections;
import java.util.List;

import Homework3.data.GroupStream;
import Homework3.data.GroupStreamComparator;

public class GroupStreamServiceImpl implements DataServiceStream {
    @Override
    public GroupStream readStream(int groupNumber) {
        
        return null;
    }

    @Override
    public void createStream(int groupNumber) {
        

    }

    @Override
    public void sortStream(List<GroupStream> groupStreamCollection) {
        Collections.sort(groupStreamCollection, new GroupStreamComparator());
    }

}

