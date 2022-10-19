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
}
