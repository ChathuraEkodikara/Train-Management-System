import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class View_Summary extends JFrame{
    private JLabel titleLabel;
    private JButton Goback;
    private JTable customerDetailsTable;
    private DefaultTableModel dtm;

    private JButton reloadButton;
    View_Summary(){
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("View_Summary...");

        titleLabel=new JLabel("View_Summary");
        titleLabel.setFont(new Font("",2,35));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        add("North",titleLabel);

        JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        Goback = new JButton("Goback");
        Goback.setFont(new Font("",6,12));
        Goback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Interface().setVisible(true);
            }
        });

        buttonPanel.add(Goback);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });
        //////////////////////////////////////////////////////////////
        String columnName[]={"DepartureStation","ArrivalStation","Passenger","IdName","DepartureDate","ReturnDate","ExtraServices"};
        dtm=new DefaultTableModel(columnName,0);
        customerDetailsTable=new JTable(dtm);

        JScrollPane tablePane=new JScrollPane(customerDetailsTable);
        add("Center",tablePane);

        reloadButton=new JButton("Reload");
        reloadButton.setFont(new Font("",6,12));
        reloadButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dtm.setRowCount(0);
                Customer[] customerArray=CustomerList.customerList.toArray();
                for(Customer c1:customerArray){
                    Object[] rowData={c1.getDepartureStation(),c1.getArrivalStation(),c1.getPassenger(),c1.getIdName(),c1.getDepartureDate(),c1.getReturnDate()};
                    dtm.addRow(rowData);
                }
            }
        });

        buttonPanel.add(reloadButton);

        add("South",buttonPanel);


    }
}
