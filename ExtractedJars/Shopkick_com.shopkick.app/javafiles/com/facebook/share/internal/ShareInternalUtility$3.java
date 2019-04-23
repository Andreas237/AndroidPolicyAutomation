// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.FacebookCallback;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

static final class ShareInternalUtility$3
	implements com.facebook.internal.lback
{

	public boolean onActivityResult(int i, Intent intent)
	{
		return ShareInternalUtility.handleActivityResult(val$requestCode, i, intent, ShareInternalUtility.getShareResultProcessor(val$callback));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int val$requestCode>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field FacebookCallback val$callback>
	//    6   10:invokestatic    #31  <Method ResultProcessor ShareInternalUtility.getShareResultProcessor(FacebookCallback)>
	//    7   13:invokestatic    #35  <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
	//    8   16:ireturn         
	}

	final FacebookCallback val$callback;
	final int val$requestCode;

	ShareInternalUtility$3(int i, FacebookCallback facebookcallback)
	{
		val$requestCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int val$requestCode>
		val$callback = facebookcallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FacebookCallback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
