package br.com.global.dojo.domain.enums;

public enum FormaPagamento {

    DINHEIRO("Dinheiro"),
    DEBITO("Débito"),
    CREDITO("Crédito"),
    BOLETO("Boleto");

    private final String descricao;

    FormaPagamento(final String descricao) {
        this.descricao = descricao;
    }
}
