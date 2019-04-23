// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Process;

// Referenced classes of package com.craftar:
//			VideoCaptureConsumerHub

private class VideoCaptureConsumerHub$ProcessNewFrameRunnable
	implements Runnable
{

	public void run()
	{
		Process.setThreadPriority(Process.myTid(), -8);
	//    0    0:invokestatic    #33  <Method int Process.myTid()>
	//    1    3:bipush          -8
	//    2    5:invokestatic    #37  <Method void Process.setThreadPriority(int, int)>
		VideoCaptureConsumerHub.access$100(VideoCaptureConsumerHub.this, mBuffer);
	//    3    8:aload_0         
	//    4    9:getfield        #19  <Field VideoCaptureConsumerHub this$0>
	//    5   12:aload_0         
	//    6   13:getfield        #39  <Field byte[] mBuffer>
	//    7   16:invokestatic    #43  <Method void VideoCaptureConsumerHub.access$100(VideoCaptureConsumerHub, byte[])>
	//    8   19:return          
	}

	void set(byte abyte0[], long l)
	{
		mPostTime = l;
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:putfield        #47  <Field long mPostTime>
		mBuffer = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #39  <Field byte[] mBuffer>
	//    6   10:return          
	}

	byte mBuffer[];
	long mPostTime;
	final VideoCaptureConsumerHub this$0;

	private VideoCaptureConsumerHub$ProcessNewFrameRunnable()
	{
		this$0 = VideoCaptureConsumerHub.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field VideoCaptureConsumerHub this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}

	VideoCaptureConsumerHub$ProcessNewFrameRunnable(VideoCaptureConsumerHub._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void VideoCaptureConsumerHub$ProcessNewFrameRunnable(VideoCaptureConsumerHub)>
	//    3    5:return          
	}
}
