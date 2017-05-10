/*
 * TestGlassPanel.java
 *
 * Created on 26 dicembre 2008, 16.41
 */

package jmash.test;

import javax.swing.JFrame;

import org.apache.log4j.Logger;

import jmash.Gui;
import jmash.Main;
import jmash.Ricetta;
import jmash.component.GlassPanel;

/**
 *
 * @author Alessandro
 */
public class TestGlassPanel extends JFrame {
	private static Logger LOGGER = Logger.getLogger(TestGlassPanel.class);
	private GlassPanel glassPanel;

	/** Creates new form TestGlassPanel */
	public TestGlassPanel() {
		initComponents();
		try {
			Main.readConfig();
			Main.readColors();
			Gui gui = new Gui();
			Main.gui = gui;
			Main.desktopPane = Gui.desktopPane;
			glassPanel = new GlassPanel(new Ricetta());
			getContentPane().add(glassPanel, java.awt.BorderLayout.CENTER);
			glassPanel.setColor(10.0);
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {// GEN-BEGIN:initComponents
		jPanel1 = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(0, 400, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(0,
				300, Short.MAX_VALUE));
		getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

		pack();
	}// GEN-END:initComponents

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TestGlassPanel().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}
