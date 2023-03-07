package com.api.agenda.entidade;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
public class Contato {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column (nullable = false)
    private String nome;
    @Column (nullable = false)
    private String CPF;
    @Column (nullable = false)
    private String telefoe;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoe() {
        return telefoe;
    }

    public void setTelefoe(String telefoe) {
        this.telefoe = telefoe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
