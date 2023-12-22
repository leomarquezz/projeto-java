package dados.model;

public class Credito extends Dados{
	
	
	private float limite;

	public Credito(int produto, String nome, float preco, float limite) {
		super(produto, nome, preco);
		this.limite = limite;
	
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean preco(float valor) { 
		
		if(this.getPreco() + this.getLimite() < valor) {
			System.out.println("\nA compra será realizada!!");
			return false;
		}
		
		this.setPreco(this.getPreco() - valor);
		return true;
		
		
	}
	
		@Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Limite de Crédito: " + this.limite);
		}
	    
	}