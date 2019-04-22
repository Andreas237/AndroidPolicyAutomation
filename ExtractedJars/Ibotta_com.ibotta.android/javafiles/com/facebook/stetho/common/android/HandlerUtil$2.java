// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;


// Referenced classes of package com.facebook.stetho.common.android:
//			HandlerUtil

static final class HandlerUtil$2 extends itableRunnable
{

	protected volatile Object onRun()
	{
		return ((Object) (onRun()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method Void onRun()>
	//    2    4:areturn         
	}

	protected Void onRun()
	{
		val$r.run();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Runnable val$r>
	//    2    4:invokeinterface #30  <Method void Runnable.run()>
		return null;
	//    3    9:aconst_null     
	//    4   10:areturn         
	}

	final Runnable val$r;

	HandlerUtil$2(Runnable runnable)
	{
		val$r = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Runnable val$r>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void HandlerUtil$WaitableRunnable()>
	//    5    9:return          
	}
}
