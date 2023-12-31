package me.dio.sacolaApi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@Embeddable //Serve para ele se tornar linkavel a outras classes.
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String complemento;
}