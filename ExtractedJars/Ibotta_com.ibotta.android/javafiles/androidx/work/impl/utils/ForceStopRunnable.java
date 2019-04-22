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

		public BroadcastReceiver()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void android.content.BroadcastReceiver()>
		//    2    4:return          
		}
	}


	public ForceStopRunnable(Context context, WorkManagerImpl workmanagerimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #47  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #49  <Field Context mContext>
		mWorkManager = workmanagerimpl;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #51  <Field WorkManagerImpl mWorkManager>
	//    9   17:return          
	}

	static Intent getIntent(Context context)
	{
		Intent intent = new Intent();
	//    0    0:new             #57  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Intent()>
	//    3    7:astore_1        
		intent.setComponent(new ComponentName(context, androidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver));
	//    4    8:aload_1         
	//    5    9:new             #60  <Class ComponentName>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:ldc1            #8   <Class ForceStopRunnable$BroadcastReceiver>
	//    9   16:invokespecial   #63  <Method void ComponentName(Context, Class)>
	//   10   19:invokevirtual   #67  <Method Intent Intent.setComponent(ComponentName)>
	//   11   22:pop             
		intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
	//   12   23:aload_1         
	//   13   24:ldc1            #69  <String "ACTION_FORCE_STOP_RESCHEDULE">
	//   14   26:invokevirtual   #73  <Method Intent Intent.setAction(String)>
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
	//    3    3:invokestatic    #78  <Method Intent getIntent(Context)>
	//    4    6:iload_1         
	//    5    7:invokestatic    #84  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//    6   10:areturn         
	}

	static void setAlarm(Context context)
	{
		AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
	//    0    0:aload_0         
	//    1    1:ldc1            #88  <String "alarm">
	//    2    3:invokevirtual   #92  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #94  <Class AlarmManager>
	//    4    9:astore_3        
		context = ((Context) (getPendingIntent(context, 0x8000000)));
	//    5   10:aload_0         
	//    6   11:ldc1            #95  <Int 0x8000000>
	//    7   13:invokestatic    #97  <Method PendingIntent getPendingIntent(Context, int)>
	//    8   16:astore_0        
		long l = System.currentTimeMillis() + TEN_YEARS;
	//    9   17:invokestatic    #103 <Method long System.currentTimeMillis()>
	//   10   20:getstatic       #35  <Field long TEN_YEARS>
	//   11   23:ladd            
	//   12   24:lstore_1        
		if(alarmmanager != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          52
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  15   29:getstatic       #109 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   32:bipush          19
	//*  17   34:icmplt          45
			{
				alarmmanager.setExact(0, l, ((PendingIntent) (context)));
	//   18   37:aload_3         
	//   19   38:iconst_0        
	//   20   39:lload_1         
	//   21   40:aload_0         
	//   22   41:invokevirtual   #113 <Method void AlarmManager.setExact(int, long, PendingIntent)>
				return;
	//   23   44:return          
			}
			alarmmanager.set(0, l, ((PendingIntent) (context)));
	//   24   45:aload_3         
	//   25   46:iconst_0        
	//   26   47:lload_1         
	//   27   48:aload_0         
	//   28   49:invokevirtual   #116 <Method void AlarmManager.set(int, long, PendingIntent)>
		}
	//   29   52:return          
	}

	public boolean isForceStopped()
	{
		if(getPendingIntent(mContext, 0x20000000) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field Context mContext>
	//*   2    4:ldc1            #119 <Int 0x20000000>
	//*   3    6:invokestatic    #97  <Method PendingIntent getPendingIntent(Context, int)>
	//*   4    9:ifnonnull       21
		{
			setAlarm(mContext);
	//    5   12:aload_0         
	//    6   13:getfield        #49  <Field Context mContext>
	//    7   16:invokestatic    #121 <Method void setAlarm(Context)>
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
	//*   1    1:invokevirtual   #125 <Method boolean shouldRescheduleWorkers()>
	//*   2    4:ifeq            39
		{
			Logger.debug("ForceStopRunnable", "Rescheduling Workers.", new Throwable[0]);
	//    3    7:ldc1            #127 <String "ForceStopRunnable">
	//    4    9:ldc1            #129 <String "Rescheduling Workers.">
	//    5   11:iconst_0        
	//    6   12:anewarray       Throwable[]
	//    7   15:invokestatic    #137 <Method void Logger.debug(String, String, Throwable[])>
			mWorkManager.rescheduleEligibleWork();
	//    8   18:aload_0         
	//    9   19:getfield        #51  <Field WorkManagerImpl mWorkManager>
	//   10   22:invokevirtual   #142 <Method void WorkManagerImpl.rescheduleEligibleWork()>
			mWorkManager.getPreferences().setNeedsReschedule(false);
	//   11   25:aload_0         
	//   12   26:getfield        #51  <Field WorkManagerImpl mWorkManager>
	//   13   29:invokevirtual   #146 <Method Preferences WorkManagerImpl.getPreferences()>
	//   14   32:iconst_0        
	//   15   33:invokevirtual   #152 <Method void Preferences.setNeedsReschedule(boolean)>
		} else
	//*  16   36:goto            64
		if(isForceStopped())
	//*  17   39:aload_0         
	//*  18   40:invokevirtual   #154 <Method boolean isForceStopped()>
	//*  19   43:ifeq            64
		{
			Logger.debug("ForceStopRunnable", "Application was force-stopped, rescheduling.", new Throwable[0]);
	//   20   46:ldc1            #127 <String "ForceStopRunnable">
	//   21   48:ldc1            #156 <String "Application was force-stopped, rescheduling.">
	//   22   50:iconst_0        
	//   23   51:anewarray       Throwable[]
	//   24   54:invokestatic    #137 <Method void Logger.debug(String, String, Throwable[])>
			mWorkManager.rescheduleEligibleWork();
	//   25   57:aload_0         
	//   26   58:getfield        #51  <Field WorkManagerImpl mWorkManager>
	//   27   61:invokevirtual   #142 <Method void WorkManagerImpl.rescheduleEligibleWork()>
		}
		mWorkManager.onForceStopRunnableCompleted();
	//   28   64:aload_0         
	//   29   65:getfield        #51  <Field WorkManagerImpl mWorkManager>
	//   30   68:invokevirtual   #159 <Method void WorkManagerImpl.onForceStopRunnableCompleted()>
	//   31   71:return          
	}

	boolean shouldRescheduleWorkers()
	{
		return mWorkManager.getPreferences().needsReschedule();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field WorkManagerImpl mWorkManager>
	//    2    4:invokevirtual   #146 <Method Preferences WorkManagerImpl.getPreferences()>
	//    3    7:invokevirtual   #162 <Method boolean Preferences.needsReschedule()>
	//    4   10:ireturn         
	}

	private static final long TEN_YEARS;
	private final Context mContext;
	private final WorkManagerImpl mWorkManager;

	static 
	{
		TEN_YEARS = TimeUnit.DAYS.toMillis(3650L);
	//    0    0:getstatic       #27  <Field TimeUnit TimeUnit.DAYS>
	//    1    3:ldc2w           #28  <Long 3650L>
	//    2    6:invokevirtual   #33  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #35  <Field long TEN_YEARS>
	//*   4   12:return          
	}
}
