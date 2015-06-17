package com.example.test;

import android.app.Application;

public class MyApplication extends Application {

	private static MyApplication singleton;
	
	public static MyApplication getInstance(){
		return singleton;
	}

	public static void setInstance(MyApplication singleton) {
		MyApplication.singleton = singleton;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		setInstance(this);
	}
	
}
