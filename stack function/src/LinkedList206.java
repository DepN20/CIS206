
public class LinkedList206<T> {

	Node206<T> head;
	int size;
	
	public LinkedList206() {
		head = null;
		size = 0;
	}
	
	public void addNode(T data) {
		Node206<T> newNode = new Node206<T>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node206<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		size++;
	}

	
	public void printAll() {
		Node206<T> current = head;
		while (current != null) {
			System.out.println(current.data.toString());
			current = current.next;
		}


	}
	
	public T get(int index) {
		Node206<T> current = head;
		for (int i=0; i<index; i++) {
			current = current.next;
		}
		return current.data;
	}
	
	public int lookupByName(T name) {
		int index = 0;
		Node206<T> current = head;
		while (current != null) {
			if (name.equals(current.data)) {
				return index;
			} else {
				current = current.next;
				index++;
			}
		}
		return -1;
	}
	
	public void insertAt(int index, T name) {
		Node206<T> newNode = new Node206<T>(name);
		Node206<T> current = head;
		size++;
		
		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
		
			//loop until we get to the node right before
			//where the new one goes
			for (int i=0; i<index-1; i++) {
				current = current.next;
			}
			
			//make the new node point to its successor
			newNode.next = current.next;
			
			//make the current node point to the new node
			current.next = newNode;
		}
	}
	
	public T removeAt(int index) {
		size--;
		Node206<T> current = head;
		if (index == 0) {
			T result = head.data;
			head = head.next;
			return result;
		}
		for (int i=0; i<index-1; i++) {
			current = current.next;
		}
		T result = current.next.data;
		current.next = current.next.next;		
		return result;
	}



	public void clear(){
		Node206<T> current = head;
		while(current != null){
			removeAt(size);

		}
	}
}
