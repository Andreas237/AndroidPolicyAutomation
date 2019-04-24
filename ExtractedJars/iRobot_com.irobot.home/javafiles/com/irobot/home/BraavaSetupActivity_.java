// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.View;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomVideoView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaSetupActivity

public final class BraavaSetupActivity_ extends BraavaSetupActivity
	implements a, b
{

	public BraavaSetupActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BraavaSetupActivity()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void c()>
	//    6   12:putfield        #27  <Field c g>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void c.a(b)>
	//    2    4:return          
	}

	static void a(BraavaSetupActivity_ braavasetupactivity_, String s)
	{
		((BraavaSetupActivity) (braavasetupactivity_)).com.irobot.home.BraavaSetupActivity.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void com.irobot.home.BraavaSetupActivity.b(String)>
	//    3    5:return          
	}

	static void b(BraavaSetupActivity_ braavasetupactivity_, String s)
	{
		((BraavaSetupActivity) (braavasetupactivity_)).com.irobot.home.BraavaSetupActivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void com.irobot.home.BraavaSetupActivity.a(String)>
	//    3    5:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #44  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(String s)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", s) {

			public void a()
			{
				try
				{
					com.irobot.home.BraavaSetupActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field BraavaSetupActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaSetupActivity_.b(BraavaSetupActivity_, String)>
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
			final BraavaSetupActivity_ b;

			
			{
				b = BraavaSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaSetupActivity_ b>
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
	//    0    0:new             #16  <Class BraavaSetupActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #48  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #48  <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #51  <Method void BraavaSetupActivity_$4(BraavaSetupActivity_, String, long, String, String)>
	//    8   14:invokestatic    #56  <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void a(a a1)
	{
		a = (CustomButton)a1.a(0x7f090208);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #58  <Int 0x7f090208>
	//    3    4:invokeinterface #60  <Method View a.a(int)>
	//    4    9:checkcast       #62  <Class CustomButton>
	//    5   12:putfield        #65  <Field CustomButton a>
		b = a1.a(0x7f09020a);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #66  <Int 0x7f09020a>
	//    9   19:invokeinterface #60  <Method View a.a(int)>
	//   10   24:putfield        #69  <Field View b>
		f = (CustomVideoView)a1.a(0x7f0903ce);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #70  <Int 0x7f0903ce>
	//   14   31:invokeinterface #60  <Method View a.a(int)>
	//   15   36:checkcast       #72  <Class CustomVideoView>
	//   16   39:putfield        #76  <Field CustomVideoView f>
		a1 = ((a) (a1.a(0x7f09003d)));
	//   17   42:aload_1         
	//   18   43:ldc1            #77  <Int 0x7f09003d>
	//   19   45:invokeinterface #60  <Method View a.a(int)>
	//   20   50:astore_1        
		if(a != null)
	//*  21   51:aload_0         
	//*  22   52:getfield        #65  <Field CustomButton a>
	//*  23   55:ifnull          73
			a.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaSetupActivity_.f()>
				//    3    7:return          
				}

				final BraavaSetupActivity_ a;

			
			{
				a = BraavaSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   58:aload_0         
	//   25   59:getfield        #65  <Field CustomButton a>
	//   26   62:new             #10  <Class BraavaSetupActivity_$1>
	//   27   65:dup             
	//   28   66:aload_0         
	//   29   67:invokespecial   #80  <Method void BraavaSetupActivity_$1(BraavaSetupActivity_)>
	//   30   70:invokevirtual   #84  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//*  31   73:aload_1         
	//*  32   74:ifnull          89
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaSetupActivity_.g()>
				//    3    7:return          
				}

				final BraavaSetupActivity_ a;

			
			{
				a = BraavaSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   33   77:aload_1         
	//   34   78:new             #12  <Class BraavaSetupActivity_$2>
	//   35   81:dup             
	//   36   82:aload_0         
	//   37   83:invokespecial   #85  <Method void BraavaSetupActivity_$2(BraavaSetupActivity_)>
	//   38   86:invokevirtual   #88  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   39   89:aload_0         
	//   40   90:invokevirtual   #91  <Method void e()>
	//   41   93:return          
	}

	public void b(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.BraavaSetupActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field BraavaSetupActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.BraavaSetupActivity_.a(BraavaSetupActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final BraavaSetupActivity_ b;

			
			{
				b = BraavaSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BraavaSetupActivity_ b>
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
	//    0    0:ldc1            #48  <String "">
	//    1    2:new             #14  <Class BraavaSetupActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #93  <Method void BraavaSetupActivity_$3(BraavaSetupActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #98  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field c g>
	//    2    4:invokestatic    #102 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #104 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #106 <Method void BraavaSetupActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #102 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b002e);
	//   13   23:aload_0         
	//   14   24:ldc1            #107 <Int 0x7f0b002e>
	//   15   26:invokevirtual   #111 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #112 <Method void BraavaSetupActivity.setContentView(int)>
		g.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #114 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #117 <Method void BraavaSetupActivity.setContentView(View)>
		g.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #114 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #120 <Method void BraavaSetupActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		g.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field c g>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #114 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c g = new c();
}
