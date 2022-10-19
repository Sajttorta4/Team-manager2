package hu.teammanager.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "members")
public class Member {
    @Id
    @Column(name = "member_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "member_name", nullable = false)
    private String name;

    @Column(name = "member_gender", nullable = false)
    private boolean gender;

    @Column(name = "member_club", nullable = false)
    @ManyToOne(targetEntity = Club.class)
    @JoinColumn(name = "club_id")
    private Club club;

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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
