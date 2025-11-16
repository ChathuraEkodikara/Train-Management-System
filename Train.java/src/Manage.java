import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Manage extends JFrame{
    private JLabel  titleLabel;
    private JButton Goback;

    private JLabel L1;
    private JTextField F1;
    private JButton addButton;
    Manage(){
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Manage...");

        titleLabel=new JLabel("Manage Your Booking");
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

        addButton=new JButton("Add Customer");
        addButton.setFont(new Font("",6,12));
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String Services=F1.getText();
                ///////////////////////////////////////////////////////////////////

            }

        });


        JPanel labelPanel=new JPanel(new GridLayout(1,1));
        L1=new JLabel(" Added Services");
        L1.setFont(new Font("",1,18));
        labelPanel.add(L1);
        add("West",labelPanel);

        JPanel textFieldPanel=new JPanel(new GridLayout(1,1));
        F1=new JTextField(4);
        F1.setFont(new Font("",1,18));
        labelPanel.add(F1);
        add("East",textFieldPanel);
    }
}
