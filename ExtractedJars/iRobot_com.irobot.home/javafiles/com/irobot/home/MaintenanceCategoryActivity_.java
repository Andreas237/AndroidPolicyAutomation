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
import android.widget.ListView;
import android.widget.ProgressBar;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			MaintenanceCategoryActivity

public final class MaintenanceCategoryActivity_ extends MaintenanceCategoryActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "robotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class MaintenanceCategoryActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i1)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i1);
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
				d.startActivityForResult(c, i1, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, i1, a);
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

		public a b(String s)
		{
			return (a)super.a("categoryId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #70  <String "categoryId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class MaintenanceCategoryActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/MaintenanceCategoryActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class MaintenanceCategoryActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public MaintenanceCategoryActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void MaintenanceCategoryActivity()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void c()>
	//    6   12:putfield        #34  <Field c h>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #22  <Class MaintenanceCategoryActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void MaintenanceCategoryActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method void c.a(b)>
		l();
	//    2    4:aload_0         
	//    3    5:invokespecial   #46  <Method void l()>
	//    4    8:return          
	}

	static void a(MaintenanceCategoryActivity_ maintenancecategoryactivity_)
	{
		((MaintenanceCategoryActivity) (maintenancecategoryactivity_)).MaintenanceCategoryActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void MaintenanceCategoryActivity.g()>
	//    2    4:return          
	}

	static void b(MaintenanceCategoryActivity_ maintenancecategoryactivity_)
	{
		((MaintenanceCategoryActivity) (maintenancecategoryactivity_)).MaintenanceCategoryActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void MaintenanceCategoryActivity.h()>
	//    2    4:return          
	}

	static void c(MaintenanceCategoryActivity_ maintenancecategoryactivity_)
	{
		((MaintenanceCategoryActivity) (maintenancecategoryactivity_)).MaintenanceCategoryActivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void MaintenanceCategoryActivity.i()>
	//    2    4:return          
	}

	static void d(MaintenanceCategoryActivity_ maintenancecategoryactivity_)
	{
		((MaintenanceCategoryActivity) (maintenancecategoryactivity_)).MaintenanceCategoryActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void MaintenanceCategoryActivity.j()>
	//    2    4:return          
	}

	static void e(MaintenanceCategoryActivity_ maintenancecategoryactivity_)
	{
		((MaintenanceCategoryActivity) (maintenancecategoryactivity_)).MaintenanceCategoryActivity.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void MaintenanceCategoryActivity.k()>
	//    2    4:return          
	}

	private void l()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method Intent getIntent()>
	//    2    4:invokevirtual   #75  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("robotBlid"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #77  <String "robotBlid">
	//*   8   15:invokevirtual   #83  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #77  <String "robotBlid">
	//   13   25:invokevirtual   #87  <Method String Bundle.getString(String)>
	//   14   28:putfield        #90  <Field String a>
			if(bundle.containsKey("categoryId"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #92  <String "categoryId">
	//*  17   34:invokevirtual   #83  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getString("categoryId");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #92  <String "categoryId">
	//   22   44:invokevirtual   #87  <Method String Bundle.getString(String)>
	//   23   47:putfield        #94  <Field String b>
		}
	//   24   50:return          
	}

	public View a(int i1)
	{
		return findViewById(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #98  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = a1.a(0x7f0900a8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #102 <Int 0x7f0900a8>
	//    3    4:invokeinterface #104 <Method View a.a(int)>
	//    4    9:putfield        #107 <Field View c>
		d = (ListView)a1.a(0x7f0902eb);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:ldc1            #108 <Int 0x7f0902eb>
	//    8   16:invokeinterface #104 <Method View a.a(int)>
	//    9   21:checkcast       #110 <Class ListView>
	//   10   24:putfield        #113 <Field ListView d>
		e = (ProgressBar)a1.a(0x7f090340);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #114 <Int 0x7f090340>
	//   14   31:invokeinterface #104 <Method View a.a(int)>
	//   15   36:checkcast       #116 <Class ProgressBar>
	//   16   39:putfield        #119 <Field ProgressBar e>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f09019d)));
	//   17   42:aload_1         
	//   18   43:ldc1            #120 <Int 0x7f09019d>
	//   19   45:invokeinterface #104 <Method View a.a(int)>
	//   20   50:astore_1        
		if(a1 != null)
	//*  21   51:aload_1         
	//*  22   52:ifnull          67
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MaintenanceCategoryActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MaintenanceCategoryActivity_.f()>
				//    3    7:return          
				}

				final MaintenanceCategoryActivity_ a;

			
			{
				a = MaintenanceCategoryActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MaintenanceCategoryActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   23   55:aload_1         
	//   24   56:new             #10  <Class MaintenanceCategoryActivity_$1>
	//   25   59:dup             
	//   26   60:aload_0         
	//   27   61:invokespecial   #122 <Method void MaintenanceCategoryActivity_$1(MaintenanceCategoryActivity_)>
	//   28   64:invokevirtual   #128 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   29   67:aload_0         
	//   30   68:invokevirtual   #130 <Method void e()>
	//   31   71:return          
	}

	void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.MaintenanceCategoryActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MaintenanceCategoryActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.MaintenanceCategoryActivity_.a(MaintenanceCategoryActivity_)>
			//    3    7:return          
			}

			final MaintenanceCategoryActivity_ a;

			
			{
				a = MaintenanceCategoryActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MaintenanceCategoryActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #132 <String "">
	//    1    2:new             #12  <Class MaintenanceCategoryActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #133 <Method void MaintenanceCategoryActivity_$2(MaintenanceCategoryActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #138 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void h()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.MaintenanceCategoryActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MaintenanceCategoryActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.MaintenanceCategoryActivity_.b(MaintenanceCategoryActivity_)>
			//    3    7:return          
			}

			final MaintenanceCategoryActivity_ a;

			
			{
				a = MaintenanceCategoryActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MaintenanceCategoryActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #132 <String "">
	//    1    2:new             #14  <Class MaintenanceCategoryActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #139 <Method void MaintenanceCategoryActivity_$3(MaintenanceCategoryActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #138 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void i()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.MaintenanceCategoryActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MaintenanceCategoryActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.MaintenanceCategoryActivity_.c(MaintenanceCategoryActivity_)>
			//    3    7:return          
			}

			final MaintenanceCategoryActivity_ a;

			
			{
				a = MaintenanceCategoryActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MaintenanceCategoryActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #132 <String "">
	//    1    2:new             #16  <Class MaintenanceCategoryActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #140 <Method void MaintenanceCategoryActivity_$4(MaintenanceCategoryActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #138 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void j()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				MaintenanceCategoryActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MaintenanceCategoryActivity_ a>
			//    2    4:invokestatic    #24  <Method void MaintenanceCategoryActivity_.d(MaintenanceCategoryActivity_)>
			//    3    7:return          
			}

			final MaintenanceCategoryActivity_ a;

			
			{
				a = MaintenanceCategoryActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MaintenanceCategoryActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #132 <String "">
	//    1    2:new             #18  <Class MaintenanceCategoryActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #141 <Method void MaintenanceCategoryActivity_$5(MaintenanceCategoryActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #138 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void k()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.MaintenanceCategoryActivity_.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MaintenanceCategoryActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.MaintenanceCategoryActivity_.e(MaintenanceCategoryActivity_)>
			//    3    7:return          
			}

			final MaintenanceCategoryActivity_ a;

			
			{
				a = MaintenanceCategoryActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MaintenanceCategoryActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #132 <String "">
	//    1    2:new             #20  <Class MaintenanceCategoryActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #142 <Method void MaintenanceCategoryActivity_$6(MaintenanceCategoryActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #138 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(h);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field c h>
	//    2    4:invokestatic    #146 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #148 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #150 <Method void MaintenanceCategoryActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #146 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b004b);
	//   13   23:aload_0         
	//   14   24:ldc1            #151 <Int 0x7f0b004b>
	//   15   26:invokevirtual   #155 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i1)
	{
		super.setContentView(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #156 <Method void MaintenanceCategoryActivity.setContentView(int)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #158 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #161 <Method void MaintenanceCategoryActivity.setContentView(View)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #158 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #164 <Method void MaintenanceCategoryActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field c h>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #158 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #168 <Method void MaintenanceCategoryActivity.setIntent(Intent)>
		l();
	//    3    5:aload_0         
	//    4    6:invokespecial   #46  <Method void l()>
	//    5    9:return          
	}

	private final c h = new c();
}
