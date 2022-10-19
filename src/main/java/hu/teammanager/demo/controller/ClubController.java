package hu.teammanager.demo.controller;

import hu.teammanager.demo.dto.ClubDTO;
import hu.teammanager.demo.entity.Club;
import hu.teammanager.demo.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/clubs")

public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping
    public List<ClubDTO> loadAll(long clubId){
        Iterable<Club> iterator = clubService.loadAll(clubId);
        List<ClubDTO> result = StreamSupport.stream(iterator.spliterator(),false)
                .map(ClubDTO::makeDTO)
                .collect(Collectors.toList());
        return result;
    }

    @GetMapping("/{club_id}")
    public ClubDTO getClub(@PathVariable long clubId){
        Club c = clubService.getClub(clubId);
        return ClubDTO.makeDTO(c);
    }

    @PostMapping()
    public ClubDTO saveClub(@RequestBody ClubDTO dto, long clubId){
        Club c = clubService.saveClub(dto, clubId);
        return ClubDTO.makeDTO(c);
    }

    @PutMapping()
    public ClubDTO updateClub(@RequestBody ClubDTO dto, long clubId){
        Club c = clubService.updateClub(dto, clubId);
        return ClubDTO.makeDTO(c);
    }
}