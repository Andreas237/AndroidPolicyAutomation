// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import io.radar.sdk.internal.RadarLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.internal.repository:
//			BaseRepository

public final class IdentityRepository extends BaseRepository
{
	public static final class Companion
	{

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void IdentityRepository$Companion()>
		//    2    4:return          
		}
	}


	public IdentityRepository(Context context1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context1)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #73  <String "context">
	//    2    3:invokestatic    #79  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(context1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #81  <Method void BaseRepository(Context)>
		context = context1;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #83  <Field Context context>
	//    9   16:return          
	}

	public final String getPublishableKey$sdk_release()
	{
		android.content.res.Resources.NotFoundException notfoundexception;
		String s = getSharedPreferences().getString("publishable_key", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #49  <String "publishable_key">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #98  <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(s != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          19
			return s;
	//    8   17:aload_1         
	//    9   18:areturn         
		try
		{
			s = context.getResources().getString(context.getResources().getIdentifier("radar_pk", "string", context.getPackageName()));
	//   10   19:aload_0         
	//   11   20:getfield        #83  <Field Context context>
	//   12   23:invokevirtual   #104 <Method Resources Context.getResources()>
	//   13   26:aload_0         
	//   14   27:getfield        #83  <Field Context context>
	//   15   30:invokevirtual   #104 <Method Resources Context.getResources()>
	//   16   33:ldc1            #106 <String "radar_pk">
	//   17   35:ldc1            #108 <String "string">
	//   18   37:aload_0         
	//   19   38:getfield        #83  <Field Context context>
	//   20   41:invokevirtual   #111 <Method String Context.getPackageName()>
	//   21   44:invokevirtual   #117 <Method int Resources.getIdentifier(String, String, String)>
	//   22   47:invokevirtual   #120 <Method String Resources.getString(int)>
	//   23   50:astore_1        
			setPublishableKey$sdk_release(s);
	//   24   51:aload_0         
	//   25   52:aload_1         
	//   26   53:invokevirtual   #122 <Method void setPublishableKey$sdk_release(String)>
		}
	//*  27   56:aload_1         
	//*  28   57:areturn         
	//*  29   58:getstatic       #128 <Field RadarLogger RadarLogger.INSTANCE>
	//*  30   61:ldc1            #130 <String "No publishable key found in string resources with name 'radar_pk'">
	//*  31   63:aconst_null     
	//*  32   64:iconst_2        
	//*  33   65:aconst_null     
	//*  34   66:invokestatic    #134 <Method void RadarLogger.w$default(RadarLogger, String, Throwable, int, Object)>
	//*  35   69:aconst_null     
	//*  36   70:areturn         
		// Misplaced declaration of an exception variable
		catch(android.content.res.Resources.NotFoundException notfoundexception)
		{
			RadarLogger.w$default(RadarLogger.INSTANCE, "No publishable key found in string resources with name 'radar_pk'", ((Throwable) (null)), 2, ((Object) (null)));
			return null;
		}
		return s;
	//*  37   71:astore_1        
	//*  38   72:goto            58
	}

	public final String getRadarId$sdk_release()
	{
		return getSharedPreferences().getString("radar_user_id", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #53  <String "radar_user_id">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #98  <Method String SharedPreferences.getString(String, String)>
	//    5   12:areturn         
	}

	public final String getUserDescription$sdk_release()
	{
		return getSharedPreferences().getString("user_description", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #56  <String "user_description">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #98  <Method String SharedPreferences.getString(String, String)>
	//    5   12:areturn         
	}

	public final String getUserId$sdk_release()
	{
		return getSharedPreferences().getString("user_id", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #59  <String "user_id">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #98  <Method String SharedPreferences.getString(String, String)>
	//    5   12:areturn         
	}

	public final String getUserMetadata$sdk_release()
	{
		return getSharedPreferences().getString("user_metadata", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #62  <String "user_metadata">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #98  <Method String SharedPreferences.getString(String, String)>
	//    5   12:areturn         
	}

	public final void setPublishableKey$sdk_release(String s)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #139 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #141 <String "editor">
	//    6   13:invokestatic    #144 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putString("publishable_key", s);
	//    7   16:aload_2         
	//    8   17:ldc1            #49  <String "publishable_key">
	//    9   19:aload_1         
	//   10   20:invokeinterface #150 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #153 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public final void setRadarId$sdk_release(String s)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #139 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #141 <String "editor">
	//    6   13:invokestatic    #144 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putString("radar_user_id", s);
	//    7   16:aload_2         
	//    8   17:ldc1            #53  <String "radar_user_id">
	//    9   19:aload_1         
	//   10   20:invokeinterface #150 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #153 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public final void setUserDescription$sdk_release(String s)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #139 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #141 <String "editor">
	//    6   13:invokestatic    #144 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putString("user_description", s);
	//    7   16:aload_2         
	//    8   17:ldc1            #56  <String "user_description">
	//    9   19:aload_1         
	//   10   20:invokeinterface #150 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #153 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public final void setUserId$sdk_release(String s)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #139 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #141 <String "editor">
	//    6   13:invokestatic    #144 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putString("user_id", s);
	//    7   16:aload_2         
	//    8   17:ldc1            #59  <String "user_id">
	//    9   19:aload_1         
	//   10   20:invokeinterface #150 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #153 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public final void setUserMetadata$sdk_release(String s)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #139 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #141 <String "editor">
	//    6   13:invokestatic    #144 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putString("user_metadata", s);
	//    7   16:aload_2         
	//    8   17:ldc1            #62  <String "user_metadata">
	//    9   19:aload_1         
	//   10   20:invokeinterface #150 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #153 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final String KEY_PUBLISHABLE_KEY = "publishable_key";
	public static final String KEY_RADAR_ID = "radar_user_id";
	public static final String KEY_USER_DESCRIPTION = "user_description";
	public static final String KEY_USER_ID = "user_id";
	public static final String KEY_USER_METADATA = "user_metadata";
	private final Context context;

	static 
	{
	//    0    0:new             #6   <Class IdentityRepository$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #68  <Method void IdentityRepository$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #70  <Field IdentityRepository$Companion Companion>
	//*   5   11:return          
	}
}
