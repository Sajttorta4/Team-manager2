package hu.teammanager.demo.service.impl;

import hu.teammanager.demo.dto.MemberDTO;
import hu.teammanager.demo.entity.Member;
import hu.teammanager.demo.repository.MemberRepository;
import hu.teammanager.demo.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member saveMember(MemberDTO dto, long memberId){
        Member m = new Member();
        m.setId(dto.getId());
        m.setName(dto.getName());
        m.setGender(dto.isGender());
        m.setClub(dto.getClub());
        Member res = memberRepository.save(m);
        return res;
    }

    @Override
    public Iterable<Member> loadAll(long memberId){
        return memberRepository.findAll();
    }

    @Override
    public Member getMember(long memberId){
        Member m = memberRepository.findById(memberId);
        return m;
    }

    @Override
    public Member updateMember(MemberDTO dto, long memberId){
        Member m = memberRepository.findById(memberId);
        m.setName(dto.getName());
        m.setClub(dto.getClub());

        Member res = memberRepository.save(m);
        return res;
    }
}
