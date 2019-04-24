// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;


// Referenced classes of package com.birbit.android.jobqueue:
//			RetryConstraint

static class RetryConstraint$ImmutableRetryConstraint extends RetryConstraint
{

	public void setNewDelayInMs(Long long1)
	{
		throw new IllegalStateException("This object is immutable. Create a new one using the constructor.");
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #9   <String "This object is immutable. Create a new one using the constructor.">
	//    3    6:invokespecial   #21  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public void setNewPriority(Integer integer)
	{
		throw new IllegalStateException("This object is immutable. Create a new one using the constructor.");
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #9   <String "This object is immutable. Create a new one using the constructor.">
	//    3    6:invokespecial   #21  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public void setRetry(boolean flag)
	{
		throw new IllegalStateException("This object is immutable. Create a new one using the constructor.");
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #9   <String "This object is immutable. Create a new one using the constructor.">
	//    3    6:invokespecial   #21  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	private static final String MESSAGE = "This object is immutable. Create a new one using the constructor.";

	public RetryConstraint$ImmutableRetryConstraint(boolean flag)
	{
		super(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #13  <Method void RetryConstraint(boolean)>
	//    3    5:return          
	}
}
