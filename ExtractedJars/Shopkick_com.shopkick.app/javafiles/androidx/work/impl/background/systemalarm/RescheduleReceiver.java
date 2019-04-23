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
	//    1    1:invokespecial   #22  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          41
		{
			context = ((Context) (WorkManagerImpl.getInstance()));
	//    3    8:invokestatic    #36  <Method WorkManagerImpl WorkManagerImpl.getInstance()>
	//    4   11:astore_1        
			if(context == null)
	//*   5   12:aload_1         
	//*   6   13:ifnonnull       32
			{
				Logger.get().error(TAG, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
	//    7   16:invokestatic    #40  <Method Logger Logger.get()>
	//    8   19:getstatic       #18  <Field String TAG>
	//    9   22:ldc1            #42  <String "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().">
	//   10   24:iconst_0        
	//   11   25:anewarray       Throwable[]
	//   12   28:invokevirtual   #48  <Method void Logger.error(String, String, Throwable[])>
				return;
	//   13   31:return          
			} else
			{
				((WorkManagerImpl) (context)).setReschedulePendingResult(goAsync());
	//   14   32:aload_1         
	//   15   33:aload_0         
	//   16   34:invokevirtual   #52  <Method android.content.BroadcastReceiver$PendingResult goAsync()>
	//   17   37:invokevirtual   #56  <Method void WorkManagerImpl.setReschedulePendingResult(android.content.BroadcastReceiver$PendingResult)>
				return;
	//   18   40:return          
			}
		} else
		{
			context.startService(CommandHandler.createRescheduleIntent(context));
	//   19   41:aload_1         
	//   20   42:aload_1         
	//   21   43:invokestatic    #62  <Method Intent CommandHandler.createRescheduleIntent(Context)>
	//   22   46:invokevirtual   #68  <Method android.content.ComponentName Context.startService(Intent)>
	//   23   49:pop             
			return;
	//   24   50:return          
		}
	}

	private static final String TAG = Logger.tagWithPrefix("RescheduleReceiver");

	static 
	{
	//    0    0:ldc1            #10  <String "RescheduleReceiver">
	//    1    2:invokestatic    #16  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #18  <Field String TAG>
	//*   3    8:return          
	}
}
