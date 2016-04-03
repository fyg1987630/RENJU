import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Board_Swing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board_Swing frame = new Board_Swing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Board_Swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 950);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				arg0.getPoint();
				System.out.println(arg0.getX());
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);  
        for(int i=0;i<14;i++)  
            for(int j=0;j<14;j++)  
            {  
                Color color=Color.white;  
                JLabel label=new JLabel();  
                label.setSize(50, 50);  
                label.setLocation(100+i*50, 100+j*50);  
//                if((i+j)%2==0)  
//                     color=Color.black;  
                  
                label.setOpaque(true);  
                label.setBackground(color);  

                label.setBorder(BorderFactory.createLineBorder(Color.black));  
                contentPane.add(label);  
                

                //add(contentPane, BorderLayout.CENTER);  
            }  
	}

}
