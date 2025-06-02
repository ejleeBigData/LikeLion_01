//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String mood = "lucky";

        switch (mood) {
            case "sleepy":
                System.out.println("졸리다~");
                break;
            case "happy":
                System.out.println("행복하다~");
                break;
            case "lucky":
                System.out.println("행운아다~");
                break;
            default:
                System.out.println("준비");
        }

        if(mood == "sleepy") {
            System.out.println("졸리다!");
        } else if (mood == "happy") {
            System.out.println("행복하다!");
        } else if (mood == "lucky") {
            System.out.println("행운아다!");
        } else {
            System.out.println("준비!");
        }
    }
}