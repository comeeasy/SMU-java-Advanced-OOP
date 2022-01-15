public class StateSecondOperand implements State{
    final private CalcV1 calcV1;

    public StateSecondOperand(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void processOperator(char ch) {
        if (ch == '=') {
            calcV1.printOutResult();
            calcV1.setState(calcV1.getStateStart());
        }
    }
}
