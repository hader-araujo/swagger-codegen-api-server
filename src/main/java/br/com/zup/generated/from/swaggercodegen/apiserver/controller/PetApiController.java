package br.com.zup.generated.from.swaggercodegen.apiserver.controller;

import br.com.zup.generated.from.swaggercodegen.apiserver.dto.ApiResponseDTO;
import br.com.zup.generated.from.swaggercodegen.apiserver.dto.PetDTO;
import br.com.zup.generated.from.swaggercodegen.apiserver.service.PetService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pet")
public class PetApiController implements PetApi {

    private PetService petService;

    public PetApiController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public void addPet(@Valid PetDTO body) {
        this.petService.savePet(body);
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, Optional<String> apiKey) {
        return null;
    }

    @Override
    public ResponseEntity<List<PetDTO>> findPetsByStatus(@NotNull @Valid List<String> status) {
        return null;
    }

    @Override
    public ResponseEntity<List<PetDTO>> findPetsByTags(@NotNull @Valid List<String> tags) {
        return null;
    }

    @GetMapping("/{petId}")
    @Override
    public ResponseEntity<PetDTO> getPetById(@PathVariable Long petId) {
        Optional<PetDTO> optionalPet = this.petService.getById(petId);
        return ResponseEntity.of(optionalPet);
    }

    @Override
    public ResponseEntity<Void> updatePet(@Valid PetDTO body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponseDTO> uploadFile(Long petId, String additionalMetadata, @Valid MultipartFile file) {
        return null;
    }
}
