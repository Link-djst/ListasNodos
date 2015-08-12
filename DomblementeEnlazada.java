public class DoblementeEnlazada<E> implements SimpleEnlazada<E>{
Nodo<E> head;
int contador;

public DoblementeEnlazada(){
head=null; 
contador=0;
}

public int size(){

}

public void addFirst (E value){

	}

public E removeFirst(){

	}
	
public E getFirst(){

	}
	


public void addLast (E value){
	Nodo<E> temp=new Nodo<E>();
	Nodo<E> temp2=new Nodo<E>();
	temp.setValue(value);
	if(head!=null)
		{
			Nodo<E> finger=head;
			while (finger.getNext() != null){
				finger.setNext(finger.getNext());
				temp2 = finger.setNext(finger.getNext());
			}
			
		finger.setNext(temp);
		finger.setNext(finger.getNext());
		finger.setPrevious(temp2);
		
	} else head=temp;
		contador++;
		}
	

public E getLast(){

}
	
public E removeLast(){
		
	}
	
public boolean contains(E value){
	
		}
					
					
}
