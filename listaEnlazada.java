public interface listaEnlazada<E>{
	public int size();
	public void addFirst(E value);
	public E removeFirst(); 
	public E removeLast(); //pop
	public void addLast(E value);
	public E getFirst();
	public E getLast();
	public boolean contains(E value);
}

/*
Nodo, NodoDoble.
Lista Enlazada, Lista Doblemente Enlazada, Lista Circular*/