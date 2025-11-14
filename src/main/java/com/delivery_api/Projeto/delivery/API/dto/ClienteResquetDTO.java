package com.delivery_api.Projeto.delivery.API.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteResquetDTO {

    @NotBlank(message = "O nome é obrigatorio")
    private String nome;

    private String email;

    private String telefone;

    private String endereco;

    private String dataCadastro;





}
