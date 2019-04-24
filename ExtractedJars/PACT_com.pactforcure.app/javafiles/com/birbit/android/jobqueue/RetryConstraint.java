// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;


public class RetryConstraint
{
	static class ImmutableRetryConstraint extends RetryConstraint
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

		public ImmutableRetryConstraint(boolean flag)
		{
			super(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #13  <Method void RetryConstraint(boolean)>
		//    3    5:return          
		}
	}


	public RetryConstraint(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		applyNewDelayToGroup = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean applyNewDelayToGroup>
		retry = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #34  <Field boolean retry>
	//    8   14:return          
	}

	public static RetryConstraint createExponentialBackoff(int i, long l)
	{
		RetryConstraint retryconstraint = new RetryConstraint(true);
	//    0    0:new             #2   <Class RetryConstraint>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #37  <Method void RetryConstraint(boolean)>
	//    4    8:astore_3        
		retryconstraint.setNewDelayInMs(Long.valueOf((long)Math.pow(2D, Math.max(0, i - 1)) * l));
	//    5    9:aload_3         
	//    6   10:ldc2w           #38  <Double 2D>
	//    7   13:iconst_0        
	//    8   14:iload_0         
	//    9   15:iconst_1        
	//   10   16:isub            
	//   11   17:invokestatic    #45  <Method int Math.max(int, int)>
	//   12   20:i2d             
	//   13   21:invokestatic    #49  <Method double Math.pow(double, double)>
	//   14   24:d2l             
	//   15   25:lload_1         
	//   16   26:lmul            
	//   17   27:invokestatic    #55  <Method Long Long.valueOf(long)>
	//   18   30:invokevirtual   #59  <Method void setNewDelayInMs(Long)>
		return retryconstraint;
	//   19   33:aload_3         
	//   20   34:areturn         
	}

	public Long getNewDelayInMs()
	{
		return newDelayInMs;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Long newDelayInMs>
	//    2    4:areturn         
	}

	public Integer getNewPriority()
	{
		return newPriority;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Integer newPriority>
	//    2    4:areturn         
	}

	public void setApplyNewDelayToGroup(boolean flag)
	{
		applyNewDelayToGroup = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field boolean applyNewDelayToGroup>
	//    3    5:return          
	}

	public void setNewDelayInMs(Long long1)
	{
		newDelayInMs = long1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field Long newDelayInMs>
	//    3    5:return          
	}

	public void setNewPriority(Integer integer)
	{
		newPriority = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field Integer newPriority>
	//    3    5:return          
	}

	public void setRetry(boolean flag)
	{
		retry = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field boolean retry>
	//    3    5:return          
	}

	public boolean shouldRetry()
	{
		return retry;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean retry>
	//    2    4:ireturn         
	}

	public boolean willApplyNewDelayToGroup()
	{
		return applyNewDelayToGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean applyNewDelayToGroup>
	//    2    4:ireturn         
	}

	public static final RetryConstraint CANCEL = new ImmutableRetryConstraint(false);
	public static final RetryConstraint RETRY = new ImmutableRetryConstraint(true);
	private boolean applyNewDelayToGroup;
	private Long newDelayInMs;
	private Integer newPriority;
	private boolean retry;

	static 
	{
	//    0    0:new             #6   <Class RetryConstraint$ImmutableRetryConstraint>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #23  <Method void RetryConstraint$ImmutableRetryConstraint(boolean)>
	//    4    8:putstatic       #25  <Field RetryConstraint RETRY>
	//    5   11:new             #6   <Class RetryConstraint$ImmutableRetryConstraint>
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:invokespecial   #23  <Method void RetryConstraint$ImmutableRetryConstraint(boolean)>
	//    9   19:putstatic       #27  <Field RetryConstraint CANCEL>
	//*  10   22:return          
	}
}
