// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.request.RequestFutureTarget;

// Referenced classes of package com.bumptech.glide:
//			RequestBuilder

class RequestBuilder$1
	implements Runnable
{

	public void run()
	{
		if(!val$target.isCancelled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field RequestFutureTarget val$target>
	//*   2    4:invokevirtual   #32  <Method boolean RequestFutureTarget.isCancelled()>
	//*   3    7:ifne            27
		{
			RequestBuilder requestbuilder = RequestBuilder.this;
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field RequestBuilder this$0>
	//    6   14:astore_1        
			RequestFutureTarget requestfuturetarget = val$target;
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field RequestFutureTarget val$target>
	//    9   19:astore_2        
			requestbuilder.into(((com.bumptech.glide.request.target.Target) (requestfuturetarget)), ((com.bumptech.glide.request.RequestListener) (requestfuturetarget)));
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #36  <Method com.bumptech.glide.request.target.Target RequestBuilder.into(com.bumptech.glide.request.target.Target, com.bumptech.glide.request.RequestListener)>
	//   14   26:pop             
		}
	//   15   27:return          
	}

	final RequestBuilder this$0;
	final RequestFutureTarget val$target;

	RequestBuilder$1()
	{
		this$0 = final_requestbuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RequestBuilder this$0>
		val$target = RequestFutureTarget.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field RequestFutureTarget val$target>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
