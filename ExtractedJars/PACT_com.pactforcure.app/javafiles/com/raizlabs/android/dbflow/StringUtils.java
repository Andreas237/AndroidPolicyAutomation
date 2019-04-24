// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow;


public class StringUtils
{

	public StringUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isNotNullOrEmpty(String s)
	{
		return s != null && !s.equals("") && s.length() > 0;
	//    0    0:aload_0         
	//    1    1:ifnull          22
	//    2    4:aload_0         
	//    3    5:ldc1            #13  <String "">
	//    4    7:invokevirtual   #19  <Method boolean String.equals(Object)>
	//    5   10:ifne            22
	//    6   13:aload_0         
	//    7   14:invokevirtual   #23  <Method int String.length()>
	//    8   17:ifle            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	public static boolean isNullOrEmpty(String s)
	{
		return s == null || s.equals("") || s.length() <= 0;
	//    0    0:aload_0         
	//    1    1:ifnull          20
	//    2    4:aload_0         
	//    3    5:ldc1            #13  <String "">
	//    4    7:invokevirtual   #19  <Method boolean String.equals(Object)>
	//    5   10:ifne            20
	//    6   13:aload_0         
	//    7   14:invokevirtual   #23  <Method int String.length()>
	//    8   17:ifgt            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}
}
