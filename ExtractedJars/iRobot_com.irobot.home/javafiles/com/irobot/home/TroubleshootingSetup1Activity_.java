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
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			TroubleshootingSetup1Activity

public final class TroubleshootingSetup1Activity_ extends TroubleshootingSetup1Activity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotSku", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "robotSku">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class TroubleshootingSetup1Activity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
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
				d.startActivityForResult(c, j, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
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

		public a b(int j)
		{
			return (a)super.a("topicsArrayId", j);
		//    0    0:aload_0         
		//    1    1:ldc1            #71  <String "topicsArrayId">
		//    2    3:iload_1         
		//    3    4:invokespecial   #74  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class TroubleshootingSetup1Activity_$a>
		//    5   10:areturn         
		}

		public a c(int j)
		{
			return (a)super.a("answersArrayId", j);
		//    0    0:aload_0         
		//    1    1:ldc1            #76  <String "answersArrayId">
		//    2    3:iload_1         
		//    3    4:invokespecial   #74  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class TroubleshootingSetup1Activity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/TroubleshootingSetup1Activity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class TroubleshootingSetup1Activity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public TroubleshootingSetup1Activity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void TroubleshootingSetup1Activity()>
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
	//    0    0:new             #16  <Class TroubleshootingSetup1Activity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void TroubleshootingSetup1Activity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void i()>
	//    4    8:return          
	}

	static void a(TroubleshootingSetup1Activity_ troubleshootingsetup1activity_)
	{
		((TroubleshootingSetup1Activity) (troubleshootingsetup1activity_)).TroubleshootingSetup1Activity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void TroubleshootingSetup1Activity.g()>
	//    2    4:return          
	}

	static void b(TroubleshootingSetup1Activity_ troubleshootingsetup1activity_)
	{
		((TroubleshootingSetup1Activity) (troubleshootingsetup1activity_)).TroubleshootingSetup1Activity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void TroubleshootingSetup1Activity.h()>
	//    2    4:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method Intent getIntent()>
	//    2    4:invokevirtual   #58  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          69
		{
			if(bundle.containsKey("robotSku"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #60  <String "robotSku">
	//*   8   15:invokevirtual   #66  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("robotSku");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #60  <String "robotSku">
	//   13   25:invokevirtual   #70  <Method String Bundle.getString(String)>
	//   14   28:putfield        #73  <Field String a>
			if(bundle.containsKey("topicsArrayId"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #75  <String "topicsArrayId">
	//*  17   34:invokevirtual   #66  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getInt("topicsArrayId");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #75  <String "topicsArrayId">
	//   22   44:invokevirtual   #79  <Method int Bundle.getInt(String)>
	//   23   47:putfield        #82  <Field int b>
			if(bundle.containsKey("answersArrayId"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #84  <String "answersArrayId">
	//*  26   53:invokevirtual   #66  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				c = bundle.getInt("answersArrayId");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #84  <String "answersArrayId">
	//   31   63:invokevirtual   #79  <Method int Bundle.getInt(String)>
	//   32   66:putfield        #87  <Field int c>
		}
	//   33   69:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #91  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		d = (ListView)a1.a(0x7f090467);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #95  <Int 0x7f090467>
	//    3    4:invokeinterface #97  <Method View a.a(int)>
	//    4    9:checkcast       #99  <Class ListView>
	//    5   12:putfield        #103 <Field ListView d>
		e = a1.a(0x7f090042);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #104 <Int 0x7f090042>
	//    9   19:invokeinterface #97  <Method View a.a(int)>
	//   10   24:putfield        #108 <Field View e>
		if(e != null)
	//*  11   27:aload_0         
	//*  12   28:getfield        #108 <Field View e>
	//*  13   31:ifnull          49
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field TroubleshootingSetup1Activity_ a>
				//    2    4:invokevirtual   #25  <Method void TroubleshootingSetup1Activity_.f()>
				//    3    7:return          
				}

				final TroubleshootingSetup1Activity_ a;

			
			{
				a = TroubleshootingSetup1Activity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field TroubleshootingSetup1Activity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   14   34:aload_0         
	//   15   35:getfield        #108 <Field View e>
	//   16   38:new             #10  <Class TroubleshootingSetup1Activity_$1>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:invokespecial   #110 <Method void TroubleshootingSetup1Activity_$1(TroubleshootingSetup1Activity_)>
	//   20   46:invokevirtual   #116 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   21   49:aload_0         
	//   22   50:invokevirtual   #118 <Method void e()>
	//   23   53:return          
	}

	public void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.TroubleshootingSetup1Activity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field TroubleshootingSetup1Activity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.TroubleshootingSetup1Activity_.a(TroubleshootingSetup1Activity_)>
			//    3    7:return          
			}

			final TroubleshootingSetup1Activity_ a;

			
			{
				a = TroubleshootingSetup1Activity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TroubleshootingSetup1Activity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #120 <String "">
	//    1    2:new             #12  <Class TroubleshootingSetup1Activity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #121 <Method void TroubleshootingSetup1Activity_$2(TroubleshootingSetup1Activity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #126 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void h()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.TroubleshootingSetup1Activity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field TroubleshootingSetup1Activity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.TroubleshootingSetup1Activity_.b(TroubleshootingSetup1Activity_)>
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

			final TroubleshootingSetup1Activity_ a;

			
			{
				a = TroubleshootingSetup1Activity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field TroubleshootingSetup1Activity_ a>
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
	//    0    0:new             #14  <Class TroubleshootingSetup1Activity_$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #120 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #120 <String "">
	//    6   10:invokespecial   #129 <Method void TroubleshootingSetup1Activity_$3(TroubleshootingSetup1Activity_, String, long, String)>
	//    7   13:invokestatic    #134 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c f>
	//    2    4:invokestatic    #138 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #140 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #142 <Method void TroubleshootingSetup1Activity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #138 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0078);
	//   13   23:aload_0         
	//   14   24:ldc1            #143 <Int 0x7f0b0078>
	//   15   26:invokevirtual   #147 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #148 <Method void TroubleshootingSetup1Activity.setContentView(int)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #150 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #153 <Method void TroubleshootingSetup1Activity.setContentView(View)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #150 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #156 <Method void TroubleshootingSetup1Activity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #150 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void TroubleshootingSetup1Activity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void i()>
	//    5    9:return          
	}

	private final c f = new c();
}
