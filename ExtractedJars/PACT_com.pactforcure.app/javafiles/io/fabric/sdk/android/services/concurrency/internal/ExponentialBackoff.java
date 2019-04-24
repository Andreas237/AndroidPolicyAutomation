// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency.internal;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//			Backoff

public class ExponentialBackoff
	implements Backoff
{

	public ExponentialBackoff(long l)
	{
		this(l, 2);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_2        
	//    3    3:invokespecial   #17  <Method void ExponentialBackoff(long, int)>
	//    4    6:return          
	}

	public ExponentialBackoff(long l, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		baseTimeMillis = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #23  <Field long baseTimeMillis>
		power = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #25  <Field int power>
	//    8   14:return          
	}

	public long getDelayMillis(int i)
	{
		return (long)((double)baseTimeMillis * Math.pow(power, i));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long baseTimeMillis>
	//    2    4:l2d             
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int power>
	//    5    9:i2d             
	//    6   10:iload_1         
	//    7   11:i2d             
	//    8   12:invokestatic    #33  <Method double Math.pow(double, double)>
	//    9   15:dmul            
	//   10   16:d2l             
	//   11   17:lreturn         
	}

	private static final int DEFAULT_POWER = 2;
	private final long baseTimeMillis;
	private final int power;
}
