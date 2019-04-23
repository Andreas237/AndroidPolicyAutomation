// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


final class qy extends Exception
{

	public qy(String s, int i)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void Exception(String)>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #14  <Field int a>
	//    6   10:return          
	}

	public final int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int a>
	//    2    4:ireturn         
	}

	private final int a;
}
