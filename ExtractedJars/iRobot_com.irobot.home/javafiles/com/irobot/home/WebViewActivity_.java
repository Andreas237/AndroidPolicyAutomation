// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import com.irobot.home.view.WebViewLanguageCompat;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			WebViewActivity

public final class WebViewActivity_ extends WebViewActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(Integer integer)
		{
			return (a)super.a("headerTitleStringResourceId", ((java.io.Serializable) (integer)));
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "headerTitleStringResourceId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #33  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class WebViewActivity_$a>
		//    5   10:areturn         
		}

		public a a(String s)
		{
			return (a)super.a("url", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #36  <String "url">
		//    2    3:aload_1         
		//    3    4:invokespecial   #39  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class WebViewActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("isOfflineWebView", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #42  <String "isOfflineWebView">
		//    2    3:iload_1         
		//    3    4:invokespecial   #45  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class WebViewActivity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field android.support.v4.app.Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
		//    3    7:aload_0         
		//    4    8:getfield        #48  <Field android.support.v4.app.Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #52  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #58  <Method void android.support.v4.app.Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #25  <Field Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, j, a);
		//   13   29:aload_0         
		//   14   30:getfield        #25  <Field Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #52  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #61  <Field Bundle a>
		//   20   42:invokevirtual   #64  <Method void Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #68  <Field Context b>
		//*  24   52:instanceof      #70  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
		//   26   58:aload_0         
		//   27   59:getfield        #68  <Field Context b>
		//   28   62:checkcast       #70  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #52  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #61  <Field Bundle a>
		//   34   74:invokestatic    #75  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #68  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #52  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #61  <Field Bundle a>
		//   42   92:invokevirtual   #81  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #83  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #68  <Field Context b>
		//   47  103:invokespecial   #85  <Method void e(Context)>
		//   48  106:areturn         
		}

		private Fragment d;
		private android.support.v4.app.Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/WebViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class WebViewActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}

		public a(Context context)
		{
			super(context, com/irobot/home/WebViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class WebViewActivity_>
		//    3    4:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public WebViewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void WebViewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c e>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #16  <Class WebViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void WebViewActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #16  <Class WebViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #37  <Method void WebViewActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method void c.a(b)>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #44  <Method void i()>
	//    4    8:return          
	}

	static void a(WebViewActivity_ webviewactivity_)
	{
		((WebViewActivity) (webviewactivity_)).WebViewActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void WebViewActivity.g()>
	//    2    4:return          
	}

	static void b(WebViewActivity_ webviewactivity_)
	{
		((WebViewActivity) (webviewactivity_)).WebViewActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void WebViewActivity.h()>
	//    2    4:return          
	}

	static void c(WebViewActivity_ webviewactivity_)
	{
		((WebViewActivity) (webviewactivity_)).WebViewActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void WebViewActivity.f()>
	//    2    4:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method Intent getIntent()>
	//    2    4:invokevirtual   #66  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          72
		{
			if(bundle.containsKey("url"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #68  <String "url">
	//*   8   15:invokevirtual   #74  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				b = bundle.getString("url");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #68  <String "url">
	//   13   25:invokevirtual   #78  <Method String Bundle.getString(String)>
	//   14   28:putfield        #81  <Field String b>
			if(bundle.containsKey("isOfflineWebView"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #83  <String "isOfflineWebView">
	//*  17   34:invokevirtual   #74  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				c = bundle.getBoolean("isOfflineWebView");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #83  <String "isOfflineWebView">
	//   22   44:invokevirtual   #86  <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #89  <Field boolean c>
			if(bundle.containsKey("headerTitleStringResourceId"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #91  <String "headerTitleStringResourceId">
	//*  26   53:invokevirtual   #74  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            72
				d = (Integer)bundle.getSerializable("headerTitleStringResourceId");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #91  <String "headerTitleStringResourceId">
	//   31   63:invokevirtual   #95  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   32   66:checkcast       #97  <Class Integer>
	//   33   69:putfield        #101 <Field Integer d>
		}
	//   34   72:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #105 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (WebViewLanguageCompat)a1.a(0x7f090492);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #109 <Int 0x7f090492>
	//    3    4:invokeinterface #111 <Method View a.a(int)>
	//    4    9:checkcast       #113 <Class WebViewLanguageCompat>
	//    5   12:putfield        #116 <Field WebViewLanguageCompat a>
		e();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #118 <Method void e()>
	//    8   19:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.WebViewActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field WebViewActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.WebViewActivity_.c(WebViewActivity_)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #31  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #35  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #41  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final WebViewActivity_ a;

			
			{
				a = WebViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WebViewActivity_ a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #14  <Class WebViewActivity_$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #120 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #120 <String "">
	//    6   10:invokespecial   #123 <Method void WebViewActivity_$3(WebViewActivity_, String, long, String)>
	//    7   13:invokestatic    #128 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.WebViewActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WebViewActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.WebViewActivity_.a(WebViewActivity_)>
			//    3    7:return          
			}

			final WebViewActivity_ a;

			
			{
				a = WebViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #120 <String "">
	//    1    2:new             #10  <Class WebViewActivity_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #130 <Method void WebViewActivity_$1(WebViewActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #135 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void h()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.WebViewActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WebViewActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.WebViewActivity_.b(WebViewActivity_)>
			//    3    7:return          
			}

			final WebViewActivity_ a;

			
			{
				a = WebViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #120 <String "">
	//    1    2:new             #12  <Class WebViewActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #136 <Method void WebViewActivity_$2(WebViewActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #135 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(e);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c e>
	//    2    4:invokestatic    #140 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #142 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #144 <Method void WebViewActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #140 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b007c);
	//   13   23:aload_0         
	//   14   24:ldc1            #145 <Int 0x7f0b007c>
	//   15   26:invokevirtual   #149 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #150 <Method void WebViewActivity.setContentView(int)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #152 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #155 <Method void WebViewActivity.setContentView(View)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #152 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #158 <Method void WebViewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c e>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #152 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #162 <Method void WebViewActivity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #44  <Method void i()>
	//    5    9:return          
	}

	private final c e = new c();
}
