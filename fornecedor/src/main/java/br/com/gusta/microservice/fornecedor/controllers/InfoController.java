package br.com.gusta.microservice.fornecedor.controllers;

import br.com.gusta.microservice.fornecedor.models.dto.InfoFornecedorDTO;
import br.com.gusta.microservice.fornecedor.models.entities.InfoFornecedor;
import br.com.gusta.microservice.fornecedor.services.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class InfoController {

    private final InfoService infoService;

    @Autowired
    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("{estado}")
    private ResponseEntity<InfoFornecedorDTO> getInfoPorEstado(@PathVariable String estado) {
        return ResponseEntity.ok(infoService.getInfoPorEstado(estado));
    }
}
