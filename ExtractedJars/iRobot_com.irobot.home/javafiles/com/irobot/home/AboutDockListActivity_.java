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
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			AboutDockListActivity

public final class AboutDockListActivity_ extends AboutDockListActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("assetId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "assetId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class AboutDockListActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #27  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #31  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #37  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #39  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #39  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #31  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #42  <Field Bundle a>
		//   20   42:invokevirtual   #47  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #51  <Field Context b>
		//*  24   52:instanceof      #53  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #51  <Field Context b>
		//   28   62:checkcast       #53  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #31  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #42  <Field Bundle a>
		//   34   74:invokestatic    #58  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #51  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #31  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #42  <Field Bundle a>
		//   42   92:invokevirtual   #64  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #66  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #51  <Field Context b>
		//   47  103:invokespecial   #68  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/AboutDockListActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class AboutDockListActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public AboutDockListActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AboutDockListActivity()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c f>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #16  <Class AboutDockListActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void AboutDockListActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		g();
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void g()>
	//    4    8:return          
	}

	static void a(AboutDockListActivity_ aboutdocklistactivity_, String s)
	{
		((AboutDockListActivity) (aboutdocklistactivity_)).com.irobot.home.AboutDockListActivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void com.irobot.home.AboutDockListActivity.a(String)>
	//    3    5:return          
	}

	static void a(AboutDockListActivity_ aboutdocklistactivity_, String s, String s1)
	{
		((AboutDockListActivity) (aboutdocklistactivity_)).com.irobot.home.AboutDockListActivity.a(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #48  <Method void com.irobot.home.AboutDockListActivity.a(String, String)>
	//    4    6:return          
	}

	static void b(AboutDockListActivity_ aboutdocklistactivity_, String s)
	{
		((AboutDockListActivity) (aboutdocklistactivity_)).com.irobot.home.AboutDockListActivity.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void com.irobot.home.AboutDockListActivity.b(String)>
	//    3    5:return          
	}

	private void g()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method Intent getIntent()>
	//    2    4:invokevirtual   #61  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("assetId"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #63  <String "assetId">
	//*   8   15:invokevirtual   #69  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			a = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #63  <String "assetId">
	//   13   25:invokevirtual   #73  <Method String Bundle.getString(String)>
	//   14   28:putfield        #76  <Field String a>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #80  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	protected void a(String s)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", s) {

			public void a()
			{
				try
				{
					com.irobot.home.AboutDockListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field AboutDockListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.AboutDockListActivity_.a(AboutDockListActivity_, String)>
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
			final AboutDockListActivity_ b;

			
			{
				b = AboutDockListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AboutDockListActivity_ b>
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
	//    0    0:new             #12  <Class AboutDockListActivity_$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #84  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #84  <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #87  <Method void AboutDockListActivity_$2(AboutDockListActivity_, String, long, String, String)>
	//    8   14:invokestatic    #92  <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	protected void a(String s, String s1)
	{
		org.androidannotations.api.b.a("", new Runnable(s, s1) {

			public void run()
			{
				com.irobot.home.AboutDockListActivity_.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AboutDockListActivity_ c>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field String a>
			//    4    8:aload_0         
			//    5    9:getfield        #23  <Field String b>
			//    6   12:invokestatic    #30  <Method void com.irobot.home.AboutDockListActivity_.a(AboutDockListActivity_, String, String)>
			//    7   15:return          
			}

			final String a;
			final String b;
			final AboutDockListActivity_ c;

			
			{
				c = AboutDockListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AboutDockListActivity_ c>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				b = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
		}
, 0L);
	//    0    0:ldc1            #84  <String "">
	//    1    2:new             #10  <Class AboutDockListActivity_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokespecial   #94  <Method void AboutDockListActivity_$1(AboutDockListActivity_, String, String)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #99  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    9   16:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (RecyclerView)a1.a(0x7f090009);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #101 <Int 0x7f090009>
	//    3    4:invokeinterface #103 <Method View a.a(int)>
	//    4    9:checkcast       #105 <Class RecyclerView>
	//    5   12:putfield        #108 <Field RecyclerView b>
		e();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #111 <Method void e()>
	//    8   19:return          
	}

	protected void b(String s)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", s) {

			public void a()
			{
				try
				{
					com.irobot.home.AboutDockListActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field AboutDockListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.AboutDockListActivity_.b(AboutDockListActivity_, String)>
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
			final AboutDockListActivity_ b;

			
			{
				b = AboutDockListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AboutDockListActivity_ b>
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
	//    0    0:new             #14  <Class AboutDockListActivity_$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #84  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #84  <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #112 <Method void AboutDockListActivity_$3(AboutDockListActivity_, String, long, String, String)>
	//    8   14:invokestatic    #92  <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c f>
	//    2    4:invokestatic    #116 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #118 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #120 <Method void AboutDockListActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #116 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b001f);
	//   13   23:aload_0         
	//   14   24:ldc1            #121 <Int 0x7f0b001f>
	//   15   26:invokevirtual   #125 <Method void setContentView(int)>
	//   16   29:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #133 <Method int MenuItem.getItemId()>
	//*   2    6:ldc1            #134 <Int 0x102002c>
	//*   3    8:icmpne          17
		{
			f();
	//    4   11:aload_0         
	//    5   12:invokevirtual   #136 <Method void f()>
			return true;
	//    6   15:iconst_1        
	//    7   16:ireturn         
		} else
		{
			return super.onOptionsItemSelected(menuitem);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #138 <Method boolean AboutDockListActivity.onOptionsItemSelected(MenuItem)>
	//   11   22:ireturn         
		}
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #139 <Method void AboutDockListActivity.setContentView(int)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #141 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #144 <Method void AboutDockListActivity.setContentView(View)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #141 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #147 <Method void AboutDockListActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #141 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #151 <Method void AboutDockListActivity.setIntent(Intent)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void g()>
	//    5    9:return          
	}

	private final c f = new c();
}
