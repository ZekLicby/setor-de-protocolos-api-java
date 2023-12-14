package com.example.gerenciamentoRestaurante.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class PedidoModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String items;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "cliente_id") // nome da coluna que será criada na tabela Pedido para armazenar a chave estrangeira
    private ClienteModelo cliente;
}
