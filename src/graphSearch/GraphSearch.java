package graphSearch;

import  java.util.ArrayList;  
import java.util.Scanner;

public class GraphSearch {
	
	
	public static void main (String[] args)
	{
		//get the node from 
		System.out.println( "get the starting point value");
		String firstNodeName; 
		Scanner sc =  new Scanner(System.in);
		firstNodeName = (String) sc.next();
		System.out.println( "");
		System.out.println( " get the ending point value");
		String lastNodeName; 
		
		
		lastNodeName = (String) sc.next();

		
		
		
		//Say we have graph as collection of nodes
		//Say it is in a list 
		ArrayList <Node> graph = new ArrayList<Node>();
		
		Node n1 = new Node("Agnieszka");
		Node n2 = new Node ("Jasiek");
		Node n3 = new Node ( "Jurek");
		Node n4 = new Node("Piotrek");
		Node n5 = new Node ("Liam");
		Node n6 = new Node ("Misio");
		Node n7 = new Node ("Adam");
		Node n8 = new Node ( "Klara");
		Node n9 = new Node ("Slawek");
		Node n10 = new Node ("Ewa");
		Node n11 = new Node ("Grazyna");
		Node n12= new Node ("Andrzej");
		n1.addNeighbour(n2);
		n1.addNeighbour(n5);

		n2.addNeighbour(n4);
		n2.addNeighbour(n5);
		n2.addNeighbour(n1);

		n3.addNeighbour(n4);
		n3.addNeighbour(n6);
		n3.addNeighbour(n7);
		n3.addNeighbour(n9);

		n4. addNeighbour(n3);
		n4. addNeighbour(n6);
		n4. addNeighbour(n7);
		n4. addNeighbour(n9);

		n4. addNeighbour(n1);
		n4. addNeighbour(n2);

        n6.addNeighbour(n7);
    
        n7.addNeighbour(n6);

		graph.add(n1);
		graph.add(n2);
		graph.add(n3);
		graph.add(n4);
		graph.add(n5);
		graph.add(n6);
		graph.add(n7);
		graph.add(n8);
		graph.add(n9);
		graph.add(n10);
		graph.add(n11);
		graph.add(n12);
    
	
		System.out.println( "Is there a path from  " + firstNodeName + " to " + lastNodeName + "? " + (isOnPath( graph, firstNodeName.trim() ,lastNodeName.trim() )? "Yes!!":"No -add some connections!"));
	
	}//main
	
	static public boolean isOnPath( ArrayList <Node> graph, String strA, String strB )
	{
    boolean addedNode =false;
	
	for ( Node n : graph)
	{ 
		if (n.getName().equals(new NameForNode(strA))) 
	    {
		   System.out.println( "Found the starting point value");
		   //this is our first node
		   n.setVisited( true);
		   System.out.println( " visited : " +  n.getName().getLongNameForNode());
		   addedNode =true;
		   for( Node nc : n.neighb)				   
		   {
			   nc.setVisited( true);
			   System.out.println( " Checking root neighb visited : " +  nc.getName().getLongNameForNode());
			   addedNode =true;
			   if (nc.getName().equals(new NameForNode(strB)) )
			   { 
				   return true;
			   }   
		   }		   
		   
	   }
	  
	} //for Node n 
	   while (addedNode )
	   {
		   addedNode = false;
	   
		   for ( Node n : graph)
		   { 
			   if( n.getVisited())
			   {
				   for( Node nc : n.neighb)				   
				   {
					   if(!nc.getVisited())
					   {
						   nc.setVisited( true);
						   System.out.println( " visited : " +  nc.getName().getLongNameForNode());
						   addedNode =true;
						   if (nc.getName().equals(new NameForNode(strB)))              	
						   { 
							   return true;
						   }   
					   }
			        }		   
		       }
		   }
		}//while
	 
       return false;
	
	
	  }//is on path
	   

}//GraphSearch 

