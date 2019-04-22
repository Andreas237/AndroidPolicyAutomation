// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.arch.lifecycle.LifecycleService;
import android.content.Intent;
import androidx.work.Logger;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			SystemAlarmDispatcher

public class SystemAlarmService extends LifecycleService
	implements SystemAlarmDispatcher.CommandsCompletedListener
{

	public SystemAlarmService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void LifecycleService()>
	//    2    4:return          
	}

	public void onAllCommandsCompleted()
	{
		Logger.debug("SystemAlarmService", "All commands completed in dispatcher", new Throwable[0]);
	//    0    0:ldc1            #21  <String "SystemAlarmService">
	//    1    2:ldc1            #23  <String "All commands completed in dispatcher">
	//    2    4:iconst_0        
	//    3    5:anewarray       Throwable[]
	//    4    8:invokestatic    #31  <Method void Logger.debug(String, String, Throwable[])>
		stopSelf();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #34  <Method void stopSelf()>
	//    7   15:return          
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void LifecycleService.onCreate()>
		mDispatcher = new SystemAlarmDispatcher(((android.content.Context) (this)));
	//    2    4:aload_0         
	//    3    5:new             #40  <Class SystemAlarmDispatcher>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #43  <Method void SystemAlarmDispatcher(android.content.Context)>
	//    7   13:putfield        #45  <Field SystemAlarmDispatcher mDispatcher>
		mDispatcher.setCompletedListener(((SystemAlarmDispatcher.CommandsCompletedListener) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field SystemAlarmDispatcher mDispatcher>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #49  <Method void SystemAlarmDispatcher.setCompletedListener(SystemAlarmDispatcher$CommandsCompletedListener)>
	//   12   24:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void LifecycleService.onDestroy()>
		mDispatcher.onDestroy();
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field SystemAlarmDispatcher mDispatcher>
	//    4    8:invokevirtual   #53  <Method void SystemAlarmDispatcher.onDestroy()>
	//    5   11:return          
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		super.onStartCommand(intent, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #57  <Method int LifecycleService.onStartCommand(Intent, int, int)>
	//    5    7:pop             
		if(intent != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          22
			mDispatcher.add(intent, j);
	//    8   12:aload_0         
	//    9   13:getfield        #45  <Field SystemAlarmDispatcher mDispatcher>
	//   10   16:aload_1         
	//   11   17:iload_3         
	//   12   18:invokevirtual   #61  <Method boolean SystemAlarmDispatcher.add(Intent, int)>
	//   13   21:pop             
		return 1;
	//   14   22:iconst_1        
	//   15   23:ireturn         
	}

	private SystemAlarmDispatcher mDispatcher;
}
