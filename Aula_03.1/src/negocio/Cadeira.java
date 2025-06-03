package negocio;

public class Cadeira {
		// Propriedades da classe
		private String nome = "";

		// Método construtora de classe
		public Cadeira() {
			super();
		}

		public Cadeira(String nome) {
			super();
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
	}