// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;


// Referenced classes of package com.google.android.exoplayer.drm:
//			FrameworkMediaDrm

class FrameworkMediaDrm$3
	implements nRequest
{

	public byte[] getData()
	{
		return val$provisionRequest.getData();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field android.media.MediaDrm$ProvisionRequest val$provisionRequest>
	//    2    4:invokevirtual   #31  <Method byte[] android.media.MediaDrm$ProvisionRequest.getData()>
	//    3    7:areturn         
	}

	public String getDefaultUrl()
	{
		return val$provisionRequest.getDefaultUrl();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field android.media.MediaDrm$ProvisionRequest val$provisionRequest>
	//    2    4:invokevirtual   #35  <Method String android.media.MediaDrm$ProvisionRequest.getDefaultUrl()>
	//    3    7:areturn         
	}

	final FrameworkMediaDrm this$0;
	final android.media.quest val$provisionRequest;

	FrameworkMediaDrm$3()
	{
		this$0 = final_frameworkmediadrm;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FrameworkMediaDrm this$0>
		val$provisionRequest = android.media.quest.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field android.media.MediaDrm$ProvisionRequest val$provisionRequest>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
