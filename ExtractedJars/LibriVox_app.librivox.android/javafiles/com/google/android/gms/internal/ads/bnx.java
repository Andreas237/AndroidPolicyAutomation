// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class bnx
	implements ThreadFactory
{

	bnx(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field String a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final Thread newThread(Runnable runnable)
	{
		return new Thread(runnable, a);
	//    0    0:new             #20  <Class Thread>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field String a>
	//    5    9:invokespecial   #23  <Method void Thread(Runnable, String)>
	//    6   12:areturn         
	}

	private final String a;
}
