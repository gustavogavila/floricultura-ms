package br.com.gusta.microservice.loja.controllers;

import br.com.gusta.microservice.loja.models.dto.CompraDTO;
import br.com.gusta.microservice.loja.models.dto.InfoFornecedorDTO;
import br.com.gusta.microservice.loja.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("compra")
public class CompraController {

    private final CompraService compraService;

    @Autowired
    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping
    public ResponseEntity<InfoFornecedorDTO> realizarCompra(@RequestBody CompraDTO compraDTO) {
        return compraService.realizarCompra(compraDTO);
    }
}
