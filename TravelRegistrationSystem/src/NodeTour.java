
public class NodeTour {

	private Tours t;
	private NodeTour prev;
	private NodeTour next;



	public NodeTour (){

		prev=null;
		next=null;
		t=null;
	}


	public NodeTour (Tours t){

		prev=null;
		next =null;
		setT(t);
	}


	public NodeTour(Tours t, NodeTour prev){
		prev=null;
		this.prev=prev;
		setT(t);


	}


	public NodeTour(Tours c, NodeTour prev, NodeTour next) {
		this.t = t;
		this.prev = prev;
		this.next = next;
		setT(t);
	}


	public Tours getT() {
		return t;
	}


	public void setT(Tours t) {
		this.t = t;
	}


	public NodeTour getPrev() {
		return prev;
	}


	public void setPrev(NodeTour prev) {
		this.prev = prev;
	}


	public NodeTour getNext() {
		return next;
	}


	public void setNext(NodeTour next) {
		this.next = next;
	}


















}
