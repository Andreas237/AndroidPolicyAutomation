// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			CountryPickerActivity, IRobotApplication_

public final class CountryPickerActivity_ extends CountryPickerActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #33  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #33  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #25  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #36  <Field Bundle a>
		//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #45  <Field Context b>
		//*  24   52:instanceof      #47  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #45  <Field Context b>
		//   28   62:checkcast       #47  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #25  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #36  <Field Bundle a>
		//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #45  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #25  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #36  <Field Bundle a>
		//   42   92:invokevirtual   #58  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #60  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #45  <Field Context b>
		//   47  103:invokespecial   #62  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/CountryPickerActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class CountryPickerActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public CountryPickerActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void CountryPickerActivity()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c h>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #16  <Class CountryPickerActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void CountryPickerActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		c = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #43  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #47  <Field IRobotApplication c>
		d();
	//    5   11:aload_0         
	//    6   12:invokespecial   #50  <Method void d()>
	//    7   15:return          
	}

	static void a(CountryPickerActivity_ countrypickeractivity_)
	{
		((CountryPickerActivity) (countrypickeractivity_)).com.irobot.home.CountryPickerActivity.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void com.irobot.home.CountryPickerActivity.c()>
	//    2    4:return          
	}

	static void a(CountryPickerActivity_ countrypickeractivity_, String s)
	{
		((CountryPickerActivity) (countrypickeractivity_)).com.irobot.home.CountryPickerActivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void com.irobot.home.CountryPickerActivity.a(String)>
	//    3    5:return          
	}

	static void b(CountryPickerActivity_ countrypickeractivity_)
	{
		((CountryPickerActivity) (countrypickeractivity_)).com.irobot.home.CountryPickerActivity.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void com.irobot.home.CountryPickerActivity.b()>
	//    2    4:return          
	}

	private void d()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method Intent getIntent()>
	//    2    4:invokevirtual   #70  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("forceCountrySelection"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #72  <String "forceCountrySelection">
	//*   8   15:invokevirtual   #78  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			g = bundle.getBoolean("forceCountrySelection");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #72  <String "forceCountrySelection">
	//   13   25:invokevirtual   #81  <Method boolean Bundle.getBoolean(String)>
	//   14   28:putfield        #85  <Field boolean g>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #89  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	protected void a(String s)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", s) {

			public void a()
			{
				try
				{
					com.irobot.home.CountryPickerActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CountryPickerActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.CountryPickerActivity_.a(CountryPickerActivity_, String)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #34  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #38  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #44  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final String a;
			final CountryPickerActivity_ b;

			
			{
				b = CountryPickerActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CountryPickerActivity_ b>
				a = s2;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #18  <Field String a>
				super(s, l, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #21  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #12  <Class CountryPickerActivity_$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #93  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #93  <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #96  <Method void CountryPickerActivity_$2(CountryPickerActivity_, String, long, String, String)>
	//    8   14:invokestatic    #101 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		d = (EditText)a1.a(0x7f0903b0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #103 <Int 0x7f0903b0>
	//    3    4:invokeinterface #105 <Method View a.a(int)>
	//    4    9:checkcast       #107 <Class EditText>
	//    5   12:putfield        #110 <Field EditText d>
		e = (ListView)a1.a(0x102000a);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #111 <Int 0x102000a>
	//    9   19:invokeinterface #105 <Method View a.a(int)>
	//   10   24:checkcast       #113 <Class ListView>
	//   11   27:putfield        #117 <Field ListView e>
		a();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #119 <Method void a()>
	//   14   34:return          
	}

	public void b()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.CountryPickerActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field CountryPickerActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.CountryPickerActivity_.b(CountryPickerActivity_)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #30  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #34  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #40  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final CountryPickerActivity_ a;

			
			{
				a = CountryPickerActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CountryPickerActivity_ a>
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
	//    0    0:new             #14  <Class CountryPickerActivity_$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #93  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #93  <String "">
	//    6   10:invokespecial   #122 <Method void CountryPickerActivity_$3(CountryPickerActivity_, String, long, String)>
	//    7   13:invokestatic    #101 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void c()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.CountryPickerActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CountryPickerActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.CountryPickerActivity_.a(CountryPickerActivity_)>
			//    3    7:return          
			}

			final CountryPickerActivity_ a;

			
			{
				a = CountryPickerActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CountryPickerActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #93  <String "">
	//    1    2:new             #10  <Class CountryPickerActivity_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #124 <Method void CountryPickerActivity_$1(CountryPickerActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(h);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c h>
	//    2    4:invokestatic    #133 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #135 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #137 <Method void CountryPickerActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #133 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0037);
	//   13   23:aload_0         
	//   14   24:ldc1            #138 <Int 0x7f0b0037>
	//   15   26:invokevirtual   #142 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #143 <Method void CountryPickerActivity.setContentView(int)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #145 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void CountryPickerActivity.setContentView(View)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #145 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #151 <Method void CountryPickerActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c h>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #145 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #155 <Method void CountryPickerActivity.setIntent(Intent)>
		d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #50  <Method void d()>
	//    5    9:return          
	}

	private final c h = new c();
}
