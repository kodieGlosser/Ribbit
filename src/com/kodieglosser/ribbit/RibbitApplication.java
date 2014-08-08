package com.kodieglosser.ribbit;

import android.app.Application;

import com.kodieglosser.ribbit.ui.MainActivity;
import com.kodieglosser.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		  super.onCreate();
		  Parse.initialize(this, "xYqMPxRjHM5YTRKj2CP5mXVcLEOKeJ364E3lLaJk", "33vtslH4na9cgczcDOsZE932qHtLCj4MbXSHp3Y3");
		  
		  PushService.setDefaultPushCallback(this, MainActivity.class, R.drawable.ic_stat_ic_launcher);
		  ParseInstallation.getCurrentInstallation().saveInBackground();
		}
	
	public static void updateParseInstallation(ParseUser user) {
		ParseInstallation installation = ParseInstallation.getCurrentInstallation();
		installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
		installation.saveInBackground();
	}
}
