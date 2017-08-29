package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main;
import modele.Conversion;

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
	private float montant;
	private JComboBox cbDevise1;
	private JComboBox cbDevise2;
	private JLabel lbResultat;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VueConvertisseurArgent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
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
				
				//System.out.println(15+r.nextFloat()*5);
				Main.getConversion().conversionDevise();
				
			}
		});
		
	}
	
	public int getDevise1() {
		return cbDevise1.getSelectedIndex();
	}
	
	public int getDevise2() {
		return cbDevise2.getSelectedIndex();
	}
	
	public float getMontant() {
		return Float.parseFloat(txtMontant.getText());
	}
	
	public void setLabelText(String montantConverti) {
		lbResultat.setText(montantConverti+" "+cbDevise2.getSelectedItem());
	}
	
	public void setLabelErreur(String erreur) {
		lbResultat.setText(erreur);
	}

}
