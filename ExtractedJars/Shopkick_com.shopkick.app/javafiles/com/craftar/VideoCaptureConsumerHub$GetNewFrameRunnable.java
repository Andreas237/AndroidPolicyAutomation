// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;

// Referenced classes of package com.craftar:
//			VideoCaptureConsumerHub, CameraThread

private class VideoCaptureConsumerHub$GetNewFrameRunnable
	implements Runnable
{

	public void run()
	{
		byte abyte0[] = CameraThread.Instance(((android.content.Context) (null))).getLastFrame(((byte []) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #29  <Method CameraThread CameraThread.Instance(android.content.Context)>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #33  <Method byte[] CameraThread.getLastFrame(byte[])>
	//    4    8:astore_1        
		if(abyte0 != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          46
		{
			VideoCaptureConsumerHub.access$200(VideoCaptureConsumerHub.this).set(abyte0, System.currentTimeMillis());
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field VideoCaptureConsumerHub this$0>
	//    9   17:invokestatic    #37  <Method VideoCaptureConsumerHub$ProcessNewFrameRunnable VideoCaptureConsumerHub.access$200(VideoCaptureConsumerHub)>
	//   10   20:aload_1         
	//   11   21:invokestatic    #43  <Method long System.currentTimeMillis()>
	//   12   24:invokevirtual   #49  <Method void VideoCaptureConsumerHub$ProcessNewFrameRunnable.set(byte[], long)>
			mHandler.post(((Runnable) (VideoCaptureConsumerHub.access$200(VideoCaptureConsumerHub.this))));
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field VideoCaptureConsumerHub this$0>
	//   15   31:getfield        #53  <Field Handler VideoCaptureConsumerHub.mHandler>
	//   16   34:aload_0         
	//   17   35:getfield        #15  <Field VideoCaptureConsumerHub this$0>
	//   18   38:invokestatic    #37  <Method VideoCaptureConsumerHub$ProcessNewFrameRunnable VideoCaptureConsumerHub.access$200(VideoCaptureConsumerHub)>
	//   19   41:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
	//   20   44:pop             
			return;
	//   21   45:return          
		} else
		{
			mHandler.postDelayed(((Runnable) (this)), 10L);
	//   22   46:aload_0         
	//   23   47:getfield        #15  <Field VideoCaptureConsumerHub this$0>
	//   24   50:getfield        #53  <Field Handler VideoCaptureConsumerHub.mHandler>
	//   25   53:aload_0         
	//   26   54:ldc2w           #60  <Long 10L>
	//   27   57:invokevirtual   #65  <Method boolean Handler.postDelayed(Runnable, long)>
	//   28   60:pop             
			return;
	//   29   61:return          
		}
	}

	final VideoCaptureConsumerHub this$0;

	private VideoCaptureConsumerHub$GetNewFrameRunnable()
	{
		this$0 = VideoCaptureConsumerHub.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field VideoCaptureConsumerHub this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	VideoCaptureConsumerHub$GetNewFrameRunnable(VideoCaptureConsumerHub._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void VideoCaptureConsumerHub$GetNewFrameRunnable(VideoCaptureConsumerHub)>
	//    3    5:return          
	}
}
