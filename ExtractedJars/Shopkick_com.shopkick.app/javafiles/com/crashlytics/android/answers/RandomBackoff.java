// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import java.util.Random;

class RandomBackoff
	implements Backoff
{

	public RandomBackoff(Backoff backoff1, double d)
	{
		this(backoff1, d, new Random());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:new             #16  <Class Random>
	//    4    6:dup             
	//    5    7:invokespecial   #19  <Method void Random()>
	//    6   10:invokespecial   #22  <Method void RandomBackoff(Backoff, double, Random)>
	//    7   13:return          
	}

	public RandomBackoff(Backoff backoff1, double d, Random random1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		if(d >= 0.0D && d <= 1.0D)
	//*   2    4:dload_2         
	//*   3    5:dconst_0        
	//*   4    6:dcmpg           
	//*   5    7:iflt            62
	//*   6   10:dload_2         
	//*   7   11:dconst_1        
	//*   8   12:dcmpl           
	//*   9   13:ifgt            62
		{
			if(backoff1 != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          52
			{
				if(random1 != null)
	//*  12   20:aload           4
	//*  13   22:ifnull          42
				{
					backoff = backoff1;
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:putfield        #26  <Field Backoff backoff>
					jitterPercent = d;
	//   17   30:aload_0         
	//   18   31:dload_2         
	//   19   32:putfield        #28  <Field double jitterPercent>
					random = random1;
	//   20   35:aload_0         
	//   21   36:aload           4
	//   22   38:putfield        #30  <Field Random random>
					return;
	//   23   41:return          
				} else
				{
					throw new NullPointerException("random must not be null");
	//   24   42:new             #32  <Class NullPointerException>
	//   25   45:dup             
	//   26   46:ldc1            #34  <String "random must not be null">
	//   27   48:invokespecial   #37  <Method void NullPointerException(String)>
	//   28   51:athrow          
				}
			} else
			{
				throw new NullPointerException("backoff must not be null");
	//   29   52:new             #32  <Class NullPointerException>
	//   30   55:dup             
	//   31   56:ldc1            #39  <String "backoff must not be null">
	//   32   58:invokespecial   #37  <Method void NullPointerException(String)>
	//   33   61:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
	//   34   62:new             #41  <Class IllegalArgumentException>
	//   35   65:dup             
	//   36   66:ldc1            #43  <String "jitterPercent must be between 0.0 and 1.0">
	//   37   68:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   38   71:athrow          
		}
	}

	public long getDelayMillis(int i)
	{
		return (long)(randomJitter() * (double)backoff.getDelayMillis(i));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method double randomJitter()>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field Backoff backoff>
	//    4    8:iload_1         
	//    5    9:invokeinterface #52  <Method long Backoff.getDelayMillis(int)>
	//    6   14:l2d             
	//    7   15:dmul            
	//    8   16:d2l             
	//    9   17:lreturn         
	}

	double randomJitter()
	{
		double d = jitterPercent;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field double jitterPercent>
	//    2    4:dstore_1        
		double d1 = 1.0D - d;
	//    3    5:dconst_1        
	//    4    6:dload_1         
	//    5    7:dsub            
	//    6    8:dstore_3        
		return d1 + ((d + 1.0D) - d1) * random.nextDouble();
	//    7    9:dload_3         
	//    8   10:dload_1         
	//    9   11:dconst_1        
	//   10   12:dadd            
	//   11   13:dload_3         
	//   12   14:dsub            
	//   13   15:aload_0         
	//   14   16:getfield        #30  <Field Random random>
	//   15   19:invokevirtual   #55  <Method double Random.nextDouble()>
	//   16   22:dmul            
	//   17   23:dadd            
	//   18   24:dreturn         
	}

	final Backoff backoff;
	final double jitterPercent;
	final Random random;
}
