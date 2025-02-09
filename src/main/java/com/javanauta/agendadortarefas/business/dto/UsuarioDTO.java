package com.javanauta.agendadortarefas.business.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsuarioDTO {

    private String email;
    private String senha;

    public String getSenha() {
        return  senha;
    }

    public String getEmail() {
        return email;
    }
}
