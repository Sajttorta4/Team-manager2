package hu.teammanager.demo.dto;

import hu.teammanager.demo.entity.Gadget;
import hu.teammanager.demo.entity.Member;
import lombok.Data;

import java.io.Serializable;

@Data
public class GadgetDTO implements Serializable {

    private final long id;
    private final String name;
    private final Member member;

    public static GadgetDTO makeDTO(Gadget gadget){
        GadgetDTO dto = new GadgetDTO(gadget.getId(),
                                      gadget.getName(),
                                      gadget.getMember());
        return dto;
    }
}
