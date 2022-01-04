/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.KonversiSuhu.KonversiSuhu;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hp
 */
@Controller
public class KonversiSuhu {
    
    @RequestMapping("/viewsuhu")
    public String inputanuser(HttpServletRequest data, Model suhu){
        String hsuhu = data.getParameter("var_konversisuhu");
        Double chsuhu = Double.valueOf(hsuhu);
        Double c = chsuhu;
        Double r = c*4/5;
        Double f = (c*9/5)+32;
        Double k = c+273.15;
        

       
        
        suhu.addAttribute("suhu",chsuhu);
        suhu.addAttribute("r",r);
        suhu.addAttribute("f",f);
        suhu.addAttribute("k",k);
        return "View";
    }
}
