// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.manager.Lifecycle;

// Referenced classes of package com.bumptech.glide:
//			RequestManager

class RequestManager$1
	implements Runnable
{

	public void run()
	{
		lifecycle.addListener(((com.bumptech.glide.manager.LifecycleListener) (RequestManager.this)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RequestManager this$0>
	//    2    4:getfield        #23  <Field Lifecycle RequestManager.lifecycle>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field RequestManager this$0>
	//    5   11:invokeinterface #29  <Method void Lifecycle.addListener(com.bumptech.glide.manager.LifecycleListener)>
	//    6   16:return          
	}

	final RequestManager this$0;

	RequestManager$1()
	{
		this$0 = RequestManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RequestManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
