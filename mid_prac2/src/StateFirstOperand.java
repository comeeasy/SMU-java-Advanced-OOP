public class StateFirstOperand implements State{
    final private CalcV1 calcV1;

    public StateFirstOperand(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void processOperator(char ch) {
        calcV1.operator = ch;
        calcV1.setState(calcV1.getStateOperator());
    }
}
