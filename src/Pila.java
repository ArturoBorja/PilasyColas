
public class Pila {
	public Nodo nodosup;
	public void Push (String num) {
		Nodo n = new Nodo(num,nodosup);
		nodosup = n;
	}
	public String Pop() {
		Nodo tmp = nodosup;
		nodosup=nodosup.hermano;
		return tmp.valor;
	}
	public boolean EstaVacio() {
		return nodosup==null;
	}
}
