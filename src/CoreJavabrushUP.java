
public class CoreJavabrushUP {

	public static void main(String[] args) {
		
		//Arrays
		
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
	/*	int[] arr2= {12,13,14,15,16};
		
			System.out.println(arr[2]);
			System.out.println(arr2[4]); */
			
			for(int i=0;i<arr.length;i++)
			{	
				System.out.println(arr[i]); 

			}
	
	 String[] name= {"bittu","kasmur","najar"};
	
	 for(int i=0;i<name.length;i++) {
		
		System.out.println(name[i]);
	} 
	 String[] nam1= {"bittu","kasmur","najar"};	
	for(String s:name) {
		System.out.println(s);
	}

}
}
