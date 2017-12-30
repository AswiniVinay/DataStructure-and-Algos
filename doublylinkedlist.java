import java.util.Scanner;
class node
{
	node prev;
	int data;
	node next;
 node(int data)
{
	 this.data=data;
}
 
}

class linkedlist
{
	node head;
	public void insertEnd(int data)
	{
		node newnode=new node(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
		node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.prev=temp;
		
		
		}
	}
	public void display()
	{
		node temp=head;
		if(temp==null)
			System.out.println("it is empty");
		else
		{
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp.data+"\n");
		}//else
	}
	public void reverse()
	{
		node temp=head;
		if(temp==null)
			System.out.println("it is empty");
		else
		{
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		while(temp.prev!=null)
		{
			System.out.print(temp.data+"<-");
			temp=temp.prev;
		}
		System.out.println(temp.data);
		}//else
	}
	public void deleteEnd()
	{
		node temp=head;
		if(temp==null)
			System.out.println("underflow");
		else
		{
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.prev.next=null;
		}//else
	}
	public void insertHead(int data)
	{
		node newnode=new node(data);
		if(head==null)
			head=newnode;
		else
		{
			node temp=head;
			newnode.next=temp;
			temp.prev=newnode;
			head=newnode;
		}
	}
	public void deleteHead()
	{
		if(head==null)
			System.out.println("empty");
		else
		{
			node temp=head;
			if(temp.next==null)
				head=null;
			else
			{
			temp=temp.next;
			temp.prev=null;
			head=temp;
		}
		}
	}
	public void insertPos(int data,int pos)
	{
		node newnode=new node(data);
		if(pos==0)
			head=newnode;
		else
		{
			node temp=head;
		for(int i=0;i<pos-1;i++)
		{
			temp=temp.next;
		}
		newnode.prev=temp.prev;
		newnode.next=temp;
		temp.prev.next=newnode;
		temp.prev=newnode;
		}
	}
	public void deletePos(int pos)
	{
		node temp=head;
		if(head==null)
			System.out.println("empty");
		else if(pos==0)
		{
			if(temp.next==null)
				head=null;
			else
			{
			temp=temp.next;
			temp.prev=null;
			head=temp;
		}
		}
		else
		{
			for(int i=0;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
	}//end fn
	
}//linkedlist
public class doublylinkedlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		linkedlist ll =new linkedlist();
		char ch;
		int c;
		do
		{
			System.out.println("1. to insert value at end \n" +
					           "2. to delete value at end \n" +
					           "3. to insert value at head \n" +
					           "4. to delete value at head \n" +
					           "5. to delete value at position \n" +
					           "6. to insert value at position \n" +
					           "7. to display in reverse order \n" +
					           "8. to display in assending order");
			c=sc.nextInt();
			switch(c)
			{
			case 1:System.out.println("input data to be inserted");
			       ll.insertEnd(sc.nextInt());
				   break;
			case 2:System.out.println("value deleted");
		       ll.deleteEnd();
				   break;
			case 3:System.out.println("input data to be inserted at head");
	               ll.insertHead(sc.nextInt());
			   break;
			case 4:System.out.println("value deleted from head");
	           ll.deleteHead();
			   break;
			case 5:System.out.println("delete value at position \n enter position");
	           ll.deletePos(sc.nextInt());
			   break;
			case 6:System.out.println("insert values at position \n enter value followed by position");
	           ll.insertPos(sc.nextInt(),sc.nextInt());
			   break;
			case 7:System.out.println("values displayed in reverse order");
	           ll.reverse();
			   break;
			case 8:System.out.println("values displayed");
		           ll.display();
				   break;
			default:System.out.println("Enter a valid case");
			}
			System.out.println("select 'y' or 'n'");
	   ch=sc.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
	}

}
