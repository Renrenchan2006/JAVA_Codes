package negocio;

public class OldFashion extends Drink implements Mixer{
	public void misturar() {
		super.adicionar(new Ingrediente("Whiskey", 50, "ml"));
		super.adicionar(new Ingrediente("Laranja", 2, "rodelas"));
		super.adicionar(new Ingrediente("Bitter", 2, "g"));
		super.adicionar(new Ingrediente("Açúcar", 1, "cubo"));
		super.adicionar(new Ingrediente("Gelo", 1, "bola"));
	}
}