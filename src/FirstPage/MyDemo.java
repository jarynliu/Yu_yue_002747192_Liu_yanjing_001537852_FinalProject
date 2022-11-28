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
 
	private JPanel jpanel = new JPanel();// �м����
 
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
		// setIcon(Icon defaultIcon) //ע�������Ǹĵ�Ĭ��ͼ�ꡣ��̬�е�Ĭ�ϣ������δ�����ϵ�ʱ��
		// setPressedIcon(Icon pressedIcon) //����ʱ��ͼ�ꡣ
		// setRolloverIcon(Icon rolloverIcon) //��꾭��ʱ��ͼ�ꡣ
		
		jbmaster.setHorizontalTextPosition(SwingConstants.CENTER); // ˮƽ�����ı���ͼƬ����
		jbmaster.setVerticalTextPosition(SwingConstants.CENTER);// ��ֱ�����ı���ͼƬ�·�
		jbmaster.setContentAreaFilled(false);
		jbmaster.setBorderPainted(false);
		jbmaster.setFont(new Font("Arial", Font.PLAIN, 40));
		jpanel.add(jbmaster);
		
		
		jbbussiness.setHorizontalTextPosition(SwingConstants.CENTER); // ˮƽ�����ı���ͼƬ����
		jbbussiness.setVerticalTextPosition(SwingConstants.CENTER);// ��ֱ�����ı���ͼƬ�·�
		jbbussiness.setContentAreaFilled(false);
		jbbussiness.setBorderPainted(false);
		jbbussiness.setFont(new Font("Arial", Font.PLAIN, 40));
		jpanel.add(jbbussiness);
 

		jbhospital.setHorizontalTextPosition(SwingConstants.CENTER); // ˮƽ�����ı���ͼƬ����
		jbhospital.setVerticalTextPosition(SwingConstants.CENTER);// ��ֱ�����ı���ͼƬ�·�
		jbhospital.setContentAreaFilled(false);
		jbhospital.setBorderPainted(false);
		jbhospital.setFont(new Font("Arial", Font.PLAIN, 40));
		jpanel.add(jbhospital);
		
		jbstray.setHorizontalTextPosition(SwingConstants.CENTER); // ˮƽ�����ı���ͼƬ����
		jbstray.setVerticalTextPosition(SwingConstants.CENTER);// ��ֱ�����ı���ͼƬ�·�
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





