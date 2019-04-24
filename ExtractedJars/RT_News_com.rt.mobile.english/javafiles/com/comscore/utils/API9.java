// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.os.Build;

public class API9
{

	public API9()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getSerial()
	{
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          9
	//*   2    5:icmplt          12
			return Build.SERIAL;
	//    3    8:getstatic       #26  <Field String Build.SERIAL>
	//    4   11:areturn         
		else
			return "";
	//    5   12:ldc1            #28  <String "">
	//    6   14:areturn         
	}
}
