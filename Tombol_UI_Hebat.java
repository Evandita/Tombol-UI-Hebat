/***************************************************************
 *                                                             *
 * Judul Program     : Tombol UI Hebat 					       *
 * Nama Pembuat      : Evandita Wiratama Putra (2206059572)    *
 * Tanggal Pembuatan : 07/09/2023                              *
 * Versi Program     : 1.0.0                                   *
 *                                                             *
****************************************************************/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tombol_UI_Hebat{
    public static void main(String []args){

        JFrame frame = new JFrame("GUI Tergokil");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        JButton button = new JButton("Tombol UI Hebat");


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("UI Hebat");
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}