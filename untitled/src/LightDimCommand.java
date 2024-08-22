public class LightDimCommand implements Command{

    Light light;
    private int New;
    private int old;

    public LightDimCommand(Light light,int New) {
        this.light = light;
        this.New=New;
    }

    @Override
    public void execute() {
        old = light.brightness();
        light.dim(New);


    }

    @Override
    public void undo() {
        light.dim(old);

    }
}
