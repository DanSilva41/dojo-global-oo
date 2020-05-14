package br.com.global.dojo.domain;

import br.com.global.dojo.domain.enums.FormaPagamento;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "data_soliticacao")
    private LocalDateTime dataSolicitacao;
    @Column(name = "data_cancelamento")
    private LocalDateTime dataCancelamento;
    @Column(name = "data_finalizacao")
    private LocalDateTime dataFinalizacao;

    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;

    @ManyToOne
    @JoinColumn(name = "codigo_cliente")
    private Cliente cliente;

    @ManyToMany
    @JoinTable(name = "item_venda",
            joinColumns = @JoinColumn(name = "codigo_item"),
            inverseJoinColumns = @JoinColumn(name = "codigo_venda"))
    private Set<Item> itens;

    public void adicionarItem(Item itemAAdicionar) {
        if (this.itens == null)
            this.itens = new TreeSet<>();
        this.itens.add(itemAAdicionar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Objects.equals(codigo, venda.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
