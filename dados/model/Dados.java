package dados.model;

public abstract class Dados {

	
	

	private int produto;
	private String nome;
	private float preco;
	private float saldo;
	private int tipo;
	
	
	public Dados(int produto, String nome, float preco) {
		this.produto = produto;
		this.nome = nome;
		this.preco = preco;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
		
	public boolean comprar(float preco) {
		if (this.getPreco() < saldo) {
			System.out.println("\nA compra será realizada!");
			return true;
		}
		
		this.setPreco(this.getPreco() - saldo);
		return false;
	}
	
	
	
	/////////// ATUALIZAR DEPOIS DE TESTAR//////
	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "PIX";
		break;
		
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Menu:");
		System.out.println("***********************************************************");
		System.out.println("Produtos disponíveis: " + this.produto);
		
		

	}

	public boolean preco(float valor) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
