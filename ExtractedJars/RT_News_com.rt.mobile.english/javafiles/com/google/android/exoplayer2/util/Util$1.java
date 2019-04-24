// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.exoplayer2.util:
//			Util

static final class Util$1
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		return new Thread(runnable, val$threadName);
	//    0    0:new             #26  <Class Thread>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field String val$threadName>
	//    5    9:invokespecial   #29  <Method void Thread(Runnable, String)>
	//    6   12:areturn         
	}

	final String val$threadName;

	Util$1(String s)
	{
		val$threadName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field String val$threadName>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
