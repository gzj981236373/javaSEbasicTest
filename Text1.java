public class Bjj{
    public static void main(String[] args){
	String nums = "统计一个字符在字符串中所有位置";
	//统计“字”所在的位置
	for(int i=0;i<nums.length();i++)
	{   char aaa = nums.charAt(i);
		if(aaa=='字'){
	        System.out.print(i);
    }
	}
	//System.out.print("奇数和:"+oldNum);
	}
} 