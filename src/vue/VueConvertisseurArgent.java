package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.Conversion;
import main.Main;
import modele.MontantArgent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class VueConvertisseurArgent extends JFrame {

	private JPanel contentPane;
	private JTextField txtMontant;
	private JComboBox cbDevise1;
	private JComboBox cbDevise2;
	private JLabel lbResultat;
	private MontantArgent montant;
	private Conversion conversion;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VueConvertisseurArgent(Conversion conversion) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		this.conversion=conversion;
		
		String[] listeDevises = {"EUR","CAD","USD"};
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtMontant = new JTextField();
		panel.add(txtMontant);
		txtMontant.setColumns(10);
		
		cbDevise1 = new JComboBox(listeDevises);
		panel.add(cbDevise1);
		
		JLabel lblEn = new JLabel("   en   ");
		panel.add(lblEn);
		
		cbDevise2 = new JComboBox(listeDevises);
		panel.add(cbDevise2);
		cbDevise2.setSelectedIndex(1);
		
		JButton btnConvertir = new JButton("Convertir");
		panel.add(btnConvertir);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		lbResultat = new JLabel("");
		panel_1.add(lbResultat);
		lbResultat.setForeground(Color.BLUE);
		
		Random r = new Random();
		
		
		btnConvertir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				
				montant = new MontantArgent();
				
				//System.out.println(15+r.nextFloat()*5);
				montant.setMontant(Float.parseFloat(txtMontant.getText()));
				montant.setDevise(cbDevise1.getSelectedIndex());
				montant.setDeviseConversion(cbDevise2.getSelectedIndex());
				conversion.conversionDevise(montant);
				lbResultat.setText(String.valueOf(montant.getMontantConverti()) +  " " + cbDevise2.getSelectedItem());
				
				}
				catch (Exception ex) {
					lbResultat.setText("Le montant entré est incorrect");
				}
				
			}
		});
		
	}

}
