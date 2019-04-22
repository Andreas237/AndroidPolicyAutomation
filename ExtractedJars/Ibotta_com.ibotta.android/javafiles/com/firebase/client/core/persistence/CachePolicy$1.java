// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;


// Referenced classes of package com.firebase.client.core.persistence:
//			CachePolicy

static final class CachePolicy$1
	implements CachePolicy
{

	public long getMaxNumberOfQueriesToKeep()
	{
		return 0xffffffffL;
	//    0    0:ldc2w           #14  <Long 0xffffffffL>
	//    1    3:lreturn         
	}

	public float getPercentOfQueriesToPruneAtOnce()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public boolean shouldCheckCacheSize(long l)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean shouldPrune(long l, long l1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	CachePolicy$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
