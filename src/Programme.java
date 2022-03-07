import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Programme {
    public static void main(String[] args) {

        // JFrame props
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.getContentPane().setLayout(new BorderLayout());

        //JLabel title
        JLabel title = new JLabel("Game 1");
        title.setFont(new Font("Time new roman",Font.BOLD,30));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBorder(new LineBorder(Color.BLACK));
        frame.getContentPane().add(title,BorderLayout.NORTH);

        //JLabel Score
        JLabel score = new JLabel("Score : 0");
        score.setFont(new Font("Time new roman",0,20));
        score.setHorizontalAlignment(JLabel.RIGHT);
        score.setBorder(new EmptyBorder(0,0,10,30));
        frame.getContentPane().add(score,BorderLayout.SOUTH);

        JPanel centerPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(2,3);
        gridLayout.setHgap(30);
        gridLayout.setVgap(10);
        centerPanel.setLayout(gridLayout);
        centerPanel.setBorder(new EmptyBorder(30,60,60,60));
        centerPanel.setBackground(Color.white);

        centerPanel.add(new MyLabel("0"));
        centerPanel.add(new MyLabel("+","arial",Font.BOLD,30,Color.BLUE));
        centerPanel.add(new MyLabel("0"));

        centerPanel.add(new MyButton("0"));
        centerPanel.add(new MyButton("0"));
        centerPanel.add(new MyButton("0"));

        frame.getContentPane().add(centerPanel,BorderLayout.CENTER);


    }
}
