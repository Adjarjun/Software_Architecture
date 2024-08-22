public class KitchenRoomLight implements Light{

    private int Level;

    @Override
    public void on() {
        Level=100;
            System.out.println("Kitchen Room light is ON at full brightness");

    }

    @Override
    public void off() {
        Level=0;
            System.out.println("Kitchen Room light is OFF");

    }

    @Override
    public void dim(int level) {
        Level=level;
        System.out.println("Kitchen Room light dimmed to "+level+"%");

    }

    @Override
    public int brightness() {
        return Level;
    }
}
