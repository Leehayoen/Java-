package 윈도우;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class 나의윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setTitle("나의 윈도우 프로그램");
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694~");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(199, 21, 133));
		btnNewButton.setBackground(Color.PINK);
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton button = new JButton("\uB098\uB294 \uC704\uBC84\uD2BC");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 128));
		f.getContentPane().add(button, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("\uB098\uB294 \uC544\uB798\uBC84\uD2BC");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 14));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(50, 205, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
