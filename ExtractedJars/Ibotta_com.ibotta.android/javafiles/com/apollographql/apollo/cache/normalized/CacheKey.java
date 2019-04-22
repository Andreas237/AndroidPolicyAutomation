// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.Utils;

public final class CacheKey
{

	private CacheKey(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		key = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String key>
	//    5    9:return          
	}

	public static CacheKey from(String s)
	{
		return new CacheKey((String)Utils.checkNotNull(((Object) (s)), "key == null"));
	//    0    0:new             #2   <Class CacheKey>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <String "key == null">
	//    4    7:invokestatic    #35  <Method Object Utils.checkNotNull(Object, Object)>
	//    5   10:checkcast       #37  <Class String>
	//    6   13:invokespecial   #16  <Method void CacheKey(String)>
	//    7   16:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof CacheKey))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class CacheKey>
	//*   7   11:ifne            16
		{
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		} else
		{
			obj = ((Object) ((CacheKey)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class CacheKey>
	//   12   20:astore_1        
			return key.equals(((Object) (((CacheKey) (obj)).key)));
	//   13   21:aload_0         
	//   14   22:getfield        #24  <Field String key>
	//   15   25:aload_1         
	//   16   26:getfield        #24  <Field String key>
	//   17   29:invokevirtual   #41  <Method boolean String.equals(Object)>
	//   18   32:ireturn         
		}
	}

	public int hashCode()
	{
		return key.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String key>
	//    2    4:invokevirtual   #45  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public String key()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String key>
	//    2    4:areturn         
	}

	public String toString()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String key>
	//    2    4:areturn         
	}

	public static final CacheKey NO_KEY = new CacheKey("");
	private final String key;

	static 
	{
	//    0    0:new             #2   <Class CacheKey>
	//    1    3:dup             
	//    2    4:ldc1            #12  <String "">
	//    3    6:invokespecial   #16  <Method void CacheKey(String)>
	//    4    9:putstatic       #18  <Field CacheKey NO_KEY>
	//*   5   12:return          
	}
}
