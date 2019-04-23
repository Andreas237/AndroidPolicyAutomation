// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.Bundle;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobInvocation, RetryStrategy, JobTrigger, TriggerReason

static final class JobInvocation$Builder
{

	public JobInvocation$Builder addExtras(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			extras.putAll(bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Bundle extras>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #78  <Method void Bundle.putAll(Bundle)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	JobInvocation build()
	{
		if(tag != null && service != null && trigger != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field String tag>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:getfield        #43  <Field String service>
	//*   5   11:ifnull          31
	//*   6   14:aload_0         
	//*   7   15:getfield        #47  <Field JobTrigger trigger>
	//*   8   18:ifnull          31
			return new JobInvocation(this, ((JobInvocation._cls1) (null)));
	//    9   21:new             #6   <Class JobInvocation>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:invokespecial   #83  <Method void JobInvocation(JobInvocation$Builder, JobInvocation$1)>
	//   14   30:areturn         
		else
			throw new IllegalArgumentException("Required fields were not populated.");
	//   15   31:new             #85  <Class IllegalArgumentException>
	//   16   34:dup             
	//   17   35:ldc1            #87  <String "Required fields were not populated.">
	//   18   37:invokespecial   #90  <Method void IllegalArgumentException(String)>
	//   19   40:athrow          
	}

	public JobInvocation$Builder setConstraints(int ai[])
	{
		constraints = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field int[] constraints>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JobInvocation$Builder setLifetime(int i)
	{
		lifetime = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int lifetime>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JobInvocation$Builder setRecurring(boolean flag)
	{
		recurring = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field boolean recurring>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JobInvocation$Builder setReplaceCurrent(boolean flag)
	{
		replaceCurrent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field boolean replaceCurrent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JobInvocation$Builder setRetryStrategy(RetryStrategy retrystrategy)
	{
		retryStrategy = retrystrategy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field RetryStrategy retryStrategy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JobInvocation$Builder setService(String s)
	{
		service = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String service>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JobInvocation$Builder setTag(String s)
	{
		tag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String tag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JobInvocation$Builder setTrigger(JobTrigger jobtrigger)
	{
		trigger = jobtrigger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field JobTrigger trigger>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JobInvocation$Builder setTriggerReason(TriggerReason triggerreason)
	{
		triggerReason = triggerreason;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field TriggerReason triggerReason>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private int constraints[];
	private final Bundle extras = new Bundle();
	private int lifetime;
	private boolean recurring;
	private boolean replaceCurrent;
	private RetryStrategy retryStrategy;
	private String service;
	private String tag;
	private JobTrigger trigger;
	private TriggerReason triggerReason;


/*
	static String access$000(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.tag;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String tag>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.service;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String service>
	//    2    4:areturn         
	}

*/


/*
	static JobTrigger access$200(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.trigger;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field JobTrigger trigger>
	//    2    4:areturn         
	}

*/


/*
	static RetryStrategy access$300(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.retryStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RetryStrategy retryStrategy>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$400(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.recurring;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean recurring>
	//    2    4:ireturn         
	}

*/


/*
	static int access$500(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.lifetime;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int lifetime>
	//    2    4:ireturn         
	}

*/


/*
	static int[] access$600(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.constraints;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int[] constraints>
	//    2    4:areturn         
	}

*/


/*
	static Bundle access$700(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.extras;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Bundle extras>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$800(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.replaceCurrent;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field boolean replaceCurrent>
	//    2    4:ireturn         
	}

*/


/*
	static TriggerReason access$900(JobInvocation$Builder jobinvocation$builder)
	{
		return jobinvocation$builder.triggerReason;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field TriggerReason triggerReason>
	//    2    4:areturn         
	}

*/

	JobInvocation$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Bundle()>
	//    6   12:putfield        #35  <Field Bundle extras>
	//    7   15:return          
	}
}
