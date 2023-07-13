package com.devcave.springbootmicroservice2compras.service;

import com.devcave.springbootmicroservice2compras.model.Compra;

import java.util.List;

public interface CompraService {
    Compra saveCompra(Compra compra);

    List<Compra> findAllComprasOfUser(Long userId);
}
