// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util.pool;


public final class GlideTrace
{

	private GlideTrace()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static void beginSection(String s)
	{
	//    0    0:return          
	}

	public static void beginSectionFormat(String s, Object obj)
	{
	//    0    0:return          
	}

	public static void beginSectionFormat(String s, Object obj, Object obj1)
	{
	//    0    0:return          
	}

	public static void beginSectionFormat(String s, Object obj, Object obj1, Object obj2)
	{
	//    0    0:return          
	}

	public static void endSection()
	{
	//    0    0:return          
	}

	private static String truncateTag(String s)
	{
		if(s.length() > 127)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #30  <Method int String.length()>
	//*   2    4:bipush          127
	//*   3    6:icmple          17
			return s.substring(0, 126);
	//    4    9:aload_0         
	//    5   10:iconst_0        
	//    6   11:bipush          126
	//    7   13:invokevirtual   #34  <Method String String.substring(int, int)>
	//    8   16:areturn         
		else
			return s;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	private static final int MAX_LENGTH = 127;
	private static final boolean TRACING_ENABLED = false;
}
