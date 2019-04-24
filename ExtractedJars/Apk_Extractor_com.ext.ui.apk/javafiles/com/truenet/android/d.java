// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.ae;
import android.support.v7.w;

final class d
	implements Thread.UncaughtExceptionHandler
{

	d(w w1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = w1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field w a>
	//    5    9:return          
	}

	public final void uncaughtException(Thread thread, Throwable throwable)
	{
		ae.a(a.a(((Object) (thread)), ((Object) (throwable))), "invoke(...)");
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field w a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #23  <Method Object w.a(Object, Object)>
	//    5   11:ldc1            #25  <String "invoke(...)">
	//    6   13:invokestatic    #30  <Method void ae.a(Object, String)>
	//    7   16:return          
	}

	private final w a;
}
