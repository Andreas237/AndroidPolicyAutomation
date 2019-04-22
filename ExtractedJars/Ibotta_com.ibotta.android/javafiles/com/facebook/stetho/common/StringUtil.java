// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;


public final class StringUtil
{

	private StringUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String removePrefix(String s, String s1)
	{
		if(s.startsWith(s1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #17  <Method boolean String.startsWith(String)>
	//*   3    5:ifeq            17
			return s.substring(s1.length());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #21  <Method int String.length()>
	//    7   13:invokevirtual   #25  <Method String String.substring(int)>
	//    8   16:areturn         
		else
			return s;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public static String removePrefix(String s, String s1, String s2)
	{
		if(s != s2)
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:if_acmpeq       7
			return s2;
	//    3    5:aload_2         
	//    4    6:areturn         
		else
			return removePrefix(s, s1);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokestatic    #28  <Method String removePrefix(String, String)>
	//    8   12:areturn         
	}
}
