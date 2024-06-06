/*
 * Created by JFormDesigner on Wed May 15 18:11:45 CEST 2024
 */

package org.example;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLookAndFeel;

import com.bulenkov.darcula.DarculaLaf;
import com.bulenkov.darcula.DarculaMetalTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaIJTheme;
import net.miginfocom.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author hania
 */
public class gui extends JPanel {
    public gui() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hanna Grzebieluch
        panel1 = new JPanel();
        label_n = new JLabel();
        label_sorted = new JLabel();
        textField_n = new JTextField();
        scrollPane1 = new JScrollPane();
        textArea_sorted = new JTextArea();
        label_seed = new JLabel();
        textField_seed = new JTextField();
        label_capacity = new JLabel();
        textField_capacity = new JTextField();
        label_result = new JLabel();
        button_generate = new JButton();
        scrollPane2 = new JScrollPane();
        textArea_result = new JTextArea();
        scrollPane3 = new JScrollPane();
        textArea_f = new JTextArea();

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(700, 500));
            panel1.setPreferredSize(new Dimension(700, 500));
            panel1.setForeground(new Color(0x414450));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
            .swing.border.EmptyBorder(0,0,0,0), "",javax.swing
            .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
            Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.red
            ),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
            public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName(
            )))throw new RuntimeException();}});
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {193, 270};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {31, 41, 31, 41, 31, 33, 86, 0, 80, 73, 50};

            //---- label_n ----
            label_n.setText("enter number of items:");
            label_n.setFont(label_n.getFont().deriveFont(14f));
            panel1.add(label_n, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 7, 12), 0, 0));

            //---- label_sorted ----
            label_sorted.setText("sorted bag:");
            label_sorted.setFont(label_sorted.getFont().deriveFont(14f));
            panel1.add(label_sorted, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 7, 0), 0, 0));

            //---- textField_n ----
            textField_n.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            panel1.add(textField_n, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.BASELINE, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 7, 12), 0, 0));

            //======== scrollPane1 ========
            {

                //---- textArea_sorted ----
                textArea_sorted.setEditable(false);
                scrollPane1.setViewportView(textArea_sorted);
            }
            panel1.add(scrollPane1, new GridBagConstraints(1, 1, 1, 6, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 7, 0), 0, 0));

            //---- label_seed ----
            label_seed.setText("enter seed:");
            label_seed.setPreferredSize(new Dimension(88, 17));
            label_seed.setFont(label_seed.getFont().deriveFont(14f));
            panel1.add(label_seed, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 7, 12), 0, 0));
            panel1.add(textField_seed, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.BASELINE, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 7, 12), 0, 0));

            //---- label_capacity ----
            label_capacity.setText("enter capacity:");
            label_capacity.setFont(label_capacity.getFont().deriveFont(14f));
            panel1.add(label_capacity, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 7, 12), 0, 0));
            panel1.add(textField_capacity, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 7, 12), 0, 0));

            //---- label_result ----
            label_result.setText("result:");
            label_result.setFont(label_result.getFont().deriveFont(14f));
            panel1.add(label_result, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 7, 0), 0, 0));

            //---- button_generate ----
            button_generate.setText("solve");
            panel1.add(button_generate, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
                GridBagConstraints.BASELINE, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 7, 12), 0, 0));

            //======== scrollPane2 ========
            {

                //---- textArea_result ----
                textArea_result.setEditable(false);
                scrollPane2.setViewportView(textArea_result);
            }
            panel1.add(scrollPane2, new GridBagConstraints(1, 8, 1, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 7, 0), 0, 0));

            //======== scrollPane3 ========
            {

                //---- textArea_f ----
                textArea_f.setEditable(false);
                scrollPane3.setViewportView(textArea_f);
            }
            panel1.add(scrollPane3, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

        button_generate.addActionListener(ae-> {
            int n = Integer.parseInt(textField_n.getText());
            int s = Integer.parseInt(textField_seed.getText());
            int c = Integer.parseInt(textField_capacity.getText());
            textArea_result.setText("");
            textArea_result.setText("");

            if(n > 100) {
                textField_n.setForeground(Color.RED);
                textArea_result.setText("");
                textArea_result.append("Insert n < 100");
            }
            else {
                textField_n.setForeground(Color.GREEN);
            }
            if(n < 0){
                textField_n.setForeground(Color.RED);
                textArea_result.append("\nnumber of items cannot be negative!");
            }
            else{
                textField_n.setForeground(Color.GREEN);
            }
            if(c < 0){
                textField_capacity.setForeground(Color.RED);
                textArea_result.append("\ncapacity cannot be negative!");
            }
            else{
                textField_capacity.setForeground(Color.GREEN);
            }
            if(n >= 0 && n <= 100 && c >= 0){
                Knapsack knapsack = new Knapsack(n, s, c);
                knapsack.Generate();
                knapsack.Sorting();
                textArea_sorted.setText("");
                textArea_sorted.append(knapsack.Show2());
                textArea_result.setText("");
                textArea_result.append(knapsack.Fit());
                textArea_f.setText("");
                textArea_f.append((knapsack.Result()));
            }
        });
    }


    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        JFrame frame = new JFrame("Knapsack");
        frame.setContentPane(new gui().panel1);
        frame.setPreferredSize(new Dimension(500, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hanna Grzebieluch
    private JPanel panel1;
    private JLabel label_n;
    private JLabel label_sorted;
    private JTextField textField_n;
    private JScrollPane scrollPane1;
    public JTextArea textArea_sorted;
    private JLabel label_seed;
    private JTextField textField_seed;
    private JLabel label_capacity;
    private JTextField textField_capacity;
    private JLabel label_result;
    private JButton button_generate;
    private JScrollPane scrollPane2;
    private JTextArea textArea_result;
    private JScrollPane scrollPane3;
    private JTextArea textArea_f;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
