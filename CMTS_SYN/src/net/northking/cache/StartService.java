package net.northking.cache;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.gemstone.gemfire.cache.Cache;
import com.gemstone.gemfire.cache.CacheFactory;

public class StartService {
	
	public static void main(String[] args) {
		new StartService().startService();
	}

	
	public void  startService(){

		Cache cache = new CacheFactory().set("locators", "127.0.0.1[53101]")
				.set("mcast-address", "224.0.0.1").set("mcast-port", "8787")
				.set("log-level", "error").set("cache-xml-file", "cache.xml")
				.create();
		
	
	   boolean keepRunning=true;
	    while(keepRunning){
	    	keepRunning=processCommond();
	    }
	
	}
	private  boolean processCommond() {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("input shutdown to exit!");
	    try{
	    String commond=br.readLine();
	    if("shutdown".equals(commond)){
	    	return false;
	    }
	    }catch(IOException e){
	    e.printStackTrace();
	    }
		return true;

	}

	
	
	
	
}
