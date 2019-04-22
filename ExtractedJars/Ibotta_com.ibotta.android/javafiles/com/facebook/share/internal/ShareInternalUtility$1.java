// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;

// Referenced classes of package com.facebook.share.internal:
//			ResultProcessor, ShareInternalUtility

static final class ShareInternalUtility$1 extends ResultProcessor
{

	public void onCancel(AppCall appcall)
	{
		ShareInternalUtility.invokeOnCancelCallback(val$callback);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FacebookCallback val$callback>
	//    2    4:invokestatic    #24  <Method void ShareInternalUtility.invokeOnCancelCallback(FacebookCallback)>
	//    3    7:return          
	}

	public void onError(AppCall appcall, FacebookException facebookexception)
	{
		ShareInternalUtility.invokeOnErrorCallback(val$callback, facebookexception);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FacebookCallback val$callback>
	//    2    4:aload_2         
	//    3    5:invokestatic    #30  <Method void ShareInternalUtility.invokeOnErrorCallback(FacebookCallback, FacebookException)>
	//    4    8:return          
	}

	public void onSuccess(AppCall appcall, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          72
		{
			appcall = ((AppCall) (ShareInternalUtility.getNativeDialogCompletionGesture(bundle)));
	//    2    4:aload_2         
	//    3    5:invokestatic    #36  <Method String ShareInternalUtility.getNativeDialogCompletionGesture(Bundle)>
	//    4    8:astore_1        
			if(appcall != null && !"post".equalsIgnoreCase(((String) (appcall))))
	//*   5    9:aload_1         
	//*   6   10:ifnull          59
	//*   7   13:ldc1            #38  <String "post">
	//*   8   15:aload_1         
	//*   9   16:invokevirtual   #44  <Method boolean String.equalsIgnoreCase(String)>
	//*  10   19:ifeq            25
	//*  11   22:goto            59
				if("cancel".equalsIgnoreCase(((String) (appcall))))
	//*  12   25:ldc1            #46  <String "cancel">
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #44  <Method boolean String.equalsIgnoreCase(String)>
	//*  15   31:ifeq            42
				{
					ShareInternalUtility.invokeOnCancelCallback(val$callback);
	//   16   34:aload_0         
	//   17   35:getfield        #15  <Field FacebookCallback val$callback>
	//   18   38:invokestatic    #24  <Method void ShareInternalUtility.invokeOnCancelCallback(FacebookCallback)>
					return;
	//   19   41:return          
				} else
				{
					ShareInternalUtility.invokeOnErrorCallback(val$callback, new FacebookException("UnknownError"));
	//   20   42:aload_0         
	//   21   43:getfield        #15  <Field FacebookCallback val$callback>
	//   22   46:new             #48  <Class FacebookException>
	//   23   49:dup             
	//   24   50:ldc1            #50  <String "UnknownError">
	//   25   52:invokespecial   #53  <Method void FacebookException(String)>
	//   26   55:invokestatic    #30  <Method void ShareInternalUtility.invokeOnErrorCallback(FacebookCallback, FacebookException)>
					return;
	//   27   58:return          
				}
			appcall = ((AppCall) (ShareInternalUtility.getShareDialogPostId(bundle)));
	//   28   59:aload_2         
	//   29   60:invokestatic    #56  <Method String ShareInternalUtility.getShareDialogPostId(Bundle)>
	//   30   63:astore_1        
			ShareInternalUtility.invokeOnSuccessCallback(val$callback, ((String) (appcall)));
	//   31   64:aload_0         
	//   32   65:getfield        #15  <Field FacebookCallback val$callback>
	//   33   68:aload_1         
	//   34   69:invokestatic    #60  <Method void ShareInternalUtility.invokeOnSuccessCallback(FacebookCallback, String)>
		}
	//   35   72:return          
	}

	final FacebookCallback val$callback;

	ShareInternalUtility$1(FacebookCallback facebookcallback, FacebookCallback facebookcallback1)
	{
		val$callback = facebookcallback1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field FacebookCallback val$callback>
		super(facebookcallback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #18  <Method void ResultProcessor(FacebookCallback)>
	//    6   10:return          
	}
}
