// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;


// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSessionEventListener

class DefaultDrmSessionEventListener$EventDispatcher$1
	implements Runnable
{

	public void run()
	{
		val$listener.onDrmKeysLoaded();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DefaultDrmSessionEventListener val$listener>
	//    2    4:invokeinterface #31  <Method void DefaultDrmSessionEventListener.onDrmKeysLoaded()>
	//    3    9:return          
	}

	final DefaultDrmSessionEventListener.EventDispatcher this$0;
	final DefaultDrmSessionEventListener val$listener;

	DefaultDrmSessionEventListener$EventDispatcher$1()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DefaultDrmSessionEventListener$EventDispatcher this$0>
		val$listener = DefaultDrmSessionEventListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field DefaultDrmSessionEventListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}