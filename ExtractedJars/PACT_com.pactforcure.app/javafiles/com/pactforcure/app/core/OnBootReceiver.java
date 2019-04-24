// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.core;

import android.content.*;
import android.util.Log;
import com.pactforcure.app.tip.TipOfTheWeekNotificationScheduler;

public class OnBootReceiver extends BroadcastReceiver
{

	public OnBootReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		Log.d("OnBootReceiver", "OnBootReceiver: rescheduling the next tip of the week if necessary and possible");
	//    0    0:ldc1            #8   <String "OnBootReceiver">
	//    1    2:ldc1            #17  <String "OnBootReceiver: rescheduling the next tip of the week if necessary and possible">
	//    2    4:invokestatic    #23  <Method int Log.d(String, String)>
	//    3    7:pop             
		TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(context);
	//    4    8:aload_1         
	//    5    9:invokestatic    #29  <Method void TipOfTheWeekNotificationScheduler.scheduleNextNotificationIfNecessaryAndPossible(Context)>
	//    6   12:return          
	}

	private static final String TAG = "OnBootReceiver";
}
