public class Pjj{
public static void main(String[] args) {
        double a = 0, b = 0, c = 100.0;

        for (int i = 0; i < 10; i++){
           a = a + c;
            c = c / 2;
            if (i < 9){
                b = b + c;
            }
        }
        System.out.println("共经过" + (a + b));
        System.out.println("第十次反弹高度为" + c);
        
    }

}