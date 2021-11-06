package br.com.gusta.microservice.fornecedor.models.dto;

public class InfoFornecedorDTO {
    private long id;
    private String nome;
    private String estado;
    private String endereco;

    public InfoFornecedorDTO(long id, String nome, String estado, String endereco) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
