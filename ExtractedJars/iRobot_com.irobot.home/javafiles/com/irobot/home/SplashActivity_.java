// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.irobot.home.util.k;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			SplashActivity, IRobotApplication_

public final class SplashActivity_ extends SplashActivity
	implements a, b
{

	public SplashActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void SplashActivity()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void c()>
	//    6   12:putfield        #27  <Field c g>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		b = new k(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #32  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #35  <Method void k(android.content.Context)>
	//    5    9:putfield        #39  <Field k b>
		a = IRobotApplication_.r();
	//    6   12:aload_0         
	//    7   13:invokestatic    #45  <Method IRobotApplication IRobotApplication_.r()>
	//    8   16:putfield        #48  <Field IRobotApplication a>
		getWindow().setFlags(1024, 1024);
	//    9   19:aload_0         
	//   10   20:invokevirtual   #52  <Method Window getWindow()>
	//   11   23:sipush          1024
	//   12   26:sipush          1024
	//   13   29:invokevirtual   #58  <Method void Window.setFlags(int, int)>
		c.a(((b) (this)));
	//   14   32:aload_0         
	//   15   33:invokestatic    #61  <Method void c.a(b)>
	//   16   36:return          
	}

	static void a(SplashActivity_ splashactivity_)
	{
		((SplashActivity) (splashactivity_)).SplashActivity.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void SplashActivity.e()>
	//    2    4:return          
	}

	static void a(SplashActivity_ splashactivity_, int i, int j, android.content.DialogInterface.OnClickListener onclicklistener, boolean flag)
	{
		((SplashActivity) (splashactivity_)).com.irobot.home.SplashActivity.a(i, j, onclicklistener, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #69  <Method void com.irobot.home.SplashActivity.a(int, int, android.content.DialogInterface$OnClickListener, boolean)>
	//    6    9:return          
	}

	static void a(SplashActivity_ splashactivity_, String s, String s1, boolean flag)
	{
		((SplashActivity) (splashactivity_)).com.irobot.home.SplashActivity.a(s, s1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #73  <Method void com.irobot.home.SplashActivity.a(String, String, boolean)>
	//    5    7:return          
	}

	static void b(SplashActivity_ splashactivity_)
	{
		((SplashActivity) (splashactivity_)).SplashActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void SplashActivity.g()>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #79  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	protected void a(int i, int j, android.content.DialogInterface.OnClickListener onclicklistener, boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(i, j, onclicklistener, flag) {

			public void run()
			{
				com.irobot.home.SplashActivity_.a(e, a, b, c, d);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field SplashActivity_ e>
			//    2    4:aload_0         
			//    3    5:getfield        #25  <Field int a>
			//    4    8:aload_0         
			//    5    9:getfield        #27  <Field int b>
			//    6   12:aload_0         
			//    7   13:getfield        #29  <Field android.content.DialogInterface$OnClickListener c>
			//    8   16:aload_0         
			//    9   17:getfield        #31  <Field boolean d>
			//   10   20:invokestatic    #38  <Method void com.irobot.home.SplashActivity_.a(SplashActivity_, int, int, android.content.DialogInterface$OnClickListener, boolean)>
			//   11   23:return          
			}

			final int a;
			final int b;
			final android.content.DialogInterface.OnClickListener c;
			final boolean d;
			final SplashActivity_ e;

			
			{
				e = SplashActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field SplashActivity_ e>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field int a>
				b = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int b>
				c = onclicklistener;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field android.content.DialogInterface$OnClickListener c>
				d = flag;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #31  <Field boolean d>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #34  <Method void Object()>
			//   17   31:return          
			}
		}
, 0L);
	//    0    0:ldc1            #83  <String "">
	//    1    2:new             #12  <Class SplashActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iload_2         
	//    6    9:aload_3         
	//    7   10:iload           4
	//    8   12:invokespecial   #85  <Method void SplashActivity_$2(SplashActivity_, int, int, android.content.DialogInterface$OnClickListener, boolean)>
	//    9   15:lconst_0        
	//   10   16:invokestatic    #90  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//   11   19:return          
	}

	protected void a(String s, String s1, boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(s, s1, flag) {

			public void run()
			{
				com.irobot.home.SplashActivity_.a(d, a, b, c);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field SplashActivity_ d>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field String a>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field String b>
			//    6   12:aload_0         
			//    7   13:getfield        #27  <Field boolean c>
			//    8   16:invokestatic    #34  <Method void com.irobot.home.SplashActivity_.a(SplashActivity_, String, String, boolean)>
			//    9   19:return          
			}

			final String a;
			final String b;
			final boolean c;
			final SplashActivity_ d;

			
			{
				d = SplashActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field SplashActivity_ d>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String a>
				b = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String b>
				c = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #27  <Field boolean c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
		}
, 0L);
	//    0    0:ldc1            #83  <String "">
	//    1    2:new             #14  <Class SplashActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:iload_3         
	//    7   10:invokespecial   #92  <Method void SplashActivity_$3(SplashActivity_, String, String, boolean)>
	//    8   13:lconst_0        
	//    9   14:invokestatic    #90  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//   10   17:return          
	}

	public void a(a a1)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method void f()>
	//    2    4:return          
	}

	protected void e()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.SplashActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SplashActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.SplashActivity_.a(SplashActivity_)>
			//    3    7:return          
			}

			final SplashActivity_ a;

			
			{
				a = SplashActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SplashActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #83  <String "">
	//    1    2:new             #10  <Class SplashActivity_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #98  <Method void SplashActivity_$1(SplashActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #90  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void g()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.SplashActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SplashActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.SplashActivity_.b(SplashActivity_)>
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

			final SplashActivity_ a;

			
			{
				a = SplashActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SplashActivity_ a>
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
	//    0    0:new             #16  <Class SplashActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #83  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #83  <String "">
	//    6   10:invokespecial   #101 <Method void SplashActivity_$4(SplashActivity_, String, long, String)>
	//    7   13:invokestatic    #106 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field c g>
	//    2    4:invokestatic    #110 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #112 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #114 <Method void SplashActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #110 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0073);
	//   13   23:aload_0         
	//   14   24:ldc1            #115 <Int 0x7f0b0073>
	//   15   26:invokevirtual   #119 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #120 <Method void SplashActivity.setContentView(int)>
		g.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #122 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #125 <Method void SplashActivity.setContentView(View)>
		g.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #122 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #128 <Method void SplashActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		g.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field c g>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #122 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c g = new c();
}
