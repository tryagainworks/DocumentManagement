/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diary;

import myframework.pkgGUIControls.ToolbarInterface;
import myframework.pkgGUIContainers.ClsToolbarOperation;

/**
 *
 * @author linuxmintuser02
 */
public class IntFrmTechnology extends MyLclJInternalFrame implements ToolbarInterface {

    static IntFrmTechnology objFrm;
    ClsTechnologyBL bl;

    public static IntFrmTechnology self() {
        if (objFrm == null) {
            objFrm = new IntFrmTechnology();
        }
        return objFrm;
    }

    public IntFrmTechnology() {
        initComponents();
        //clsTechnologyBL bl = new ClsTechnologyBL(tblView);
    }

    /**
     * Creates new form InternalForm01
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTechnology = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblView = new org.jdesktop.swingx.JXTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Technology");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Technology");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtTechnology.setText("jTextField1");
        txtTechnology.setEnabled(false);
        txtTechnology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTechnologyActionPerformed(evt);
            }
        });
        getContentPane().add(txtTechnology, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 430, -1));

        jLabel2.setText("Description");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        txtDesc.setEnabled(false);
        jScrollPane1.setViewportView(txtDesc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 430, 60));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblView);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 560, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTechnologyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTechnologyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTechnologyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private org.jdesktop.swingx.JXTable tblView;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtTechnology;
    // End of variables declaration//GEN-END:variables

    @Override
    public void fnAddNewRecordEvent(ClsToolbarOperation obj, int subCommand, int  flagReserved) {

    }

    @Override
    public void fnEditExitingRecordEvent(ClsToolbarOperation obj, int subCommand, int  flagReserved) {

    }

    @Override
    public void fnSaveNewRecordEvent(ClsToolbarOperation obj, int subCommand, int  flagReserved) {

    }

    @Override
    public void fnReloadEvent(ClsToolbarOperation obj, int subCommand, int  flagReserved) {

    }

    @Override
    public void fnSaveExistingRecordEvent(ClsToolbarOperation obj, int subCommand, int  flagReserved) {

    }

    @Override
    public void fnClearEvent(ClsToolbarOperation obj, int subCommand, int  flagReserved) {

    }

    @Override
    public void fnCancelEvent(ClsToolbarOperation obj, int subCommand, int  flagReserved) {

    }

    @Override
    public void fnCloseEvent(ClsToolbarOperation obj, int subCommand, int  flagReserved) {
        // obj.blnCancelInbuildProcess=true;
    }

    @Override
    public void fnDeleteRecordEvent(ClsToolbarOperation obj, int subCommand, int  flagReserved) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}