/**
 * 
 */
package mystack;

/**
 * @author Marcus Tejada
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() throws NullPointerException{
		try {
			T i = theStack.val;
			theStack = theStack.next;
			System.out.println("popped: " + i);
		}catch(NullPointerException e){
			throw new NullPointerException("The stack is empty");
		}
		return null;
	}

	public void push(T v) {
		theStack = new MyNode<T>(v,theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws NullPointerException{
		// TODO To complete
		MyStack<Integer> i = new MyStack<>();
		i.push(1);
		i.push(2);
		i.pop();
		i.push(5);
		// Push 1 and 2
		// Pop
		// Push 5
		
		// TODO To complete
		MyStack<Person> j = new MyStack<>();
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setFname("Marcus");
		p1.setLname("Tejada");
		p2.setFname("Christine");
		p2.setLname("Scharff");

		j.push(p1);
		j.push(p2);
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
	}

}
