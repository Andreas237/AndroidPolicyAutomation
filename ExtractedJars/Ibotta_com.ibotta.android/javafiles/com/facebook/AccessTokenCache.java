// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.Validate;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			FacebookSdk, AccessToken, LegacyTokenHelper

class AccessTokenCache
{
	static class SharedPreferencesTokenCachingStrategyFactory
	{

		public LegacyTokenHelper create()
		{
			return new LegacyTokenHelper(FacebookSdk.getApplicationContext());
		//    0    0:new             #16  <Class LegacyTokenHelper>
		//    1    3:dup             
		//    2    4:invokestatic    #22  <Method Context FacebookSdk.getApplicationContext()>
		//    3    7:invokespecial   #25  <Method void LegacyTokenHelper(Context)>
		//    4   10:areturn         
		}

		SharedPreferencesTokenCachingStrategyFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public AccessTokenCache()
	{
		this(FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new SharedPreferencesTokenCachingStrategyFactory());
	//    0    0:aload_0         
	//    1    1:invokestatic    #22  <Method Context FacebookSdk.getApplicationContext()>
	//    2    4:ldc1            #24  <String "com.facebook.AccessTokenManager.SharedPreferences">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #30  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:new             #6   <Class AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory>
	//    6   13:dup             
	//    7   14:invokespecial   #32  <Method void AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory()>
	//    8   17:invokespecial   #35  <Method void AccessTokenCache(SharedPreferences, AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory)>
	//    9   20:return          
	}

	AccessTokenCache(SharedPreferences sharedpreferences, SharedPreferencesTokenCachingStrategyFactory sharedpreferencestokencachingstrategyfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		sharedPreferences = sharedpreferences;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field SharedPreferences sharedPreferences>
		tokenCachingStrategyFactory = sharedpreferencestokencachingstrategyfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory tokenCachingStrategyFactory>
	//    8   14:return          
	}

