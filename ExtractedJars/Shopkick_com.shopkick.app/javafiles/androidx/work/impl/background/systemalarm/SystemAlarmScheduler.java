// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			CommandHandler

public class SystemAlarmScheduler
	implements Scheduler
{

	public SystemAlarmScheduler(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #38  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #40  <Field Context mContext>
	//    6   12:return          
	}

	private void scheduleWorkSpec(WorkSpec workspec)
	{
		Logger.get().debug(TAG, String.format("Scheduling work with workSpecId %s", new Object[] {
			workspec.id
		}), new Throwable[0]);
	//    0    0:invokestatic    #47  <Method Logger Logger.get()>
	//    1    3:getstatic       #26  <Field String TAG>
	//    2    6:ldc1            #49  <String "Scheduling work with workSpecId %s">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_1         
	//    8   15:getfield        #54  <Field String WorkSpec.id>
	//    9   18:aastore         
	//   10   19:invokestatic    #60  <Method String String.format(String, Object[])>
	//   11   22:iconst_0        
	//   12   23:anewarray       Throwable[]
	//   13   26:invokevirtual   #66  <Method void Logger.debug(String, String, Throwable[])>
		workspec = ((WorkSpec) (CommandHandler.createScheduleWorkIntent(mContext, workspec.id)));
	//   14   29:aload_0         
	//   15   30:getfield        #40  <Field Context mContext>
	//   16   33:aload_1         
	//   17   34:getfield        #54  <Field String WorkSpec.id>
	//   18   37:invokestatic    #72  <Method android.content.Intent CommandHandler.createScheduleWorkIntent(Context, String)>
	//   19   40:astore_1        
		mContext.startService(((android.content.Intent) (workspec)));
	//   20   41:aload_0         
	//   21   42:getfield        #40  <Field Context mContext>
	//   22   45:aload_1         
	//   23   46:invokevirtual   #76  <Method android.content.ComponentName Context.startService(android.content.Intent)>
	//   24   49:pop             
	//   25   50:return          
	}

	public void cancel(String s)
	{
		s = ((String) (CommandHandler.createStopWorkIntent(mContext, s)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Context mContext>
	//    2    4:aload_1         
	//    3    5:invokestatic    #81  <Method android.content.Intent CommandHandler.createStopWorkIntent(Context, String)>
	//    4    8:astore_1        
		mContext.startService(((android.content.Intent) (s)));
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field Context mContext>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #76  <Method android.content.ComponentName Context.startService(android.content.Intent)>
	//    9   17:pop             
	//   10   18:return          
	}

	public transient void schedule(WorkSpec aworkspec[])
	{
		int j = aworkspec.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          24
			scheduleWorkSpec(aworkspec[i]);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:invokespecial   #85  <Method void scheduleWorkSpec(WorkSpec)>

	//   13   17:iload_2         
	//   14   18:iconst_1        
	//   15   19:iadd            
	//   16   20:istore_2        
	//*  17   21:goto            5
	//   18   24:return          
	}

	private static final String TAG = Logger.tagWithPrefix("SystemAlarmScheduler");
	private final Context mContext;

	static 
	{
	//    0    0:ldc1            #18  <String "SystemAlarmScheduler">
	//    1    2:invokestatic    #24  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #26  <Field String TAG>
	//*   3    8:return          
	}
}
