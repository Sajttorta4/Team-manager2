package hu.teammanager.demo.dto;

import hu.teammanager.demo.entity.Club;
import hu.teammanager.demo.entity.Member;
import lombok.Data;

import java.io.Serializable;

@Data
public class MemberDTO implements Serializable {

    private final long id;
    private final String name;
    private final boolean gender;
    private final Club club;

    public static MemberDTO makeDTO(Member member){
        MemberDTO dto = new MemberDTO(member.getId(),
                                      member.getName(),
                                      member.isGender(),
                                      member.getClub());

        return dto;
    }
}
