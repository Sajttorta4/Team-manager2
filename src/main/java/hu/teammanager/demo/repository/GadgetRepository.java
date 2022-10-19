package hu.teammanager.demo.repository;

import hu.teammanager.demo.entity.Gadget;
import org.springframework.data.repository.CrudRepository;

public interface GadgetRepository extends CrudRepository<Gadget, Long> {

    Gadget findById(long id);
}
