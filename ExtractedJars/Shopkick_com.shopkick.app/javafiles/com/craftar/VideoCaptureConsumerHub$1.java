// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			VideoCaptureConsumerHub

class VideoCaptureConsumerHub$1
	implements Runnable
{

	public void run()
	{
		VideoCaptureConsumerHub.access$300(VideoCaptureConsumerHub.this, val$bufferSize, val$width, val$height);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field VideoCaptureConsumerHub this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int val$bufferSize>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int val$width>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field int val$height>
	//    8   16:invokestatic    #35  <Method void VideoCaptureConsumerHub.access$300(VideoCaptureConsumerHub, int, int, int)>
	//    9   19:return          
	}

	final VideoCaptureConsumerHub this$0;
	final int val$bufferSize;
	final int val$height;
	final int val$width;

	VideoCaptureConsumerHub$1()
	{
		this$0 = final_videocaptureconsumerhub;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field VideoCaptureConsumerHub this$0>
		val$bufferSize = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field int val$bufferSize>
		val$width = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$width>
		val$height = I.this;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #27  <Field int val$height>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
