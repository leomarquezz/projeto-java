package ecommerce.repository;

import dados.model.Dados;

public interface EcommerceRepository {

	// 
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void visualizar(Dados produto);
	public void adicionar(Dados quantidade);
	public void deletar(int numero);
	
	// 
	public void comprar(int numero, float valor);
	public void credito(int numero, float valor);
	public void pix (int numero, float valor);
	void listarTodas1();
	
}