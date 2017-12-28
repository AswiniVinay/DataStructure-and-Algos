import java.util.*;
class node
{
    int data;
	node link;//store address of next object
	
	node(int data)
	{
		this.data=data;
	}
}
class linkedlist
{
	node head;
	public void insert(int data)
	{
		node newnode=new node(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			node temp=head;
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			temp.link=newnode;
		}
	}
	public void display()
	{
		node temp=head;
		if(temp==null)
			System.out.println("it is empty");
		else
		{
		while(temp.link!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.link;
		}
		System.out.print(temp.data+"\n");
		}
	}
	public void delete()
	{
		node temp=head;
		node previous = null;
		while(temp.link!=null)
		{
			previous=temp;
			temp=temp.link;
		}
		previous.link=null;
	}
	public void insertBegin(int data)
	{
		node temp=head;
		node newnode=new node(data);//create a new node with data
		newnode.link=temp;
		head=newnode;
		
	}
	
	public void insertPos(int data,int pos)
	{
		node newnode=new node(data);
		node temp=head;
		if(head==null)
		{
			head=newnode;
		}
		node prev=null;
		int i;
		for(i=0;i<pos-1;i++)
			{
			prev=temp;
			temp=temp.link;
		}
			
			prev.link=newnode;
			newnode.link=temp;
	}
	public void deletePos(int pos)
	{
		
		node temp=head;
		node prev=null;
		if(pos==0 && head==null)
		{
			System.out.println("underflow");
		}
		else if(pos==0)
		{
			prev=temp.link;
			head=prev;
		}
		else
		{
		for(int i=0;i<pos-1;i++)
		{
			prev=temp;
			temp=temp.link;
		}
		 prev.link=temp.link;
		 //temp.link=temp.link.link;
		}
	}
	public void deleteBegin()
	{
		node temp=head;
		node prev=null;
		if(temp==null)
			System.out.println("underflow");
		else
		{
			prev=temp.link;
			head=prev;
		}
		
	}
	
	public void replace(int data,int pos)
	{
		node temp=head;
		node prev=null;
		int i;
		for(i=0;i<pos-1;i++)
			{
			prev=temp;
			temp=temp.link;
		}
			node newnode=new node(data);
			prev.link=newnode;
			newnode.link=temp.link;
	}
	
}
public class singlelinkedlist {

	/**
	 * @param args
	 */
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
		linkedlist ll =new linkedlist();
 //insert a node and display
 char ch;
 do
 {
	 System.out.println("1- to insert a value at end");
	 System.out.println("2- to delete at the end");
	 System.out.println("3- to insert a value at beginning");
	 System.out.println("4- to insert a value at position");
	 System.out.println("5- to delete a value at position");
	 System.out.println("6- to delete a value at beginning");
	 System.out.println("7- to replace at position data followed by position");
	 System.out.println("8- to display a linked list");
	 int i=sc.nextInt();
	 switch(i)
	 {
	 case 1: System.out.println("enter value to insert");
	         ll.insert(sc.nextInt());
	         break;
	 case 2: System.out.println("value deleted");
             ll.delete();
             break;
	 case 3 :System.out.println("value at beginning");
	         ll.insertBegin(sc.nextInt());
	         break;
	 case 4 :System.out.println("value followed by value at position");
             ll.insertPos(sc.nextInt(),sc.nextInt());
             break;
	 case 5 :System.out.println("delete value at pos");
             ll.deletePos(sc.nextInt());
             break;
	 case 6 :System.out.println("delete value at beginning");
             ll.deleteBegin();
             break;
	 case 7: System.out.println("displaying value...");
              ll.replace(sc.nextInt(),sc.nextInt());
               break;
     
	 case 8: System.out.println("displaying value...");
             ll.display();
             break;
     default :System.out.println("plese enter a valid openion");
	}
	 System.out.println("Select 'y' or 'N' " );
	 ch=sc.next().charAt(0);
 }while(ch=='Y'|| ch=='y');
	}//end main

}//end class
