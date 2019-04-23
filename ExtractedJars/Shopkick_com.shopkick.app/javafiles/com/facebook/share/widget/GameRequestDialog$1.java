// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.share.internal.ResultProcessor;

// Referenced classes of package com.facebook.share.widget:
//			GameRequestDialog

class GameRequestDialog$1 extends ResultProcessor
{

	public void onSuccess(AppCall appcall, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          23
		{
			val$callback.onSuccess(((Object) (new sult(bundle, ((GameRequestDialog$1) (null))))));
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field FacebookCallback val$callback>
	//    4    8:new             #27  <Class GameRequestDialog$Result>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #30  <Method void GameRequestDialog$Result(Bundle, GameRequestDialog$1)>
	//    9   17:invokeinterface #35  <Method void FacebookCallback.onSuccess(Object)>
			return;
	//   10   22:return          
		} else
		{
			onCancel(appcall);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #39  <Method void onCancel(AppCall)>
			return;
	//   14   28:return          
		}
	}

	final GameRequestDialog this$0;
	final FacebookCallback val$callback;

	GameRequestDialog$1(FacebookCallback facebookcallback1)
	{
		this$0 = final_gamerequestdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GameRequestDialog this$0>
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