	private AccessToken getCachedAccessToken()
	{
		Object obj = ((Object) (sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SharedPreferences sharedPreferences>
	//    2    4:ldc1            #47  <String "com.facebook.AccessTokenManager.CachedAccessToken">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #53  <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(obj != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          27
		{
			try
			{
				obj = ((Object) (AccessToken.createFromJSONObject(JSONObjectInstrumentation.init(((String) (obj))))));
	//    8   17:aload_1         
	//    9   18:invokestatic    #59  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   10   21:invokestatic    #65  <Method AccessToken AccessToken.createFromJSONObject(JSONObject)>
	//   11   24:astore_1        
			}
	//*  12   25:aload_1         
	//*  13   26:areturn         
	//*  14   27:aconst_null     
	//*  15   28:areturn         
			catch(JSONException jsonexception)
	//*  16   29:astore_1        
			{
				return null;
	//   17   30:aconst_null     
	//   18   31:areturn         
			}
			return ((AccessToken) (obj));
		} else
		{
			return null;
		}
	}

	private AccessToken getLegacyAccessToken()
	{
		android.os.Bundle bundle = getTokenCachingStrategy().load();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method LegacyTokenHelper getTokenCachingStrategy()>
	//    2    4:invokevirtual   #76  <Method android.os.Bundle LegacyTokenHelper.load()>
	//    3    7:astore_1        
		if(bundle != null && LegacyTokenHelper.hasTokenInformation(bundle))
	//*   4    8:aload_1         
	//*   5    9:ifnull          24
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #80  <Method boolean LegacyTokenHelper.hasTokenInformation(android.os.Bundle)>
	//*   8   16:ifeq            24
			return AccessToken.createFromLegacyCache(bundle);
	//    9   19:aload_1         
	//   10   20:invokestatic    #84  <Method AccessToken AccessToken.createFromLegacyCache(android.os.Bundle)>
	//   11   23:areturn         
		else
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
	}

	private LegacyTokenHelper getTokenCachingStrategy()
	{
		if(tokenCachingStrategy != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field LegacyTokenHelper tokenCachingStrategy>
	//    2    4:ifnonnull       37
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(tokenCachingStrategy == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #86  <Field LegacyTokenHelper tokenCachingStrategy>
	//*   7   13:ifnonnull       27
			tokenCachingStrategy = tokenCachingStrategyFactory.create();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory tokenCachingStrategyFactory>
	//   11   21:invokevirtual   #89  <Method LegacyTokenHelper AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory.create()>
	//   12   24:putfield        #86  <Field LegacyTokenHelper tokenCachingStrategy>
		this;
	//   13   27:aload_0         
		JVM INSTR monitorexit ;
	//   14   28:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   15   29:goto            37
		Exception exception;
		exception;
	//   16   32:astore_1        
		this;
	//   17   33:aload_0         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		throw exception;
	//   19   35:aload_1         
	//   20   36:athrow          
		return tokenCachingStrategy;
	//   21   37:aload_0         
	//   22   38:getfield        #86  <Field LegacyTokenHelper tokenCachingStrategy>
	//   23   41:areturn         
	}

	private boolean hasCachedAccessToken()
	{
		return sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken");
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SharedPreferences sharedPreferences>
	//    2    4:ldc1            #47  <String "com.facebook.AccessTokenManager.CachedAccessToken">
	//    3    6:invokeinterface #95  <Method boolean SharedPreferences.contains(String)>
	//    4   11:ireturn         
	}

	private boolean shouldCheckLegacyToken()
	{
		return FacebookSdk.isLegacyTokenUpgradeSupported();
	//    0    0:invokestatic    #99  <Method boolean FacebookSdk.isLegacyTokenUpgradeSupported()>
	//    1    3:ireturn         
	}

	public void clear()
	{
		sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #104 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:ldc1            #47  <String "com.facebook.AccessTokenManager.CachedAccessToken">
	//    4   11:invokeinterface #110 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    5   16:invokeinterface #113 <Method void android.content.SharedPreferences$Editor.apply()>
		if(shouldCheckLegacyToken())
	//*   6   21:aload_0         
	//*   7   22:invokespecial   #115 <Method boolean shouldCheckLegacyToken()>
	//*   8   25:ifeq            35
			getTokenCachingStrategy().clear();
	//    9   28:aload_0         
	//   10   29:invokespecial   #70  <Method LegacyTokenHelper getTokenCachingStrategy()>
	//   11   32:invokevirtual   #117 <Method void LegacyTokenHelper.clear()>
	//   12   35:return          
	}

	public AccessToken load()
	{
		if(hasCachedAccessToken())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #119 <Method boolean hasCachedAccessToken()>
	//*   2    4:ifeq            12
			return getCachedAccessToken();
	//    3    7:aload_0         
	//    4    8:invokespecial   #121 <Method AccessToken getCachedAccessToken()>
	//    5   11:areturn         
		AccessToken accesstoken;
		if(shouldCheckLegacyToken())
	//*   6   12:aload_0         
	//*   7   13:invokespecial   #115 <Method boolean shouldCheckLegacyToken()>
	//*   8   16:ifeq            44
		{
			AccessToken accesstoken1 = getLegacyAccessToken();
	//    9   19:aload_0         
	//   10   20:invokespecial   #123 <Method AccessToken getLegacyAccessToken()>
	//   11   23:astore_2        
			accesstoken = accesstoken1;
	//   12   24:aload_2         
	//   13   25:astore_1        
			if(accesstoken1 != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          46
			{
				save(accesstoken1);
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #127 <Method void save(AccessToken)>
				getTokenCachingStrategy().clear();
	//   19   35:aload_0         
	//   20   36:invokespecial   #70  <Method LegacyTokenHelper getTokenCachingStrategy()>
	//   21   39:invokevirtual   #117 <Method void LegacyTokenHelper.clear()>
				return accesstoken1;
	//   22   42:aload_2         
	//   23   43:areturn         
			}
		} else
		{
			accesstoken = null;
	//   24   44:aconst_null     
	//   25   45:astore_1        
		}
		return accesstoken;
	//   26   46:aload_1         
	//   27   47:areturn         
	}

	public void save(AccessToken accesstoken)
	{
		Validate.notNull(((Object) (accesstoken)), "accessToken");
	//    0    0:aload_1         
	//    1    1:ldc1            #129 <String "accessToken">
	//    2    3:invokestatic    #135 <Method void Validate.notNull(Object, String)>
		android.content.SharedPreferences.Editor editor;
		try
		{
			accesstoken = ((AccessToken) (accesstoken.toJSONObject()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #139 <Method JSONObject AccessToken.toJSONObject()>
	//    5   10:astore_1        
			editor = sharedPreferences.edit();
	//    6   11:aload_0         
	//    7   12:getfield        #39  <Field SharedPreferences sharedPreferences>
	//    8   15:invokeinterface #104 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   20:astore_2        
			if(!(accesstoken instanceof JSONObject))
	//*  10   21:aload_1         
	//*  11   22:instanceof      #141 <Class JSONObject>
	//*  12   25:ifne            36
			{
				accesstoken = ((AccessToken) (((JSONObject) (accesstoken)).toString()));
	//   13   28:aload_1         
	//   14   29:invokevirtual   #145 <Method String JSONObject.toString()>
	//   15   32:astore_1        
				break MISSING_BLOCK_LABEL_44;
	//   16   33:goto            44
			}
		}
	//*  17   36:aload_1         
	//*  18   37:checkcast       #141 <Class JSONObject>
	//*  19   40:invokestatic    #148 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*  20   43:astore_1        
	//*  21   44:aload_2         
	//*  22   45:ldc1            #47  <String "com.facebook.AccessTokenManager.CachedAccessToken">
	//*  23   47:aload_1         
	//*  24   48:invokeinterface #152 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//*  25   53:invokeinterface #113 <Method void android.content.SharedPreferences$Editor.apply()>
	//*  26   58:return          
		// Misplaced declaration of an exception variable
		catch(AccessToken accesstoken)
	//*  27   59:astore_1        
		{
			return;
	//   28   60:return          
		}
		accesstoken = ((AccessToken) (JSONObjectInstrumentation.toString((JSONObject)accesstoken)));
		editor.putString("com.facebook.AccessTokenManager.CachedAccessToken", ((String) (accesstoken))).apply();
		return;
	}

	private final SharedPreferences sharedPreferences;
	private LegacyTokenHelper tokenCachingStrategy;
	private final SharedPreferencesTokenCachingStrategyFactory tokenCachingStrategyFactory;
}
