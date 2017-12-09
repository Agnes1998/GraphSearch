package graphSearch;
import java.util.ArrayList;

public class Node   {
	
	 NameForNode strValue = null;
	 public ArrayList <Node> neighb = new ArrayList <Node>()  ;
	 private boolean visited = false;
	 
	//constructor
	public  Node( String  name)
	{
	  strValue = new NameForNode(name);
	} 
	
    //properties get set
	public void setVisited (boolean bVis)
	{
	  visited  = bVis;
	}
	
	public boolean getVisited() 
	{
	  return visited ;
	}
	
	public String getName0() 
	{
	  return strValue.getLongNameForNode();
	}
	
	public NameForNode getName() 
	{
	  return strValue;
	}
	//methods  
	public void addNeighbour(Node n)
	{
	  neighb.add(n);
	}



}


