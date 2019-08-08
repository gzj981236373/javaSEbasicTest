import java.util.*;

public class Rjj{
	public static void main(String[] args){
		int[] a = {1,66,35,86,5};
	    for(int i=0;i<a.length-1;i++){
			for(int j =i+1;j<a.length;j++){
			    if(a[i]>a[j]){;
				int c = a[i];
				a[i] = a[j];
				a[j] = c;
				}
		}
		System.out.print(Arrays.toString(a));
	}	

	
}
}