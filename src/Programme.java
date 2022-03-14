import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Programme {

    private static JLabel nbr1,nbr2,op,score_lbl;
    private static JButton res1, res2, res3;
    private static int total = 0 ;
    private static JFrame frame ;


    public static void main(String[] args) {

        // JFrame props
        frame = new JFrame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                initGame();
            }
        });
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.getContentPane().setLayout(new BorderLayout());

        //JLabel title
        JLabel title = new JLabel("Game 1");
        title.setFont(new Font("Time new roman", Font.BOLD, 30));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBorder(new LineBorder(Color.BLACK));
        frame.getContentPane().add(title, BorderLayout.NORTH);

        //JLabel Score
        score_lbl = new JLabel("Score : "+total);
        score_lbl.setFont(new Font("Time new roman", 0, 20));
        score_lbl.setHorizontalAlignment(JLabel.RIGHT);
        score_lbl.setBorder(new EmptyBorder(0, 0, 10, 30));
        frame.getContentPane().add(score_lbl, BorderLayout.SOUTH);

        JPanel centerPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(2, 3);
        gridLayout.setHgap(30);
        gridLayout.setVgap(10);
        centerPanel.setLayout(gridLayout);
        centerPanel.setBorder(new EmptyBorder(30, 60, 60, 60));
        centerPanel.setBackground(Color.white);

        nbr1 = new MyLabel("0");
        op = new MyLabel("+", "arial", Font.BOLD, 30, Color.BLUE);
        nbr2 = new MyLabel("0");
        centerPanel.add(nbr1);
        centerPanel.add(op);
        centerPanel.add(nbr2);

        res1 = new MyButton("0");
        res2 = new MyButton("0");
        res3 = new MyButton("0");
        centerPanel.add(res1);
        centerPanel.add(res2);
        centerPanel.add(res3);

        res1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eventClick(e);
            }
        });
        res2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eventClick(e);
            }
        });
        res3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eventClick(e);
            }
        });
        frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
    }

    public static void eventClick(MouseEvent e){
        JButton b = (JButton) e.getSource();
        int res = Integer.parseInt(b.getText());
        int nb1 = Integer.parseInt(nbr1.getText());
        int nb2 = Integer.parseInt(nbr2.getText());
        if(nb1+nb2==res){
            total++;
            score_lbl.setText("Score : "+total);
            score_lbl.setForeground(new Color(4,115,35));
            score_lbl.setFont(new Font("Time new roman", Font.BOLD, 20));
        }else{
            total--;
            score_lbl.setText("Score : "+total);
            score_lbl.setForeground(new Color(208,0,0));
            score_lbl.setFont(new Font("Time new roman", Font.BOLD, 20));
        }
        JOptionPane.showMessageDialog(frame,"Next","Info",JOptionPane.INFORMATION_MESSAGE);
        initGame();
    }

    public static void initGame(){
        Random random = new Random();
        int n1 = random.nextInt(100) ;
        int n2 = random.nextInt(100) ;

        int pos = random.nextInt(3); // 0,1,2
        nbr1.setText(n1+"");
        nbr2.setText(n2+"");

        if(pos == 0){
            res1.setText((n1+n2)+"");
            res2.setText(random.nextInt(200)+"");
            res3.setText(random.nextInt(200)+"");
        }else if(pos == 1){
            res2.setText((n1+n2)+"");
            res1.setText(random.nextInt(200)+"");
            res3.setText(random.nextInt(200)+"");
        }else {
            res3.setText((n1+n2)+"");
            res2.setText(random.nextInt(200)+"");
            res1.setText(random.nextInt(200)+"");
        }
    }
}
