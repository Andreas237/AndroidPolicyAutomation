// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import java.util.concurrent.TimeUnit;

// Referenced classes of package androidx.work.impl.utils:
//			Preferences

public class ForceStopRunnable
	implements Runnable
{
	public static class BroadcastReceiver extends android.content.BroadcastReceiver
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

		public BroadcastReceiver()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void android.content.BroadcastReceiver()>
		//    2    4:return          
		}
	}


	public ForceStopRunnable(Context context, WorkManagerImpl workmanagerimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #65  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #67  <Field Context mContext>
		mWorkManager = workmanagerimpl;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #69  <Field WorkManagerImpl mWorkManager>
	//    9   17:return          
	}

	static Intent getIntent(Context context)
	{
		Intent intent = new Intent();
	//    0    0:new             #74  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void Intent()>
	//    3    7:astore_1        
		intent.setComponent(new ComponentName(context, androidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver));
	//    4    8:aload_1         
	//    5    9:new             #77  <Class ComponentName>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:ldc1            #8   <Class ForceStopRunnable$BroadcastReceiver>
	//    9   16:invokespecial   #80  <Method void ComponentName(Context, Class)>
	//   10   19:invokevirtual   #84  <Method Intent Intent.setComponent(ComponentName)>
	//   11   22:pop             
		intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
	//   12   23:aload_1         
	//   13   24:ldc1            #16  <String "ACTION_FORCE_STOP_RESCHEDULE">
	//   14   26:invokevirtual   #88  <Method Intent Intent.setAction(String)>
	//   15   29:pop             
		return intent;
	//   16   30:aload_1         
	//   17   31:areturn         
	}

	private static PendingIntent getPendingIntent(Context context, int i)
	{
		return PendingIntent.getBroadcast(context, -1, getIntent(context), i);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:aload_0         
	//    3    3:invokestatic    #93  <Method Intent getIntent(Context)>
	//    4    6:iload_1         
	//    5    7:invokestatic    #99  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//    6   10:areturn         
	}

	static void setAlarm(Context context)
	{
		AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
	//    0    0:aload_0         
	//    1    1:ldc1            #103 <String "alarm">
	//    2    3:invokevirtual   #107 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #109 <Class AlarmManager>
	//    4    9:astore_3        
		context = ((Context) (getPendingIntent(context, 0x8000000)));
	//    5   10:aload_0         
	//    6   11:ldc1            #110 <Int 0x8000000>
	//    7   13:invokestatic    #112 <Method PendingIntent getPendingIntent(Context, int)>
	//    8   16:astore_0        
		long l = System.currentTimeMillis() + TEN_YEARS;
	//    9   17:invokestatic    #118 <Method long System.currentTimeMillis()>
	//   10   20:getstatic       #53  <Field long TEN_YEARS>
	//   11   23:ladd            
	//   12   24:lstore_1        
		if(alarmmanager != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          52
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  15   29:getstatic       #123 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   32:bipush          19
	//*  17   34:icmplt          45
			{
				alarmmanager.setExact(0, l, ((PendingIntent) (context)));
	//   18   37:aload_3         
	//   19   38:iconst_0        
	//   20   39:lload_1         
	//   21   40:aload_0         
	//   22   41:invokevirtual   #127 <Method void AlarmManager.setExact(int, long, PendingIntent)>
				return;
	//   23   44:return          
			}
			alarmmanager.set(0, l, ((PendingIntent) (context)));
	//   24   45:aload_3         
	//   25   46:iconst_0        
	//   26   47:lload_1         
	//   27   48:aload_0         
	//   28   49:invokevirtual   #130 <Method void AlarmManager.set(int, long, PendingIntent)>
		}
	//   29   52:return          
	}

	public boolean isForceStopped()
	{
		if(getPendingIntent(mContext, 0x20000000) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field Context mContext>
	//*   2    4:ldc1            #133 <Int 0x20000000>
	//*   3    6:invokestatic    #112 <Method PendingIntent getPendingIntent(Context, int)>
	//*   4    9:ifnonnull       21
		{
			setAlarm(mContext);
	//    5   12:aload_0         
	//    6   13:getfield        #67  <Field Context mContext>
	//    7   16:invokestatic    #135 <Method void setAlarm(Context)>
			return true;
	//    8   19:iconst_1        
	//    9   20:ireturn         
		} else
		{
			return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
		}
	}

	public void run()
	{
		if(shouldRescheduleWorkers())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method boolean shouldRescheduleWorkers()>
	//*   2    4:ifeq            43
		{
			Logger.get().debug(TAG, "Rescheduling Workers.", new Throwable[0]);
	//    3    7:invokestatic    #143 <Method Logger Logger.get()>
	//    4   10:getstatic       #39  <Field String TAG>
	//    5   13:ldc1            #145 <String "Rescheduling Workers.">
	//    6   15:iconst_0        
	//    7   16:anewarray       Throwable[]
	//    8   19:invokevirtual   #151 <Method void Logger.debug(String, String, Throwable[])>
			mWorkManager.rescheduleEligibleWork();
	//    9   22:aload_0         
	//   10   23:getfield        #69  <Field WorkManagerImpl mWorkManager>
	//   11   26:invokevirtual   #156 <Method void WorkManagerImpl.rescheduleEligibleWork()>
			mWorkManager.getPreferences().setNeedsReschedule(false);
	//   12   29:aload_0         
	//   13   30:getfield        #69  <Field WorkManagerImpl mWorkManager>
	//   14   33:invokevirtual   #160 <Method Preferences WorkManagerImpl.getPreferences()>
	//   15   36:iconst_0        
	//   16   37:invokevirtual   #166 <Method void Preferences.setNeedsReschedule(boolean)>
		} else
	//*  17   40:goto            72
		if(isForceStopped())
	//*  18   43:aload_0         
	//*  19   44:invokevirtual   #168 <Method boolean isForceStopped()>
	//*  20   47:ifeq            72
		{
			Logger.get().debug(TAG, "Application was force-stopped, rescheduling.", new Throwable[0]);
	//   21   50:invokestatic    #143 <Method Logger Logger.get()>
	//   22   53:getstatic       #39  <Field String TAG>
	//   23   56:ldc1            #170 <String "Application was force-stopped, rescheduling.">
	//   24   58:iconst_0        
	//   25   59:anewarray       Throwable[]
	//   26   62:invokevirtual   #151 <Method void Logger.debug(String, String, Throwable[])>
			mWorkManager.rescheduleEligibleWork();
	//   27   65:aload_0         
	//   28   66:getfield        #69  <Field WorkManagerImpl mWorkManager>
	//   29   69:invokevirtual   #156 <Method void WorkManagerImpl.rescheduleEligibleWork()>
		}
		mWorkManager.onForceStopRunnableCompleted();
	//   30   72:aload_0         
	//   31   73:getfield        #69  <Field WorkManagerImpl mWorkManager>
	//   32   76:invokevirtual   #173 <Method void WorkManagerImpl.onForceStopRunnableCompleted()>
	//   33   79:return          
	}

	boolean shouldRescheduleWorkers()
	{
		return mWorkManager.getPreferences().needsReschedule();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field WorkManagerImpl mWorkManager>
	//    2    4:invokevirtual   #160 <Method Preferences WorkManagerImpl.getPreferences()>
	//    3    7:invokevirtual   #176 <Method boolean Preferences.needsReschedule()>
	//    4   10:ireturn         
	}

	static final String ACTION_FORCE_STOP_RESCHEDULE = "ACTION_FORCE_STOP_RESCHEDULE";
	private static final int ALARM_ID = -1;
	private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable");
	private static final long TEN_YEARS;
	private final Context mContext;
	private final WorkManagerImpl mWorkManager;

	static 
	{
	//    0    0:ldc1            #31  <String "ForceStopRunnable">
	//    1    2:invokestatic    #37  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #39  <Field String TAG>
		TEN_YEARS = TimeUnit.DAYS.toMillis(3650L);
	//    3    8:getstatic       #45  <Field TimeUnit TimeUnit.DAYS>
	//    4   11:ldc2w           #46  <Long 3650L>
	//    5   14:invokevirtual   #51  <Method long TimeUnit.toMillis(long)>
	//    6   17:putstatic       #53  <Field long TEN_YEARS>
	//*   7   20:return          
	}
}
