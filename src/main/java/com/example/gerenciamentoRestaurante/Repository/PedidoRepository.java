package com.example.gerenciamentoRestaurante.Repository;

import com.example.gerenciamentoRestaurante.Model.PedidoModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModelo, Long> {


}
