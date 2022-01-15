import javax.swing.*;

public class OperandCommand extends CommandButton{
    final private Calculator calculator;

    public OperandCommand(Calculator calc) {
        super();
        this.calculator = calc;
    }

    @Override
    public void execute() {
        if (calculator.isOperand1Set()) {  // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
            calculator.setOperatorSet(true);
            calculator.setOperator(getText().charAt(0));
        }
    }
}
