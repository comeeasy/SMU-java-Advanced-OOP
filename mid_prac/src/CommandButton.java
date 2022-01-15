import javax.swing.*;

public abstract class CommandButton extends JButton implements Command {
    public CommandButton() {
        super();
    }
    public abstract void execute();
}
