package br.com.gusta.microservice.fornecedor.services;

import br.com.gusta.microservice.fornecedor.mappers.InfoFornecedorDTOMapper;
import br.com.gusta.microservice.fornecedor.models.dto.InfoFornecedorDTO;
import br.com.gusta.microservice.fornecedor.repositories.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private final InfoRepository infoRepository;
    private final InfoFornecedorDTOMapper mapper;

    @Autowired
    public InfoService(InfoRepository infoRepository, InfoFornecedorDTOMapper mapper) {
        this.infoRepository = infoRepository;
        this.mapper = mapper;
    }

    public InfoFornecedorDTO getInfoPorEstado(String estado) {
        return mapper.map(infoRepository.findByEstado(estado));
    }
}
