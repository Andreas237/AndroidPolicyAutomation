// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.share.model.SharePhoto;

// Referenced classes of package com.facebook.share.internal:
//			WebDialogParameters

static final class WebDialogParameters$1
	implements com.facebook.internal.Utility.Mapper
{

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((SharePhoto)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class SharePhoto>
	//    3    5:invokevirtual   #24  <Method String apply(SharePhoto)>
	//    4    8:areturn         
	}

	public String apply(SharePhoto sharephoto)
	{
		return sharephoto.getImageUrl().toString();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method Uri SharePhoto.getImageUrl()>
	//    2    4:invokevirtual   #34  <Method String Uri.toString()>
	//    3    7:areturn         
	}

	WebDialogParameters$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
