// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

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
//			GraphRequestBatch, AccessToken, AccessTokenSource, GraphResponse

final class AccessTokenManager
{
	private static class RefreshResult
	{

		public String accessToken;
		public int expiresAt;

		private RefreshResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
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
	//    0    0:new             #97  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putString("grant_type", "fb_extend_sso_token");
	//    4    8:aload_2         
	//    5    9:ldc1            #100 <String "grant_type">
	//    6   11:ldc1            #102 <String "fb_extend_sso_token">
	//    7   13:invokevirtual   #106 <Method void Bundle.putString(String, String)>
		return new GraphRequest(accesstoken, "oauth/access_token", bundle, HttpMethod.GET, callback);
	//    8   16:new             #108 <Class GraphRequest>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:ldc1            #37  <String "oauth/access_token">
	//   12   23:aload_2         
	//   13   24:getstatic       #114 <Field HttpMethod HttpMethod.GET>
	//   14   27:aload_1         
	//   15   28:invokespecial   #117 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   16   31:areturn         
	}

	private static GraphRequest createGrantedPermissionsRequest(AccessToken accesstoken, GraphRequest.Callback callback)
	{
		return new GraphRequest(accesstoken, "me/permissions", new Bundle(), HttpMethod.GET, callback);
	//    0    0:new             #108 <Class GraphRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <String "me/permissions">
	//    4    7:new             #97  <Class Bundle>
	//    5   10:dup             
	//    6   11:invokespecial   #98  <Method void Bundle()>
	//    7   14:getstatic       #114 <Field HttpMethod HttpMethod.GET>
	//    8   17:aload_1         
	//    9   18:invokespecial   #117 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   10   21:areturn         
	}

