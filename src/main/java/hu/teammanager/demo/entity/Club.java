package hu.teammanager.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @Column(name = "club_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "club_name", nullable = false)
    private String name;

    @Column(name = "club_num_members", nullable = false)
    private long numOfMembers;

    @OneToMany(mappedBy = "club")
    private List<Member> members;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(long numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }


}
