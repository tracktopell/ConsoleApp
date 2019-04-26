package com.tracktopell.app.consoleapp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.io.IOException;

import org.apache.commons.exec.environment.EnvironmentUtils;

/**
 *
 * @author tracktopell@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
        Date hoy = new Date();
		Map<String,String> propEnvMap = null;
		try{
			propEnvMap = EnvironmentUtils.getProcEnvironment();
		} catch(IOException ioe){
			System.err.println("-->> error getting Environment vars :( ");
		}
        System.out.println("["+sdf.format(hoy)+"]-->>"+Main.class.getName());
        System.out.println("["+sdf.format(hoy)+"]-->>"+propEnvMap);
    }
    
}
