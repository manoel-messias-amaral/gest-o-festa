package com.amaral.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaral.festa.model.Convidado;



public interface Convidados extends JpaRepository<Convidado, Long> {

}
