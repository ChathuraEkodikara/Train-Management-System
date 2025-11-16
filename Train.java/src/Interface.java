import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Interface extends JFrame{
    private JLabel titleLabel;
    private JButton BookButton;
    private JButton ManageButton;
    private JButton View_SummaryButton;
    private JButton Where_We_TravelButton;
    private JButton HelpButton;

    Interface(){
        super();
        setSize(350,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("SriLankan Railways ");
        setLayout(new FlowLayout());

        titleLabel=new JLabel("SriLankan Railways ");
        titleLabel.setFont(new Font("",2,35));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        add("North",titleLabel);

        BookButton = new JButton("BookButton");
        BookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Book().setVisible(true);
            }
        });

        add(BookButton);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });
/////////////////////////////////////////////////////////////////////////
        ManageButton = new JButton("ManageButton");
        ManageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Manage().setVisible(true);
            }
        });

        add(ManageButton);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });
///////////////////////////////////////////////////////////////////////////
        View_SummaryButton = new JButton("View_SummaryButton");
        View_SummaryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new View_Summary().setVisible(true);
            }
        });

        add(View_SummaryButton);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });
///////////////////////////////////////////////////////////////////////////
        Where_We_TravelButton = new JButton("Where_We_Travel");
        Where_We_TravelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Where_Travel().setVisible(true);
            }
        });

        add(Where_We_TravelButton);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });
///////////////////////////////////////////////////////////////////////////
        HelpButton = new JButton("Help");
        HelpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Help().setVisible(true);
            }
        });
//////////////////////////////////////////////////////////////////////////
        add(HelpButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });
    }

}