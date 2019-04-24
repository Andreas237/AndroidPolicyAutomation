// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

class ActivityCompatJB
{

	ActivityCompatJB()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void finishAffinity(Activity activity)
	{
		activity.finishAffinity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method void Activity.finishAffinity()>
	//    2    4:return          
	}

	public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle)
	{
		activity.startActivityForResult(intent, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #23  <Method void Activity.startActivityForResult(Intent, int, Bundle)>
	//    5    7:return          
	}

	public static void startIntentSenderForResult(Activity activity, IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		activity.startIntentSenderForResult(intentsender, i, intent, j, k, l, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:aload           7
	//    8   12:invokevirtual   #30  <Method void Activity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
	//    9   15:return          
	}
}
