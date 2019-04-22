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
	//*   1    1:ifnull          31
	//*   2    4:ldc1            #20  <String "ACTION_FORCE_STOP_RESCHEDULE">
	//*   3    6:aload_2         
	//*   4    7:invokevirtual   #26  <Method String Intent.getAction()>
	//*   5   10:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*   6   13:ifeq            31
		{
			Logger.verbose("ForceStopRunnable$Rcvr", "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
	//    7   16:ldc1            #34  <String "ForceStopRunnable$Rcvr">
	//    8   18:ldc1            #36  <String "Rescheduling alarm that keeps track of force-stops.">
	//    9   20:iconst_0        
	//   10   21:anewarray       Throwable[]
	//   11   24:invokestatic    #44  <Method void Logger.verbose(String, String, Throwable[])>
			ForceStopRunnable.setAlarm(context);
	//   12   27:aload_1         
	//   13   28:invokestatic    #48  <Method void ForceStopRunnable.setAlarm(Context)>
		}
	//   14   31:return          
	}

	public ForceStopRunnable$BroadcastReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BroadcastReceiver()>
	//    2    4:return          
	}
}
