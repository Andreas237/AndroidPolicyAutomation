// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;

// Referenced classes of package com.facebook.share.internal:
//			ResultProcessor, LikeDialog

class LikeDialog$1 extends ResultProcessor
{

	public void onSuccess(AppCall appcall, Bundle bundle)
	{
		val$callback.onSuccess(((Object) (new sult(bundle))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FacebookCallback val$callback>
	//    2    4:new             #27  <Class LikeDialog$Result>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #30  <Method void LikeDialog$Result(Bundle)>
	//    6   12:invokeinterface #35  <Method void FacebookCallback.onSuccess(Object)>
	//    7   17:return          
	}

	final LikeDialog this$0;
	final FacebookCallback val$callback;

	LikeDialog$1(FacebookCallback facebookcallback1)
	{
		this$0 = final_likedialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LikeDialog this$0>
		val$callback = facebookcallback1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #19  <Field FacebookCallback val$callback>
		super(FacebookCallback.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #22  <Method void ResultProcessor(FacebookCallback)>
	//    9   15:return          
	}
}
