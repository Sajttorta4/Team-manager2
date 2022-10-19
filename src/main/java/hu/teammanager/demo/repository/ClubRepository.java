package hu.teammanager.demo.repository;

import hu.teammanager.demo.entity.Club;
import org.springframework.data.repository.CrudRepository;

public interface ClubRepository extends CrudRepository<Club, Long> {

    Club findById(long id);
}
