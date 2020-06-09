package br.com.zup.generated.from.swaggercodegen.apiserver.service;

import br.com.zup.generated.from.swaggercodegen.apiserver.dto.PetDTO;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class PetService {
    private static final Map<Long, PetDTO> petMap = new HashMap<>();

    @PostConstruct
    private void init() {
        PetDTO petDTO = new PetDTO();
        petDTO.setId(1L);
        petDTO.setName("Pixel");
        petMap.put(Long.valueOf(petMap.size()), petDTO);

        petDTO = new PetDTO();
        petDTO.setId(2L);
        petDTO.setName("Champ");
        petMap.put(Long.valueOf(petMap.size()), petDTO);

        petDTO = new PetDTO();
        petDTO.setId(3L);
        petDTO.setName("Frank");
        petMap.put(Long.valueOf(petMap.size()), petDTO);

        petDTO = new PetDTO();
        petDTO.setId(4L);
        petDTO.setName("Sabu");
        petMap.put(Long.valueOf(petMap.size()), petDTO);
    }

    public void savePet(PetDTO pet) {
        petMap.put(Long.valueOf(petMap.size()), pet);
    }

    public Optional<PetDTO> getById(Long id) {
        return Optional.ofNullable(this.petMap.get(id));
    }
}
