package com.example.gerenciamentoRestaurante.Controller;

import com.example.gerenciamentoRestaurante.Model.ClienteModelo;
import com.example.gerenciamentoRestaurante.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteModelo> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public ClienteModelo getClienteById(@PathVariable Long id) {
        return clienteService.getClienteById(id);
    }

    @PostMapping
    public ClienteModelo createCliente(@RequestBody ClienteModelo cliente) {
        return clienteService.saveCliente(cliente);
    }

    @PutMapping("/{id}")
    public ClienteModelo updateCliente(@PathVariable Long id, @RequestBody ClienteModelo cliente) {
        cliente.setId(id);
        return clienteService.saveCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }
}