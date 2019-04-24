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
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			AboutRobotTableViewActivity

public final class AboutRobotTableViewActivity_ extends AboutRobotTableViewActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "robotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #33  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class AboutRobotTableViewActivity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field android.support.v4.app.Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
		//    3    7:aload_0         
		//    4    8:getfield        #36  <Field android.support.v4.app.Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #40  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #46  <Method void android.support.v4.app.Fragment.startActivityForResult(Intent, int)>
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
		//   16   34:getfield        #40  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #49  <Field Bundle a>
		//   20   42:invokevirtual   #52  <Method void Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #56  <Field Context b>
		//*  24   52:instanceof      #58  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
		//   26   58:aload_0         
		//   27   59:getfield        #56  <Field Context b>
		//   28   62:checkcast       #58  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #40  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #49  <Field Bundle a>
		//   34   74:invokestatic    #63  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #56  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #40  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #49  <Field Bundle a>
		//   42   92:invokevirtual   #69  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #71  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #56  <Field Context b>
		//   47  103:invokespecial   #73  <Method void e(Context)>
		//   48  106:areturn         
		}

		private Fragment d;
		private android.support.v4.app.Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/AboutRobotTableViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class AboutRobotTableViewActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}

		public a(Context context)
		{
			super(context, com/irobot/home/AboutRobotTableViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class AboutRobotTableViewActivity_>
		//    3    4:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public AboutRobotTableViewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AboutRobotTableViewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void c()>
	//    6   12:putfield        #36  <Field c i>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #24  <Class AboutRobotTableViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #41  <Method void AboutRobotTableViewActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #24  <Class AboutRobotTableViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #45  <Method void AboutRobotTableViewActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #49  <Method void c.a(b)>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #51  <Method void i()>
	//    4    8:return          
	}

	static void a(AboutRobotTableViewActivity_ aboutrobottableviewactivity_)
	{
		((AboutRobotTableViewActivity) (aboutrobottableviewactivity_)).AboutRobotTableViewActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void AboutRobotTableViewActivity.f()>
	//    2    4:return          
	}

	static void a(AboutRobotTableViewActivity_ aboutrobottableviewactivity_, String s)
	{
		((AboutRobotTableViewActivity) (aboutrobottableviewactivity_)).AboutRobotTableViewActivity.d(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void AboutRobotTableViewActivity.d(String)>
	//    3    5:return          
	}

	static void b(AboutRobotTableViewActivity_ aboutrobottableviewactivity_, String s)
	{
		((AboutRobotTableViewActivity) (aboutrobottableviewactivity_)).com.irobot.home.AboutRobotTableViewActivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void com.irobot.home.AboutRobotTableViewActivity.a(String)>
	//    3    5:return          
	}

	static void c(AboutRobotTableViewActivity_ aboutrobottableviewactivity_, String s)
	{
		((AboutRobotTableViewActivity) (aboutrobottableviewactivity_)).com.irobot.home.AboutRobotTableViewActivity.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void com.irobot.home.AboutRobotTableViewActivity.b(String)>
	//    3    5:return          
	}

	static void d(AboutRobotTableViewActivity_ aboutrobottableviewactivity_, String s)
	{
		((AboutRobotTableViewActivity) (aboutrobottableviewactivity_)).com.irobot.home.AboutRobotTableViewActivity.c(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method void com.irobot.home.AboutRobotTableViewActivity.c(String)>
	//    3    5:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method Intent getIntent()>
	//    2    4:invokevirtual   #78  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #80  <String "robotBlid">
	//*   8   15:invokevirtual   #86  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #80  <String "robotBlid">
	//   13   25:invokevirtual   #90  <Method String Bundle.getString(String)>
	//   14   28:putfield        #93  <Field String a>
	//   15   31:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #97  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.AboutRobotTableViewActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AboutRobotTableViewActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.AboutRobotTableViewActivity_.b(AboutRobotTableViewActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final AboutRobotTableViewActivity_ b;

			
			{
				b = AboutRobotTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AboutRobotTableViewActivity_ b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #101 <String "">
	//    1    2:new             #16  <Class AboutRobotTableViewActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #103 <Method void AboutRobotTableViewActivity_$4(AboutRobotTableViewActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #108 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (RelativeLayout)a1.a(0x7f09018d);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #110 <Int 0x7f09018d>
	//    3    4:invokeinterface #112 <Method View a.a(int)>
	//    4    9:checkcast       #114 <Class RelativeLayout>
	//    5   12:putfield        #117 <Field RelativeLayout c>
		d = (RelativeLayout)a1.a(0x7f09018c);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #118 <Int 0x7f09018c>
	//    9   19:invokeinterface #112 <Method View a.a(int)>
	//   10   24:checkcast       #114 <Class RelativeLayout>
	//   11   27:putfield        #120 <Field RelativeLayout d>
		e = (RelativeLayout)a1.a(0x7f090365);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #121 <Int 0x7f090365>
	//   15   34:invokeinterface #112 <Method View a.a(int)>
	//   16   39:checkcast       #114 <Class RelativeLayout>
	//   17   42:putfield        #124 <Field RelativeLayout e>
		f = (RelativeLayout)a1.a(0x7f09035c);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #125 <Int 0x7f09035c>
	//   21   49:invokeinterface #112 <Method View a.a(int)>
	//   22   54:checkcast       #114 <Class RelativeLayout>
	//   23   57:putfield        #127 <Field RelativeLayout f>
		g = (CustomTextView)a1.a(0x7f09034d);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #128 <Int 0x7f09034d>
	//   27   64:invokeinterface #112 <Method View a.a(int)>
	//   28   69:checkcast       #130 <Class CustomTextView>
	//   29   72:putfield        #134 <Field CustomTextView g>
		if(c != null)
	//*  30   75:aload_0         
	//*  31   76:getfield        #117 <Field RelativeLayout c>
	//*  32   79:ifnull          97
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AboutRobotTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AboutRobotTableViewActivity_.g()>
				//    3    7:return          
				}

				final AboutRobotTableViewActivity_ a;

			
			{
				a = AboutRobotTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AboutRobotTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   33   82:aload_0         
	//   34   83:getfield        #117 <Field RelativeLayout c>
	//   35   86:new             #10  <Class AboutRobotTableViewActivity_$1>
	//   36   89:dup             
	//   37   90:aload_0         
	//   38   91:invokespecial   #136 <Method void AboutRobotTableViewActivity_$1(AboutRobotTableViewActivity_)>
	//   39   94:invokevirtual   #140 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(f != null)
	//*  40   97:aload_0         
	//*  41   98:getfield        #127 <Field RelativeLayout f>
	//*  42  101:ifnull          119
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AboutRobotTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AboutRobotTableViewActivity_.h()>
				//    3    7:return          
				}

				final AboutRobotTableViewActivity_ a;

			
			{
				a = AboutRobotTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AboutRobotTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   43  104:aload_0         
	//   44  105:getfield        #127 <Field RelativeLayout f>
	//   45  108:new             #12  <Class AboutRobotTableViewActivity_$2>
	//   46  111:dup             
	//   47  112:aload_0         
	//   48  113:invokespecial   #141 <Method void AboutRobotTableViewActivity_$2(AboutRobotTableViewActivity_)>
	//   49  116:invokevirtual   #140 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   50  119:aload_0         
	//   51  120:invokevirtual   #143 <Method void e()>
	//   52  123:return          
	}

	public void b(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.AboutRobotTableViewActivity_.c(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AboutRobotTableViewActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.AboutRobotTableViewActivity_.c(AboutRobotTableViewActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final AboutRobotTableViewActivity_ b;

			
			{
				b = AboutRobotTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AboutRobotTableViewActivity_ b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #101 <String "">
	//    1    2:new             #18  <Class AboutRobotTableViewActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #144 <Method void AboutRobotTableViewActivity_$5(AboutRobotTableViewActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #108 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void c(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				AboutRobotTableViewActivity_.d(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AboutRobotTableViewActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field String a>
			//    4    8:invokestatic    #29  <Method void AboutRobotTableViewActivity_.d(AboutRobotTableViewActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final AboutRobotTableViewActivity_ b;

			
			{
				b = AboutRobotTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AboutRobotTableViewActivity_ b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #101 <String "">
	//    1    2:new             #20  <Class AboutRobotTableViewActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #145 <Method void AboutRobotTableViewActivity_$6(AboutRobotTableViewActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #108 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	void d(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.AboutRobotTableViewActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AboutRobotTableViewActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.AboutRobotTableViewActivity_.a(AboutRobotTableViewActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final AboutRobotTableViewActivity_ b;

			
			{
				b = AboutRobotTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AboutRobotTableViewActivity_ b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #101 <String "">
	//    1    2:new             #14  <Class AboutRobotTableViewActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #146 <Method void AboutRobotTableViewActivity_$3(AboutRobotTableViewActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #108 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.AboutRobotTableViewActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AboutRobotTableViewActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.AboutRobotTableViewActivity_.a(AboutRobotTableViewActivity_)>
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

			final AboutRobotTableViewActivity_ a;

			
			{
				a = AboutRobotTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AboutRobotTableViewActivity_ a>
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
	//    0    0:new             #22  <Class AboutRobotTableViewActivity_$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #101 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #101 <String "">
	//    6   10:invokespecial   #149 <Method void AboutRobotTableViewActivity_$7(AboutRobotTableViewActivity_, String, long, String)>
	//    7   13:invokestatic    #154 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field c i>
	//    2    4:invokestatic    #158 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #160 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #162 <Method void AboutRobotTableViewActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #158 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0020);
	//   13   23:aload_0         
	//   14   24:ldc1            #163 <Int 0x7f0b0020>
	//   15   26:invokevirtual   #167 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #168 <Method void AboutRobotTableViewActivity.setContentView(int)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field c i>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #170 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #173 <Method void AboutRobotTableViewActivity.setContentView(View)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field c i>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #170 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #176 <Method void AboutRobotTableViewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field c i>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #170 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #180 <Method void AboutRobotTableViewActivity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #51  <Method void i()>
	//    5    9:return          
	}

	private final c i = new c();
}
