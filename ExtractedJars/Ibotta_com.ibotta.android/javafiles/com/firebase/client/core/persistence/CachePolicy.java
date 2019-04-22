// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;


public interface CachePolicy
{

	public abstract long getMaxNumberOfQueriesToKeep();

	public abstract float getPercentOfQueriesToPruneAtOnce();

	public abstract boolean shouldCheckCacheSize(long l);

	public abstract boolean shouldPrune(long l, long l1);

	public static final CachePolicy NONE = new CachePolicy() {

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

	}
;

	/* static  */
	/* { */
	//    0    0:new             #6   <Class CachePolicy$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void CachePolicy$1()>
	//    3    7:putstatic       #15  <Field CachePolicy NONE>
	//*   4   10:return          
	/* } */
}
