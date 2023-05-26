package bucles;

import java.awt.*;

public class IronMan extends Frame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 100719115977749598L;

	public IronMan() {
        setTitle("Ironman");
        setSize(500, 500);
        setVisible(true);
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(100, 200, 100, 100);
        g.fillRect(300, 200, 100, 100);
        g.fillRect(200, 300, 100, 100);
        
        g.setColor(Color.yellow);
        g.fillOval(200, 200, 100, 100);
        
        g.setColor(Color.white);
        g.fillOval(220, 220, 60, 60);
        
        g.setColor(Color.black);
        g.fillOval(235, 235, 30, 30);
    }
    
    public static void main(String[] args) {
        new IronMan();
    }
}