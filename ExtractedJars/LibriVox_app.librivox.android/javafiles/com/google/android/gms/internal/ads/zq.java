// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, zo

final class zq
	implements Callable
{

	zq(zo zo, Context context, Context context1)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #13  <Field Context a>
		b = context1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #15  <Field Context b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #18  <Method void Object()>
	//    8   14:return          
	}

	public final Object call()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context a>
	//    2    4:astore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(obj != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          30
		{
			wx.a("Attempting to read user agent from Google Play Services.");
	//    7   11:ldc1            #23  <String "Attempting to read user agent from Google Play Services.">
	//    8   13:invokestatic    #28  <Method void wx.a(String)>
			obj = ((Object) (a.getSharedPreferences("admob_user_agent", 0)));
	//    9   16:aload_0         
	//   10   17:getfield        #13  <Field Context a>
	//   11   20:ldc1            #30  <String "admob_user_agent">
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #36  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   14   26:astore_2        
		} else
	//*  15   27:goto            48
		{
			wx.a("Attempting to read user agent from local cache.");
	//   16   30:ldc1            #38  <String "Attempting to read user agent from local cache.">
	//   17   32:invokestatic    #28  <Method void wx.a(String)>
			obj = ((Object) (b.getSharedPreferences("admob_user_agent", 0)));
	//   18   35:aload_0         
	//   19   36:getfield        #15  <Field Context b>
	//   20   39:ldc1            #30  <String "admob_user_agent">
	//   21   41:iconst_0        
	//   22   42:invokevirtual   #36  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   23   45:astore_2        
			flag = true;
	//   24   46:iconst_1        
	//   25   47:istore_1        
		}
		String s1 = ((SharedPreferences) (obj)).getString("user_agent", "");
	//   26   48:aload_2         
	//   27   49:ldc1            #40  <String "user_agent">
	//   28   51:ldc1            #42  <String "">
	//   29   53:invokeinterface #48  <Method String SharedPreferences.getString(String, String)>
	//   30   58:astore          4
		String s = s1;
	//   31   60:aload           4
	//   32   62:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  33   63:aload           4
	//*  34   65:invokestatic    #54  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  35   68:ifeq            120
		{
			wx.a("Reading user agent from WebSettings");
	//   36   71:ldc1            #56  <String "Reading user agent from WebSettings">
	//   37   73:invokestatic    #28  <Method void wx.a(String)>
			String s2 = WebSettings.getDefaultUserAgent(b);
	//   38   76:aload_0         
	//   39   77:getfield        #15  <Field Context b>
	//   40   80:invokestatic    #62  <Method String WebSettings.getDefaultUserAgent(Context)>
	//   41   83:astore          4
			s = s2;
	//   42   85:aload           4
	//   43   87:astore_3        
			if(flag)
	//*  44   88:iload_1         
	//*  45   89:ifeq            120
			{
				((SharedPreferences) (obj)).edit().putString("user_agent", s2).apply();
	//   46   92:aload_2         
	//   47   93:invokeinterface #66  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   48   98:ldc1            #40  <String "user_agent">
	//   49  100:aload           4
	//   50  102:invokeinterface #72  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   51  107:invokeinterface #75  <Method void android.content.SharedPreferences$Editor.apply()>
				wx.a("Persisting user agent.");
	//   52  112:ldc1            #77  <String "Persisting user agent.">
	//   53  114:invokestatic    #28  <Method void wx.a(String)>
				s = s2;
	//   54  117:aload           4
	//   55  119:astore_3        
			}
		}
		return ((Object) (s));
	//   56  120:aload_3         
	//   57  121:areturn         
	}

	private final Context a;
	private final Context b;
}
