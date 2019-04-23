// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			DefaultLoadControl

class DefaultLoadControl$1
	implements Runnable
{

	public void run()
	{
		DefaultLoadControl.access$000(DefaultLoadControl.this).onLoadingChanged(val$loading);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DefaultLoadControl this$0>
	//    2    4:invokestatic    #30  <Method DefaultLoadControl$EventListener DefaultLoadControl.access$000(DefaultLoadControl)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field boolean val$loading>
	//    5   11:invokeinterface #35  <Method void DefaultLoadControl$EventListener.onLoadingChanged(boolean)>
	//    6   16:return          
	}

	final DefaultLoadControl this$0;
	final boolean val$loading;

	DefaultLoadControl$1()
	{
		this$0 = final_defaultloadcontrol;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DefaultLoadControl this$0>
		val$loading = Z.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean val$loading>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
