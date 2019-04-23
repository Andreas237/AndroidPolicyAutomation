// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;


// Referenced classes of package androidx.work.impl.background.systemalarm:
//			SystemAlarmDispatcher

static class SystemAlarmDispatcher$DequeueAndCheckForCompletion
	implements Runnable
{

	public void run()
	{
		mDispatcher.dequeueAndCheckForCompletion();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SystemAlarmDispatcher mDispatcher>
	//    2    4:invokevirtual   #25  <Method void SystemAlarmDispatcher.dequeueAndCheckForCompletion()>
	//    3    7:return          
	}

	private final SystemAlarmDispatcher mDispatcher;

	SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher systemalarmdispatcher)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mDispatcher = systemalarmdispatcher;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field SystemAlarmDispatcher mDispatcher>
	//    5    9:return          
	}
}
