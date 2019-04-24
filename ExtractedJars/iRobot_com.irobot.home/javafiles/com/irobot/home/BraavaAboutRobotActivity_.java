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
import android.widget.RelativeLayout;
import com.irobot.core.AssetSoftwareVersionEvent;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaAboutRobotActivity, IRobotApplication_

public final class BraavaAboutRobotActivity_ extends BraavaAboutRobotActivity
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
		//    4    7:checkcast       #2   <Class BraavaAboutRobotActivity_$a>
		//    5   10:areturn         
		}

		public e a(int k)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, k);
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
				d.startActivityForResult(c, k, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, k, a);
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
			super(context, com/irobot/home/BraavaAboutRobotActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BraavaAboutRobotActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BraavaAboutRobotActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void BraavaAboutRobotActivity()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void c()>
	//    6   12:putfield        #34  <Field c g>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #22  <Class BraavaAboutRobotActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void BraavaAboutRobotActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method void c.a(b)>
		f = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #49  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #53  <Field IRobotApplication f>
		j();
	//    5   11:aload_0         
	//    6   12:invokespecial   #56  <Method void j()>
	//    7   15:return          
	}

	static void a(BraavaAboutRobotActivity_ braavaaboutrobotactivity_)
	{
		((BraavaAboutRobotActivity) (braavaaboutrobotactivity_)).BraavaAboutRobotActivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void BraavaAboutRobotActivity.i()>
	//    2    4:return          
	}

	static void a(BraavaAboutRobotActivity_ braavaaboutrobotactivity_, AssetSoftwareVersionEvent assetsoftwareversionevent)
	{
		((BraavaAboutRobotActivity) (braavaaboutrobotactivity_)).BraavaAboutRobotActivity.onAssetSoftwareVersionEvent(assetsoftwareversionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void BraavaAboutRobotActivity.onAssetSoftwareVersionEvent(AssetSoftwareVersionEvent)>
	//    3    5:return          
	}

	static void a(BraavaAboutRobotActivity_ braavaaboutrobotactivity_, AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		((BraavaAboutRobotActivity) (braavaaboutrobotactivity_)).BraavaAboutRobotActivity.onAssetUpdateAvailabilityEvent(assetupdateavailabilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void BraavaAboutRobotActivity.onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent)>
	//    3    5:return          
	}

	static void b(BraavaAboutRobotActivity_ braavaaboutrobotactivity_)
	{
		((BraavaAboutRobotActivity) (braavaaboutrobotactivity_)).BraavaAboutRobotActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void BraavaAboutRobotActivity.f()>
	//    2    4:return          
	}

	static void c(BraavaAboutRobotActivity_ braavaaboutrobotactivity_)
	{
		((BraavaAboutRobotActivity) (braavaaboutrobotactivity_)).BraavaAboutRobotActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void BraavaAboutRobotActivity.h()>
	//    2    4:return          
	}

	private void j()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method Intent getIntent()>
	//    2    4:invokevirtual   #87  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #89  <String "robotBlid">
	//*   8   15:invokevirtual   #95  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #89  <String "robotBlid">
	//   13   25:invokevirtual   #99  <Method String Bundle.getString(String)>
	//   14   28:putfield        #102 <Field String a>
	//   15   31:return          
	}

	public View a(int k)
	{
		return findViewById(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #106 <Method View findViewById(int)>
	//    3    5:areturn         
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
		d = (RelativeLayout)a1.a(0x7f090365);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #118 <Int 0x7f090365>
	//    9   19:invokeinterface #112 <Method View a.a(int)>
	//   10   24:checkcast       #114 <Class RelativeLayout>
	//   11   27:putfield        #121 <Field RelativeLayout d>
		e = a1.a(0x7f09018b);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #122 <Int 0x7f09018b>
	//   15   34:invokeinterface #112 <Method View a.a(int)>
	//   16   39:putfield        #126 <Field View e>
		if(e != null)
	//*  17   42:aload_0         
	//*  18   43:getfield        #126 <Field View e>
	//*  19   46:ifnull          64
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaAboutRobotActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaAboutRobotActivity_.g()>
				//    3    7:return          
				}

				final BraavaAboutRobotActivity_ a;

			
			{
				a = BraavaAboutRobotActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaAboutRobotActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   20   49:aload_0         
	//   21   50:getfield        #126 <Field View e>
	//   22   53:new             #10  <Class BraavaAboutRobotActivity_$1>
	//   23   56:dup             
	//   24   57:aload_0         
	//   25   58:invokespecial   #128 <Method void BraavaAboutRobotActivity_$1(BraavaAboutRobotActivity_)>
	//   26   61:invokevirtual   #134 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   27   64:aload_0         
	//   28   65:invokevirtual   #136 <Method void e()>
	//   29   68:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.BraavaAboutRobotActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BraavaAboutRobotActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.BraavaAboutRobotActivity_.b(BraavaAboutRobotActivity_)>
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

			final BraavaAboutRobotActivity_ a;

			
			{
				a = BraavaAboutRobotActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BraavaAboutRobotActivity_ a>
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
	//    0    0:new             #18  <Class BraavaAboutRobotActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #138 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #138 <String "">
	//    6   10:invokespecial   #141 <Method void BraavaAboutRobotActivity_$5(BraavaAboutRobotActivity_, String, long, String)>
	//    7   13:invokestatic    #146 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void h()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.BraavaAboutRobotActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BraavaAboutRobotActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.BraavaAboutRobotActivity_.c(BraavaAboutRobotActivity_)>
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

			final BraavaAboutRobotActivity_ a;

			
			{
				a = BraavaAboutRobotActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BraavaAboutRobotActivity_ a>
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
	//    0    0:new             #20  <Class BraavaAboutRobotActivity_$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #138 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #138 <String "">
	//    6   10:invokespecial   #147 <Method void BraavaAboutRobotActivity_$6(BraavaAboutRobotActivity_, String, long, String)>
	//    7   13:invokestatic    #146 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void i()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BraavaAboutRobotActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BraavaAboutRobotActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.BraavaAboutRobotActivity_.a(BraavaAboutRobotActivity_)>
			//    3    7:return          
			}

			final BraavaAboutRobotActivity_ a;

			
			{
				a = BraavaAboutRobotActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaAboutRobotActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #138 <String "">
	//    1    2:new             #16  <Class BraavaAboutRobotActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #148 <Method void BraavaAboutRobotActivity_$4(BraavaAboutRobotActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #153 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onAssetSoftwareVersionEvent(AssetSoftwareVersionEvent assetsoftwareversionevent)
	{
		org.androidannotations.api.b.a("", new Runnable(assetsoftwareversionevent) {

			public void run()
			{
				com.irobot.home.BraavaAboutRobotActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BraavaAboutRobotActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AssetSoftwareVersionEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaAboutRobotActivity_.a(BraavaAboutRobotActivity_, AssetSoftwareVersionEvent)>
			//    5   11:return          
			}

			final AssetSoftwareVersionEvent a;
			final BraavaAboutRobotActivity_ b;

			
			{
				b = BraavaAboutRobotActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaAboutRobotActivity_ b>
				a = assetsoftwareversionevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetSoftwareVersionEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #138 <String "">
	//    1    2:new             #12  <Class BraavaAboutRobotActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #156 <Method void BraavaAboutRobotActivity_$2(BraavaAboutRobotActivity_, AssetSoftwareVersionEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #153 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		org.androidannotations.api.b.a("", new Runnable(assetupdateavailabilityevent) {

			public void run()
			{
				com.irobot.home.BraavaAboutRobotActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BraavaAboutRobotActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AssetUpdateAvailabilityEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaAboutRobotActivity_.a(BraavaAboutRobotActivity_, AssetUpdateAvailabilityEvent)>
			//    5   11:return          
			}

			final AssetUpdateAvailabilityEvent a;
			final BraavaAboutRobotActivity_ b;

			
			{
				b = BraavaAboutRobotActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaAboutRobotActivity_ b>
				a = assetupdateavailabilityevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetUpdateAvailabilityEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #138 <String "">
	//    1    2:new             #14  <Class BraavaAboutRobotActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #159 <Method void BraavaAboutRobotActivity_$3(BraavaAboutRobotActivity_, AssetUpdateAvailabilityEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #153 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field c g>
	//    2    4:invokestatic    #163 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #165 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #167 <Method void BraavaAboutRobotActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #163 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b002b);
	//   13   23:aload_0         
	//   14   24:ldc1            #168 <Int 0x7f0b002b>
	//   15   26:invokevirtual   #172 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int k)
	{
		super.setContentView(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #173 <Method void BraavaAboutRobotActivity.setContentView(int)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #175 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #178 <Method void BraavaAboutRobotActivity.setContentView(View)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #175 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #181 <Method void BraavaAboutRobotActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field c g>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #175 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method void BraavaAboutRobotActivity.setIntent(Intent)>
		j();
	//    3    5:aload_0         
	//    4    6:invokespecial   #56  <Method void j()>
	//    5    9:return          
	}

	private final c g = new c();
}
