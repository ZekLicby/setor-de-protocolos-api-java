package com.example.gerenciamentoRestaurante.Repository;

import com.example.gerenciamentoRestaurante.Model.ClienteModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModelo, Long> {
}