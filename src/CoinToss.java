import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CoinToss extends JFrame implements ActionListener{
    Random R;
    double comp ;
    JRadioButton r1,r2;
    ButtonGroup Rbtns;


    public static void main(String[] args) {
       new CoinToss();
    }
    public CoinToss(){
        setTitle("Coin Toss");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 120);

        JLabel l1 = new JLabel("Make Your Guess");
        r1 = new JRadioButton("Head");
        r2 = new JRadioButton("Tail");

        Rbtns = new ButtonGroup();
        Rbtns.add(r1); Rbtns.add(r2);

        JButton btn1 = new JButton("Random Coin Flipping");

        add(l1);
        add(r1);
        add(r2);
        add(btn1);

        R = new Random();


        btn1.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        comp = R.nextDouble();

            if ((comp <=0.5 && r1.isSelected()) || comp > 0.5 && r2.isSelected()) // Heads
            {
                JOptionPane.showMessageDialog(this, "Congratulations, You made a right Choice");
            }
            else //if ((comp <=0.5 && r2.isSelected()) || comp > 0.5 && r1.isSelected())
            {
                JOptionPane.showMessageDialog(this, "Opps, You made a wrong Choice");
            }
//            else if (comp > 0.5 && r1.isSelected())
//            {
//                JOptionPane.showMessageDialog(this, "Opps, You made a wrong Choice");
//            }
        }

    //}
}