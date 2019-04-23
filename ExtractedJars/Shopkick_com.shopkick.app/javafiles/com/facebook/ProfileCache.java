// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.Validate;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			FacebookSdk, Profile

final class ProfileCache
{

	ProfileCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #23  <Method Context FacebookSdk.getApplicationContext()>
	//    4    8:ldc1            #11  <String "com.facebook.AccessTokenManager.SharedPreferences">
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #29  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   14:putfield        #31  <Field SharedPreferences sharedPreferences>
	//    8   17:return          
	}

	void clear()
	{
		sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #39  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:ldc1            #8   <String "com.facebook.ProfileManager.CachedProfile">
	//    4   11:invokeinterface #45  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    5   16:invokeinterface #48  <Method void android.content.SharedPreferences$Editor.apply()>
	//    6   21:return          
	}

	Profile load()
	{
		Object obj = ((Object) (sharedPreferences.getString("com.facebook.ProfileManager.CachedProfile", ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field SharedPreferences sharedPreferences>
	//    2    4:ldc1            #8   <String "com.facebook.ProfileManager.CachedProfile">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #56  <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(obj != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          35
		{
			try
			{
				obj = ((Object) (new Profile(new JSONObject(((String) (obj))))));
	//    8   17:new             #58  <Class Profile>
	//    9   20:dup             
	//   10   21:new             #60  <Class JSONObject>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:invokespecial   #63  <Method void JSONObject(String)>
	//   14   29:invokespecial   #66  <Method void Profile(JSONObject)>
	//   15   32:astore_1        
			}
	//*  16   33:aload_1         
	//*  17   34:areturn         
	//*  18   35:aconst_null     
	//*  19   36:areturn         
			catch(JSONException jsonexception)
	//*  20   37:astore_1        
			{
				return null;
	//   21   38:aconst_null     
	//   22   39:areturn         
			}
			return ((Profile) (obj));
		} else
		{
			return null;
		}
	}

	void save(Profile profile)
	{
		Validate.notNull(((Object) (profile)), "profile");
	//    0    0:aload_1         
	//    1    1:ldc1            #70  <String "profile">
	//    2    3:invokestatic    #76  <Method void Validate.notNull(Object, String)>
		profile = ((Profile) (profile.toJSONObject()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #80  <Method JSONObject Profile.toJSONObject()>
	//    5   10:astore_1        
		if(profile != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          40
			sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", ((JSONObject) (profile)).toString()).apply();
	//    8   15:aload_0         
	//    9   16:getfield        #31  <Field SharedPreferences sharedPreferences>
	//   10   19:invokeinterface #39  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   11   24:ldc1            #8   <String "com.facebook.ProfileManager.CachedProfile">
	//   12   26:aload_1         
	//   13   27:invokevirtual   #84  <Method String JSONObject.toString()>
	//   14   30:invokeinterface #88  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   15   35:invokeinterface #48  <Method void android.content.SharedPreferences$Editor.apply()>
	//   16   40:return          
	}

	static final String CACHED_PROFILE_KEY = "com.facebook.ProfileManager.CachedProfile";
	static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
	private final SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
}
