/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diary;

import javax.swing.JFrame;
import myframework.pkgGUIContainers.ClsGUIContainers;

/**
 *
 * @author linuxmintuser02
 */
public class DlgSettings extends javax.swing.JDialog {

    FrmMain objMainFrom;

    /**
     * Creates new form DlgSettings
     */
    public DlgSettings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        objMainFrom = FrmMain.self();
        objMainFrom.objGUIContainer.fnShowInternalFormMiddle(objMainFrom.desktopPane, this,false);
    }

    static DlgSettings objDlg;

    public static DlgSettings self(JFrame objFrm, boolean blnModel) {
        if (objDlg == null) {
            objDlg = new DlgSettings(objFrm, blnModel);

        }
        return objDlg;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Application Settings");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 356, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
