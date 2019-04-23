// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.Bundle;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			AccessToken, AccessTokenSource, FacebookException

static final class AccessToken$1
	implements com.facebook.internal.eRequestWithCacheCallback
{

	public void onFailure(FacebookException facebookexception)
	{
		val$accessTokenCallback.onError(facebookexception);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AccessToken$AccessTokenCreationCallback val$accessTokenCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method void AccessToken$AccessTokenCreationCallback.onError(FacebookException)>
	//    4   10:return          
	}

	public void onSuccess(JSONObject jsonobject)
	{
		try
		{
			jsonobject = ((JSONObject) (jsonobject.getString("id")));
	//    0    0:aload_1         
	//    1    1:ldc1            #42  <String "id">
	//    2    3:invokevirtual   #48  <Method String JSONObject.getString(String)>
	//    3    6:astore_1        
			val$extras.putString("user_id", ((String) (jsonobject)));
	//    4    7:aload_0         
	//    5    8:getfield        #21  <Field Bundle val$extras>
	//    6   11:ldc1            #50  <String "user_id">
	//    7   13:aload_1         
	//    8   14:invokevirtual   #56  <Method void Bundle.putString(String, String)>
			val$accessTokenCallback.onSuccess(AccessToken.access$000(((java.util.List) (null)), val$extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), val$applicationId));
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field AccessToken$AccessTokenCreationCallback val$accessTokenCallback>
	//   11   21:aconst_null     
	//   12   22:aload_0         
	//   13   23:getfield        #21  <Field Bundle val$extras>
	//   14   26:getstatic       #62  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   15   29:new             #64  <Class Date>
	//   16   32:dup             
	//   17   33:invokespecial   #65  <Method void Date()>
	//   18   36:aload_0         
	//   19   37:getfield        #25  <Field String val$applicationId>
	//   20   40:invokestatic    #69  <Method AccessToken AccessToken.access$000(java.util.List, Bundle, AccessTokenSource, Date, String)>
	//   21   43:invokeinterface #72  <Method void AccessToken$AccessTokenCreationCallback.onSuccess(AccessToken)>
			return;
	//   22   48:return          
		}
	//*  23   49:aload_0         
	//*  24   50:getfield        #23  <Field AccessToken$AccessTokenCreationCallback val$accessTokenCallback>
	//*  25   53:new             #74  <Class FacebookException>
	//*  26   56:dup             
	//*  27   57:ldc1            #76  <String "Unable to generate access token due to missing user id">
	//*  28   59:invokespecial   #79  <Method void FacebookException(String)>
	//*  29   62:invokeinterface #36  <Method void AccessToken$AccessTokenCreationCallback.onError(FacebookException)>
	//*  30   67:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			val$accessTokenCallback.onError(new FacebookException("Unable to generate access token due to missing user id"));
		}
	//*  31   68:astore_1        
	//*  32   69:goto            49
	}

	final cessTokenCreationCallback val$accessTokenCallback;
	final String val$applicationId;
	final Bundle val$extras;

	AccessToken$1(Bundle bundle, cessTokenCreationCallback cesstokencreationcallback, String s)
	{
		val$extras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Bundle val$extras>
		val$accessTokenCallback = cesstokencreationcallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field AccessToken$AccessTokenCreationCallback val$accessTokenCallback>
		val$applicationId = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String val$applicationId>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
