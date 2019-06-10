/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.security.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/**
 * This class contains all security tools.
 * @version 1.0
 * @author OvalleGA
 * @since 10/06/2019
 */
public class SecurityUtils {
    /**
     * This method encrypt a string in MD5 algorithms.
     * @param pwd String the string to encrypt
     * @return String the string encrypted
     * @throws NoSuchAlgorithmException if:
     * <ol><li>Any exception with encrypt method.</li></ol>
     */
    public static String encryptPwd(String pwd) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        md.update(pwd.getBytes());
        byte[] digest = md.digest();
        byte[] encoded = Base64.encodeBase64(digest);
        return new String(encoded);
    }
}
