// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;

// Referenced classes of package com.facebook.internal:
//			Utility, ProfileInformationCache

static final class Utility$2
	implements com.facebook.st.Callback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		if(graphresponse.getError() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #33  <Method FacebookRequestError GraphResponse.getError()>
	//*   2    4:ifnull          24
		{
			val$callback.onFailure(graphresponse.getError().getException());
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field Utility$GraphMeRequestWithCacheCallback val$callback>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #33  <Method FacebookRequestError GraphResponse.getError()>
	//    7   15:invokevirtual   #39  <Method com.facebook.FacebookException FacebookRequestError.getException()>
	//    8   18:invokeinterface #45  <Method void Utility$GraphMeRequestWithCacheCallback.onFailure(com.facebook.FacebookException)>
			return;
	//    9   23:return          
		} else
		{
			ProfileInformationCache.putProfileInformation(val$accessToken, graphresponse.getJSONObject());
	//   10   24:aload_0         
	//   11   25:getfield        #21  <Field String val$accessToken>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #49  <Method org.json.JSONObject GraphResponse.getJSONObject()>
	//   14   32:invokestatic    #55  <Method void ProfileInformationCache.putProfileInformation(String, org.json.JSONObject)>
			val$callback.onSuccess(graphresponse.getJSONObject());
	//   15   35:aload_0         
	//   16   36:getfield        #19  <Field Utility$GraphMeRequestWithCacheCallback val$callback>
	//   17   39:aload_1         
	//   18   40:invokevirtual   #49  <Method org.json.JSONObject GraphResponse.getJSONObject()>
	//   19   43:invokeinterface #59  <Method void Utility$GraphMeRequestWithCacheCallback.onSuccess(org.json.JSONObject)>
			return;
	//   20   48:return          
		}
	}

	final String val$accessToken;
	final aphMeRequestWithCacheCallback val$callback;

	Utility$2(aphMeRequestWithCacheCallback aphmerequestwithcachecallback, String s)
	{
		val$callback = aphmerequestwithcachecallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Utility$GraphMeRequestWithCacheCallback val$callback>
		val$accessToken = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$accessToken>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
