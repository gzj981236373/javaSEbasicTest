import java.util.*;


public class Ajj{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
	    System.out.print("����������ɼ���");	
        byte score = scanner.nextByte();

	    String level = "";
		switch(score/10){
		case 10:
            level = "����";
			break;
		case 9:
            level = "����";
            break;
        case 8:
            level = "����";
            break;
        case 7:
            level = "�е�";	
            break;
        case 6:
            level = "����";		
		default:level = "������";
		}
        System.out.println(level);	
	
	
	
	
	
	
	
	}






}