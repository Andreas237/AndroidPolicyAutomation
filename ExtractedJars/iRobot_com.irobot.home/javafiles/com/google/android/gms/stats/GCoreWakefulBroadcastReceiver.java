// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockTracker;

public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver
{

	public GCoreWakefulBroadcastReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void WakefulBroadcastReceiver()>
	//    2    4:return          
	}

	public static boolean completeWakefulIntent(Context context, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(context != null)
	//*   4    6:aload_0         
	//*   5    7:ifnull          21
		{
			WakeLockTracker.getInstance().registerReleaseEvent(context, intent);
	//    6   10:invokestatic    #27  <Method WakeLockTracker WakeLockTracker.getInstance()>
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #31  <Method void WakeLockTracker.registerReleaseEvent(Context, Intent)>
		} else
	//*  10   18:goto            67
		{
			String s = TAG;
	//   11   21:getstatic       #33  <Field String TAG>
	//   12   24:astore_2        
			context = ((Context) (String.valueOf(((Object) (intent.toUri(0))))));
	//   13   25:aload_1         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #39  <Method String Intent.toUri(int)>
	//   16   30:invokestatic    #45  <Method String String.valueOf(Object)>
	//   17   33:astore_0        
			if(((String) (context)).length() != 0)
	//*  18   34:aload_0         
	//*  19   35:invokevirtual   #49  <Method int String.length()>
	//*  20   38:ifeq            51
				context = ((Context) ("context shouldn't be null. intent: ".concat(((String) (context)))));
	//   21   41:ldc1            #51  <String "context shouldn't be null. intent: ">
	//   22   43:aload_0         
	//   23   44:invokevirtual   #55  <Method String String.concat(String)>
	//   24   47:astore_0        
			else
	//*  25   48:goto            61
				context = ((Context) (new String("context shouldn't be null. intent: ")));
	//   26   51:new             #41  <Class String>
	//   27   54:dup             
	//   28   55:ldc1            #51  <String "context shouldn't be null. intent: ">
	//   29   57:invokespecial   #58  <Method void String(String)>
	//   30   60:astore_0        
			Log.w(s, ((String) (context)));
	//   31   61:aload_2         
	//   32   62:aload_0         
	//   33   63:invokestatic    #64  <Method int Log.w(String, String)>
	//   34   66:pop             
		}
		return WakefulBroadcastReceiver.completeWakefulIntent(intent);
	//   35   67:aload_1         
	//   36   68:invokestatic    #67  <Method boolean WakefulBroadcastReceiver.completeWakefulIntent(Intent)>
	//   37   71:ireturn         
	}

	private static String TAG = "GCoreWakefulBroadcastReceiver";

	static 
	{
	//    0    0:return          
	}
}
