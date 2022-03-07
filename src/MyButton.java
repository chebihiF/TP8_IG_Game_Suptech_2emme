import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {

    public MyButton(String text, int size) {
        setText(text);
        setFont(new Font("Arial",0,size));
    }

    public MyButton(String text) {
        setText(text);
        setFont(new Font("Arial",0,30));
    }
}
