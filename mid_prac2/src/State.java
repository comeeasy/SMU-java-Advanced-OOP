public interface State {
    default void processNumber(String ch) {
        System.out.println("processNumber: invalid access");
    }
    default void processOperator(char ch) {
        System.out.println("processOperator: invalid access");
    }
}
