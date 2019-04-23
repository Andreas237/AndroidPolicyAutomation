// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			GraphRequest, HttpMethod, FacebookSdk, AccessTokenCache, 
//			FacebookException, GraphRequestBatch, CurrentAccessTokenExpirationBroadcastReceiver, AccessToken, 
//			AccessTokenSource, GraphResponse

public final class AccessTokenManager
{
	private static class RefreshResult
	{

		public String accessToken;
		public Long dataAccessExpirationTime;
		public int expiresAt;

		private RefreshResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

	}


	AccessTokenManager(LocalBroadcastManager localbroadcastmanager, AccessTokenCache accesstokencache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		tokenRefreshInProgress = new AtomicBoolean(false);
	//    2    4:aload_0         
	//    3    5:new             #61  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #64  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #66  <Field AtomicBoolean tokenRefreshInProgress>
		lastAttemptedTokenExtendDate = new Date(0L);
	//    8   16:aload_0         
	//    9   17:new             #68  <Class Date>
	//   10   20:dup             
	//   11   21:lconst_0        
	//   12   22:invokespecial   #71  <Method void Date(long)>
	//   13   25:putfield        #73  <Field Date lastAttemptedTokenExtendDate>
		Validate.notNull(((Object) (localbroadcastmanager)), "localBroadcastManager");
	//   14   28:aload_1         
	//   15   29:ldc1            #74  <String "localBroadcastManager">
	//   16   31:invokestatic    #80  <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (accesstokencache)), "accessTokenCache");
	//   17   34:aload_2         
	//   18   35:ldc1            #81  <String "accessTokenCache">
	//   19   37:invokestatic    #80  <Method void Validate.notNull(Object, String)>
		localBroadcastManager = localbroadcastmanager;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:putfield        #83  <Field LocalBroadcastManager localBroadcastManager>
		accessTokenCache = accesstokencache;
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:putfield        #85  <Field AccessTokenCache accessTokenCache>
	//   26   50:return          
	}

