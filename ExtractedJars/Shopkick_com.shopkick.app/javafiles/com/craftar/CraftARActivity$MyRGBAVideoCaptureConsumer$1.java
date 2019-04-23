// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARActivity

class CraftARActivity$MyRGBAVideoCaptureConsumer$1
	implements Runnable
{

	public void run()
	{
		mActivity.onPreviewStarted(val$width, val$height);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CraftARActivity$MyRGBAVideoCaptureConsumer this$1>
	//    2    4:getfield        #36  <Field CraftARActivity CraftARActivity$MyRGBAVideoCaptureConsumer.mActivity>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field int val$width>
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field int val$height>
	//    7   15:invokevirtual   #39  <Method void CraftARActivity.onPreviewStarted(int, int)>
	//    8   18:return          
	}

	final CraftARActivity.MyRGBAVideoCaptureConsumer this$1;
	final int val$height;
	final int val$width;

	CraftARActivity$MyRGBAVideoCaptureConsumer$1()
	{
		this$1 = final_myrgbavideocaptureconsumer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CraftARActivity$MyRGBAVideoCaptureConsumer this$1>
		val$width = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field int val$width>
		val$height = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int val$height>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:return          
	}
}
