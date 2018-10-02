/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.buttonsamples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class RadioButtonSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());
        JRadioButton radio1 = new JRadioButton("radio1");
        JRadioButton radio2 = new JRadioButton("radio2");
        JCheckBox check1=new JCheckBox("check1");
        JToggleButton toggle1= new JRadioButton("toggle");
        
        frame.add(radio1);
        frame.add(radio2);
        frame.add(check1);
        frame.add(toggle1);
        //建立 ButtonGroup，把 radio1, radio2 加到 ButtonGroup
        ActionListener a=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str="radio1:"+radio1.isSelected()+"radio2:"+radio2.isSelected();
                JOptionPane.showMessageDialog(frame, str);
            }
        };
        ButtonGroup ga=new ButtonGroup();
        ga.add(radio1);
        ga.add(radio2);
        ga.add(check1);
        ga.add(toggle1);
        radio1.addActionListener(a);
        radio2.addActionListener(a);
        check1.addActionListener(a);
        toggle1.addActionListener(a);
       
        ////////////////////////////////////////////////////
        
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

}
