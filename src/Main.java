import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class DrawClick extends JComponent {
    Image click = new ImageIcon("src/иконка.png").getImage();

    DrawClick () {
        setOpaque(false);
    }
    public void paint (Graphics g) {
        g.drawImage(click, 0, 0, 50, 50, null);
    }
}

public class Main extends JFrame implements MouseListener {
    int x = 0;
    int y = 0;
    JLayeredPane lp;

    public Main () {
        super ("Кликер");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(300,200);
        setSize(600,500);
        lp = getLayeredPane();
        addMouseListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }



    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getButton()==1) {  //левая кнопка мыши
            x = mouseEvent.getX() - 25;
            y = mouseEvent.getY() - 50;
            DrawClick d = new DrawClick();
            d.setBounds(x, y, 50, 50);
            lp.add(d, JLayeredPane.PALETTE_LAYER);
        }
    }










    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
