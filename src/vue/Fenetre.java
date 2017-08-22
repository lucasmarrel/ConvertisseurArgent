package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import métier.Conversion;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenetre extends JFrame {

	private JPanel contentPane;
	private JTextField txtMontant;
	private Conversion conversion;
	private float montant;

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
		
		conversion = new Conversion();
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtMontant = new JTextField();
		panel.add(txtMontant);
		txtMontant.setColumns(10);
		
		JComboBox cbDevise1 = new JComboBox();
		panel.add(cbDevise1);
		cbDevise1.addItem("EUR");
		cbDevise1.addItem("CAD");
		cbDevise1.addItem("USD");
		
		JLabel lblEn = new JLabel("   en   ");
		panel.add(lblEn);
		
		JComboBox cbDevise2 = new JComboBox();
		panel.add(cbDevise2);
		cbDevise2.addItem("EUR");
		cbDevise2.addItem("CAD");
		cbDevise2.addItem("USD");
		cbDevise2.setSelectedIndex(1);
		
		JButton btnConvertir = new JButton("Convertir");
		panel.add(btnConvertir);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lbResultat = new JLabel("");
		panel_1.add(lbResultat);
		
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					montant = Float.parseFloat(txtMontant.getText());
				
					if (cbDevise1.getSelectedIndex()==cbDevise2.getSelectedIndex()){
						lbResultat.setText(String.valueOf(montant));
					}
					else if (cbDevise1.getSelectedIndex()==0 && cbDevise2.getSelectedIndex()==1){
						montant = conversion.convertisseurEurACad(montant);
						lbResultat.setText(String.valueOf(montant));
					}
					else if (cbDevise1.getSelectedIndex()==0 && cbDevise2.getSelectedIndex()==2){
						montant = conversion.convertisseurEurAUsd(montant);
						lbResultat.setText(String.valueOf(montant));
					}
					else if (cbDevise1.getSelectedIndex()==1 && cbDevise2.getSelectedIndex()==0){
						montant = conversion.convertisseurCadAEur(montant);
						lbResultat.setText(String.valueOf(montant));
					}
					else if (cbDevise1.getSelectedIndex()==1 && cbDevise2.getSelectedIndex()==2){
						montant = conversion.convertisseurCadAUsd(montant);
						lbResultat.setText(String.valueOf(montant));
					}
					else if (cbDevise1.getSelectedIndex()==2 && cbDevise2.getSelectedIndex()==0){
						montant = conversion.convertisseurUsdAEur(montant);
						lbResultat.setText(String.valueOf(montant));
					}
					else if (cbDevise1.getSelectedIndex()==2 && cbDevise2.getSelectedIndex()==1){
						montant = conversion.convertisseurUsdACad(montant);
						lbResultat.setText(String.valueOf(montant));
					}
				} catch (Exception ex){
					lbResultat.setText("Le montant entré est incorrect");
				}
			}
		});
		
	}

}
