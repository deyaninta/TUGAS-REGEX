/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanregex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DEYANINTA
 */
public class Logic {
    
    public Boolean checkEmail (String email) {
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_"
            + "\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher match = pattern.matcher(email);
        return match.matches();
    }
    
    public Boolean checkName(String name) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
        Matcher matchname = pattern.matcher(name);
        return matchname.matches();
    }
    
    public ArrayList addData(ArrayList list, String data){
        list.add(data);
        return list;
    }
}
