public class DoblementeEnlazada(){
	protected count 
	protected cabeza
	protected cola
	DobleNodo aux = List;
	 
	public E RemoveLast (){

		while (List.getNext()!=null){
			List = List.getNext()
			
			if (List.getNext() != null){
				List.getPrevious();
				List.setNext(null);
			}
		}
		return List
	}
	
	public void addLast(E value){
		
		while (List.getNext()!=null){
			List = List.getNext()
			
			if (List.getNext() != null){
				lastV = List.getPrevious();
				List.setPrevious(value);
				List.setNext(lastV);
				
			}
		}
	}
	
	public E getLast(){
		while (List.getNext()!=null){
			List = List.getNext()
		}
		return List
	}
}
