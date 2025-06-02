//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
       int a = 10, b = 3, sum;

       sum = a+b;
       System.out.println(sum);

       int difference = a-b;
       System.out.println(difference);

       int product = a*b;
       System.out.println(product);

       a +=5; //a = a+5
       System.out.println(a);

       b -= 2;
       System.out.println(b);
       b *= 2;
       System.out.println(b);
       b /= 2;
       System.out.println(b);
       b %= 2;
       System.out.println(b);
    }
}