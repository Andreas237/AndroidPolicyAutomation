// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class Strings
{

	private Strings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static String emptyToNull(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #32  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    6:ifeq            11
			s1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		return s1;
	//    7   11:aload_1         
	//    8   12:areturn         
	}

	public static boolean isEmptyOrWhitespace(String s)
	{
		return s == null || s.trim().isEmpty();
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:aload_0         
	//    3    5:invokevirtual   #41  <Method String String.trim()>
	//    4    8:invokevirtual   #44  <Method boolean String.isEmpty()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private static final Pattern zzhf = Pattern.compile("\\$\\{(.*?)\\}");

	static 
	{
	//    0    0:ldc1            #12  <String "\\$\\{(.*?)\\}">
	//    1    2:invokestatic    #18  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #20  <Field Pattern zzhf>
	//*   3    8:return          
	}
}
