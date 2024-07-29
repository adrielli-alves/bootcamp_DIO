package design_patters.java_puro.facade;

import design_patters.java_puro.subsistemas.CrmService;
import design_patters.java_puro.subsistemas.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
