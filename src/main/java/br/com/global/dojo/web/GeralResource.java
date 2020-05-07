package br.com.global.dojo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GeralResource {

    @GetMapping("/inicio")
    public ResponseEntity<String> buscarClassesAtivas() {
        log.info("Requisiçao inicial");
        final String BEM_VINDO = "Opa, bora lá, manos?!";
        return ResponseEntity.ok(BEM_VINDO);
    }

}
