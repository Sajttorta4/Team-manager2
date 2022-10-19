package hu.teammanager.demo.service;

import hu.teammanager.demo.dto.ClubDTO;
import hu.teammanager.demo.entity.Club;

public interface ClubService {

    public Club saveClub(ClubDTO dto, long clubId);

    public Iterable<Club> loadAll(long clubId);

    Club updateClub(ClubDTO dto, long clubId);

    Club getClub(long clubId);
}
