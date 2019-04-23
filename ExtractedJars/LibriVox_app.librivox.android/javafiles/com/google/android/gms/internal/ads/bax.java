// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class bax
	implements ThreadFactory
{

	bax()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #18  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    4    8:putfield        #20  <Field ThreadFactory a>
	//    5   11:return          
	}

	public final Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (a.newThread(runnable)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ThreadFactory a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method Thread ThreadFactory.newThread(Runnable)>
	//    4   10:astore_1        
		((Thread) (runnable)).setName(String.valueOf(((Object) (((Thread) (runnable)).getName()))).concat(":"));
	//    5   11:aload_1         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #31  <Method String Thread.getName()>
	//    8   16:invokestatic    #37  <Method String String.valueOf(Object)>
	//    9   19:ldc1            #39  <String ":">
	//   10   21:invokevirtual   #43  <Method String String.concat(String)>
	//   11   24:invokevirtual   #47  <Method void Thread.setName(String)>
		return ((Thread) (runnable));
	//   12   27:aload_1         
	//   13   28:areturn         
	}

	private final ThreadFactory a = Executors.defaultThreadFactory();
}
