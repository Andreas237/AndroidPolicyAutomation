// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;


// Referenced classes of package com.firebase.client.core.persistence:
//			CachePolicy

public class LRUCachePolicy
	implements CachePolicy
{

	public LRUCachePolicy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		maxSizeBytes = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #22  <Field long maxSizeBytes>
	//    5    9:return          
	}

	public long getMaxNumberOfQueriesToKeep()
	{
		return 1000L;
	//    0    0:ldc2w           #9   <Long 1000L>
	//    1    3:lreturn         
	}

	public float getPercentOfQueriesToPruneAtOnce()
	{
		return 0.2F;
	//    0    0:ldc1            #13  <Float 0.2F>
	//    1    2:freturn         
	}

	public boolean shouldCheckCacheSize(long l)
	{
		return l > 1000L;
	//    0    0:lload_1         
	//    1    1:ldc2w           #9   <Long 1000L>
	//    2    4:lcmp            
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean shouldPrune(long l, long l1)
	{
		return l > maxSizeBytes || l1 > 1000L;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field long maxSizeBytes>
	//    3    5:lcmp            
	//    4    6:ifgt            22
	//    5    9:lload_3         
	//    6   10:ldc2w           #9   <Long 1000L>
	//    7   13:lcmp            
	//    8   14:ifle            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	private static final long MAX_NUMBER_OF_PRUNABLE_QUERIES_TO_KEEP = 1000L;
	private static final float PERCENT_OF_QUERIES_TO_PRUNE_AT_ONCE = 0.2F;
	private static final long SERVER_UPDATES_BETWEEN_CACHE_SIZE_CHECKS = 1000L;
	public final long maxSizeBytes;
}
