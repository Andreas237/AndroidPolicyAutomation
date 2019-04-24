// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.irobot.home.model.RobotLanguage;
import com.irobot.home.model.rest.LanguagePack;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BaseRobotLanguageListActivity, IRobotApplication_

public final class BaseRobotLanguageListActivity_ extends BaseRobotLanguageListActivity
	implements a, b
{

	public BaseRobotLanguageListActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void BaseRobotLanguageListActivity()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void c()>
	//    6   12:putfield        #35  <Field c k>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method void c.a(b)>
		c = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #47  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #51  <Field IRobotApplication c>
		i();
	//    5   11:aload_0         
	//    6   12:invokespecial   #54  <Method void i()>
	//    7   15:return          
	}

	static void a(BaseRobotLanguageListActivity_ baserobotlanguagelistactivity_)
	{
		((BaseRobotLanguageListActivity) (baserobotlanguagelistactivity_)).BaseRobotLanguageListActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void BaseRobotLanguageListActivity.g()>
	//    2    4:return          
	}

	static void a(BaseRobotLanguageListActivity_ baserobotlanguagelistactivity_, int j)
	{
		((BaseRobotLanguageListActivity) (baserobotlanguagelistactivity_)).BaseRobotLanguageListActivity.f(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #63  <Method void BaseRobotLanguageListActivity.f(int)>
	//    3    5:return          
	}

	static void a(BaseRobotLanguageListActivity_ baserobotlanguagelistactivity_, RobotLanguage robotlanguage)
	{
		((BaseRobotLanguageListActivity) (baserobotlanguagelistactivity_)).com.irobot.home.BaseRobotLanguageListActivity.a(robotlanguage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void com.irobot.home.BaseRobotLanguageListActivity.a(RobotLanguage)>
	//    3    5:return          
	}

	static void a(BaseRobotLanguageListActivity_ baserobotlanguagelistactivity_, LanguagePack languagepack)
	{
		((BaseRobotLanguageListActivity) (baserobotlanguagelistactivity_)).com.irobot.home.BaseRobotLanguageListActivity.a(languagepack);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #71  <Method void com.irobot.home.BaseRobotLanguageListActivity.a(LanguagePack)>
	//    3    5:return          
	}

	static void a(BaseRobotLanguageListActivity_ baserobotlanguagelistactivity_, boolean flag)
	{
		((BaseRobotLanguageListActivity) (baserobotlanguagelistactivity_)).com.irobot.home.BaseRobotLanguageListActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #75  <Method void com.irobot.home.BaseRobotLanguageListActivity.a(boolean)>
	//    3    5:return          
	}

	static void b(BaseRobotLanguageListActivity_ baserobotlanguagelistactivity_)
	{
		((BaseRobotLanguageListActivity) (baserobotlanguagelistactivity_)).BaseRobotLanguageListActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void BaseRobotLanguageListActivity.f()>
	//    2    4:return          
	}

	static void b(BaseRobotLanguageListActivity_ baserobotlanguagelistactivity_, int j)
	{
		((BaseRobotLanguageListActivity) (baserobotlanguagelistactivity_)).BaseRobotLanguageListActivity.g(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #80  <Method void BaseRobotLanguageListActivity.g(int)>
	//    3    5:return          
	}

	static void c(BaseRobotLanguageListActivity_ baserobotlanguagelistactivity_, int j)
	{
		((BaseRobotLanguageListActivity) (baserobotlanguagelistactivity_)).BaseRobotLanguageListActivity.h(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #83  <Method void BaseRobotLanguageListActivity.h(int)>
	//    3    5:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method Intent getIntent()>
	//    2    4:invokevirtual   #93  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("robotBlid"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #95  <String "robotBlid">
	//*   8   15:invokevirtual   #101 <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				d = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #95  <String "robotBlid">
	//   13   25:invokevirtual   #105 <Method String Bundle.getString(String)>
	//   14   28:putfield        #109 <Field String d>
			if(bundle.containsKey("supportsLanguageOta"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #111 <String "supportsLanguageOta">
	//*  17   34:invokevirtual   #101 <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				e = bundle.getBoolean("supportsLanguageOta");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #111 <String "supportsLanguageOta">
	//   22   44:invokevirtual   #114 <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #118 <Field boolean e>
		}
	//   24   50:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #122 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(RobotLanguage robotlanguage)
	{
		org.androidannotations.api.b.a("", new Runnable(robotlanguage) {

			public void run()
			{
				com.irobot.home.BaseRobotLanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field BaseRobotLanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field RobotLanguage a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.BaseRobotLanguageListActivity_.a(BaseRobotLanguageListActivity_, RobotLanguage)>
			//    5   11:return          
			}

			final RobotLanguage a;
			final BaseRobotLanguageListActivity_ b;

			
			{
				b = BaseRobotLanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BaseRobotLanguageListActivity_ b>
				a = robotlanguage;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field RobotLanguage a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #126 <String "">
	//    1    2:new             #12  <Class BaseRobotLanguageListActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #128 <Method void BaseRobotLanguageListActivity_$2(BaseRobotLanguageListActivity_, RobotLanguage)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #133 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(LanguagePack languagepack)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", languagepack) {

			public void a()
			{
				try
				{
					com.irobot.home.BaseRobotLanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field BaseRobotLanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field LanguagePack a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BaseRobotLanguageListActivity_.a(BaseRobotLanguageListActivity_, LanguagePack)>
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

			final LanguagePack a;
			final BaseRobotLanguageListActivity_ b;

			
			{
				b = BaseRobotLanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BaseRobotLanguageListActivity_ b>
				a = languagepack;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #18  <Field LanguagePack a>
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
	//    0    0:new             #24  <Class BaseRobotLanguageListActivity_$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #126 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #126 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #136 <Method void BaseRobotLanguageListActivity_$8(BaseRobotLanguageListActivity_, String, long, String, LanguagePack)>
	//    8   14:invokestatic    #141 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void a(a a1)
	{
		f = (ListView)a1.a(0x7f0901ff);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #143 <Int 0x7f0901ff>
	//    3    4:invokeinterface #145 <Method View a.a(int)>
	//    4    9:checkcast       #147 <Class ListView>
	//    5   12:putfield        #150 <Field ListView f>
		g = (ProgressBar)a1.a(0x7f090223);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #151 <Int 0x7f090223>
	//    9   19:invokeinterface #145 <Method View a.a(int)>
	//   10   24:checkcast       #153 <Class ProgressBar>
	//   11   27:putfield        #156 <Field ProgressBar g>
		e();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #158 <Method void e()>
	//   14   34:return          
	}

	public void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.BaseRobotLanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field BaseRobotLanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.BaseRobotLanguageListActivity_.a(BaseRobotLanguageListActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final BaseRobotLanguageListActivity_ b;

			
			{
				b = BaseRobotLanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BaseRobotLanguageListActivity_ b>
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
	//    0    0:ldc1            #126 <String "">
	//    1    2:new             #18  <Class BaseRobotLanguageListActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #160 <Method void BaseRobotLanguageListActivity_$5(BaseRobotLanguageListActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #133 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.BaseRobotLanguageListActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BaseRobotLanguageListActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.BaseRobotLanguageListActivity_.b(BaseRobotLanguageListActivity_)>
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

			final BaseRobotLanguageListActivity_ a;

			
			{
				a = BaseRobotLanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BaseRobotLanguageListActivity_ a>
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
	//    0    0:new             #22  <Class BaseRobotLanguageListActivity_$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #126 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #126 <String "">
	//    6   10:invokespecial   #163 <Method void BaseRobotLanguageListActivity_$7(BaseRobotLanguageListActivity_, String, long, String)>
	//    7   13:invokestatic    #141 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void f(int j)
	{
		org.androidannotations.api.b.a("", new Runnable(j) {

			public void run()
			{
				com.irobot.home.BaseRobotLanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BaseRobotLanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BaseRobotLanguageListActivity_.a(BaseRobotLanguageListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final BaseRobotLanguageListActivity_ b;

			
			{
				b = BaseRobotLanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseRobotLanguageListActivity_ b>
				a = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #126 <String "">
	//    1    2:new             #14  <Class BaseRobotLanguageListActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #165 <Method void BaseRobotLanguageListActivity_$3(BaseRobotLanguageListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #133 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BaseRobotLanguageListActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BaseRobotLanguageListActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.BaseRobotLanguageListActivity_.a(BaseRobotLanguageListActivity_)>
			//    3    7:return          
			}

			final BaseRobotLanguageListActivity_ a;

			
			{
				a = BaseRobotLanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseRobotLanguageListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #126 <String "">
	//    1    2:new             #10  <Class BaseRobotLanguageListActivity_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #167 <Method void BaseRobotLanguageListActivity_$1(BaseRobotLanguageListActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #133 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void g(int j)
	{
		org.androidannotations.api.b.a("", new Runnable(j) {

			public void run()
			{
				com.irobot.home.BaseRobotLanguageListActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BaseRobotLanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BaseRobotLanguageListActivity_.b(BaseRobotLanguageListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final BaseRobotLanguageListActivity_ b;

			
			{
				b = BaseRobotLanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseRobotLanguageListActivity_ b>
				a = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #126 <String "">
	//    1    2:new             #16  <Class BaseRobotLanguageListActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #168 <Method void BaseRobotLanguageListActivity_$4(BaseRobotLanguageListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #133 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void h(int j)
	{
		org.androidannotations.api.b.a("", new Runnable(j) {

			public void run()
			{
				com.irobot.home.BaseRobotLanguageListActivity_.c(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BaseRobotLanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #29  <Method void com.irobot.home.BaseRobotLanguageListActivity_.c(BaseRobotLanguageListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final BaseRobotLanguageListActivity_ b;

			
			{
				b = BaseRobotLanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseRobotLanguageListActivity_ b>
				a = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #126 <String "">
	//    1    2:new             #20  <Class BaseRobotLanguageListActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #169 <Method void BaseRobotLanguageListActivity_$6(BaseRobotLanguageListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #133 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(k);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field c k>
	//    2    4:invokestatic    #173 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #175 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #177 <Method void BaseRobotLanguageListActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #173 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0066);
	//   13   23:aload_0         
	//   14   24:ldc1            #178 <Int 0x7f0b0066>
	//   15   26:invokevirtual   #181 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #182 <Method void BaseRobotLanguageListActivity.setContentView(int)>
		k.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #184 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #187 <Method void BaseRobotLanguageListActivity.setContentView(View)>
		k.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #184 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #190 <Method void BaseRobotLanguageListActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		k.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #35  <Field c k>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #184 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #194 <Method void BaseRobotLanguageListActivity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #54  <Method void i()>
	//    5    9:return          
	}

	private final c k = new c();
}
