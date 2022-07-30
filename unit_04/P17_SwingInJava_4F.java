package Unit_04.Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P17_SwingInJava_4F {

    public static void main(String[] args) {

        SwingInJava_4F obj = new SwingInJava_4F();
    }

}

class SwingInJava_4F extends JFrame {

    JTextField t1;
    JTextField t2;

    JTextArea jt1;

    JButton b1;
    JButton b2;
    JButton b3;

    JRadioButton r1;
    JRadioButton r2;

    JCheckBox c1;
    JCheckBox c2;

    JList list;
    JComboBox jb1;

    JLabel l1;

    JTable jtb1;

    SwingInJava_4F() {

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        b1 = new JButton("Sum");
        b2 = new JButton("Multi");
        b3 = new JButton("Sub");

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");


        c1 = new JCheckBox("Dancer!");
        c2 = new JCheckBox("Singer!");

        jt1 = new JTextArea(10,20);


        //String array to store weekdays
        String week[]= { "Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};

        list = new JList(week);
        jb1 = new JComboBox<>(week);

        String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
        String column[] = { "ID", "NAME", "SALARY" };

        jtb1 = new JTable(data,column);

        l1 = new JLabel("Result");

        add(jt1);
        add(jb1);
        add(list);
        add(jtb1);

        add(t1);
        add(t2);

        add(r1);
        add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(c1);
        add(c2);

        add(b1);
        add(b2);
        add(b3);

        add(l1);

        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int a1 = Integer.parseInt(t1.getText());
                int a2 = Integer.parseInt(t2.getText());

                if (e.getSource() == b1) {
                    Integer sum = a1 + a2;
                    l1.setText(sum.toString());
                }

                if (e.getSource() == b2) {
                    Integer sum = a1 * a2;
                    l1.setText(sum.toString());
                }


                if (e.getSource() == b3) {
                    Integer sum = a1 - a2;
                    l1.setText(sum.toString());
                }

                if(r1.isSelected()) {
                    l1.setText("is a Male");
                }

                if(r2.isSelected()) {
                    l1.setText("is a Female");
                }

                if(c1.isSelected()) {
                    l1.setText("is a Dancer");
                }

                if(c2.isSelected()) {
                    l1.setText("is a Singer");
                }


                if(list.getSelectedIndex() != -1) {
                    String data = "Day Selected: " + list.getSelectedValue();
                    l1.setText(data);
                }

                if(jb1.getSelectedIndex() != -1) {
                    String data = "Day Selected: " + jb1.getSelectedItem();
                    l1.setText(data);
                }

            }
        };

        b1.addActionListener(al);
        b2.addActionListener(al);
        b3.addActionListener(al);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}