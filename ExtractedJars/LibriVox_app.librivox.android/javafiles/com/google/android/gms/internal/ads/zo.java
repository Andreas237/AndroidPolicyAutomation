// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class zo
{

	private zo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static zo a()
	{
		if(b == null)
	//*   0    0:getstatic       #21  <Field zo b>
	//*   1    3:ifnonnull       16
			b = new zo();
	//    2    6:new             #2   <Class zo>
	//    3    9:dup             
	//    4   10:invokespecial   #22  <Method void zo()>
	//    5   13:putstatic       #21  <Field zo b>
		return b;
	//    6   16:getstatic       #21  <Field zo b>
	//    7   19:areturn         
	}

	private static zo b;
	String a;

	static 
	{
	//    0    0:return          
	}
}
