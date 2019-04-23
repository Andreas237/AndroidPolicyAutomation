// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import java.lang.annotation.Annotation;

// Referenced classes of package com.firebase.jobdispatcher:
//			ValidationEnforcer

public final class RetryStrategy
{
	static final class Builder
	{

		public RetryStrategy build(int i, int j, int k)
		{
			RetryStrategy retrystrategy = new RetryStrategy(i, j, k);
		//    0    0:new             #6   <Class RetryStrategy>
		//    1    3:dup             
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokespecial   #22  <Method void RetryStrategy(int, int, int)>
		//    6   10:astore          4
			validator.ensureValid(retrystrategy);
		//    7   12:aload_0         
		//    8   13:getfield        #16  <Field ValidationEnforcer validator>
		//    9   16:aload           4
		//   10   18:invokevirtual   #28  <Method void ValidationEnforcer.ensureValid(RetryStrategy)>
			return retrystrategy;
		//   11   21:aload           4
		//   12   23:areturn         
		}

		private final ValidationEnforcer validator;

		Builder(ValidationEnforcer validationenforcer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			validator = validationenforcer;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field ValidationEnforcer validator>
		//    5    9:return          
		}
	}

	public static interface RetryPolicy
		extends Annotation
	{
	}


	RetryStrategy(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		policy = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int policy>
		initialBackoff = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #38  <Field int initialBackoff>
		maximumBackoff = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #40  <Field int maximumBackoff>
	//   11   19:return          
	}

	public int getInitialBackoff()
	{
		return initialBackoff;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int initialBackoff>
	//    2    4:ireturn         
	}

	public int getMaximumBackoff()
	{
		return maximumBackoff;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int maximumBackoff>
	//    2    4:ireturn         
	}

	public int getPolicy()
	{
		return policy;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int policy>
	//    2    4:ireturn         
	}

	public static final RetryStrategy DEFAULT_EXPONENTIAL = new RetryStrategy(1, 30, 3600);
	public static final RetryStrategy DEFAULT_LINEAR = new RetryStrategy(2, 30, 3600);
	public static final int RETRY_POLICY_EXPONENTIAL = 1;
	public static final int RETRY_POLICY_LINEAR = 2;
	private final int initialBackoff;
	private final int maximumBackoff;
	private final int policy;

	static 
	{
	//    0    0:new             #2   <Class RetryStrategy>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:bipush          30
	//    4    7:sipush          3600
	//    5   10:invokespecial   #27  <Method void RetryStrategy(int, int, int)>
	//    6   13:putstatic       #29  <Field RetryStrategy DEFAULT_EXPONENTIAL>
	//    7   16:new             #2   <Class RetryStrategy>
	//    8   19:dup             
	//    9   20:iconst_2        
	//   10   21:bipush          30
	//   11   23:sipush          3600
	//   12   26:invokespecial   #27  <Method void RetryStrategy(int, int, int)>
	//   13   29:putstatic       #31  <Field RetryStrategy DEFAULT_LINEAR>
	//*  14   32:return          
	}
}
