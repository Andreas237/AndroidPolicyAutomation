// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.*;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			CommandHandler

public class RescheduleReceiver extends BroadcastReceiver
{

	public RescheduleReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          37
		{
			context = ((Context) (WorkManagerImpl.getInstance()));
	//    3    8:invokestatic    #23  <Method WorkManagerImpl WorkManagerImpl.getInstance()>
	//    4   11:astore_1        
			if(context == null)
	//*   5   12:aload_1         
	//*   6   13:ifnonnull       28
			{
				Logger.error("RescheduleReceiver", "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
	//    7   16:ldc1            #25  <String "RescheduleReceiver">
	//    8   18:ldc1            #27  <String "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().">
	//    9   20:iconst_0        
	//   10   21:anewarray       Throwable[]
	//   11   24:invokestatic    #35  <Method void Logger.error(String, String, Throwable[])>
				return;
	//   12   27:return          
			} else
			{
				((WorkManagerImpl) (context)).setReschedulePendingResult(goAsync());
	//   13   28:aload_1         
	//   14   29:aload_0         
	//   15   30:invokevirtual   #39  <Method android.content.BroadcastReceiver$PendingResult goAsync()>
	//   16   33:invokevirtual   #43  <Method void WorkManagerImpl.setReschedulePendingResult(android.content.BroadcastReceiver$PendingResult)>
				return;
	//   17   36:return          
			}
		} else
		{
			context.startService(CommandHandler.createRescheduleIntent(context));
	//   18   37:aload_1         
	//   19   38:aload_1         
	//   20   39:invokestatic    #49  <Method Intent CommandHandler.createRescheduleIntent(Context)>
	//   21   42:invokevirtual   #55  <Method android.content.ComponentName Context.startService(Intent)>
	//   22   45:pop             
			return;
	//   23   46:return          
		}
	}
}
