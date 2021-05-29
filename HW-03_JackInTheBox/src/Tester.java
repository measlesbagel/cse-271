import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/***
 * 
 * @author caglema
 *
 */
public class Tester extends JPanel {
	ArrayList<JackInTheBox> jacks = new ArrayList<>();
	ArrayList<Mailbox> mailboxes = new ArrayList<>();
	JFrame window = new JFrame("Jacks, and Mailboxes");

	public Tester() {
		window.setBounds(0, 0, 800, 800);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.getContentPane().add(this);
		window.setVisible(true);
		loadJacks("HW-03_Jacks.txt");
		loadMailboxes("HW-03_Mailboxes.txt");
		repaint();
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				for(JackInTheBox j : jacks) {
					if(j.contains(e.getPoint())) {
						j.setOpen(!j.isOpen());
						break;
					}
				}
				repaint();
				
				for(Mailbox m : mailboxes) {
					if(m.contains(e.getPoint())) {
						m.setUp(!m.isUp());
						break;
					}
				}
				repaint();
			}

		});
	}

	private void loadMailboxes(String fileName) {
		Scanner fin = null;

		try {
			fin = new Scanner(new File(fileName));
			fin.nextLine();

			while (fin.hasNextLine()) {
				mailboxes.add(new Mailbox(fin));
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fin.close();
			} catch (Exception e) {
			}

		}
	}

	private void loadJacks(String fileName) {
		Scanner fin = null;

		try {
			fin = new Scanner(new File(fileName));
			fin.nextLine();

			while (fin.hasNextLine()) {
				jacks.add(new JackInTheBox(fin));
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fin.close();
			} catch (Exception e) {
			}

		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(JackInTheBox j : jacks) {
			j.draw(g);
		}
		
		for(Mailbox m : mailboxes) {
			m.draw(g);
		}
	}
	
	

	public static void main(String[] args) {
		new Tester();
	}

}
