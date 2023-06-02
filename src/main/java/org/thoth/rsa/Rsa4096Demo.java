/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thoth.rsa;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 606041
 */
public class Rsa4096Demo {
    public static void main(String[] args){
        System.out.println("Test");
        
        Rsa4096 rsa;
        try {
            rsa = new Rsa4096(
                    "./private_key_rsa_4096_pkcs8-generated.pem"
                    , "./public_key_rsa_4096_pkcs8-exported.pem"
            );
            
            String expected
            = "Text to be encrypted";

            // Test
            String encryptedAndEncoded = rsa.encryptToBase64(expected);
            System.out.println(encryptedAndEncoded);
            
            String actual = rsa.decryptFromBase64(encryptedAndEncoded);
            System.out.println(actual);
            
        } catch (Exception ex) {
            Logger.getLogger(Rsa4096Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
