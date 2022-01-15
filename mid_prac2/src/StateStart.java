public class StateStart implements State{
    CalcV1 calcV1;

    public StateStart(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void processNumber(String ch) {
        calcV1.operand1 = Integer.parseInt(ch);
        calcV1.setState(calcV1.getStateFirstOperator());
    }

}
