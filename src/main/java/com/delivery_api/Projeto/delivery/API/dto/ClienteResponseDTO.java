package com.delivery_api.Projeto.delivery.API.dto;

import com.delivery_api.Projeto.delivery.API.entity.Cliente;
import lombok.Data;

@Data
public class ClienteResponseDTO {

    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String endereco;

    private String dataCadastro;

    private boolean ativo;

    public ClienteResponseDTO(Cliente save){
        this.id = save.getId();
        this.nome = save.getNome();
        this.email = save.getEmail();
        this.telefone = save.getTelefone();
        this.endereco = save.getEndereco();
        this.ativo = save.getAtivo();

    }

}
