public class Cola {
	public Nodo primero;
	public Nodo ultimo;
	public void Push(String num) {
		Nodo nodo=new Nodo(num,null);
		if(EstaVacio()) {
			primero =nodo;
		}else {
			ultimo.hermano=nodo;
		}
		ultimo=nodo;
	}
	public String pop() {
		String tmp = primero.valor;
		primero=primero.hermano;
		return tmp;
	}
	public boolean EstaVacio() {
		
		return primero == null;
	}
	
}
