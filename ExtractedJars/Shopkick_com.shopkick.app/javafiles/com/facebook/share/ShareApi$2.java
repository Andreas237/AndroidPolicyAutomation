// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import android.os.Bundle;
import com.facebook.*;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareOpenGraphAction;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$2
	implements com.facebook.internal.apper.OnMapperCompleteListener
{

	public void onComplete()
	{
		try
		{
			ShareApi.access$000(val$parameters);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Bundle val$parameters>
	//    2    4:invokestatic    #44  <Method void ShareApi.access$000(Bundle)>
			(new GraphRequest(AccessToken.getCurrentAccessToken(), ShareApi.access$100(ShareApi.this, URLEncoder.encode(val$action.getActionType(), "UTF-8")), val$parameters, HttpMethod.POST, val$requestCallback)).executeAsync();
	//    3    7:new             #46  <Class GraphRequest>
	//    4   10:dup             
	//    5   11:invokestatic    #52  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field ShareApi this$0>
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field ShareOpenGraphAction val$action>
	//   10   22:invokevirtual   #58  <Method String ShareOpenGraphAction.getActionType()>
	//   11   25:ldc1            #60  <String "UTF-8">
	//   12   27:invokestatic    #66  <Method String URLEncoder.encode(String, String)>
	//   13   30:invokestatic    #70  <Method String ShareApi.access$100(ShareApi, String)>
	//   14   33:aload_0         
	//   15   34:getfield        #27  <Field Bundle val$parameters>
	//   16   37:getstatic       #76  <Field HttpMethod HttpMethod.POST>
	//   17   40:aload_0         
	//   18   41:getfield        #31  <Field com.facebook.GraphRequest$Callback val$requestCallback>
	//   19   44:invokespecial   #79  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   20   47:invokevirtual   #83  <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   21   50:pop             
			return;
	//   22   51:return          
		}
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  23   52:astore_1        
		{
			ShareInternalUtility.invokeCallbackWithException(val$callback, ((Exception) (unsupportedencodingexception)));
	//   24   53:aload_0         
	//   25   54:getfield        #33  <Field FacebookCallback val$callback>
	//   26   57:aload_1         
	//   27   58:invokestatic    #89  <Method void ShareInternalUtility.invokeCallbackWithException(FacebookCallback, Exception)>
		}
	//   28   61:return          
	}

	public void onError(FacebookException facebookexception)
	{
		ShareInternalUtility.invokeCallbackWithException(val$callback, ((Exception) (facebookexception)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field FacebookCallback val$callback>
	//    2    4:aload_1         
	//    3    5:invokestatic    #89  <Method void ShareInternalUtility.invokeCallbackWithException(FacebookCallback, Exception)>
	//    4    8:return          
	}

	final ShareApi this$0;
	final ShareOpenGraphAction val$action;
	final FacebookCallback val$callback;
	final Bundle val$parameters;
	final com.facebook.t.Callback val$requestCallback;

	ShareApi$2()
	{
		this$0 = final_shareapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field ShareApi this$0>
		val$parameters = bundle;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field Bundle val$parameters>
		val$action = shareopengraphaction;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field ShareOpenGraphAction val$action>
		val$requestCallback = callback1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field com.facebook.GraphRequest$Callback val$requestCallback>
		val$callback = FacebookCallback.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #33  <Field FacebookCallback val$callback>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void Object()>
	//   17   31:return          
	}
}
