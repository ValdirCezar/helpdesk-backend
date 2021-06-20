package com.valdir.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
