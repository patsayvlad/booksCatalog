package com.example.bookscatalog.config.security.user.passwordEncoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MD5PasswordEncoder implements PasswordEncoder {

  public MD5PasswordEncoder() {
  }

  @Override
  public String encode(CharSequence charSequence) {
    String md5 = charSequence.toString();
    try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] array = md.digest(md5.getBytes());
      StringBuilder sb = new StringBuilder();
        for (byte b : array) {
            sb.append(Integer.toHexString((b & 0xFF) | 0x100), 1, 3);
        }
      return sb.toString();
    } catch (NoSuchAlgorithmException ignored) {
    }
    return null;
  }

  @Override
  public boolean matches(CharSequence charSequence, String s) {
    return encode(charSequence).equals(s);
  }

  @Override
  public boolean upgradeEncoding(String encodedPassword) {
    return false;
  }
}
