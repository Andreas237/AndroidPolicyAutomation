// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import com.facebook.stetho.common.UncheckedCallable;

// Referenced classes of package com.facebook.stetho.common.android:
//			HandlerUtil

static final class HandlerUtil$1 extends itableRunnable
{

	protected Object onRun()
	{
		return val$c.call();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field UncheckedCallable val$c>
	//    2    4:invokeinterface #27  <Method Object UncheckedCallable.call()>
	//    3    9:areturn         
	}

	final UncheckedCallable val$c;

	HandlerUtil$1(UncheckedCallable uncheckedcallable)
	{
		val$c = uncheckedcallable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field UncheckedCallable val$c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void HandlerUtil$WaitableRunnable()>
	//    5    9:return          
	}
}
