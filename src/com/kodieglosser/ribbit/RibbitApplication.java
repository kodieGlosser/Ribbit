package com.kodieglosser.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		  super.onCreate();
		  Parse.initialize(this, "xYqMPxRjHM5YTRKj2CP5mXVcLEOKeJ364E3lLaJk", "33vtslH4na9cgczcDOsZE932qHtLCj4MbXSHp3Y3");
		}
}
