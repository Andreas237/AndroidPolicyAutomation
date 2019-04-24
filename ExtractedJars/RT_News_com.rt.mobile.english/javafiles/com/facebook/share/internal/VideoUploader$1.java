// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//			VideoUploader

static final class VideoUploader$1 extends AccessTokenTracker
{

	protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
	{
		if(accesstoken == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(accesstoken1 == null || !Utility.areObjectsEqual(((Object) (accesstoken1.getUserId())), ((Object) (accesstoken.getUserId()))))
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #21  <Method String AccessToken.getUserId()>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #21  <Method String AccessToken.getUserId()>
	//*   9   17:invokestatic    #27  <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  10   20:ifne            26
			VideoUploader.access$200();
	//   11   23:invokestatic    #30  <Method void VideoUploader.access$200()>
	//   12   26:return          
	}

	VideoUploader$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AccessTokenTracker()>
	//    2    4:return          
	}
}
