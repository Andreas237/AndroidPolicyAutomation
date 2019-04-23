// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class abl
	implements Executor
{

	abl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final void execute(Runnable runnable)
	{
		runnable.run();
	//    0    0:aload_1         
	//    1    1:invokeinterface #18  <Method void Runnable.run()>
	//    2    6:return          
	}
}
