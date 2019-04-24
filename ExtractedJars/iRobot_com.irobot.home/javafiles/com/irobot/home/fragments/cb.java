// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.irobot.home.IRobotApplication_;
import com.irobot.home.model.WifiConfig;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ca

public final class cb extends ca
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public ca a()
		{
			cb cb1 = new cb();
		//    0    0:new             #7   <Class cb>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void cb()>
		//    3    7:astore_1        
			cb1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void cb.setArguments(Bundle)>
			return ((ca) (cb1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(WifiInfo wifiinfo)
		{
			a.putParcelable("wifiInfo", ((android.os.Parcelable) (wifiinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "wifiInfo">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(WifiConfig wificonfig)
		{
			a.putParcelable("wifiSettings", ((android.os.Parcelable) (wificonfig)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "wifiSettings">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(String s)
		{
			a.putString("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #37  <String "robotBlid">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #41  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(boolean flag)
		{
			a.putBoolean("isUpdatingCurrentRobot", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #44  <String "isUpdatingCurrentRobot">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #48  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public cb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void ca()>
	//    2    4:aload_0         
	//    3    5:new             #43  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #44  <Method void c()>
	//    6   12:putfield        #46  <Field c j>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #51  <Method void c.a(b)>
		j();
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void j()>
		a = IRobotApplication_.r();
	//    4    8:aload_0         
	//    5    9:invokestatic    #59  <Method com.irobot.home.IRobotApplication IRobotApplication_.r()>
	//    6   12:putfield        #62  <Field com.irobot.home.IRobotApplication a>
	//    7   15:return          
	}

	static void a(cb cb1)
	{
		((ca) (cb1)).ca.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void ca.e()>
	//    2    4:return          
	}

	static void a(cb cb1, int l)
	{
		((ca) (cb1)).com.irobot.home.fragments.ca.b(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #71  <Method void com.irobot.home.fragments.ca.b(int)>
	//    3    5:return          
	}

	static void a(cb cb1, ca.a.a a1)
	{
		((ca) (cb1)).com.irobot.home.fragments.ca.a(a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #75  <Method void com.irobot.home.fragments.ca.a(ca$a$a)>
	//    3    5:return          
	}

	static void a(cb cb1, String s)
	{
		((ca) (cb1)).com.irobot.home.fragments.ca.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void com.irobot.home.fragments.ca.a(String)>
	//    3    5:return          
	}

	static void a(cb cb1, String s, ca.a.a a1)
	{
		((ca) (cb1)).com.irobot.home.fragments.ca.a(s, a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #83  <Method void com.irobot.home.fragments.ca.a(String, ca$a$a)>
	//    4    6:return          
	}

	static void b(cb cb1)
	{
		((ca) (cb1)).ca.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void ca.h()>
	//    2    4:return          
	}

	static void c(cb cb1)
	{
		((ca) (cb1)).com.irobot.home.fragments.ca.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void com.irobot.home.fragments.ca.b()>
	//    2    4:return          
	}

	static void d(cb cb1)
	{
		((ca) (cb1)).com.irobot.home.fragments.ca.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void com.irobot.home.fragments.ca.c()>
	//    2    4:return          
	}

	static void e(cb cb1)
	{
		((ca) (cb1)).ca.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void ca.d()>
	//    2    4:return          
	}

	static void f(cb cb1)
	{
		((ca) (cb1)).ca.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void ca.f()>
	//    2    4:return          
	}

	static void g(cb cb1)
	{
		((ca) (cb1)).ca.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void ca.g()>
	//    2    4:return          
	}

	public static a i()
	{
		return new a();
	//    0    0:new             #32  <Class cb$a>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void cb$a()>
	//    3    7:areturn         
	}

	private void j()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          110
		{
			if(bundle.containsKey("wifiSettings"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #109 <String "wifiSettings">
	//*   7   12:invokevirtual   #115 <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            31
				b = (WifiConfig)bundle.getParcelable("wifiSettings");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #109 <String "wifiSettings">
	//   12   22:invokevirtual   #119 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   13   25:checkcast       #121 <Class WifiConfig>
	//   14   28:putfield        #124 <Field WifiConfig b>
			if(bundle.containsKey("robotBlid"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #126 <String "robotBlid">
	//*  17   34:invokevirtual   #115 <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				c = bundle.getString("robotBlid");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #126 <String "robotBlid">
	//   22   44:invokevirtual   #130 <Method String Bundle.getString(String)>
	//   23   47:putfield        #133 <Field String c>
			if(bundle.containsKey("isUpdatingCurrentRobot"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #135 <String "isUpdatingCurrentRobot">
	//*  26   53:invokevirtual   #115 <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				d = bundle.getBoolean("isUpdatingCurrentRobot");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #135 <String "isUpdatingCurrentRobot">
	//   31   63:invokevirtual   #138 <Method boolean Bundle.getBoolean(String)>
	//   32   66:putfield        #141 <Field boolean d>
			if(bundle.containsKey("currentRobotIpAddress"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #143 <String "currentRobotIpAddress">
	//*  35   72:invokevirtual   #115 <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				e = bundle.getString("currentRobotIpAddress");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #143 <String "currentRobotIpAddress">
	//   40   82:invokevirtual   #130 <Method String Bundle.getString(String)>
	//   41   85:putfield        #145 <Field String e>
			if(bundle.containsKey("wifiInfo"))
	//*  42   88:aload_1         
	//*  43   89:ldc1            #147 <String "wifiInfo">
	//*  44   91:invokevirtual   #115 <Method boolean Bundle.containsKey(String)>
	//*  45   94:ifeq            110
				f = (WifiInfo)bundle.getParcelable("wifiInfo");
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:ldc1            #147 <String "wifiInfo">
	//   49  101:invokevirtual   #119 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   50  104:checkcast       #149 <Class WifiInfo>
	//   51  107:putfield        #152 <Field WifiInfo f>
		}
	//   52  110:return          
	}

	public View a(int l)
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field View k>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return k.findViewById(l);
	//    5    9:aload_0         
	//    6   10:getfield        #155 <Field View k>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #160 <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	void a(ca.a.a a1)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", a1) {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.cb.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field cb b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field ca$a$a a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.cb.a(cb, ca$a$a)>
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

			final ca.a.a a;
			final cb b;

			
			{
				b = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field cb b>
				a = a1;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #18  <Field ca$a$a a>
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
	//    0    0:new             #14  <Class cb$11>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #164 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #164 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #167 <Method void cb$11(cb, String, long, String, ca$a$a)>
	//    8   14:invokestatic    #172 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	void a(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.fragments.cb.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field cb b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.cb.a(cb, String)>
			//    5   11:return          
			}

			final String a;
			final cb b;

			
			{
				b = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field cb b>
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
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #20  <Class cb$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #174 <Method void cb$4(cb, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	void a(String s, ca.a.a a1)
	{
		org.androidannotations.api.b.a("", new Runnable(s, a1) {

			public void run()
			{
				com.irobot.home.fragments.cb.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field cb c>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field String a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field ca$a$a b>
			//    6   12:invokestatic    #31  <Method void com.irobot.home.fragments.cb.a(cb, String, ca$a$a)>
			//    7   15:return          
			}

			final String a;
			final ca.a.a b;
			final cb c;

			
			{
				c = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field cb c>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String a>
				b = a1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field ca$a$a b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #10  <Class cb$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokespecial   #181 <Method void cb$1(cb, String, ca$a$a)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    9   16:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		g = (TextView)a1.a(0x7f09047c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #183 <Int 0x7f09047c>
	//    3    4:invokeinterface #185 <Method View a.a(int)>
	//    4    9:checkcast       #187 <Class TextView>
	//    5   12:putfield        #190 <Field TextView g>
		h = (ProgressBar)a1.a(0x7f09047a);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #191 <Int 0x7f09047a>
	//    9   19:invokeinterface #185 <Method View a.a(int)>
	//   10   24:checkcast       #193 <Class ProgressBar>
	//   11   27:putfield        #196 <Field ProgressBar h>
		a();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #198 <Method void a()>
	//   14   34:return          
	}

	void b()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.cb.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field cb a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.fragments.cb.c(cb)>
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

			final cb a;

			
			{
				a = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field cb a>
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
	//    0    0:new             #28  <Class cb$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #164 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #164 <String "">
	//    6   10:invokespecial   #201 <Method void cb$8(cb, String, long, String)>
	//    7   13:invokestatic    #172 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void b(int l)
	{
		org.androidannotations.api.b.a("", new Runnable(l) {

			public void run()
			{
				com.irobot.home.fragments.cb.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field cb b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field int a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.cb.a(cb, int)>
			//    5   11:return          
			}

			final int a;
			final cb b;

			
			{
				b = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field cb b>
				a = l;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #22  <Class cb$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #203 <Method void cb$5(cb, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void c()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					cb.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field cb a>
			//    2    4:invokestatic    #25  <Method void cb.d(cb)>
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

			final cb a;

			
			{
				a = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field cb a>
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
	//    0    0:new             #30  <Class cb$9>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #164 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #164 <String "">
	//    6   10:invokespecial   #204 <Method void cb$9(cb, String, long, String)>
	//    7   13:invokestatic    #172 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void d()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					cb.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field cb a>
			//    2    4:invokestatic    #25  <Method void cb.e(cb)>
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

			final cb a;

			
			{
				a = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field cb a>
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
	//    0    0:new             #12  <Class cb$10>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #164 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #164 <String "">
	//    6   10:invokespecial   #205 <Method void cb$10(cb, String, long, String)>
	//    7   13:invokestatic    #172 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void e()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.cb.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field cb a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.cb.a(cb)>
			//    3    7:return          
			}

			final cb a;

			
			{
				a = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field cb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #24  <Class cb$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #207 <Method void cb$6(cb)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					cb.f(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field cb a>
			//    2    4:invokestatic    #24  <Method void cb.f(cb)>
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

			final cb a;

			
			{
				a = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field cb a>
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
	//    0    0:new             #16  <Class cb$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #164 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #164 <String "">
	//    6   10:invokespecial   #208 <Method void cb$2(cb, String, long, String)>
	//    7   13:invokestatic    #172 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void g()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("waitForInstall", 0L, "") {

			public void a()
			{
				try
				{
					cb.g(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field cb a>
			//    2    4:invokestatic    #24  <Method void cb.g(cb)>
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

			final cb a;

			
			{
				a = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field cb a>
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
	//    0    0:new             #18  <Class cb$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #210 <String "waitForInstall">
	//    4    7:lconst_0        
	//    5    8:ldc1            #164 <String "">
	//    6   10:invokespecial   #211 <Method void cb$3(cb, String, long, String)>
	//    7   13:invokestatic    #172 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void h()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.cb.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field cb a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.cb.b(cb)>
			//    3    7:return          
			}

			final cb a;

			
			{
				a = cb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field cb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #164 <String "">
	//    1    2:new             #26  <Class cb$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #212 <Method void cb$7(cb)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(j);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field c j>
	//    2    4:invokestatic    #216 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #218 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #220 <Method void ca.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #216 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		k = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #224 <Method View ca.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #155 <Field View k>
		if(k == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #155 <Field View k>
	//*   9   15:ifnonnull       30
			k = layoutinflater.inflate(0x7f0b00da, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #225 <Int 0x7f0b00da>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #231 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #155 <Field View k>
		return k;
	//   17   30:aload_0         
	//   18   31:getfield        #155 <Field View k>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #234 <Method void ca.onDestroyView()>
		k = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #155 <Field View k>
		g = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #190 <Field TextView g>
		h = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #196 <Field ProgressBar h>
	//   11   19:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #238 <Method void ca.onViewCreated(View, Bundle)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field c j>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #240 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c j = new c();
	private View k;
}
