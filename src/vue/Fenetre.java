package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenetre extends JFrame {

	private JPanel contentPane;
	private JTextField txtMontant1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtMontant1 = new JTextField();
		panel.add(txtMontant1);
		txtMontant1.setColumns(10);
		
		JComboBox cbDevise1 = new JComboBox();
		panel.add(cbDevise1);
		
		JLabel lblEn = new JLabel("   en   ");
		panel.add(lblEn);
		
		JComboBox cbDevise2 = new JComboBox();
		panel.add(cbDevise2);
		
		JButton btnConvertir = new JButton("Convertir");
		panel.add(btnConvertir);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lbResultat = new JLabel("");
		panel_1.add(lbResultat);
		
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbResultat.setText(txtMontant1.getText());
			}
		});
		
	}

}
