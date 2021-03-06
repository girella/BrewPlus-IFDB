/*

 *
 *  This file is part of BrewPlus.
 *
 *  BrewPlus is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  BrewPlus is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with BrewPlus; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package jmash;

/**
 *
 * @author Alessandro
 */
public class StrikeTemp extends javax.swing.JInternalFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1852074935415528044L;

	/** Creates new form StrikeTemp */
	public StrikeTemp() {
		initComponents();
		this.spinL.setModelFormat(15, 1, 999999, 0.1, "0.0", "StrikeTemp.L");
		this.spinR.setModelFormat(3, 0, 999999, 0.1, "0.00", "StrikeTemp.R");
		this.spnT.setModelFormat(66, 1, 80, 0.5, "0.0", "StrikeTemp.T");
		this.spinTM.setModelFormat(15, 1, 80, 0.5, "0.0", "StrikeTemp.TM");
		this.spnW.setModelFormat(5000, 1, 999999, 0.5, "0.0", "StrikeTemp.W");
		this.spnWK.setModelFormat(5000, 1, 999999, 0.5, "0.0", "StrikeTemp.WK");
		spnCoeff.setModelFormat(0, 0.0, 999999, 0.01, "0.00", "StrikeTemp.Coeff");
		setBorder(Utils.getDefaultBorder());
		setBackground(getBackground().darker());
		jTextField1.setText("Temperatura iniziale dell'acqua necessaria:");
		jTextField2.setText("Volume occupato dall'impasto:");

		calc();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		spinR = new jmash.component.JMashSpinner();
		spnW = new jmash.component.JWeightSpinner();
		spinL = new jmash.component.JVolumeSpinner();
		spinTM = new jmash.component.JTemperatureSpinner();
		spnT = new jmash.component.JTemperatureSpinner();
		jLabel3 = new javax.swing.JLabel();
		spnCoeff = new jmash.component.JMashSpinner();
		jMashSpinner2 = new jmash.component.JMashSpinner();
		spnWK = new jmash.component.JWeightSpinner();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel10 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTemperatureSpinner1 = new jmash.component.JTemperatureSpinner();
		jButton1 = new javax.swing.JButton();
		spnVolume = new jmash.component.JVolumeSpinner();
		jTextField2 = new javax.swing.JTextField();

		setBorder(null);
		setClosable(true);
		setIconifiable(true);
		setTitle("Temperatura mash-in e volume occupato");
		getContentPane().setLayout(new java.awt.GridBagLayout());

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dati iniziali"));
		jPanel1.setLayout(new java.awt.GridBagLayout());

		jLabel1.setText("Malto (kg)");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
		jPanel1.add(jLabel1, gridBagConstraints);

		jLabel2.setText("Acqua (L)");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
		jPanel1.add(jLabel2, gridBagConstraints);

		jLabel4.setText("Temp. malto");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
		jPanel1.add(jLabel4, gridBagConstraints);

		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel5.setText("L/kg");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(jLabel5, gridBagConstraints);

		spinR.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinRStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(spinR, gridBagConstraints);

		spnW.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spnWStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(spnW, gridBagConstraints);

		spinL.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinLStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(spinL, gridBagConstraints);

		spinTM.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spinTMStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(spinTM, gridBagConstraints);

		spnT.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spnTStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(spnT, gridBagConstraints);

		jLabel3.setText("Temp. desiderata");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
		jPanel1.add(jLabel3, gridBagConstraints);

		spnCoeff.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spnCoeffStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(spnCoeff, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(jMashSpinner2, gridBagConstraints);

		spnWK.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				spnWKStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 7;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(spnWK, gridBagConstraints);

		jLabel7.setText("Coeff. pentola");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
		jPanel1.add(jLabel7, gridBagConstraints);

		jLabel8.setText("Massa pentola");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 7;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
		jPanel1.add(jLabel8, gridBagConstraints);

		java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("jmash/lang"); // NOI18N
		jLabel9.setText(bundle.getString("calorie_specifiche")); // NOI18N
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(jLabel9, gridBagConstraints);

		jComboBox1.setModel(
				new javax.swing.DefaultComboBoxModel(new String[] { "", "Alluminio", "Acciaio", "Rame", "Plastica" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(jComboBox1, gridBagConstraints);

		jComboBox2.setFont(new java.awt.Font("Arial", 0, 10));
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Aggiunta di grani freddi in acqua calda - contenitore caldo",
						"Aggiunta di acqua calda in grani freddi - contenitore freddo" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 8;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(jComboBox2, gridBagConstraints);

		jLabel10.setText("Modalità");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 8;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		jPanel1.add(jLabel10, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(10, 2, 2, 10);
		getContentPane().add(jPanel1, gridBagConstraints);

		jTextField1.setEditable(false);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
		getContentPane().add(jTextField1, gridBagConstraints);

		jTemperatureSpinner1.setEnabled(false);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 10);
		getContentPane().add(jTemperatureSpinner1, gridBagConstraints);

		jButton1.setText("?");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 10);
		getContentPane().add(jButton1, gridBagConstraints);

		spnVolume.setEnabled(false);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 10, 10);
		getContentPane().add(spnVolume, gridBagConstraints);

		jTextField2.setEditable(false);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(2, 2, 10, 2);
		getContentPane().add(jTextField2, gridBagConstraints);

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 513) / 2, (screenSize.height - 368) / 2, 513, 368);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		new ShowFormula("", new String[] { formula, formula2 }).startModal(this);
	}// GEN-LAST:event_jButton1ActionPerformed

	private void spnTStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spnTStateChanged
		calc();
	}// GEN-LAST:event_spnTStateChanged

	private void spinTMStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinTMStateChanged
		calc();
	}// GEN-LAST:event_spinTMStateChanged

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox2ActionPerformed
		calc();
	}// GEN-LAST:event_jComboBox2ActionPerformed

	private boolean flag = false;

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
		int i = jComboBox1.getSelectedIndex();
		switch (i) {
		case 0:
			spnCoeff.setDoubleValue(0.0);
			break;
		case 1:
			spnCoeff.setDoubleValue(0.21);
			break;
		case 2:
			spnCoeff.setDoubleValue(0.11);
			break;
		case 3:
			spnCoeff.setDoubleValue(0.092);
			break;
		case 4:
			spnCoeff.setDoubleValue(0.0);
			break;
		}
	}// GEN-LAST:event_jComboBox1ActionPerformed

	private void spnCoeffStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spnCoeffStateChanged
		calc();
	}// GEN-LAST:event_spnCoeffStateChanged

	private void spnWKStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spnWKStateChanged
		calc();
	}// GEN-LAST:event_spnWKStateChanged

	private void spinLStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinLStateChanged
		if (flag)
			return;
		flag = true;
		this.spinR.setDoubleValue(this.spinL.getVolume() / (this.spnW.getWeight() / 1000));
		flag = false;
		calc();
	}// GEN-LAST:event_spinLStateChanged

	private void spnWStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spnWStateChanged
		this.spinL.setVolume(this.spinR.getDoubleValue() * this.spnW.getWeight() / 1000);
		calc();
	}// GEN-LAST:event_spnWStateChanged

	private void spinRStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_spinRStateChanged
		if (flag)
			return;
		flag = true;
		this.spinL.setVolume(this.spinR.getDoubleValue() * this.spnW.getWeight() / 1000);
		flag = false;
		calc();
	}// GEN-LAST:event_spinRStateChanged

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private jmash.component.JMashSpinner jMashSpinner2;
	private javax.swing.JPanel jPanel1;
	private jmash.component.JTemperatureSpinner jTemperatureSpinner1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private jmash.component.JVolumeSpinner spinL;
	private jmash.component.JMashSpinner spinR;
	private jmash.component.JTemperatureSpinner spinTM;
	private jmash.component.JMashSpinner spnCoeff;
	private jmash.component.JTemperatureSpinner spnT;
	private jmash.component.JVolumeSpinner spnVolume;
	private jmash.component.JWeightSpinner spnW;
	private jmash.component.JWeightSpinner spnWK;
	// End of variables declaration//GEN-END:variables

	private void calc() {
		int mode = jComboBox2.getSelectedIndex();
		double kg = spnW.getWeight() / 1000;
		double L = spinL.getVolume();
		double T = spnT.getTemperature();
		double tm = spinTM.getTemperature();

		double mp = spnWK.getWeight() / 1000;
		double cp = spnCoeff.getDoubleValue();

		double strikeT = (T * (L + 0.4 * kg + mp * cp) - tm * 0.4 * kg) / (L + mp * cp);
		if (mode == 1) {
			// (Tf * (CaMa+CpMp+CmMm) - ( TpMpCp + TmCmMm ))/CaMa
			strikeT = (T * (L * 1 + 0.4 * kg + mp * cp) - (tm * 0.4 * kg + tm * mp * cp)) / (L);
		}

		jTemperatureSpinner1.setTemperature(strikeT);
		spnVolume.setVolume(kg * 0.67 + L);

	}

	private String formula = "T_strike= \\frac{T_voluta*\\left((M*C)_acqua+(M*C)_malto+(M*C)_pentola\\right) - (T*M*C)_malto}{(M*C)_acqua+(M*C)_pentola}";
	private String formula2 = "T_strike= \\frac{T_voluta*\\left((M*C)_acqua+(M*C)_malto+(M*C)_pentola\\right) - \\left((T*M*C)_malto+(T*M*C)_pentola\\right)}{(M*C)_acqua}";

	private double kgMalto;

	public double getKgMalto() {
		return this.kgMalto;
	}

	public void setKgMalto(double kgMalto) {
		this.kgMalto = kgMalto;
		this.spnW.setWeight(kgMalto * 1000);
		this.spinL.setVolume(this.spinR.getDoubleValue() * this.spnW.getWeight() / 1000);
	}
}
