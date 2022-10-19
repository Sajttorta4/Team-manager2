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

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

}
