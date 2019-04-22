// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.services;

import android.content.Context;
import com.appboy.AppboyInternal;
import com.appboy.support.AppboyLogger;

public class AppboyLocationService
{

	public AppboyLocationService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static void requestInitialization(Context context)
	{
		AppboyLogger.d(a, "Location permissions were granted. Requesting geofence initialization.");
	//    0    0:getstatic       #16  <Field String a>
	//    1    3:ldc1            #24  <String "Location permissions were granted. Requesting geofence initialization.">
	//    2    5:invokestatic    #28  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		AppboyInternal.requestGeofencesInitialization(context);
	//    4    9:aload_0         
	//    5   10:invokestatic    #33  <Method void AppboyInternal.requestGeofencesInitialization(Context)>
	//    6   13:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/services/AppboyLocationService);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyLocationService>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
