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

    public String selectPingpong(int fbs, int hb_up, int hb_down, double hba1c) {
        if (fbs >= 183 && hb_up >= 180
                && hb_down >= 109 && hba1c >= 8.0) {
            return "Red";
        } else if (fbs >= 155 && hb_up >= 160
                && hb_down >= 100 && hba1c >= 7.0) {
            return "Orange";
        } else if (fbs >= 125 && hb_up >= 140 
                && hb_down >= 90 && hba1c < 7.0) {
            return "Yellow";
        }else if (fbs >= 100 && hb_up >= 120 
                && hb_down >= 80){
            return "Green";
        }else if(fbs < 100 && hb_up < 120 
                && hb_down < 80){
            return "White";
        }
        return "Error";
    }
}
