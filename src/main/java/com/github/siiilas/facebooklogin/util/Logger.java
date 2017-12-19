package com.github.siiilas.facebooklogin.util;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class Logger {

    private Logger() {
    }

    public static Logger getLogger(Class<?> clazz) {
        return new Logger();
    }

    public void info(String message) {
        System.out.println("[Facebook Login] " + message);
    }

    public void error(String message, Throwable e) {
        System.out.println("[Facebook Login] " + message + " - " + ExceptionUtils.getStackTrace(e));
    }

}
