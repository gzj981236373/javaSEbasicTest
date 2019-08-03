public class Ejj{
    public static void main(String[] args){
	String str = "123456789012";
	int oldNum = 0;
	int evenNum = 0;
	for(int i=0;i<str.length();i++)
	    if(i%2 == 0){
		    oldNum += str.charAt(i)-'0';
		}
	    else{
		    evenNum += str.charAt(i)-'0';
		}
	    System.out.print("奇数和:"+oldNum);
		System.out.print("偶数和:"+evenNum);
	}
}