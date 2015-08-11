public class Circular<E> implements listaEnlazada<E>{
	Nodo tail;
	int size;
	public Circular(){
		tail = null;
		size = 0;
	}

	public int size(){
		return size;
	}

	public void addFirst(E value){
		Nodo<E> nodo = new Nodo<E>();
		nodo.setValue(value);
		if(tail!=null){
			nodo.setNext(tail.getNext());
			tail.setNext(nodo);
		}
		else{
			tail = nodo;
			tail.setNext(tail);
		}
	}

	public E removeFirst(){

	}

	public E removeLast(){

	}

	public void addLast(E value){

	}

	public E getFirst(){

	}

	public E getLast(){

	}

	public boolean contains(E value){

	}
}