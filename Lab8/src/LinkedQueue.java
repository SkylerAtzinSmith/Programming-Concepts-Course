// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;
	
	LinkedQueue() {
		front = rear = null;
		count = 0;
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode;
		else 
			front = newNode;
		rear = newNode;
		count++;
	}
	
	void removeMiddle() {
		
		//Initialize a variable for the size of the queue pre-modification
		//make a temporary linked queue to store values
		int iSize = size();
		LinkedQueue temp = new LinkedQueue();
		int half = (size()/2);
		
		//modify half to round down in placement if the linked queue has an even number of elements
		if( iSize%2 == 0) {
			half = (size()/2)-1;
		}
		
		//dequeue the first half into the temporary queue
		for (int i = 0 ; i < half ; i++) {
			temp.enqueue(dequeue());
		}
		//dequeue the last item to remove it
		dequeue();
		
		//initialize size of remaining queue
		int remaining = size();
		
		//enqueue the remaining elements  into the temporary queue
		for (int i = 0 ; i < remaining ; i++) {
			temp.enqueue(dequeue());
		}
		
		//enqueue everything back into the original queue
		for (int i = 1 ; i < iSize ; i++) {
			enqueue(temp.dequeue());
		}
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x;
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}
}
