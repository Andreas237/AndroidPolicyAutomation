// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.irobot.core.AccountLoggedOutEvent;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BaseCleanActivity, IRobotApplication_

public final class BaseCleanActivity_ extends BaseCleanActivity
	implements a, b
{

	public BaseCleanActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void BaseCleanActivity()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void c()>
	//    6   12:putfield        #31  <Field c t>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #43  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #46  <Field IRobotApplication a>
	//    5   11:return          
	}

	static void a(BaseCleanActivity_ basecleanactivity_)
	{
		((BaseCleanActivity) (basecleanactivity_)).BaseCleanActivity.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void BaseCleanActivity.q()>
	//    2    4:return          
	}

	static void a(BaseCleanActivity_ basecleanactivity_, AccountLoggedOutEvent accountloggedoutevent)
	{
		((BaseCleanActivity) (basecleanactivity_)).BaseCleanActivity.onAccountLoggedOutEvent(accountloggedoutevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void BaseCleanActivity.onAccountLoggedOutEvent(AccountLoggedOutEvent)>
	//    3    5:return          
	}

	static void b(BaseCleanActivity_ basecleanactivity_)
	{
		((BaseCleanActivity) (basecleanactivity_)).BaseCleanActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void BaseCleanActivity.f()>
	//    2    4:return          
	}

	static void c(BaseCleanActivity_ basecleanactivity_)
	{
		((BaseCleanActivity) (basecleanactivity_)).BaseCleanActivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void BaseCleanActivity.p()>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #67  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(a a1)
	{
		c = a1.a(0x7f09015e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #71  <Int 0x7f09015e>
	//    3    4:invokeinterface #73  <Method View a.a(int)>
	//    4    9:putfield        #76  <Field View c>
		d = (ImageView)a1.a(0x7f09024f);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:ldc1            #77  <Int 0x7f09024f>
	//    8   16:invokeinterface #73  <Method View a.a(int)>
	//    9   21:checkcast       #79  <Class ImageView>
	//   10   24:putfield        #83  <Field ImageView d>
		e = (RelativeLayout)a1.a(0x7f090291);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #84  <Int 0x7f090291>
	//   14   31:invokeinterface #73  <Method View a.a(int)>
	//   15   36:checkcast       #86  <Class RelativeLayout>
	//   16   39:putfield        #90  <Field RelativeLayout e>
		f = (ImageView)a1.a(0x7f090290);
	//   17   42:aload_0         
	//   18   43:aload_1         
	//   19   44:ldc1            #91  <Int 0x7f090290>
	//   20   46:invokeinterface #73  <Method View a.a(int)>
	//   21   51:checkcast       #79  <Class ImageView>
	//   22   54:putfield        #93  <Field ImageView f>
		g = (LinearLayout)a1.a(0x7f0901b1);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #94  <Int 0x7f0901b1>
	//   26   61:invokeinterface #73  <Method View a.a(int)>
	//   27   66:checkcast       #96  <Class LinearLayout>
	//   28   69:putfield        #100 <Field LinearLayout g>
		if(d != null)
	//*  29   72:aload_0         
	//*  30   73:getfield        #83  <Field ImageView d>
	//*  31   76:ifnull          94
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BaseCleanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BaseCleanActivity_.j()>
				//    3    7:return          
				}

				final BaseCleanActivity_ a;

			
			{
				a = BaseCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BaseCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   32   79:aload_0         
	//   33   80:getfield        #83  <Field ImageView d>
	//   34   83:new             #10  <Class BaseCleanActivity_$1>
	//   35   86:dup             
	//   36   87:aload_0         
	//   37   88:invokespecial   #102 <Method void BaseCleanActivity_$1(BaseCleanActivity_)>
	//   38   91:invokevirtual   #106 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  39   94:aload_0         
	//*  40   95:getfield        #90  <Field RelativeLayout e>
	//*  41   98:ifnull          116
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BaseCleanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BaseCleanActivity_.k()>
				//    3    7:return          
				}

				final BaseCleanActivity_ a;

			
			{
				a = BaseCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BaseCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   42  101:aload_0         
	//   43  102:getfield        #90  <Field RelativeLayout e>
	//   44  105:new             #12  <Class BaseCleanActivity_$2>
	//   45  108:dup             
	//   46  109:aload_0         
	//   47  110:invokespecial   #107 <Method void BaseCleanActivity_$2(BaseCleanActivity_)>
	//   48  113:invokevirtual   #108 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   49  116:aload_0         
	//   50  117:invokevirtual   #110 <Method void e()>
	//   51  120:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.BaseCleanActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BaseCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.BaseCleanActivity_.b(BaseCleanActivity_)>
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

			final BaseCleanActivity_ a;

			
			{
				a = BaseCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BaseCleanActivity_ a>
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
	//    0    0:new             #18  <Class BaseCleanActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #112 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #112 <String "">
	//    6   10:invokespecial   #115 <Method void BaseCleanActivity_$5(BaseCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #120 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onAccountLoggedOutEvent(AccountLoggedOutEvent accountloggedoutevent)
	{
		org.androidannotations.api.b.a("", new Runnable(accountloggedoutevent) {

			public void run()
			{
				com.irobot.home.BaseCleanActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BaseCleanActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AccountLoggedOutEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BaseCleanActivity_.a(BaseCleanActivity_, AccountLoggedOutEvent)>
			//    5   11:return          
			}

			final AccountLoggedOutEvent a;
			final BaseCleanActivity_ b;

			
			{
				b = BaseCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseCleanActivity_ b>
				a = accountloggedoutevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AccountLoggedOutEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #112 <String "">
	//    1    2:new             #14  <Class BaseCleanActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #123 <Method void BaseCleanActivity_$3(BaseCleanActivity_, AccountLoggedOutEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #128 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(t);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field c t>
	//    2    4:invokestatic    #133 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #135 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #137 <Method void BaseCleanActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #133 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0067);
	//   13   23:aload_0         
	//   14   24:ldc1            #138 <Int 0x7f0b0067>
	//   15   26:invokevirtual   #142 <Method void setContentView(int)>
	//   16   29:return          
	}

	protected void p()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.BaseCleanActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BaseCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.BaseCleanActivity_.c(BaseCleanActivity_)>
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

			final BaseCleanActivity_ a;

			
			{
				a = BaseCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BaseCleanActivity_ a>
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
	//    0    0:new             #20  <Class BaseCleanActivity_$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #112 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #112 <String "">
	//    6   10:invokespecial   #143 <Method void BaseCleanActivity_$6(BaseCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #120 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void q()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BaseCleanActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BaseCleanActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.BaseCleanActivity_.a(BaseCleanActivity_)>
			//    3    7:return          
			}

			final BaseCleanActivity_ a;

			
			{
				a = BaseCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #112 <String "">
	//    1    2:new             #16  <Class BaseCleanActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #144 <Method void BaseCleanActivity_$4(BaseCleanActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #128 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #145 <Method void BaseCleanActivity.setContentView(int)>
		t.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field c t>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #147 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method void BaseCleanActivity.setContentView(View)>
		t.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field c t>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #147 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #153 <Method void BaseCleanActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		t.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field c t>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #147 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c t = new c();
}
