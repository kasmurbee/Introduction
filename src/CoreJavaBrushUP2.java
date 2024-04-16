import java.util.ArrayList;

public class CoreJavaBrushUP2 {

	public static void main(String[] args) {
		
		int[] K= {2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<K.length; i++) {
			
			if(K[i]%2==0)
			{
				System.out.println(K[i]);
			}
			
			else
			{
			System.out.println(K[i] + "is not multiple by 2");	
			}
			
			ArrayList <String> a = new ArrayList <String> ();
		    a.add("kasmur");
		    a.add("Chitti");
		    a.add("bittu");
		    
		    for( int i1=0; i1<a.size(); i1++) // to find the length for ArrayList we are using "size()"	
		    	                               // enhanced for loop
		    {
		    
		    System.out.println(a.get(i1));
		
		}
		    for( String val:a)  // This is the new syntax for for loop to print an array
		    {
		    	System.out.println(val);
		    }
               
		    //Item is present in ArrayList
		    
		    System.out.println(a.contains("bittu"));
	}

	}
}
