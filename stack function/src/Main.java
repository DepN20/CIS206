import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList206<String> node = new LinkedList206<>();
		Scanner s = new Scanner(System.in);
		String c;

		while (s.hasNext()){
			c = s.next();
			if (c.equals("PUSH")){//used addNode method for push
				node.addNode(s.next());
			}
			else if (c.equals("POP")){
				if(node.size ==0){
					System.out.println("Empty");
				}
				else{
					System.out.println(node.removeAt(node.size-1));
				}

			}
			else if (c.equals("CLEAR")){// remove everything in for loop
				for(int i=node.size-1; i >= 0 ; i--){
					node.removeAt(0);
				}

			}
			else if (c.equals("PRINT")){// printed all
				node.printAll();
			}

			else if(c. equals("ENQUEUE")){//insert at the end of node(tail)
				node.insertAt(node.size,s.next());
			}
			else if(c. equals("DEQUEUE")){ //remove from the head
				if(node.size==0){
					System.out.println("EMPTY");
				}
				else{
					System.out.println(node.removeAt(0));
				}
			}
			else{

				return;
			}
		}
	}
}
