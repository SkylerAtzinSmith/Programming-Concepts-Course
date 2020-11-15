// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front;  // Reference to the first LinkedNode in the list
	int count;         // Number of nodes in the list
	
		
	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}
	
	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
    	newNode.next = front;
    	front = newNode;
    	count++;
	}
	
	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}
	
	// Implements the peek operation
	int peek() {
		return front.x;
	}
	
	// Implements the isEmpty operation
	boolean isEmpty() {
		return front==null;
	}
	
	// Implements the size operation
	int size() {
		return count;		
	}
	
	//Delete the bottom Half of the stack
	LinkedStack removeBottomHalf () {

		//Make 2 new halfstacks LinkedStack objects
		LinkedStack HalfStack1 = new LinkedStack();
		LinkedStack HalfStack2 = new LinkedStack();
		//Set a variable for half the size of the original Stack
		int RmCount = size()/2;
		
		//Push all the top values from the OG stack to a new half stack
		for (int i = 0 ; i < RmCount ; i++) {
		HalfStack1.push(pop());
		}

		//Push all the values from the new halfstack to another halfstack so they are in the correct order
		for (int i = 0 ; i < RmCount ; i++) {
			HalfStack2.push(HalfStack1.pop());
			}
		
		//return the correct order halfstack
		return HalfStack2;
	}
	
	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";
		
		LinkedNode cur = front;
		while (cur!=null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		
		return str;
	}
	
}
