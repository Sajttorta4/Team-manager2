package hu.teammanager.demo.dto;


import hu.teammanager.demo.entity.Club;
import hu.teammanager.demo.entity.Member;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ClubDTO implements Serializable {
    private final long id;
    private final String name;
    private final long numOfMembers;
    private final List<Member> members;

    public static ClubDTO makeDTO(Club club){
        ClubDTO dto = new ClubDTO(club.getId(),
                                  club.getName(),
                                  club.getNumOfMembers(),
                                  club.getMembers());
        return dto;
    }
}
