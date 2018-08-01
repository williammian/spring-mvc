package br.com.wm.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.mvc.model.Funcionario;

public interface Funcionarios extends JpaRepository<Funcionario, Long>{

}
