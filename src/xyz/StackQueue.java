package xyz;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

class ToyBox{
	public void Stack1() {
		Stack<String> toys=new Stack<String>();
		toys.push("Ball");
		toys.push("Blocks");
		toys.push("Puzzle");
		System.out.println("the toy being played "+toys.peek());
		toys.pop();
		System.out.println("remaining toys:");
	    System.out.println(toys);
	}
}
class icecream{
	public void Queue1() {
		Queue<String> kids=new LinkedList<String>();
		kids.add("Maya");
		kids.add("Leo");
		kids.add("Nina");
		System.out.println("the first kid:"+kids.peek());
		kids.poll();
		System.out.println("the remaining in line");
		System.out.println(kids);
	}
}

public class StackQueue {

	public static void main(String[] args) {
		ToyBox obj=new ToyBox();
		obj.Stack1();
		icecream obj1=new icecream();
		obj1.Queue1();
	}

}