// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			VideoCaptureConsumerHub, CraftARError

class VideoCaptureConsumerHub$4
	implements Runnable
{

	public void run()
	{
		VideoCaptureConsumerHub.access$600(VideoCaptureConsumerHub.this, val$error);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field VideoCaptureConsumerHub this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field CraftARError val$error>
	//    4    8:invokestatic    #29  <Method void VideoCaptureConsumerHub.access$600(VideoCaptureConsumerHub, CraftARError)>
	//    5   11:return          
	}

	final VideoCaptureConsumerHub this$0;
	final CraftARError val$error;

	VideoCaptureConsumerHub$4()
	{
		this$0 = final_videocaptureconsumerhub;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field VideoCaptureConsumerHub this$0>
		val$error = CraftARError.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CraftARError val$error>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
