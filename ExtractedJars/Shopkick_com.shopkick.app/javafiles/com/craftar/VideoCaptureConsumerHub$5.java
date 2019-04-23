// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			VideoCaptureConsumerHub

class VideoCaptureConsumerHub$5
	implements Runnable
{

	public void run()
	{
		VideoCaptureConsumerHub.access$700(VideoCaptureConsumerHub.this, val$data, val$width, val$height, val$pictureFormat);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field VideoCaptureConsumerHub this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field byte[] val$data>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field int val$width>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field int val$height>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field int val$pictureFormat>
	//   10   20:invokestatic    #39  <Method void VideoCaptureConsumerHub.access$700(VideoCaptureConsumerHub, byte[], int, int, int)>
	//   11   23:return          
	}

	final VideoCaptureConsumerHub this$0;
	final byte val$data[];
	final int val$height;
	final int val$pictureFormat;
	final int val$width;

	VideoCaptureConsumerHub$5()
	{
		this$0 = final_videocaptureconsumerhub;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field VideoCaptureConsumerHub this$0>
		val$data = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field byte[] val$data>
		val$width = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int val$width>
		val$height = j;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #29  <Field int val$height>
		val$pictureFormat = I.this;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #31  <Field int val$pictureFormat>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #34  <Method void Object()>
	//   17   31:return          
	}
}
