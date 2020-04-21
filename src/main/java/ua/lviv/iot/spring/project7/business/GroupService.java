package ua.lviv.iot.spring.project7.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ua.lviv.iot.spring.project7.dataaccess.GroupRepository;
import ua.lviv.iot.spring.project7.rest.model.Group;

public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

}
