// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;


// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSessionEventListener

class DefaultDrmSessionEventListener$EventDispatcher$2
	implements Runnable
{

	public void run()
	{
		val$listener.onDrmSessionManagerError(val$e);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field DefaultDrmSessionEventListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Exception val$e>
	//    4    8:invokeinterface #36  <Method void DefaultDrmSessionEventListener.onDrmSessionManagerError(Exception)>
	//    5   13:return          
	}

	final DefaultDrmSessionEventListener.EventDispatcher this$0;
	final Exception val$e;
	final DefaultDrmSessionEventListener val$listener;

	DefaultDrmSessionEventListener$EventDispatcher$2()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field DefaultDrmSessionEventListener$EventDispatcher this$0>
		val$listener = defaultdrmsessioneventlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field DefaultDrmSessionEventListener val$listener>
		val$e = Exception.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Exception val$e>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
