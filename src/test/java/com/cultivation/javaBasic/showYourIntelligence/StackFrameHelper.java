package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        StackTraceElement e = Thread.currentThread().getStackTrace()[2];
        String result = e.getClassName() + "." + e.getMethodName();
        return result;
        // --end-->
    }
}
