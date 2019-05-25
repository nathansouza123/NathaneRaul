package br.com.etechoracio.common.business;

import org.springframework.stereotype.Service;

import br.com.etechoracio.common.dao.CadastroDAO;
import br.com.etechoracio.common.model.Cadastro;

@Service
public class CadastroSB{

	public void alter(Cadastro u) {
		Cadastro nome = findByCodigoOrNome(u.getCodigo(),
											u.getNome());

	}
	
//	 private Cadastro findByCodigoOrNome(int codigo, String nome) {
//		 if(nome == null) {
//			 throw new Exception("deu erro ai amigão");
//	}

}
