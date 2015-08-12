public class SimplementeEnlazada<E> implements listaEnlazada<E>{
Nodo<E> head;
int contador;
public SimplementeEnlazada(){
head=null; 
contador=0;
}

public int size(){
int elementos=0;

Nodo<E> finger=head;
while (finger != null){
			elementos++;
			finger.setNext(finger.getNext());
		}
	return elementos;
}

public void addFirst (E value){
	head= new Nodo<E>();
	head.setValue(value);
	contador++;
	}

public E removeFirst(){
	Nodo<E> temp=head; 
	head.setNext(head.getNext());
	contador--;
	return temp.getValue();
	}
	
public E getFirst(){
	head= new Nodo<E>();
	
	return head.getValue();
	}
	


public void addLast (E value){
	
	Nodo<E> temp=new Nodo<E>();
	temp.setValue(value);
	if(head!=null)
		{
			Nodo<E> finger=head;
			while (finger.getNext() != null){
				finger.setNext(finger.getNext());
			}
		finger.setNext(temp);
	} else head=temp;
		contador++;
		}
	

public E getLast(){
	Nodo <E> finger=head;
	Nodo <E> previous=null;
	while (finger.getNext()!=null){
		previous=finger;
		finger.setNext(finger.getNext());
	}
	return finger.getValue();

}
	
public E removeLast(){
	Nodo <E> finger=head;
	Nodo <E> previous=null;
	while (finger.getNext() !=null){
		previous=finger;
		finger.setNext(finger.getNext());
		}
	if (previous == null)
		{
			head=null;
		}
		else{
			previous.setNext(null);
			}
		contador--;
		return finger.getValue();
		
	}
	


public boolean contains(E value){
	Nodo <E> finger=head;
	while (finger!= null && !finger.getValue().equals(value)){
		finger.setNext(finger.getNext());
		}
		return finger != null;
		}
					
					
}
