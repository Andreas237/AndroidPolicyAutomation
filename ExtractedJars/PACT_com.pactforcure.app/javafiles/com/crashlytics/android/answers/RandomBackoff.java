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
		if(d < 0.0D || d > 1.0D)
	//*   2    4:dload_2         
	//*   3    5:dconst_0        
	//*   4    6:dcmpg           
	//*   5    7:iflt            16
	//*   6   10:dload_2         
	//*   7   11:dconst_1        
	//*   8   12:dcmpl           
	//*   9   13:ifle            26
			throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
	//   10   16:new             #26  <Class IllegalArgumentException>
	//   11   19:dup             
	//   12   20:ldc1            #28  <String "jitterPercent must be between 0.0 and 1.0">
	//   13   22:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   14   25:athrow          
		if(backoff1 == null)
	//*  15   26:aload_1         
	//*  16   27:ifnonnull       40
			throw new NullPointerException("backoff must not be null");
	//   17   30:new             #33  <Class NullPointerException>
	//   18   33:dup             
	//   19   34:ldc1            #35  <String "backoff must not be null">
	//   20   36:invokespecial   #36  <Method void NullPointerException(String)>
	//   21   39:athrow          
		if(random1 == null)
	//*  22   40:aload           4
	//*  23   42:ifnonnull       55
		{
			throw new NullPointerException("random must not be null");
	//   24   45:new             #33  <Class NullPointerException>
	//   25   48:dup             
	//   26   49:ldc1            #38  <String "random must not be null">
	//   27   51:invokespecial   #36  <Method void NullPointerException(String)>
	//   28   54:athrow          
		} else
		{
			backoff = backoff1;
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:putfield        #40  <Field Backoff backoff>
			jitterPercent = d;
	//   32   60:aload_0         
	//   33   61:dload_2         
	//   34   62:putfield        #42  <Field double jitterPercent>
			random = random1;
	//   35   65:aload_0         
	//   36   66:aload           4
	//   37   68:putfield        #44  <Field Random random>
			return;
	//   38   71:return          
		}
	}

	public long getDelayMillis(int i)
	{
		return (long)(randomJitter() * (double)backoff.getDelayMillis(i));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method double randomJitter()>
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field Backoff backoff>
	//    4    8:iload_1         
	//    5    9:invokeinterface #52  <Method long Backoff.getDelayMillis(int)>
	//    6   14:l2d             
	//    7   15:dmul            
	//    8   16:d2l             
	//    9   17:lreturn         
	}

	double randomJitter()
	{
		double d = 1.0D - jitterPercent;
	//    0    0:dconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field double jitterPercent>
	//    3    5:dsub            
	//    4    6:dstore_1        
		return ((1.0D + jitterPercent) - d) * random.nextDouble() + d;
	//    5    7:dconst_1        
	//    6    8:aload_0         
	//    7    9:getfield        #42  <Field double jitterPercent>
	//    8   12:dadd            
	//    9   13:dload_1         
	//   10   14:dsub            
	//   11   15:aload_0         
	//   12   16:getfield        #44  <Field Random random>
	//   13   19:invokevirtual   #55  <Method double Random.nextDouble()>
	//   14   22:dmul            
	//   15   23:dload_1         
	//   16   24:dadd            
	//   17   25:dreturn         
	}

	final Backoff backoff;
	final double jitterPercent;
	final Random random;
}
