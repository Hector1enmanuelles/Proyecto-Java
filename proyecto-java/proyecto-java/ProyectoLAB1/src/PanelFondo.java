import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelFondo extends JPanel {
	public PanelFondo() {
	}
	
	public void paintComponent(Graphics g)
	{
		Dimension tamanio = getSize();
		ImageIcon imageFondo = new ImageIcon(getClass().getResource("imagenes/fondos/imgfondo1.jpg"));
		g.drawImage(imageFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponents(g);
	}
}
