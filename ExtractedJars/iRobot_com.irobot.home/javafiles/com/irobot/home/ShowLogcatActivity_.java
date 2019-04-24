// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;
import java.util.ArrayList;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			ShowLogcatActivity

public final class ShowLogcatActivity_ extends ShowLogcatActivity
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
		//    6   12:getfield        #25  <Field android.content.Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
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
		//   16   34:getfield        #25  <Field android.content.Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #36  <Field Bundle a>
		//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, Bundle)>
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
		//   30   66:getfield        #25  <Field android.content.Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #36  <Field Bundle a>
		//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #45  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #25  <Field android.content.Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #36  <Field Bundle a>
		//   42   92:invokevirtual   #58  <Method void Context.startActivity(android.content.Intent, Bundle)>
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
			super(context, com/irobot/home/ShowLogcatActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class ShowLogcatActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public ShowLogcatActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void ShowLogcatActivity()>
	//    2    4:aload_0         
	//    3    5:new             #35  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void c()>
	//    6   12:putfield        #38  <Field c f>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #26  <Class ShowLogcatActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method void ShowLogcatActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #47  <Method void c.a(b)>
	//    2    4:return          
	}

	static void a(ShowLogcatActivity_ showlogcatactivity_)
	{
		((ShowLogcatActivity) (showlogcatactivity_)).ShowLogcatActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void ShowLogcatActivity.h()>
	//    2    4:return          
	}

	static void a(ShowLogcatActivity_ showlogcatactivity_, ArrayList arraylist)
	{
		((ShowLogcatActivity) (showlogcatactivity_)).ShowLogcatActivity.showLogcat(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void ShowLogcatActivity.showLogcat(ArrayList)>
	//    3    5:return          
	}

	static void b(ShowLogcatActivity_ showlogcatactivity_)
	{
		((ShowLogcatActivity) (showlogcatactivity_)).ShowLogcatActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void ShowLogcatActivity.j()>
	//    2    4:return          
	}

	static void c(ShowLogcatActivity_ showlogcatactivity_)
	{
		((ShowLogcatActivity) (showlogcatactivity_)).ShowLogcatActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void ShowLogcatActivity.f()>
	//    2    4:return          
	}

	static void d(ShowLogcatActivity_ showlogcatactivity_)
	{
		((ShowLogcatActivity) (showlogcatactivity_)).ShowLogcatActivity.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void ShowLogcatActivity.m()>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #71  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (ListView)a1.a(0x7f090228);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #75  <Int 0x7f090228>
	//    3    4:invokeinterface #77  <Method View a.a(int)>
	//    4    9:checkcast       #79  <Class ListView>
	//    5   12:putfield        #82  <Field ListView c>
		d = (Spinner)a1.a(0x7f090227);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #83  <Int 0x7f090227>
	//    9   19:invokeinterface #77  <Method View a.a(int)>
	//   10   24:checkcast       #85  <Class Spinner>
	//   11   27:putfield        #88  <Field Spinner d>
		View view = a1.a(0x7f090158);
	//   12   30:aload_1         
	//   13   31:ldc1            #89  <Int 0x7f090158>
	//   14   33:invokeinterface #77  <Method View a.a(int)>
	//   15   38:astore_2        
		View view1 = a1.a(0x7f0900fa);
	//   16   39:aload_1         
	//   17   40:ldc1            #90  <Int 0x7f0900fa>
	//   18   42:invokeinterface #77  <Method View a.a(int)>
	//   19   47:astore_3        
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f0903c3)));
	//   20   48:aload_1         
	//   21   49:ldc1            #91  <Int 0x7f0903c3>
	//   22   51:invokeinterface #77  <Method View a.a(int)>
	//   23   56:astore_1        
		if(view != null)
	//*  24   57:aload_2         
	//*  25   58:ifnull          73
			view.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ShowLogcatActivity_ a>
				//    2    4:invokevirtual   #25  <Method void ShowLogcatActivity_.i()>
				//    3    7:return          
				}

				final ShowLogcatActivity_ a;

			
			{
				a = ShowLogcatActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ShowLogcatActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   26   61:aload_2         
	//   27   62:new             #10  <Class ShowLogcatActivity_$1>
	//   28   65:dup             
	//   29   66:aload_0         
	//   30   67:invokespecial   #93  <Method void ShowLogcatActivity_$1(ShowLogcatActivity_)>
	//   31   70:invokevirtual   #99  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(view1 != null)
	//*  32   73:aload_3         
	//*  33   74:ifnull          89
			view1.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ShowLogcatActivity_ a>
				//    2    4:invokevirtual   #25  <Method void ShowLogcatActivity_.k()>
				//    3    7:return          
				}

				final ShowLogcatActivity_ a;

			
			{
				a = ShowLogcatActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ShowLogcatActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   34   77:aload_3         
	//   35   78:new             #12  <Class ShowLogcatActivity_$2>
	//   36   81:dup             
	//   37   82:aload_0         
	//   38   83:invokespecial   #100 <Method void ShowLogcatActivity_$2(ShowLogcatActivity_)>
	//   39   86:invokevirtual   #99  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//*  40   89:aload_1         
	//*  41   90:ifnull          105
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ShowLogcatActivity_ a>
				//    2    4:invokevirtual   #25  <Method void ShowLogcatActivity_.l()>
				//    3    7:return          
				}

				final ShowLogcatActivity_ a;

			
			{
				a = ShowLogcatActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ShowLogcatActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   42   93:aload_1         
	//   43   94:new             #14  <Class ShowLogcatActivity_$3>
	//   44   97:dup             
	//   45   98:aload_0         
	//   46   99:invokespecial   #101 <Method void ShowLogcatActivity_$3(ShowLogcatActivity_)>
	//   47  102:invokevirtual   #99  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   48  105:aload_0         
	//   49  106:invokevirtual   #104 <Method void e()>
	//   50  109:return          
	}

	void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.ShowLogcatActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ShowLogcatActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.ShowLogcatActivity_.c(ShowLogcatActivity_)>
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

			final ShowLogcatActivity_ a;

			
			{
				a = ShowLogcatActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ShowLogcatActivity_ a>
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
	//    0    0:new             #22  <Class ShowLogcatActivity_$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #106 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #106 <String "">
	//    6   10:invokespecial   #109 <Method void ShowLogcatActivity_$7(ShowLogcatActivity_, String, long, String)>
	//    7   13:invokestatic    #114 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void h()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.ShowLogcatActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ShowLogcatActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.ShowLogcatActivity_.a(ShowLogcatActivity_)>
			//    3    7:return          
			}

			final ShowLogcatActivity_ a;

			
			{
				a = ShowLogcatActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ShowLogcatActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #106 <String "">
	//    1    2:new             #16  <Class ShowLogcatActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #115 <Method void ShowLogcatActivity_$4(ShowLogcatActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #120 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	void j()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.ShowLogcatActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ShowLogcatActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.ShowLogcatActivity_.b(ShowLogcatActivity_)>
			//    3    7:return          
			}

			final ShowLogcatActivity_ a;

			
			{
				a = ShowLogcatActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ShowLogcatActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #106 <String "">
	//    1    2:new             #20  <Class ShowLogcatActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #121 <Method void ShowLogcatActivity_$6(ShowLogcatActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #120 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	void m()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					ShowLogcatActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ShowLogcatActivity_ a>
			//    2    4:invokestatic    #25  <Method void ShowLogcatActivity_.d(ShowLogcatActivity_)>
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

			final ShowLogcatActivity_ a;

			
			{
				a = ShowLogcatActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ShowLogcatActivity_ a>
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
	//    0    0:new             #24  <Class ShowLogcatActivity_$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #106 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #106 <String "">
	//    6   10:invokespecial   #122 <Method void ShowLogcatActivity_$8(ShowLogcatActivity_, String, long, String)>
	//    7   13:invokestatic    #114 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field c f>
	//    2    4:invokestatic    #126 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #128 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #130 <Method void ShowLogcatActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #126 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0071);
	//   13   23:aload_0         
	//   14   24:ldc1            #131 <Int 0x7f0b0071>
	//   15   26:invokevirtual   #135 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #136 <Method void ShowLogcatActivity.setContentView(int)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #138 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #141 <Method void ShowLogcatActivity.setContentView(View)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #138 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #144 <Method void ShowLogcatActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #138 <Method void c.a(a)>
	//    8   14:return          
	}

	void showLogcat(ArrayList arraylist)
	{
		org.androidannotations.api.b.a("", new Runnable(arraylist) {

			public void run()
			{
				com.irobot.home.ShowLogcatActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ShowLogcatActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field ArrayList a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.ShowLogcatActivity_.a(ShowLogcatActivity_, ArrayList)>
			//    5   11:return          
			}

			final ArrayList a;
			final ShowLogcatActivity_ b;

			
			{
				b = ShowLogcatActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ShowLogcatActivity_ b>
				a = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ArrayList a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #106 <String "">
	//    1    2:new             #18  <Class ShowLogcatActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #146 <Method void ShowLogcatActivity_$5(ShowLogcatActivity_, ArrayList)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #120 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	private final c f = new c();
}
