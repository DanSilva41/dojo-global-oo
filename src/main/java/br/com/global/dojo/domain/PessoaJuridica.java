package br.com.global.dojo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class PessoaJuridica extends Pessoa {

    private String cnpj;
}
