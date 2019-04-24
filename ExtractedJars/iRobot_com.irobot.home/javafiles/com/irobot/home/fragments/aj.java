// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.irobot.home.IRobotApplication_;
import com.irobot.home.util.k;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ai

public final class aj extends ai
	implements a, b
{

	public aj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void ai()>
	//    2    4:aload_0         
	//    3    5:new             #34  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void c()>
	//    6   12:putfield        #37  <Field c r>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		b = new k(((android.content.Context) (getActivity())));
	//    0    0:aload_0         
	//    1    1:new             #42  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #46  <Method android.app.Activity getActivity()>
	//    5    9:invokespecial   #49  <Method void k(android.content.Context)>
	//    6   12:putfield        #53  <Field k b>
		org.androidannotations.api.c.c.a(((b) (this)));
	//    7   15:aload_0         
	//    8   16:invokestatic    #56  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    9   19:aload_0         
	//   10   20:invokestatic    #61  <Method com.irobot.home.IRobotApplication IRobotApplication_.r()>
	//   11   23:putfield        #64  <Field com.irobot.home.IRobotApplication a>
	//   12   26:return          
	}

	static void a(aj aj1)
	{
		((ai) (aj1)).ai.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void ai.g()>
	//    2    4:return          
	}

	static void a(aj aj1, String s1, boolean flag, int i)
	{
		((ai) (aj1)).com.irobot.home.fragments.ai.a(s1, flag, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #72  <Method void com.irobot.home.fragments.ai.a(String, boolean, int)>
	//    5    7:return          
	}

	static void b(aj aj1)
	{
		((ai) (aj1)).ai.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void ai.h()>
	//    2    4:return          
	}

	static void c(aj aj1)
	{
		((ai) (aj1)).ai.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void ai.f()>
	//    2    4:return          
	}

	public View a(int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field View s>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return s.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field View s>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #87  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	void a(String s1, boolean flag, int i)
	{
		org.androidannotations.api.b.a("", new Runnable(s1, flag, i) {

			public void run()
			{
				com.irobot.home.fragments.aj.a(d, a, b, c);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field aj d>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field String a>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field boolean b>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field int c>
			//    8   16:invokestatic    #35  <Method void com.irobot.home.fragments.aj.a(aj, String, boolean, int)>
			//    9   19:return          
			}

			final String a;
			final boolean b;
			final int c;
			final aj d;

			
			{
				d = aj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field aj d>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String a>
				b = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field boolean b>
				c = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #28  <Field int c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
, 0L);
	//    0    0:ldc1            #91  <String "">
	//    1    2:new             #18  <Class aj$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:invokespecial   #93  <Method void aj$5(aj, String, boolean, int)>
	//    8   13:lconst_0        
	//    9   14:invokestatic    #98  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//   10   17:return          
	}

	public void a(a a1)
	{
		d = (Button)a1.a(0x7f090016);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #100 <Int 0x7f090016>
	//    3    4:invokeinterface #102 <Method View a.a(int)>
	//    4    9:checkcast       #104 <Class Button>
	//    5   12:putfield        #108 <Field Button d>
		k = (FrameLayout)a1.a(0x7f09042f);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #109 <Int 0x7f09042f>
	//    9   19:invokeinterface #102 <Method View a.a(int)>
	//   10   24:checkcast       #111 <Class FrameLayout>
	//   11   27:putfield        #115 <Field FrameLayout k>
		l = (FrameLayout)a1.a(0x7f09017b);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #116 <Int 0x7f09017b>
	//   15   34:invokeinterface #102 <Method View a.a(int)>
	//   16   39:checkcast       #111 <Class FrameLayout>
	//   17   42:putfield        #119 <Field FrameLayout l>
		n = (FrameLayout)a1.a(0x7f090304);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #120 <Int 0x7f090304>
	//   21   49:invokeinterface #102 <Method View a.a(int)>
	//   22   54:checkcast       #111 <Class FrameLayout>
	//   23   57:putfield        #123 <Field FrameLayout n>
		if(d != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #108 <Field Button d>
	//*  26   64:ifnull          82
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field aj a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.aj.b()>
				//    3    7:return          
				}

				final aj a;

			
			{
				a = aj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field aj a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   27   67:aload_0         
	//   28   68:getfield        #108 <Field Button d>
	//   29   71:new             #10  <Class aj$1>
	//   30   74:dup             
	//   31   75:aload_0         
	//   32   76:invokespecial   #125 <Method void aj$1(aj)>
	//   33   79:invokevirtual   #129 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(k != null)
	//*  34   82:aload_0         
	//*  35   83:getfield        #115 <Field FrameLayout k>
	//*  36   86:ifnull          104
			k.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.c();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field aj a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.aj.c()>
				//    3    7:return          
				}

				final aj a;

			
			{
				a = aj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field aj a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   37   89:aload_0         
	//   38   90:getfield        #115 <Field FrameLayout k>
	//   39   93:new             #12  <Class aj$2>
	//   40   96:dup             
	//   41   97:aload_0         
	//   42   98:invokespecial   #130 <Method void aj$2(aj)>
	//   43  101:invokevirtual   #131 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(l != null)
	//*  44  104:aload_0         
	//*  45  105:getfield        #119 <Field FrameLayout l>
	//*  46  108:ifnull          126
			l.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.d();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field aj a>
				//    2    4:invokevirtual   #25  <Method void aj.d()>
				//    3    7:return          
				}

				final aj a;

			
			{
				a = aj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field aj a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   47  111:aload_0         
	//   48  112:getfield        #119 <Field FrameLayout l>
	//   49  115:new             #14  <Class aj$3>
	//   50  118:dup             
	//   51  119:aload_0         
	//   52  120:invokespecial   #132 <Method void aj$3(aj)>
	//   53  123:invokevirtual   #131 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(n != null)
	//*  54  126:aload_0         
	//*  55  127:getfield        #123 <Field FrameLayout n>
	//*  56  130:ifnull          148
			n.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.e();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field aj a>
				//    2    4:invokevirtual   #25  <Method void aj.e()>
				//    3    7:return          
				}

				final aj a;

			
			{
				a = aj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field aj a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   57  133:aload_0         
	//   58  134:getfield        #123 <Field FrameLayout n>
	//   59  137:new             #16  <Class aj$4>
	//   60  140:dup             
	//   61  141:aload_0         
	//   62  142:invokespecial   #133 <Method void aj$4(aj)>
	//   63  145:invokevirtual   #131 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   64  148:aload_0         
	//   65  149:invokevirtual   #135 <Method void a()>
	//   66  152:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.aj.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field aj a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.fragments.aj.c(aj)>
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

			final aj a;

			
			{
				a = aj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field aj a>
				super(s1, l, s2);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #24  <Class aj$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #91  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #91  <String "">
	//    6   10:invokespecial   #138 <Method void aj$8(aj, String, long, String)>
	//    7   13:invokestatic    #143 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.aj.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field aj a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.aj.a(aj)>
			//    3    7:return          
			}

			final aj a;

			
			{
				a = aj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field aj a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #91  <String "">
	//    1    2:new             #20  <Class aj$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #144 <Method void aj$6(aj)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #98  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void h()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.aj.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field aj a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.aj.b(aj)>
			//    3    7:return          
			}

			final aj a;

			
			{
				a = aj.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field aj a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #91  <String "">
	//    1    2:new             #22  <Class aj$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #145 <Method void aj$7(aj)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #98  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(r);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field c r>
	//    2    4:invokestatic    #149 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #151 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #153 <Method void ai.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #149 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		s = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #157 <Method View ai.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #82  <Field View s>
		if(s == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #82  <Field View s>
	//*   9   15:ifnonnull       30
			s = layoutinflater.inflate(0x7f0b00ba, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #158 <Int 0x7f0b00ba>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #164 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #82  <Field View s>
		return s;
	//   17   30:aload_0         
	//   18   31:getfield        #82  <Field View s>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #167 <Method void ai.onDestroyView()>
		s = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #82  <Field View s>
		d = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #108 <Field Button d>
		k = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #115 <Field FrameLayout k>
		l = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #119 <Field FrameLayout l>
		n = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #123 <Field FrameLayout n>
	//   17   29:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #171 <Method void ai.onViewCreated(View, Bundle)>
		r.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field c r>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #173 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c r = new c();
	private View s;
}
