package mini_project;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
public class swingdemo {

Double price;
String countries[]= {"INDIA","AMERICA","UNITED KINDOM","UNITED STATES OF AMERICA"};
swingdemo()
{
JFrame jfrm=new JFrame("Currency convertor");
//jfrm.setExtendedState(JFrame.MAXIMIZED_BOTH);
jfrm.setSize(500,500);
JLabel jlab;
jlab=new JLabel(" Exchange Rate ");
jlab.setBounds(200,50,100,30);
jfrm.add(jlab);

JTextField txtf=new JTextField();
txtf.setBounds(new Rectangle(200,80,100,30));
txtf.setEditable(false);
jfrm.add(txtf);

JTextField amount=new JTextField();
amount.setText("-");
amount.setBounds(new Rectangle(125,150,250,30));
amount.setEditable(true);
jfrm.add(amount);

JLabel jlab2=new JLabel("Amount :");
jlab2.setBounds(70,150,100,30);
jfrm.add(jlab2);

JLabel from=new JLabel("FROM");
from.setBounds(70,200,100,30);
jfrm.add(from);
JComboBox<String> fromlist=new JComboBox<String>(countries);
fromlist.setBounds(70,230,100,30);
jfrm.add(fromlist);

JLabel to=new JLabel("TO");
to.setBounds(300,200,100,30);
jfrm.add(to);
JComboBox<String> tolist=new JComboBox<String>(countries);
tolist.setBounds(300,230,100,30);
jfrm.add(tolist);

JLabel image=new JLabel();
BufferedImage bimage;
try {
	bimage = ImageIO.read(new File("src/mini_project/arrow3.jpg"));
	ImageIcon i=new ImageIcon(bimage);
	image.setIcon(i);
	image.setBounds(220,230,30,30);
	jfrm.add(image);
	
} catch (IOException e) {
	e.printStackTrace();
}
JButton button=new JButton();
button.setText("CONVERT");
button.setFont(new Font(null,Font.BOLD, 10));
button.setBounds(190,290,100,30);
jfrm.add(button);
button.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e) {
		price=Double.valueOf(amount.getText());
	     }
       });
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jfrm.setLayout(null);
jfrm.setVisible(true);
}
public static void main(String args[])
{
SwingUtilities.invokeLater(new Runnable(){ 
public void run()
{
new swingdemo();
}
});
}
}