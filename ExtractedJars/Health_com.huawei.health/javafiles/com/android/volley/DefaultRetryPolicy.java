// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			RetryPolicy, VolleyError

public class DefaultRetryPolicy
	implements RetryPolicy
{

	public DefaultRetryPolicy()
	{
		this(2500, 0, 1.0F);
	//    0    0:aload_0         
	//    1    1:sipush          2500
	//    2    4:iconst_0        
	//    3    5:fconst_1        
	//    4    6:invokespecial   #23  <Method void DefaultRetryPolicy(int, int, float)>
	//    5    9:return          
	}

	public DefaultRetryPolicy(int i, int j, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mCurrentTimeoutMs = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int mCurrentTimeoutMs>
		mMaxNumRetries = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field int mMaxNumRetries>
		mBackoffMultiplier = f;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #32  <Field float mBackoffMultiplier>
	//   11   19:return          
	}

	public float getBackoffMultiplier()
	{
		return mBackoffMultiplier;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float mBackoffMultiplier>
	//    2    4:freturn         
	}

	public int getCurrentRetryCount()
	{
		return mCurrentRetryCount;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int mCurrentRetryCount>
	//    2    4:ireturn         
	}

	public int getCurrentTimeout()
	{
		return mCurrentTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int mCurrentTimeoutMs>
	//    2    4:ireturn         
	}

	protected boolean hasAttemptRemaining()
	{
		return mCurrentRetryCount <= mMaxNumRetries;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int mCurrentRetryCount>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field int mMaxNumRetries>
	//    4    8:icmpgt          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void retry(VolleyError volleyerror)
		throws VolleyError
	{
		mCurrentRetryCount = mCurrentRetryCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field int mCurrentRetryCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #38  <Field int mCurrentRetryCount>
		mCurrentTimeoutMs = (int)((float)mCurrentTimeoutMs + (float)mCurrentTimeoutMs * mBackoffMultiplier);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field int mCurrentTimeoutMs>
	//    9   15:i2f             
	//   10   16:aload_0         
	//   11   17:getfield        #28  <Field int mCurrentTimeoutMs>
	//   12   20:i2f             
	//   13   21:aload_0         
	//   14   22:getfield        #32  <Field float mBackoffMultiplier>
	//   15   25:fmul            
	//   16   26:fadd            
	//   17   27:f2i             
	//   18   28:putfield        #28  <Field int mCurrentTimeoutMs>
		if(!hasAttemptRemaining())
	//*  19   31:aload_0         
	//*  20   32:invokevirtual   #47  <Method boolean hasAttemptRemaining()>
	//*  21   35:ifne            40
			throw volleyerror;
	//   22   38:aload_1         
	//   23   39:athrow          
		else
			return;
	//   24   40:return          
	}

	public static final float DEFAULT_BACKOFF_MULT = 1F;
	public static final int DEFAULT_MAX_RETRIES = 0;
	public static final int DEFAULT_TIMEOUT_MS = 2500;
	private final float mBackoffMultiplier;
	private int mCurrentRetryCount;
	private int mCurrentTimeoutMs;
	private final int mMaxNumRetries;
}
