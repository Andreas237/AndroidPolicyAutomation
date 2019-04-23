// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			AccessTokenManager, GraphResponse

class AccessTokenManager$3
	implements 
{

	public void onCompleted(GraphResponse graphresponse)
	{
		graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:astore_1        
		if(graphresponse == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			val$refreshResult.accessToken = ((JSONObject) (graphresponse)).optString("access_token");
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//    8   14:aload_1         
	//    9   15:ldc1            #35  <String "access_token">
	//   10   17:invokevirtual   #41  <Method String JSONObject.optString(String)>
	//   11   20:putfield        #47  <Field String AccessTokenManager$RefreshResult.accessToken>
			val$refreshResult.expiresAt = ((JSONObject) (graphresponse)).optInt("expires_at");
	//   12   23:aload_0         
	//   13   24:getfield        #21  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   14   27:aload_1         
	//   15   28:ldc1            #49  <String "expires_at">
	//   16   30:invokevirtual   #53  <Method int JSONObject.optInt(String)>
	//   17   33:putfield        #57  <Field int AccessTokenManager$RefreshResult.expiresAt>
			val$refreshResult.dataAccessExpirationTime = Long.valueOf(((JSONObject) (graphresponse)).optLong("data_access_expiration_time"));
	//   18   36:aload_0         
	//   19   37:getfield        #21  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   20   40:aload_1         
	//   21   41:ldc1            #59  <String "data_access_expiration_time">
	//   22   43:invokevirtual   #63  <Method long JSONObject.optLong(String)>
	//   23   46:invokestatic    #69  <Method Long Long.valueOf(long)>
	//   24   49:putfield        #73  <Field Long AccessTokenManager$RefreshResult.dataAccessExpirationTime>
			return;
	//   25   52:return          
		}
	}

	final AccessTokenManager this$0;
	final freshResult val$refreshResult;

	AccessTokenManager$3()
	{
		this$0 = final_accesstokenmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AccessTokenManager this$0>
		val$refreshResult = freshResult.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AccessTokenManager$RefreshResult val$refreshResult>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
