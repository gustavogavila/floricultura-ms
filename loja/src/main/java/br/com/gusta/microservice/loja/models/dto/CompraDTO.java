package br.com.gusta.microservice.loja.models.dto;

import java.util.List;

public class CompraDTO {
    private List<ItemDaCompraDTO> itens;
    private EnderecoDTO endereco;

    public List<ItemDaCompraDTO> getItens() {
        return itens;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setItens(List<ItemDaCompraDTO> itens) {
        this.itens = itens;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }
}
