import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame {
  private JLabel label;
  private JButton jbutton;
  private JTextField jtextfield;




  public static void main (String args[]){
  GUI GUI = new GUI();
  GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  GUI.setVisible(true);
  GUI.setUndecorated(true);
  GUI.setExtendedState(JFrame.MAXIMIZED_BOTH);
  GUI.setTitle("First Working GUI");

}
  public GUI() {

    setLayout(new FlowLayout());

    label = new JLabel("First label ever");

    add(label);

    jtextfield = new JTextField(15);

    add(jtextfield);

    jbutton = new JButton ("Whatever");

    add(jbutton);

  }











}
