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
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BinBehaviorActivity

public final class BinBehaviorActivity_ extends BinBehaviorActivity
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
		//    4    7:checkcast       #2   <Class BinBehaviorActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("isPauseEnabled", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "isPauseEnabled">
		//    2    3:iload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class BinBehaviorActivity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #37  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #43  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #45  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, j, a);
		//   13   29:aload_0         
		//   14   30:getfield        #45  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #37  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #48  <Field Bundle a>
		//   20   42:invokevirtual   #53  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #57  <Field Context b>
		//*  24   52:instanceof      #59  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
		//   26   58:aload_0         
		//   27   59:getfield        #57  <Field Context b>
		//   28   62:checkcast       #59  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #37  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #48  <Field Bundle a>
		//   34   74:invokestatic    #64  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #57  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #37  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #48  <Field Bundle a>
		//   42   92:invokevirtual   #70  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #72  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #57  <Field Context b>
		//   47  103:invokespecial   #74  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/BinBehaviorActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BinBehaviorActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BinBehaviorActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void BinBehaviorActivity()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c h>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #18  <Class BinBehaviorActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void BinBehaviorActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method void c.a(b)>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #42  <Method void i()>
	//    4    8:return          
	}

	static void a(BinBehaviorActivity_ binbehavioractivity_)
	{
		((BinBehaviorActivity) (binbehavioractivity_)).BinBehaviorActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void BinBehaviorActivity.h()>
	//    2    4:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method Intent getIntent()>
	//    2    4:invokevirtual   #55  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("robotBlid"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #57  <String "robotBlid">
	//*   8   15:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #57  <String "robotBlid">
	//   13   25:invokevirtual   #67  <Method String Bundle.getString(String)>
	//   14   28:putfield        #70  <Field String a>
			if(bundle.containsKey("isPauseEnabled"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #72  <String "isPauseEnabled">
	//*  17   34:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getBoolean("isPauseEnabled");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #72  <String "isPauseEnabled">
	//   22   44:invokevirtual   #75  <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #79  <Field boolean b>
		}
	//   24   50:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #83  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (RelativeLayout)a1.a(0x7f0902f1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #87  <Int 0x7f0902f1>
	//    3    4:invokeinterface #89  <Method View a.a(int)>
	//    4    9:checkcast       #91  <Class RelativeLayout>
	//    5   12:putfield        #95  <Field RelativeLayout c>
		d = (RelativeLayout)a1.a(0x7f09011f);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #96  <Int 0x7f09011f>
	//    9   19:invokeinterface #89  <Method View a.a(int)>
	//   10   24:checkcast       #91  <Class RelativeLayout>
	//   11   27:putfield        #99  <Field RelativeLayout d>
		e = a1.a(0x7f090209);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #100 <Int 0x7f090209>
	//   15   34:invokeinterface #89  <Method View a.a(int)>
	//   16   39:putfield        #104 <Field View e>
		if(c != null)
	//*  17   42:aload_0         
	//*  18   43:getfield        #95  <Field RelativeLayout c>
	//*  19   46:ifnull          64
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BinBehaviorActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BinBehaviorActivity_.f()>
				//    3    7:return          
				}

				final BinBehaviorActivity_ a;

			
			{
				a = BinBehaviorActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BinBehaviorActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   20   49:aload_0         
	//   21   50:getfield        #95  <Field RelativeLayout c>
	//   22   53:new             #10  <Class BinBehaviorActivity_$1>
	//   23   56:dup             
	//   24   57:aload_0         
	//   25   58:invokespecial   #106 <Method void BinBehaviorActivity_$1(BinBehaviorActivity_)>
	//   26   61:invokevirtual   #110 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  27   64:aload_0         
	//*  28   65:getfield        #99  <Field RelativeLayout d>
	//*  29   68:ifnull          86
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BinBehaviorActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BinBehaviorActivity_.g()>
				//    3    7:return          
				}

				final BinBehaviorActivity_ a;

			
			{
				a = BinBehaviorActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BinBehaviorActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   30   71:aload_0         
	//   31   72:getfield        #99  <Field RelativeLayout d>
	//   32   75:new             #12  <Class BinBehaviorActivity_$2>
	//   33   78:dup             
	//   34   79:aload_0         
	//   35   80:invokespecial   #111 <Method void BinBehaviorActivity_$2(BinBehaviorActivity_)>
	//   36   83:invokevirtual   #110 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  37   86:aload_0         
	//*  38   87:getfield        #104 <Field View e>
	//*  39   90:ifnull          108
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BinBehaviorActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BinBehaviorActivity_.h()>
				//    3    7:return          
				}

				final BinBehaviorActivity_ a;

			
			{
				a = BinBehaviorActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BinBehaviorActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   40   93:aload_0         
	//   41   94:getfield        #104 <Field View e>
	//   42   97:new             #14  <Class BinBehaviorActivity_$3>
	//   43  100:dup             
	//   44  101:aload_0         
	//   45  102:invokespecial   #112 <Method void BinBehaviorActivity_$3(BinBehaviorActivity_)>
	//   46  105:invokevirtual   #115 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   47  108:aload_0         
	//   48  109:invokevirtual   #117 <Method void e()>
	//   49  112:return          
	}

	public void h()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.BinBehaviorActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BinBehaviorActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.BinBehaviorActivity_.a(BinBehaviorActivity_)>
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

			final BinBehaviorActivity_ a;

			
			{
				a = BinBehaviorActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BinBehaviorActivity_ a>
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
	//    0    0:new             #16  <Class BinBehaviorActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #119 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #119 <String "">
	//    6   10:invokespecial   #122 <Method void BinBehaviorActivity_$4(BinBehaviorActivity_, String, long, String)>
	//    7   13:invokestatic    #127 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(h);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c h>
	//    2    4:invokestatic    #131 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #133 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #135 <Method void BinBehaviorActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #131 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b002a);
	//   13   23:aload_0         
	//   14   24:ldc1            #136 <Int 0x7f0b002a>
	//   15   26:invokevirtual   #140 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #141 <Method void BinBehaviorActivity.setContentView(int)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #143 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #146 <Method void BinBehaviorActivity.setContentView(View)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #143 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #149 <Method void BinBehaviorActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c h>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #143 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #153 <Method void BinBehaviorActivity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #42  <Method void i()>
	//    5    9:return          
	}

	private final c h = new c();
}
