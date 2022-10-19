package hu.teammanager.demo.controller;

import hu.teammanager.demo.dto.GadgetDTO;
import hu.teammanager.demo.entity.Gadget;
import hu.teammanager.demo.service.GadgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/gadgets")

public class GadgetController {

    @Autowired
    private GadgetService gadgetService;

    @GetMapping
    public List<GadgetDTO> loadAll(long gadgetId){
        Iterable<Gadget> iterator = gadgetService.loadAll(gadgetId);
        List<GadgetDTO> result = StreamSupport.stream(iterator.spliterator(),false)
                .map(GadgetDTO::makeDTO)
                .collect(Collectors.toList());
        return result;
    }

    @GetMapping("/{gadget_id}")
    public GadgetDTO getGadget(@PathVariable long gadgetId){
        Gadget g = gadgetService.getGadget(gadgetId);
        return GadgetDTO.makeDTO(g);
    }

    @PostMapping()
    public GadgetDTO saveGadget(@RequestBody GadgetDTO dto, long gadgetId){
        Gadget g = gadgetService.saveGadget(dto, gadgetId);
        return GadgetDTO.makeDTO(g);
    }

    @PutMapping()
    public GadgetDTO updateGadget(@RequestBody GadgetDTO dto, long gadgetId){
        Gadget g = gadgetService.updateGadget(dto, gadgetId);
        return GadgetDTO.makeDTO(g);
    }
}
