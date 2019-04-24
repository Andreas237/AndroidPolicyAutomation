// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker;


final class TextUtils
{

	TextUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isEmpty(CharSequence charsequence)
	{
		return charsequence == null || charsequence.length() == 0;
	//    0    0:aload_0         
	//    1    1:ifnull          18
	//    2    4:aload_0         
	//    3    5:invokeinterface #17  <Method int CharSequence.length()>
	//    4   10:ifne            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}
}
