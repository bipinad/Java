import java.awt.*;
import javax.swing.JFrame;

class House extends Canvas
{
	public void paint(Graphics g)
	{
		g.drawRect(100, 300, 400, 300);

		
		g.drawRect(250, 350, 70, 70);


        g.drawPolygon((new int[]{100,500,300}),( new int[]{300,300,50} ),3);


		g.setColor(Color.RED);
		g.fillRect(100, 300, 400, 300);

		g.setColor(Color.WHITE);
		g.fillRect(250, 350, 70, 70);


		g.setColor(new Color(153,12,0));
		g.fillPolygon((new int[]{100,500,300}),( new int[]{300,300,50} ),3);


		g.setColor(Color.BLACK);

		g.drawLine(260, 350, 260, 420);
		g.drawLine(280, 350, 280, 420);
		g.drawLine(300, 350, 300, 420);
		


		
	}	

	public static void main(String[] args) 
	{
		House ob = new House();

		JFrame f = new JFrame();

			f.add(ob);
			f.setSize(800, 800);
			f.setVisible(true);
	}
}