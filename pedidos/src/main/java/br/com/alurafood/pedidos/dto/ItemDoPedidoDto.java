package br.com.alurafood.pedidos.dto;

import lombok.*;

public class ItemDoPedidoDto {

    private Long id;
    private Integer quantidade;
    private String descricao;

    public ItemDoPedidoDto() {
    }

    public ItemDoPedidoDto(Long id, Integer quantidade, String descricao) {
        this.id = id;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
