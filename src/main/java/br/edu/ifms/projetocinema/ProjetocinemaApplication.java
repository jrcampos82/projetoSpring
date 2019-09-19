package br.edu.ifms.projetocinema;

import br.edu.ifms.projetocinema.model.Filme;
import br.edu.ifms.projetocinema.repository.FilmeRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ProjetocinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetocinemaApplication.class, args);
    }

    @Bean
    ApplicationRunner init(FilmeRepository filme) {
        return args -> {
            Stream.of("Armageddon", "Titanic", "UP", "Blade Runner", "Polar")
                    .forEach(titulo -> {
                        Filme f = new Filme();
                        f.setTitulo(titulo);
                        filme.save(f);
                    });
        };
        //filme.findAll().forEach(System.out::println);

    }


}
