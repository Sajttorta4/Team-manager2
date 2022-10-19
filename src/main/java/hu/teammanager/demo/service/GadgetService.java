package hu.teammanager.demo.service;

import hu.teammanager.demo.dto.GadgetDTO;
import hu.teammanager.demo.entity.Gadget;

public interface GadgetService {

    public Gadget saveGadget(GadgetDTO dto, long gadgetId);

    public Iterable<Gadget> loadAll(long gadgetId);

    Gadget updateGadget(GadgetDTO dto, long gadgetId);

    Gadget getGadget(long gadgetId);
}
