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
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity, IRobotApplication_

public final class BroadcastSetupActivity_ extends BroadcastSetupActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("argRobotBlid", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "argRobotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class BroadcastSetupActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("newRobotConfig", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "newRobotConfig">
		//    2    3:iload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class BroadcastSetupActivity_$a>
		//    5   10:areturn         
		}

		public e a(int l)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, l);
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
				d.startActivityForResult(c, l, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, l, a);
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
			super(context, com/irobot/home/BroadcastSetupActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BroadcastSetupActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BroadcastSetupActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void BroadcastSetupActivity()>
	//    2    4:aload_0         
	//    3    5:new             #55  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void c()>
	//    6   12:putfield        #58  <Field c L>
	//    7   15:return          
	}

	private void O()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method Intent getIntent()>
	//    2    4:invokevirtual   #70  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("newRobotConfig"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #72  <String "newRobotConfig">
	//*   8   15:invokevirtual   #78  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				e = bundle.getBoolean("newRobotConfig");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #72  <String "newRobotConfig">
	//   13   25:invokevirtual   #81  <Method boolean Bundle.getBoolean(String)>
	//   14   28:putfield        #85  <Field boolean e>
			if(bundle.containsKey("argRobotBlid"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #87  <String "argRobotBlid">
	//*  17   34:invokevirtual   #78  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				f = bundle.getString("argRobotBlid");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #87  <String "argRobotBlid">
	//   22   44:invokevirtual   #91  <Method String Bundle.getString(String)>
	//   23   47:putfield        #95  <Field String f>
		}
	//   24   50:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #46  <Class BroadcastSetupActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #99  <Method void BroadcastSetupActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #103 <Method void c.a(b)>
		l = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #109 <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #113 <Field IRobotApplication l>
		O();
	//    5   11:aload_0         
	//    6   12:invokespecial   #115 <Method void O()>
	//    7   15:return          
	}

	static void a(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.F();
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void BroadcastSetupActivity.F()>
	//    2    4:return          
	}

	static void a(BroadcastSetupActivity_ broadcastsetupactivity_, com.irobot.home.fragments.CheckRemoteConnectionFragment.a.a a1, boolean flag)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).com.irobot.home.BroadcastSetupActivity.a(a1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #123 <Method void com.irobot.home.BroadcastSetupActivity.a(com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a, boolean)>
	//    4    6:return          
	}

	static void a(BroadcastSetupActivity_ broadcastsetupactivity_, boolean flag)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).com.irobot.home.BroadcastSetupActivity.b(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #128 <Method void com.irobot.home.BroadcastSetupActivity.b(boolean)>
	//    3    5:return          
	}

	static void b(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void BroadcastSetupActivity.g()>
	//    2    4:return          
	}

	static void c(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void BroadcastSetupActivity.h()>
	//    2    4:return          
	}

	static void d(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method void BroadcastSetupActivity.o()>
	//    2    4:return          
	}

	static void e(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method void BroadcastSetupActivity.p()>
	//    2    4:return          
	}

	static void f(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.B();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void BroadcastSetupActivity.B()>
	//    2    4:return          
	}

	static void g(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.C();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method void BroadcastSetupActivity.C()>
	//    2    4:return          
	}

	static void h(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.D();
	//    0    0:aload_0         
	//    1    1:invokespecial   #151 <Method void BroadcastSetupActivity.D()>
	//    2    4:return          
	}

	static void i(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #155 <Method void BroadcastSetupActivity.j()>
	//    2    4:return          
	}

	static void j(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.z();
	//    0    0:aload_0         
	//    1    1:invokespecial   #158 <Method void BroadcastSetupActivity.z()>
	//    2    4:return          
	}

	static void k(BroadcastSetupActivity_ broadcastsetupactivity_)
	{
		((BroadcastSetupActivity) (broadcastsetupactivity_)).BroadcastSetupActivity.A();
	//    0    0:aload_0         
	//    1    1:invokespecial   #162 <Method void BroadcastSetupActivity.A()>
	//    2    4:return          
	}

	protected void A()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					BroadcastSetupActivity_.k(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #25  <Method void BroadcastSetupActivity_.k(BroadcastSetupActivity_)>
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

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BroadcastSetupActivity_ a>
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
	//    0    0:new             #12  <Class BroadcastSetupActivity_$10>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #164 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #164 <String "">
	//    6   10:invokespecial   #167 <Method void BroadcastSetupActivity_$10(BroadcastSetupActivity_, String, long, String)>
	//    7   13:invokestatic    #172 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void B()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				BroadcastSetupActivity_.f(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #24  <Method void BroadcastSetupActivity_.f(BroadcastSetupActivity_)>
			//    3    7:return          
			}

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #34  <Class BroadcastSetupActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #174 <Method void BroadcastSetupActivity_$4(BroadcastSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void C()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				BroadcastSetupActivity_.g(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #24  <Method void BroadcastSetupActivity_.g(BroadcastSetupActivity_)>
			//    3    7:return          
			}

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #36  <Class BroadcastSetupActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #180 <Method void BroadcastSetupActivity_$5(BroadcastSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void D()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				BroadcastSetupActivity_.h(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #24  <Method void BroadcastSetupActivity_.h(BroadcastSetupActivity_)>
			//    3    7:return          
			}

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #38  <Class BroadcastSetupActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #181 <Method void BroadcastSetupActivity_$6(BroadcastSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void F()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BroadcastSetupActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.BroadcastSetupActivity_.a(BroadcastSetupActivity_)>
			//    3    7:return          
			}

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #24  <Class BroadcastSetupActivity_$16>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #182 <Method void BroadcastSetupActivity_$16(BroadcastSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public View a(int l)
	{
		return findViewById(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #186 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(com.irobot.home.fragments.CheckRemoteConnectionFragment.a.a a1, boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(a1, flag) {

			public void run()
			{
				com.irobot.home.BroadcastSetupActivity_.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field BroadcastSetupActivity_ c>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field boolean b>
			//    6   12:invokestatic    #31  <Method void com.irobot.home.BroadcastSetupActivity_.a(BroadcastSetupActivity_, com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a, boolean)>
			//    7   15:return          
			}

			final com.irobot.home.fragments.CheckRemoteConnectionFragment.a.a a;
			final boolean b;
			final BroadcastSetupActivity_ c;

			
			{
				c = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field BroadcastSetupActivity_ c>
				a = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a a>
				b = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field boolean b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #40  <Class BroadcastSetupActivity_$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:invokespecial   #190 <Method void BroadcastSetupActivity_$7(BroadcastSetupActivity_, com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a, boolean)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    9   16:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		i = (ProgressBar)a1.a(0x7f090223);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #192 <Int 0x7f090223>
	//    3    4:invokeinterface #194 <Method View a.a(int)>
	//    4    9:checkcast       #196 <Class ProgressBar>
	//    5   12:putfield        #199 <Field ProgressBar i>
		j = (ProgressBar)a1.a(0x7f0903c0);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #200 <Int 0x7f0903c0>
	//    9   19:invokeinterface #194 <Method View a.a(int)>
	//   10   24:checkcast       #196 <Class ProgressBar>
	//   11   27:putfield        #202 <Field ProgressBar j>
		m = (Button)a1.a(0x7f09011d);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #203 <Int 0x7f09011d>
	//   15   34:invokeinterface #194 <Method View a.a(int)>
	//   16   39:checkcast       #205 <Class Button>
	//   17   42:putfield        #209 <Field Button m>
		n = (CheckBox)a1.a(0x7f0902ae);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #210 <Int 0x7f0902ae>
	//   21   49:invokeinterface #194 <Method View a.a(int)>
	//   22   54:checkcast       #212 <Class CheckBox>
	//   23   57:putfield        #216 <Field CheckBox n>
		o = a1.a(0x7f0902af);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #217 <Int 0x7f0902af>
	//   27   64:invokeinterface #194 <Method View a.a(int)>
	//   28   69:putfield        #220 <Field View o>
		t = (TextView)a1.a(0x7f0902ab);
	//   29   72:aload_0         
	//   30   73:aload_1         
	//   31   74:ldc1            #221 <Int 0x7f0902ab>
	//   32   76:invokeinterface #194 <Method View a.a(int)>
	//   33   81:checkcast       #223 <Class TextView>
	//   34   84:putfield        #227 <Field TextView t>
		u = a1.a(0x7f09011e);
	//   35   87:aload_0         
	//   36   88:aload_1         
	//   37   89:ldc1            #228 <Int 0x7f09011e>
	//   38   91:invokeinterface #194 <Method View a.a(int)>
	//   39   96:putfield        #231 <Field View u>
		v = (NestedScrollView)a1.a(0x7f0903ae);
	//   40   99:aload_0         
	//   41  100:aload_1         
	//   42  101:ldc1            #232 <Int 0x7f0903ae>
	//   43  103:invokeinterface #194 <Method View a.a(int)>
	//   44  108:checkcast       #234 <Class NestedScrollView>
	//   45  111:putfield        #238 <Field NestedScrollView v>
		a = (ImageButton)a1.a(0x7f0901b0);
	//   46  114:aload_0         
	//   47  115:aload_1         
	//   48  116:ldc1            #239 <Int 0x7f0901b0>
	//   49  118:invokeinterface #194 <Method View a.a(int)>
	//   50  123:checkcast       #241 <Class ImageButton>
	//   51  126:putfield        #244 <Field ImageButton a>
		b = (ImageButton)a1.a(0x7f0901ae);
	//   52  129:aload_0         
	//   53  130:aload_1         
	//   54  131:ldc1            #245 <Int 0x7f0901ae>
	//   55  133:invokeinterface #194 <Method View a.a(int)>
	//   56  138:checkcast       #241 <Class ImageButton>
	//   57  141:putfield        #247 <Field ImageButton b>
		c = (TextView)a1.a(0x7f09021c);
	//   58  144:aload_0         
	//   59  145:aload_1         
	//   60  146:ldc1            #248 <Int 0x7f09021c>
	//   61  148:invokeinterface #194 <Method View a.a(int)>
	//   62  153:checkcast       #223 <Class TextView>
	//   63  156:putfield        #250 <Field TextView c>
		d = (LinearLayout)a1.a(0x7f0901ad);
	//   64  159:aload_0         
	//   65  160:aload_1         
	//   66  161:ldc1            #251 <Int 0x7f0901ad>
	//   67  163:invokeinterface #194 <Method View a.a(int)>
	//   68  168:checkcast       #253 <Class LinearLayout>
	//   69  171:putfield        #256 <Field LinearLayout d>
		if(m != null)
	//*  70  174:aload_0         
	//*  71  175:getfield        #209 <Field Button m>
	//*  72  178:ifnull          196
			m.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.n();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BroadcastSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BroadcastSetupActivity_.n()>
				//    3    7:return          
				}

				final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   73  181:aload_0         
	//   74  182:getfield        #209 <Field Button m>
	//   75  185:new             #10  <Class BroadcastSetupActivity_$1>
	//   76  188:dup             
	//   77  189:aload_0         
	//   78  190:invokespecial   #257 <Method void BroadcastSetupActivity_$1(BroadcastSetupActivity_)>
	//   79  193:invokevirtual   #261 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(t != null)
	//*  80  196:aload_0         
	//*  81  197:getfield        #227 <Field TextView t>
	//*  82  200:ifnull          218
			t.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.J();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BroadcastSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BroadcastSetupActivity_.J()>
				//    3    7:return          
				}

				final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   83  203:aload_0         
	//   84  204:getfield        #227 <Field TextView t>
	//   85  207:new             #14  <Class BroadcastSetupActivity_$11>
	//   86  210:dup             
	//   87  211:aload_0         
	//   88  212:invokespecial   #262 <Method void BroadcastSetupActivity_$11(BroadcastSetupActivity_)>
	//   89  215:invokevirtual   #263 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(o != null)
	//*  90  218:aload_0         
	//*  91  219:getfield        #220 <Field View o>
	//*  92  222:ifnull          240
			o.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.K();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BroadcastSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BroadcastSetupActivity_.K()>
				//    3    7:return          
				}

				final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   93  225:aload_0         
	//   94  226:getfield        #220 <Field View o>
	//   95  229:new             #16  <Class BroadcastSetupActivity_$12>
	//   96  232:dup             
	//   97  233:aload_0         
	//   98  234:invokespecial   #264 <Method void BroadcastSetupActivity_$12(BroadcastSetupActivity_)>
	//   99  237:invokevirtual   #267 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(a != null)
	//* 100  240:aload_0         
	//* 101  241:getfield        #244 <Field ImageButton a>
	//* 102  244:ifnull          262
			a.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.t();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BroadcastSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BroadcastSetupActivity_.t()>
				//    3    7:return          
				}

				final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  103  247:aload_0         
	//  104  248:getfield        #244 <Field ImageButton a>
	//  105  251:new             #18  <Class BroadcastSetupActivity_$13>
	//  106  254:dup             
	//  107  255:aload_0         
	//  108  256:invokespecial   #268 <Method void BroadcastSetupActivity_$13(BroadcastSetupActivity_)>
	//  109  259:invokevirtual   #269 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(b != null)
	//* 110  262:aload_0         
	//* 111  263:getfield        #247 <Field ImageButton b>
	//* 112  266:ifnull          284
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.y();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BroadcastSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BroadcastSetupActivity_.y()>
				//    3    7:return          
				}

				final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  113  269:aload_0         
	//  114  270:getfield        #247 <Field ImageButton b>
	//  115  273:new             #20  <Class BroadcastSetupActivity_$14>
	//  116  276:dup             
	//  117  277:aload_0         
	//  118  278:invokespecial   #270 <Method void BroadcastSetupActivity_$14(BroadcastSetupActivity_)>
	//  119  281:invokevirtual   #269 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//  120  284:aload_0         
	//  121  285:invokevirtual   #272 <Method void e()>
	//  122  288:return          
	}

	public void b(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.BroadcastSetupActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field BroadcastSetupActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.BroadcastSetupActivity_.a(BroadcastSetupActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final BroadcastSetupActivity_ b;

			
			{
				b = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BroadcastSetupActivity_ b>
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
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #22  <Class BroadcastSetupActivity_$15>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #274 <Method void BroadcastSetupActivity_$15(BroadcastSetupActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BroadcastSetupActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.BroadcastSetupActivity_.b(BroadcastSetupActivity_)>
			//    3    7:return          
			}

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #26  <Class BroadcastSetupActivity_$17>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #275 <Method void BroadcastSetupActivity_$17(BroadcastSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void h()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BroadcastSetupActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.BroadcastSetupActivity_.c(BroadcastSetupActivity_)>
			//    3    7:return          
			}

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #28  <Class BroadcastSetupActivity_$18>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #276 <Method void BroadcastSetupActivity_$18(BroadcastSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void j()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					BroadcastSetupActivity_.i(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #25  <Method void BroadcastSetupActivity_.i(BroadcastSetupActivity_)>
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

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BroadcastSetupActivity_ a>
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
	//    0    0:new             #42  <Class BroadcastSetupActivity_$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #164 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #164 <String "">
	//    6   10:invokespecial   #277 <Method void BroadcastSetupActivity_$8(BroadcastSetupActivity_, String, long, String)>
	//    7   13:invokestatic    #172 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void o()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				BroadcastSetupActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #24  <Method void BroadcastSetupActivity_.d(BroadcastSetupActivity_)>
			//    3    7:return          
			}

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #30  <Class BroadcastSetupActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #278 <Method void BroadcastSetupActivity_$2(BroadcastSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(L);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field c L>
	//    2    4:invokestatic    #282 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #284 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #286 <Method void BroadcastSetupActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #282 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0080);
	//   13   23:aload_0         
	//   14   24:ldc2            #287 <Int 0x7f0b0080>
	//   15   27:invokevirtual   #291 <Method void setContentView(int)>
	//   16   30:return          
	}

	public void p()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BroadcastSetupActivity_.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.BroadcastSetupActivity_.e(BroadcastSetupActivity_)>
			//    3    7:return          
			}

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #32  <Class BroadcastSetupActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #292 <Method void BroadcastSetupActivity_$3(BroadcastSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void setContentView(int l)
	{
		super.setContentView(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #293 <Method void BroadcastSetupActivity.setContentView(int)>
		L.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field c L>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #295 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #298 <Method void BroadcastSetupActivity.setContentView(View)>
		L.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field c L>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #295 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #301 <Method void BroadcastSetupActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		L.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field c L>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #295 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #305 <Method void BroadcastSetupActivity.setIntent(Intent)>
		O();
	//    3    5:aload_0         
	//    4    6:invokespecial   #115 <Method void O()>
	//    5    9:return          
	}

	protected void z()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					BroadcastSetupActivity_.j(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BroadcastSetupActivity_ a>
			//    2    4:invokestatic    #25  <Method void BroadcastSetupActivity_.j(BroadcastSetupActivity_)>
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

			final BroadcastSetupActivity_ a;

			
			{
				a = BroadcastSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BroadcastSetupActivity_ a>
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
	//    0    0:new             #44  <Class BroadcastSetupActivity_$9>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #164 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #164 <String "">
	//    6   10:invokespecial   #306 <Method void BroadcastSetupActivity_$9(BroadcastSetupActivity_, String, long, String)>
	//    7   13:invokestatic    #172 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	private final c L = new c();
}
