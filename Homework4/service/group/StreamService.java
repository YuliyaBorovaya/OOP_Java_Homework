package Homework4.service.group;

import java.util.List;

import Homework4.data.GroupStream;

public interface StreamService {
    GroupStream readStream(int groupNumber);

    void createStream(int groupNumber);

    void sortStream(List<GroupStream> groupStream);
}