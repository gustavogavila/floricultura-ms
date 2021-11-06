package br.com.gusta.microservice.loja.services;

import br.com.gusta.microservice.loja.models.dto.CompraDTO;
import br.com.gusta.microservice.loja.models.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public ResponseEntity<InfoFornecedorDTO> realizarCompra(CompraDTO compraDTO) {
        String estado = compraDTO.getEndereco().getEstado();
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/info/" + estado;
        return restTemplate.exchange(url, HttpMethod.GET, null, InfoFornecedorDTO.class);
    }
}
