package hu.teammanager.demo.service;

import hu.teammanager.demo.dto.MemberDTO;
import hu.teammanager.demo.entity.Member;

public interface MemberService {

    public Member saveMember(MemberDTO dto, long memberId);

    public Iterable<Member> loadAll(long memberId);

    Member updateMember(MemberDTO dto, long memberId);

    Member getMember(long memberId);
}
