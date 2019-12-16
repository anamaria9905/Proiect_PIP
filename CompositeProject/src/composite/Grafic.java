package composite;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Grafic {	



	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafic window = new Grafic();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Grafic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnIs = new JMenu("IS");
		menuBar.add(mnIs);

		JMenu mnIa = new JMenu("IA");
		mnIs.add(mnIa);

		JMenuItem mntmStudentiIa = new JMenuItem("Studenti IA");
		mntmStudentiIa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		mnIa.add(mntmStudentiIa);

		JMenuItem mntmProfesoriIa = new JMenuItem("Profesori IA");
		mntmProfesoriIa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnIa.add(mntmProfesoriIa);

		JMenu mnA = new JMenu("A");
		mnIs.add(mnA);

		JMenuItem mntmStudentiA = new JMenuItem("Studenti A");
		mntmStudentiA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText();
			}
		});
		mnA.add(mntmStudentiA);

		JMenuItem mntmProfesoriA = new JMenuItem("Profesori A");

		mntmProfesoriA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnA.add(mntmProfesoriA);
		frame.getContentPane().setLayout(null);

		textField  = new JTextField();
		textField.setBounds(53, 95, 217, 103);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		frame.setVisible(true);
		


	}
}



