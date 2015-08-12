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
		size++;
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
		if(size!=0){
			Nodo<E> head = tail.getNext();
			if(head==tail)
				tail = null; 	//Si sólo existe un nodo, será null
			else
				tail.setNext(head.getNext());	//La cola apuntará al elemento que apunta la cabeza para perder su referencia
			size--;
			return head.getValue();

		}
		else{
			return null;
		}
	}

	public E removeLast(){
		if(size!=0){
			Nodo<E> finger = tail;
			while(finger.getNext()!=tail){ //Finger tendrá el penúltimo nodo
				finger = finger.getNext();
			}
			size--;
			Nodo<E> nodo = tail;
			if(finger==tail)
				tail = null;	//Si hay un sólo nodo, finger=tail, entonces se declara null.
			else{
				finger.setNext(tail.getNext()); //El penúltimo nodo
				tail = finger;
			}
			size--;
			return nodo.getValue();
		}
		else
			return null;
	}

	public void addLast(E value){
		addFirst(value); 	//Se agrega el valor al inicio
		tail = tail.getNext(); 	//Se rota la lista para que el elemento se pase a la cola
		size++;
	}

	public E getFirst(){
		Nodo<E> head = new Nodo<E>();
		head = tail.getNext(); //Apunta al Head
		return head.getValue();
	}

	public E getLast(){
		Nodo<E> nodo = new Nodo<E>();
		nodo = tail;
		return nodo.getValue(); //Retorna el valor del tail
	}

	public boolean contains(E value){
		Nodo<E> nodo = new Nodo<E>();
		Nodo<E> finger = tail;
		nodo.setValue(value);
		do{
			if(finger.getValue() == nodo.getValue()) //Si el valor apuntado es igual al indicado
				return true;
			finger = finger.getNext();
		}
		while(finger!=tail);
		return false; //Si recorre toda la lista y no encuentra el value
	}
}