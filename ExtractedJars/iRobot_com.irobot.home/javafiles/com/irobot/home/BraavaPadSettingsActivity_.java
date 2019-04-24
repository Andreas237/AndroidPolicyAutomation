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
import com.irobot.core.RobotPadCategory;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaPadSettingsActivity

public final class BraavaPadSettingsActivity_ extends BraavaPadSettingsActivity
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
		//    4    7:checkcast       #2   <Class BraavaPadSettingsActivity_$a>
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
			super(context, com/irobot/home/BraavaPadSettingsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BraavaPadSettingsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BraavaPadSettingsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void BraavaPadSettingsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c f>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #14  <Class BraavaPadSettingsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void BraavaPadSettingsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void c()>
		org.androidannotations.api.c.c.a(((b) (this)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #38  <Method void c.a(b)>
	//    4    8:return          
	}

	static void a(BraavaPadSettingsActivity_ braavapadsettingsactivity_)
	{
		((BraavaPadSettingsActivity) (braavapadsettingsactivity_)).com.irobot.home.BraavaPadSettingsActivity.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void com.irobot.home.BraavaPadSettingsActivity.b()>
	//    2    4:return          
	}

	static void a(BraavaPadSettingsActivity_ braavapadsettingsactivity_, RobotPadCategory robotpadcategory, int i)
	{
		((BraavaPadSettingsActivity) (braavapadsettingsactivity_)).com.irobot.home.BraavaPadSettingsActivity.a(robotpadcategory, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void com.irobot.home.BraavaPadSettingsActivity.a(RobotPadCategory, int)>
	//    4    6:return          
	}

	private void c()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method Intent getIntent()>
	//    2    4:invokevirtual   #56  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #58  <String "robotBlid">
	//*   8   15:invokevirtual   #64  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			c = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #58  <String "robotBlid">
	//   13   25:invokevirtual   #68  <Method String Bundle.getString(String)>
	//   14   28:putfield        #71  <Field String c>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #75  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(RobotPadCategory robotpadcategory, int i)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", robotpadcategory, i) {

			public void a()
			{
				try
				{
					com.irobot.home.BraavaPadSettingsActivity_.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field BraavaPadSettingsActivity_ c>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field RobotPadCategory a>
			//    4    8:aload_0         
			//    5    9:getfield        #22  <Field int b>
			//    6   12:invokestatic    #32  <Method void com.irobot.home.BraavaPadSettingsActivity_.a(BraavaPadSettingsActivity_, RobotPadCategory, int)>
					return;
			//    7   15:return          
				}
				catch(Throwable throwable)
			//*   8   16:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    9   17:invokestatic    #38  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//   10   20:invokestatic    #42  <Method Thread Thread.currentThread()>
			//   11   23:aload_1         
			//   12   24:invokeinterface #48  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   13   29:return          
			}

			final RobotPadCategory a;
			final int b;
			final BraavaPadSettingsActivity_ c;

			
			{
				c = BraavaPadSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BraavaPadSettingsActivity_ c>
				a = robotpadcategory;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #20  <Field RobotPadCategory a>
				b = i;
			//    6   11:aload_0         
			//    7   12:iload           7
			//    8   14:putfield        #22  <Field int b>
				super(s, l, s1);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:lload_3         
			//   12   20:aload           5
			//   13   22:invokespecial   #25  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   14   25:return          
			}
		}
)));
	//    0    0:new             #12  <Class BraavaPadSettingsActivity_$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #79  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #79  <String "">
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokespecial   #82  <Method void BraavaPadSettingsActivity_$2(BraavaPadSettingsActivity_, String, long, String, RobotPadCategory, int)>
	//    9   15:invokestatic    #87  <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//   10   18:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method void a()>
	//    2    4:return          
	}

	public void b()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BraavaPadSettingsActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BraavaPadSettingsActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.BraavaPadSettingsActivity_.a(BraavaPadSettingsActivity_)>
			//    3    7:return          
			}

			final BraavaPadSettingsActivity_ a;

			
			{
				a = BraavaPadSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaPadSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #79  <String "">
	//    1    2:new             #10  <Class BraavaPadSettingsActivity_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #92  <Method void BraavaPadSettingsActivity_$1(BraavaPadSettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #97  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c f>
	//    2    4:invokestatic    #101 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #103 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #105 <Method void BraavaPadSettingsActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #101 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b002c);
	//   13   23:aload_0         
	//   14   24:ldc1            #106 <Int 0x7f0b002c>
	//   15   26:invokevirtual   #110 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #111 <Method void BraavaPadSettingsActivity.setContentView(int)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #113 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #116 <Method void BraavaPadSettingsActivity.setContentView(View)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #113 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #119 <Method void BraavaPadSettingsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #113 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void BraavaPadSettingsActivity.setIntent(Intent)>
		c();
	//    3    5:aload_0         
	//    4    6:invokespecial   #35  <Method void c()>
	//    5    9:return          
	}

	private final c f = new c();
}
