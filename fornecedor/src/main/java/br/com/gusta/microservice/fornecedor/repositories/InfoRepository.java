package br.com.gusta.microservice.fornecedor.repositories;

import br.com.gusta.microservice.fornecedor.models.entities.InfoFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstado(String estado);
}
