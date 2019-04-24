// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;

// Referenced classes of package com.facebook.share.widget:
//			AppInviteDialog

class AppInviteDialog$1 extends ResultProcessor
{

	public void onSuccess(AppCall appcall, Bundle bundle)
	{
		if("cancel".equalsIgnoreCase(ShareInternalUtility.getNativeDialogCompletionGesture(bundle)))
	//*   0    0:ldc1            #27  <String "cancel">
	//*   1    2:aload_2         
	//*   2    3:invokestatic    #33  <Method String ShareInternalUtility.getNativeDialogCompletionGesture(Bundle)>
	//*   3    6:invokevirtual   #39  <Method boolean String.equalsIgnoreCase(String)>
	//*   4    9:ifeq            22
		{
			val$callback.onCancel();
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field FacebookCallback val$callback>
	//    7   16:invokeinterface #45  <Method void FacebookCallback.onCancel()>
			return;
	//    8   21:return          
		} else
		{
			val$callback.onSuccess(((Object) (new sult(bundle))));
	//    9   22:aload_0         
	//   10   23:getfield        #19  <Field FacebookCallback val$callback>
	//   11   26:new             #47  <Class AppInviteDialog$Result>
	//   12   29:dup             
	//   13   30:aload_2         
	//   14   31:invokespecial   #50  <Method void AppInviteDialog$Result(Bundle)>
	//   15   34:invokeinterface #53  <Method void FacebookCallback.onSuccess(Object)>
			return;
	//   16   39:return          
		}
	}

	final AppInviteDialog this$0;
	final FacebookCallback val$callback;

	AppInviteDialog$1(FacebookCallback facebookcallback1)
	{
		this$0 = final_appinvitedialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppInviteDialog this$0>
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
