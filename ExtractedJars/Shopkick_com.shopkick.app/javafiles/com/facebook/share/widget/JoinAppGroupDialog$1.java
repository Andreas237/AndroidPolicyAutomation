// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.share.internal.ResultProcessor;

// Referenced classes of package com.facebook.share.widget:
//			JoinAppGroupDialog

class JoinAppGroupDialog$1 extends ResultProcessor
{

	public void onSuccess(AppCall appcall, Bundle bundle)
	{
		val$callback.onSuccess(((Object) (new sult(bundle, ((JoinAppGroupDialog$1) (null))))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FacebookCallback val$callback>
	//    2    4:new             #27  <Class JoinAppGroupDialog$Result>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #30  <Method void JoinAppGroupDialog$Result(Bundle, JoinAppGroupDialog$1)>
	//    7   13:invokeinterface #35  <Method void FacebookCallback.onSuccess(Object)>
	//    8   18:return          
	}

	final JoinAppGroupDialog this$0;
	final FacebookCallback val$callback;

	JoinAppGroupDialog$1(FacebookCallback facebookcallback1)
	{
		this$0 = final_joinappgroupdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field JoinAppGroupDialog this$0>
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
