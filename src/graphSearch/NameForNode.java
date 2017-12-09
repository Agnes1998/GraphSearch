package graphSearch;

public class NameForNode {
	
	 private String name;
	 private String nameShort;
	
	 
	//costructor
	public NameForNode( String nameLong)
	{
		try
		{
		 nameShort = nameLong.substring(0,3);
		 name = nameLong;
		}
		catch (Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	
	public String getShortNameForNode()
	{
		return nameShort;
	}
	public String getLongNameForNode()
	{
		return name;
	}
	
	public boolean equals(NameForNode nodeName)
	{
		return this.nameShort.equals( nodeName.getShortNameForNode());
	}

}
