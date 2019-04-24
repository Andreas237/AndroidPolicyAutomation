// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;


public class InvocationGate
{

	public InvocationGate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mask = 15L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #20  <Long 15L>
	//    4    8:putfield        #23  <Field long mask>
		lastMaskCheck = System.currentTimeMillis();
	//    5   11:aload_0         
	//    6   12:invokestatic    #29  <Method long System.currentTimeMillis()>
	//    7   15:putfield        #31  <Field long lastMaskCheck>
		invocationCounter = 0L;
	//    8   18:aload_0         
	//    9   19:lconst_0        
	//   10   20:putfield        #33  <Field long invocationCounter>
	//   11   23:aload_0         
	//   12   24:ldc2w           #34  <Long 800L>
	//   13   27:putfield        #37  <Field long thresholdForMaskDecrease>
	//   14   30:return          
	}

	public boolean skipFurtherWork()
	{
		long l = invocationCounter;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long invocationCounter>
	//    2    4:lstore_1        
		invocationCounter = 1L + l;
	//    3    5:aload_0         
	//    4    6:lconst_1        
	//    5    7:lload_1         
	//    6    8:ladd            
	//    7    9:putfield        #33  <Field long invocationCounter>
		return (l & mask) != mask;
	//    8   12:lload_1         
	//    9   13:aload_0         
	//   10   14:getfield        #23  <Field long mask>
	//   11   17:land            
	//   12   18:aload_0         
	//   13   19:getfield        #23  <Field long mask>
	//   14   22:lcmp            
	//   15   23:ifeq            28
	//   16   26:iconst_1        
	//   17   27:ireturn         
	//   18   28:iconst_0        
	//   19   29:ireturn         
	}

	public void updateMaskIfNecessary(long l)
	{
		long l1 = l - lastMaskCheck;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field long lastMaskCheck>
	//    3    5:lsub            
	//    4    6:lstore_3        
		lastMaskCheck = l;
	//    5    7:aload_0         
	//    6    8:lload_1         
	//    7    9:putfield        #31  <Field long lastMaskCheck>
		if(l1 < 100L && mask < 65535L)
	//*   8   12:lload_3         
	//*   9   13:ldc2w           #10  <Long 100L>
	//*  10   16:lcmp            
	//*  11   17:ifge            46
	//*  12   20:aload_0         
	//*  13   21:getfield        #23  <Field long mask>
	//*  14   24:ldc2w           #43  <Long 65535L>
	//*  15   27:lcmp            
	//*  16   28:ifge            46
			l = mask << 1 | 1L;
	//   17   31:aload_0         
	//   18   32:getfield        #23  <Field long mask>
	//   19   35:iconst_1        
	//   20   36:lshl            
	//   21   37:lconst_1        
	//   22   38:lor             
	//   23   39:lstore_1        
		else
	//*  24   40:aload_0         
	//*  25   41:lload_1         
	//*  26   42:putfield        #23  <Field long mask>
	//*  27   45:return          
		if(l1 > 800L)
	//*  28   46:lload_3         
	//*  29   47:ldc2w           #34  <Long 800L>
	//*  30   50:lcmp            
	//*  31   51:ifle            64
			l = mask >>> 2;
	//   32   54:aload_0         
	//   33   55:getfield        #23  <Field long mask>
	//   34   58:iconst_2        
	//   35   59:lushr           
	//   36   60:lstore_1        
		else
	//*  37   61:goto            40
			return;
	//   38   64:return          
		mask = l;
	}

	private static final int MAX_MASK = 65535;
	private static final long thresholdForMaskIncrease = 100L;
	private long invocationCounter;
	private volatile long lastMaskCheck;
	private volatile long mask;
	private final long thresholdForMaskDecrease = 800L;
}
