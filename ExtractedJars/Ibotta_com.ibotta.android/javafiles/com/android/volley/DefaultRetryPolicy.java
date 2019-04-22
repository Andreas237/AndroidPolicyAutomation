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
		this(2500, 1, 1.0F);
	//    0    0:aload_0         
	//    1    1:sipush          2500
	//    2    4:iconst_1        
	//    3    5:fconst_1        
	//    4    6:invokespecial   #17  <Method void DefaultRetryPolicy(int, int, float)>
	//    5    9:return          
	}

	public DefaultRetryPolicy(int i, int j, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mCurrentTimeoutMs = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field int mCurrentTimeoutMs>
		mMaxNumRetries = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int mMaxNumRetries>
		mBackoffMultiplier = f;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #26  <Field float mBackoffMultiplier>
	//   11   19:return          
	}

	public int getCurrentRetryCount()
	{
		return mCurrentRetryCount;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mCurrentRetryCount>
	//    2    4:ireturn         
	}

	public int getCurrentTimeout()
	{
		return mCurrentTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int mCurrentTimeoutMs>
	//    2    4:ireturn         
	}

	protected boolean hasAttemptRemaining()
	{
		return mCurrentRetryCount <= mMaxNumRetries;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mCurrentRetryCount>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field int mMaxNumRetries>
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
	//    2    2:getfield        #30  <Field int mCurrentRetryCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #30  <Field int mCurrentRetryCount>
		int i = mCurrentTimeoutMs;
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field int mCurrentTimeoutMs>
	//    8   14:istore_2        
		mCurrentTimeoutMs = (int)((float)i + (float)i * mBackoffMultiplier);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:i2f             
	//   12   18:iload_2         
	//   13   19:i2f             
	//   14   20:aload_0         
	//   15   21:getfield        #26  <Field float mBackoffMultiplier>
	//   16   24:fmul            
	//   17   25:fadd            
	//   18   26:f2i             
	//   19   27:putfield        #22  <Field int mCurrentTimeoutMs>
		if(hasAttemptRemaining())
	//*  20   30:aload_0         
	//*  21   31:invokevirtual   #39  <Method boolean hasAttemptRemaining()>
	//*  22   34:ifeq            38
			return;
	//   23   37:return          
		else
			throw volleyerror;
	//   24   38:aload_1         
	//   25   39:athrow          
	}

	private final float mBackoffMultiplier;
	private int mCurrentRetryCount;
	private int mCurrentTimeoutMs;
	private final int mMaxNumRetries;
}
