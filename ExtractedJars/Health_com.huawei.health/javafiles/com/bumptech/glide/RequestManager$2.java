// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.request.target.Target;

// Referenced classes of package com.bumptech.glide:
//			RequestManager

class RequestManager$2
	implements Runnable
{

	public void run()
	{
		clear(val$target);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RequestManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Target val$target>
	//    4    8:invokevirtual   #27  <Method void RequestManager.clear(Target)>
	//    5   11:return          
	}

	final RequestManager this$0;
	final Target val$target;

	RequestManager$2()
	{
		this$0 = final_requestmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RequestManager this$0>
		val$target = Target.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Target val$target>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
