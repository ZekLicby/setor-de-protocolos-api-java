package com.example.gerenciamentoRestaurante.Service;

import com.example.gerenciamentoRestaurante.Model.PedidoModelo;
import com.example.gerenciamentoRestaurante.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<PedidoModelo> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    public PedidoModelo getPedidoById(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public PedidoModelo savePedido(PedidoModelo pedido) {
        return pedidoRepository.save(pedido);
    }

    public void deletePedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
