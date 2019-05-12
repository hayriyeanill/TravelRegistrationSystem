
public class DoublyLinkedList {

	private NodeTour first;
	private NodeTour last;
	private NodeTour current;

	public NodeTour getFirst() {
		return first;
	}

	public void setFirst(NodeTour first) {
		this.first = first;
	}

	public NodeTour getLast() {
		return last;
	}

	public void setLast(NodeTour last) {
		this.last = last;
	}

	//empty 
	public DoublyLinkedList(){
		first = null;
		last = null;
	}

	public boolean isEmpty(){
		return first==null;	
	}
	public void insertNode(NodeTour node) {
		if(isEmpty()) {
			first = last = node;
		}

		else {
			NodeTour current = new NodeTour();
			current=last;
			current.setNext(node);
			last = node;

		}
	}

	public void insertAtFront(Tours t){
		if(isEmpty()){

			first=last=new NodeTour(t,first);

		}
		else
		{
			NodeTour x = new NodeTour(t);
			x.setNext(first);
			first.setPrev(x);
			first=x;
		}
	}


	public void removeFromFront(){

		if(isEmpty()){				
			System.out.println("the list is empty");

		}
		else
		{
			if(first==last)
				first=last=null;
			else
			{
				first=first.getNext();
				first.setPrev(null);
			}
		}
	}


	public void removeFromBack(){
		if(isEmpty()){	
			System.out.println("the list is empty");
		}
		else{

			if(first==last)
				first=last=null;
			else{
				last=last.getPrev();
				last.setNext(null);
			}			
		}
	}

	public void outputList(){
		NodeTour position = first;
		while(position != null) {
			System.out.println(position.getT());
			System.out.println(position.getT().getCount());
			position = position.getNext();
			System.out.println();
		}
	}










}//class
