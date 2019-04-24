// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Utf8Charset
{

	public Utf8Charset()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] encodeUTF8(String s)
	{
		try
		{
			s = ((String) (s.getBytes("UTF-8")));
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "UTF-8">
	//    2    3:invokevirtual   #33  <Method byte[] String.getBytes(String)>
	//    3    6:astore_0        
		}
	//*   4    7:aload_0         
	//*   5    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    9:astore_0        
		{
			throw new RuntimeException(((Throwable) (s)));
	//    7   10:new             #35  <Class RuntimeException>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:invokespecial   #38  <Method void RuntimeException(Throwable)>
	//   11   18:athrow          
		}
		return ((byte []) (s));
	}

	public static final Charset INSTANCE = Charset.forName("UTF-8");
	public static final String NAME = "UTF-8";

	static 
	{
	//    0    0:ldc1            #10  <String "UTF-8">
	//    1    2:invokestatic    #18  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #20  <Field Charset INSTANCE>
	//*   3    8:return          
	}
}
