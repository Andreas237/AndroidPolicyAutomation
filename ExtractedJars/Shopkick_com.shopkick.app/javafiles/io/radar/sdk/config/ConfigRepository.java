// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import io.radar.sdk.internal.repository.BaseRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class ConfigRepository extends BaseRepository
{
	private static final class Companion
	{

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void ConfigRepository$Companion()>
		//    2    4:return          
		}
	}


	public ConfigRepository(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #63  <String "context">
	//    2    3:invokestatic    #69  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(context);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #71  <Method void BaseRepository(Context)>
	//    6   11:return          
	}

	public final String getFacebookApiVersion$sdk_release()
	{
		String s = getSharedPreferences().getString("facebook_api_version", "3.0");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #48  <String "facebook_api_version">
	//    3    6:ldc1            #41  <String "3.0">
	//    4    8:invokeinterface #83  <Method String SharedPreferences.getString(String, String)>
	//    5   13:astore_1        
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          20
			return s;
	//    8   18:aload_1         
	//    9   19:areturn         
		else
			return "3.0";
	//   10   20:ldc1            #41  <String "3.0">
	//   11   22:areturn         
	}

	public final String getFacebookPlacesFields$sdk_release()
	{
		return getSharedPreferences().getString("facebook_places_fields", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #51  <String "facebook_places_fields">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #83  <Method String SharedPreferences.getString(String, String)>
	//    5   12:areturn         
	}

	public final void saveConfigJson$sdk_release(JSONObject jsonobject)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "obj");
	//    0    0:aload_1         
	//    1    1:ldc1            #87  <String "obj">
	//    2    3:invokestatic    #69  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		String s = jsonobject.optString("facebookApiVersion", ((String) (null)));
	//    3    6:aload_1         
	//    4    7:ldc1            #43  <String "facebookApiVersion">
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #92  <Method String JSONObject.optString(String, String)>
	//    7   13:astore_2        
		jsonobject = ((JSONObject) (jsonobject.optString("facebookPlacesFields", ((String) (null)))));
	//    8   14:aload_1         
	//    9   15:ldc1            #45  <String "facebookPlacesFields">
	//   10   17:aconst_null     
	//   11   18:invokevirtual   #92  <Method String JSONObject.optString(String, String)>
	//   12   21:astore_1        
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #77  <Method SharedPreferences getSharedPreferences()>
	//   15   26:invokeinterface #96  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   16   31:astore_3        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//   17   32:aload_3         
	//   18   33:ldc1            #98  <String "editor">
	//   19   35:invokestatic    #101 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putString("facebook_api_version", s);
	//   20   38:aload_3         
	//   21   39:ldc1            #48  <String "facebook_api_version">
	//   22   41:aload_2         
	//   23   42:invokeinterface #107 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   24   47:pop             
		editor.putString("facebook_places_fields", ((String) (jsonobject)));
	//   25   48:aload_3         
	//   26   49:ldc1            #51  <String "facebook_places_fields">
	//   27   51:aload_1         
	//   28   52:invokeinterface #107 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   29   57:pop             
		editor.apply();
	//   30   58:aload_3         
	//   31   59:invokeinterface #110 <Method void android.content.SharedPreferences$Editor.apply()>
	//   32   64:return          
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	private static final String DEFAULT_FACEBOOK_API = "3.0";
	private static final String FIELD_FACEBOOK_API_VERSION = "facebookApiVersion";
	private static final String FIELD_FACEBOOK_PLACES_FIELDS = "facebookPlacesFields";
	private static final String KEY_FACEBOOK_API_VERSION = "facebook_api_version";
	private static final String KEY_FACEBOOK_PLACES_FIELDS = "facebook_places_fields";

	static 
	{
	//    0    0:new             #6   <Class ConfigRepository$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #57  <Method void ConfigRepository$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #59  <Field ConfigRepository$Companion Companion>
	//*   5   11:return          
	}
}
