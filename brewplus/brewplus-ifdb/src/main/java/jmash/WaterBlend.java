/*
 * WaterBlend.java
 *
 * Created on 16 ottobre 2007, 21.13
 */

package jmash;

import java.io.File;

import javax.swing.border.TitledBorder;

import org.jdom.Document;
import org.jdom.Element;

import jmash.utils.BrewplusEnvironment;
import jmash.utils.Constants;

/**
 *
 * @author Alessandro
 */
public class WaterBlend extends ModalInternalFrame {
	
	private static BrewplusEnvironment bpenv = BrewplusEnvironment.getIstance();

	/** Creates new form WaterBlend */
	public WaterBlend() {
		initComponents();
		setBackground(getBackground().darker());
		setBorder(Utils.getDefaultBorder());
		spinCalcio.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinCalcio");
		spinCloruro.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinCloruro");
		spinMagnesio.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinMagnesio");
		spinSodio.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinSodio");
		spinSolfato.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinSolfato");
		spinCarb.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinCarb");
		spinCarb1.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinCarb1");
		spinCarb2.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinCarb2");
		spinCalcio1.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinCalcio1");
		spinCloruro1.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinCloruro1");
		spinMagnesio1.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinMagnesio1");
		spinSodio1.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinSodio1");
		spinSolfato1.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinSolfato1");
		spinCalcio2.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinCalcio2");
		spinCloruro2.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinCloruro2");
		spinMagnesio2.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinMagnesio2");
		spinSodio2.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinSodio2");
		spinSolfato2.setModel(0, 0, 1000, 1, "0.0", "WaterBlend.spinSolfato2");
		result = false;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {// GEN-BEGIN:initComponents
		java.awt.GridBagConstraints gridBagConstraints;

		fromPanel = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		spinCalcio = new jmash.component.JMashSpinner();
		jLabel2 = new javax.swing.JLabel();
		spinMagnesio = new jmash.component.JMashSpinner();
		jLabel3 = new javax.swing.JLabel();
		spinSolfato = new jmash.component.JMashSpinner();
		jLabel4 = new javax.swing.JLabel();
		spinCloruro = new jmash.component.JMashSpinner();
		jLabel5 = new javax.swing.JLabel();
		spinSodio = new jmash.component.JMashSpinner();
		jLabel28 = new javax.swing.JLabel();
		spinCarb = new jmash.component.JMashSpinner();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		destPanel = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		spinCalcio1 = new jmash.component.JMashSpinner();
		jLabel7 = new javax.swing.JLabel();
		spinMagnesio1 = new jmash.component.JMashSpinner();
		jLabel8 = new javax.swing.JLabel();
		spinSolfato1 = new jmash.component.JMashSpinner();
		jLabel9 = new javax.swing.JLabel();
		spinCloruro1 = new jmash.component.JMashSpinner();
		jLabel10 = new javax.swing.JLabel();
		spinSodio1 = new jmash.component.JMashSpinner();
		jLabel29 = new javax.swing.JLabel();
		spinCarb1 = new jmash.component.JMashSpinner();
		jButton4 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jSlider1 = new javax.swing.JSlider();
		jLabel11 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jLabel15 = new javax.swing.JLabel();
		spinCalcio2 = new jmash.component.JMashSpinner();
		jLabel16 = new javax.swing.JLabel();
		spinMagnesio2 = new jmash.component.JMashSpinner();
		jLabel17 = new javax.swing.JLabel();
		spinSolfato2 = new jmash.component.JMashSpinner();
		jLabel18 = new javax.swing.JLabel();
		spinCloruro2 = new jmash.component.JMashSpinner();
		jLabel19 = new javax.swing.JLabel();
		spinSodio2 = new jmash.component.JMashSpinner();
		jLabel30 = new javax.swing.JLabel();
		spinCarb2 = new jmash.component.JMashSpinner();
		jPanel1 = new javax.swing.JPanel();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();

		getContentPane().setLayout(new java.awt.GridBagLayout());

		setClosable(true);
		setIconifiable(true);
		setTitle("Water Blend");
		fromPanel.setLayout(new java.awt.GridBagLayout());

		fromPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acqua A",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 11)));
		fromPanel.setPreferredSize(new java.awt.Dimension(720, 64));
		jLabel1.setText("Calcio");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		fromPanel.add(jLabel1, gridBagConstraints);

		spinCalcio.setPreferredSize(new java.awt.Dimension(54, 20));
		spinCalcio.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinCalcioStateChanged(evt);
			}
		});

		fromPanel.add(spinCalcio, new java.awt.GridBagConstraints());

		jLabel2.setText("Magnesio");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		fromPanel.add(jLabel2, gridBagConstraints);

		spinMagnesio.setPreferredSize(new java.awt.Dimension(54, 20));
		spinMagnesio.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinMagnesioStateChanged(evt);
			}
		});

		fromPanel.add(spinMagnesio, new java.awt.GridBagConstraints());

		jLabel3.setText("Solfato");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		fromPanel.add(jLabel3, gridBagConstraints);

		spinSolfato.setPreferredSize(new java.awt.Dimension(54, 20));
		spinSolfato.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinSolfatoStateChanged(evt);
			}
		});

		fromPanel.add(spinSolfato, new java.awt.GridBagConstraints());

		jLabel4.setText("Cloruro");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		fromPanel.add(jLabel4, gridBagConstraints);

		spinCloruro.setPreferredSize(new java.awt.Dimension(54, 20));
		spinCloruro.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinCloruroStateChanged(evt);
			}
		});

		fromPanel.add(spinCloruro, new java.awt.GridBagConstraints());

		jLabel5.setText("Sodio");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		fromPanel.add(jLabel5, gridBagConstraints);

		spinSodio.setPreferredSize(new java.awt.Dimension(54, 20));
		spinSodio.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinSodioStateChanged(evt);
			}
		});

		fromPanel.add(spinSodio, new java.awt.GridBagConstraints());

		jLabel28.setText("Carb.");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		fromPanel.add(jLabel28, gridBagConstraints);

		spinCarb.setPreferredSize(new java.awt.Dimension(54, 20));
		spinCarb.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinCarbStateChanged(evt);
			}
		});

		fromPanel.add(spinCarb, new java.awt.GridBagConstraints());

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmash/images/fileopen.png")));
		jButton1.setToolTipText("Apri...");
		jButton1.setBorder(null);
		jButton1.setBorderPainted(false);
		jButton1.setContentAreaFilled(false);
		jButton1.setMaximumSize(new java.awt.Dimension(37, 35));
		jButton1.setMinimumSize(new java.awt.Dimension(37, 35));
		jButton1.setPreferredSize(new java.awt.Dimension(37, 35));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
		fromPanel.add(jButton1, gridBagConstraints);

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmash/images/filesave.png")));
		jButton2.setToolTipText("Salva...");
		jButton2.setBorder(null);
		jButton2.setBorderPainted(false);
		jButton2.setContentAreaFilled(false);
		jButton2.setMaximumSize(new java.awt.Dimension(37, 35));
		jButton2.setMinimumSize(new java.awt.Dimension(37, 35));
		jButton2.setPreferredSize(new java.awt.Dimension(37, 35));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		fromPanel.add(jButton2, new java.awt.GridBagConstraints());

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
		getContentPane().add(fromPanel, gridBagConstraints);

		destPanel.setLayout(new java.awt.GridBagLayout());

		destPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acqua B",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 11)));
		destPanel.setPreferredSize(new java.awt.Dimension(720, 64));
		jLabel6.setText("Calcio");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		destPanel.add(jLabel6, gridBagConstraints);

		spinCalcio1.setPreferredSize(new java.awt.Dimension(54, 20));
		spinCalcio1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinCalcio1StateChanged(evt);
			}
		});

		destPanel.add(spinCalcio1, new java.awt.GridBagConstraints());

		jLabel7.setText("Magnesio");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		destPanel.add(jLabel7, gridBagConstraints);

		spinMagnesio1.setPreferredSize(new java.awt.Dimension(54, 20));
		spinMagnesio1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinMagnesio1StateChanged(evt);
			}
		});

		destPanel.add(spinMagnesio1, new java.awt.GridBagConstraints());

		jLabel8.setText("Solfato");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		destPanel.add(jLabel8, gridBagConstraints);

		spinSolfato1.setPreferredSize(new java.awt.Dimension(54, 20));
		spinSolfato1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinSolfato1StateChanged(evt);
			}
		});

		destPanel.add(spinSolfato1, new java.awt.GridBagConstraints());

		jLabel9.setText("Cloruro");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		destPanel.add(jLabel9, gridBagConstraints);

		spinCloruro1.setPreferredSize(new java.awt.Dimension(54, 20));
		spinCloruro1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinCloruro1StateChanged(evt);
			}
		});

		destPanel.add(spinCloruro1, new java.awt.GridBagConstraints());

		jLabel10.setText("Sodio");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		destPanel.add(jLabel10, gridBagConstraints);

		spinSodio1.setPreferredSize(new java.awt.Dimension(54, 20));
		spinSodio1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinSodio1StateChanged(evt);
			}
		});

		destPanel.add(spinSodio1, new java.awt.GridBagConstraints());

		jLabel29.setText("Carb.");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		destPanel.add(jLabel29, gridBagConstraints);

		spinCarb1.setPreferredSize(new java.awt.Dimension(54, 20));
		spinCarb1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinCarb1StateChanged(evt);
			}
		});

		destPanel.add(spinCarb1, new java.awt.GridBagConstraints());

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmash/images/fileopen.png")));
		jButton4.setToolTipText("Apri...");
		jButton4.setBorder(null);
		jButton4.setBorderPainted(false);
		jButton4.setContentAreaFilled(false);
		jButton4.setMaximumSize(new java.awt.Dimension(37, 35));
		jButton4.setMinimumSize(new java.awt.Dimension(37, 35));
		jButton4.setPreferredSize(new java.awt.Dimension(37, 35));
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
		destPanel.add(jButton4, gridBagConstraints);

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmash/images/filesave.png")));
		jButton3.setToolTipText("Salva...");
		jButton3.setBorder(null);
		jButton3.setBorderPainted(false);
		jButton3.setContentAreaFilled(false);
		jButton3.setMaximumSize(new java.awt.Dimension(37, 35));
		jButton3.setMinimumSize(new java.awt.Dimension(37, 35));
		jButton3.setPreferredSize(new java.awt.Dimension(37, 35));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		destPanel.add(jButton3, new java.awt.GridBagConstraints());

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 2;
		getContentPane().add(destPanel, gridBagConstraints);

		jSlider1.setMajorTickSpacing(10);
		jSlider1.setMinorTickSpacing(2);
		jSlider1.setPaintTicks(true);
		jSlider1.setPreferredSize(new java.awt.Dimension(620, 24));
		jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSlider1StateChanged(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
		getContentPane().add(jSlider1, gridBagConstraints);

		jLabel11.setText("A 50%, B 50%");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
		getContentPane().add(jLabel11, gridBagConstraints);

		jPanel4.setLayout(new java.awt.GridBagLayout());

		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Risultato",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 11)));
		jPanel4.setPreferredSize(new java.awt.Dimension(720, 64));
		jLabel15.setText("Calcio");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		jPanel4.add(jLabel15, gridBagConstraints);

		spinCalcio2.setEnabled(false);
		spinCalcio2.setPreferredSize(new java.awt.Dimension(54, 20));
		jPanel4.add(spinCalcio2, new java.awt.GridBagConstraints());

		jLabel16.setText("Magnesio");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		jPanel4.add(jLabel16, gridBagConstraints);

		spinMagnesio2.setEnabled(false);
		spinMagnesio2.setPreferredSize(new java.awt.Dimension(54, 20));
		jPanel4.add(spinMagnesio2, new java.awt.GridBagConstraints());

		jLabel17.setText("Solfato");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		jPanel4.add(jLabel17, gridBagConstraints);

		spinSolfato2.setEnabled(false);
		spinSolfato2.setPreferredSize(new java.awt.Dimension(54, 20));
		jPanel4.add(spinSolfato2, new java.awt.GridBagConstraints());

		jLabel18.setText("Cloruro");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		jPanel4.add(jLabel18, gridBagConstraints);

		spinCloruro2.setEnabled(false);
		spinCloruro2.setPreferredSize(new java.awt.Dimension(54, 20));
		jPanel4.add(spinCloruro2, new java.awt.GridBagConstraints());

		jLabel19.setText("Sodio");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		jPanel4.add(jLabel19, gridBagConstraints);

		spinSodio2.setEnabled(false);
		spinSodio2.setPreferredSize(new java.awt.Dimension(54, 20));
		jPanel4.add(spinSodio2, new java.awt.GridBagConstraints());

		jLabel30.setText("Carb.");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
		jPanel4.add(jLabel30, gridBagConstraints);

		spinCarb2.setEnabled(false);
		spinCarb2.setPreferredSize(new java.awt.Dimension(54, 20));
		spinCarb2.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinCarb2StateChanged(evt);
			}
		});

		jPanel4.add(spinCarb2, new java.awt.GridBagConstraints());

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 2;
		getContentPane().add(jPanel4, gridBagConstraints);

		jPanel1.setPreferredSize(new java.awt.Dimension(720, 50));
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmash/images/button_cancel.png")));
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jPanel1.add(jButton5);

		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmash/images/button_ok.png")));
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jPanel1.add(jButton6);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
		getContentPane().add(jPanel1, gridBagConstraints);

		pack();
	}// GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		doDefaultCloseAction();
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		result = true;
		doDefaultCloseAction();
	}// GEN-LAST:event_jButton6ActionPerformed

	private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSlider1StateChanged
		double w = ((double) jSlider1.getValue());
		String s = "A " + w + "%, B " + (100 - w) + "%";
		jLabel11.setText(s);
		calc();
	}// GEN-LAST:event_jSlider1StateChanged

	private void spinCarb2StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinCarb2StateChanged

	}// GEN-LAST:event_spinCarb2StateChanged

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		saveDest();
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		loadDest();
		calc();
	}// GEN-LAST:event_jButton4ActionPerformed

	private void spinCarb1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinCarb1StateChanged
		calc();
	}// GEN-LAST:event_spinCarb1StateChanged

	private void spinSodio1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinSodio1StateChanged
		calc();
	}// GEN-LAST:event_spinSodio1StateChanged

	private void spinCloruro1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinCloruro1StateChanged
		calc();
	}// GEN-LAST:event_spinCloruro1StateChanged

	private void spinSolfato1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinSolfato1StateChanged
		calc();
	}// GEN-LAST:event_spinSolfato1StateChanged

	private void spinMagnesio1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinMagnesio1StateChanged
		calc();
	}// GEN-LAST:event_spinMagnesio1StateChanged

	private void spinCalcio1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinCalcio1StateChanged
		calc();
	}// GEN-LAST:event_spinCalcio1StateChanged

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		saveFrom();
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		loadFrom();
		calc();
	}// GEN-LAST:event_jButton1ActionPerformed

	private void spinCarbStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinCarbStateChanged
		calc();
	}// GEN-LAST:event_spinCarbStateChanged

	private void spinSodioStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinSodioStateChanged
		calc();
	}// GEN-LAST:event_spinSodioStateChanged

	private void spinCloruroStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinCloruroStateChanged
		calc();
	}// GEN-LAST:event_spinCloruroStateChanged

	private void spinSolfatoStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinSolfatoStateChanged
		calc();
	}// GEN-LAST:event_spinSolfatoStateChanged

	private void spinMagnesioStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinMagnesioStateChanged
		calc();
	}// GEN-LAST:event_spinMagnesioStateChanged

	private void spinCalcioStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinCalcioStateChanged
		calc();
	}// GEN-LAST:event_spinCalcioStateChanged

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel destPanel;
	private javax.swing.JPanel fromPanel;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JSlider jSlider1;
	private jmash.component.JMashSpinner spinCalcio;
	private jmash.component.JMashSpinner spinCalcio1;
	private jmash.component.JMashSpinner spinCalcio2;
	private jmash.component.JMashSpinner spinCarb;
	private jmash.component.JMashSpinner spinCarb1;
	private jmash.component.JMashSpinner spinCarb2;
	private jmash.component.JMashSpinner spinCloruro;
	private jmash.component.JMashSpinner spinCloruro1;
	private jmash.component.JMashSpinner spinCloruro2;
	private jmash.component.JMashSpinner spinMagnesio;
	private jmash.component.JMashSpinner spinMagnesio1;
	private jmash.component.JMashSpinner spinMagnesio2;
	private jmash.component.JMashSpinner spinSodio;
	private jmash.component.JMashSpinner spinSodio1;
	private jmash.component.JMashSpinner spinSodio2;
	private jmash.component.JMashSpinner spinSolfato;
	private jmash.component.JMashSpinner spinSolfato1;
	private jmash.component.JMashSpinner spinSolfato2;
	// End of variables declaration//GEN-END:variables

	private void loadFrom() {
		File file = Utils.pickFileToLoad(this, bpenv.getFolderName(Constants.DIR_WATER));
		if (file == null)
			return;
		Document doc = Utils.readFileAsXml(file.toString());
		if (doc == null) {
			return;
		}
		Element root = doc.getRootElement();
		WaterProfile profile = WaterProfile.fromXml(root);
		sourceName = profile.getNome();
		if (sourceName == null)
			sourceName = file.getName();
		profile.setNome(sourceName);
		setSource(profile);
	}

	private boolean flagRes = false;

	public void saveFrom() {

		File file = Utils.pickFileToSave(this, bpenv.getFolderName(Constants.DIR_WATER));
		if (file == null) {
			return;
		}
		WaterProfile source = new WaterProfile(spinCalcio.getIntegerValue(), spinMagnesio.getIntegerValue(),
				spinSolfato.getIntegerValue(), spinCloruro.getIntegerValue(), spinSodio.getIntegerValue(),
				spinCarb.getIntegerValue());
		source.setNome(sourceName);
		Document doc = new Document();
		Element root = source.toXml();
		doc.setRootElement(root);
		Utils.saveXmlAsFile(doc, file, this);
	}

	private File destFile = null;
	private String sourceName = null;
	private String destName = null;

	private void loadDest() {
		File file = Utils.pickFileToLoad(this, bpenv.getFolderName(Constants.DIR_WATER));
		if (file == null)
			return;
		Document doc = Utils.readFileAsXml(file.toString());
		if (doc == null) {
			return;
		}
		Element root = doc.getRootElement();
		WaterProfile profile = WaterProfile.fromXml(root);
		destName = profile.getNome();
		if (destName == null)
			destName = file.getName();
		profile.setNome(destName);
		setDest(profile);
	}

	public void saveDest() {

		File file = Utils.pickFileToSave(this, bpenv.getFolderName(Constants.DIR_WATER));
		if (file == null) {
			return;
		}

		WaterProfile source = new WaterProfile(spinCalcio1.getIntegerValue(), spinMagnesio1.getIntegerValue(),
				spinSolfato1.getIntegerValue(), spinCloruro1.getIntegerValue(), spinSodio1.getIntegerValue(),
				spinCarb1.getIntegerValue());
		source.setNome(destName);
		Document doc = new Document();
		Element root = source.toXml();
		doc.setRootElement(root);
		Utils.saveXmlAsFile(doc, file, this);
	}

	public void setSource(WaterProfile profile) {
		sourceName = profile.getNome();
		((TitledBorder) fromPanel.getBorder()).setTitle("Acqua A - " + sourceName);
		spinCalcio.setIntegerValue((int) profile.getCalcio().doubleValue());
		spinSodio.setIntegerValue((int) profile.getSodio().doubleValue());
		spinSolfato.setIntegerValue((int) profile.getSolfato().doubleValue());
		spinMagnesio.setIntegerValue((int) profile.getMagnesio().doubleValue());
		spinCloruro.setIntegerValue((int) profile.getCloruro().doubleValue());
		spinCarb.setIntegerValue((int) profile.getCarbonato().doubleValue());
	}

	public void setDest(WaterProfile profile) {
		destName = profile.getNome();
		((TitledBorder) destPanel.getBorder()).setTitle("Acqua B - " + destName);
		spinCalcio1.setIntegerValue((int) profile.getCalcio().doubleValue());
		spinSodio1.setIntegerValue((int) profile.getSodio().doubleValue());
		spinSolfato1.setIntegerValue((int) profile.getSolfato().doubleValue());
		spinMagnesio1.setIntegerValue((int) profile.getMagnesio().doubleValue());
		spinCloruro1.setIntegerValue((int) profile.getCloruro().doubleValue());
		spinCarb1.setIntegerValue((int) profile.getCarbonato().doubleValue());
	}

	private void calc() {
		double w = ((double) jSlider1.getValue()) / 100.0;
		spinCalcio2.setDoubleValue(spinCalcio.getDoubleValue() * w + spinCalcio1.getDoubleValue() * (1 - w));
		spinSodio2.setDoubleValue(spinSodio.getDoubleValue() * w + spinSodio1.getDoubleValue() * (1 - w));
		spinSolfato2.setDoubleValue(spinSolfato.getDoubleValue() * w + spinSolfato1.getDoubleValue() * (1 - w));
		spinMagnesio2.setDoubleValue(spinMagnesio.getDoubleValue() * w + spinMagnesio1.getDoubleValue() * (1 - w));
		spinCloruro2.setDoubleValue(spinCloruro.getDoubleValue() * w + spinCloruro1.getDoubleValue() * (1 - w));
		spinCarb2.setDoubleValue(spinCarb.getDoubleValue() * w + spinCarb1.getDoubleValue() * (1 - w));
	}

	public WaterProfile getBlend() {
		WaterProfile blend = new WaterProfile(spinCalcio2.getIntegerValue(), spinMagnesio2.getIntegerValue(),
				spinSolfato2.getIntegerValue(), spinCloruro2.getIntegerValue(), spinSodio2.getIntegerValue(),
				spinCarb2.getIntegerValue());
		return blend;
	}

	private boolean result = false;

	public boolean hasConfirmed() {
		return result;
	}
}
