// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.location;

import android.content.Context;
import android.content.SharedPreferences;
import io.radar.sdk.internal.repository.BaseRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LocationManagerRepository extends BaseRepository
{
	public static final class Companion
	{

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void LocationManagerRepository$Companion()>
		//    2    4:return          
		}
	}


	public LocationManagerRepository(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #49  <String "context">
	//    2    3:invokestatic    #55  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(context);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #57  <Method void BaseRepository(Context)>
	//    6   11:return          
	}

	public final boolean getHasStarted$sdk_release()
	{
		return getSharedPreferences().getBoolean("has_started", false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #37  <String "has_started">
	//    3    6:iconst_0        
	//    4    7:invokeinterface #69  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   12:ireturn         
	}

	public final void setHasStarted$sdk_release(boolean flag)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #73  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #75  <String "editor">
	//    6   13:invokestatic    #78  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putBoolean("has_started", flag);
	//    7   16:aload_2         
	//    8   17:ldc1            #37  <String "has_started">
	//    9   19:iload_1         
	//   10   20:invokeinterface #84  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #87  <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final String KEY_STARTED = "has_started";

	static 
	{
	//    0    0:new             #6   <Class LocationManagerRepository$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #44  <Method void LocationManagerRepository$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #46  <Field LocationManagerRepository$Companion Companion>
	//*   5   11:return          
	}
}
