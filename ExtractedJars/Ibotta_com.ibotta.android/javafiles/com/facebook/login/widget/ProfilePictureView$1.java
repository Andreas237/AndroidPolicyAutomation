// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import com.facebook.internal.ImageResponse;

// Referenced classes of package com.facebook.login.widget:
//			ProfilePictureView

class ProfilePictureView$1
	implements com.facebook.internal.
{

	public void onCompleted(ImageResponse imageresponse)
	{
		ProfilePictureView.access$000(ProfilePictureView.this, imageresponse);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ProfilePictureView this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void ProfilePictureView.access$000(ProfilePictureView, ImageResponse)>
	//    4    8:return          
	}

	final ProfilePictureView this$0;

	ProfilePictureView$1()
	{
		this$0 = ProfilePictureView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ProfilePictureView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
