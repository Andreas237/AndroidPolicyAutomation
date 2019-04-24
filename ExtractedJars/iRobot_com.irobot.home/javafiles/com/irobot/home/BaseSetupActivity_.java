// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.View;
import com.irobot.home.view.CustomButton;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BaseSetupActivity

public final class BaseSetupActivity_ extends BaseSetupActivity
	implements a, b
{

	public BaseSetupActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void BaseSetupActivity()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void c()>
	//    6   12:putfield        #25  <Field c f>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
	//    2    4:return          
	}

	static void a(BaseSetupActivity_ basesetupactivity_, String s)
	{
		((BaseSetupActivity) (basesetupactivity_)).com.irobot.home.BaseSetupActivity.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void com.irobot.home.BaseSetupActivity.b(String)>
	//    3    5:return          
	}

	static void b(BaseSetupActivity_ basesetupactivity_, String s)
	{
		((BaseSetupActivity) (basesetupactivity_)).com.irobot.home.BaseSetupActivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void com.irobot.home.BaseSetupActivity.a(String)>
	//    3    5:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #42  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(String s)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", s) {

			public void a()
			{
				try
				{
					com.irobot.home.BaseSetupActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field BaseSetupActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BaseSetupActivity_.b(BaseSetupActivity_, String)>
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
			final BaseSetupActivity_ b;

			
			{
				b = BaseSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BaseSetupActivity_ b>
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
	//    0    0:new             #14  <Class BaseSetupActivity_$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #46  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #46  <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #49  <Method void BaseSetupActivity_$3(BaseSetupActivity_, String, long, String, String)>
	//    8   14:invokestatic    #54  <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void a(a a1)
	{
		a = (CustomButton)a1.a(0x7f090208);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #56  <Int 0x7f090208>
	//    3    4:invokeinterface #58  <Method View a.a(int)>
	//    4    9:checkcast       #60  <Class CustomButton>
	//    5   12:putfield        #63  <Field CustomButton a>
		b = a1.a(0x7f09020a);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #64  <Int 0x7f09020a>
	//    9   19:invokeinterface #58  <Method View a.a(int)>
	//   10   24:putfield        #67  <Field View b>
		if(a != null)
	//*  11   27:aload_0         
	//*  12   28:getfield        #63  <Field CustomButton a>
	//*  13   31:ifnull          49
			a.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BaseSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BaseSetupActivity_.f()>
				//    3    7:return          
				}

				final BaseSetupActivity_ a;

			
			{
				a = BaseSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BaseSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   14   34:aload_0         
	//   15   35:getfield        #63  <Field CustomButton a>
	//   16   38:new             #10  <Class BaseSetupActivity_$1>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:invokespecial   #70  <Method void BaseSetupActivity_$1(BaseSetupActivity_)>
	//   20   46:invokevirtual   #74  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   21   49:aload_0         
	//   22   50:invokevirtual   #77  <Method void e()>
	//   23   53:return          
	}

	public void b(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.BaseSetupActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field BaseSetupActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.BaseSetupActivity_.a(BaseSetupActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final BaseSetupActivity_ b;

			
			{
				b = BaseSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BaseSetupActivity_ b>
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
	//    0    0:ldc1            #46  <String "">
	//    1    2:new             #12  <Class BaseSetupActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #79  <Method void BaseSetupActivity_$2(BaseSetupActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #84  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field c f>
	//    2    4:invokestatic    #88  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #90  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #92  <Method void BaseSetupActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #88  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b006a);
	//   13   23:aload_0         
	//   14   24:ldc1            #93  <Int 0x7f0b006a>
	//   15   26:invokevirtual   #97  <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #98  <Method void BaseSetupActivity.setContentView(int)>
		f.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #100 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method void BaseSetupActivity.setContentView(View)>
		f.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #100 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #106 <Method void BaseSetupActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #100 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c f = new c();
}
