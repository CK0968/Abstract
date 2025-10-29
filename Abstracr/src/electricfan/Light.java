package electricfan;

import javax.swing.JOptionPane;

class Light implements Appliance {
    private boolean isOn = false;
    
    @Override
    public void turnOn() {
        setOn(true);
        JOptionPane.showMessageDialog(null, "Light is now ON.");
    }
    
    @Override
    public void turnOff() {
        setOn(false);
        JOptionPane.showMessageDialog(null, "Light is now OFF.");
    }

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
}