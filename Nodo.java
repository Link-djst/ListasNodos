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
	public Nodo getNext(){
		return next;
	}
	public void setValue(E value){
		this.value = value;
	}
	public E getValue(){
		return value;
	}
}