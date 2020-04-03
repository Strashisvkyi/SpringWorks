package ua.lviv.iot.spring.project7.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.spring.project7.rest.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer>{

}
