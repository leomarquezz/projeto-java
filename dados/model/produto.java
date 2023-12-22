package dados.model;

public abstract class produto {
		
		private String nome;
		private double preço;
		private double valortotal;
		private float quantidade;
		
		public produto (String nome) {
			this.nome = nome;
			
			
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public double getPreco() {
			return preço;
		}


		public void setPreço(double preço) {
			this.preço = preço;
		}
		
		
		public void ValorFinal (int valortotal) {
			
			valortotal = (int) (preço + quantidade);
		}


		protected abstract void add(produto produto);
		

		
	}
