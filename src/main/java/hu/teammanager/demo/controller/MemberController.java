package hu.teammanager.demo.controller;

import hu.teammanager.demo.dto.MemberDTO;
import hu.teammanager.demo.entity.Member;
import hu.teammanager.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/members")

public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<MemberDTO> loadAll(long memberId){
        Iterable<Member> iterator = memberService.loadAll(memberId);
        List<MemberDTO> result = StreamSupport.stream(iterator.spliterator(),false)
                .map(MemberDTO::makeDTO)
                .collect(Collectors.toList());
        return result;
    }

    @GetMapping("/{member_id}")
    public MemberDTO getMember(@PathVariable long memberId){
        Member m = memberService.getMember(memberId);
        return MemberDTO.makeDTO(m);
    }

    @PostMapping()
    public MemberDTO saveMember(@RequestBody MemberDTO dto, long memberId){
        Member m = memberService.saveMember(dto, memberId);
        return MemberDTO.makeDTO(m);
    }

    @PutMapping()
    public MemberDTO updateMember(@RequestBody MemberDTO dto, long memberId){
        Member m = memberService.updateMember(dto, memberId);
        return MemberDTO.makeDTO(m);
    }
}