	static AccessTokenManager getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_50;
	//    0    0:getstatic       #122 <Field AccessTokenManager instance>
	//    1    3:ifnonnull       50
		com/facebook/AccessTokenManager;
	//    2    6:ldc1            #2   <Class AccessTokenManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #122 <Field AccessTokenManager instance>
	//*   5   12:ifnonnull       38
			instance = new AccessTokenManager(LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()), new AccessTokenCache());
	//    6   15:new             #2   <Class AccessTokenManager>
	//    7   18:dup             
	//    8   19:invokestatic    #128 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    9   22:invokestatic    #133 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(android.content.Context)>
	//   10   25:new             #135 <Class AccessTokenCache>
	//   11   28:dup             
	//   12   29:invokespecial   #136 <Method void AccessTokenCache()>
	//   13   32:invokespecial   #138 <Method void AccessTokenManager(LocalBroadcastManager, AccessTokenCache)>
	//   14   35:putstatic       #122 <Field AccessTokenManager instance>
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
	//   23   50:getstatic       #122 <Field AccessTokenManager instance>
	//   24   53:areturn         
	}

	private void refreshCurrentAccessTokenImpl()
	{
		final AccessToken accessToken = currentAccessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field AccessToken currentAccessToken>
	//    2    4:astore_1        
		if(accessToken == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		if(!tokenRefreshInProgress.compareAndSet(false, true))
	//*   6   10:aload_0         
	//*   7   11:getfield        #66  <Field AtomicBoolean tokenRefreshInProgress>
	//*   8   14:iconst_0        
	//*   9   15:iconst_1        
	//*  10   16:invokevirtual   #144 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*  11   19:ifne            23
		{
			return;
	//   12   22:return          
		} else
		{
			Validate.runningOnUiThread();
	//   13   23:invokestatic    #147 <Method void Validate.runningOnUiThread()>
			lastAttemptedTokenExtendDate = new Date();
	//   14   26:aload_0         
	//   15   27:new             #68  <Class Date>
	//   16   30:dup             
	//   17   31:invokespecial   #148 <Method void Date()>
	//   18   34:putfield        #73  <Field Date lastAttemptedTokenExtendDate>
			final HashSet permissions = new HashSet();
	//   19   37:new             #150 <Class HashSet>
	//   20   40:dup             
	//   21   41:invokespecial   #151 <Method void HashSet()>
	//   22   44:astore_2        
			final HashSet declinedPermissions = new HashSet();
	//   23   45:new             #150 <Class HashSet>
	//   24   48:dup             
	//   25   49:invokespecial   #151 <Method void HashSet()>
	//   26   52:astore_3        
			final AtomicBoolean permissionsCallSucceeded = new AtomicBoolean(false);
	//   27   53:new             #61  <Class AtomicBoolean>
	//   28   56:dup             
	//   29   57:iconst_0        
	//   30   58:invokespecial   #64  <Method void AtomicBoolean(boolean)>
	//   31   61:astore          4
			final RefreshResult refreshResult = new RefreshResult();
	//   32   63:new             #14  <Class AccessTokenManager$RefreshResult>
	//   33   66:dup             
	//   34   67:aconst_null     
	//   35   68:invokespecial   #154 <Method void AccessTokenManager$RefreshResult(AccessTokenManager$1)>
	//   36   71:astore          5
			GraphRequestBatch graphrequestbatch = new GraphRequestBatch(new GraphRequest[] {
				createGrantedPermissionsRequest(accessToken, new GraphRequest.Callback() {

					public void onCompleted(GraphResponse graphresponse)
					{
						graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #39  <Method JSONObject GraphResponse.getJSONObject()>
					//    2    4:astore_1        
						if(graphresponse == null)
					//*   3    5:aload_1         
					//*   4    6:ifnonnull       10
							return;
					//    5    9:return          
						graphresponse = ((GraphResponse) (((JSONObject) (graphresponse)).optJSONArray("data")));
					//    6   10:aload_1         
					//    7   11:ldc1            #41  <String "data">
					//    8   13:invokevirtual   #47  <Method JSONArray JSONObject.optJSONArray(String)>
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
					//   16   27:invokevirtual   #53  <Method void AtomicBoolean.set(boolean)>
						for(int i = 0; i < ((JSONArray) (graphresponse)).length(); i++)
					//*  17   30:iconst_0        
					//*  18   31:istore_2        
					//*  19   32:iload_2         
					//*  20   33:aload_1         
					//*  21   34:invokevirtual   #59  <Method int JSONArray.length()>
					//*  22   37:icmpge          184
						{
							Object obj = ((Object) (((JSONArray) (graphresponse)).optJSONObject(i)));
					//   23   40:aload_1         
					//   24   41:iload_2         
					//   25   42:invokevirtual   #63  <Method JSONObject JSONArray.optJSONObject(int)>
					//   26   45:astore          4
							if(obj == null)
					//*  27   47:aload           4
					//*  28   49:ifnonnull       55
								continue;
					//   29   52:goto            177
							String s = ((JSONObject) (obj)).optString("permission");
					//   30   55:aload           4
					//   31   57:ldc1            #65  <String "permission">
					//   32   59:invokevirtual   #69  <Method String JSONObject.optString(String)>
					//   33   62:astore_3        
							obj = ((Object) (((JSONObject) (obj)).optString("status")));
					//   34   63:aload           4
					//   35   65:ldc1            #71  <String "status">
					//   36   67:invokevirtual   #69  <Method String JSONObject.optString(String)>
					//   37   70:astore          4
							if(Utility.isNullOrEmpty(s) || Utility.isNullOrEmpty(((String) (obj))))
								continue;
					//   38   72:aload_3         
					//   39   73:invokestatic    #77  <Method boolean Utility.isNullOrEmpty(String)>
					//   40   76:ifne            177
					//   41   79:aload           4
					//   42   81:invokestatic    #77  <Method boolean Utility.isNullOrEmpty(String)>
					//   43   84:ifne            177
							obj = ((Object) (((String) (obj)).toLowerCase(Locale.US)));
					//   44   87:aload           4
					//   45   89:getstatic       #83  <Field Locale Locale.US>
					//   46   92:invokevirtual   #89  <Method String String.toLowerCase(Locale)>
					//   47   95:astore          4
							if(((String) (obj)).equals("granted"))
					//*  48   97:aload           4
					//*  49   99:ldc1            #91  <String "granted">
					//*  50  101:invokevirtual   #95  <Method boolean String.equals(Object)>
					//*  51  104:ifeq            121
							{
								permissions.add(((Object) (s)));
					//   52  107:aload_0         
					//   53  108:getfield        #26  <Field Set val$permissions>
					//   54  111:aload_3         
					//   55  112:invokeinterface #100 <Method boolean Set.add(Object)>
					//   56  117:pop             
								continue;
					//   57  118:goto            177
							}
							if(((String) (obj)).equals("declined"))
					//*  58  121:aload           4
					//*  59  123:ldc1            #102 <String "declined">
					//*  60  125:invokevirtual   #95  <Method boolean String.equals(Object)>
					//*  61  128:ifeq            145
							{
								declinedPermissions.add(((Object) (s)));
					//   62  131:aload_0         
					//   63  132:getfield        #28  <Field Set val$declinedPermissions>
					//   64  135:aload_3         
					//   65  136:invokeinterface #100 <Method boolean Set.add(Object)>
					//   66  141:pop             
							} else
					//*  67  142:goto            177
							{
								StringBuilder stringbuilder = new StringBuilder();
					//   68  145:new             #104 <Class StringBuilder>
					//   69  148:dup             
					//   70  149:invokespecial   #105 <Method void StringBuilder()>
					//   71  152:astore_3        
								stringbuilder.append("Unexpected status: ");
					//   72  153:aload_3         
					//   73  154:ldc1            #107 <String "Unexpected status: ">
					//   74  156:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
					//   75  159:pop             
								stringbuilder.append(((String) (obj)));
					//   76  160:aload_3         
					//   77  161:aload           4
					//   78  163:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
					//   79  166:pop             
								Log.w("AccessTokenManager", stringbuilder.toString());
					//   80  167:ldc1            #113 <String "AccessTokenManager">
					//   81  169:aload_3         
					//   82  170:invokevirtual   #117 <Method String StringBuilder.toString()>
					//   83  173:invokestatic    #123 <Method int Log.w(String, String)>
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
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
				}
), createExtendAccessTokenRequest(accessToken, new GraphRequest.Callback() {

					public void onCompleted(GraphResponse graphresponse)
					{
						graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #32  <Method JSONObject GraphResponse.getJSONObject()>
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
					//    9   15:ldc1            #34  <String "access_token">
					//   10   17:invokevirtual   #40  <Method String JSONObject.optString(String)>
					//   11   20:putfield        #46  <Field String AccessTokenManager$RefreshResult.accessToken>
							refreshResult.expiresAt = ((JSONObject) (graphresponse)).optInt("expires_at");
					//   12   23:aload_0         
					//   13   24:getfield        #21  <Field AccessTokenManager$RefreshResult val$refreshResult>
					//   14   27:aload_1         
					//   15   28:ldc1            #48  <String "expires_at">
					//   16   30:invokevirtual   #52  <Method int JSONObject.optInt(String)>
					//   17   33:putfield        #56  <Field int AccessTokenManager$RefreshResult.expiresAt>
							return;
					//   18   36:return          
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
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
				}
)
			});
	//   37   73:new             #156 <Class GraphRequestBatch>
	//   38   76:dup             
	//   39   77:iconst_2        
	//   40   78:anewarray       GraphRequest[]
	//   41   81:dup             
	//   42   82:iconst_0        
	//   43   83:aload_1         
	//   44   84:new             #8   <Class AccessTokenManager$2>
	//   45   87:dup             
	//   46   88:aload_0         
	//   47   89:aload           4
	//   48   91:aload_2         
	//   49   92:aload_3         
	//   50   93:invokespecial   #159 <Method void AccessTokenManager$2(AccessTokenManager, AtomicBoolean, Set, Set)>
	//   51   96:invokestatic    #161 <Method GraphRequest createGrantedPermissionsRequest(AccessToken, GraphRequest$Callback)>
	//   52   99:aastore         
	//   53  100:dup             
	//   54  101:iconst_1        
	//   55  102:aload_1         
	//   56  103:new             #10  <Class AccessTokenManager$3>
	//   57  106:dup             
	//   58  107:aload_0         
	//   59  108:aload           5
	//   60  110:invokespecial   #164 <Method void AccessTokenManager$3(AccessTokenManager, AccessTokenManager$RefreshResult)>
	//   61  113:invokestatic    #166 <Method GraphRequest createExtendAccessTokenRequest(AccessToken, GraphRequest$Callback)>
	//   62  116:aastore         
	//   63  117:invokespecial   #169 <Method void GraphRequestBatch(GraphRequest[])>
	//   64  120:astore          6
			graphrequestbatch.addCallback(new GraphRequestBatch.Callback() {

				public void onBatchCompleted(GraphRequestBatch graphrequestbatch1)
				{
					if(AccessTokenManager.getInstance().getCurrentAccessToken() == null)
						break MISSING_BLOCK_LABEL_292;
				//    0    0:invokestatic    #45  <Method AccessTokenManager AccessTokenManager.getInstance()>
				//    1    3:invokevirtual   #49  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
				//    2    6:ifnull          292
					if(AccessTokenManager.getInstance().getCurrentAccessToken().getUserId() != accessToken.getUserId())
				//*   3    9:invokestatic    #45  <Method AccessTokenManager AccessTokenManager.getInstance()>
				//*   4   12:invokevirtual   #49  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
				//*   5   15:invokevirtual   #55  <Method String AccessToken.getUserId()>
				//*   6   18:aload_0         
				//*   7   19:getfield        #28  <Field AccessToken val$accessToken>
				//*   8   22:invokevirtual   #55  <Method String AccessToken.getUserId()>
				//*   9   25:if_acmpeq       29
						return;
				//   10   28:return          
					int i;
					if(permissionsCallSucceeded.get() || refreshResult.accessToken != null)
						break MISSING_BLOCK_LABEL_73;
				//   11   29:aload_0         
				//   12   30:getfield        #30  <Field AtomicBoolean val$permissionsCallSucceeded>
				//   13   33:invokevirtual   #61  <Method boolean AtomicBoolean.get()>
				//   14   36:ifne            73
				//   15   39:aload_0         
				//   16   40:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//   17   43:getfield        #67  <Field String AccessTokenManager$RefreshResult.accessToken>
				//   18   46:ifnonnull       73
					i = refreshResult.expiresAt;
				//   19   49:aload_0         
				//   20   50:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//   21   53:getfield        #71  <Field int AccessTokenManager$RefreshResult.expiresAt>
				//   22   56:istore_2        
					if(i == 0)
				//*  23   57:iload_2         
				//*  24   58:ifne            73
					{
						tokenRefreshInProgress.set(false);
				//   25   61:aload_0         
				//   26   62:getfield        #26  <Field AccessTokenManager this$0>
				//   27   65:invokestatic    #75  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
				//   28   68:iconst_0        
				//   29   69:invokevirtual   #79  <Method void AtomicBoolean.set(boolean)>
						return;
				//   30   72:return          
					}
					if(refreshResult.accessToken != null)
				//*  31   73:aload_0         
				//*  32   74:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//*  33   77:getfield        #67  <Field String AccessTokenManager$RefreshResult.accessToken>
				//*  34   80:ifnull          94
					{
						graphrequestbatch1 = ((GraphRequestBatch) (refreshResult.accessToken));
				//   35   83:aload_0         
				//   36   84:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//   37   87:getfield        #67  <Field String AccessTokenManager$RefreshResult.accessToken>
				//   38   90:astore_1        
						break MISSING_BLOCK_LABEL_102;
				//   39   91:goto            102
					}
					graphrequestbatch1 = ((GraphRequestBatch) (accessToken.getToken()));
				//   40   94:aload_0         
				//   41   95:getfield        #28  <Field AccessToken val$accessToken>
				//   42   98:invokevirtual   #82  <Method String AccessToken.getToken()>
				//   43  101:astore_1        
					Set set;
					String s;
					String s1;
					s = accessToken.getApplicationId();
				//   44  102:aload_0         
				//   45  103:getfield        #28  <Field AccessToken val$accessToken>
				//   46  106:invokevirtual   #85  <Method String AccessToken.getApplicationId()>
				//   47  109:astore          6
					s1 = accessToken.getUserId();
				//   48  111:aload_0         
				//   49  112:getfield        #28  <Field AccessToken val$accessToken>
				//   50  115:invokevirtual   #55  <Method String AccessToken.getUserId()>
				//   51  118:astore          7
					if(permissionsCallSucceeded.get())
				//*  52  120:aload_0         
				//*  53  121:getfield        #30  <Field AtomicBoolean val$permissionsCallSucceeded>
				//*  54  124:invokevirtual   #61  <Method boolean AtomicBoolean.get()>
				//*  55  127:ifeq            138
					{
						set = permissions;
				//   56  130:aload_0         
				//   57  131:getfield        #34  <Field Set val$permissions>
				//   58  134:astore_3        
						break MISSING_BLOCK_LABEL_149;
				//   59  135:goto            293
					}
					set = accessToken.getPermissions();
				//   60  138:aload_0         
				//   61  139:getfield        #28  <Field AccessToken val$accessToken>
				//   62  142:invokevirtual   #89  <Method Set AccessToken.getPermissions()>
				//   63  145:astore_3        
				//*  64  146:goto            293
					Set set1;
					if(permissionsCallSucceeded.get())
				//*  65  149:aload_0         
				//*  66  150:getfield        #30  <Field AtomicBoolean val$permissionsCallSucceeded>
				//*  67  153:invokevirtual   #61  <Method boolean AtomicBoolean.get()>
				//*  68  156:ifeq            168
					{
						set1 = declinedPermissions;
				//   69  159:aload_0         
				//   70  160:getfield        #36  <Field Set val$declinedPermissions>
				//   71  163:astore          4
						break MISSING_BLOCK_LABEL_180;
				//   72  165:goto            296
					}
					set1 = accessToken.getDeclinedPermissions();
				//   73  168:aload_0         
				//   74  169:getfield        #28  <Field AccessToken val$accessToken>
				//   75  172:invokevirtual   #92  <Method Set AccessToken.getDeclinedPermissions()>
				//   76  175:astore          4
				//*  77  177:goto            296
					Date date;
					AccessTokenSource accesstokensource;
					accesstokensource = accessToken.getSource();
				//   78  180:aload_0         
				//   79  181:getfield        #28  <Field AccessToken val$accessToken>
				//   80  184:invokevirtual   #96  <Method AccessTokenSource AccessToken.getSource()>
				//   81  187:astore          8
					if(refreshResult.expiresAt != 0)
				//*  82  189:aload_0         
				//*  83  190:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//*  84  193:getfield        #71  <Field int AccessTokenManager$RefreshResult.expiresAt>
				//*  85  196:ifeq            223
					{
						date = new Date((long)refreshResult.expiresAt * 1000L);
				//   86  199:new             #98  <Class Date>
				//   87  202:dup             
				//   88  203:aload_0         
				//   89  204:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
				//   90  207:getfield        #71  <Field int AccessTokenManager$RefreshResult.expiresAt>
				//   91  210:i2l             
				//   92  211:ldc2w           #99  <Long 1000L>
				//   93  214:lmul            
				//   94  215:invokespecial   #103 <Method void Date(long)>
				//   95  218:astore          5
						break MISSING_BLOCK_LABEL_232;
				//   96  220:goto            232
					}
					date = accessToken.getExpires();
				//   97  223:aload_0         
				//   98  224:getfield        #28  <Field AccessToken val$accessToken>
				//   99  227:invokevirtual   #107 <Method Date AccessToken.getExpires()>
				//  100  230:astore          5
					graphrequestbatch1 = ((GraphRequestBatch) (new AccessToken(((String) (graphrequestbatch1)), s, s1, ((java.util.Collection) (set)), ((java.util.Collection) (set1)), accesstokensource, date, new Date())));
				//  101  232:new             #51  <Class AccessToken>
				//  102  235:dup             
				//  103  236:aload_1         
				//  104  237:aload           6
				//  105  239:aload           7
				//  106  241:aload_3         
				//  107  242:aload           4
				//  108  244:aload           8
				//  109  246:aload           5
				//  110  248:new             #98  <Class Date>
				//  111  251:dup             
				//  112  252:invokespecial   #108 <Method void Date()>
				//  113  255:invokespecial   #111 <Method void AccessToken(String, String, String, java.util.Collection, java.util.Collection, AccessTokenSource, Date, Date)>
				//  114  258:astore_1        
					AccessTokenManager.getInstance().setCurrentAccessToken(((AccessToken) (graphrequestbatch1)));
				//  115  259:invokestatic    #45  <Method AccessTokenManager AccessTokenManager.getInstance()>
				//  116  262:aload_1         
				//  117  263:invokevirtual   #115 <Method void AccessTokenManager.setCurrentAccessToken(AccessToken)>
					tokenRefreshInProgress.set(false);
				//  118  266:aload_0         
				//  119  267:getfield        #26  <Field AccessTokenManager this$0>
				//  120  270:invokestatic    #75  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
				//  121  273:iconst_0        
				//  122  274:invokevirtual   #79  <Method void AtomicBoolean.set(boolean)>
					return;
				//  123  277:return          
					graphrequestbatch1;
				//  124  278:astore_1        
					tokenRefreshInProgress.set(false);
				//  125  279:aload_0         
				//  126  280:getfield        #26  <Field AccessTokenManager this$0>
				//  127  283:invokestatic    #75  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
				//  128  286:iconst_0        
				//  129  287:invokevirtual   #79  <Method void AtomicBoolean.set(boolean)>
					throw graphrequestbatch1;
				//  130  290:aload_1         
				//  131  291:athrow          
				//  132  292:return          
				//* 133  293:goto            149
				//* 134  296:goto            180
				}

				final AccessTokenManager this$0;
				final AccessToken val$accessToken;
				final Set val$declinedPermissions;
				final Set val$permissions;
				final AtomicBoolean val$permissionsCallSucceeded;
				final RefreshResult val$refreshResult;

			
			{
				this$0 = AccessTokenManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field AccessTokenManager this$0>
				accessToken = accesstoken;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field AccessToken val$accessToken>
				permissionsCallSucceeded = atomicboolean;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field AtomicBoolean val$permissionsCallSucceeded>
				refreshResult = refreshresult;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
				permissions = set;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field Set val$permissions>
				declinedPermissions = set1;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #36  <Field Set val$declinedPermissions>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #38  <Method void Object()>
			//   20   37:return          
			}
			}
);
	//   65  122:aload           6
	//   66  124:new             #12  <Class AccessTokenManager$4>
	//   67  127:dup             
	//   68  128:aload_0         
	//   69  129:aload_1         
	//   70  130:aload           4
	//   71  132:aload           5
	//   72  134:aload_2         
	//   73  135:aload_3         
	//   74  136:invokespecial   #172 <Method void AccessTokenManager$4(AccessTokenManager, AccessToken, AtomicBoolean, AccessTokenManager$RefreshResult, Set, Set)>
	//   75  139:invokevirtual   #176 <Method void GraphRequestBatch.addCallback(GraphRequestBatch$Callback)>
			graphrequestbatch.executeAsync();
	//   76  142:aload           6
	//   77  144:invokevirtual   #180 <Method GraphRequestAsyncTask GraphRequestBatch.executeAsync()>
	//   78  147:pop             
			return;
	//   79  148:return          
		}
	}

	private void sendCurrentAccessTokenChangedBroadcast(AccessToken accesstoken, AccessToken accesstoken1)
	{
		Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
	//    0    0:new             #184 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED">
	//    3    6:invokespecial   #187 <Method void Intent(String)>
	//    4    9:astore_3        
		intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", ((android.os.Parcelable) (accesstoken)));
	//    5   10:aload_3         
	//    6   11:ldc1            #25  <String "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN">
	//    7   13:aload_1         
	//    8   14:invokevirtual   #191 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//    9   17:pop             
		intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", ((android.os.Parcelable) (accesstoken1)));
	//   10   18:aload_3         
	//   11   19:ldc1            #22  <String "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN">
	//   12   21:aload_2         
	//   13   22:invokevirtual   #191 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   14   25:pop             
		localBroadcastManager.sendBroadcast(intent);
	//   15   26:aload_0         
	//   16   27:getfield        #83  <Field LocalBroadcastManager localBroadcastManager>
	//   17   30:aload_3         
	//   18   31:invokevirtual   #195 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   19   34:pop             
	//   20   35:return          
	}

	private void setCurrentAccessToken(AccessToken accesstoken, boolean flag)
	{
		AccessToken accesstoken1 = currentAccessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field AccessToken currentAccessToken>
	//    2    4:astore_3        
		currentAccessToken = accesstoken;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #140 <Field AccessToken currentAccessToken>
		tokenRefreshInProgress.set(false);
	//    6   10:aload_0         
	//    7   11:getfield        #66  <Field AtomicBoolean tokenRefreshInProgress>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #200 <Method void AtomicBoolean.set(boolean)>
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
	//   23   43:invokevirtual   #204 <Method void AccessTokenCache.save(AccessToken)>
			} else
	//*  24   46:goto            62
			{
				accessTokenCache.clear();
	//   25   49:aload_0         
	//   26   50:getfield        #85  <Field AccessTokenCache accessTokenCache>
	//   27   53:invokevirtual   #207 <Method void AccessTokenCache.clear()>
				Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
	//   28   56:invokestatic    #128 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   29   59:invokestatic    #213 <Method void Utility.clearFacebookCookies(android.content.Context)>
			}
		if(!Utility.areObjectsEqual(((Object) (accesstoken1)), ((Object) (accesstoken))))
	//*  30   62:aload_3         
	//*  31   63:aload_1         
	//*  32   64:invokestatic    #217 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  33   67:ifne            76
			sendCurrentAccessTokenChangedBroadcast(accesstoken1, accesstoken);
	//   34   70:aload_0         
	//   35   71:aload_3         
	//   36   72:aload_1         
	//   37   73:invokespecial   #219 <Method void sendCurrentAccessTokenChangedBroadcast(AccessToken, AccessToken)>
	//   38   76:return          
	}

	private boolean shouldExtendAccessToken()
	{
		Object obj = ((Object) (currentAccessToken));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field AccessToken currentAccessToken>
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
	//   11   17:invokespecial   #148 <Method void Date()>
	//   12   20:invokevirtual   #225 <Method long Date.getTime()>
	//   13   23:invokestatic    #231 <Method Long Long.valueOf(long)>
	//   14   26:astore_3        
		boolean flag = flag1;
	//   15   27:iload_2         
	//   16   28:istore_1        
		if(currentAccessToken.getSource().canExtendToken())
	//*  17   29:aload_0         
	//*  18   30:getfield        #140 <Field AccessToken currentAccessToken>
	//*  19   33:invokevirtual   #237 <Method AccessTokenSource AccessToken.getSource()>
	//*  20   36:invokevirtual   #242 <Method boolean AccessTokenSource.canExtendToken()>
	//*  21   39:ifeq            89
		{
			flag = flag1;
	//   22   42:iload_2         
	//   23   43:istore_1        
			if(((Long) (obj)).longValue() - lastAttemptedTokenExtendDate.getTime() > 0x36ee80L)
	//*  24   44:aload_3         
	//*  25   45:invokevirtual   #245 <Method long Long.longValue()>
	//*  26   48:aload_0         
	//*  27   49:getfield        #73  <Field Date lastAttemptedTokenExtendDate>
	//*  28   52:invokevirtual   #225 <Method long Date.getTime()>
	//*  29   55:lsub            
	//*  30   56:ldc2w           #246 <Long 0x36ee80L>
	//*  31   59:lcmp            
	//*  32   60:ifle            89
			{
				flag = flag1;
	//   33   63:iload_2         
	//   34   64:istore_1        
				if(((Long) (obj)).longValue() - currentAccessToken.getLastRefresh().getTime() > 0x5265c00L)
	//*  35   65:aload_3         
	//*  36   66:invokevirtual   #245 <Method long Long.longValue()>
	//*  37   69:aload_0         
	//*  38   70:getfield        #140 <Field AccessToken currentAccessToken>
	//*  39   73:invokevirtual   #251 <Method Date AccessToken.getLastRefresh()>
	//*  40   76:invokevirtual   #225 <Method long Date.getTime()>
	//*  41   79:lsub            
	//*  42   80:ldc2w           #252 <Long 0x5265c00L>
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

	void extendAccessTokenIfNeeded()
	{
		if(!shouldExtendAccessToken())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #256 <Method boolean shouldExtendAccessToken()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			refreshCurrentAccessToken();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #259 <Method void refreshCurrentAccessToken()>
			return;
	//    6   12:return          
		}
	}

	AccessToken getCurrentAccessToken()
	{
		return currentAccessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field AccessToken currentAccessToken>
	//    2    4:areturn         
	}

	boolean loadCurrentAccessToken()
	{
		AccessToken accesstoken = accessTokenCache.load();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field AccessTokenCache accessTokenCache>
	//    2    4:invokevirtual   #265 <Method AccessToken AccessTokenCache.load()>
	//    3    7:astore_1        
		if(accesstoken != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          20
		{
			setCurrentAccessToken(accesstoken, false);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #267 <Method void setCurrentAccessToken(AccessToken, boolean)>
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

	void refreshCurrentAccessToken()
	{
		if(((Object) (Looper.getMainLooper())).equals(((Object) (Looper.myLooper()))))
	//*   0    0:invokestatic    #273 <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #276 <Method Looper Looper.myLooper()>
	//*   2    6:invokevirtual   #280 <Method boolean Object.equals(Object)>
	//*   3    9:ifeq            17
		{
			refreshCurrentAccessTokenImpl();
	//    4   12:aload_0         
	//    5   13:invokespecial   #91  <Method void refreshCurrentAccessTokenImpl()>
			return;
	//    6   16:return          
		} else
		{
			(new Handler(Looper.getMainLooper())).post(new Runnable() {

				public void run()
				{
					refreshCurrentAccessTokenImpl();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field AccessTokenManager this$0>
				//    2    4:invokestatic    #24  <Method void AccessTokenManager.access$000(AccessTokenManager)>
				//    3    7:return          
				}

				final AccessTokenManager this$0;

			
			{
				this$0 = AccessTokenManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AccessTokenManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    7   17:new             #282 <Class Handler>
	//    8   20:dup             
	//    9   21:invokestatic    #273 <Method Looper Looper.getMainLooper()>
	//   10   24:invokespecial   #285 <Method void Handler(Looper)>
	//   11   27:new             #6   <Class AccessTokenManager$1>
	//   12   30:dup             
	//   13   31:aload_0         
	//   14   32:invokespecial   #287 <Method void AccessTokenManager$1(AccessTokenManager)>
	//   15   35:invokevirtual   #291 <Method boolean Handler.post(Runnable)>
	//   16   38:pop             
			return;
	//   17   39:return          
		}
	}

	void setCurrentAccessToken(AccessToken accesstoken)
	{
		setCurrentAccessToken(accesstoken, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #267 <Method void setCurrentAccessToken(AccessToken, boolean)>
	//    4    6:return          
	}

	static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
	static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
	static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
	private static final String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
	static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
	static final String TAG = "AccessTokenManager";
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
	static void access$000(AccessTokenManager accesstokenmanager)
	{
		accesstokenmanager.refreshCurrentAccessTokenImpl();
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void refreshCurrentAccessTokenImpl()>
		return;
	//    2    4:return          
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
