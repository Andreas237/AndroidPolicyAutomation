// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARActivity

private class CraftARActivity$MyRGBAVideoCaptureConsumer
	implements sumer
{

	public void onCameraOpenFailed()
	{
		mActivity.runOnUiThread(new Runnable() {

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
);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field CraftARActivity mActivity>
	//    2    4:new             #13  <Class CraftARActivity$MyRGBAVideoCaptureConsumer$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #30  <Method void CraftARActivity$MyRGBAVideoCaptureConsumer$2(CraftARActivity$MyRGBAVideoCaptureConsumer)>
	//    6   12:invokevirtual   #34  <Method void CraftARActivity.runOnUiThread(Runnable)>
	//    7   15:return          
	}

	public void onPreviewRGBAFrame(byte abyte0[])
	{
		mActivity.onPreviewFrame(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field CraftARActivity mActivity>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method void CraftARActivity.onPreviewFrame(byte[])>
	//    4    8:return          
	}

	public void onPreviewStarted(int i, final int width, final int height)
	{
		mActivity.runOnUiThread(new Runnable() {

			public void run()
			{
				mActivity.onPreviewStarted(width, height);
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

			
			{
				this$1 = CraftARActivity.MyRGBAVideoCaptureConsumer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CraftARActivity$MyRGBAVideoCaptureConsumer this$1>
				width = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field int val$width>
				height = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int val$height>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field CraftARActivity mActivity>
	//    2    4:new             #11  <Class CraftARActivity$MyRGBAVideoCaptureConsumer$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #44  <Method void CraftARActivity$MyRGBAVideoCaptureConsumer$1(CraftARActivity$MyRGBAVideoCaptureConsumer, int, int)>
	//    8   14:invokevirtual   #34  <Method void CraftARActivity.runOnUiThread(Runnable)>
	//    9   17:return          
	}

	public void onProcessingDone()
	{
	//    0    0:return          
	}

	public void onReadyToSetPreviewDisplay(int i, int j)
	{
	//    0    0:return          
	}

	CraftARActivity mActivity;
	final CraftARActivity this$0;

	CraftARActivity$MyRGBAVideoCaptureConsumer(CraftARActivity craftaractivity1)
	{
		this$0 = CraftARActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CraftARActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		mActivity = craftaractivity1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field CraftARActivity mActivity>
	//    8   14:return          
	}
}
