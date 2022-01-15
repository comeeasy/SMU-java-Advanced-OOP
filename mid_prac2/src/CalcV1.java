import java.util.Scanner;

public class CalcV1 {
    Scanner scanner;
    String inputStr;
    int operand1; // 첫 번째 피 연산자값 저장
    int operand2; // 두 번째 피 연산자값 저장

    private State state;
    private State stateStart;
    private State stateFirstOperand;
    private State stateSecondOperand;
    private State stateOperator;

    char operator; // 사칙 연산자 저장

    CalcV1() {
        scanner = new Scanner(System.in);  // Create a Scanner object
        stateStart = new StateStart(this);
        stateOperator = new StateOperator(this);
        stateFirstOperand = new StateFirstOperand(this);
        stateSecondOperand = new StateSecondOperand(this);

        state = this.getStateStart();
    }

    String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }

    State getStateStart() {return stateStart;}
    State getStateFirstOperator() {return stateFirstOperand;}
    State getStateSecondOperator() {return stateSecondOperand;}
    State getStateOperator() {return stateOperator;}
    void setState(State s) {state = s;}

    void printOutResult() {
        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", operand1, operand2, operand1 + operand2);
                break;

            case '-':
                System.out.printf("%d - %d = %d\n", operand1, operand2, operand1 - operand2);
                break;

            case '*':
                System.out.printf("%d * %d = %d\n", operand1, operand2, operand1 * operand2);
                break;

            case '/':
                System.out.printf("%d / %d = %d\n", operand1, operand2, operand1 / operand2);
                break;
        }
    }

    /* 정수가 입력되었을 때 처리 */
    void processNumber(String ch) {
        state.processNumber(ch);
    }

    /* 사칙 연산자 혹은 = 연산자 처리 */
    void processOperator(char ch) {
        state.processOperator(ch);
    }

    /* 프로그램의 주 로직을 담당하는 함수
       사용자 입력을 기다렸다가 q 또는 Q가 입력되면 종료
       그렇지 않으면 정수가 입력되었는지 혹은 연산자가 입력되었는지에 따라 processNumber 또는 processOperator 함수를 호출
     */
    boolean run() {
        inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
        char ch = inputStr.charAt(0);
        if (ch == 'q' || ch == 'Q') { // q를 입력하면 프로그램 종료
            return false;
        }
        else if (ch >= '0' && ch <= '9') { // 정수가 입력되면
            processNumber(inputStr);
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') { // 연산자 처리
            processOperator(ch);
        }
        return true;
    }
}
