package electricfan;

import javax.swing.JOptionPane;

class Fan implements Appliance {
    private boolean isOn = false;
    
    @Override
    public void turnOn() {
        setOn(true);
        JOptionPane.showMessageDialog(null, "Fan is now ON.");
    }
    
    @Override
    public void turnOff() {
        setOn(false);
        JOptionPane.showMessageDialog(null, "Fan is now OFF.");
    }

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
}