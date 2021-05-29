import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Scanner;

public class JackInTheBox extends Rectangle{
	//========================================================= Properties
	private Color color;
	private boolean isOpen;
	
	//========================================================= Constructors
	public JackInTheBox(Scanner fin) {
		this(fin.nextLine());
	}
	
	public JackInTheBox(String s) {
		this(s.split("\t"));
	}
	
	public JackInTheBox(String[] parts) {
		this(	Integer.parseInt(parts[0]),
				Integer.parseInt(parts[1]),
				Integer.parseInt(parts[2]),
				Color.decode(parts[3]), Boolean.parseBoolean(parts[4]));
	}
	
	public JackInTheBox(int x, int y, int size, Color color, boolean isOpen) {
		super(x,y,size,size);
		this.color = color;
		this.isOpen = isOpen;
	}
	
	//========================================================= Methods
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		
		if(!isOpen) {
			g.setColor(color);
			g.fillRect(x, y-15, width, 12);
			g.setColor(Color.BLACK);
			g.drawRect(x, y-15, width, 12);
		}
		
		if(isOpen) {
			g.setColor(color);
			g.fillRect(x-12, y-width, 12, width);
			g.setColor(Color.BLACK);
			g.drawRect(x-12, y-width, 12, width);
			
			g.setColor(Color.WHITE);
			g.fillOval(x + 13, y - 28, width/2, height/2);
			g.setColor(Color.BLACK);
			g.drawOval(x + 13, y - 28, width/2, height/2);
		}
		
	}

	
	
	//========================================================= Getters/Setters
	public Color getColor() {
		return color;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	
}
