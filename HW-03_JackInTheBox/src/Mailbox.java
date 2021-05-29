import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Scanner;

public class Mailbox extends Rectangle{
	//========================================================= Properties
	private Color color;
	private boolean isUp;
	
	//========================================================= Constructors
	public Mailbox(Scanner fin) {
		this(fin.nextLine());
	}
	
	public Mailbox(String s) {
		this(s.split("\t"));
	}
	
	public Mailbox(String[] parts) {
		this(	Integer.parseInt(parts[0]),
				Integer.parseInt(parts[1]),
				Integer.parseInt(parts[2]),
				Color.decode(parts[3]),
				Boolean.parseBoolean(parts[4]));
	}
	
	public Mailbox(int x, int y, int size, Color color, boolean isUp) {
		super(x,y,size,size);
		this.color = color;
		this.isUp = isUp;
	}
	
	//========================================================= Methods
	public void draw(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, width, height/2);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height/2);
		
		g.setColor(color);
		g.fillRect(x-5+height/2, y+height/2, width/5, height);
		g.setColor(Color.BLACK);
		g.drawRect(x-5+height/2, y+height/2, width/5, height);
		
		g.setColor(Color.DARK_GRAY);
		g.fillOval(x+width/2, y-5+height/4, 10, 10);
		g.setColor(Color.BLACK);
		g.drawOval(x+width/2, y-5+height/4, 10, 10);
		
		if(!isUp) {
			g.setColor(Color.RED);
			g.fillRect(x+10+height/2, y+10, 15, 5);
			g.setColor(Color.BLACK);
			g.drawRect(x+10+height/2, y+10, 15, 5);
		}
		
		if(isUp) {
			g.setColor(Color.RED);
			g.fillRect(x+3+width/2, y-8, 5, 15);
			g.setColor(Color.BLACK);
			g.drawRect(x+3+width/2, y-8, 5, 15);
		}
		
	}
	
	//========================================================= Getters/Setters
	public Color getColor() {
		return color;
	}

	public boolean isUp() {
		return isUp;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setUp(boolean isUp) {
		this.isUp = isUp;
	}
	
}
