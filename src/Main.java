//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String mood = "locky";

        switch (mood) {
            case "sleepy" :
                System.out.println("졸리다~");
                break;
            case "happy" :
                System.out.println("행복하다~");
                break;
            case "lucky" :
                System.out.println("행운아다~");
                break;
            default :
                System.out.println("준비");
        }

        String myString = "I Love Korea";

        switch (myString.length()) {
            case 1 :
                System.out.println("1");
            case 2 :
                System.out.println("2");
            default:
                System.out.println("실제 길이 출력");
                System.out.println(myString.length());
        }
    }
}