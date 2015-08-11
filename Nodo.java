public class Nodo<E>{
	protected E value;
	protected Nodo next;
	public Nodo(){
		value = null;
		next = null;
	}
	public void setNext(Nodo nodo){
		next = nodo;
	}
}