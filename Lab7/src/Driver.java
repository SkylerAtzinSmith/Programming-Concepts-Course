
public class Driver {

	public static void main(String[] args) {

		//Create instance of LinkedStack and ArrayStack 
		LinkedStack Lstack = new LinkedStack();
		ArrayStack Astack = new ArrayStack();
		
		//make array of ints to push to stacks
		int [] Nums = {1, 7, 3, 4, 9, 2};
		
		//push the ints to both stacks at the same time
		for (int i = 0 ; i < Nums.length ; i++) {
			Lstack.push(Nums[i]);
			Astack.push(Nums[i]);
		}
		
		//initialize and define size of current stacks for ease of popping
		int LSize = Lstack.size();
		int ASize = Astack.size();
		
		//pop off every element of the Linked Stack from top to bottom
		System.out.print("LinkedStack popping order: ");
		for (int i = 0 ; i < LSize ; i++) {
			System.out.print(Lstack.pop());
			System.out.print(", ");
		}
		
		System.out.print("\n\n");
		
		//pop off every element of the Array Stack from top to bottom
		System.out.print("ArrayStack popping order: ");
		for (int i = 0 ; i < ASize ; i++) {
			System.out.print(Astack.pop());
			System.out.print(", ");
		}
		
		//push the ints back to both stacks at the same time since they have been popped off already
		for (int i = 0 ; i < Nums.length ; i++) {
			Lstack.push(Nums[i]);
			Astack.push(Nums[i]);
		}
		
		//invoke the removeBottomHalf method and make a new stack with bottom half deleted
		LinkedStack halfstack = Lstack.removeBottomHalf();
		
		System.out.print("\n\n");
		
		//initialize and define new Lsize for ease of popping
		int NewLSize = halfstack.size();
		
		//pop off every element of the Linked Stack from top to bottom after removing the bottom half
		System.out.print("LinkedStack popping order after removing bottom half: ");
		for (int i = 0 ; i < NewLSize ; i++) {
			System.out.print(halfstack.pop());
			System.out.print(", ");
		
		//The time  complexity of this method is O(N). For every N elements, N/2 elements are popped and pushed into a new stack
		//and then another N/2 elements are popped and pushed into a new stack for a O(2N/2) = O(N)
		
		}
	}

}
