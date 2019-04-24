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
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			PartsDetailListActivity

public final class PartsDetailListActivity_ extends PartsDetailListActivity
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
		//    4    7:checkcast       #2   <Class PartsDetailListActivity_$a>
		//    5   10:areturn         
		}

		public e a(int l)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field android.support.v4.app.Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, l);
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
				d.startActivityForResult(c, l, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, l, a);
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
			super(((Context) (fragment.getActivity())), com/irobot/home/PartsDetailListActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class PartsDetailListActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}

		public a(Context context)
		{
			super(context, com/irobot/home/PartsDetailListActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class PartsDetailListActivity_>
		//    3    4:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public PartsDetailListActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void PartsDetailListActivity()>
	//    2    4:aload_0         
	//    3    5:new             #37  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void c()>
	//    6   12:putfield        #40  <Field c h>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #28  <Class PartsDetailListActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #45  <Method void PartsDetailListActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #28  <Class PartsDetailListActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #49  <Method void PartsDetailListActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method void c.a(b)>
		k();
	//    2    4:aload_0         
	//    3    5:invokespecial   #56  <Method void k()>
	//    4    8:return          
	}

	static void a(PartsDetailListActivity_ partsdetaillistactivity_)
	{
		((PartsDetailListActivity) (partsdetaillistactivity_)).PartsDetailListActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void PartsDetailListActivity.g()>
	//    2    4:return          
	}

	static void a(PartsDetailListActivity_ partsdetaillistactivity_, String s)
	{
		((PartsDetailListActivity) (partsdetaillistactivity_)).com.irobot.home.PartsDetailListActivity.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void com.irobot.home.PartsDetailListActivity.b(String)>
	//    3    5:return          
	}

	static void a(PartsDetailListActivity_ partsdetaillistactivity_, boolean flag)
	{
		((PartsDetailListActivity) (partsdetaillistactivity_)).com.irobot.home.PartsDetailListActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #69  <Method void com.irobot.home.PartsDetailListActivity.a(boolean)>
	//    3    5:return          
	}

	static void b(PartsDetailListActivity_ partsdetaillistactivity_)
	{
		((PartsDetailListActivity) (partsdetaillistactivity_)).PartsDetailListActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void PartsDetailListActivity.h()>
	//    2    4:return          
	}

	static void b(PartsDetailListActivity_ partsdetaillistactivity_, String s)
	{
		((PartsDetailListActivity) (partsdetaillistactivity_)).com.irobot.home.PartsDetailListActivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void com.irobot.home.PartsDetailListActivity.a(String)>
	//    3    5:return          
	}

	static void c(PartsDetailListActivity_ partsdetaillistactivity_)
	{
		((PartsDetailListActivity) (partsdetaillistactivity_)).PartsDetailListActivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void PartsDetailListActivity.i()>
	//    2    4:return          
	}

	static void d(PartsDetailListActivity_ partsdetaillistactivity_)
	{
		((PartsDetailListActivity) (partsdetaillistactivity_)).PartsDetailListActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void PartsDetailListActivity.j()>
	//    2    4:return          
	}

	private void k()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method Intent getIntent()>
	//    2    4:invokevirtual   #91  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #93  <String "robotBlid">
	//*   8   15:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			b = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #93  <String "robotBlid">
	//   13   25:invokevirtual   #103 <Method String Bundle.getString(String)>
	//   14   28:putfield        #106 <Field String b>
	//   15   31:return          
	}

	public View a(int l)
	{
		return findViewById(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #110 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	protected void a(String s)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", s) {

			public void a()
			{
				try
				{
					com.irobot.home.PartsDetailListActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field PartsDetailListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.PartsDetailListActivity_.b(PartsDetailListActivity_, String)>
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
			final PartsDetailListActivity_ b;

			
			{
				b = PartsDetailListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PartsDetailListActivity_ b>
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
	//    0    0:new             #26  <Class PartsDetailListActivity_$9>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #114 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #114 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #117 <Method void PartsDetailListActivity_$9(PartsDetailListActivity_, String, long, String, String)>
	//    8   14:invokestatic    #122 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = a1.a(0x7f0900a8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #124 <Int 0x7f0900a8>
	//    3    4:invokeinterface #126 <Method View a.a(int)>
	//    4    9:putfield        #129 <Field View a>
		c = (ListView)a1.a(0x7f0902eb);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:ldc1            #130 <Int 0x7f0902eb>
	//    8   16:invokeinterface #126 <Method View a.a(int)>
	//    9   21:checkcast       #132 <Class ListView>
	//   10   24:putfield        #135 <Field ListView c>
		d = a1.a(0x7f0902ec);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #136 <Int 0x7f0902ec>
	//   14   31:invokeinterface #126 <Method View a.a(int)>
	//   15   36:putfield        #138 <Field View d>
		e = (LinearLayout)a1.a(0x7f090379);
	//   16   39:aload_0         
	//   17   40:aload_1         
	//   18   41:ldc1            #139 <Int 0x7f090379>
	//   19   43:invokeinterface #126 <Method View a.a(int)>
	//   20   48:checkcast       #141 <Class LinearLayout>
	//   21   51:putfield        #145 <Field LinearLayout e>
		f = (ProgressBar)a1.a(0x7f090306);
	//   22   54:aload_0         
	//   23   55:aload_1         
	//   24   56:ldc1            #146 <Int 0x7f090306>
	//   25   58:invokeinterface #126 <Method View a.a(int)>
	//   26   63:checkcast       #148 <Class ProgressBar>
	//   27   66:putfield        #152 <Field ProgressBar f>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f09019d)));
	//   28   69:aload_1         
	//   29   70:ldc1            #153 <Int 0x7f09019d>
	//   30   72:invokeinterface #126 <Method View a.a(int)>
	//   31   77:astore_1        
		if(a1 != null)
	//*  32   78:aload_1         
	//*  33   79:ifnull          94
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PartsDetailListActivity_ a>
				//    2    4:invokevirtual   #25  <Method void PartsDetailListActivity_.f()>
				//    3    7:return          
				}

				final PartsDetailListActivity_ a;

			
			{
				a = PartsDetailListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PartsDetailListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   34   82:aload_1         
	//   35   83:new             #10  <Class PartsDetailListActivity_$1>
	//   36   86:dup             
	//   37   87:aload_0         
	//   38   88:invokespecial   #155 <Method void PartsDetailListActivity_$1(PartsDetailListActivity_)>
	//   39   91:invokevirtual   #161 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(c != null)
	//*  40   94:aload_0         
	//*  41   95:getfield        #135 <Field ListView c>
	//*  42   98:ifnull          116
			((AdapterView) (c)).setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

				public void onItemClick(AdapterView adapterview, View view, int l, long l1)
				{
					a.f(l);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PartsDetailListActivity_ a>
				//    2    4:iload_3         
				//    3    5:invokevirtual   #26  <Method void PartsDetailListActivity_.f(int)>
				//    4    8:return          
				}

				final PartsDetailListActivity_ a;

			
			{
				a = PartsDetailListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PartsDetailListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   43  101:aload_0         
	//   44  102:getfield        #135 <Field ListView c>
	//   45  105:new             #12  <Class PartsDetailListActivity_$2>
	//   46  108:dup             
	//   47  109:aload_0         
	//   48  110:invokespecial   #162 <Method void PartsDetailListActivity_$2(PartsDetailListActivity_)>
	//   49  113:invokevirtual   #168 <Method void AdapterView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		e();
	//   50  116:aload_0         
	//   51  117:invokevirtual   #170 <Method void e()>
	//   52  120:return          
	}

	protected void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.PartsDetailListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field PartsDetailListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.PartsDetailListActivity_.a(PartsDetailListActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final PartsDetailListActivity_ b;

			
			{
				b = PartsDetailListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PartsDetailListActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #114 <String "">
	//    1    2:new             #22  <Class PartsDetailListActivity_$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #172 <Method void PartsDetailListActivity_$7(PartsDetailListActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #177 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void b(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.PartsDetailListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field PartsDetailListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.PartsDetailListActivity_.a(PartsDetailListActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final PartsDetailListActivity_ b;

			
			{
				b = PartsDetailListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PartsDetailListActivity_ b>
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
	//    0    0:ldc1            #114 <String "">
	//    1    2:new             #16  <Class PartsDetailListActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #179 <Method void PartsDetailListActivity_$4(PartsDetailListActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #177 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.PartsDetailListActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PartsDetailListActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.PartsDetailListActivity_.a(PartsDetailListActivity_)>
			//    3    7:return          
			}

			final PartsDetailListActivity_ a;

			
			{
				a = PartsDetailListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PartsDetailListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #114 <String "">
	//    1    2:new             #14  <Class PartsDetailListActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #180 <Method void PartsDetailListActivity_$3(PartsDetailListActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #177 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void h()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.PartsDetailListActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PartsDetailListActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.PartsDetailListActivity_.b(PartsDetailListActivity_)>
			//    3    7:return          
			}

			final PartsDetailListActivity_ a;

			
			{
				a = PartsDetailListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PartsDetailListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #114 <String "">
	//    1    2:new             #18  <Class PartsDetailListActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #181 <Method void PartsDetailListActivity_$5(PartsDetailListActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #177 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void i()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.PartsDetailListActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PartsDetailListActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.PartsDetailListActivity_.c(PartsDetailListActivity_)>
			//    3    7:return          
			}

			final PartsDetailListActivity_ a;

			
			{
				a = PartsDetailListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PartsDetailListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #114 <String "">
	//    1    2:new             #20  <Class PartsDetailListActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #182 <Method void PartsDetailListActivity_$6(PartsDetailListActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #177 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void j()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				PartsDetailListActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PartsDetailListActivity_ a>
			//    2    4:invokestatic    #24  <Method void PartsDetailListActivity_.d(PartsDetailListActivity_)>
			//    3    7:return          
			}

			final PartsDetailListActivity_ a;

			
			{
				a = PartsDetailListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PartsDetailListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #114 <String "">
	//    1    2:new             #24  <Class PartsDetailListActivity_$8>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #183 <Method void PartsDetailListActivity_$8(PartsDetailListActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #177 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(h);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field c h>
	//    2    4:invokestatic    #187 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #189 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #191 <Method void PartsDetailListActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #187 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b005c);
	//   13   23:aload_0         
	//   14   24:ldc1            #192 <Int 0x7f0b005c>
	//   15   26:invokevirtual   #196 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int l)
	{
		super.setContentView(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #197 <Method void PartsDetailListActivity.setContentView(int)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #199 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #202 <Method void PartsDetailListActivity.setContentView(View)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #199 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #205 <Method void PartsDetailListActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field c h>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #199 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #209 <Method void PartsDetailListActivity.setIntent(Intent)>
		k();
	//    3    5:aload_0         
	//    4    6:invokespecial   #56  <Method void k()>
	//    5    9:return          
	}

	private final c h = new c();
}
