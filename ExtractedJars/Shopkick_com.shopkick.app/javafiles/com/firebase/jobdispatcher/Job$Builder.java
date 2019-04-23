// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.Bundle;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobParameters, Job, Trigger, RetryStrategy, 
//			ValidationEnforcer, JobTrigger, TriggerReason

public static final class Job$Builder
	implements JobParameters
{

	public Job$Builder addConstraint(int i)
	{
		int ai[] = constraints;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int[] constraints>
	//    2    4:astore_3        
		int j;
		if(ai == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			j = 1;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            19
			j = ai.length + 1;
	//    8   14:aload_3         
	//    9   15:arraylength     
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:istore_2        
		ai = new int[j];
	//   13   19:iload_2         
	//   14   20:newarray        int[]
	//   15   22:astore_3        
		int ai1[] = constraints;
	//   16   23:aload_0         
	//   17   24:getfield        #86  <Field int[] constraints>
	//   18   27:astore          4
		if(ai1 != null && ai1.length != 0)
	//*  19   29:aload           4
	//*  20   31:ifnull          51
	//*  21   34:aload           4
	//*  22   36:arraylength     
	//*  23   37:ifeq            51
			System.arraycopy(((Object) (ai1)), 0, ((Object) (ai)), 0, ai1.length);
	//   24   40:aload           4
	//   25   42:iconst_0        
	//   26   43:aload_3         
	//   27   44:iconst_0        
	//   28   45:aload           4
	//   29   47:arraylength     
	//   30   48:invokestatic    #120 <Method void System.arraycopy(Object, int, Object, int, int)>
		ai[ai.length - 1] = i;
	//   31   51:aload_3         
	//   32   52:aload_3         
	//   33   53:arraylength     
	//   34   54:iconst_1        
	//   35   55:isub            
	//   36   56:iload_1         
	//   37   57:iastore         
		constraints = ai;
	//   38   58:aload_0         
	//   39   59:aload_3         
	//   40   60:putfield        #86  <Field int[] constraints>
		return this;
	//   41   63:aload_0         
	//   42   64:areturn         
	}

	public Job build()
	{
		validator.ensureValid(((JobParameters) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ValidationEnforcer validator>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #128 <Method void ValidationEnforcer.ensureValid(JobParameters)>
		return new Job(this, ((Job._cls1) (null)));
	//    4    8:new             #8   <Class Job>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #131 <Method void Job(Job$Builder, Job$1)>
	//    9   17:areturn         
	}

	public int[] getConstraints()
	{
		int ai1[] = constraints;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int[] constraints>
	//    2    4:astore_2        
		int ai[] = ai1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(ai1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			ai = new int[0];
	//    7   11:iconst_0        
	//    8   12:newarray        int[]
	//    9   14:astore_1        
		return ai;
	//   10   15:aload_1         
	//   11   16:areturn         
	}

	public Bundle getExtras()
	{
		return extras;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Bundle extras>
	//    2    4:areturn         
	}

	public int getLifetime()
	{
		return lifetime;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int lifetime>
	//    2    4:ireturn         
	}

	public RetryStrategy getRetryStrategy()
	{
		return retryStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field RetryStrategy retryStrategy>
	//    2    4:areturn         
	}

	public String getService()
	{
		return serviceClassName;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String serviceClassName>
	//    2    4:areturn         
	}

	public String getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String tag>
	//    2    4:areturn         
	}

	public JobTrigger getTrigger()
	{
		return trigger;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field JobTrigger trigger>
	//    2    4:areturn         
	}

	public TriggerReason getTriggerReason()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isRecurring()
	{
		return recurring;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean recurring>
	//    2    4:ireturn         
	}

	public transient Job$Builder setConstraints(int ai[])
	{
		constraints = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field int[] constraints>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Job$Builder setExtras(Bundle bundle)
	{
		extras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field Bundle extras>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Job$Builder setLifetime(int i)
	{
		lifetime = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int lifetime>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Job$Builder setRecurring(boolean flag)
	{
		recurring = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean recurring>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Job$Builder setReplaceCurrent(boolean flag)
	{
		replaceCurrent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field boolean replaceCurrent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Job$Builder setRetryStrategy(RetryStrategy retrystrategy)
	{
		retryStrategy = retrystrategy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field RetryStrategy retryStrategy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Job$Builder setService(Class class1)
	{
		if(class1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			class1 = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            14
			class1 = ((Class) (class1.getName()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #153 <Method String Class.getName()>
	//    7   13:astore_1        
		serviceClassName = ((String) (class1));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #68  <Field String serviceClassName>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	Job$Builder setServiceName(String s)
	{
		serviceClassName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field String serviceClassName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Job$Builder setTag(String s)
	{
		tag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field String tag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Job$Builder setTrigger(JobTrigger jobtrigger)
	{
		trigger = jobtrigger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field JobTrigger trigger>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public boolean shouldReplaceCurrent()
	{
		return replaceCurrent;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean replaceCurrent>
	//    2    4:ireturn         
	}

	private int constraints[];
	private Bundle extras;
	private int lifetime;
	private boolean recurring;
	private boolean replaceCurrent;
	private RetryStrategy retryStrategy;
	private String serviceClassName;
	private String tag;
	private JobTrigger trigger;
	private final ValidationEnforcer validator;


/*
	static String access$000(Job$Builder job$builder)
	{
		return job$builder.serviceClassName;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String serviceClassName>
	//    2    4:areturn         
	}

*/


/*
	static Bundle access$100(Job$Builder job$builder)
	{
		return job$builder.extras;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Bundle extras>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(Job$Builder job$builder)
	{
		return job$builder.tag;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String tag>
	//    2    4:areturn         
	}

*/


/*
	static JobTrigger access$300(Job$Builder job$builder)
	{
		return job$builder.trigger;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field JobTrigger trigger>
	//    2    4:areturn         
	}

*/


/*
	static RetryStrategy access$400(Job$Builder job$builder)
	{
		return job$builder.retryStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field RetryStrategy retryStrategy>
	//    2    4:areturn         
	}

*/


/*
	static int access$500(Job$Builder job$builder)
	{
		return job$builder.lifetime;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int lifetime>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$600(Job$Builder job$builder)
	{
		return job$builder.recurring;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean recurring>
	//    2    4:ireturn         
	}

*/


/*
	static int[] access$700(Job$Builder job$builder)
	{
		return job$builder.constraints;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int[] constraints>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$800(Job$Builder job$builder)
	{
		return job$builder.replaceCurrent;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean replaceCurrent>
	//    2    4:ireturn         
	}

*/

	Job$Builder(ValidationEnforcer validationenforcer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		trigger = ((JobTrigger) (Trigger.NOW));
	//    2    4:aload_0         
	//    3    5:getstatic       #38  <Field JobTrigger$ImmediateTrigger Trigger.NOW>
	//    4    8:putfield        #40  <Field JobTrigger trigger>
		lifetime = 1;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #42  <Field int lifetime>
		retryStrategy = RetryStrategy.DEFAULT_EXPONENTIAL;
	//    8   16:aload_0         
	//    9   17:getstatic       #47  <Field RetryStrategy RetryStrategy.DEFAULT_EXPONENTIAL>
	//   10   20:putfield        #49  <Field RetryStrategy retryStrategy>
		replaceCurrent = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #51  <Field boolean replaceCurrent>
		recurring = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #53  <Field boolean recurring>
		validator = validationenforcer;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:putfield        #55  <Field ValidationEnforcer validator>
	//   20   38:return          
	}

	Job$Builder(ValidationEnforcer validationenforcer, JobParameters jobparameters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		trigger = ((JobTrigger) (Trigger.NOW));
	//    2    4:aload_0         
	//    3    5:getstatic       #38  <Field JobTrigger$ImmediateTrigger Trigger.NOW>
	//    4    8:putfield        #40  <Field JobTrigger trigger>
		lifetime = 1;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #42  <Field int lifetime>
		retryStrategy = RetryStrategy.DEFAULT_EXPONENTIAL;
	//    8   16:aload_0         
	//    9   17:getstatic       #47  <Field RetryStrategy RetryStrategy.DEFAULT_EXPONENTIAL>
	//   10   20:putfield        #49  <Field RetryStrategy retryStrategy>
		replaceCurrent = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #51  <Field boolean replaceCurrent>
		recurring = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #53  <Field boolean recurring>
		validator = validationenforcer;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:putfield        #55  <Field ValidationEnforcer validator>
		tag = jobparameters.getTag();
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:invokeinterface #61  <Method String JobParameters.getTag()>
	//   23   45:putfield        #63  <Field String tag>
		serviceClassName = jobparameters.getService();
	//   24   48:aload_0         
	//   25   49:aload_2         
	//   26   50:invokeinterface #66  <Method String JobParameters.getService()>
	//   27   55:putfield        #68  <Field String serviceClassName>
		trigger = jobparameters.getTrigger();
	//   28   58:aload_0         
	//   29   59:aload_2         
	//   30   60:invokeinterface #72  <Method JobTrigger JobParameters.getTrigger()>
	//   31   65:putfield        #40  <Field JobTrigger trigger>
		recurring = jobparameters.isRecurring();
	//   32   68:aload_0         
	//   33   69:aload_2         
	//   34   70:invokeinterface #76  <Method boolean JobParameters.isRecurring()>
	//   35   75:putfield        #53  <Field boolean recurring>
		lifetime = jobparameters.getLifetime();
	//   36   78:aload_0         
	//   37   79:aload_2         
	//   38   80:invokeinterface #80  <Method int JobParameters.getLifetime()>
	//   39   85:putfield        #42  <Field int lifetime>
		constraints = jobparameters.getConstraints();
	//   40   88:aload_0         
	//   41   89:aload_2         
	//   42   90:invokeinterface #84  <Method int[] JobParameters.getConstraints()>
	//   43   95:putfield        #86  <Field int[] constraints>
		extras = jobparameters.getExtras();
	//   44   98:aload_0         
	//   45   99:aload_2         
	//   46  100:invokeinterface #90  <Method Bundle JobParameters.getExtras()>
	//   47  105:putfield        #92  <Field Bundle extras>
		retryStrategy = jobparameters.getRetryStrategy();
	//   48  108:aload_0         
	//   49  109:aload_2         
	//   50  110:invokeinterface #96  <Method RetryStrategy JobParameters.getRetryStrategy()>
	//   51  115:putfield        #49  <Field RetryStrategy retryStrategy>
	//   52  118:return          
	}
}
