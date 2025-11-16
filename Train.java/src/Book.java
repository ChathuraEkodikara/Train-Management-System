import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Book extends JFrame {
    private JLabel  titleLabel;
    private JButton Goback;
    private JButton Search;
    private JButton addButton;
    private JButton cancelButton;

    private JLabel L1;
    private JLabel L2;
    private JLabel L3;
    private JLabel L4;
    private JLabel L5;
    private JLabel L6;

    private JTextField F1;
    private JTextField F2;
    private JTextField F3;
    private JTextField F4;
    private JTextField F5;
    private JTextField F6;

    private JList<String> dataList;
    private DefaultListModel<String> listModel;
    private String Data1;

    Book(){
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Book a Train");
        titleLabel=new JLabel("Book a Train");
        titleLabel.setFont(new Font("",2,35));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        add("North",titleLabel);
//////////////////////////////////////////////////////////////////////////////
        JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        Goback = new JButton("Goback");
        Goback.setFont(new Font("",6,12));
        Goback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Interface().setVisible(true);
            }
        });
        buttonPanel.add(Goback);
        Search = new JButton("Search");
        Search.setFont(new Font("",6,12));
        Search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Search().setVisible(true);
            }
        });
        buttonPanel.add(Search);
        //add("South",buttonPanel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });
         //-------------------------------------------------------//

        //JPanel buttonPanel1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        addButton=new JButton("Add Customer");
        addButton.setFont(new Font("",6,12));
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String iDepartureStation=F1.getText();
                //-----------------------------------

                //-------------------------------------
                String ArrivalStation=F2.getText();
                int Passenger= Integer.parseInt(F3.getText());
                String IdName=F4.getText();
                String DepartureDate=F5.getText();
                String ReturnDate=F6.getText();
                Customer customer=new Customer(iDepartureStation,ArrivalStation,Passenger,IdName,DepartureDate,ReturnDate);
                boolean isAdded=CustomerList.add(customer);
                if(isAdded){
                    JOptionPane.showMessageDialog(Book.this,"Added Sccuess");
                }
            }
        });
        buttonPanel.add(addButton);
        cancelButton=new JButton("Cancel");
        cancelButton.setFont(new Font("",6,12));
        buttonPanel.add(cancelButton);

        //---------------------------------------------

        JPanel labelPanel=new JPanel(new GridLayout(6,1));
        L1=new JLabel(" DepartureStation");
        L1.setFont(new Font("",1,18));
        labelPanel.add(L1);
        L2=new JLabel(" ArrivalStation");
        L2.setFont(new Font("",1,18));
        labelPanel.add(L2);
        L3=new JLabel(" Passenger");
        L3.setFont(new Font("",1,18));
        labelPanel.add(L3);
        L4=new JLabel(" IdName");
        L4.setFont(new Font("",1,18));
        labelPanel.add(L4);
        L5=new JLabel(" DepartureDate");
        L5.setFont(new Font("",1,18));
        labelPanel.add(L5);
        L6=new JLabel(" ReturnDate");
        L6.setFont(new Font("",1,18));
        labelPanel.add(L6);
        add("West",labelPanel);

        JPanel textFieldPanel=new JPanel(new GridLayout(6,1));
        F1=new JTextField(4);
        F1.setFont(new Font("",1,18));
        textFieldPanel.add(F1);
        F2=new JTextField(10);
        F2.setFont(new Font("",1,18));
        textFieldPanel.add(F2);
        F3=new JTextField(12);
        F3.setFont(new Font("",1,18));
        textFieldPanel.add(F3);
        F4=new JTextField(12);
        F4.setFont(new Font("",1,18));
        textFieldPanel.add(F4);
        F5=new JTextField(12);
        F5.setFont(new Font("",1,18));
        textFieldPanel.add(F5);
        F6=new JTextField(12);
        F6.setFont(new Font("",1,18));
        textFieldPanel.add(F6);
        add("East",textFieldPanel);
        add("South",buttonPanel);


    }
}
