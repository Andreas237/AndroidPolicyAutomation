// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import java.util.regex.Pattern;

public final class CacheReference
{

	public CacheReference(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		key = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String key>
	//    5    9:return          
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #33  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #33  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((CacheReference)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class CacheReference>
	//   16   28:astore_1        
			String s = key;
	//   17   29:aload_0         
	//   18   30:getfield        #27  <Field String key>
	//   19   33:astore_2        
			if(s != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          47
				return s.equals(((Object) (((CacheReference) (obj)).key)));
	//   22   38:aload_2         
	//   23   39:aload_1         
	//   24   40:getfield        #27  <Field String key>
	//   25   43:invokevirtual   #37  <Method boolean String.equals(Object)>
	//   26   46:ireturn         
			return ((CacheReference) (obj)).key == null;
	//   27   47:aload_1         
	//   28   48:getfield        #27  <Field String key>
	//   29   51:ifnonnull       56
	//   30   54:iconst_1        
	//   31   55:ireturn         
	//   32   56:iconst_0        
	//   33   57:ireturn         
		} else
		{
			return false;
	//   34   58:iconst_0        
	//   35   59:ireturn         
		}
	}

	public int hashCode()
	{
		String s = key;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String key>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return s.hashCode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #41  <Method int String.hashCode()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public String key()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String key>
	//    2    4:areturn         
	}

	public String toString()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String key>
	//    2    4:areturn         
	}

	private static final Pattern SERIALIZATION_REGEX_PATTERN = Pattern.compile("ApolloCacheReference\\{(.*)\\}");
	private final String key;

	static 
	{
	//    0    0:ldc1            #12  <String "ApolloCacheReference\\{(.*)\\}">
	//    1    2:invokestatic    #18  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #20  <Field Pattern SERIALIZATION_REGEX_PATTERN>
	//*   3    8:return          
	}
}
