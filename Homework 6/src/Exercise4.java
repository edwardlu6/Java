//This homework is completed by Karla Murueta and Edward Lu



public class Exercise4 {
	
	static char[] stack = new char[10];
	static int top = -1;
	
	public static void main(String[] args) {
		int index = 0;
		
		// the following lines are testing program.
		displayStack();
		pop();
		push('A');
		push('B');
		push('C');

		System.out.println();
		pop();
		pop();
		push('C');
		System.out.println();

		

	}
	
	// method to display the stack
	public static void displayStack() {
	    System.out.println("-----");
	    for (int i = top; i >= 0; i--) {
	        if (i == top) {
	            System.out.println("| " + stack[i] + " | <-- top");
	        } else {
	            System.out.println("| " + stack[i] + " |");
	        }
	        System.out.println("-----");
	    }
	    System.out.println("stack");
	    System.out.println();
	}

	
    public static void push(char element) {
    	// if condition to check if the stack is full.
        if (top < stack.length - 1) {
            top++; //increase the index of the stack
            stack[top] = element; // from 0, reference the element at index to "element" value.
            displayStack();
        } else {
            System.out.println("Stack overflow. Cannot push " + element);
        }
    }
	
	public static void pop() {
		if (top > -1) {
			
			stack[top]=' '; //set the last value in the stack as empty to remove it.
			
			top --; //decrease the index of the stack
			displayStack();
		} else {
			System.out.println("Stack is empty!");
		}
			
		
	}

}
