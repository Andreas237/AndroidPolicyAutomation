// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.Intent;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			SystemAlarmDispatcher

static class SystemAlarmDispatcher$AddRunnable
	implements Runnable
{

	public void run()
	{
		mDispatcher.add(mIntent, mStartId);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SystemAlarmDispatcher mDispatcher>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Intent mIntent>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field int mStartId>
	//    6   12:invokevirtual   #34  <Method boolean SystemAlarmDispatcher.add(Intent, int)>
	//    7   15:pop             
	//    8   16:return          
	}

	private final SystemAlarmDispatcher mDispatcher;
	private final Intent mIntent;
	private final int mStartId;

	SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher systemalarmdispatcher, Intent intent, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mDispatcher = systemalarmdispatcher;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field SystemAlarmDispatcher mDispatcher>
		mIntent = intent;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Intent mIntent>
		mStartId = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #27  <Field int mStartId>
	//   11   19:return          
	}
}
