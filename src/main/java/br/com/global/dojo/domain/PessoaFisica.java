package br.com.global.dojo.domain;

import javax.persistence.Entity;

@Entity
public abstract class PessoaFisica extends Pessoa {

    private String cpf;
}
