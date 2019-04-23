// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.Bundle;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobParameters, RetryStrategy, JobTrigger, TriggerReason, 
//			Trigger, ValidationEnforcer

public final class Job
	implements JobParameters
{
	public static final class Builder
		implements JobParameters
	{

		public Builder addConstraint(int i)
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
			return new Job(this);
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

		public transient Builder setConstraints(int ai[])
		{
			constraints = ai;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #86  <Field int[] constraints>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setExtras(Bundle bundle)
		{
			extras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #92  <Field Bundle extras>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLifetime(int i)
		{
			lifetime = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #42  <Field int lifetime>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRecurring(boolean flag)
		{
			recurring = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #53  <Field boolean recurring>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setReplaceCurrent(boolean flag)
		{
			replaceCurrent = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #51  <Field boolean replaceCurrent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRetryStrategy(RetryStrategy retrystrategy)
		{
			retryStrategy = retrystrategy;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field RetryStrategy retryStrategy>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setService(Class class1)
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

		Builder setServiceName(String s)
		{
			serviceClassName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #68  <Field String serviceClassName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTag(String s)
		{
			tag = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #63  <Field String tag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTrigger(JobTrigger jobtrigger)
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
		static String access$000(Builder builder)
		{
			return builder.serviceClassName;
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field String serviceClassName>
		//    2    4:areturn         
		}

*/


/*
		static Bundle access$100(Builder builder)
		{
			return builder.extras;
		//    0    0:aload_0         
		//    1    1:getfield        #92  <Field Bundle extras>
		//    2    4:areturn         
		}

*/


/*
		static String access$200(Builder builder)
		{
			return builder.tag;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field String tag>
		//    2    4:areturn         
		}

*/


/*
		static JobTrigger access$300(Builder builder)
		{
			return builder.trigger;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field JobTrigger trigger>
		//    2    4:areturn         
		}

*/


/*
		static RetryStrategy access$400(Builder builder)
		{
			return builder.retryStrategy;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field RetryStrategy retryStrategy>
		//    2    4:areturn         
		}

*/


/*
		static int access$500(Builder builder)
		{
			return builder.lifetime;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field int lifetime>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$600(Builder builder)
		{
			return builder.recurring;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field boolean recurring>
		//    2    4:ireturn         
		}

*/


/*
		static int[] access$700(Builder builder)
		{
			return builder.constraints;
		//    0    0:aload_0         
		//    1    1:getfield        #86  <Field int[] constraints>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$800(Builder builder)
		{
			return builder.replaceCurrent;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field boolean replaceCurrent>
		//    2    4:ireturn         
		}

*/

		Builder(ValidationEnforcer validationenforcer)
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

		Builder(ValidationEnforcer validationenforcer, JobParameters jobparameters)
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


	private Job(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		service = builder.serviceClassName;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #36  <Method String Job$Builder.access$000(Job$Builder)>
	//    5    9:putfield        #38  <Field String service>
		Bundle bundle;
		if(builder.extras == null)
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #42  <Method Bundle Job$Builder.access$100(Job$Builder)>
	//*   8   16:ifnonnull       24
			bundle = null;
	//    9   19:aconst_null     
	//   10   20:astore_2        
		else
	//*  11   21:goto            36
			bundle = new Bundle(builder.extras);
	//   12   24:new             #44  <Class Bundle>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:invokestatic    #42  <Method Bundle Job$Builder.access$100(Job$Builder)>
	//   16   32:invokespecial   #47  <Method void Bundle(Bundle)>
	//   17   35:astore_2        
		extras = bundle;
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:putfield        #49  <Field Bundle extras>
		tag = builder.tag;
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokestatic    #52  <Method String Job$Builder.access$200(Job$Builder)>
	//   24   46:putfield        #54  <Field String tag>
		trigger = builder.trigger;
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:invokestatic    #58  <Method JobTrigger Job$Builder.access$300(Job$Builder)>
	//   28   54:putfield        #60  <Field JobTrigger trigger>
		retryStrategy = builder.retryStrategy;
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:invokestatic    #64  <Method RetryStrategy Job$Builder.access$400(Job$Builder)>
	//   32   62:putfield        #66  <Field RetryStrategy retryStrategy>
		lifetime = builder.lifetime;
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokestatic    #70  <Method int Job$Builder.access$500(Job$Builder)>
	//   36   70:putfield        #72  <Field int lifetime>
		recurring = builder.recurring;
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:invokestatic    #76  <Method boolean Job$Builder.access$600(Job$Builder)>
	//   40   78:putfield        #78  <Field boolean recurring>
		int ai[];
		if(builder.constraints != null)
	//*  41   81:aload_1         
	//*  42   82:invokestatic    #82  <Method int[] Job$Builder.access$700(Job$Builder)>
	//*  43   85:ifnull          96
			ai = builder.constraints;
	//   44   88:aload_1         
	//   45   89:invokestatic    #82  <Method int[] Job$Builder.access$700(Job$Builder)>
	//   46   92:astore_2        
		else
	//*  47   93:goto            100
			ai = new int[0];
	//   48   96:iconst_0        
	//   49   97:newarray        int[]
	//   50   99:astore_2        
		constraints = ai;
	//   51  100:aload_0         
	//   52  101:aload_2         
	//   53  102:putfield        #84  <Field int[] constraints>
		replaceCurrent = builder.replaceCurrent;
	//   54  105:aload_0         
	//   55  106:aload_1         
	//   56  107:invokestatic    #87  <Method boolean Job$Builder.access$800(Job$Builder)>
	//   57  110:putfield        #89  <Field boolean replaceCurrent>
	//   58  113:return          
	}


	public int[] getConstraints()
	{
		return constraints;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int[] constraints>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return extras;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Bundle extras>
	//    2    4:areturn         
	}

	public int getLifetime()
	{
		return lifetime;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int lifetime>
	//    2    4:ireturn         
	}

	public RetryStrategy getRetryStrategy()
	{
		return retryStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field RetryStrategy retryStrategy>
	//    2    4:areturn         
	}

	public String getService()
	{
		return service;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String service>
	//    2    4:areturn         
	}

	public String getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String tag>
	//    2    4:areturn         
	}

	public JobTrigger getTrigger()
	{
		return trigger;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field JobTrigger trigger>
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
	//    1    1:getfield        #78  <Field boolean recurring>
	//    2    4:ireturn         
	}

	public boolean shouldReplaceCurrent()
	{
		return replaceCurrent;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field boolean replaceCurrent>
	//    2    4:ireturn         
	}

	private final int constraints[];
	private final Bundle extras;
	private final int lifetime;
	private final boolean recurring;
	private final boolean replaceCurrent;
	private final RetryStrategy retryStrategy;
	private final String service;
	private final String tag;
	private final JobTrigger trigger;
}
