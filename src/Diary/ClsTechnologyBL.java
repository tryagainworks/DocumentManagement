package Diary;

import org.jdesktop.swingx.JXTable;
import myframework.pkgDataBase.ClsHSQLDBDataBase;
import myframework.pkgGUIContainers.ClsGUIContainers;

class ClsTechnologyBL{

  ClsHSQLDBDataBase objDBHSQ;
  ClsGUIContainers objGUIContainer;

  JXTable TblView;
  public ClsTechnologyBL(){
      objDBHSQ = ClsHSQLDBDataBase.self(FrmMain.self().txtLogs);
      objGUIContainer = ClsGUIContainers.self(FrmMain.self().txtLogs);
  }

  public void fnViewData(){
      String strQuery="";
      //objGUIContainer.fnFillJTable(TblView, objDBHSQ.fnSelectQuery(strQuery));
      TblView.packAll();
  }


}
