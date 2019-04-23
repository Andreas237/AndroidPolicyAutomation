// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.content.*;
import androidx.work.Logger;

// Referenced classes of package androidx.work.impl.utils:
//			ForceStopRunnable

public static class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(((Object) (intent.getAction()))))
	//*   0    0:aload_2         
	//*   1    1:ifnull          35
	//*   2    4:ldc1            #33  <String "ACTION_FORCE_STOP_RESCHEDULE">
	//*   3    6:aload_2         
	//*   4    7:invokevirtual   #39  <Method String Intent.getAction()>
	//*   5   10:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*   6   13:ifeq            35
		{
			Logger.get().verbose(TAG, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
	//    7   16:invokestatic    #49  <Method Logger Logger.get()>
	//    8   19:getstatic       #25  <Field String TAG>
	//    9   22:ldc1            #51  <String "Rescheduling alarm that keeps track of force-stops.">
	//   10   24:iconst_0        
	//   11   25:anewarray       Throwable[]
	//   12   28:invokevirtual   #57  <Method void Logger.verbose(String, String, Throwable[])>
			ForceStopRunnable.setAlarm(context);
	//   13   31:aload_1         
	//   14   32:invokestatic    #61  <Method void ForceStopRunnable.setAlarm(Context)>
		}
	//   15   35:return          
	}

	private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");

	static 
	{
	//    0    0:ldc1            #17  <String "ForceStopRunnable$Rcvr">
	//    1    2:invokestatic    #23  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #25  <Field String TAG>
	//*   3    8:return          
	}

	public ForceStopRunnable$BroadcastReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void BroadcastReceiver()>
	//    2    4:return          
	}
}
