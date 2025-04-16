import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDangXuat extends JButton{
    public ButtonDangXuat()
    {
        super();
        init();
    }
    private void init()
    {
        ImageIcon dangxuaticon = new ImageIcon(ButtonDangXuat.class.getResource("/pic/dangxuaticon.png"));

        setPreferredSize(new Dimension(50,50));;
        setIcon(dangxuaticon);
        setHorizontalTextPosition(SwingConstants.CENTER);
        setVerticalTextPosition(SwingConstants.BOTTOM);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        ChangeColor();
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    public void ChangeColor() {
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setContentAreaFilled(true);
                setBackground(Color.RED);
            }
    
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setContentAreaFilled(false);
            }
        });
    }
    
}
