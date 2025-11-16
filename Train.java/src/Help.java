import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Help extends JFrame{
    private JLabel  titleLabel;
    private JButton Goback;

    private JLabel L1;
    private JLabel L2;
    private JLabel L3;
    private JLabel L4;

    Help(){
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Help...");

        titleLabel=new JLabel("Help");
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

        JPanel labelPanel=new JPanel(new GridLayout(6,1));
        L1=new JLabel("  facebook official page @SriLankan_Railway");
        L1.setFont(new Font("",1,18));
        labelPanel.add(L1);
        L2=new JLabel("  twitter official page @Srilankan Railway");
        L2.setFont(new Font("",1,18));
        labelPanel.add(L2);
        L3=new JLabel("  Contact Number : O764463937");
        L3.setFont(new Font("",1,18));
        labelPanel.add(L3);
        L4=new JLabel("  Email : slrailway@gmail.com");
        L4.setFont(new Font("",1,18));
        labelPanel.add(L4);

        add("Center",labelPanel);

    }
}
