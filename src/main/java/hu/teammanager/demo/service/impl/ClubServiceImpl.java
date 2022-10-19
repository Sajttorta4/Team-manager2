package hu.teammanager.demo.service.impl;

import hu.teammanager.demo.dto.ClubDTO;
import hu.teammanager.demo.entity.Club;
import hu.teammanager.demo.repository.ClubRepository;
import hu.teammanager.demo.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubServiceImpl implements ClubService {

    @Autowired
    ClubRepository clubRepository;

    @Override
    public Club saveClub(ClubDTO dto, long clubId){
        Club c = new Club();
        c.setId(dto.getId());
        c.setName(dto.getName());
        c.setNumOfMembers(dto.getNumOfMembers());
        c.setMembers(dto.getMembers());
        Club res = clubRepository.save(c);
        return res;
    }

    @Override
    public Iterable<Club> loadAll(long clubId){
        return clubRepository.findAll();
    }

    @Override
    public Club getClub(long clubId){
        Club c = clubRepository.findById(clubId);
        return c;
    }

    @Override
    public Club updateClub(ClubDTO dto, long clubId){
        Club c = clubRepository.findById(clubId);
        c.setName(dto.getName());
        c.setNumOfMembers(dto.getNumOfMembers());
        c.setMembers(dto.getMembers());

        Club res = clubRepository.save(c);
        return res;
    }
}
