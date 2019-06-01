package br.com.etechoracio.common.dao;

import br.com.etechoracio.common.model.Cadastro;


public interface CadastroDAO {

	public Cadastro findByNomeOrCodigo(
			int codigo,
			String nome); 
				
		   
	

}
