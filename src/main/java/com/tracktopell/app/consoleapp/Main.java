package com.tracktopell.app.consoleapp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tracktopell@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
        Date hoy = new Date();
        System.out.println("["+sdf.format(hoy)+"]-->>"+Main.class.getName());
    }
    
}
