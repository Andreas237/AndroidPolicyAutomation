// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;


// Referenced classes of package com.firebase.jobdispatcher:
//			RetryStrategy, ValidationEnforcer

static final class RetryStrategy$Builder
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

	RetryStrategy$Builder(ValidationEnforcer validationenforcer)
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
