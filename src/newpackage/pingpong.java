/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author nes20
 */
public class pingpong {

    public int selectPingpong(int fbs, int hb_up, int hb_down, double hba1c) {
        if (fbs >= 183 && hb_up >= 180
                && hb_down >= 109 && hba1c >= 8.0) {
            return 6; //แดง
            
        } else if (fbs >= 155 && hb_up >= 160
                && hb_down >= 100 && hba1c >= 7.0) {
            return 5; //ส้ม
            
        } else if (fbs >= 125 && hb_up >= 140 
                && hb_down >= 90 && hba1c < 7.0) {
            return 4; //เหลือง
            
        }else if (fbs >= 100 && hb_up >= 120 
                && hb_down >= 80){
            return 2; //เขียว
            
        }else if(fbs < 100 && hb_up < 120 
                && hb_down < 80){
            return 1; //ขาว
        }
        return 0;
    }
}
