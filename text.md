import java.util.*;


public class Ajj{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入该生成绩：");	
        byte score = scanner.nextByte();

	    String level = "";
		switch(score/10){
		case 10:
            level = "优秀";
			break;
		case 9:
            level = "优秀";
            break;
        case 8:
            level = "良好";
            break;
        case 7:
            level = "中等";	
            break;
        case 6:
            level = "及格";		
		default:level = "不及格";
		}
        System.out.println(level);	
	
	
	
	
	
	
	
	}






}