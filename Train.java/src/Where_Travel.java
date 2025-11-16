import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Where_Travel extends JFrame{
    private JLabel  titleLabel;
    private JButton Goback;
    Where_Travel(){
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Where_Fly...");

        titleLabel=new JLabel("Where We Travel");
        titleLabel.setFont(new Font("",2,35));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        add("North",titleLabel);

        JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        Goback = new JButton("Goback");
        Goback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Interface().setVisible(true);
            }
        });
        buttonPanel.add(Goback);
        add("South",buttonPanel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });
    }
}
