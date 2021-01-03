// Implementing Stack using Array

public class Stack {

		int array[]=new int[5];
		int top = -1;		
		
		private boolean push(int x) {
			top++;
			array[top]=x;
			System.out.println("The element pushed into the stack is "+x);
			return true;			
		}
		
		private int pop() {
			int x=array[top--];
			System.out.println("Element popped from stack is "+x);	
			return x;
		}
		
		private int peek() {
			return array[top];
		}
		
		public static void main(String[] args) {
			Stack stack=new Stack();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.pop();
			System.out.println("Printing the top most value: "+stack.peek());
		}
}


// https://www.youtube.com/watch?v=CmU-81qictw&list=PLF9tovyahfL020hGgLIsRMZY4bfSLCFUa&index=2

