
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Looi Dong Sin
//DCO2G01
//19-10-18
public class Q1 extends JFrame {

    private JLabel jlbl = new JLabel("COLOR");

    private JButton redBtn = new JButton("Red");
    private JButton greenBtn = new JButton("Green");
    private JButton blueBtn = new JButton("Blue");

    public Q1() {

        setLayout(new BorderLayout());

        jlbl.setHorizontalAlignment(JLabel.CENTER);

        add(jlbl, BorderLayout.NORTH);

        JPanel jpn = new JPanel();
        jpn.setLayout(new FlowLayout());

        jpn.add(redBtn);
        jpn.add(greenBtn);
        jpn.add(blueBtn);

        add(jpn, BorderLayout.CENTER);
        
        redBtn.addActionListener(new changeToRed());
        greenBtn.addActionListener(new changeToGreen());
        blueBtn.addActionListener(new changeToBlue());
        
        redBtn.setToolTipText("This is red button!");
        greenBtn.setToolTipText("This is green button!");
        blueBtn.setToolTipText("This is blue button!");

        setTitle("Primary Colors");
        setVisible(true);
        setSize(250, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class changeToRed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jlbl.setForeground(Color.red);
        }

    }

    class changeToGreen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jlbl.setForeground(Color.green);
        }

    }

    class changeToBlue implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jlbl.setForeground(Color.blue);
        }

    }

    public static void main(String[] args) {
        Q1 frame = new Q1();
    }

}
