package hu.teammanager.demo.service.impl;

import hu.teammanager.demo.dto.GadgetDTO;
import hu.teammanager.demo.entity.Gadget;
import hu.teammanager.demo.repository.GadgetRepository;
import hu.teammanager.demo.service.GadgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GadgetServiceImpl implements GadgetService {

    @Autowired
    GadgetRepository gadgetRepository;

    @Override
    public Gadget saveGadget(GadgetDTO dto, long gadgetId){
        Gadget g = new Gadget();
        g.setId(dto.getId());
        g.setName(dto.getName());
        g.setMember(dto.getMember());
        Gadget res = gadgetRepository.save(g);
        return res;
    }

    @Override
    public Iterable<Gadget> loadAll(long gadgetId){
        return gadgetRepository.findAll();
    }

    @Override
    public Gadget getGadget(long gadgetId){
        Gadget g = gadgetRepository.findById(gadgetId);
        return g;
    }

    @Override
    public Gadget updateGadget(GadgetDTO dto, long gadgetId){
        Gadget g = gadgetRepository.findById(gadgetId);
        g.setName(dto.getName());
        g.setMember(dto.getMember());

        Gadget res = gadgetRepository.save(g);
        return res;
    }
}
