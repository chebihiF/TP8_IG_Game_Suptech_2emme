import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MyLabel extends JLabel {

    public MyLabel(String text) {
        setText(text);
        setFont(new Font("comic sans mc",0,30));
        setBorder(new EmptyBorder(10,10,10,10));
        setHorizontalAlignment(JLabel.CENTER);
    }

    public MyLabel(String text, String fontFamily,int fontType,int size, Color color) {
        setText(text);
        setFont(new Font(fontFamily,fontType,size));
        setForeground(color);
        setHorizontalAlignment(JLabel.CENTER);
    }
}
