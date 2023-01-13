package Homework4.Controller;

import java.util.List;

import Homework4.data.GroupStream;
import Homework4.service.group.StreamServiceImpl;

public class StreamController implements Controller<GroupStream, Integer>{
    private final StreamServiceImpl streamService;

    public StreamController(StreamServiceImpl streamService) {
        this.streamService = streamService;
    }

    @Override
    public GroupStream create(GroupStream entity) {
        int streamNumber = entity.getStreamNumber();
        streamService.createStream(streamNumber);
        return streamService.readStream(streamNumber);
    }

    @Override
    public void save(GroupStream entity) {
        streamService.saveGroup(entity);        
    }

    @Override
    public GroupStream findById(Integer id) {
        return streamService.findGroup(id);
    }
    public void sortStream(List<GroupStream> streams){
        streamService.sortStream(streams);
    }

}