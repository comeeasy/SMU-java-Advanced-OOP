public class StateOperator implements State{
    final private CalcV1 calcV1;

    public StateOperator(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void processNumber(String ch) {
        calcV1.operand2 = Integer.parseInt(ch);
        calcV1.setState(calcV1.getStateSecondOperator());
    }
}
