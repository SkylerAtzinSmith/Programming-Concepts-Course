//This set data structure that is based on the Linked List Queue
public class Set {

	LinkedNode front;
		LinkedNode rear;
		int count;
		
		Set() {
			front = rear = null;
			count = 0;
		}
		
		//adds a new value of x to the set
		void add(int x) {
			LinkedNode newNode = new LinkedNode(x);
			
			//add if the number doesnt already exist
			if (exists(x) == false) {
				if (rear!=null)			
					rear.next = newNode;
				else 
					front = newNode;
				rear = newNode;
				count++;
			//dont do anything if the number already exists
			} else {
				
			}
		}
		
		boolean isEmpty() {
			return count==0;
		}
		
		int size() {
			return count;
		}
		
		//checks if any of the linked nodes have a value of x
		public boolean exists(int x) {
			
			//if there are no linked nodes, then there is no rear, then the number cant exist, so return false
			if(rear == null) {
				return false;
			}
			
			//Initialize variables to accession through adjacent linked nodes
			LinkedNode N1 = null;
			LinkedNode N2 = null;		
			int i;
			
			//set i = 2 if N1 & N2 both exist, Set N1 to the front LN, and N2 to the next LN. if N2 does not exist, set N2 to N1 and i = 1
			
			if(front.next != null) {
				 N1 = front;
				 N2 = front.next;		
				 i = 2;
			} else {
				 N1 = front;
				 N2 = N1;
				 i = 1;
			}

			//If x is equal to N1 or N2, makes the while loop impossible, keeps N1 and N2 in place instead of accessioning through linked nodes
			if(N1.is() == x || N2.is() == x) {
				i = count;
			}
			
			//accession through the nodes until all nodes have been cycled through, or the next node (N2) is equal to x
			while (i  < count ) {
				N1 = N2;
				N2 = N1.next;
				i++;
				
				if(N2.is() == x) {
					i = count;
				}
			}

			//If N2 or N1 are equal to x b/c the loop stopped (or was never started) return true. 
			//If N1 or N2 do not match x, then x must not exist in any of the linked nodes, so return false.
			if(N2.is() == x || N1.is() == x) {
				return true;
				} else {
					return false;
				}
		}
		
		//if a node exists with a value of x, then that linked node is deleted.
		public void del(int x) {
			
			//Initialize variables to accession through adjacent linked nodes
			LinkedNode N1 = null;
			LinkedNode N2 = null;		
			int i;
			
			//set i = 2 if N1 & N2 both exist, Set N1 to the front LN, and N2 to the next LN. if N2 does not exist, set N2 to N1 and i = 1
			if(front.next != null) {
				 N1 = front;
				 N2 = front.next;		
				 i = 2;
			} else {
				 N1 = front;
				 N2 = N1;
				 i = 1;
			}

			//If x is equal to N1 or N2, makes the while loop impossible, keeps N1 and N2 in place instead of accessioning through linked nodes
			if(N1.is() == x || N2.is() == x) {
				i = count;
			}
			
			//accession through the nodes until all nodes have been cycled through, or the next node (N2) is equal to x
			while (i  < count) {
				N1 = N2;
				N2 = N1.next;
				i++;
				
				if(N2.is() == x ) {
					i = count;
				}
			}

			//If N2 is equal to x b/c the loop stopped (or was never started) skip over N2
			//If N1 is equal to x, then set N2 to the front node, to bypass N1
			if(N2.is() == x) {
				N1.next = N2.next;
				count--;
			}
			if(N1.is() == x) {
			front = N2;
				count--;
			}
		}
		
		//Makes toString method
		public String toString() {
            
			//Initialize variable for the output string and the first Node N1
			String val = "";
            LinkedNode N1 = front;
           
            //While there is an upcoming node, append the value to the string, and accession through the Nodes
            while(N1.next != null){
                val = N1.is() + " " + val;
                N1 = N1.next;
            }
            
            //Return the list, and include the last value into the list
            return N1.is() + " " + val ;
		}
	

}