	private static GraphRequest createExtendAccessTokenRequest(AccessToken accesstoken, GraphRequest.Callback callback)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #98  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putString("grant_type", "fb_extend_sso_token");
	//    4    8:aload_2         
	//    5    9:ldc1            #101 <String "grant_type">
	//    6   11:ldc1            #103 <String "fb_extend_sso_token">
	//    7   13:invokevirtual   #107 <Method void Bundle.putString(String, String)>
		return new GraphRequest(accesstoken, "oauth/access_token", bundle, HttpMethod.GET, callback);
	//    8   16:new             #109 <Class GraphRequest>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:ldc1            #37  <String "oauth/access_token">
	//   12   23:aload_2         
	//   13   24:getstatic       #115 <Field HttpMethod HttpMethod.GET>
	//   14   27:aload_1         
	//   15   28:invokespecial   #118 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   16   31:areturn         
	}

	private static GraphRequest createGrantedPermissionsRequest(AccessToken accesstoken, GraphRequest.Callback callback)
	{
		return new GraphRequest(accesstoken, "me/permissions", new Bundle(), HttpMethod.GET, callback);
	//    0    0:new             #109 <Class GraphRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <String "me/permissions">
	//    4    7:new             #98  <Class Bundle>
	//    5   10:dup             
	//    6   11:invokespecial   #99  <Method void Bundle()>
	//    7   14:getstatic       #115 <Field HttpMethod HttpMethod.GET>
	//    8   17:aload_1         
	//    9   18:invokespecial   #118 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   10   21:areturn         
	}

	static AccessTokenManager getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_50;
	//    0    0:getstatic       #123 <Field AccessTokenManager instance>
	//    1    3:ifnonnull       50
		com/facebook/AccessTokenManager;
	//    2    6:ldc1            #2   <Class AccessTokenManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #123 <Field AccessTokenManager instance>
	//*   5   12:ifnonnull       38
			instance = new AccessTokenManager(LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()), new AccessTokenCache());
	//    6   15:new             #2   <Class AccessTokenManager>
	//    7   18:dup             
	//    8   19:invokestatic    #129 <Method Context FacebookSdk.getApplicationContext()>
	//    9   22:invokestatic    #134 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   10   25:new             #136 <Class AccessTokenCache>
	//   11   28:dup             
	//   12   29:invokespecial   #137 <Method void AccessTokenCache()>
	//   13   32:invokespecial   #139 <Method void AccessTokenManager(LocalBroadcastManager, AccessTokenCache)>
	//   14   35:putstatic       #123 <Field AccessTokenManager instance>
		com/facebook/AccessTokenManager;
	//   15   38:ldc1            #2   <Class AccessTokenManager>
		JVM INSTR monitorexit ;
	//   16   40:monitorexit     
		break MISSING_BLOCK_LABEL_50;
	//   17   41:goto            50
		Exception exception;
		exception;
	//   18   44:astore_0        
		com/facebook/AccessTokenManager;
	//   19   45:ldc1            #2   <Class AccessTokenManager>
		JVM INSTR monitorexit ;
	//   20   47:monitorexit     
		throw exception;
	//   21   48:aload_0         
	//   22   49:athrow          
		return instance;
	//   23   50:getstatic       #123 <Field AccessTokenManager instance>
	//   24   53:areturn         
	}

	private void refreshCurrentAccessTokenImpl(final AccessToken.AccessTokenRefreshCallback callback)
	{
		final AccessToken accessToken = currentAccessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field AccessToken currentAccessToken>
	//    2    4:astore_2        
		if(accessToken == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       29
		{
			if(callback != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          28
				callback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
	//    7   13:aload_1         
	//    8   14:new             #143 <Class FacebookException>
	//    9   17:dup             
	//   10   18:ldc1            #145 <String "No current access token to refresh">
	//   11   20:invokespecial   #148 <Method void FacebookException(String)>
	//   12   23:invokeinterface #154 <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshFailed(FacebookException)>
			return;
	//   13   28:return          
		}
		if(!tokenRefreshInProgress.compareAndSet(false, true))
	//*  14   29:aload_0         
	//*  15   30:getfield        #66  <Field AtomicBoolean tokenRefreshInProgress>
	//*  16   33:iconst_0        
	//*  17   34:iconst_1        
	//*  18   35:invokevirtual   #158 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*  19   38:ifne            61
		{
			if(callback != null)
	//*  20   41:aload_1         
	//*  21   42:ifnull          60
				callback.OnTokenRefreshFailed(new FacebookException("Refresh already in progress"));
	//   22   45:aload_1         
	//   23   46:new             #143 <Class FacebookException>
	//   24   49:dup             
	//   25   50:ldc1            #160 <String "Refresh already in progress">
	//   26   52:invokespecial   #148 <Method void FacebookException(String)>
	//   27   55:invokeinterface #154 <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshFailed(FacebookException)>
			return;
	//   28   60:return          
		} else
		{
			lastAttemptedTokenExtendDate = new Date();
	//   29   61:aload_0         
	//   30   62:new             #68  <Class Date>
	//   31   65:dup             
	//   32   66:invokespecial   #161 <Method void Date()>
	//   33   69:putfield        #73  <Field Date lastAttemptedTokenExtendDate>
			final HashSet permissions = new HashSet();
	//   34   72:new             #163 <Class HashSet>
	//   35   75:dup             
	//   36   76:invokespecial   #164 <Method void HashSet()>
	//   37   79:astore_3        
			final HashSet declinedPermissions = new HashSet();
	//   38   80:new             #163 <Class HashSet>
	//   39   83:dup             
	//   40   84:invokespecial   #164 <Method void HashSet()>
	//   41   87:astore          4
			final AtomicBoolean permissionsCallSucceeded = new AtomicBoolean(false);
	//   42   89:new             #61  <Class AtomicBoolean>
	//   43   92:dup             
	//   44   93:iconst_0        
	//   45   94:invokespecial   #64  <Method void AtomicBoolean(boolean)>
	//   46   97:astore          5
			final RefreshResult refreshResult = new RefreshResult();
	//   47   99:new             #14  <Class AccessTokenManager$RefreshResult>
	//   48  102:dup             
	//   49  103:aconst_null     
	//   50  104:invokespecial   #167 <Method void AccessTokenManager$RefreshResult(AccessTokenManager$1)>
	//   51  107:astore          6
			GraphRequestBatch graphrequestbatch = new GraphRequestBatch(new GraphRequest[] {
				createGrantedPermissionsRequest(accessToken, new GraphRequest.Callback() {

					public void onCompleted(GraphResponse graphresponse)
					{
						graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #40  <Method JSONObject GraphResponse.getJSONObject()>
					//    2    4:astore_1        
						if(graphresponse == null)
					//*   3    5:aload_1         
					//*   4    6:ifnonnull       10
							return;
					//    5    9:return          
						graphresponse = ((GraphResponse) (((JSONObject) (graphresponse)).optJSONArray("data")));
					//    6   10:aload_1         
					//    7   11:ldc1            #42  <String "data">
					//    8   13:invokevirtual   #48  <Method JSONArray JSONObject.optJSONArray(String)>
					//    9   16:astore_1        
						if(graphresponse == null)
					//*  10   17:aload_1         
					//*  11   18:ifnonnull       22
							return;
					//   12   21:return          
						permissionsCallSucceeded.set(true);
					//   13   22:aload_0         
					//   14   23:getfield        #24  <Field AtomicBoolean val$permissionsCallSucceeded>
					//   15   26:iconst_1        
					//   16   27:invokevirtual   #54  <Method void AtomicBoolean.set(boolean)>
						for(int i = 0; i < ((JSONArray) (graphresponse)).length(); i++)
					//*  17   30:iconst_0        
					//*  18   31:istore_2        
					//*  19   32:iload_2         
					//*  20   33:aload_1         
					//*  21   34:invokevirtual   #60  <Method int JSONArray.length()>
					//*  22   37:icmpge          184
						{
							Object obj = ((Object) (((JSONArray) (graphresponse)).optJSONObject(i)));
					//   23   40:aload_1         
					//   24   41:iload_2         
					//   25   42:invokevirtual   #64  <Method JSONObject JSONArray.optJSONObject(int)>
					//   26   45:astore          4
							if(obj == null)
					//*  27   47:aload           4
					//*  28   49:ifnonnull       55
								continue;
					//   29   52:goto            177
							String s = ((JSONObject) (obj)).optString("permission");
					//   30   55:aload           4
					//   31   57:ldc1            #66  <String "permission">
					//   32   59:invokevirtual   #70  <Method String JSONObject.optString(String)>
					//   33   62:astore_3        
							obj = ((Object) (((JSONObject) (obj)).optString("status")));
					//   34   63:aload           4
					//   35   65:ldc1            #72  <String "status">
					//   36   67:invokevirtual   #70  <Method String JSONObject.optString(String)>
					//   37   70:astore          4
							if(Utility.isNullOrEmpty(s) || Utility.isNullOrEmpty(((String) (obj))))
								continue;
					//   38   72:aload_3         
					//   39   73:invokestatic    #78  <Method boolean Utility.isNullOrEmpty(String)>
					//   40   76:ifne            177
					//   41   79:aload           4
					//   42   81:invokestatic    #78  <Method boolean Utility.isNullOrEmpty(String)>
					//   43   84:ifne            177
							obj = ((Object) (((String) (obj)).toLowerCase(Locale.US)));
					//   44   87:aload           4
					//   45   89:getstatic       #84  <Field Locale Locale.US>
					//   46   92:invokevirtual   #90  <Method String String.toLowerCase(Locale)>
					//   47   95:astore          4
							if(((String) (obj)).equals("granted"))
					//*  48   97:aload           4
					//*  49   99:ldc1            #92  <String "granted">
					//*  50  101:invokevirtual   #96  <Method boolean String.equals(Object)>
					//*  51  104:ifeq            121
							{
								permissions.add(((Object) (s)));
					//   52  107:aload_0         
					//   53  108:getfield        #26  <Field Set val$permissions>
					//   54  111:aload_3         
					//   55  112:invokeinterface #101 <Method boolean Set.add(Object)>
					//   56  117:pop             
								continue;
					//   57  118:goto            177
							}
							if(((String) (obj)).equals("declined"))
					//*  58  121:aload           4
					//*  59  123:ldc1            #103 <String "declined">
					//*  60  125:invokevirtual   #96  <Method boolean String.equals(Object)>
					//*  61  128:ifeq            145
							{
								declinedPermissions.add(((Object) (s)));
					//   62  131:aload_0         
					//   63  132:getfield        #28  <Field Set val$declinedPermissions>
					//   64  135:aload_3         
					//   65  136:invokeinterface #101 <Method boolean Set.add(Object)>
					//   66  141:pop             
							} else
					//*  67  142:goto            177
							{
								StringBuilder stringbuilder = new StringBuilder();
					//   68  145:new             #105 <Class StringBuilder>
					//   69  148:dup             
					//   70  149:invokespecial   #106 <Method void StringBuilder()>
					//   71  152:astore_3        
								stringbuilder.append("Unexpected status: ");
					//   72  153:aload_3         
					//   73  154:ldc1            #108 <String "Unexpected status: ">
					//   74  156:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
					//   75  159:pop             
								stringbuilder.append(((String) (obj)));
					//   76  160:aload_3         
					//   77  161:aload           4
					//   78  163:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
					//   79  166:pop             
								Log.w("AccessTokenManager", stringbuilder.toString());
					//   80  167:ldc1            #114 <String "AccessTokenManager">
					//   81  169:aload_3         
					//   82  170:invokevirtual   #118 <Method String StringBuilder.toString()>
					//   83  173:invokestatic    #124 <Method int Log.w(String, String)>
					//   84  176:pop             
							}
						}

					//   85  177:iload_2         
					//   86  178:iconst_1        
					//   87  179:iadd            
					//   88  180:istore_2        
					//*  89  181:goto            32
					//   90  184:return          
					}

					final AccessTokenManager this$0;
					final Set val$declinedPermissions;
					final Set val$permissions;
					final AtomicBoolean val$permissionsCallSucceeded;

			
			{
				this$0 = AccessTokenManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AccessTokenManager this$0>
				permissionsCallSucceeded = atomicboolean;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AtomicBoolean val$permissionsCallSucceeded>
				permissions = set;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field Set val$permissions>
				declinedPermissions = set1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field Set val$declinedPermissions>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
				}
), createExtendAccessTokenRequest(accessToken, new GraphRequest.Callback() {

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
							refreshResult.accessToken = ((JSONObject) (graphresponse)).optString("access_token");
					//    6   10:aload_0         
					//    7   11:getfield        #21  <Field AccessTokenManager$RefreshResult val$refreshResult>
					//    8   14:aload_1         
					//    9   15:ldc1            #35  <String "access_token">
					//   10   17:invokevirtual   #41  <Method String JSONObject.optString(String)>
					//   11   20:putfield        #47  <Field String AccessTokenManager$RefreshResult.accessToken>
							refreshResult.expiresAt = ((JSONObject) (graphresponse)).optInt("expires_at");
					//   12   23:aload_0         
					//   13   24:getfield        #21  <Field AccessTokenManager$RefreshResult val$refreshResult>
					//   14   27:aload_1         
					//   15   28:ldc1            #49  <String "expires_at">
					//   16   30:invokevirtual   #53  <Method int JSONObject.optInt(String)>
					//   17   33:putfield        #57  <Field int AccessTokenManager$RefreshResult.expiresAt>
							refreshResult.dataAccessExpirationTime = Long.valueOf(((JSONObject) (graphresponse)).optLong("data_access_expiration_time"));
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
					final RefreshResult val$refreshResult;

			
			{
				this$0 = AccessTokenManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AccessTokenManager this$0>
				refreshResult = refreshresult;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AccessTokenManager$RefreshResult val$refreshResult>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
)
			});
	//   52  109:new             #169 <Class GraphRequestBatch>
	//   53  112:dup             
	//   54  113:iconst_2        
	//   55  114:anewarray       GraphRequest[]
	//   56  117:dup             
	//   57  118:iconst_0        
	//   58  119:aload_2         
	//   59  120:new             #8   <Class AccessTokenManager$2>
	//   60  123:dup             
	//   61  124:aload_0         
	//   62  125:aload           5
	//   63  127:aload_3         
	//   64  128:aload           4
	//   65  130:invokespecial   #172 <Method void AccessTokenManager$2(AccessTokenManager, AtomicBoolean, Set, Set)>
	//   66  133:invokestatic    #174 <Method GraphRequest createGrantedPermissionsRequest(AccessToken, GraphRequest$Callback)>
	//   67  136:aastore         
	//   68  137:dup             
	//   69  138:iconst_1        
	//   70  139:aload_2         
	//   71  140:new             #10  <Class AccessTokenManager$3>
	//   72  143:dup             
	//   73  144:aload_0         
	//   74  145:aload           6
	//   75  147:invokespecial   #177 <Method void AccessTokenManager$3(AccessTokenManager, AccessTokenManager$RefreshResult)>
	//   76  150:invokestatic    #179 <Method GraphRequest createExtendAccessTokenRequest(AccessToken, GraphRequest$Callback)>
	//   77  153:aastore         
	//   78  154:invokespecial   #182 <Method void GraphRequestBatch(GraphRequest[])>
	//   79  157:astore          7
			graphrequestbatch.addCallback(new GraphRequestBatch.Callback() {

				public void onBatchCompleted(GraphRequestBatch graphrequestbatch1)
				{
					if(AccessTokenManager.getInstance().getCurrentAccessToken() == null || AccessTokenManager.getInstance().getCurrentAccessToken().getUserId() != accessToken.getUserId())
				//*   0    0:invokestatic    #50  <Method AccessTokenManager AccessTokenManager.getInstance()>
				//*   1    3:invokevirtual   #54  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
				//*   2    6:ifnull          370
				//*   3    9:invokestatic    #50  <Method AccessTokenManager AccessTokenManager.getInstance()>
				//*   4   12:invokevirtual   #54  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
				//*   5   15:invokevirtual   #60  <Method String AccessToken.getUserId()>
				//*   6   18:aload_0         
				//*   7   19:getfield        #30  <Field AccessToken val$accessToken>
				//*   8   22:invokevirtual   #60  <Method String AccessToken.getUserId()>
				//*   9   25:if_acmpeq       31
						break MISSING_BLOCK_LABEL_370;
				//   10   28:goto            370
					if(permissionsCallSucceeded.get() || refreshResult.accessToken != null || refreshResult.expiresAt != 0)
						break MISSING_BLOCK_LABEL_103;
				//   11   31:aload_0         
				//   12   32:getfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
				//   13   35:invokevirtual   #66  <Method boolean AtomicBoolean.get()>
				//   14   38:ifne            103
				//   15   41:aload_0         
				//   16   42:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//   17   45:getfield        #72  <Field String AccessTokenManager$RefreshResult.accessToken>
				//   18   48:ifnonnull       103
				//   19   51:aload_0         
				//   20   52:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//   21   55:getfield        #76  <Field int AccessTokenManager$RefreshResult.expiresAt>
				//   22   58:ifne            103
					if(callback != null)
				//*  23   61:aload_0         
				//*  24   62:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				//*  25   65:ifnull          86
						callback.OnTokenRefreshFailed(new FacebookException("Failed to refresh access token"));
				//   26   68:aload_0         
				//   27   69:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				//   28   72:new             #78  <Class FacebookException>
				//   29   75:dup             
				//   30   76:ldc1            #80  <String "Failed to refresh access token">
				//   31   78:invokespecial   #83  <Method void FacebookException(String)>
				//   32   81:invokeinterface #89  <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshFailed(FacebookException)>
					tokenRefreshInProgress.set(false);
				//   33   86:aload_0         
				//   34   87:getfield        #28  <Field AccessTokenManager this$0>
				//   35   90:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
				//   36   93:iconst_0        
				//   37   94:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
					graphrequestbatch1 = ((GraphRequestBatch) (callback));
				//   38   97:aload_0         
				//   39   98:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				//   40  101:astore_1        
					return;
				//   41  102:return          
					if(refreshResult.accessToken != null)
				//*  42  103:aload_0         
				//*  43  104:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//*  44  107:getfield        #72  <Field String AccessTokenManager$RefreshResult.accessToken>
				//*  45  110:ifnull          124
					{
						graphrequestbatch1 = ((GraphRequestBatch) (refreshResult.accessToken));
				//   46  113:aload_0         
				//   47  114:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//   48  117:getfield        #72  <Field String AccessTokenManager$RefreshResult.accessToken>
				//   49  120:astore_1        
						break MISSING_BLOCK_LABEL_132;
				//   50  121:goto            132
					}
					graphrequestbatch1 = ((GraphRequestBatch) (accessToken.getToken()));
				//   51  124:aload_0         
				//   52  125:getfield        #30  <Field AccessToken val$accessToken>
				//   53  128:invokevirtual   #100 <Method String AccessToken.getToken()>
				//   54  131:astore_1        
					Object obj;
					String s;
					String s1;
					s = accessToken.getApplicationId();
				//   55  132:aload_0         
				//   56  133:getfield        #30  <Field AccessToken val$accessToken>
				//   57  136:invokevirtual   #103 <Method String AccessToken.getApplicationId()>
				//   58  139:astore          6
					s1 = accessToken.getUserId();
				//   59  141:aload_0         
				//   60  142:getfield        #30  <Field AccessToken val$accessToken>
				//   61  145:invokevirtual   #60  <Method String AccessToken.getUserId()>
				//   62  148:astore          7
					if(permissionsCallSucceeded.get())
				//*  63  150:aload_0         
				//*  64  151:getfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
				//*  65  154:invokevirtual   #66  <Method boolean AtomicBoolean.get()>
				//*  66  157:ifeq            168
					{
						obj = ((Object) (permissions));
				//   67  160:aload_0         
				//   68  161:getfield        #38  <Field Set val$permissions>
				//   69  164:astore_2        
						break MISSING_BLOCK_LABEL_176;
				//   70  165:goto            176
					}
					obj = ((Object) (accessToken.getPermissions()));
				//   71  168:aload_0         
				//   72  169:getfield        #30  <Field AccessToken val$accessToken>
				//   73  172:invokevirtual   #107 <Method Set AccessToken.getPermissions()>
				//   74  175:astore_2        
					Set set;
					if(permissionsCallSucceeded.get())
				//*  75  176:aload_0         
				//*  76  177:getfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
				//*  77  180:invokevirtual   #66  <Method boolean AtomicBoolean.get()>
				//*  78  183:ifeq            194
					{
						set = declinedPermissions;
				//   79  186:aload_0         
				//   80  187:getfield        #40  <Field Set val$declinedPermissions>
				//   81  190:astore_3        
						break MISSING_BLOCK_LABEL_202;
				//   82  191:goto            202
					}
					set = accessToken.getDeclinedPermissions();
				//   83  194:aload_0         
				//   84  195:getfield        #30  <Field AccessToken val$accessToken>
				//   85  198:invokevirtual   #110 <Method Set AccessToken.getDeclinedPermissions()>
				//   86  201:astore_3        
					Date date;
					AccessTokenSource accesstokensource;
					accesstokensource = accessToken.getSource();
				//   87  202:aload_0         
				//   88  203:getfield        #30  <Field AccessToken val$accessToken>
				//   89  206:invokevirtual   #114 <Method AccessTokenSource AccessToken.getSource()>
				//   90  209:astore          8
					if(refreshResult.expiresAt != 0)
				//*  91  211:aload_0         
				//*  92  212:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//*  93  215:getfield        #76  <Field int AccessTokenManager$RefreshResult.expiresAt>
				//*  94  218:ifeq            245
					{
						date = new Date((long)refreshResult.expiresAt * 1000L);
				//   95  221:new             #116 <Class Date>
				//   96  224:dup             
				//   97  225:aload_0         
				//   98  226:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//   99  229:getfield        #76  <Field int AccessTokenManager$RefreshResult.expiresAt>
				//  100  232:i2l             
				//  101  233:ldc2w           #117 <Long 1000L>
				//  102  236:lmul            
				//  103  237:invokespecial   #121 <Method void Date(long)>
				//  104  240:astore          4
						break MISSING_BLOCK_LABEL_254;
				//  105  242:goto            254
					}
					date = accessToken.getExpires();
				//  106  245:aload_0         
				//  107  246:getfield        #30  <Field AccessToken val$accessToken>
				//  108  249:invokevirtual   #125 <Method Date AccessToken.getExpires()>
				//  109  252:astore          4
					Date date1;
					Date date2;
					date2 = new Date();
				//  110  254:new             #116 <Class Date>
				//  111  257:dup             
				//  112  258:invokespecial   #126 <Method void Date()>
				//  113  261:astore          9
					if(refreshResult.dataAccessExpirationTime != null)
				//* 114  263:aload_0         
				//* 115  264:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//* 116  267:getfield        #130 <Field Long AccessTokenManager$RefreshResult.dataAccessExpirationTime>
				//* 117  270:ifnull          299
					{
						date1 = new Date(1000L * refreshResult.dataAccessExpirationTime.longValue());
				//  118  273:new             #116 <Class Date>
				//  119  276:dup             
				//  120  277:ldc2w           #117 <Long 1000L>
				//  121  280:aload_0         
				//  122  281:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//  123  284:getfield        #130 <Field Long AccessTokenManager$RefreshResult.dataAccessExpirationTime>
				//  124  287:invokevirtual   #136 <Method long Long.longValue()>
				//  125  290:lmul            
				//  126  291:invokespecial   #121 <Method void Date(long)>
				//  127  294:astore          5
						break MISSING_BLOCK_LABEL_308;
				//  128  296:goto            308
					}
					date1 = accessToken.getDataAccessExpirationTime();
				//  129  299:aload_0         
				//  130  300:getfield        #30  <Field AccessToken val$accessToken>
				//  131  303:invokevirtual   #139 <Method Date AccessToken.getDataAccessExpirationTime()>
				//  132  306:astore          5
					obj = ((Object) (new AccessToken(((String) (graphrequestbatch1)), s, s1, ((java.util.Collection) (obj)), ((java.util.Collection) (set)), accesstokensource, date, date2, date1)));
				//  133  308:new             #56  <Class AccessToken>
				//  134  311:dup             
				//  135  312:aload_1         
				//  136  313:aload           6
				//  137  315:aload           7
				//  138  317:aload_2         
				//  139  318:aload_3         
				//  140  319:aload           8
				//  141  321:aload           4
				//  142  323:aload           9
				//  143  325:aload           5
				//  144  327:invokespecial   #142 <Method void AccessToken(String, String, String, java.util.Collection, java.util.Collection, AccessTokenSource, Date, Date, Date)>
				//  145  330:astore_2        
					AccessTokenManager.getInstance().setCurrentAccessToken(((AccessToken) (obj)));
				//  146  331:invokestatic    #50  <Method AccessTokenManager AccessTokenManager.getInstance()>
				//  147  334:aload_2         
				//  148  335:invokevirtual   #146 <Method void AccessTokenManager.setCurrentAccessToken(AccessToken)>
					tokenRefreshInProgress.set(false);
				//  149  338:aload_0         
				//  150  339:getfield        #28  <Field AccessTokenManager this$0>
				//  151  342:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
				//  152  345:iconst_0        
				//  153  346:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
					graphrequestbatch1 = ((GraphRequestBatch) (callback));
				//  154  349:aload_0         
				//  155  350:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				//  156  353:astore_1        
					if(graphrequestbatch1 != null)
				//* 157  354:aload_1         
				//* 158  355:ifnull          365
						((AccessToken.AccessTokenRefreshCallback) (graphrequestbatch1)).OnTokenRefreshed(((AccessToken) (obj)));
				//  159  358:aload_1         
				//  160  359:aload_2         
				//  161  360:invokeinterface #149 <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshed(AccessToken)>
					return;
				//  162  365:return          
					graphrequestbatch1;
				//  163  366:astore_1        
					break MISSING_BLOCK_LABEL_415;
				//  164  367:goto            415
					if(callback != null)
				//* 165  370:aload_0         
				//* 166  371:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				//* 167  374:ifnull          395
						callback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
				//  168  377:aload_0         
				//  169  378:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				//  170  381:new             #78  <Class FacebookException>
				//  171  384:dup             
				//  172  385:ldc1            #151 <String "No current access token to refresh">
				//  173  387:invokespecial   #83  <Method void FacebookException(String)>
				//  174  390:invokeinterface #89  <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshFailed(FacebookException)>
					tokenRefreshInProgress.set(false);
				//  175  395:aload_0         
				//  176  396:getfield        #28  <Field AccessTokenManager this$0>
				//  177  399:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
				//  178  402:iconst_0        
				//  179  403:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
					graphrequestbatch1 = ((GraphRequestBatch) (callback));
				//  180  406:aload_0         
				//  181  407:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				//  182  410:astore_1        
					return;
				//  183  411:return          
					graphrequestbatch1;
				//  184  412:astore_1        
					obj = null;
				//  185  413:aconst_null     
				//  186  414:astore_2        
					tokenRefreshInProgress.set(false);
				//  187  415:aload_0         
				//  188  416:getfield        #28  <Field AccessTokenManager this$0>
				//  189  419:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
				//  190  422:iconst_0        
				//  191  423:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
					AccessToken.AccessTokenRefreshCallback accesstokenrefreshcallback = callback;
				//  192  426:aload_0         
				//  193  427:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				//  194  430:astore_3        
					if(accesstokenrefreshcallback != null && obj != null)
				//* 195  431:aload_3         
				//* 196  432:ifnull          446
				//* 197  435:aload_2         
				//* 198  436:ifnull          446
						accesstokenrefreshcallback.OnTokenRefreshed(((AccessToken) (obj)));
				//  199  439:aload_3         
				//  200  440:aload_2         
				//  201  441:invokeinterface #149 <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshed(AccessToken)>
					throw graphrequestbatch1;
				//  202  446:aload_1         
				//  203  447:athrow          
				}

				final AccessTokenManager this$0;
				final AccessToken val$accessToken;
				final AccessToken.AccessTokenRefreshCallback val$callback;
				final Set val$declinedPermissions;
				final Set val$permissions;
				final AtomicBoolean val$permissionsCallSucceeded;
				final RefreshResult val$refreshResult;

			
			{
				this$0 = AccessTokenManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field AccessTokenManager this$0>
				accessToken = accesstoken;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field AccessToken val$accessToken>
				callback = accesstokenrefreshcallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				permissionsCallSucceeded = atomicboolean;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
				refreshResult = refreshresult;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
				permissions = set;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #38  <Field Set val$permissions>
				declinedPermissions = set1;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #40  <Field Set val$declinedPermissions>
				super();
			//   21   39:aload_0         
			//   22   40:invokespecial   #43  <Method void Object()>
			//   23   43:return          
			}
			}
);
	//   80  159:aload           7
	//   81  161:new             #12  <Class AccessTokenManager$4>
	//   82  164:dup             
	//   83  165:aload_0         
	//   84  166:aload_2         
	//   85  167:aload_1         
	//   86  168:aload           5
	//   87  170:aload           6
	//   88  172:aload_3         
	//   89  173:aload           4
	//   90  175:invokespecial   #185 <Method void AccessTokenManager$4(AccessTokenManager, AccessToken, AccessToken$AccessTokenRefreshCallback, AtomicBoolean, AccessTokenManager$RefreshResult, Set, Set)>
	//   91  178:invokevirtual   #189 <Method void GraphRequestBatch.addCallback(GraphRequestBatch$Callback)>
			graphrequestbatch.executeAsync();
	//   92  181:aload           7
	//   93  183:invokevirtual   #193 <Method GraphRequestAsyncTask GraphRequestBatch.executeAsync()>
	//   94  186:pop             
			return;
	//   95  187:return          
		}
	}

	private void sendCurrentAccessTokenChangedBroadcastIntent(AccessToken accesstoken, AccessToken accesstoken1)
	{
		Intent intent = new Intent(FacebookSdk.getApplicationContext(), com/facebook/CurrentAccessTokenExpirationBroadcastReceiver);
	//    0    0:new             #197 <Class Intent>
	//    1    3:dup             
	//    2    4:invokestatic    #129 <Method Context FacebookSdk.getApplicationContext()>
	//    3    7:ldc1            #199 <Class CurrentAccessTokenExpirationBroadcastReceiver>
	//    4    9:invokespecial   #202 <Method void Intent(Context, Class)>
	//    5   12:astore_3        
		intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
	//    6   13:aload_3         
	//    7   14:ldc1            #19  <String "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED">
	//    8   16:invokevirtual   #206 <Method Intent Intent.setAction(String)>
	//    9   19:pop             
		intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", ((android.os.Parcelable) (accesstoken)));
	//   10   20:aload_3         
	//   11   21:ldc1            #25  <String "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN">
	//   12   23:aload_1         
	//   13   24:invokevirtual   #210 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   14   27:pop             
		intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", ((android.os.Parcelable) (accesstoken1)));
	//   15   28:aload_3         
	//   16   29:ldc1            #22  <String "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN">
	//   17   31:aload_2         
	//   18   32:invokevirtual   #210 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   19   35:pop             
		localBroadcastManager.sendBroadcast(intent);
	//   20   36:aload_0         
	//   21   37:getfield        #83  <Field LocalBroadcastManager localBroadcastManager>
	//   22   40:aload_3         
	//   23   41:invokevirtual   #214 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   24   44:pop             
	//   25   45:return          
	}

	private void setCurrentAccessToken(AccessToken accesstoken, boolean flag)
	{
		AccessToken accesstoken1 = currentAccessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field AccessToken currentAccessToken>
	//    2    4:astore_3        
		currentAccessToken = accesstoken;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #141 <Field AccessToken currentAccessToken>
		tokenRefreshInProgress.set(false);
	//    6   10:aload_0         
	//    7   11:getfield        #66  <Field AtomicBoolean tokenRefreshInProgress>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #219 <Method void AtomicBoolean.set(boolean)>
		lastAttemptedTokenExtendDate = new Date(0L);
	//   10   18:aload_0         
	//   11   19:new             #68  <Class Date>
	//   12   22:dup             
	//   13   23:lconst_0        
	//   14   24:invokespecial   #71  <Method void Date(long)>
	//   15   27:putfield        #73  <Field Date lastAttemptedTokenExtendDate>
		if(flag)
	//*  16   30:iload_2         
	//*  17   31:ifeq            62
			if(accesstoken != null)
	//*  18   34:aload_1         
	//*  19   35:ifnull          49
			{
				accessTokenCache.save(accesstoken);
	//   20   38:aload_0         
	//   21   39:getfield        #85  <Field AccessTokenCache accessTokenCache>
	//   22   42:aload_1         
	//   23   43:invokevirtual   #223 <Method void AccessTokenCache.save(AccessToken)>
			} else
	//*  24   46:goto            62
			{
				accessTokenCache.clear();
	//   25   49:aload_0         
	//   26   50:getfield        #85  <Field AccessTokenCache accessTokenCache>
	//   27   53:invokevirtual   #226 <Method void AccessTokenCache.clear()>
				Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
	//   28   56:invokestatic    #129 <Method Context FacebookSdk.getApplicationContext()>
	//   29   59:invokestatic    #232 <Method void Utility.clearFacebookCookies(Context)>
			}
		if(!Utility.areObjectsEqual(((Object) (accesstoken1)), ((Object) (accesstoken))))
	//*  30   62:aload_3         
	//*  31   63:aload_1         
	//*  32   64:invokestatic    #236 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  33   67:ifne            80
		{
			sendCurrentAccessTokenChangedBroadcastIntent(accesstoken1, accesstoken);
	//   34   70:aload_0         
	//   35   71:aload_3         
	//   36   72:aload_1         
	//   37   73:invokespecial   #238 <Method void sendCurrentAccessTokenChangedBroadcastIntent(AccessToken, AccessToken)>
			setTokenExpirationBroadcastAlarm();
	//   38   76:aload_0         
	//   39   77:invokespecial   #241 <Method void setTokenExpirationBroadcastAlarm()>
		}
	//   40   80:return          
	}

	private void setTokenExpirationBroadcastAlarm()
	{
		Object obj = ((Object) (FacebookSdk.getApplicationContext()));
	//    0    0:invokestatic    #129 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_3        
		AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//    2    4:invokestatic    #247 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    3    7:astore_1        
		AlarmManager alarmmanager = (AlarmManager)((Context) (obj)).getSystemService("alarm");
	//    4    8:aload_3         
	//    5    9:ldc1            #249 <String "alarm">
	//    6   11:invokevirtual   #255 <Method Object Context.getSystemService(String)>
	//    7   14:checkcast       #257 <Class AlarmManager>
	//    8   17:astore_2        
		if(AccessToken.isCurrentAccessTokenActive() && accesstoken.getExpires() != null)
	//*   9   18:invokestatic    #261 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*  10   21:ifeq            79
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #265 <Method Date AccessToken.getExpires()>
	//*  13   28:ifnull          79
		{
			if(alarmmanager == null)
	//*  14   31:aload_2         
	//*  15   32:ifnonnull       36
			{
				return;
	//   16   35:return          
			} else
			{
				Intent intent = new Intent(((Context) (obj)), com/facebook/CurrentAccessTokenExpirationBroadcastReceiver);
	//   17   36:new             #197 <Class Intent>
	//   18   39:dup             
	//   19   40:aload_3         
	//   20   41:ldc1            #199 <Class CurrentAccessTokenExpirationBroadcastReceiver>
	//   21   43:invokespecial   #202 <Method void Intent(Context, Class)>
	//   22   46:astore          4
				intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
	//   23   48:aload           4
	//   24   50:ldc1            #19  <String "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED">
	//   25   52:invokevirtual   #206 <Method Intent Intent.setAction(String)>
	//   26   55:pop             
				obj = ((Object) (PendingIntent.getBroadcast(((Context) (obj)), 0, intent, 0)));
	//   27   56:aload_3         
	//   28   57:iconst_0        
	//   29   58:aload           4
	//   30   60:iconst_0        
	//   31   61:invokestatic    #271 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   32   64:astore_3        
				alarmmanager.set(1, accesstoken.getExpires().getTime(), ((PendingIntent) (obj)));
	//   33   65:aload_2         
	//   34   66:iconst_1        
	//   35   67:aload_1         
	//   36   68:invokevirtual   #265 <Method Date AccessToken.getExpires()>
	//   37   71:invokevirtual   #275 <Method long Date.getTime()>
	//   38   74:aload_3         
	//   39   75:invokevirtual   #278 <Method void AlarmManager.set(int, long, PendingIntent)>
				return;
	//   40   78:return          
			}
		} else
		{
			return;
	//   41   79:return          
		}
	}

	private boolean shouldExtendAccessToken()
	{
		Object obj = ((Object) (currentAccessToken));
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field AccessToken currentAccessToken>
	//    2    4:astore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(obj == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) (Long.valueOf((new Date()).getTime())));
	//    9   13:new             #68  <Class Date>
	//   10   16:dup             
	//   11   17:invokespecial   #161 <Method void Date()>
	//   12   20:invokevirtual   #275 <Method long Date.getTime()>
	//   13   23:invokestatic    #285 <Method Long Long.valueOf(long)>
	//   14   26:astore_3        
		boolean flag = flag1;
	//   15   27:iload_2         
	//   16   28:istore_1        
		if(currentAccessToken.getSource().canExtendToken())
	//*  17   29:aload_0         
	//*  18   30:getfield        #141 <Field AccessToken currentAccessToken>
	//*  19   33:invokevirtual   #289 <Method AccessTokenSource AccessToken.getSource()>
	//*  20   36:invokevirtual   #294 <Method boolean AccessTokenSource.canExtendToken()>
	//*  21   39:ifeq            89
		{
			flag = flag1;
	//   22   42:iload_2         
	//   23   43:istore_1        
			if(((Long) (obj)).longValue() - lastAttemptedTokenExtendDate.getTime() > 0x36ee80L)
	//*  24   44:aload_3         
	//*  25   45:invokevirtual   #297 <Method long Long.longValue()>
	//*  26   48:aload_0         
	//*  27   49:getfield        #73  <Field Date lastAttemptedTokenExtendDate>
	//*  28   52:invokevirtual   #275 <Method long Date.getTime()>
	//*  29   55:lsub            
	//*  30   56:ldc2w           #298 <Long 0x36ee80L>
	//*  31   59:lcmp            
	//*  32   60:ifle            89
			{
				flag = flag1;
	//   33   63:iload_2         
	//   34   64:istore_1        
				if(((Long) (obj)).longValue() - currentAccessToken.getLastRefresh().getTime() > 0x5265c00L)
	//*  35   65:aload_3         
	//*  36   66:invokevirtual   #297 <Method long Long.longValue()>
	//*  37   69:aload_0         
	//*  38   70:getfield        #141 <Field AccessToken currentAccessToken>
	//*  39   73:invokevirtual   #302 <Method Date AccessToken.getLastRefresh()>
	//*  40   76:invokevirtual   #275 <Method long Date.getTime()>
	//*  41   79:lsub            
	//*  42   80:ldc2w           #303 <Long 0x5265c00L>
	//*  43   83:lcmp            
	//*  44   84:ifle            89
					flag = true;
	//   45   87:iconst_1        
	//   46   88:istore_1        
			}
		}
		return flag;
	//   47   89:iload_1         
	//   48   90:ireturn         
	}

	void currentAccessTokenChanged()
	{
		AccessToken accesstoken = currentAccessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field AccessToken currentAccessToken>
	//    2    4:astore_1        
		sendCurrentAccessTokenChangedBroadcastIntent(accesstoken, accesstoken);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:invokespecial   #238 <Method void sendCurrentAccessTokenChangedBroadcastIntent(AccessToken, AccessToken)>
	//    7   11:return          
	}

	void extendAccessTokenIfNeeded()
	{
		if(!shouldExtendAccessToken())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #308 <Method boolean shouldExtendAccessToken()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			refreshCurrentAccessToken(((AccessToken.AccessTokenRefreshCallback) (null)));
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #311 <Method void refreshCurrentAccessToken(AccessToken$AccessTokenRefreshCallback)>
			return;
	//    7   13:return          
		}
	}

	AccessToken getCurrentAccessToken()
	{
		return currentAccessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field AccessToken currentAccessToken>
	//    2    4:areturn         
	}

	boolean loadCurrentAccessToken()
	{
		AccessToken accesstoken = accessTokenCache.load();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field AccessTokenCache accessTokenCache>
	//    2    4:invokevirtual   #315 <Method AccessToken AccessTokenCache.load()>
	//    3    7:astore_1        
		if(accesstoken != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          20
		{
			setCurrentAccessToken(accesstoken, false);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #317 <Method void setCurrentAccessToken(AccessToken, boolean)>
			return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		} else
		{
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
	}

	void refreshCurrentAccessToken(final AccessToken.AccessTokenRefreshCallback callback)
	{
		if(((Object) (Looper.getMainLooper())).equals(((Object) (Looper.myLooper()))))
	//*   0    0:invokestatic    #323 <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #326 <Method Looper Looper.myLooper()>
	//*   2    6:invokevirtual   #330 <Method boolean Object.equals(Object)>
	//*   3    9:ifeq            18
		{
			refreshCurrentAccessTokenImpl(callback);
	//    4   12:aload_0         
	//    5   13:aload_1         
	//    6   14:invokespecial   #92  <Method void refreshCurrentAccessTokenImpl(AccessToken$AccessTokenRefreshCallback)>
			return;
	//    7   17:return          
		} else
		{
			(new Handler(Looper.getMainLooper())).post(new Runnable() {

				public void run()
				{
					refreshCurrentAccessTokenImpl(callback);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AccessTokenManager this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				//    4    8:invokestatic    #29  <Method void AccessTokenManager.access$000(AccessTokenManager, AccessToken$AccessTokenRefreshCallback)>
				//    5   11:return          
				}

				final AccessTokenManager this$0;
				final AccessToken.AccessTokenRefreshCallback val$callback;

			
			{
				this$0 = AccessTokenManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AccessTokenManager this$0>
				callback = accesstokenrefreshcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AccessToken$AccessTokenRefreshCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   18:new             #332 <Class Handler>
	//    9   21:dup             
	//   10   22:invokestatic    #323 <Method Looper Looper.getMainLooper()>
	//   11   25:invokespecial   #335 <Method void Handler(Looper)>
	//   12   28:new             #6   <Class AccessTokenManager$1>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokespecial   #337 <Method void AccessTokenManager$1(AccessTokenManager, AccessToken$AccessTokenRefreshCallback)>
	//   17   37:invokevirtual   #341 <Method boolean Handler.post(Runnable)>
	//   18   40:pop             
			return;
	//   19   41:return          
		}
	}

	void setCurrentAccessToken(AccessToken accesstoken)
	{
		setCurrentAccessToken(accesstoken, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #317 <Method void setCurrentAccessToken(AccessToken, boolean)>
	//    4    6:return          
	}

	public static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
	public static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
	public static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
	private static final String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
	public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
	public static final String TAG = "AccessTokenManager";
	private static final String TOKEN_EXTEND_GRAPH_PATH = "oauth/access_token";
	private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
	private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 0x15180;
	private static volatile AccessTokenManager instance;
	private final AccessTokenCache accessTokenCache;
	private AccessToken currentAccessToken;
	private Date lastAttemptedTokenExtendDate;
	private final LocalBroadcastManager localBroadcastManager;
	private AtomicBoolean tokenRefreshInProgress;


/*
	static void access$000(AccessTokenManager accesstokenmanager, AccessToken.AccessTokenRefreshCallback accesstokenrefreshcallback)
	{
		accesstokenmanager.refreshCurrentAccessTokenImpl(accesstokenrefreshcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void refreshCurrentAccessTokenImpl(AccessToken$AccessTokenRefreshCallback)>
		return;
	//    3    5:return          
	}

*/


/*
	static AtomicBoolean access$200(AccessTokenManager accesstokenmanager)
	{
		return accesstokenmanager.tokenRefreshInProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field AtomicBoolean tokenRefreshInProgress>
	//    2    4:areturn         
	}

*/
}
