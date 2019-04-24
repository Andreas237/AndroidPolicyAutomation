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
	//*   5    7:iflt            65
	//*   6   10:dload_2         
	//*   7   11:dconst_1        
	//*   8   12:dcmpl           
	//*   9   13:ifle            19
	//*  10   16:goto            65
		{
			if(backoff1 == null)
	//*  11   19:aload_1         
	//*  12   20:ifnonnull       33
				throw new NullPointerException("backoff must not be null");
	//   13   23:new             #26  <Class NullPointerException>
	//   14   26:dup             
	//   15   27:ldc1            #28  <String "backoff must not be null">
	//   16   29:invokespecial   #31  <Method void NullPointerException(String)>
	//   17   32:athrow          
			if(random1 == null)
	//*  18   33:aload           4
	//*  19   35:ifnonnull       48
			{
				throw new NullPointerException("random must not be null");
	//   20   38:new             #26  <Class NullPointerException>
	//   21   41:dup             
	//   22   42:ldc1            #33  <String "random must not be null">
	//   23   44:invokespecial   #31  <Method void NullPointerException(String)>
	//   24   47:athrow          
			} else
			{
				backoff = backoff1;
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:putfield        #35  <Field Backoff backoff>
				jitterPercent = d;
	//   28   53:aload_0         
	//   29   54:dload_2         
	//   30   55:putfield        #37  <Field double jitterPercent>
				random = random1;
	//   31   58:aload_0         
	//   32   59:aload           4
	//   33   61:putfield        #39  <Field Random random>
				return;
	//   34   64:return          
			}
		} else
		{
			throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
	//   35   65:new             #41  <Class IllegalArgumentException>
	//   36   68:dup             
	//   37   69:ldc1            #43  <String "jitterPercent must be between 0.0 and 1.0">
	//   38   71:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   39   74:athrow          
		}
	}

	public long getDelayMillis(int i)
	{
		return (long)(randomJitter() * (double)backoff.getDelayMillis(i));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method double randomJitter()>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Backoff backoff>
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
	//    2    2:getfield        #37  <Field double jitterPercent>
	//    3    5:dsub            
	//    4    6:dstore_1        
		return d + ((1.0D + jitterPercent) - d) * random.nextDouble();
	//    5    7:dload_1         
	//    6    8:dconst_1        
	//    7    9:aload_0         
	//    8   10:getfield        #37  <Field double jitterPercent>
	//    9   13:dadd            
	//   10   14:dload_1         
	//   11   15:dsub            
	//   12   16:aload_0         
	//   13   17:getfield        #39  <Field Random random>
	//   14   20:invokevirtual   #55  <Method double Random.nextDouble()>
	//   15   23:dmul            
	//   16   24:dadd            
	//   17   25:dreturn         
	}

	final Backoff backoff;
	final double jitterPercent;
	final Random random;
}
