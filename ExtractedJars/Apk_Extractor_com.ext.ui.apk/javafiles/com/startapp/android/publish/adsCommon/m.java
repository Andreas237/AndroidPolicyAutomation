// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.a.b;
import com.startapp.android.publish.adsCommon.a.e;
import com.startapp.android.publish.adsCommon.a.f;
import com.startapp.android.publish.adsCommon.activities.FullScreenActivity;
import com.startapp.android.publish.cache.ACMConfig;
import com.startapp.android.publish.cache.a;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.d;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.c;
import com.startapp.common.a.g;
import com.truenet.android.TrueNetSDK;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			b, k, g, c, 
//			StartAppAd, l, AdsConstants, SDKAdPreferences, 
//			j, f

public class m
{
	private static class a
	{

		static m a()
		{
			return a;
		//    0    0:getstatic       #16  <Field m a>
		//    1    3:areturn         
		}

		private static final m a = new m();

		static 
		{
		//    0    0:new             #6   <Class m>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #14  <Method void m(m$1)>
		//    4    8:putstatic       #16  <Field m a>
		//*   5   11:return          
		}
	}


	private m()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		b = com.startapp.android.publish.adsCommon.Utils.i.a(512L);
	//    2    4:aload_0         
	//    3    5:ldc2w           #59  <Long 512L>
	//    4    8:invokestatic    #65  <Method boolean i.a(long)>
	//    5   11:putfield        #67  <Field boolean b>
		d = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #69  <Field boolean d>
		e = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #71  <Field boolean e>
		f = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #73  <Field boolean f>
		h = null;
	//   15   29:aload_0         
	//   16   30:aconst_null     
	//   17   31:putfield        #75  <Field Application h>
		i = new HashMap();
	//   18   34:aload_0         
	//   19   35:new             #77  <Class HashMap>
	//   20   38:dup             
	//   21   39:invokespecial   #78  <Method void HashMap()>
	//   22   42:putfield        #80  <Field HashMap i>
		l = false;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #82  <Field boolean l>
		n = false;
	//   26   50:aload_0         
	//   27   51:iconst_0        
	//   28   52:putfield        #84  <Field boolean n>
		o = true;
	//   29   55:aload_0         
	//   30   56:iconst_1        
	//   31   57:putfield        #86  <Field boolean o>
		p = false;
	//   32   60:aload_0         
	//   33   61:iconst_0        
	//   34   62:putfield        #88  <Field boolean p>
		q = false;
	//   35   65:aload_0         
	//   36   66:iconst_0        
	//   37   67:putfield        #90  <Field boolean q>
		s = null;
	//   38   70:aload_0         
	//   39   71:aconst_null     
	//   40   72:putfield        #92  <Field Bundle s>
		t = null;
	//   41   75:aload_0         
	//   42   76:aconst_null     
	//   43   77:putfield        #94  <Field com.startapp.android.publish.cache.c t>
		v = false;
	//   44   80:aload_0         
	//   45   81:iconst_0        
	//   46   82:putfield        #96  <Field boolean v>
		w = false;
	//   47   85:aload_0         
	//   48   86:iconst_0        
	//   49   87:putfield        #98  <Field boolean w>
		x = false;
	//   50   90:aload_0         
	//   51   91:iconst_0        
	//   52   92:putfield        #100 <Field boolean x>
		y = null;
	//   53   95:aload_0         
	//   54   96:aconst_null     
	//   55   97:putfield        #102 <Field com.startapp.android.publish.adsCommon.g y>
		z = false;
	//   56  100:aload_0         
	//   57  101:iconst_0        
	//   58  102:putfield        #104 <Field boolean z>
	//   59  105:return          
	}


	public static m a()
	{
		return com.startapp.android.publish.adsCommon.a.a();
	//    0    0:invokestatic    #110 <Method m com.startapp.android.publish.adsCommon.m$a.a()>
	//    1    3:areturn         
	}

	public static Object a(Application application)
	{
		android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks = new android.app.Application.ActivityLifecycleCallbacks() {

			public void onActivityCreated(Activity activity, Bundle bundle)
			{
				com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityCreated [").append(((Object) (activity)).getClass().getName()).append(", ").append(((Object) (bundle))).append("]").toString());
			//    0    0:ldc1            #20  <String "StartAppSDKInternal">
			//    1    2:iconst_3        
			//    2    3:new             #22  <Class StringBuilder>
			//    3    6:dup             
			//    4    7:invokespecial   #23  <Method void StringBuilder()>
			//    5   10:ldc1            #25  <String "onActivityCreated [">
			//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
			//    9   19:invokevirtual   #39  <Method String Class.getName()>
			//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   11   25:ldc1            #41  <String ", ">
			//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   13   30:aload_2         
			//   14   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
			//   15   34:ldc1            #46  <String "]">
			//   16   36:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   17   39:invokevirtual   #49  <Method String StringBuilder.toString()>
			//   18   42:invokestatic    #54  <Method void g.a(String, int, String)>
				com.startapp.android.publish.adsCommon.m.a().a(activity, bundle);
			//   19   45:invokestatic    #57  <Method m com.startapp.android.publish.adsCommon.m.a()>
			//   20   48:aload_1         
			//   21   49:aload_2         
			//   22   50:invokevirtual   #59  <Method void com.startapp.android.publish.adsCommon.m.a(Activity, Bundle)>
				if(com.startapp.android.publish.adsCommon.Utils.i.a(2L))
			//*  23   53:ldc2w           #60  <Long 2L>
			//*  24   56:invokestatic    #66  <Method boolean i.a(long)>
			//*  25   59:ifeq            70
					com.startapp.android.publish.adsCommon.f.a().a(activity, bundle);
			//   26   62:invokestatic    #71  <Method com.startapp.android.publish.adsCommon.f com.startapp.android.publish.adsCommon.f.a()>
			//   27   65:aload_1         
			//   28   66:aload_2         
			//   29   67:invokevirtual   #72  <Method void com.startapp.android.publish.adsCommon.f.a(Activity, Bundle)>
			//   30   70:return          
			}

			public void onActivityDestroyed(Activity activity)
			{
				com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityDestroyed [").append(((Object) (activity)).getClass().getName()).append("]").toString());
			//    0    0:ldc1            #20  <String "StartAppSDKInternal">
			//    1    2:iconst_3        
			//    2    3:new             #22  <Class StringBuilder>
			//    3    6:dup             
			//    4    7:invokespecial   #23  <Method void StringBuilder()>
			//    5   10:ldc1            #76  <String "onActivityDestroyed [">
			//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
			//    9   19:invokevirtual   #39  <Method String Class.getName()>
			//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   11   25:ldc1            #46  <String "]">
			//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
			//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
				com.startapp.android.publish.adsCommon.m.a().e(activity);
			//   15   36:invokestatic    #57  <Method m com.startapp.android.publish.adsCommon.m.a()>
			//   16   39:aload_1         
			//   17   40:invokevirtual   #79  <Method void com.startapp.android.publish.adsCommon.m.e(Activity)>
			//   18   43:return          
			}

			public void onActivityPaused(Activity activity)
			{
				com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityPaused [").append(((Object) (activity)).getClass().getName()).append("]").toString());
			//    0    0:ldc1            #20  <String "StartAppSDKInternal">
			//    1    2:iconst_3        
			//    2    3:new             #22  <Class StringBuilder>
			//    3    6:dup             
			//    4    7:invokespecial   #23  <Method void StringBuilder()>
			//    5   10:ldc1            #82  <String "onActivityPaused [">
			//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
			//    9   19:invokevirtual   #39  <Method String Class.getName()>
			//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   11   25:ldc1            #46  <String "]">
			//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
			//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
				com.startapp.android.publish.adsCommon.m.a().c(activity);
			//   15   36:invokestatic    #57  <Method m com.startapp.android.publish.adsCommon.m.a()>
			//   16   39:aload_1         
			//   17   40:invokevirtual   #85  <Method void com.startapp.android.publish.adsCommon.m.c(Activity)>
			//   18   43:return          
			}

			public void onActivityResumed(Activity activity)
			{
				com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityResumed [").append(((Object) (activity)).getClass().getName()).append("]").toString());
			//    0    0:ldc1            #20  <String "StartAppSDKInternal">
			//    1    2:iconst_3        
			//    2    3:new             #22  <Class StringBuilder>
			//    3    6:dup             
			//    4    7:invokespecial   #23  <Method void StringBuilder()>
			//    5   10:ldc1            #88  <String "onActivityResumed [">
			//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
			//    9   19:invokevirtual   #39  <Method String Class.getName()>
			//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   11   25:ldc1            #46  <String "]">
			//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
			//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
				com.startapp.android.publish.adsCommon.m.a().b(activity);
			//   15   36:invokestatic    #57  <Method m com.startapp.android.publish.adsCommon.m.a()>
			//   16   39:aload_1         
			//   17   40:invokevirtual   #91  <Method void com.startapp.android.publish.adsCommon.m.b(Activity)>
			//   18   43:return          
			}

			public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
			{
				com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivitySaveInstanceState [").append(((Object) (activity)).getClass().getName()).append("]").toString());
			//    0    0:ldc1            #20  <String "StartAppSDKInternal">
			//    1    2:iconst_3        
			//    2    3:new             #22  <Class StringBuilder>
			//    3    6:dup             
			//    4    7:invokespecial   #23  <Method void StringBuilder()>
			//    5   10:ldc1            #94  <String "onActivitySaveInstanceState [">
			//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
			//    9   19:invokevirtual   #39  <Method String Class.getName()>
			//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   11   25:ldc1            #46  <String "]">
			//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
			//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
				com.startapp.android.publish.adsCommon.m.a().b(activity, bundle);
			//   15   36:invokestatic    #57  <Method m com.startapp.android.publish.adsCommon.m.a()>
			//   16   39:aload_1         
			//   17   40:aload_2         
			//   18   41:invokevirtual   #96  <Method void com.startapp.android.publish.adsCommon.m.b(Activity, Bundle)>
			//   19   44:return          
			}

			public void onActivityStarted(Activity activity)
			{
				com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityStarted [").append(((Object) (activity)).getClass().getName()).append("]").toString());
			//    0    0:ldc1            #20  <String "StartAppSDKInternal">
			//    1    2:iconst_3        
			//    2    3:new             #22  <Class StringBuilder>
			//    3    6:dup             
			//    4    7:invokespecial   #23  <Method void StringBuilder()>
			//    5   10:ldc1            #99  <String "onActivityStarted [">
			//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
			//    9   19:invokevirtual   #39  <Method String Class.getName()>
			//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   11   25:ldc1            #46  <String "]">
			//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
			//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
				com.startapp.android.publish.adsCommon.m.a().a(activity);
			//   15   36:invokestatic    #57  <Method m com.startapp.android.publish.adsCommon.m.a()>
			//   16   39:aload_1         
			//   17   40:invokevirtual   #101 <Method void com.startapp.android.publish.adsCommon.m.a(Activity)>
			//   18   43:return          
			}

			public void onActivityStopped(Activity activity)
			{
				com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityStopped [").append(((Object) (activity)).getClass().getName()).append("]").toString());
			//    0    0:ldc1            #20  <String "StartAppSDKInternal">
			//    1    2:iconst_3        
			//    2    3:new             #22  <Class StringBuilder>
			//    3    6:dup             
			//    4    7:invokespecial   #23  <Method void StringBuilder()>
			//    5   10:ldc1            #104 <String "onActivityStopped [">
			//    6   12:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #33  <Method Class Object.getClass()>
			//    9   19:invokevirtual   #39  <Method String Class.getName()>
			//   10   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   11   25:ldc1            #46  <String "]">
			//   12   27:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
			//   13   30:invokevirtual   #49  <Method String StringBuilder.toString()>
			//   14   33:invokestatic    #54  <Method void g.a(String, int, String)>
				com.startapp.android.publish.adsCommon.m.a().d(activity);
			//   15   36:invokestatic    #57  <Method m com.startapp.android.publish.adsCommon.m.a()>
			//   16   39:aload_1         
			//   17   40:invokevirtual   #107 <Method void com.startapp.android.publish.adsCommon.m.d(Activity)>
			//   18   43:return          
			}

		}
;
	//    0    0:new             #10  <Class m$3>
	//    1    3:dup             
	//    2    4:invokespecial   #115 <Method void m$3()>
	//    3    7:astore_1        
		application.registerActivityLifecycleCallbacks(activitylifecyclecallbacks);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #121 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
		return ((Object) (activitylifecyclecallbacks));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public static void a(Application application, Object obj)
	{
		application.unregisterActivityLifecycleCallbacks((android.app.Application.ActivityLifecycleCallbacks)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #125 <Class android.app.Application$ActivityLifecycleCallbacks>
	//    3    5:invokevirtual   #128 <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//    4    8:return          
	}

	private void a(Context context, long l1)
	{
		(new Handler(Looper.getMainLooper())).postDelayed(new Runnable(context) {

			public void run()
			{
				try
				{
					WebView webview = new WebView(a);
			//    0    0:new             #29  <Class WebView>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field Context a>
			//    4    8:invokespecial   #32  <Method void WebView(Context)>
			//    5   11:astore_1        
					com.startapp.android.publish.adsCommon.k.b(a, "User-Agent", webview.getSettings().getUserAgentString());
			//    6   12:aload_0         
			//    7   13:getfield        #20  <Field Context a>
			//    8   16:ldc1            #34  <String "User-Agent">
			//    9   18:aload_1         
			//   10   19:invokevirtual   #38  <Method WebSettings WebView.getSettings()>
			//   11   22:invokevirtual   #44  <Method String WebSettings.getUserAgentString()>
			//   12   25:invokestatic    #49  <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, String)>
					return;
			//   13   28:return          
				}
				catch(Exception exception)
			//*  14   29:astore_1        
				{
					com.startapp.android.publish.adsCommon.e.f.a(a, com.startapp.android.publish.adsCommon.e.d.b, "NetworkUtils.saveUserAgent - Webview failed", exception.getMessage(), "");
			//   15   30:aload_0         
			//   16   31:getfield        #20  <Field Context a>
			//   17   34:getstatic       #54  <Field com.startapp.android.publish.adsCommon.e.d com.startapp.android.publish.adsCommon.e.d.b>
			//   18   37:ldc1            #56  <String "NetworkUtils.saveUserAgent - Webview failed">
			//   19   39:aload_1         
			//   20   40:invokevirtual   #59  <Method String Exception.getMessage()>
			//   21   43:ldc1            #61  <String "">
			//   22   45:invokestatic    #66  <Method void com.startapp.android.publish.adsCommon.e.f.a(Context, com.startapp.android.publish.adsCommon.e.d, String, String, String)>
				}
			//   23   48:return          
			}

			final Context a;
			final m b;

			
			{
				b = m.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field m b>
				a = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Context a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, l1);
	//    0    0:new             #131 <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #137 <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #140 <Method void Handler(Looper)>
	//    4   10:new             #12  <Class m$4>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #143 <Method void m$4(m, Context)>
	//    9   19:lload_2         
	//   10   20:invokevirtual   #147 <Method boolean Handler.postDelayed(Runnable, long)>
	//   11   23:pop             
	//   12   24:return          
	}

	private void a(Context context, AdPreferences adpreferences)
	{
		if(h() && !com.startapp.android.publish.adsCommon.b.a().y())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #151 <Method boolean h()>
	//*   2    4:ifeq            28
	//*   3    7:invokestatic    #156 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//*   4   10:invokevirtual   #158 <Method boolean b.y()>
	//*   5   13:ifne            28
			t = com.startapp.android.publish.cache.a.a().a(context, adpreferences);
	//    6   16:aload_0         
	//    7   17:invokestatic    #163 <Method a a.a()>
	//    8   20:aload_1         
	//    9   21:aload_2         
	//   10   22:invokevirtual   #166 <Method com.startapp.android.publish.cache.c a.a(Context, AdPreferences)>
	//   11   25:putfield        #94  <Field com.startapp.android.publish.cache.c t>
	//   12   28:return          
	}

	private void a(Context context, boolean flag)
	{
		g(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #170 <Method void g(boolean)>
		f(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #172 <Method void f(boolean)>
		if(com.startapp.common.a.c.b() && com.startapp.android.publish.adsCommon.Utils.i.a(2L))
	//*   6   10:invokestatic    #176 <Method boolean c.b()>
	//*   7   13:ifeq            66
	//*   8   16:ldc2w           #177 <Long 2L>
	//*   9   19:invokestatic    #65  <Method boolean i.a(long)>
	//*  10   22:ifeq            66
		{
			g(flag);
	//   11   25:aload_0         
	//   12   26:iload_2         
	//   13   27:invokespecial   #170 <Method void g(boolean)>
			f(true);
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:invokespecial   #172 <Method void f(boolean)>
			com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("Return Ads: [").append(flag).append("]").toString());
	//   17   35:ldc1            #180 <String "StartAppSDKInternal">
	//   18   37:iconst_3        
	//   19   38:new             #182 <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #183 <Method void StringBuilder()>
	//   22   45:ldc1            #185 <String "Return Ads: [">
	//   23   47:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:iload_2         
	//   25   51:invokevirtual   #192 <Method StringBuilder StringBuilder.append(boolean)>
	//   26   54:ldc1            #194 <String "]">
	//   27   56:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:invokevirtual   #198 <Method String StringBuilder.toString()>
	//   29   62:invokestatic    #203 <Method void g.a(String, int, String)>
			return;
	//   30   65:return          
		} else
		{
			com.startapp.common.a.g.a("StartAppSDKInternal", 6, "Cannot activate return interstitials, cache to disk, ttl reload - api lower than 14");
	//   31   66:ldc1            #180 <String "StartAppSDKInternal">
	//   32   68:bipush          6
	//   33   70:ldc1            #205 <String "Cannot activate return interstitials, cache to disk, ttl reload - api lower than 14">
	//   34   72:invokestatic    #203 <Method void g.a(String, int, String)>
			return;
	//   35   75:return          
		}
	}

	static void a(m m1, Context context, long l1)
	{
		m1.a(context, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #208 <Method void a(Context, long)>
	//    4    6:return          
	}

	static boolean a(m m1)
	{
		return m1.z;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field boolean z>
	//    2    4:ireturn         
	}

	static boolean a(m m1, boolean flag)
	{
		m1.z = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #104 <Field boolean z>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void b(Context context, String s1, String s2)
	{
		boolean flag = com.startapp.android.publish.adsCommon.k.a(context, s2, Boolean.valueOf(false)).booleanValue();
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//    4    6:invokestatic    #222 <Method Boolean com.startapp.android.publish.adsCommon.k.a(Context, String, Boolean)>
	//    5    9:invokevirtual   #225 <Method boolean Boolean.booleanValue()>
	//    6   12:istore          4
		boolean flag1 = com.startapp.common.a.c.a(context, s1);
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:invokestatic    #228 <Method boolean c.a(Context, String)>
	//   10   19:istore          5
		if(flag != flag1)
	//*  11   21:iload           4
	//*  12   23:iload           5
	//*  13   25:icmpeq          50
		{
			com.startapp.android.publish.adsCommon.k.b(context, s2, Boolean.valueOf(flag1));
	//   14   28:aload_1         
	//   15   29:aload_3         
	//   16   30:iload           5
	//   17   32:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//   18   35:invokestatic    #231 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Boolean)>
			a(context, s1, System.currentTimeMillis(), flag1, false);
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:aload_2         
	//   22   41:invokestatic    #237 <Method long System.currentTimeMillis()>
	//   23   44:iload           5
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #240 <Method void a(Context, String, long, boolean, boolean)>
		}
	//   26   50:return          
	}

	private static boolean c(String s1)
	{
		try
		{
			Class.forName(s1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #251 <Method Class Class.forName(String)>
	//    2    4:pop             
		}
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*   5    7:astore_0        
		{
			return false;
	//    6    8:iconst_0        
	//    7    9:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*   8   10:astore_0        
		{
			return false;
	//    9   11:iconst_0        
	//   10   12:ireturn         
		}
		return true;
	}

	private static String d(String s1)
	{
		try
		{
			s1 = (String)Class.forName((new StringBuilder()).append(s1).append(".StartAppConstants").toString()).getField("WRAPPER_VERSION").get(((Object) (null)));
	//    0    0:new             #182 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #183 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc1            #254 <String ".StartAppConstants">
	//    6   13:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #198 <Method String StringBuilder.toString()>
	//    8   19:invokestatic    #251 <Method Class Class.forName(String)>
	//    9   22:ldc2            #256 <String "WRAPPER_VERSION">
	//   10   25:invokevirtual   #260 <Method Field Class.getField(String)>
	//   11   28:aconst_null     
	//   12   29:invokevirtual   #266 <Method Object Field.get(Object)>
	//   13   32:checkcast       #268 <Class String>
	//   14   35:astore_0        
		}
	//*  15   36:aload_0         
	//*  16   37:areturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  17   38:astore_0        
		{
			return "0";
	//   18   39:ldc2            #270 <String "0">
	//   19   42:areturn         
		}
		return s1;
	}

	private void f(Activity activity)
	{
		d = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #69  <Field boolean d>
		o(((Context) (activity)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #274 <Method void o(Context)>
		if(com.startapp.common.c.a() != null)
	//*   6   10:invokestatic    #279 <Method com.startapp.common.c com.startapp.common.c.a()>
	//*   7   13:ifnull          23
			com.startapp.common.c.a().b(((Context) (activity)));
	//    8   16:invokestatic    #279 <Method com.startapp.common.c com.startapp.common.c.a()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #281 <Method void com.startapp.common.c.b(Context)>
	//   11   23:return          
	}

	private void f(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #283 <Field boolean c>
	//    3    5:return          
	}

	private void g(Activity activity)
	{
		if(!MetaData.getInstance().canShowAd() || !h() || com.startapp.android.publish.adsCommon.b.a().y() || com.startapp.android.publish.adsCommon.Utils.i.a() || c() || !q()) goto _L2; else goto _L1
	//    0    0:invokestatic    #289 <Method MetaData MetaData.getInstance()>
	//    1    3:invokevirtual   #292 <Method boolean MetaData.canShowAd()>
	//    2    6:ifeq            129
	//    3    9:aload_0         
	//    4   10:invokevirtual   #151 <Method boolean h()>
	//    5   13:ifeq            129
	//    6   16:invokestatic    #156 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//    7   19:invokevirtual   #158 <Method boolean b.y()>
	//    8   22:ifne            129
	//    9   25:invokestatic    #294 <Method boolean i.a()>
	//   10   28:ifne            129
	//   11   31:aload_0         
	//   12   32:invokevirtual   #296 <Method boolean c()>
	//   13   35:ifne            129
	//   14   38:aload_0         
	//   15   39:invokespecial   #298 <Method boolean q()>
	//   16   42:ifeq            129
_L1:
		y = com.startapp.android.publish.cache.a.a().a(t);
	//   17   45:aload_0         
	//   18   46:invokestatic    #163 <Method a a.a()>
	//   19   49:aload_0         
	//   20   50:getfield        #94  <Field com.startapp.android.publish.cache.c t>
	//   21   53:invokevirtual   #301 <Method com.startapp.android.publish.adsCommon.g a.a(com.startapp.android.publish.cache.c)>
	//   22   56:putfield        #102 <Field com.startapp.android.publish.adsCommon.g y>
		if(y == null || !y.isReady()) goto _L2; else goto _L3
	//   23   59:aload_0         
	//   24   60:getfield        #102 <Field com.startapp.android.publish.adsCommon.g y>
	//   25   63:ifnull          129
	//   26   66:aload_0         
	//   27   67:getfield        #102 <Field com.startapp.android.publish.adsCommon.g y>
	//   28   70:invokeinterface #306 <Method boolean g.isReady()>
	//   29   75:ifeq            129
_L3:
		f f1 = com.startapp.android.publish.adsCommon.b.a().E().a(com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_RETURN, ((String) (null)));
	//   30   78:invokestatic    #156 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//   31   81:invokevirtual   #310 <Method e b.E()>
	//   32   84:getstatic       #316 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_RETURN>
	//   33   87:aconst_null     
	//   34   88:invokevirtual   #321 <Method f e.a(com.startapp.android.publish.common.model.AdPreferences$Placement, String)>
	//   35   91:astore_2        
		if(!f1.a()) goto _L5; else goto _L4
	//   36   92:aload_2         
	//   37   93:invokevirtual   #324 <Method boolean f.a()>
	//   38   96:ifeq            158
_L4:
		if(y.a(((String) (null))))
	//*  39   99:aload_0         
	//*  40  100:getfield        #102 <Field com.startapp.android.publish.adsCommon.g y>
	//*  41  103:aconst_null     
	//*  42  104:invokeinterface #326 <Method boolean com.startapp.android.publish.adsCommon.g.a(String)>
	//*  43  109:ifeq            129
			com.startapp.android.publish.adsCommon.a.b.a().a(new com.startapp.android.publish.adsCommon.a.a(com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_RETURN, ((String) (null))));
	//   44  112:invokestatic    #331 <Method b b.a()>
	//   45  115:new             #333 <Class com.startapp.android.publish.adsCommon.a.a>
	//   46  118:dup             
	//   47  119:getstatic       #316 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_RETURN>
	//   48  122:aconst_null     
	//   49  123:invokespecial   #336 <Method void com.startapp.android.publish.adsCommon.a.a(com.startapp.android.publish.common.model.AdPreferences$Placement, String)>
	//   50  126:invokevirtual   #339 <Method void b.a(com.startapp.android.publish.adsCommon.a.a)>
_L2:
		if(com.startapp.common.c.a() != null)
	//*  51  129:invokestatic    #279 <Method com.startapp.common.c com.startapp.common.c.a()>
	//*  52  132:ifnull          142
			com.startapp.common.c.a().a(((Context) (activity)));
	//   53  135:invokestatic    #279 <Method com.startapp.common.c com.startapp.common.c.a()>
	//   54  138:aload_1         
	//   55  139:invokevirtual   #341 <Method void com.startapp.common.c.a(Context)>
		if(r())
	//*  56  142:aload_0         
	//*  57  143:invokespecial   #343 <Method boolean r()>
	//*  58  146:ifeq            157
			a(((Context) (activity)), com.startapp.android.publish.common.metaData.MetaDataRequest.a.b);
	//   59  149:aload_0         
	//   60  150:aload_1         
	//   61  151:getstatic       #348 <Field com.startapp.android.publish.common.metaData.MetaDataRequest$a com.startapp.android.publish.common.metaData.MetaDataRequest$a.b>
	//   62  154:invokevirtual   #351 <Method void a(Context, com.startapp.android.publish.common.metaData.MetaDataRequest$a)>
		return;
	//   63  157:return          
_L5:
		com.startapp.android.publish.adsCommon.c.a(((Context) (activity)), ((com.startapp.android.publish.ads.b.e)y).l(), ((String) (null)), f1.c());
	//   64  158:aload_1         
	//   65  159:aload_0         
	//   66  160:getfield        #102 <Field com.startapp.android.publish.adsCommon.g y>
	//   67  163:checkcast       #353 <Class com.startapp.android.publish.ads.b.e>
	//   68  166:invokevirtual   #356 <Method String[] com.startapp.android.publish.ads.b.e.l()>
	//   69  169:aconst_null     
	//   70  170:aload_2         
	//   71  171:invokevirtual   #358 <Method String f.c()>
	//   72  174:invokestatic    #363 <Method void com.startapp.android.publish.adsCommon.c.a(Context, String[], String, String)>
		if(Constants.a().booleanValue())
	//*  73  177:invokestatic    #368 <Method Boolean Constants.a()>
	//*  74  180:invokevirtual   #225 <Method boolean Boolean.booleanValue()>
	//*  75  183:ifeq            129
			com.startapp.common.a.i.a().a(((Context) (activity)), f1.b());
	//   76  186:invokestatic    #373 <Method com.startapp.common.a.i com.startapp.common.a.i.a()>
	//   77  189:aload_1         
	//   78  190:aload_2         
	//   79  191:invokevirtual   #375 <Method String f.b()>
	//   80  194:invokevirtual   #378 <Method void com.startapp.common.a.i.a(Context, String)>
		if(true) goto _L2; else goto _L6
	//   81  197:goto            129
_L6:
	}

	private void g(boolean flag)
	{
		u = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #380 <Field boolean u>
	//    3    5:return          
	}

	private void i(Context context)
	{
		com.startapp.android.publish.adsCommon.k.b(context, "periodicInfoEventPaused", Boolean.valueOf(false));
	//    0    0:aload_1         
	//    1    1:ldc2            #382 <String "periodicInfoEventPaused">
	//    2    4:iconst_0        
	//    3    5:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #231 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Boolean)>
		com.startapp.android.publish.adsCommon.k.b(context, "periodicMetadataPaused", Boolean.valueOf(false));
	//    5   11:aload_1         
	//    6   12:ldc2            #384 <String "periodicMetadataPaused">
	//    7   15:iconst_0        
	//    8   16:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//    9   19:invokestatic    #231 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Boolean)>
		context = ((Context) (new d(context) {

			public void a()
			{
				if(MetaData.getInstance().isUserAgentEnabled())
			//*   0    0:invokestatic    #31  <Method MetaData MetaData.getInstance()>
			//*   1    3:invokevirtual   #35  <Method boolean MetaData.isUserAgentEnabled()>
			//*   2    6:ifeq            34
				{
					long l1 = TimeUnit.SECONDS.toMillis(MetaData.getInstance().getUserAgentDelayInSeconds());
			//    3    9:getstatic       #41  <Field TimeUnit TimeUnit.SECONDS>
			//    4   12:invokestatic    #31  <Method MetaData MetaData.getInstance()>
			//    5   15:invokevirtual   #45  <Method long MetaData.getUserAgentDelayInSeconds()>
			//    6   18:invokevirtual   #49  <Method long TimeUnit.toMillis(long)>
			//    7   21:lstore_1        
					com.startapp.android.publish.adsCommon.m.a(b, a, l1);
			//    8   22:aload_0         
			//    9   23:getfield        #19  <Field m b>
			//   10   26:aload_0         
			//   11   27:getfield        #21  <Field Context a>
			//   12   30:lload_1         
			//   13   31:invokestatic    #52  <Method void com.startapp.android.publish.adsCommon.m.a(m, Context, long)>
				}
				com.startapp.android.publish.adsCommon.Utils.b.c(a);
			//   14   34:aload_0         
			//   15   35:getfield        #21  <Field Context a>
			//   16   38:invokestatic    #57  <Method void com.startapp.android.publish.adsCommon.Utils.b.c(Context)>
				com.startapp.android.publish.adsCommon.Utils.b.d(a);
			//   17   41:aload_0         
			//   18   42:getfield        #21  <Field Context a>
			//   19   45:invokestatic    #60  <Method void com.startapp.android.publish.adsCommon.Utils.b.d(Context)>
				b.e(a);
			//   20   48:aload_0         
			//   21   49:getfield        #19  <Field m b>
			//   22   52:aload_0         
			//   23   53:getfield        #21  <Field Context a>
			//   24   56:invokevirtual   #63  <Method void com.startapp.android.publish.adsCommon.m.e(Context)>
				if(android.os.Build.VERSION.SDK_INT > 8)
			//*  25   59:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
			//*  26   62:bipush          8
			//*  27   64:icmple          120
					if(MetaData.getInstance().getTrueNetEnabled())
			//*  28   67:invokestatic    #31  <Method MetaData MetaData.getInstance()>
			//*  29   70:invokevirtual   #72  <Method boolean MetaData.getTrueNetEnabled()>
			//*  30   73:ifeq            121
					{
						if(!com.startapp.android.publish.adsCommon.m.a(b))
			//*  31   76:aload_0         
			//*  32   77:getfield        #19  <Field m b>
			//*  33   80:invokestatic    #75  <Method boolean com.startapp.android.publish.adsCommon.m.a(m)>
			//*  34   83:ifne            112
						{
							com.startapp.android.publish.adsCommon.m.a(b, true);
			//   35   86:aload_0         
			//   36   87:getfield        #19  <Field m b>
			//   37   90:iconst_1        
			//   38   91:invokestatic    #78  <Method boolean com.startapp.android.publish.adsCommon.m.a(m, boolean)>
			//   39   94:pop             
							TrueNetSDK.with(a, com.startapp.android.publish.adsCommon.k.a(a, "shared_prefs_appId", ((String) (null))));
			//   40   95:aload_0         
			//   41   96:getfield        #21  <Field Context a>
			//   42   99:aload_0         
			//   43  100:getfield        #21  <Field Context a>
			//   44  103:ldc1            #80  <String "shared_prefs_appId">
			//   45  105:aconst_null     
			//   46  106:invokestatic    #85  <Method String com.startapp.android.publish.adsCommon.k.a(Context, String, String)>
			//   47  109:invokestatic    #91  <Method void TrueNetSDK.with(Context, String)>
						}
						TrueNetSDK.enable(a, true);
			//   48  112:aload_0         
			//   49  113:getfield        #21  <Field Context a>
			//   50  116:iconst_1        
			//   51  117:invokestatic    #95  <Method void TrueNetSDK.enable(Context, boolean)>
					} else
			//*  52  120:return          
					if(com.startapp.android.publish.adsCommon.m.a(b))
			//*  53  121:aload_0         
			//*  54  122:getfield        #19  <Field m b>
			//*  55  125:invokestatic    #75  <Method boolean com.startapp.android.publish.adsCommon.m.a(m)>
			//*  56  128:ifeq            120
					{
						TrueNetSDK.enable(a, false);
			//   57  131:aload_0         
			//   58  132:getfield        #21  <Field Context a>
			//   59  135:iconst_0        
			//   60  136:invokestatic    #95  <Method void TrueNetSDK.enable(Context, boolean)>
						return;
			//   61  139:return          
					}
			}

			public void b()
			{
				com.startapp.common.a.g.a("StartAppSDKInternal", 3, "setPeriodicAlarms: onFailedLoadingMeta");
			//    0    0:ldc1            #97  <String "StartAppSDKInternal">
			//    1    2:iconst_3        
			//    2    3:ldc1            #99  <String "setPeriodicAlarms: onFailedLoadingMeta">
			//    3    5:invokestatic    #104 <Method void g.a(String, int, String)>
				if(MetaData.getInstance().isUserAgentEnabled())
			//*   4    8:invokestatic    #31  <Method MetaData MetaData.getInstance()>
			//*   5   11:invokevirtual   #35  <Method boolean MetaData.isUserAgentEnabled()>
			//*   6   14:ifeq            39
				{
					long l1 = TimeUnit.SECONDS.toMillis(10L);
			//    7   17:getstatic       #41  <Field TimeUnit TimeUnit.SECONDS>
			//    8   20:ldc2w           #105 <Long 10L>
			//    9   23:invokevirtual   #49  <Method long TimeUnit.toMillis(long)>
			//   10   26:lstore_1        
					com.startapp.android.publish.adsCommon.m.a(b, a, l1);
			//   11   27:aload_0         
			//   12   28:getfield        #19  <Field m b>
			//   13   31:aload_0         
			//   14   32:getfield        #21  <Field Context a>
			//   15   35:lload_1         
			//   16   36:invokestatic    #52  <Method void com.startapp.android.publish.adsCommon.m.a(m, Context, long)>
				}
			//   17   39:return          
			}

			final Context a;
			final m b;

			
			{
				b = m.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field m b>
				a = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Context a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
));
	//   10   22:new             #6   <Class m$1>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #385 <Method void m$1(m, Context)>
	//   15   31:astore_1        
		if(MetaData.getInstance().isReady())
	//*  16   32:invokestatic    #289 <Method MetaData MetaData.getInstance()>
	//*  17   35:invokevirtual   #386 <Method boolean MetaData.isReady()>
	//*  18   38:ifeq            48
		{
			((d) (context)).a();
	//   19   41:aload_1         
	//   20   42:invokeinterface #390 <Method void d.a()>
			return;
	//   21   47:return          
		} else
		{
			MetaData.getInstance().addMetaDataListener(((d) (context)));
	//   22   48:invokestatic    #289 <Method MetaData MetaData.getInstance()>
	//   23   51:aload_1         
	//   24   52:invokevirtual   #394 <Method void MetaData.addMetaDataListener(d)>
			return;
	//   25   55:return          
		}
	}

	private void j(Context context)
	{
		MetaData.init(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #397 <Method void MetaData.init(Context)>
		if(!com.startapp.android.publish.adsCommon.Utils.i.a())
	//*   2    4:invokestatic    #294 <Method boolean i.a()>
	//*   3    7:ifne            70
		{
			com.startapp.android.publish.adsCommon.b.a(context);
	//    4   10:aload_1         
	//    5   11:invokestatic    #398 <Method void com.startapp.android.publish.adsCommon.b.a(Context)>
			if(com.startapp.android.publish.adsCommon.Utils.i.a(16L) || com.startapp.android.publish.adsCommon.Utils.i.a(32L))
	//*   6   14:ldc2w           #399 <Long 16L>
	//*   7   17:invokestatic    #65  <Method boolean i.a(long)>
	//*   8   20:ifne            32
	//*   9   23:ldc2w           #401 <Long 32L>
	//*  10   26:invokestatic    #65  <Method boolean i.a(long)>
	//*  11   29:ifeq            36
				com.startapp.android.publish.ads.banner.c.a(context);
	//   12   32:aload_1         
	//   13   33:invokestatic    #405 <Method void com.startapp.android.publish.ads.banner.c.a(Context)>
			if(com.startapp.android.publish.adsCommon.Utils.i.a(8L))
	//*  14   36:ldc2w           #406 <Long 8L>
	//*  15   39:invokestatic    #65  <Method boolean i.a(long)>
	//*  16   42:ifeq            49
				com.startapp.android.publish.ads.splash.f.a(context);
	//   17   45:aload_1         
	//   18   46:invokestatic    #410 <Method void com.startapp.android.publish.ads.splash.f.a(Context)>
			if(b)
	//*  19   49:aload_0         
	//*  20   50:getfield        #67  <Field boolean b>
	//*  21   53:ifeq            60
				com.startapp.android.publish.cache.d.a(context);
	//   22   56:aload_1         
	//   23   57:invokestatic    #413 <Method void com.startapp.android.publish.cache.d.a(Context)>
			if(com.startapp.android.publish.adsCommon.Utils.i.e())
	//*  24   60:invokestatic    #415 <Method boolean i.e()>
	//*  25   63:ifeq            70
				com.startapp.android.publish.adsCommon.adinformation.a.a(context);
	//   26   66:aload_1         
	//   27   67:invokestatic    #418 <Method void com.startapp.android.publish.adsCommon.adinformation.a.a(Context)>
		}
	//   28   70:return          
	}

	private void k(Context context)
	{
		Integer integer = com.startapp.android.publish.adsCommon.k.a(context, "shared_prefs_app_version_id", Integer.valueOf(-1));
	//    0    0:aload_1         
	//    1    1:ldc2            #420 <String "shared_prefs_app_version_id">
	//    2    4:iconst_m1       
	//    3    5:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//    4    8:invokestatic    #428 <Method Integer com.startapp.android.publish.adsCommon.k.a(Context, String, Integer)>
	//    5   11:astore_3        
		int i1 = com.startapp.common.a.c.d(context);
	//    6   12:aload_1         
	//    7   13:invokestatic    #431 <Method int c.d(Context)>
	//    8   16:istore_2        
		if(integer.intValue() > 0 && i1 > integer.intValue())
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #435 <Method int Integer.intValue()>
	//*  11   21:ifle            37
	//*  12   24:iload_2         
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #435 <Method int Integer.intValue()>
	//*  15   29:icmple          37
			q = true;
	//   16   32:aload_0         
	//   17   33:iconst_1        
	//   18   34:putfield        #90  <Field boolean q>
		com.startapp.android.publish.adsCommon.k.b(context, "shared_prefs_app_version_id", Integer.valueOf(i1));
	//   19   37:aload_1         
	//   20   38:ldc2            #420 <String "shared_prefs_app_version_id">
	//   21   41:iload_2         
	//   22   42:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//   23   45:invokestatic    #438 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Integer)>
	//   24   48:return          
	}

	private void l(Context context)
	{
		if(!q && com.startapp.android.publish.cache.d.a().b().isLocalCache()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field boolean q>
	//    2    4:ifne            19
	//    3    7:invokestatic    #441 <Method com.startapp.android.publish.cache.d com.startapp.android.publish.cache.d.a()>
	//    4   10:invokevirtual   #444 <Method ACMConfig com.startapp.android.publish.cache.d.b()>
	//    5   13:invokevirtual   #449 <Method boolean ACMConfig.isLocalCache()>
	//    6   16:ifne            48
_L1:
		com.startapp.common.a.g.a("StartAppSDKInternal", 3, "App version changed or disabled in meta - deleting existing cache");
	//    7   19:ldc1            #180 <String "StartAppSDKInternal">
	//    8   21:iconst_3        
	//    9   22:ldc2            #451 <String "App version changed or disabled in meta - deleting existing cache">
	//   10   25:invokestatic    #203 <Method void g.a(String, int, String)>
		com.startapp.android.publish.cache.a.a().b(context);
	//   11   28:invokestatic    #163 <Method a a.a()>
	//   12   31:aload_1         
	//   13   32:invokevirtual   #452 <Method void a.b(Context)>
_L4:
		o(context);
	//   14   35:aload_0         
	//   15   36:aload_1         
	//   16   37:invokespecial   #274 <Method void o(Context)>
		com.startapp.android.publish.cache.a.a().c(context);
	//   17   40:invokestatic    #163 <Method a a.a()>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #454 <Method void a.c(Context)>
		return;
	//   20   47:return          
_L2:
		if(c)
	//*  21   48:aload_0         
	//*  22   49:getfield        #283 <Field boolean c>
	//*  23   52:ifeq            35
			com.startapp.android.publish.cache.a.a().a(context);
	//   24   55:invokestatic    #163 <Method a a.a()>
	//   25   58:aload_1         
	//   26   59:invokevirtual   #455 <Method void a.a(Context)>
		if(true) goto _L4; else goto _L3
	//   27   62:goto            35
_L3:
	}

	private void m(Context context)
	{
		com.startapp.common.a.g.a("StartAppSDKInternal", 3, "Sending Download Event");
	//    0    0:ldc1            #180 <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:ldc2            #457 <String "Sending Download Event">
	//    3    6:invokestatic    #203 <Method void g.a(String, int, String)>
		com.startapp.common.g.a(com.startapp.common.g.a.a, new Runnable(context) {

			public void run()
			{
				try
				{
					j j1 = new j();
			//    0    0:new             #30  <Class j>
			//    1    3:dup             
			//    2    4:invokespecial   #31  <Method void j()>
			//    3    7:astore_1        
					AdPreferences adpreferences = new AdPreferences();
			//    4    8:new             #33  <Class AdPreferences>
			//    5   11:dup             
			//    6   12:invokespecial   #34  <Method void AdPreferences()>
			//    7   15:astore_2        
					com.startapp.android.publish.adsCommon.Utils.i.a(a, adpreferences);
			//    8   16:aload_0         
			//    9   17:getfield        #21  <Field Context a>
			//   10   20:aload_2         
			//   11   21:invokestatic    #39  <Method void i.a(Context, AdPreferences)>
					j1.fillApplicationDetails(a, adpreferences);
			//   12   24:aload_1         
			//   13   25:aload_0         
			//   14   26:getfield        #21  <Field Context a>
			//   15   29:aload_2         
			//   16   30:invokevirtual   #42  <Method void j.fillApplicationDetails(Context, AdPreferences)>
					com.startapp.android.publish.adsCommon.i.a.a(a, com.startapp.android.publish.adsCommon.AdsConstants.a(AdsConstants.ApiType.DOWNLOAD), ((BaseRequest) (j1)), ((Map) (null)));
			//   17   33:aload_0         
			//   18   34:getfield        #21  <Field Context a>
			//   19   37:getstatic       #48  <Field AdsConstants$ApiType AdsConstants$ApiType.DOWNLOAD>
			//   20   40:invokestatic    #53  <Method String com.startapp.android.publish.adsCommon.AdsConstants.a(AdsConstants$ApiType)>
			//   21   43:aload_1         
			//   22   44:aconst_null     
			//   23   45:invokestatic    #58  <Method com.startapp.common.a.h$a com.startapp.android.publish.adsCommon.i.a.a(Context, String, BaseRequest, Map)>
			//   24   48:pop             
					return;
			//   25   49:return          
				}
				catch(Exception exception)
			//*  26   50:astore_1        
				{
					com.startapp.common.a.g.a(6, "Error occured while sending download event", ((Throwable) (exception)));
			//   27   51:bipush          6
			//   28   53:ldc1            #60  <String "Error occured while sending download event">
			//   29   55:aload_1         
			//   30   56:invokestatic    #65  <Method void g.a(int, String, Throwable)>
					com.startapp.android.publish.adsCommon.e.f.a(a, com.startapp.android.publish.adsCommon.e.d.b, "StartAppSDKInternal.sendDownloadEvent", exception.getMessage(), "");
			//   31   59:aload_0         
			//   32   60:getfield        #21  <Field Context a>
			//   33   63:getstatic       #70  <Field com.startapp.android.publish.adsCommon.e.d com.startapp.android.publish.adsCommon.e.d.b>
			//   34   66:ldc1            #72  <String "StartAppSDKInternal.sendDownloadEvent">
			//   35   68:aload_1         
			//   36   69:invokevirtual   #76  <Method String Exception.getMessage()>
			//   37   72:ldc1            #78  <String "">
			//   38   74:invokestatic    #83  <Method void com.startapp.android.publish.adsCommon.e.f.a(Context, com.startapp.android.publish.adsCommon.e.d, String, String, String)>
					return;
			//   39   77:return          
				}
			}

			final Context a;
			final m b;

			
			{
				b = m.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field m b>
				a = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Context a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    4    9:getstatic       #462 <Field com.startapp.common.g$a com.startapp.common.g$a.a>
	//    5   12:new             #8   <Class m$2>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokespecial   #463 <Method void m$2(m, Context)>
	//   10   21:invokestatic    #468 <Method void com.startapp.common.g.a(com.startapp.common.g$a, Runnable)>
	//   11   24:return          
	}

	private void n(Context context)
	{
		com.startapp.android.publish.adsCommon.k.a(context, "sharedPrefsWrappers", r);
	//    0    0:aload_1         
	//    1    1:ldc2            #470 <String "sharedPrefsWrappers">
	//    2    4:aload_0         
	//    3    5:getfield        #472 <Field Map r>
	//    4    8:invokestatic    #475 <Method void com.startapp.android.publish.adsCommon.k.a(Context, String, Map)>
	//    5   11:return          
	}

	private void o(Context context)
	{
		a(context, new AdPreferences());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #477 <Class AdPreferences>
	//    3    5:dup             
	//    4    6:invokespecial   #478 <Method void AdPreferences()>
	//    5    9:invokespecial   #480 <Method void a(Context, AdPreferences)>
	//    6   12:return          
	}

	private static void p(Context context)
	{
		TreeMap treemap = new TreeMap();
	//    0    0:new             #482 <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #483 <Method void TreeMap()>
	//    3    7:astore_1        
		if(u())
	//*   4    8:invokestatic    #485 <Method boolean u()>
	//*   5   11:ifeq            27
			((Map) (treemap)).put("Cordova", ((Object) (com.startapp.android.publish.adsCommon.Utils.i.b())));
	//    6   14:aload_1         
	//    7   15:ldc2            #487 <String "Cordova">
	//    8   18:invokestatic    #488 <Method String i.b()>
	//    9   21:invokeinterface #494 <Method Object Map.put(Object, Object)>
	//   10   26:pop             
		if(s())
	//*  11   27:invokestatic    #496 <Method boolean s()>
	//*  12   30:ifeq            49
			((Map) (treemap)).put("AdMob", ((Object) (d("com.startapp.android.mediation.admob"))));
	//   13   33:aload_1         
	//   14   34:ldc2            #498 <String "AdMob">
	//   15   37:ldc2            #500 <String "com.startapp.android.mediation.admob">
	//   16   40:invokestatic    #502 <Method String d(String)>
	//   17   43:invokeinterface #494 <Method Object Map.put(Object, Object)>
	//   18   48:pop             
		if(t())
	//*  19   49:invokestatic    #504 <Method boolean t()>
	//*  20   52:ifeq            71
			((Map) (treemap)).put("MoPub", ((Object) (d("com.mopub.mobileads"))));
	//   21   55:aload_1         
	//   22   56:ldc2            #506 <String "MoPub">
	//   23   59:ldc2            #508 <String "com.mopub.mobileads">
	//   24   62:invokestatic    #502 <Method String d(String)>
	//   25   65:invokeinterface #494 <Method Object Map.put(Object, Object)>
	//   26   70:pop             
		if(v() && !a().o().containsKey("B4A"))
	//*  27   71:invokestatic    #510 <Method boolean v()>
	//*  28   74:ifeq            107
	//*  29   77:invokestatic    #511 <Method m a()>
	//*  30   80:invokevirtual   #514 <Method Map o()>
	//*  31   83:ldc2            #516 <String "B4A">
	//*  32   86:invokeinterface #520 <Method boolean Map.containsKey(Object)>
	//*  33   91:ifne            107
			((Map) (treemap)).put("MoPub", "0");
	//   34   94:aload_1         
	//   35   95:ldc2            #506 <String "MoPub">
	//   36   98:ldc2            #270 <String "0">
	//   37  101:invokeinterface #494 <Method Object Map.put(Object, Object)>
	//   38  106:pop             
		if(!((Map) (treemap)).isEmpty())
	//*  39  107:aload_1         
	//*  40  108:invokeinterface #523 <Method boolean Map.isEmpty()>
	//*  41  113:ifne            124
			com.startapp.android.publish.adsCommon.k.a(context, "sharedPrefsWrappers", ((Map) (treemap)));
	//   42  116:aload_0         
	//   43  117:ldc2            #470 <String "sharedPrefsWrappers">
	//   44  120:aload_1         
	//   45  121:invokestatic    #475 <Method void com.startapp.android.publish.adsCommon.k.a(Context, String, Map)>
	//   46  124:return          
	}

	public static boolean p()
	{
		return a().a("Unity") != null;
	//    0    0:invokestatic    #511 <Method m a()>
	//    1    3:ldc2            #525 <String "Unity">
	//    2    6:invokevirtual   #527 <Method String a(String)>
	//    3    9:ifnull          14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	private boolean q()
	{
		return System.currentTimeMillis() - g > com.startapp.android.publish.adsCommon.b.a().x();
	//    0    0:invokestatic    #237 <Method long System.currentTimeMillis()>
	//    1    3:aload_0         
	//    2    4:getfield        #529 <Field long g>
	//    3    7:lsub            
	//    4    8:invokestatic    #156 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//    5   11:invokevirtual   #531 <Method long b.x()>
	//    6   14:lcmp            
	//    7   15:ifle            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private boolean r()
	{
		return System.currentTimeMillis() - g > MetaData.getInstance().getSessionMaxBackgroundTime();
	//    0    0:invokestatic    #237 <Method long System.currentTimeMillis()>
	//    1    3:aload_0         
	//    2    4:getfield        #529 <Field long g>
	//    3    7:lsub            
	//    4    8:invokestatic    #289 <Method MetaData MetaData.getInstance()>
	//    5   11:invokevirtual   #534 <Method long MetaData.getSessionMaxBackgroundTime()>
	//    6   14:lcmp            
	//    7   15:ifle            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private static boolean s()
	{
		return c("com.startapp.android.mediation.admob.StartAppCustomEvent");
	//    0    0:ldc2            #536 <String "com.startapp.android.mediation.admob.StartAppCustomEvent">
	//    1    3:invokestatic    #538 <Method boolean c(String)>
	//    2    6:ireturn         
	}

	private static boolean t()
	{
		return c("com.mopub.mobileads.StartAppCustomEventInterstitial");
	//    0    0:ldc2            #540 <String "com.mopub.mobileads.StartAppCustomEventInterstitial">
	//    1    3:invokestatic    #538 <Method boolean c(String)>
	//    2    6:ireturn         
	}

	private static boolean u()
	{
		return c("org.apache.cordova.CordovaPlugin");
	//    0    0:ldc2            #542 <String "org.apache.cordova.CordovaPlugin">
	//    1    3:invokestatic    #538 <Method boolean c(String)>
	//    2    6:ireturn         
	}

	private static boolean v()
	{
		return c("anywheresoftware.b4a.BA");
	//    0    0:ldc2            #544 <String "anywheresoftware.b4a.BA">
	//    1    3:invokestatic    #538 <Method boolean c(String)>
	//    2    6:ireturn         
	}

	public String a(String s1)
	{
		if(r == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #472 <Field Map r>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (String)r.get(((Object) (s1)));
	//    5    9:aload_0         
	//    6   10:getfield        #472 <Field Map r>
	//    7   13:aload_1         
	//    8   14:invokeinterface #545 <Method Object Map.get(Object)>
	//    9   19:checkcast       #268 <Class String>
	//   10   22:areturn         
	}

	public void a(Activity activity)
	{
		com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityStarted [").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//    0    0:ldc1            #180 <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:new             #182 <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #183 <Method void StringBuilder()>
	//    5   10:ldc2            #547 <String "onActivityStarted [">
	//    6   13:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #551 <Method Class Object.getClass()>
	//    9   20:invokevirtual   #554 <Method String Class.getName()>
	//   10   23:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #194 <String "]">
	//   12   28:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #198 <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #203 <Method void g.a(String, int, String)>
		if(com.startapp.android.publish.adsCommon.Utils.i.a(8L) && !com.startapp.android.publish.adsCommon.b.a().z() && !w && !b("MoPub") && !b("AdMob") && !x && ((Object) (activity)).getClass().getName().equals(((Object) (m))) && !i() && i.size() == 0)
	//*  15   37:ldc2w           #406 <Long 8L>
	//*  16   40:invokestatic    #65  <Method boolean i.a(long)>
	//*  17   43:ifeq            147
	//*  18   46:invokestatic    #156 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//*  19   49:invokevirtual   #556 <Method boolean b.z()>
	//*  20   52:ifne            147
	//*  21   55:aload_0         
	//*  22   56:getfield        #98  <Field boolean w>
	//*  23   59:ifne            147
	//*  24   62:aload_0         
	//*  25   63:ldc2            #506 <String "MoPub">
	//*  26   66:invokevirtual   #558 <Method boolean b(String)>
	//*  27   69:ifne            147
	//*  28   72:aload_0         
	//*  29   73:ldc2            #498 <String "AdMob">
	//*  30   76:invokevirtual   #558 <Method boolean b(String)>
	//*  31   79:ifne            147
	//*  32   82:aload_0         
	//*  33   83:getfield        #100 <Field boolean x>
	//*  34   86:ifne            147
	//*  35   89:aload_1         
	//*  36   90:invokevirtual   #551 <Method Class Object.getClass()>
	//*  37   93:invokevirtual   #554 <Method String Class.getName()>
	//*  38   96:aload_0         
	//*  39   97:getfield        #560 <Field String m>
	//*  40  100:invokevirtual   #563 <Method boolean String.equals(Object)>
	//*  41  103:ifeq            147
	//*  42  106:aload_0         
	//*  43  107:invokevirtual   #565 <Method boolean i()>
	//*  44  110:ifne            147
	//*  45  113:aload_0         
	//*  46  114:getfield        #80  <Field HashMap i>
	//*  47  117:invokevirtual   #568 <Method int HashMap.size()>
	//*  48  120:ifne            147
			StartAppAd.showSplash(activity, s, new SplashConfig(), new AdPreferences(), ((com.startapp.android.publish.ads.splash.SplashHideListener) (null)), false);
	//   49  123:aload_1         
	//   50  124:aload_0         
	//   51  125:getfield        #92  <Field Bundle s>
	//   52  128:new             #570 <Class SplashConfig>
	//   53  131:dup             
	//   54  132:invokespecial   #571 <Method void SplashConfig()>
	//   55  135:new             #477 <Class AdPreferences>
	//   56  138:dup             
	//   57  139:invokespecial   #478 <Method void AdPreferences()>
	//   58  142:aconst_null     
	//   59  143:iconst_0        
	//   60  144:invokestatic    #577 <Method void StartAppAd.showSplash(Activity, Bundle, SplashConfig, AdPreferences, com.startapp.android.publish.ads.splash.SplashHideListener, boolean)>
		x = true;
	//   61  147:aload_0         
	//   62  148:iconst_1        
	//   63  149:putfield        #100 <Field boolean x>
		if(d)
	//*  64  152:aload_0         
	//*  65  153:getfield        #69  <Field boolean d>
	//*  66  156:ifeq            164
			g(activity);
	//   67  159:aload_0         
	//   68  160:aload_1         
	//   69  161:invokespecial   #579 <Method void g(Activity)>
		f = false;
	//   70  164:aload_0         
	//   71  165:iconst_0        
	//   72  166:putfield        #73  <Field boolean f>
		d = false;
	//   73  169:aload_0         
	//   74  170:iconst_0        
	//   75  171:putfield        #69  <Field boolean d>
		if((Integer)i.get(((Object) (Integer.valueOf(((Object) (activity)).hashCode())))) == null)
	//*  76  174:aload_0         
	//*  77  175:getfield        #80  <Field HashMap i>
	//*  78  178:aload_1         
	//*  79  179:invokevirtual   #582 <Method int Object.hashCode()>
	//*  80  182:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//*  81  185:invokevirtual   #583 <Method Object HashMap.get(Object)>
	//*  82  188:checkcast       #422 <Class Integer>
	//*  83  191:ifnonnull       265
		{
			int i1 = (new Integer(0)).intValue();
	//   84  194:new             #422 <Class Integer>
	//   85  197:dup             
	//   86  198:iconst_0        
	//   87  199:invokespecial   #586 <Method void Integer(int)>
	//   88  202:invokevirtual   #435 <Method int Integer.intValue()>
	//   89  205:istore_2        
			i.put(((Object) (Integer.valueOf(((Object) (activity)).hashCode()))), ((Object) (Integer.valueOf(i1 + 1))));
	//   90  206:aload_0         
	//   91  207:getfield        #80  <Field HashMap i>
	//   92  210:aload_1         
	//   93  211:invokevirtual   #582 <Method int Object.hashCode()>
	//   94  214:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//   95  217:iload_2         
	//   96  218:iconst_1        
	//   97  219:iadd            
	//   98  220:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//   99  223:invokevirtual   #587 <Method Object HashMap.put(Object, Object)>
	//  100  226:pop             
			com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("Activity Added:[").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//  101  227:ldc1            #180 <String "StartAppSDKInternal">
	//  102  229:iconst_3        
	//  103  230:new             #182 <Class StringBuilder>
	//  104  233:dup             
	//  105  234:invokespecial   #183 <Method void StringBuilder()>
	//  106  237:ldc2            #589 <String "Activity Added:[">
	//  107  240:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  108  243:aload_1         
	//  109  244:invokevirtual   #551 <Method Class Object.getClass()>
	//  110  247:invokevirtual   #554 <Method String Class.getName()>
	//  111  250:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  112  253:ldc1            #194 <String "]">
	//  113  255:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  114  258:invokevirtual   #198 <Method String StringBuilder.toString()>
	//  115  261:invokestatic    #203 <Method void g.a(String, int, String)>
			return;
	//  116  264:return          
		} else
		{
			com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("Activity [").append(((Object) (activity)).getClass().getName()).append("] already exists").toString());
	//  117  265:ldc1            #180 <String "StartAppSDKInternal">
	//  118  267:iconst_3        
	//  119  268:new             #182 <Class StringBuilder>
	//  120  271:dup             
	//  121  272:invokespecial   #183 <Method void StringBuilder()>
	//  122  275:ldc2            #591 <String "Activity [">
	//  123  278:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  124  281:aload_1         
	//  125  282:invokevirtual   #551 <Method Class Object.getClass()>
	//  126  285:invokevirtual   #554 <Method String Class.getName()>
	//  127  288:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  128  291:ldc2            #593 <String "] already exists">
	//  129  294:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  130  297:invokevirtual   #198 <Method String StringBuilder.toString()>
	//  131  300:invokestatic    #203 <Method void g.a(String, int, String)>
			return;
	//  132  303:return          
		}
	}

	public void a(Activity activity, Bundle bundle)
	{
		if(bundle == null && m != null && ((Object) (activity)).getClass().getName().equals(((Object) (m))))
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       33
	//*   2    4:aload_0         
	//*   3    5:getfield        #560 <Field String m>
	//*   4    8:ifnull          33
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #551 <Method Class Object.getClass()>
	//*   7   15:invokevirtual   #554 <Method String Class.getName()>
	//*   8   18:aload_0         
	//*   9   19:getfield        #560 <Field String m>
	//*  10   22:invokevirtual   #563 <Method boolean String.equals(Object)>
	//*  11   25:ifeq            33
			l = false;
	//   12   28:aload_0         
	//   13   29:iconst_0        
	//   14   30:putfield        #82  <Field boolean l>
		s = bundle;
	//   15   33:aload_0         
	//   16   34:aload_2         
	//   17   35:putfield        #92  <Field Bundle s>
	//   18   38:return          
	}

	void a(Context context)
	{
		com.startapp.android.publish.adsCommon.k.b(context, "periodicInfoEventPaused", Boolean.valueOf(true));
	//    0    0:aload_1         
	//    1    1:ldc2            #382 <String "periodicInfoEventPaused">
	//    2    4:iconst_1        
	//    3    5:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #231 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Boolean)>
		com.startapp.android.publish.adsCommon.Utils.b.a(0x2ee20534);
	//    5   11:ldc2            #595 <Int 0x2ee20534>
	//    6   14:invokestatic    #599 <Method void com.startapp.android.publish.adsCommon.Utils.b.a(int)>
	//    7   17:return          
	}

	protected void a(Context context, com.startapp.android.publish.common.metaData.MetaDataRequest.a a1)
	{
		com.startapp.android.publish.adsCommon.Utils.g.d().a(context, a1);
	//    0    0:invokestatic    #604 <Method com.startapp.android.publish.adsCommon.Utils.g com.startapp.android.publish.adsCommon.Utils.g.d()>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #605 <Method void com.startapp.android.publish.adsCommon.Utils.g.a(Context, com.startapp.android.publish.common.metaData.MetaDataRequest$a)>
	//    4    8:return          
	}

	protected void a(Context context, String s1, long l1, boolean flag, boolean flag1)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #610 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            134
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #182 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #183 <Method void StringBuilder()>
	//    6   14:astore          8
			String s2;
			if(flag)
	//*   7   16:iload           5
	//*   8   18:ifeq            111
				s2 = "1";
	//    9   21:ldc2            #612 <String "1">
	//   10   24:astore          7
			else
	//*  11   26:aload           8
	//*  12   28:aload           7
	//*  13   30:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  14   33:astore          8
	//*  15   35:iload           6
	//*  16   37:ifeq            119
	//*  17   40:ldc2            #614 <String "M">
	//*  18   43:astore          7
	//*  19   45:aload           8
	//*  20   47:aload           7
	//*  21   49:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  22   52:invokevirtual   #198 <Method String StringBuilder.toString()>
	//*  23   55:astore          7
	//*  24   57:aload_1         
	//*  25   58:getstatic       #619 <Field com.startapp.android.publish.adsCommon.e.d com.startapp.android.publish.adsCommon.e.d.j>
	//*  26   61:aload_2         
	//*  27   62:aload           7
	//*  28   64:ldc2            #621 <String "">
	//*  29   67:invokestatic    #626 <Method void com.startapp.android.publish.adsCommon.e.f.a(Context, com.startapp.android.publish.adsCommon.e.d, String, String, String)>
	//*  30   70:aload_2         
	//*  31   71:invokevirtual   #629 <Method String String.toLowerCase()>
	//*  32   74:ldc2            #631 <String "pas">
	//*  33   77:invokevirtual   #563 <Method boolean String.equals(Object)>
	//*  34   80:ifeq            110
	//*  35   83:iload           5
	//*  36   85:ifeq            127
	//*  37   88:ldc2            #612 <String "1">
	//*  38   91:astore_2        
	//*  39   92:aload_1         
	//*  40   93:ldc2            #633 <String "USER_CONSENT_PERSONALIZED_ADS_SERVING">
	//*  41   96:aload_2         
	//*  42   97:invokestatic    #635 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, String)>
	//*  43  100:invokestatic    #604 <Method com.startapp.android.publish.adsCommon.Utils.g com.startapp.android.publish.adsCommon.Utils.g.d()>
	//*  44  103:aload_1         
	//*  45  104:getstatic       #637 <Field com.startapp.android.publish.common.metaData.MetaDataRequest$a com.startapp.android.publish.common.metaData.MetaDataRequest$a.f>
	//*  46  107:invokevirtual   #605 <Method void com.startapp.android.publish.adsCommon.Utils.g.a(Context, com.startapp.android.publish.common.metaData.MetaDataRequest$a)>
	//*  47  110:return          
				s2 = "0";
	//   48  111:ldc2            #270 <String "0">
	//   49  114:astore          7
			stringbuilder = stringbuilder.append(s2);
			if(flag1)
				s2 = "M";
			else
	//*  50  116:goto            26
				s2 = "A";
	//   51  119:ldc2            #639 <String "A">
	//   52  122:astore          7
			s2 = stringbuilder.append(s2).toString();
			com.startapp.android.publish.adsCommon.e.f.a(context, com.startapp.android.publish.adsCommon.e.d.j, s1, s2, "");
			if(s1.toLowerCase().equals("pas"))
			{
				if(flag)
					s1 = "1";
				else
	//*  53  124:goto            45
					s1 = "0";
	//   54  127:ldc2            #270 <String "0">
	//   55  130:astore_2        
				com.startapp.android.publish.adsCommon.k.b(context, "USER_CONSENT_PERSONALIZED_ADS_SERVING", s1);
				com.startapp.android.publish.adsCommon.Utils.g.d().a(context, com.startapp.android.publish.common.metaData.MetaDataRequest.a.f);
			}
			return;
		} else
	//*  56  131:goto            92
		{
			com.startapp.common.a.g.a("StartAppSDKInternal", 6, "setUserConsent: empty consentType");
	//   57  134:ldc1            #180 <String "StartAppSDKInternal">
	//   58  136:bipush          6
	//   59  138:ldc2            #641 <String "setUserConsent: empty consentType">
	//   60  141:invokestatic    #203 <Method void g.a(String, int, String)>
			return;
	//   61  144:return          
		}
	}

	public void a(Context context, String s1, String s2)
	{
		if(r == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #472 <Field Map r>
	//*   2    4:ifnonnull       18
			r = ((Map) (new TreeMap()));
	//    3    7:aload_0         
	//    4    8:new             #482 <Class TreeMap>
	//    5   11:dup             
	//    6   12:invokespecial   #483 <Method void TreeMap()>
	//    7   15:putfield        #472 <Field Map r>
		r.put(((Object) (s1)), ((Object) (s2)));
	//    8   18:aload_0         
	//    9   19:getfield        #472 <Field Map r>
	//   10   22:aload_2         
	//   11   23:aload_3         
	//   12   24:invokeinterface #494 <Method Object Map.put(Object, Object)>
	//   13   29:pop             
		n(context);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #643 <Method void n(Context)>
	//   17   35:return          
	}

	protected void a(Context context, String s1, String s2, SDKAdPreferences sdkadpreferences, boolean flag)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		if(com.startapp.android.publish.adsCommon.Utils.i.a(2L) && !com.startapp.android.publish.adsCommon.Utils.i.a(context, com/startapp/android/publish/adsCommon/activities/FullScreenActivity))
	//*   2    3:ldc2w           #177 <Long 2L>
	//*   3    6:invokestatic    #65  <Method boolean i.a(long)>
	//*   4    9:ifeq            31
	//*   5   12:aload_1         
	//*   6   13:ldc2            #646 <Class FullScreenActivity>
	//*   7   16:invokestatic    #649 <Method boolean i.a(Context, Class)>
	//*   8   19:ifne            31
			Log.w("StartAppSDKInternal", "FullScreenActivity is missing from AndroidManifest.xml");
	//    9   22:ldc1            #180 <String "StartAppSDKInternal">
	//   10   24:ldc2            #651 <String "FullScreenActivity is missing from AndroidManifest.xml">
	//   11   27:invokestatic    #656 <Method int Log.w(String, String)>
	//   12   30:pop             
		if(com.startapp.android.publish.adsCommon.Utils.i.f(context))
	//*  13   31:aload_1         
	//*  14   32:invokestatic    #659 <Method boolean i.f(Context)>
	//*  15   35:ifne            297
	//*  16   38:aload_0         
	//*  17   39:iload           6
	//*  18   41:invokevirtual   #661 <Method void b(boolean)>
	//*  19   44:aload_1         
	//*  20   45:invokestatic    #663 <Method void p(Context)>
	//*  21   48:aload_1         
	//*  22   49:invokestatic    #666 <Method void com.startapp.android.publish.adsCommon.l.a(Context)>
	//*  23   52:aload_0         
	//*  24   53:getfield        #82  <Field boolean l>
	//*  25   56:ifne            286
	//*  26   59:aload_1         
	//*  27   60:invokestatic    #667 <Method void com.startapp.common.c.c(Context)>
	//*  28   63:aload_1         
	//*  29   64:invokestatic    #668 <Method void com.startapp.android.publish.adsCommon.Utils.b.a(Context)>
	//*  30   67:aload_0         
	//*  31   68:aload_1         
	//*  32   69:invokespecial   #670 <Method void j(Context)>
	//*  33   72:aload_0         
	//*  34   73:iconst_1        
	//*  35   74:putfield        #82  <Field boolean l>
	//*  36   77:aload_1         
	//*  37   78:instanceof      #672 <Class Activity>
	//*  38   81:ifeq            95
	//*  39   84:aload_0         
	//*  40   85:aload_1         
	//*  41   86:invokevirtual   #551 <Method Class Object.getClass()>
	//*  42   89:invokevirtual   #554 <Method String Class.getName()>
	//*  43   92:putfield        #560 <Field String m>
	//*  44   95:ldc1            #180 <String "StartAppSDKInternal">
	//*  45   97:iconst_3        
	//*  46   98:new             #182 <Class StringBuilder>
	//*  47  101:dup             
	//*  48  102:invokespecial   #183 <Method void StringBuilder()>
	//*  49  105:ldc2            #674 <String "Initialize StartAppSDK with DevID:[">
	//*  50  108:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  51  111:aload_2         
	//*  52  112:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  53  115:ldc2            #676 <String "], AppID:[">
	//*  54  118:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  55  121:aload_3         
	//*  56  122:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  57  125:ldc1            #194 <String "]">
	//*  58  127:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  59  130:invokevirtual   #198 <Method String StringBuilder.toString()>
	//*  60  133:invokestatic    #203 <Method void g.a(String, int, String)>
	//*  61  136:aload_1         
	//*  62  137:aload_2         
	//*  63  138:aload_3         
	//*  64  139:invokestatic    #678 <Method void i.a(Context, String, String)>
	//*  65  142:aload_0         
	//*  66  143:aload           4
	//*  67  145:putfield        #680 <Field SDKAdPreferences a>
	//*  68  148:aload_1         
	//*  69  149:ldc2            #682 <String "shared_prefs_sdk_ad_prefs">
	//*  70  152:aload           4
	//*  71  154:invokestatic    #687 <Method void com.startapp.common.a.e.b(Context, String, java.io.Serializable)>
	//*  72  157:aload_1         
	//*  73  158:invokestatic    #690 <Method void com.startapp.common.d.a.b(Context)>
	//*  74  161:aload_1         
	//*  75  162:ldc2            #692 <String "shared_prefs_first_init">
	//*  76  165:iconst_1        
	//*  77  166:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//*  78  169:invokestatic    #222 <Method Boolean com.startapp.android.publish.adsCommon.k.a(Context, String, Boolean)>
	//*  79  172:invokevirtual   #225 <Method boolean Boolean.booleanValue()>
	//*  80  175:istore          6
	//*  81  177:ldc1            #180 <String "StartAppSDKInternal">
	//*  82  179:iconst_3        
	//*  83  180:new             #182 <Class StringBuilder>
	//*  84  183:dup             
	//*  85  184:invokespecial   #183 <Method void StringBuilder()>
	//*  86  187:ldc2            #694 <String "First Initialization: [">
	//*  87  190:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  88  193:iload           6
	//*  89  195:invokevirtual   #192 <Method StringBuilder StringBuilder.append(boolean)>
	//*  90  198:ldc1            #194 <String "]">
	//*  91  200:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  92  203:invokevirtual   #198 <Method String StringBuilder.toString()>
	//*  93  206:invokestatic    #203 <Method void g.a(String, int, String)>
	//*  94  209:iload           6
	//*  95  211:ifeq            254
	//*  96  214:aload_0         
	//*  97  215:aload_1         
	//*  98  216:invokespecial   #696 <Method void m(Context)>
	//*  99  219:aload_1         
	//* 100  220:ldc2            #698 <String "totalSessions">
	//* 101  223:iconst_0        
	//* 102  224:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//* 103  227:invokestatic    #438 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Integer)>
	//* 104  230:aload_1         
	//* 105  231:ldc2            #700 <String "firstSessionTime">
	//* 106  234:invokestatic    #237 <Method long System.currentTimeMillis()>
	//* 107  237:invokestatic    #705 <Method Long Long.valueOf(long)>
	//* 108  240:invokestatic    #708 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Long)>
	//* 109  243:aload_1         
	//* 110  244:ldc2            #692 <String "shared_prefs_first_init">
	//* 111  247:iconst_0        
	//* 112  248:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//* 113  251:invokestatic    #231 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Boolean)>
	//* 114  254:aload_0         
	//* 115  255:aload_1         
	//* 116  256:getstatic       #710 <Field com.startapp.android.publish.common.metaData.MetaDataRequest$a com.startapp.android.publish.common.metaData.MetaDataRequest$a.a>
	//* 117  259:invokevirtual   #351 <Method void a(Context, com.startapp.android.publish.common.metaData.MetaDataRequest$a)>
	//* 118  262:aload_0         
	//* 119  263:aload_1         
	//* 120  264:invokespecial   #712 <Method void k(Context)>
	//* 121  267:aload_0         
	//* 122  268:aload_1         
	//* 123  269:iload           5
	//* 124  271:invokespecial   #714 <Method void a(Context, boolean)>
	//* 125  274:aload_0         
	//* 126  275:getfield        #67  <Field boolean b>
	//* 127  278:ifeq            286
	//* 128  281:aload_0         
	//* 129  282:aload_1         
	//* 130  283:invokespecial   #716 <Method void l(Context)>
	//* 131  286:aload_0         
	//* 132  287:aload_1         
	//* 133  288:invokespecial   #718 <Method void i(Context)>
	//* 134  291:aload_0         
	//* 135  292:aload_1         
	//* 136  293:invokevirtual   #720 <Method void f(Context)>
	//* 137  296:return          
			flag1 = false;
	//  138  297:iconst_0        
	//  139  298:istore          6
		b(flag1);
		p(context);
		com.startapp.android.publish.adsCommon.l.a(context);
		if(l)
			break MISSING_BLOCK_LABEL_286;
		com.startapp.common.c.c(context);
		com.startapp.android.publish.adsCommon.Utils.b.a(context);
		j(context);
		l = true;
		if(context instanceof Activity)
			m = ((Object) (context)).getClass().getName();
		com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("Initialize StartAppSDK with DevID:[").append(s1).append("], AppID:[").append(s2).append("]").toString());
		com.startapp.android.publish.adsCommon.Utils.i.a(context, s1, s2);
		a = sdkadpreferences;
		com.startapp.common.a.e.b(context, "shared_prefs_sdk_ad_prefs", ((java.io.Serializable) (sdkadpreferences)));
		com.startapp.common.d.a.b(context);
		flag1 = com.startapp.android.publish.adsCommon.k.a(context, "shared_prefs_first_init", Boolean.valueOf(true)).booleanValue();
		com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("First Initialization: [").append(flag1).append("]").toString());
		if(!flag1)
			break MISSING_BLOCK_LABEL_254;
		m(context);
		com.startapp.android.publish.adsCommon.k.b(context, "totalSessions", Integer.valueOf(0));
		com.startapp.android.publish.adsCommon.k.b(context, "firstSessionTime", Long.valueOf(System.currentTimeMillis()));
		com.startapp.android.publish.adsCommon.k.b(context, "shared_prefs_first_init", Boolean.valueOf(false));
		a(context, com.startapp.android.publish.common.metaData.MetaDataRequest.a.a);
		k(context);
		a(context, flag);
		if(b)
			l(context);
		i(context);
		f(context);
		return;
	//* 140  300:goto            38
		s1;
	//  141  303:astore_2        
		com.startapp.android.publish.adsCommon.e.f.a(context, com.startapp.android.publish.adsCommon.e.d.b, "StartAppSDKInternal.intialize - unexpected error occurd", ((Exception) (s1)).getMessage(), "");
	//  142  304:aload_1         
	//  143  305:getstatic       #722 <Field com.startapp.android.publish.adsCommon.e.d com.startapp.android.publish.adsCommon.e.d.b>
	//  144  308:ldc2            #724 <String "StartAppSDKInternal.intialize - unexpected error occurd">
	//  145  311:aload_2         
	//  146  312:invokevirtual   #727 <Method String Exception.getMessage()>
	//  147  315:ldc2            #621 <String "">
	//  148  318:invokestatic    #626 <Method void com.startapp.android.publish.adsCommon.e.f.a(Context, com.startapp.android.publish.adsCommon.e.d, String, String, String)>
		return;
	//  149  321:return          
	}

	public void a(boolean flag)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field boolean p>
	//    3    5:return          
	}

	public boolean a(com.startapp.android.publish.common.model.AdPreferences.Placement placement)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(!c || f)
	//*   2    2:aload_0         
	//*   3    3:getfield        #283 <Field boolean c>
	//*   4    6:ifeq            16
	//*   5    9:aload_0         
	//*   6   10:getfield        #73  <Field boolean f>
	//*   7   13:ifeq            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(d)
	//*  10   18:aload_0         
	//*  11   19:getfield        #69  <Field boolean d>
	//*  12   22:ifeq            51
		{
			if(placement != com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_RETURN || !com.startapp.android.publish.cache.d.a().b().shouldReturnAdLoadInBg())
	//*  13   25:aload_1         
	//*  14   26:getstatic       #316 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_RETURN>
	//*  15   29:if_acmpne       46
	//*  16   32:invokestatic    #441 <Method com.startapp.android.publish.cache.d com.startapp.android.publish.cache.d.a()>
	//*  17   35:invokevirtual   #444 <Method ACMConfig com.startapp.android.publish.cache.d.b()>
	//*  18   38:invokevirtual   #731 <Method boolean ACMConfig.shouldReturnAdLoadInBg()>
	//*  19   41:ifeq            46
	//*  20   44:iload_2         
	//*  21   45:ireturn         
				flag = false;
	//   22   46:iconst_0        
	//   23   47:istore_2        
			return flag;
		} else
	//*  24   48:goto            44
		{
			return true;
	//   25   51:iconst_1        
	//   26   52:ireturn         
		}
	}

	public void b()
	{
		n = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #84  <Field boolean n>
		e = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #71  <Field boolean e>
	//    6   10:return          
	}

	public void b(Activity activity)
	{
		if(b && e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean b>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #71  <Field boolean e>
	//*   5   11:ifeq            25
		{
			e = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #71  <Field boolean e>
			com.startapp.android.publish.cache.a.a().b();
	//    9   19:invokestatic    #163 <Method a a.a()>
	//   10   22:invokevirtual   #733 <Method void a.b()>
		}
		if(n)
	//*  11   25:aload_0         
	//*  12   26:getfield        #84  <Field boolean n>
	//*  13   29:ifeq            44
		{
			n = false;
	//   14   32:aload_0         
	//   15   33:iconst_0        
	//   16   34:putfield        #84  <Field boolean n>
			com.startapp.android.publish.adsCommon.l.c(activity.getApplicationContext());
	//   17   37:aload_1         
	//   18   38:invokevirtual   #737 <Method Context Activity.getApplicationContext()>
	//   19   41:invokestatic    #738 <Method void com.startapp.android.publish.adsCommon.l.c(Context)>
		}
		k = activity;
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:putfield        #740 <Field Activity k>
	//   23   49:return          
	}

	public void b(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	void b(Context context)
	{
		com.startapp.android.publish.adsCommon.k.b(context, "periodicMetadataPaused", Boolean.valueOf(true));
	//    0    0:aload_1         
	//    1    1:ldc2            #384 <String "periodicMetadataPaused">
	//    2    4:iconst_1        
	//    3    5:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #231 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Boolean)>
		com.startapp.android.publish.adsCommon.Utils.b.a(0x22f50468);
	//    5   11:ldc2            #741 <Int 0x22f50468>
	//    6   14:invokestatic    #599 <Method void com.startapp.android.publish.adsCommon.Utils.b.a(int)>
	//    7   17:return          
	}

	public void b(boolean flag)
	{
		o = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean o>
	//    3    5:return          
	}

	public boolean b(String s1)
	{
		return a(s1) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #527 <Method String a(String)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void c(Activity activity)
	{
		g = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #237 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #529 <Field long g>
		k = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #740 <Field Activity k>
	//    6   12:return          
	}

	void c(Context context)
	{
		com.startapp.android.publish.adsCommon.k.b(context, "periodicInfoEventPaused", Boolean.valueOf(false));
	//    0    0:aload_1         
	//    1    1:ldc2            #382 <String "periodicInfoEventPaused">
	//    2    4:iconst_0        
	//    3    5:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #231 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Boolean)>
		com.startapp.android.publish.adsCommon.Utils.b.a(context, com.startapp.android.publish.adsCommon.k.a(context, "periodicInfoEventTriggerTime", Long.valueOf(com.startapp.android.publish.adsCommon.Utils.b.b(context))).longValue());
	//    5   11:aload_1         
	//    6   12:aload_1         
	//    7   13:ldc2            #743 <String "periodicInfoEventTriggerTime">
	//    8   16:aload_1         
	//    9   17:invokestatic    #746 <Method long com.startapp.android.publish.adsCommon.Utils.b.b(Context)>
	//   10   20:invokestatic    #705 <Method Long Long.valueOf(long)>
	//   11   23:invokestatic    #749 <Method Long com.startapp.android.publish.adsCommon.k.a(Context, String, Long)>
	//   12   26:invokevirtual   #752 <Method long Long.longValue()>
	//   13   29:invokestatic    #753 <Method void com.startapp.android.publish.adsCommon.Utils.b.a(Context, long)>
	//   14   32:return          
	}

	public void c(boolean flag)
	{
		v = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #96  <Field boolean v>
	//    3    5:return          
	}

	public boolean c()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field boolean p>
	//    2    4:ireturn         
	}

	public void d(Activity activity)
	{
		com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("onActivityStopped [").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//    0    0:ldc1            #180 <String "StartAppSDKInternal">
	//    1    2:iconst_3        
	//    2    3:new             #182 <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #183 <Method void StringBuilder()>
	//    5   10:ldc2            #755 <String "onActivityStopped [">
	//    6   13:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #551 <Method Class Object.getClass()>
	//    9   20:invokevirtual   #554 <Method String Class.getName()>
	//   10   23:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #194 <String "]">
	//   12   28:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #198 <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #203 <Method void g.a(String, int, String)>
		Integer integer = (Integer)i.get(((Object) (Integer.valueOf(((Object) (activity)).hashCode()))));
	//   15   37:aload_0         
	//   16   38:getfield        #80  <Field HashMap i>
	//   17   41:aload_1         
	//   18   42:invokevirtual   #582 <Method int Object.hashCode()>
	//   19   45:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//   20   48:invokevirtual   #583 <Method Object HashMap.get(Object)>
	//   21   51:checkcast       #422 <Class Integer>
	//   22   54:astore_2        
		if(integer != null)
	//*  23   55:aload_2         
	//*  24   56:ifnull          196
		{
			integer = Integer.valueOf(integer.intValue() - 1);
	//   25   59:aload_2         
	//   26   60:invokevirtual   #435 <Method int Integer.intValue()>
	//   27   63:iconst_1        
	//   28   64:isub            
	//   29   65:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//   30   68:astore_2        
			if(integer.intValue() == 0)
	//*  31   69:aload_2         
	//*  32   70:invokevirtual   #435 <Method int Integer.intValue()>
	//*  33   73:ifne            177
				i.remove(((Object) (Integer.valueOf(((Object) (activity)).hashCode()))));
	//   34   76:aload_0         
	//   35   77:getfield        #80  <Field HashMap i>
	//   36   80:aload_1         
	//   37   81:invokevirtual   #582 <Method int Object.hashCode()>
	//   38   84:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//   39   87:invokevirtual   #758 <Method Object HashMap.remove(Object)>
	//   40   90:pop             
			else
	//*  41   91:ldc1            #180 <String "StartAppSDKInternal">
	//*  42   93:iconst_3        
	//*  43   94:new             #182 <Class StringBuilder>
	//*  44   97:dup             
	//*  45   98:invokespecial   #183 <Method void StringBuilder()>
	//*  46  101:ldc2            #760 <String "Activity removed:[">
	//*  47  104:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  48  107:aload_1         
	//*  49  108:invokevirtual   #551 <Method Class Object.getClass()>
	//*  50  111:invokevirtual   #554 <Method String Class.getName()>
	//*  51  114:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  52  117:ldc1            #194 <String "]">
	//*  53  119:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//*  54  122:invokevirtual   #198 <Method String StringBuilder.toString()>
	//*  55  125:invokestatic    #203 <Method void g.a(String, int, String)>
	//*  56  128:aload_0         
	//*  57  129:getfield        #80  <Field HashMap i>
	//*  58  132:invokevirtual   #568 <Method int HashMap.size()>
	//*  59  135:ifne            176
	//*  60  138:aload_0         
	//*  61  139:getfield        #73  <Field boolean f>
	//*  62  142:ifne            150
	//*  63  145:aload_0         
	//*  64  146:aload_1         
	//*  65  147:invokespecial   #762 <Method void f(Activity)>
	//*  66  150:aload_0         
	//*  67  151:getfield        #67  <Field boolean b>
	//*  68  154:ifeq            176
	//*  69  157:invokestatic    #163 <Method a a.a()>
	//*  70  160:aload_1         
	//*  71  161:invokevirtual   #737 <Method Context Activity.getApplicationContext()>
	//*  72  164:aload_0         
	//*  73  165:getfield        #73  <Field boolean f>
	//*  74  168:invokevirtual   #763 <Method void a.a(Context, boolean)>
	//*  75  171:aload_0         
	//*  76  172:iconst_1        
	//*  77  173:putfield        #71  <Field boolean e>
	//*  78  176:return          
				i.put(((Object) (Integer.valueOf(((Object) (activity)).hashCode()))), ((Object) (integer)));
	//   79  177:aload_0         
	//   80  178:getfield        #80  <Field HashMap i>
	//   81  181:aload_1         
	//   82  182:invokevirtual   #582 <Method int Object.hashCode()>
	//   83  185:invokestatic    #425 <Method Integer Integer.valueOf(int)>
	//   84  188:aload_2         
	//   85  189:invokevirtual   #587 <Method Object HashMap.put(Object, Object)>
	//   86  192:pop             
			com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("Activity removed:[").append(((Object) (activity)).getClass().getName()).append("]").toString());
			if(i.size() == 0)
			{
				if(!f)
					f(activity);
				if(b)
				{
					com.startapp.android.publish.cache.a.a().a(activity.getApplicationContext(), f);
					e = true;
				}
			}
			return;
		} else
	//*  87  193:goto            91
		{
			com.startapp.common.a.g.a("StartAppSDKInternal", 3, (new StringBuilder()).append("Activity hadn't been found:[").append(((Object) (activity)).getClass().getName()).append("]").toString());
	//   88  196:ldc1            #180 <String "StartAppSDKInternal">
	//   89  198:iconst_3        
	//   90  199:new             #182 <Class StringBuilder>
	//   91  202:dup             
	//   92  203:invokespecial   #183 <Method void StringBuilder()>
	//   93  206:ldc2            #765 <String "Activity hadn't been found:[">
	//   94  209:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   95  212:aload_1         
	//   96  213:invokevirtual   #551 <Method Class Object.getClass()>
	//   97  216:invokevirtual   #554 <Method String Class.getName()>
	//   98  219:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   99  222:ldc1            #194 <String "]">
	//  100  224:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  101  227:invokevirtual   #198 <Method String StringBuilder.toString()>
	//  102  230:invokestatic    #203 <Method void g.a(String, int, String)>
			return;
	//  103  233:return          
		}
	}

	void d(Context context)
	{
		com.startapp.android.publish.adsCommon.k.b(context, "periodicMetadataPaused", Boolean.valueOf(false));
	//    0    0:aload_1         
	//    1    1:ldc2            #384 <String "periodicMetadataPaused">
	//    2    4:iconst_0        
	//    3    5:invokestatic    #217 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #231 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Boolean)>
		com.startapp.android.publish.adsCommon.Utils.b.a(context, Long.valueOf(com.startapp.android.publish.adsCommon.k.a(context, "periodicMetadataTriggerTime", Long.valueOf(com.startapp.android.publish.adsCommon.Utils.b.a())).longValue()));
	//    5   11:aload_1         
	//    6   12:aload_1         
	//    7   13:ldc2            #767 <String "periodicMetadataTriggerTime">
	//    8   16:invokestatic    #769 <Method long com.startapp.android.publish.adsCommon.Utils.b.a()>
	//    9   19:invokestatic    #705 <Method Long Long.valueOf(long)>
	//   10   22:invokestatic    #749 <Method Long com.startapp.android.publish.adsCommon.k.a(Context, String, Long)>
	//   11   25:invokevirtual   #752 <Method long Long.longValue()>
	//   12   28:invokestatic    #705 <Method Long Long.valueOf(long)>
	//   13   31:invokestatic    #772 <Method void com.startapp.android.publish.adsCommon.Utils.b.a(Context, Long)>
	//   14   34:return          
	}

	public void d(boolean flag)
	{
		boolean flag1;
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            25
			flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:putfield        #98  <Field boolean w>
	//*   7   11:iload_1         
	//*   8   12:ifne            24
	//*   9   15:invokestatic    #163 <Method a a.a()>
	//*  10   18:getstatic       #775 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_SPLASH>
	//*  11   21:invokevirtual   #778 <Method void a.a(com.startapp.android.publish.common.model.AdPreferences$Placement)>
	//*  12   24:return          
			flag1 = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
		w = flag1;
		if(!flag)
			com.startapp.android.publish.cache.a.a().a(com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_SPLASH);
	//*  15   27:goto            6
	}

	public boolean d()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean o>
	//    2    4:ireturn         
	}

	public void e(Activity activity)
	{
		if(((Object) (activity)).getClass().getName().equals(((Object) (m))))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #551 <Method Class Object.getClass()>
	//*   2    4:invokevirtual   #554 <Method String Class.getName()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #560 <Field String m>
	//*   5   11:invokevirtual   #563 <Method boolean String.equals(Object)>
	//*   6   14:ifeq            22
			x = false;
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:putfield        #100 <Field boolean x>
		if(i.size() == 0)
	//*  10   22:aload_0         
	//*  11   23:getfield        #80  <Field HashMap i>
	//*  12   26:invokevirtual   #568 <Method int HashMap.size()>
	//*  13   29:ifne            37
			d = false;
	//   14   32:aload_0         
	//   15   33:iconst_0        
	//   16   34:putfield        #69  <Field boolean d>
	//   17   37:return          
	}

	void e(Context context)
	{
		com.startapp.android.publish.adsCommon.e.c c1 = new com.startapp.android.publish.adsCommon.e.c(context, false);
	//    0    0:new             #780 <Class com.startapp.android.publish.adsCommon.e.c>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #782 <Method void com.startapp.android.publish.adsCommon.e.c(Context, boolean)>
	//    5    9:astore_2        
		c1.c().c(AdsConstants.j);
	//    6   10:aload_2         
	//    7   11:invokevirtual   #785 <Method com.startapp.android.publish.adsCommon.e.b com.startapp.android.publish.adsCommon.e.c.c()>
	//    8   14:getstatic       #789 <Field String AdsConstants.j>
	//    9   17:invokevirtual   #794 <Method void com.startapp.android.publish.adsCommon.e.b.c(String)>
		c1.a();
	//   10   20:aload_2         
	//   11   21:invokevirtual   #795 <Method void com.startapp.android.publish.adsCommon.e.c.a()>
		if(e())
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #796 <Method boolean e()>
	//*  14   28:ifeq            47
			com.startapp.android.publish.adsCommon.e.f.a(context, com.startapp.android.publish.adsCommon.e.d.d, "packagingType", AdsConstants.j, "");
	//   15   31:aload_1         
	//   16   32:getstatic       #798 <Field com.startapp.android.publish.adsCommon.e.d com.startapp.android.publish.adsCommon.e.d.d>
	//   17   35:ldc2            #800 <String "packagingType">
	//   18   38:getstatic       #789 <Field String AdsConstants.j>
	//   19   41:ldc2            #621 <String "">
	//   20   44:invokestatic    #626 <Method void com.startapp.android.publish.adsCommon.e.f.a(Context, com.startapp.android.publish.adsCommon.e.d, String, String, String)>
	//   21   47:return          
	}

	protected void e(boolean flag)
	{
		if(flag && com.startapp.common.a.c.b())
	//*   0    0:iload_1         
	//*   1    1:ifeq            31
	//*   2    4:invokestatic    #176 <Method boolean c.b()>
	//*   3    7:ifeq            31
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore_1        
		else
	//*   6   12:aload_0         
	//*   7   13:iload_1         
	//*   8   14:invokespecial   #170 <Method void g(boolean)>
	//*   9   17:iload_1         
	//*  10   18:ifne            30
	//*  11   21:invokestatic    #163 <Method a a.a()>
	//*  12   24:getstatic       #316 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_RETURN>
	//*  13   27:invokevirtual   #778 <Method void a.a(com.startapp.android.publish.common.model.AdPreferences$Placement)>
	//*  14   30:return          
			flag = false;
	//   15   31:iconst_0        
	//   16   32:istore_1        
		g(flag);
		if(!flag)
			com.startapp.android.publish.cache.a.a().a(com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_RETURN);
	//*  17   33:goto            12
	}

	public boolean e()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field boolean q>
	//    2    4:ireturn         
	}

	public void f(Context context)
	{
		if(com.startapp.common.a.c.b())
	//*   0    0:invokestatic    #176 <Method boolean c.b()>
	//*   1    3:ifeq            122
		{
			if(context instanceof Activity)
	//*   2    6:aload_1         
	//*   3    7:instanceof      #672 <Class Activity>
	//*   4   10:ifeq            87
			{
				k = (Activity)context;
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:checkcast       #672 <Class Activity>
	//    8   18:putfield        #740 <Field Activity k>
				h = k.getApplication();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #740 <Field Activity k>
	//   12   26:invokevirtual   #804 <Method Application Activity.getApplication()>
	//   13   29:putfield        #75  <Field Application h>
			} else
	//*  14   32:aload_0         
	//*  15   33:getfield        #806 <Field Object j>
	//*  16   36:ifnull          66
	//*  17   39:aload_0         
	//*  18   40:getfield        #75  <Field Application h>
	//*  19   43:ifnull          66
	//*  20   46:aload_0         
	//*  21   47:getfield        #75  <Field Application h>
	//*  22   50:aload_0         
	//*  23   51:getfield        #806 <Field Object j>
	//*  24   54:invokestatic    #808 <Method void a(Application, Object)>
	//*  25   57:ldc1            #180 <String "StartAppSDKInternal">
	//*  26   59:iconst_3        
	//*  27   60:ldc2            #810 <String "Unregistered LifeCycle Callbacks">
	//*  28   63:invokestatic    #203 <Method void g.a(String, int, String)>
	//*  29   66:ldc1            #180 <String "StartAppSDKInternal">
	//*  30   68:iconst_3        
	//*  31   69:ldc2            #812 <String "Registring LifeCycle Callbacks">
	//*  32   72:invokestatic    #203 <Method void g.a(String, int, String)>
	//*  33   75:aload_0         
	//*  34   76:aload_0         
	//*  35   77:getfield        #75  <Field Application h>
	//*  36   80:invokestatic    #814 <Method Object a(Application)>
	//*  37   83:putfield        #806 <Field Object j>
	//*  38   86:return          
			if(context.getApplicationContext() instanceof Application)
	//*  39   87:aload_1         
	//*  40   88:invokevirtual   #817 <Method Context Context.getApplicationContext()>
	//*  41   91:instanceof      #117 <Class Application>
	//*  42   94:ifeq            111
			{
				h = (Application)context.getApplicationContext();
	//   43   97:aload_0         
	//   44   98:aload_1         
	//   45   99:invokevirtual   #817 <Method Context Context.getApplicationContext()>
	//   46  102:checkcast       #117 <Class Application>
	//   47  105:putfield        #75  <Field Application h>
			} else
	//*  48  108:goto            32
			{
				com.startapp.common.a.g.a("StartAppSDKInternal", 6, "Cannot register activity life cycle callbacks - context is not an Activity");
	//   49  111:ldc1            #180 <String "StartAppSDKInternal">
	//   50  113:bipush          6
	//   51  115:ldc2            #819 <String "Cannot register activity life cycle callbacks - context is not an Activity">
	//   52  118:invokestatic    #203 <Method void g.a(String, int, String)>
				return;
	//   53  121:return          
			}
			try
			{
				if(j != null && h != null)
				{
					a(h, j);
					com.startapp.common.a.g.a("StartAppSDKInternal", 3, "Unregistered LifeCycle Callbacks");
				}
			}
	//*  54  122:ldc1            #180 <String "StartAppSDKInternal">
	//*  55  124:bipush          6
	//*  56  126:ldc2            #821 <String "Cannot register activity life cycle callbacks - api lower than 14">
	//*  57  129:invokestatic    #203 <Method void g.a(String, int, String)>
	//*  58  132:return          
			// Misplaced declaration of an exception variable
			catch(Context context) { }
	//   59  133:astore_1        
			com.startapp.common.a.g.a("StartAppSDKInternal", 3, "Registring LifeCycle Callbacks");
			j = a(h);
			return;
		} else
		{
			com.startapp.common.a.g.a("StartAppSDKInternal", 6, "Cannot register activity life cycle callbacks - api lower than 14");
			return;
		}
	//*  60  134:goto            66
	}

	public boolean f()
	{
		if(k != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #740 <Field Activity k>
	//*   2    4:ifnull          15
			return k.isTaskRoot();
	//    3    7:aload_0         
	//    4    8:getfield        #740 <Field Activity k>
	//    5   11:invokevirtual   #824 <Method boolean Activity.isTaskRoot()>
	//    6   14:ireturn         
		else
			return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
	}

	public SDKAdPreferences g(Context context)
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #680 <Field SDKAdPreferences a>
	//*   2    4:ifnonnull       36
		{
			context = ((Context) ((SDKAdPreferences)com.startapp.common.a.e.a(context, "shared_prefs_sdk_ad_prefs", com/startapp/android/publish/adsCommon/SDKAdPreferences)));
	//    3    7:aload_1         
	//    4    8:ldc2            #682 <String "shared_prefs_sdk_ad_prefs">
	//    5   11:ldc2            #827 <Class SDKAdPreferences>
	//    6   14:invokestatic    #830 <Method Object com.startapp.common.a.e.a(Context, String, Class)>
	//    7   17:checkcast       #827 <Class SDKAdPreferences>
	//    8   20:astore_1        
			if(context == null)
	//*   9   21:aload_1         
	//*  10   22:ifnonnull       41
				a = new SDKAdPreferences();
	//   11   25:aload_0         
	//   12   26:new             #827 <Class SDKAdPreferences>
	//   13   29:dup             
	//   14   30:invokespecial   #831 <Method void SDKAdPreferences()>
	//   15   33:putfield        #680 <Field SDKAdPreferences a>
			else
	//*  16   36:aload_0         
	//*  17   37:getfield        #680 <Field SDKAdPreferences a>
	//*  18   40:areturn         
				a = ((SDKAdPreferences) (context));
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:putfield        #680 <Field SDKAdPreferences a>
		}
		return a;
	//*  22   46:goto            36
	}

	public String g()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #560 <Field String m>
	//    2    4:areturn         
	}

	public void h(Context context)
	{
		b(context, "android.permission.ACCESS_FINE_LOCATION", "USER_CONSENT_FINE_LOCATION");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #833 <String "android.permission.ACCESS_FINE_LOCATION">
	//    3    5:ldc2            #835 <String "USER_CONSENT_FINE_LOCATION">
	//    4    8:invokespecial   #836 <Method void b(Context, String, String)>
		b(context, "android.permission.ACCESS_COARSE_LOCATION", "USER_CONSENT_COARSE_LOCATION");
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:ldc2            #838 <String "android.permission.ACCESS_COARSE_LOCATION">
	//    8   16:ldc2            #840 <String "USER_CONSENT_COARSE_LOCATION">
	//    9   19:invokespecial   #836 <Method void b(Context, String, String)>
	//   10   22:return          
	}

	public boolean h()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #380 <Field boolean u>
	//    2    4:ireturn         
	}

	public boolean i()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field boolean v>
	//    2    4:ireturn         
	}

	public void j()
	{
		d(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #843 <Method void d(boolean)>
	//    3    5:return          
	}

	public boolean k()
	{
		return !w;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean w>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean l()
	{
		return c && !d && !f;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field boolean c>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field boolean d>
	//    5   11:ifne            23
	//    6   14:aload_0         
	//    7   15:getfield        #73  <Field boolean f>
	//    8   18:ifne            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public void m()
	{
		d = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #69  <Field boolean d>
		f = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #73  <Field boolean f>
	//    6   10:return          
	}

	public boolean n()
	{
		return c && d;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field boolean c>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field boolean d>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public Map o()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #472 <Field Map r>
	//    2    4:areturn         
	}

	private SDKAdPreferences a;
	private boolean b;
	private boolean c;
	private boolean d;
	private boolean e;
	private boolean f;
	private long g;
	private Application h;
	private HashMap i;
	private Object j;
	private Activity k;
	private boolean l;
	private String m;
	private boolean n;
	private boolean o;
	private boolean p;
	private boolean q;
	private Map r;
	private Bundle s;
	private com.startapp.android.publish.cache.c t;
	private boolean u;
	private boolean v;
	private boolean w;
	private boolean x;
	private com.startapp.android.publish.adsCommon.g y;
	private boolean z;
}
