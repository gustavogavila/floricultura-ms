package br.com.gusta.microservice.fornecedor.mappers;

public interface Mapper<T, U> {

    U map(T type);
}
