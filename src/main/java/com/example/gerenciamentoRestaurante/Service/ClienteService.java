package com.example.gerenciamentoRestaurante.Service;

import com.example.gerenciamentoRestaurante.Model.ClienteModelo;
import com.example.gerenciamentoRestaurante.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModelo> getAllClientes() {
        return clienteRepository.findAll();
    }

    public ClienteModelo getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public ClienteModelo saveCliente(ClienteModelo cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}