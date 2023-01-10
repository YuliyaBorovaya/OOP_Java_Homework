package Homework3.service;

import java.util.List;
import Homework3.data.GroupStream;

public interface DataServiceStream {
    GroupStream readStream(int groupNumber);
    void createStream(int groupNumber);
    void sortStream(List<GroupStream> groupStream);
}
