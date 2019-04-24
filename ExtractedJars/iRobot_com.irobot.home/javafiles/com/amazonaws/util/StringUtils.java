// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.util;

import java.nio.charset.Charset;
import java.util.Locale;

public class StringUtils
{

	public static String a(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(s.isEmpty())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #26  <Method boolean String.isEmpty()>
	//*   6   10:ifeq            16
			return "";
	//    7   13:ldc1            #28  <String "">
	//    8   15:areturn         
		else
			return s.toLowerCase(Locale.ENGLISH);
	//    9   16:aload_0         
	//   10   17:getstatic       #34  <Field Locale Locale.ENGLISH>
	//   11   20:invokevirtual   #38  <Method String String.toLowerCase(Locale)>
	//   12   23:areturn         
	}

	public static final Charset a = Charset.forName("UTF-8");

	static 
	{
	//    0    0:ldc1            #10  <String "UTF-8">
	//    1    2:invokestatic    #16  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #18  <Field Charset a>
	//*   3    8:return          
	}
}
