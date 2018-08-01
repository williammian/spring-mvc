package br.com.wm.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wm.mvc.model.Funcionario;
import br.com.wm.mvc.repository.Funcionarios;

@Service
public class FuncionarioService {
	
	@Autowired
	private Funcionarios funcionarios;
	
	public void salvar(Funcionario funcionario) {
		funcionarios.save(funcionario);
	}

}
