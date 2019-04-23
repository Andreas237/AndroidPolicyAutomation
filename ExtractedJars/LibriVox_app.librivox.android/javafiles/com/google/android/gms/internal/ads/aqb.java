// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

abstract class aqb
{

	aqb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public abstract void a(Throwable throwable);

	public abstract void a(Throwable throwable, PrintWriter printwriter);

	private static final Throwable a[] = new Throwable[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Throwable[]
	//    2    4:putstatic       #12  <Field Throwable[] a>
	//*   3    7:return          
	}
}
