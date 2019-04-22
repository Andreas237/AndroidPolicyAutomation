// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Intent;

// Referenced classes of package com.facebook.share.internal:
//			LikeDialog, ShareInternalUtility, ResultProcessor

class LikeDialog$2
	implements com.facebook.internal.erImpl.Callback
{

	public boolean onActivityResult(int i, Intent intent)
	{
		return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, val$resultProcessor);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LikeDialog this$0>
	//    2    4:invokevirtual   #31  <Method int LikeDialog.getRequestCode()>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field ResultProcessor val$resultProcessor>
	//    7   13:invokestatic    #37  <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
	//    8   16:ireturn         
	}

	final LikeDialog this$0;
	final ResultProcessor val$resultProcessor;

	LikeDialog$2()
	{
		this$0 = final_likedialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LikeDialog this$0>
		val$resultProcessor = ResultProcessor.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ResultProcessor val$resultProcessor>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
