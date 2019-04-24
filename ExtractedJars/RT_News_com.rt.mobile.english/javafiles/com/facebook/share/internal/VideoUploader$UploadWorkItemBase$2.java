// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.FacebookException;

// Referenced classes of package com.facebook.share.internal:
//			VideoUploader

class VideoUploader$UploadWorkItemBase$2
	implements Runnable
{

	public void run()
	{
		VideoUploader.access$900(uploadContext, val$error, val$videoId);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field VideoUploader$UploadWorkItemBase this$0>
	//    2    4:getfield        #37  <Field VideoUploader$UploadContext VideoUploader$UploadWorkItemBase.uploadContext>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field FacebookException val$error>
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field String val$videoId>
	//    7   15:invokestatic    #41  <Method void VideoUploader.access$900(VideoUploader$UploadContext, FacebookException, String)>
	//    8   18:return          
	}

	final VideoUploader.UploadWorkItemBase this$0;
	final FacebookException val$error;
	final String val$videoId;

	VideoUploader$UploadWorkItemBase$2()
	{
		this$0 = final_uploadworkitembase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field VideoUploader$UploadWorkItemBase this$0>
		val$error = facebookexception;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field FacebookException val$error>
		val$videoId = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field String val$videoId>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
