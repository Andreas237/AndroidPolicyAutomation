// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;


public class Date
{

	public Date()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static long unixTime()
	{
		return System.currentTimeMillis();
	//    0    0:invokestatic    #16  <Method long System.currentTimeMillis()>
	//    1    3:lreturn         
	}
}
