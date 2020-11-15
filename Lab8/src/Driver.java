
public class Driver {

	public static void main(String[] args) {

		//Create instance of LinkedQueue and ArrayQueue 
		LinkedQueue LQ = new LinkedQueue();
		ArrayQ AQ = new ArrayQ();
		
		//make array of ints to push to queues 
		int [] Nums = {1, 7, 3, 4, 9, 2};
		
		//enqueue the ints to both stacks at the same time
		for (int i = 0 ; i < Nums.length ; i++) {
			LQ.enqueue(Nums[i]);
			AQ.enqueue(Nums[i]);
		}
		
		//initialize and define size of current stacks for ease of Dequeueing
		int LSize = LQ.size();
		int ASize = AQ.size();
		
		
		//Dequeue every element of the Linked Queue
		System.out.print("LinkedQueue Dequeue order: ");
		for (int i = 0 ; i < LSize ; i++) {
			System.out.print(LQ.dequeue());
			System.out.print(", ");
		}
		
		System.out.print("\n\n");
		
		//Dequeue every element of the ArrayQueue from top to bottom
		System.out.print("ArrayQueue Dequeue order: ");
		for (int i = 0 ; i < ASize ; i++) {
			System.out.print(AQ.dequeue());
			System.out.print(", ");
		}
		
		//enqueue the ints back into the queue
		for (int i = 0 ; i < Nums.length ; i++) {
			LQ.enqueue(Nums[i]);
		}
		
		//invoke the removeMiddle method and redefine the size of LQ
		LQ.removeMiddle();
		LSize = LQ.size();
		
		System.out.print("\n\n");
		
		//dequeue every element of the modified Linked queue
		System.out.print("LinkedQueue Dequeue order after removing Middle: ");
		for (int i = 0 ; i < LSize ; i++) {
			System.out.print(LQ.dequeue());
			System.out.print(", ");
		}
		
		//Exercise 3 is posted in the discussion thread.
	}
}
