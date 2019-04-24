// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.recovery;


public class RecoveryCoordinator
{

	public RecoveryCoordinator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		backOffCoefficient = 20L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #10  <Long 20L>
	//    4    8:putfield        #25  <Field long backOffCoefficient>
		currentTime = UNSET;
	//    5   11:aload_0         
	//    6   12:getstatic       #27  <Field long UNSET>
	//    7   15:putfield        #29  <Field long currentTime>
		next = System.currentTimeMillis() + getBackoffCoefficient();
	//    8   18:aload_0         
	//    9   19:invokestatic    #35  <Method long System.currentTimeMillis()>
	//   10   22:aload_0         
	//   11   23:invokespecial   #38  <Method long getBackoffCoefficient()>
	//   12   26:ladd            
	//   13   27:putfield        #40  <Field long next>
	//   14   30:return          
	}

	private long getBackoffCoefficient()
	{
		long l = backOffCoefficient;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long backOffCoefficient>
	//    2    4:lstore_1        
		if(backOffCoefficient < BACKOFF_COEFFICIENT_MAX)
	//*   3    5:aload_0         
	//*   4    6:getfield        #25  <Field long backOffCoefficient>
	//*   5    9:getstatic       #42  <Field long BACKOFF_COEFFICIENT_MAX>
	//*   6   12:lcmp            
	//*   7   13:ifge            28
			backOffCoefficient = backOffCoefficient * 4L;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #25  <Field long backOffCoefficient>
	//   11   21:ldc2w           #43  <Long 4L>
	//   12   24:lmul            
	//   13   25:putfield        #25  <Field long backOffCoefficient>
		return l;
	//   14   28:lload_1         
	//   15   29:lreturn         
	}

	private long getCurrentTime()
	{
		if(currentTime != UNSET)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long currentTime>
	//*   2    4:getstatic       #27  <Field long UNSET>
	//*   3    7:lcmp            
	//*   4    8:ifeq            16
			return currentTime;
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field long currentTime>
	//    7   15:lreturn         
		else
			return System.currentTimeMillis();
	//    8   16:invokestatic    #35  <Method long System.currentTimeMillis()>
	//    9   19:lreturn         
	}

	public boolean isTooSoon()
	{
		long l = getCurrentTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method long getCurrentTime()>
	//    2    4:lstore_1        
		if(l > next)
	//*   3    5:lload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #40  <Field long next>
	//*   6   10:lcmp            
	//*   7   11:ifle            26
		{
			next = l + getBackoffCoefficient();
	//    8   14:aload_0         
	//    9   15:lload_1         
	//   10   16:aload_0         
	//   11   17:invokespecial   #38  <Method long getBackoffCoefficient()>
	//   12   20:ladd            
	//   13   21:putfield        #40  <Field long next>
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		} else
		{
			return true;
	//   16   26:iconst_1        
	//   17   27:ireturn         
		}
	}

	void setCurrentTime(long l)
	{
		currentTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #29  <Field long currentTime>
	//    3    5:return          
	}

	static long BACKOFF_COEFFICIENT_MAX = 0x50000L;
	public static final long BACKOFF_COEFFICIENT_MIN = 20L;
	private static long UNSET = -1L;
	private long backOffCoefficient;
	private long currentTime;
	long next;

	static 
	{
	//    0    0:return          
	}
}
