// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.scheduling;

import android.content.Context;

// Referenced classes of package com.birbit.android.jobqueue.scheduling:
//			SchedulerConstraint

public abstract class Scheduler
{
	public static interface Callback
	{

		public abstract boolean start(SchedulerConstraint schedulerconstraint);

		public abstract boolean stop(SchedulerConstraint schedulerconstraint);
	}


	protected Scheduler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public abstract void cancelAll();

	Context getApplicationContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context context>
	//    2    4:areturn         
	}

	public void init(Context context1, Callback callback1)
	{
		context = context1.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method Context Context.getApplicationContext()>
	//    3    5:putfield        #21  <Field Context context>
		callback = callback1;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #29  <Field Scheduler$Callback callback>
	//    7   13:return          
	}

	public abstract void onFinished(SchedulerConstraint schedulerconstraint, boolean flag);

	public abstract void request(SchedulerConstraint schedulerconstraint);

	public final boolean start(SchedulerConstraint schedulerconstraint)
	{
		if(callback == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Scheduler$Callback callback>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("JobManager callback is not configured");
	//    3    7:new             #37  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #39  <String "JobManager callback is not configured">
	//    6   13:invokespecial   #42  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return callback.start(schedulerconstraint);
	//    8   17:aload_0         
	//    9   18:getfield        #29  <Field Scheduler$Callback callback>
	//   10   21:aload_1         
	//   11   22:invokeinterface #44  <Method boolean Scheduler$Callback.start(SchedulerConstraint)>
	//   12   27:ireturn         
	}

	public final boolean stop(SchedulerConstraint schedulerconstraint)
	{
		if(callback == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Scheduler$Callback callback>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("JobManager callback is not configured");
	//    3    7:new             #37  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #39  <String "JobManager callback is not configured">
	//    6   13:invokespecial   #42  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return callback.stop(schedulerconstraint);
	//    8   17:aload_0         
	//    9   18:getfield        #29  <Field Scheduler$Callback callback>
	//   10   21:aload_1         
	//   11   22:invokeinterface #47  <Method boolean Scheduler$Callback.stop(SchedulerConstraint)>
	//   12   27:ireturn         
	}

	private Callback callback;
	private Context context;
}
