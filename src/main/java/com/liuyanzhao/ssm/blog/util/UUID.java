package com.liuyanzhao.ssm.blog.util;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 生成id
 */

public class UUID {
    // 生成UUID
    public static String get(){
        return java.util.UUID.randomUUID().toString().replaceAll("-", "");
    }
}