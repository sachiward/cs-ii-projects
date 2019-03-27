//push link
//add link
//delete link
//
public class linked_lists {

	static class LList {
		// my_first_list.addLink(25392);
		Link head;

		// LList my_first_list = new LList(48.10);
		// constructor
		LList(double init_data){
			this.head= new Link(init_data);
		}
		// methods
		// (create a new link)
		// this.head.next=temp;
		while(head.next!=null)

		{
			head=head.next;
		}

		void addLink(int pos, double init_data) {
			Link item = new Link(init_data);
			Link temp, thead;
			int k = 0;
			thead = head;
			for (k = 0; k < pos - 1 && thead.next != null; k++) {
				thead = thead.next;
			}
			if(k== pos-1){
				temp=thead.next;
				thead.next=item;
				item.next=temp;
			}
			else{System.out.printf("\nLink at position %d could not be added", pos);
			
			}
		}
	}

	static class Link {
		// 3 things: 1) data fields 2) constructor 3) methods
		double data;
		Link next;

		// constructor
		Link(double init_data) {
			this.data = init_data;
			this.next = null;
		}
		// no methods for Links
		// operate on lists of links (linked lists)
	}

	public static void main(String[] args) {
		
		double input;
		int check;
		
		System.out.printf("Please type in a double to create the first link in a linked list: ",);
		input = StdIn.readDouble();
		LList my_list = new LList(input);
		
		System.out.printf("/////////////////////\n\n");
		
		

	}

}
