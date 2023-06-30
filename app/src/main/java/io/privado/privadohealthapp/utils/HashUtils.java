package io.privado.privadohealthapp.utils;

import static java.util.Locale.US;

import android.text.TextUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class HashUtils {
    public static final int HASH_LENGTH = 32;
    public static final String HASH_ALGORITHM = "MD5";
    public static final String CHARSET = "CP1252";

    public static String getHash(final String email) {
        if (TextUtils.isEmpty(email)) {
            return null;
        }/*from w ww .j  av  a2s  .c  o  m*/
        final String tmpEmail = email.trim().toLowerCase(US);
        return tmpEmail.length() > 0 ? digest(tmpEmail) : null;
    }

    private static String digest(final String value) {
        final byte[] digested;
        try {
            digested = MessageDigest.getInstance(HASH_ALGORITHM).digest(
                    value.getBytes(CHARSET));
        } catch (final NoSuchAlgorithmException e) {
            return null;
        } catch (final UnsupportedEncodingException e) {
            return null;
        }

        final String hashed = new BigInteger(1, digested).toString(16);
        final int padding = HASH_LENGTH - hashed.length();
        if (padding == 0) {
            return hashed;
        }

        final char[] zeros = new char[padding];
        Arrays.fill(zeros, '0');
        return new StringBuilder(HASH_LENGTH).append(zeros).append(hashed)
                .toString();
    }
}
