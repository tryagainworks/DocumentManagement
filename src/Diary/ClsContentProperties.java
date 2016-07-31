/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diary;

/**
 *
 * @author Win97User
 */
public class ClsContentProperties {

    String strContent = "";
    int intWidth = 0;
    int intHeight = 0;
    int intImageZoom = 0;
    int intTextSize = 0;
    //String strImageFilePath = "";
    String strContentType = "";

    public ClsContentProperties(int _intWidth, int _intHeight, int _intImageZoom, String _strContent, String _strContentType) {
        intWidth = _intWidth;
        intHeight = _intHeight;
        intImageZoom = _intImageZoom;
        strContent = _strContent;
        strContentType = _strContentType;
    }

    public ClsContentProperties(int _intTextSize, String _strContent, String _strContentType) {
        intTextSize = _intTextSize;
        strContentType = _strContentType;
        strContent = _strContent;
    }

    public ClsContentProperties fnImgResize(int _intWidth, int _intHeight, int _intImageZoom) {
        intWidth = _intWidth;
        intHeight = _intHeight;
        intImageZoom = _intImageZoom;
        return this;
    }

    public ClsContentProperties fnTxtResize(int _intTextSize) {
        intTextSize = _intTextSize;
        return this;
    }

    public ClsContentProperties fnResetContent(String _strContent) {
        strContent = _strContent;
        return this;
    }
}
