package br.com.etechoracio.common.dao;

import br.com.etechoracio.common.model.Cadastro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CadastroDAO  {
	
	public Cadastro findByNomeOrCodigo(
			int codigo,
			String nome) {
		   return null;
	}

}
