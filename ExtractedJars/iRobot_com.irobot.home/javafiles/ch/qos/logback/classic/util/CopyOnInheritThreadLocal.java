// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.util;

import java.util.HashMap;

public class CopyOnInheritThreadLocal extends InheritableThreadLocal
{

	public CopyOnInheritThreadLocal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void InheritableThreadLocal()>
	//    2    4:return          
	}

	protected volatile Object childValue(Object obj)
	{
		return ((Object) (childValue((HashMap)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class HashMap>
	//    3    5:invokevirtual   #17  <Method HashMap childValue(HashMap)>
	//    4    8:areturn         
	}

	protected HashMap childValue(HashMap hashmap)
	{
		if(hashmap == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new HashMap(((java.util.Map) (hashmap)));
	//    4    6:new             #14  <Class HashMap>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #20  <Method void HashMap(java.util.Map)>
	//    8   14:areturn         
	}
}
