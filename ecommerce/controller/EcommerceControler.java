package ecommerce.controller;

import java.util.ArrayList;

import dados.model.Dados;
import ecommerce.repository.EcommerceRepository; 

public class EcommerceControler implements EcommerceRepository {

	private ArrayList<Dados> listaEcommerce = new ArrayList<Dados>();
	int numero = 0;
	
	
	@Override
	public void listarTodas1() {
		for (var dados: listaEcommerce);
	
		
	}
	
	

	
	@Override
	public void procurarPorNumero(int numero) {

		
	}

	@Override
	public void listarTodas() {
	
		
	}

	@Override
	public void visualizar(Dados produto) {
		
		
	}

	@Override
	public void adicionar(Dados quantidade) {

	}

	@Override
	public void deletar(int numero) {
	
		
	}

	@Override
	public void comprar(int numero, float valor) {
	
		
	}

	@Override
	public void credito(int numero, float valor) {

		
	}

	@Override
	public void pix(int numero, float valor) {
	
	}



public int gerarNumero() {
	return ++ numero;
}
}
