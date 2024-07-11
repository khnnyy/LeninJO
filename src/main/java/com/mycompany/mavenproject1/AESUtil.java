/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author khanny
 */
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AESUtil {

    // Encrypt a string using AES/CBC/PKCS5Padding
    public static String encrypt(String input, SecretKey key, IvParameterSpec iv)
            throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] cipherText = cipher.doFinal(input.getBytes());
        return Base64.getEncoder().encodeToString(cipherText);
    }

    // Decrypt a string using AES/CBC/PKCS5Padding
    public static String decrypt(String cipherText, SecretKey key, IvParameterSpec iv)
            throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] plainText = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(plainText);
    }

    // Generate a new AES key
    public static SecretKey generateKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // 128-bit AES key
        return keyGen.generateKey();
    }

    // Generate a random IV (Initialization Vector)
    public static IvParameterSpec generateIV() {
        byte[] iv = new byte[16]; // AES block size is 16 bytes
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }

    // Store encrypted string to a .jit file
    public static void storeEncryptedString(String encryptedString, String fileName)
            throws IOException {
        Files.write(Paths.get(fileName), encryptedString.getBytes());
    }

    // Load encrypted string from a .jit file
    public static String loadEncryptedString(String fileName)
            throws IOException {
        byte[] encryptedBytes = Files.readAllBytes(Paths.get(fileName));
        return new String(encryptedBytes);
    }
}
