public class DobleNodo<E> extends Nodo<E>{
	protected Nodo previous;

	public void DobleNodo(){
		value = null;
		next = null;
		previous = null;
	}
	public void setPrevious(Nodo nodo){
		previous = nodo;
	}
	public Nodo getPrevious(){
		return previous;
	}
	
}