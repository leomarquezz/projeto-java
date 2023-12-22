package dados.model;

public class Pix extends Dados{

	private int pix;

	public Pix(int produto, String nome, float preco, int pix) {
		super(produto, nome, preco);
		this.pix = pix;

	}

		public int getPix() {
			return pix;
			
		}
		
		
		public void setPix(int pix) {
			this.pix = pix;
		}
		
		@Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Pagamento á vista! " + this.pix);
		}
}
