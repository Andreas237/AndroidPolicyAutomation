// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws;

import java.util.concurrent.atomic.AtomicInteger;

public class SDKGlobalConfiguration
{

	public static int a()
	{
		return a.get();
	//    0    0:getstatic       #16  <Field AtomicInteger a>
	//    1    3:invokevirtual   #21  <Method int AtomicInteger.get()>
	//    2    6:ireturn         
	}

	private static final AtomicInteger a = new AtomicInteger(0);

	static 
	{
	//    0    0:new             #10  <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #14  <Method void AtomicInteger(int)>
	//    4    8:putstatic       #16  <Field AtomicInteger a>
	//*   5   11:return          
	}
}
