
public class Televisionclass {

    private boolean on = false;
    private int channel = 1;

    public boolean isOn() {
        return on;
    }

    public void pressOnOff() {
        on = !on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (on) {
            if (channel >= 1 && channel <= 10) {
                this.channel = channel;
            } else if (channel > 10) {
                this.channel = 1;
            }
        }
    }
}
