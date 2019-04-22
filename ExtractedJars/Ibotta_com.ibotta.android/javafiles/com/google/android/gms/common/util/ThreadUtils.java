// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.os.Looper;

public class ThreadUtils
{

	private ThreadUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isMainThread()
	{
		return Looper.getMainLooper() == Looper.myLooper();
	//    0    0:invokestatic    #17  <Method Looper Looper.getMainLooper()>
	//    1    3:invokestatic    #20  <Method Looper Looper.myLooper()>
	//    2    6:if_acmpne       11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}
}
