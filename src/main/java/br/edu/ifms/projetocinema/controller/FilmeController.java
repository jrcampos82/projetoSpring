package br.edu.ifms.projetocinema.controller;

import br.edu.ifms.projetocinema.model.Filme;
import br.edu.ifms.projetocinema.repository.FilmeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/filme")
public class FilmeController {

    private FilmeRepository repository;
    private Logger log = LoggerFactory.getLogger(FilmeRepository.class);

    public FilmeController(FilmeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listar-filmes")
    Collection<Filme> filmes() {
        return repository.findAll();
    }

    @PostMapping("/cad-filme")
    ResponseEntity<Filme> saveFilme(@RequestBody Filme filme) throws URISyntaxException {
        Filme f1 = repository.save(filme);
        log.info("request save Filme: {}", f1);
        return ResponseEntity.created(new URI("/filme/cad-filme/" +
                f1.getId())).body(f1);
    }

    @PutMapping("/upd-filme/{id1}")
    ResponseEntity<Filme> update(@Valid @RequestBody Filme filme) {
        Filme f1 = repository.save(filme);
        log.info("adicionando filme", "erro adicionando filme");
        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/del-filme/{id1}")
    ResponseEntity<Filme> deleteFilme(@PathVariable Long id1) {
        repository.deleteById(id1);
        log.info("Deletando filme...");
        return ResponseEntity.ok().build();

    }


}
