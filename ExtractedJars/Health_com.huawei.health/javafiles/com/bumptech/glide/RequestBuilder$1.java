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
	//*   3    7:ifne            22
			into(((com.bumptech.glide.request.target.Target) (val$target)));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field RequestBuilder this$0>
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field RequestFutureTarget val$target>
	//    8   18:invokevirtual   #36  <Method com.bumptech.glide.request.target.Target RequestBuilder.into(com.bumptech.glide.request.target.Target)>
	//    9   21:pop             
	//   10   22:return          
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
