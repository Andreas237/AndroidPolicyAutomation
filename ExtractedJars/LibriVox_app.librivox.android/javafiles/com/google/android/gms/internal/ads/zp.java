// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.r;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, zo

final class zp
	implements Callable
{

	zp(zo zo, Context context)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field Context a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final Object call()
	{
		Object obj = ((Object) (a.getSharedPreferences("admob_user_agent", 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Context a>
	//    2    4:ldc1            #20  <String "admob_user_agent">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #26  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:astore_1        
		String s = ((SharedPreferences) (obj)).getString("user_agent", "");
	//    6   11:aload_1         
	//    7   12:ldc1            #28  <String "user_agent">
	//    8   14:ldc1            #30  <String "">
	//    9   16:invokeinterface #36  <Method String SharedPreferences.getString(String, String)>
	//   10   21:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  11   22:aload_2         
	//*  12   23:invokestatic    #42  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   26:ifeq            69
		{
			wx.a("User agent is not initialized on Google Play Services. Initializing.");
	//   14   29:ldc1            #44  <String "User agent is not initialized on Google Play Services. Initializing.">
	//   15   31:invokestatic    #49  <Method void wx.a(String)>
			s = WebSettings.getDefaultUserAgent(a);
	//   16   34:aload_0         
	//   17   35:getfield        #12  <Field Context a>
	//   18   38:invokestatic    #55  <Method String WebSettings.getDefaultUserAgent(Context)>
	//   19   41:astore_2        
			obj = ((Object) (((SharedPreferences) (obj)).edit().putString("user_agent", s)));
	//   20   42:aload_1         
	//   21   43:invokeinterface #59  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   22   48:ldc1            #28  <String "user_agent">
	//   23   50:aload_2         
	//   24   51:invokeinterface #65  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   25   56:astore_1        
			r.a(a, ((android.content.SharedPreferences.Editor) (obj)), "admob_user_agent");
	//   26   57:aload_0         
	//   27   58:getfield        #12  <Field Context a>
	//   28   61:aload_1         
	//   29   62:ldc1            #20  <String "admob_user_agent">
	//   30   64:invokestatic    #70  <Method void r.a(Context, android.content.SharedPreferences$Editor, String)>
			return ((Object) (s));
	//   31   67:aload_2         
	//   32   68:areturn         
		} else
		{
			wx.a("User agent is already initialized on Google Play Services.");
	//   33   69:ldc1            #72  <String "User agent is already initialized on Google Play Services.">
	//   34   71:invokestatic    #49  <Method void wx.a(String)>
			return ((Object) (s));
	//   35   74:aload_2         
	//   36   75:areturn         
		}
	}

	private final Context a;
}
