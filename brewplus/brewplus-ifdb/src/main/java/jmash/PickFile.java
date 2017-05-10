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

import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

import jmash.utils.BrewplusEnvironment;
import jmash.utils.Constants;

/**
 *
 * @author Alessandro
 */
public class PickFile extends ModalInternalFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 8255919763647766893L;
	private static final Icon folder = new ImageIcon(PickFile.class.getResource("/jmash/images/folder.png"));
	private static final Icon file = new ImageIcon(PickFile.class.getResource("/jmash/images/doc.png"));
	private static BrewplusEnvironment bpenv = BrewplusEnvironment.getIstance();

	/** Creates new form PickFile */
	public PickFile() {
		initComponents();

	}

	public PickFile(boolean save) {
		this(save,bpenv.getFolderName(Constants.DIR_USER), "xml");
	}

	public PickFile(boolean save, String dir) {
		this(save, dir, "xml");
	}

	private String ext;

	public PickFile(boolean save, String dir, String ext) {
		this.ext = ext;
		initComponents();
		this.jFileChooser1
				.setDialogType(save ? javax.swing.JFileChooser.SAVE_DIALOG : javax.swing.JFileChooser.OPEN_DIALOG);
		this.setTitle(save ? "Scegli il nome del file da salvare..." : "Scegli il file da caricare...");
		this.jFileChooser1.setCurrentDirectory(new File(dir));
		this.jFileChooser1.setFileView(new FileView() {
			public String getExtension(File f) {
				String ext = null;
				String s = f.getName();
				int i = s.lastIndexOf('.');
				if ((i > 0) && (i < s.length() - 1)) {
					ext = s.substring(i + 1).toLowerCase();
				}
				return ext;
			}

			@Override
			public Icon getIcon(File f) {
				if (getExtension(f) == null) {
					return folder;
				}
				return file;
			}
		});
		this.jFileChooser1.setFileFilter(new FileFilter() {
			public String getExtension(File f) {
				String ext = null;
				String s = f.getName();
				int i = s.lastIndexOf('.');
				if ((i > 0) && (i < s.length() - 1)) {
					ext = s.substring(i + 1).toLowerCase();
				}
				return ext;
			}

			@Override
			public boolean accept(File f) {
				if (f.isDirectory()) {
					return true;
				}
				String extension = getExtension(f);
				if (extension != null) {
					if (extension.equals(PickFile.this.ext)) {
						return true;
					}
				}
				return false;
			}

			@Override
			public String getDescription() {
				return "file ." + PickFile.this.ext;
			}
		});
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jFileChooser1 = new javax.swing.JFileChooser();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(520, 330));

		jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
		jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jFileChooser1ActionPerformed(evt);
			}
		});
		getContentPane().add(jFileChooser1, java.awt.BorderLayout.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFileChooser1ActionPerformed
		if (evt.getActionCommand().equalsIgnoreCase(JFileChooser.CANCEL_SELECTION)) {
			this.jFileChooser1.setSelectedFile(null);
		}
		stopModal();
		setVisible(false);
	}// GEN-LAST:event_jFileChooser1ActionPerformed

	public File getSelectedFile() {
		return this.jFileChooser1.getSelectedFile();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JFileChooser jFileChooser1;
	// End of variables declaration//GEN-END:variables

}
