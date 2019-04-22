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
	//    1    1:invokespecial   #18  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #26  <Field Context mContext>
	//    6   12:return          
	}

	private void scheduleWorkSpec(WorkSpec workspec)
	{
		Logger.debug("SystemAlarmScheduler", String.format("Scheduling work with workSpecId %s", new Object[] {
			workspec.id
		}), new Throwable[0]);
	//    0    0:ldc1            #32  <String "SystemAlarmScheduler">
	//    1    2:ldc1            #34  <String "Scheduling work with workSpecId %s">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:getfield        #40  <Field String WorkSpec.id>
	//    8   14:aastore         
	//    9   15:invokestatic    #46  <Method String String.format(String, Object[])>
	//   10   18:iconst_0        
	//   11   19:anewarray       Throwable[]
	//   12   22:invokestatic    #54  <Method void Logger.debug(String, String, Throwable[])>
		workspec = ((WorkSpec) (CommandHandler.createScheduleWorkIntent(mContext, workspec.id)));
	//   13   25:aload_0         
	//   14   26:getfield        #26  <Field Context mContext>
	//   15   29:aload_1         
	//   16   30:getfield        #40  <Field String WorkSpec.id>
	//   17   33:invokestatic    #60  <Method android.content.Intent CommandHandler.createScheduleWorkIntent(Context, String)>
	//   18   36:astore_1        
		mContext.startService(((android.content.Intent) (workspec)));
	//   19   37:aload_0         
	//   20   38:getfield        #26  <Field Context mContext>
	//   21   41:aload_1         
	//   22   42:invokevirtual   #64  <Method android.content.ComponentName Context.startService(android.content.Intent)>
	//   23   45:pop             
	//   24   46:return          
	}

	public void cancel(String s)
	{
		s = ((String) (CommandHandler.createStopWorkIntent(mContext, s)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Context mContext>
	//    2    4:aload_1         
	//    3    5:invokestatic    #69  <Method android.content.Intent CommandHandler.createStopWorkIntent(Context, String)>
	//    4    8:astore_1        
		mContext.startService(((android.content.Intent) (s)));
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field Context mContext>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #64  <Method android.content.ComponentName Context.startService(android.content.Intent)>
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
	//   12   14:invokespecial   #73  <Method void scheduleWorkSpec(WorkSpec)>

	//   13   17:iload_2         
	//   14   18:iconst_1        
	//   15   19:iadd            
	//   16   20:istore_2        
	//*  17   21:goto            5
	//   18   24:return          
	}

	private final Context mContext;
}
