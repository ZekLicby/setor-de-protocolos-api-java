package com.example.gerenciamentoRestaurante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.gerenciamentoRestaurante.Model.PedidoModelo;
import com.example.gerenciamentoRestaurante.Service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<PedidoModelo> getAllPedidos() {
        return pedidoService.getAllPedidos();
    }

    @GetMapping("/{id}")
    public PedidoModelo getPedidoById(@PathVariable Long id) {
        return pedidoService.getPedidoById(id);
    }

    @PostMapping
    public PedidoModelo createoPedidoModelo(@RequestBody PedidoModelo pedido) {
        return pedidoService.savePedido(pedido);
    }

    @PutMapping("/{id}")
    public PedidoModelo updatePedido(@PathVariable Long id, @RequestBody PedidoModelo pedido) {
        pedido.setId(id);
        return pedidoService.savePedido(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id) {
        pedidoService.deletePedido(id);
    }
}