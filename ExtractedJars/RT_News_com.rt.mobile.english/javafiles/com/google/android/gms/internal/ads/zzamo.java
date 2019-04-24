// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzamn

final class zzamo
	implements Callable
{

	zzamo(zzamn zzamn, Context context)
	{
		val$context = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #13  <Field Context val$context>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final Object call()
		throws Exception
	{
		Object obj = ((Object) (val$context.getSharedPreferences("admob_user_agent", 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context val$context>
	//    2    4:ldc1            #23  <String "admob_user_agent">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #29  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:astore_1        
		String s = ((SharedPreferences) (obj)).getString("user_agent", "");
	//    6   11:aload_1         
	//    7   12:ldc1            #31  <String "user_agent">
	//    8   14:ldc1            #33  <String "">
	//    9   16:invokeinterface #39  <Method String SharedPreferences.getString(String, String)>
	//   10   21:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  11   22:aload_2         
	//*  12   23:invokestatic    #45  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   26:ifeq            69
		{
			zzakb.v("User agent is not initialized on Google Play Services. Initializing.");
	//   14   29:ldc1            #47  <String "User agent is not initialized on Google Play Services. Initializing.">
	//   15   31:invokestatic    #53  <Method void zzakb.v(String)>
			s = WebSettings.getDefaultUserAgent(val$context);
	//   16   34:aload_0         
	//   17   35:getfield        #13  <Field Context val$context>
	//   18   38:invokestatic    #59  <Method String WebSettings.getDefaultUserAgent(Context)>
	//   19   41:astore_2        
			obj = ((Object) (((SharedPreferences) (obj)).edit().putString("user_agent", s)));
	//   20   42:aload_1         
	//   21   43:invokeinterface #63  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   22   48:ldc1            #31  <String "user_agent">
	//   23   50:aload_2         
	//   24   51:invokeinterface #69  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   25   56:astore_1        
			SharedPreferencesUtils.publishWorldReadableSharedPreferences(val$context, ((android.content.SharedPreferences.Editor) (obj)), "admob_user_agent");
	//   26   57:aload_0         
	//   27   58:getfield        #13  <Field Context val$context>
	//   28   61:aload_1         
	//   29   62:ldc1            #23  <String "admob_user_agent">
	//   30   64:invokestatic    #75  <Method void SharedPreferencesUtils.publishWorldReadableSharedPreferences(Context, android.content.SharedPreferences$Editor, String)>
			return ((Object) (s));
	//   31   67:aload_2         
	//   32   68:areturn         
		} else
		{
			zzakb.v("User agent is already initialized on Google Play Services.");
	//   33   69:ldc1            #77  <String "User agent is already initialized on Google Play Services.">
	//   34   71:invokestatic    #53  <Method void zzakb.v(String)>
			return ((Object) (s));
	//   35   74:aload_2         
	//   36   75:areturn         
		}
	}

	private final Context val$context;
}
