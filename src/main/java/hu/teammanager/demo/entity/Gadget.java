package hu.teammanager.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "gadgets")
public class Gadget {
    @Id
    @Column(name = "gadget_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "gadget_name", nullable = false)
    private String name;

    @Column(name = "gadget_member", nullable = false)
    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name = "member_id")
    private Member member;
}
