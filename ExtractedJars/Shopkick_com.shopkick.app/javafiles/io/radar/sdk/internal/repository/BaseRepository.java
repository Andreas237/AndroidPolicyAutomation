// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal.repository;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

public abstract class BaseRepository
{

	public BaseRepository(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "context">
	//    2    3:invokestatic    #36  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//    3    6:aload_0         
	//    4    7:invokespecial   #39  <Method void Object()>
	//    5   10:aload_0         
	//    6   11:ldc1            #41  <String "RadarSDK">
	//    7   13:putfield        #43  <Field String SHARED_PREFS_NAME>
		context = ((Context) (context.getSharedPreferences(SHARED_PREFS_NAME, 0)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field String SHARED_PREFS_NAME>
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #48  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   13   25:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "context.getSharedPrefere\u2026ME, Context.MODE_PRIVATE)");
	//   14   26:aload_1         
	//   15   27:ldc1            #50  <String "context.getSharedPrefere\u2026ME, Context.MODE_PRIVATE)">
	//   16   29:invokestatic    #53  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		sharedPreferences = ((SharedPreferences) (context));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:putfield        #55  <Field SharedPreferences sharedPreferences>
	//   20   37:return          
	}

	protected final SharedPreferences getSharedPreferences()
	{
		return sharedPreferences;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field SharedPreferences sharedPreferences>
	//    2    4:areturn         
	}

	private final String SHARED_PREFS_NAME = "RadarSDK";
	private final SharedPreferences sharedPreferences;
}
