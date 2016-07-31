/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diary;

import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import myframework.pkgGUIContainers.ClsGUIContainers;
import org.jdesktop.swingx.JXPanel;

/**
 *
 * @author Win97User
 */
public class DlgAddTopic extends javax.swing.JDialog {

    private static DlgAddTopic objDlg;
    public boolean blnDialogAccepted = false;
    private String strText = "";
    FrmMain frm;

    /**
     * Creates new form dlgGetInputs
     */
    public DlgAddTopic(FrmMain _frm, boolean blnModel) {
        super(_frm, blnModel);
        frm = _frm;
        initComponents();
    }

    public static DlgAddTopic self() {
        if (objDlg == null) {
            objDlg = new DlgAddTopic(FrmMain.self(), true);
        }
        return objDlg;
    }

    public String fnShow(String strTitle, String strDefaultValue) {
        return fnShowCommonMethod(strTitle, strDefaultValue);
    }

    public String fnShow(String strTitle) {
        return fnShowCommonMethod(strTitle, "");
    }

    private String fnShowCommonMethod(String strTitle, String strDefaultValue) {
        setTitle(strTitle);
        txtTopic.setText(strDefaultValue);
        txtTopic.setSelectionStart(0);
        txtTopic.setSelectionEnd(txtTopic.getText().length());
        txtTopic.requestFocus();
        ClsGUIContainers.self(frm.txtLogs).fnShowDialogCenter(this, frm, false);
        return strText;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdOk = new org.jdesktop.swingx.JXButton();
        cmdCancel = new org.jdesktop.swingx.JXButton();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        txtTopic = new org.jdesktop.swingx.JXTextField();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdOk.setText("Ok");
        cmdOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOkActionPerformed(evt);
            }
        });
        getContentPane().add(cmdOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        cmdCancel.setText("Cancel");
        cmdCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jXLabel1.setText("Topic");
        getContentPane().add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtTopic.setFont(new java.awt.Font("Uni Ila.Sundaram-07", 0, 14)); // NOI18N
        getContentPane().add(txtTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 470, -1));

        jXLabel2.setText("Tags");
        getContentPane().add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 470, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOkActionPerformed
        // TODO add your handling code here:
        strText = txtTopic.getText();
        blnDialogAccepted = true;
        this.setVisible(false);
    }//GEN-LAST:event_cmdOkActionPerformed

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed
        // TODO add your handling code here:
        strText = null;
        txtTopic.setText("");
        blnDialogAccepted = false;
        this.setVisible(false);
    }//GEN-LAST:event_cmdCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton cmdCancel;
    private org.jdesktop.swingx.JXButton cmdOk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXTextField txtTopic;
    // End of variables declaration//GEN-END:variables
}

class clsMultiCheckBox extends JXPanel {

    class clsMyCheckBox extends JCheckBox {

        public int intIndex = 0;

        clsMyCheckBox(int _intIndex, String strTitle) {
            super(strTitle);
            int intIndex = _intIndex;
        }
    }
    private clsMyCheckBox[] chkBoxes = null;
    int[] intID;
    ArrayList<Integer> alSelected = new ArrayList<>();
    int intSelectedCount = 0;

    clsMultiCheckBox(ResultSet rs, String strIDColName, String strTextColName, int intNoOfCols) throws SQLException {
        ArrayList<String> alText = new ArrayList<>();
        ArrayList<Integer> alID = new ArrayList<>();

        while (rs.next()) {
            alID.add(rs.getInt(strIDColName));
            alText.add(rs.getString(strTextColName));
        }
        rs.close();
        chkBoxes = new clsMyCheckBox[alText.size()];
        intID = new int[chkBoxes.length];
        int iCount = 0;
        this.setLayout(new GridLayout(alID.size() / intNoOfCols, intNoOfCols));
        while (!alText.isEmpty()) {
            chkBoxes[iCount] = new clsMyCheckBox(iCount, alText.remove(0));
            intID[iCount] = alID.remove(0);
            this.add(chkBoxes[iCount]);
            iCount++;
        }
        alText = null;
        alID = null;
    }

    public int[] fnGetSelectedIDs() {
        int[] intId = new int[intSelectedCount];
        for (JCheckBox box : chkBoxes) {
            if (box.isSelected()) {

            }
        }
        return intId;
    }

    public String[] fnGetSelecteTexts() {
        String[] strText = new String[intSelectedCount];
        return strText;
    }
}