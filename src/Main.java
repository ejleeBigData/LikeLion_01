//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int number = 8 ;

        if(number > 0 ) {
            System.out.println("number는 양수입니다.");
        } else if(number < 0 ){
            System.out.println("number는 음수입니다");
        } else {
            System.out.println("number는 0입니다.");
        }

        switch (number) {
            case 7:
                System.out.println(("number는 7."));
                break;
            case 8:
                System.out.println("number는 8.");
                break;
            default :
                System.out.println("number는 숫자입니다.");
                break;
        }
    }
}