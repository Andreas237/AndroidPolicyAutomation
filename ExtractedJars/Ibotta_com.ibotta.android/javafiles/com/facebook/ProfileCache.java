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
//			FacebookSdk, Profile

final class ProfileCache
{

	ProfileCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #17  <Method Context FacebookSdk.getApplicationContext()>
	//    4    8:ldc1            #19  <String "com.facebook.AccessTokenManager.SharedPreferences">
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #25  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   14:putfield        #27  <Field SharedPreferences sharedPreferences>
	//    8   17:return          
	}

	void clear()
	{
		sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #35  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:ldc1            #37  <String "com.facebook.ProfileManager.CachedProfile">
	//    4   11:invokeinterface #43  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    5   16:invokeinterface #46  <Method void android.content.SharedPreferences$Editor.apply()>
	//    6   21:return          
	}

	Profile load()
	{
		Object obj = ((Object) (sharedPreferences.getString("com.facebook.ProfileManager.CachedProfile", ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SharedPreferences sharedPreferences>
	//    2    4:ldc1            #37  <String "com.facebook.ProfileManager.CachedProfile">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #54  <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(obj != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          31
		{
			try
			{
				obj = ((Object) (new Profile(JSONObjectInstrumentation.init(((String) (obj))))));
	//    8   17:new             #56  <Class Profile>
	//    9   20:dup             
	//   10   21:aload_1         
	//   11   22:invokestatic    #62  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   12   25:invokespecial   #65  <Method void Profile(JSONObject)>
	//   13   28:astore_1        
			}
	//*  14   29:aload_1         
	//*  15   30:areturn         
	//*  16   31:aconst_null     
	//*  17   32:areturn         
			catch(JSONException jsonexception)
	//*  18   33:astore_1        
			{
				return null;
	//   19   34:aconst_null     
	//   20   35:areturn         
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
	//    1    1:ldc1            #69  <String "profile">
	//    2    3:invokestatic    #75  <Method void Validate.notNull(Object, String)>
		profile = ((Profile) (profile.toJSONObject()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #79  <Method JSONObject Profile.toJSONObject()>
	//    5   10:astore_1        
		if(profile != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          62
		{
			android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    8   15:aload_0         
	//    9   16:getfield        #27  <Field SharedPreferences sharedPreferences>
	//   10   19:invokeinterface #35  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   11   24:astore_2        
			if(!(profile instanceof JSONObject))
	//*  12   25:aload_1         
	//*  13   26:instanceof      #81  <Class JSONObject>
	//*  14   29:ifne            40
				profile = ((Profile) (((JSONObject) (profile)).toString()));
	//   15   32:aload_1         
	//   16   33:invokevirtual   #85  <Method String JSONObject.toString()>
	//   17   36:astore_1        
			else
	//*  18   37:goto            48
				profile = ((Profile) (JSONObjectInstrumentation.toString((JSONObject)profile)));
	//   19   40:aload_1         
	//   20   41:checkcast       #81  <Class JSONObject>
	//   21   44:invokestatic    #88  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   22   47:astore_1        
			editor.putString("com.facebook.ProfileManager.CachedProfile", ((String) (profile))).apply();
	//   23   48:aload_2         
	//   24   49:ldc1            #37  <String "com.facebook.ProfileManager.CachedProfile">
	//   25   51:aload_1         
	//   26   52:invokeinterface #92  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   27   57:invokeinterface #46  <Method void android.content.SharedPreferences$Editor.apply()>
		}
	//   28   62:return          
	}

	private final SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
}
