import java.util.*;
/*
 * union()
 * makeset()
 * findset()
 * */
public class disjoint_sets {

	/**
	 * @param args
	 */
	Map<Integer,node> map =new HashMap<>();
	class node{
		int rank;
		int data;
		node parent;
	}
		private void makeset(int data)
		{
			node n=new node();
			n.data=data;
			n.rank=0;
			n.parent=n;
			map.put(data,n);
		}
		public int findset(int data) {
	        return findset(map.get(data)).data;
	    }
	public node findset(node node)
	{
		node parent=node.parent;
		if(parent==node)
		return parent;
		
		node.parent=findset(node.parent);
		return node.parent;
	}
	public boolean union(int data1,int data2)
	{
		node n1=map.get(data1);
		node n2=map.get(data2);
		
		node parent1=findset(n1);
		node parent2=findset(n2);
		if(parent1.data==parent2.data)
		{
		return false;	
		}
		if(parent1.rank>=parent2.rank)
		{
			parent1.rank=(parent1.rank==parent2.rank)?parent1.rank+1 : parent1.rank;
			parent2.parent=parent1;
		}
		else
		{
			parent1.parent=parent2;
		}
		
		return true;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disjoint_sets ds=new disjoint_sets();
		ds.makeset(1);
        ds.makeset(2);
        ds.makeset(3);
        ds.makeset(4);
        ds.makeset(5);
        ds.makeset(6);
        ds.makeset(7);
        //union
        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(1, 6);
        ds.union(3, 7);
        //findset
        System.out.println(ds.findset(1));
        System.out.println(ds.findset(5));
        System.out.println(ds.findset(6));

	}
}