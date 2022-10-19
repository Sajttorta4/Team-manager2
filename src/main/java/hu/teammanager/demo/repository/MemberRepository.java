package hu.teammanager.demo.repository;

import hu.teammanager.demo.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long>{

    Member findById(long id);

}
