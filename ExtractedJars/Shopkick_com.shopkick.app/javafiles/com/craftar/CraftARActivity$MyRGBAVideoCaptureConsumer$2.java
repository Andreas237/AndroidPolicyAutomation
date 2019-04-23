// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARActivity

class CraftARActivity$MyRGBAVideoCaptureConsumer$2
	implements Runnable
{

	public void run()
	{
		mActivity.onCameraOpenFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field CraftARActivity$MyRGBAVideoCaptureConsumer this$1>
	//    2    4:getfield        #28  <Field CraftARActivity CraftARActivity$MyRGBAVideoCaptureConsumer.mActivity>
	//    3    7:invokevirtual   #29  <Method void CraftARActivity.onCameraOpenFailed()>
	//    4   10:return          
	}

	final CraftARActivity.MyRGBAVideoCaptureConsumer this$1;

	CraftARActivity$MyRGBAVideoCaptureConsumer$2()
	{
		this$1 = CraftARActivity.MyRGBAVideoCaptureConsumer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CraftARActivity$MyRGBAVideoCaptureConsumer this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
