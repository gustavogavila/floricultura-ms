package br.com.gusta.microservice.fornecedor.mappers;

import br.com.gusta.microservice.fornecedor.models.dto.InfoFornecedorDTO;
import br.com.gusta.microservice.fornecedor.models.entities.InfoFornecedor;
import org.springframework.stereotype.Component;

@Component
public class InfoFornecedorDTOMapper implements Mapper<InfoFornecedor, InfoFornecedorDTO> {

    @Override
    public InfoFornecedorDTO map(InfoFornecedor type) {
        return new InfoFornecedorDTO(type.getId(),
                type.getNome(),
                type.getEstado(),
                type.getEndereco());
    }
}
