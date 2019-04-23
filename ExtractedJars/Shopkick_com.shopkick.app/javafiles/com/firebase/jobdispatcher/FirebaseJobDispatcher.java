// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import java.lang.annotation.Annotation;

// Referenced classes of package com.firebase.jobdispatcher:
//			ValidationEnforcer, Driver, Job, RetryStrategy

public final class FirebaseJobDispatcher
{
	public static interface CancelResult
		extends Annotation
	{
	}

	public static final class ScheduleFailedException extends RuntimeException
	{

		public ScheduleFailedException()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void RuntimeException()>
		//    2    4:return          
		}
	}

	public static interface ScheduleResult
		extends Annotation
	{
	}


	public FirebaseJobDispatcher(Driver driver1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		driver = driver1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Driver driver>
		validator = new ValidationEnforcer(driver1.getValidator());
	//    5    9:aload_0         
	//    6   10:new             #42  <Class ValidationEnforcer>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokeinterface #48  <Method JobValidator Driver.getValidator()>
	//   10   20:invokespecial   #51  <Method void ValidationEnforcer(JobValidator)>
	//   11   23:putfield        #53  <Field ValidationEnforcer validator>
		retryStrategyBuilder = new RetryStrategy.Builder(validator);
	//   12   26:aload_0         
	//   13   27:new             #55  <Class RetryStrategy$Builder>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:getfield        #53  <Field ValidationEnforcer validator>
	//   17   35:invokespecial   #58  <Method void RetryStrategy$Builder(ValidationEnforcer)>
	//   18   38:putfield        #60  <Field RetryStrategy$Builder retryStrategyBuilder>
	//   19   41:return          
	}

	public int cancel(String s)
	{
		if(!driver.isAvailable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Driver driver>
	//*   2    4:invokeinterface #68  <Method boolean Driver.isAvailable()>
	//*   3    9:ifne            14
			return 2;
	//    4   12:iconst_2        
	//    5   13:ireturn         
		else
			return driver.cancel(s);
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field Driver driver>
	//    8   18:aload_1         
	//    9   19:invokeinterface #70  <Method int Driver.cancel(String)>
	//   10   24:ireturn         
	}

	public int cancelAll()
	{
		if(!driver.isAvailable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Driver driver>
	//*   2    4:invokeinterface #68  <Method boolean Driver.isAvailable()>
	//*   3    9:ifne            14
			return 2;
	//    4   12:iconst_2        
	//    5   13:ireturn         
		else
			return driver.cancelAll();
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field Driver driver>
	//    8   18:invokeinterface #75  <Method int Driver.cancelAll()>
	//    9   23:ireturn         
	}

	public ValidationEnforcer getValidator()
	{
		return validator;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ValidationEnforcer validator>
	//    2    4:areturn         
	}

	public void mustSchedule(Job job)
	{
		if(schedule(job) == 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #82  <Method int schedule(Job)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		else
			throw new ScheduleFailedException();
	//    5    9:new             #9   <Class FirebaseJobDispatcher$ScheduleFailedException>
	//    6   12:dup             
	//    7   13:invokespecial   #83  <Method void FirebaseJobDispatcher$ScheduleFailedException()>
	//    8   16:athrow          
	}

	public Job.Builder newJobBuilder()
	{
		return new Job.Builder(validator);
	//    0    0:new             #87  <Class Job$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ValidationEnforcer validator>
	//    4    8:invokespecial   #88  <Method void Job$Builder(ValidationEnforcer)>
	//    5   11:areturn         
	}

	public RetryStrategy newRetryStrategy(int i, int j, int k)
	{
		return retryStrategyBuilder.build(i, j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field RetryStrategy$Builder retryStrategyBuilder>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #94  <Method RetryStrategy RetryStrategy$Builder.build(int, int, int)>
	//    6   10:areturn         
	}

	public int schedule(Job job)
	{
		if(!driver.isAvailable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Driver driver>
	//*   2    4:invokeinterface #68  <Method boolean Driver.isAvailable()>
	//*   3    9:ifne            14
			return 2;
	//    4   12:iconst_2        
	//    5   13:ireturn         
		else
			return driver.schedule(job);
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field Driver driver>
	//    8   18:aload_1         
	//    9   19:invokeinterface #95  <Method int Driver.schedule(Job)>
	//   10   24:ireturn         
	}

	public static final int CANCEL_RESULT_NO_DRIVER_AVAILABLE = 2;
	public static final int CANCEL_RESULT_SUCCESS = 0;
	public static final int CANCEL_RESULT_UNKNOWN_ERROR = 1;
	public static final int SCHEDULE_RESULT_BAD_SERVICE = 4;
	public static final int SCHEDULE_RESULT_NO_DRIVER_AVAILABLE = 2;
	public static final int SCHEDULE_RESULT_SUCCESS = 0;
	public static final int SCHEDULE_RESULT_UNKNOWN_ERROR = 1;
	public static final int SCHEDULE_RESULT_UNSUPPORTED_TRIGGER = 3;
	private final Driver driver;
	private final RetryStrategy.Builder retryStrategyBuilder;
	private final ValidationEnforcer validator;
}
