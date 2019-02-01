
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;



public class GameFrame {
	
	GameFrame(){
		JFrame frame = new JFrame();
		JButton buttonAttack = new JButton("Attack");
		JButton buttonShoot = new JButton("Shoot");
		
		buttonAttack.setBounds(10,700,150,50);
		buttonShoot.setBounds(180,700,150,50);
		
		frame.add(buttonAttack);
		frame.add(buttonShoot);
		frame.setTitle("GameDemo Ver .01b");
		frame.setMinimumSize(new Dimension(800 , 800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.pack();
		frame.setLocationRelativeTo(null); //Sets the window to open in the exact center of the screen
		frame.setVisible(true); //allows the frame to be visible 
	}
	
	
	public static void main (String[] args) {
		new GameFrame();
	}
}
