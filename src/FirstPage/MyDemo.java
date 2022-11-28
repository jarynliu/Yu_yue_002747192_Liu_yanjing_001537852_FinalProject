package FirstPage;

import javax.swing.JFrame;




import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
 
public class MyDemo extends JFrame {
 
	private JPanel jpanel = new JPanel();// 中间组件
 
	private JButton jbmaster = new JButton("Master",
			new ImageIcon(new ImageIcon("images\\1.jpg").getImage().getScaledInstance(225, 300, Image.SCALE_DEFAULT)));
	
	private JButton jbbussiness = new JButton("Bussiness",
			new ImageIcon(new ImageIcon("images\\1.jpg").getImage().getScaledInstance(225, 300, Image.SCALE_DEFAULT)));
	
	private JButton jbhospital = new JButton("Hospital",
			new ImageIcon(new ImageIcon("images\\1.jpg").getImage().getScaledInstance(225, 300, Image.SCALE_DEFAULT)));
	
	private JButton jbstray = new JButton("Stray Animals",
			new ImageIcon(new ImageIcon("images\\1.jpg").getImage().getScaledInstance(225, 300, Image.SCALE_DEFAULT)));
 
	public MyDemo() {
		this.setTitle("Pet Community");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(2);
		this.setLocationRelativeTo(null);
 
		// 5
		// setIcon(Icon defaultIcon) //注意了这是改的默认图标。三态中的默认，即鼠标未在其上的时候。
		// setPressedIcon(Icon pressedIcon) //按下时的图标。
		// setRolloverIcon(Icon rolloverIcon) //鼠标经过时的图标。
		
		jbmaster.setHorizontalTextPosition(SwingConstants.CENTER); // 水平方向文本在图片中心
		jbmaster.setVerticalTextPosition(SwingConstants.CENTER);// 垂直方向文本在图片下方
		jbmaster.setContentAreaFilled(false);
		jbmaster.setBorderPainted(false);
		jbmaster.setFont(new Font("Arial", Font.PLAIN, 40));
		jpanel.add(jbmaster);
		
		
		jbbussiness.setHorizontalTextPosition(SwingConstants.CENTER); // 水平方向文本在图片中心
		jbbussiness.setVerticalTextPosition(SwingConstants.CENTER);// 垂直方向文本在图片下方
		jbbussiness.setContentAreaFilled(false);
		jbbussiness.setBorderPainted(false);
		jbbussiness.setFont(new Font("Arial", Font.PLAIN, 40));
		jpanel.add(jbbussiness);
 

		jbhospital.setHorizontalTextPosition(SwingConstants.CENTER); // 水平方向文本在图片中心
		jbhospital.setVerticalTextPosition(SwingConstants.CENTER);// 垂直方向文本在图片下方
		jbhospital.setContentAreaFilled(false);
		jbhospital.setBorderPainted(false);
		jbhospital.setFont(new Font("Arial", Font.PLAIN, 40));
		jpanel.add(jbhospital);
		
		jbstray.setHorizontalTextPosition(SwingConstants.CENTER); // 水平方向文本在图片中心
		jbstray.setVerticalTextPosition(SwingConstants.CENTER);// 垂直方向文本在图片下方
		jbstray.setContentAreaFilled(false);
		jbstray.setBorderPainted(false);
		jbstray.setFont(new Font("Arial", Font.PLAIN, 40));
		jpanel.add(jbstray);
 
		this.getContentPane().add(jpanel);
		this.setVisible(true);
	}
 
	public static void main(String[] args) {
		new MyDemo();
	}
 
}





