// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//			VideoUploader

class VideoUploader$UploadWorkItemBase$1
	implements Runnable
{

	public void run()
	{
		enqueueRetry(completedRetries + 1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field VideoUploader$UploadWorkItemBase this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field VideoUploader$UploadWorkItemBase this$0>
	//    4    8:getfield        #29  <Field int VideoUploader$UploadWorkItemBase.completedRetries>
	//    5   11:iconst_1        
	//    6   12:iadd            
	//    7   13:invokevirtual   #33  <Method void VideoUploader$UploadWorkItemBase.enqueueRetry(int)>
	//    8   16:return          
	}

	final VideoUploader.UploadWorkItemBase this$0;

	VideoUploader$UploadWorkItemBase$1()
	{
		this$0 = VideoUploader.UploadWorkItemBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field VideoUploader$UploadWorkItemBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
