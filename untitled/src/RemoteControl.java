public class RemoteControl {

    private int slot;
    private final Command[] lightOnCommand;
    private final Command[] lightOffCommand;
    private Command undoCommand;

    public RemoteControl(int slot) {
        this.slot=slot;
        lightOnCommand = new Command[slot];
        lightOffCommand = new Command[slot];
    }

    public void setCommand(int slot, Command on, Command off) {
        lightOnCommand[slot] = on;
        lightOffCommand[slot] = off;
    }

    public void onButtonWasPressed(int slot) {
        lightOnCommand[slot].execute();
        undoCommand = lightOnCommand[slot];
    }

    public void offButtonWasPressed(int slot) {
        lightOffCommand[slot].execute();
        undoCommand = lightOffCommand[slot];
    }

    public void undoButtonWasPressed() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}
