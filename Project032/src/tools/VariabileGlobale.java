package tools;


//Singleton
public class VariabileGlobale
{	
	private static VariabileGlobale vg;
	
	public int v[];
	public int n;
	
	private VariabileGlobale()
	{
		
	}
	
	public static VariabileGlobale getInstance()
	{
		if( vg == null)
		{
			vg = new VariabileGlobale();
		}
		
		return vg;
	}
	
}
