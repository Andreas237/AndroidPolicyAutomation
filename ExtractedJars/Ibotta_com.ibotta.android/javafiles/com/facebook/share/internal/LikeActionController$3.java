// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Intent;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

static final class LikeActionController$3
	implements com.facebook.internal.lback
{

	public boolean onActivityResult(int i, Intent intent)
	{
		return LikeActionController.handleOnActivityResult(com.facebook.internal.uestCodeOffset.Like.toRequestCode(), i, intent);
	//    0    0:getstatic       #23  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Like>
	//    1    3:invokevirtual   #27  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:iload_1         
	//    3    7:aload_2         
	//    4    8:invokestatic    #31  <Method boolean LikeActionController.handleOnActivityResult(int, int, Intent)>
	//    5   11:ireturn         
	}

	LikeActionController$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
