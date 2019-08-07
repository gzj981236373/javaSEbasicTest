import java.util.*;

public class Ojj{
	public static void main(String[] ages){
		//byte[] a = {1,2,3,3,2,1};
		//byte[] b = new byte[a.length];
		//for(int c=0;c<a.length;c++){
			//b[c]=a[c];
			
		//}
		
		
		//[0] = 50;
		//System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(b));
	 
	    //byte[] a = {5,6,8,2,1};
		//byte[] b = Arrays.copyOf(a,5);
		//System.out.print(Arrays.toString(b));
		byte[] a = {1,6,5,3};
		byte[] b = Arrays.copyOf(a,a.length+1);
		b[b.length-1] = 9;
		System.out.print(Arrays.toString(b));
		
		
		
		
	}
	
	
	
	
	
}