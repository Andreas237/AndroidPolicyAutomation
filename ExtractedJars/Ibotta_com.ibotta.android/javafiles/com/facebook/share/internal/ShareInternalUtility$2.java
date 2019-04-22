// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Intent;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

static final class ShareInternalUtility$2
	implements com.facebook.internal.lback
{

	public boolean onActivityResult(int i, Intent intent)
	{
		return ShareInternalUtility.handleActivityResult(val$requestCode, i, intent, ShareInternalUtility.getShareResultProcessor(((com.facebook.FacebookCallback) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int val$requestCode>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokestatic    #26  <Method ResultProcessor ShareInternalUtility.getShareResultProcessor(com.facebook.FacebookCallback)>
	//    6   10:invokestatic    #30  <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
	//    7   13:ireturn         
	}

	final int val$requestCode;

	ShareInternalUtility$2(int i)
	{
		val$requestCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field int val$requestCode>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
