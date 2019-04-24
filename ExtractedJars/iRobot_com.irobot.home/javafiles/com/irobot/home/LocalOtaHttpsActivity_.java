// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			LocalOtaHttpsActivity, IRobotApplication_

public final class LocalOtaHttpsActivity_ extends LocalOtaHttpsActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field android.content.Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #33  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #33  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #25  <Field android.content.Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #36  <Field Bundle a>
		//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #45  <Field Context b>
		//*  24   52:instanceof      #47  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #45  <Field Context b>
		//   28   62:checkcast       #47  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #25  <Field android.content.Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #36  <Field Bundle a>
		//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #45  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #25  <Field android.content.Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #36  <Field Bundle a>
		//   42   92:invokevirtual   #58  <Method void Context.startActivity(android.content.Intent, Bundle)>
			return new e(b);
		//   43   95:new             #60  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #45  <Field Context b>
		//   47  103:invokespecial   #62  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/LocalOtaHttpsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class LocalOtaHttpsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public LocalOtaHttpsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void LocalOtaHttpsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void c()>
	//    6   12:putfield        #33  <Field c a>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #22  <Class LocalOtaHttpsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void LocalOtaHttpsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #42  <Method void c.a(b)>
		l = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #48  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #52  <Field IRobotApplication l>
	//    5   11:return          
	}

	static void a(LocalOtaHttpsActivity_ localotahttpsactivity_)
	{
		((LocalOtaHttpsActivity) (localotahttpsactivity_)).LocalOtaHttpsActivity.F();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void LocalOtaHttpsActivity.F()>
	//    2    4:return          
	}

	static void a(LocalOtaHttpsActivity_ localotahttpsactivity_, boolean flag)
	{
		((LocalOtaHttpsActivity) (localotahttpsactivity_)).com.irobot.home.LocalOtaHttpsActivity.b(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #61  <Method void com.irobot.home.LocalOtaHttpsActivity.b(boolean)>
	//    3    5:return          
	}

	static void b(LocalOtaHttpsActivity_ localotahttpsactivity_)
	{
		((LocalOtaHttpsActivity) (localotahttpsactivity_)).LocalOtaHttpsActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void LocalOtaHttpsActivity.f()>
	//    2    4:return          
	}

	public void F()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.LocalOtaHttpsActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LocalOtaHttpsActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.LocalOtaHttpsActivity_.a(LocalOtaHttpsActivity_)>
			//    3    7:return          
			}

			final LocalOtaHttpsActivity_ a;

			
			{
				a = LocalOtaHttpsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LocalOtaHttpsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #66  <String "">
	//    1    2:new             #18  <Class LocalOtaHttpsActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #68  <Method void LocalOtaHttpsActivity_$5(LocalOtaHttpsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #73  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #77  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		i = (ProgressBar)a1.a(0x7f090223);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #81  <Int 0x7f090223>
	//    3    4:invokeinterface #83  <Method View a.a(int)>
	//    4    9:checkcast       #85  <Class ProgressBar>
	//    5   12:putfield        #89  <Field ProgressBar i>
		j = (ProgressBar)a1.a(0x7f0903c0);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #90  <Int 0x7f0903c0>
	//    9   19:invokeinterface #83  <Method View a.a(int)>
	//   10   24:checkcast       #85  <Class ProgressBar>
	//   11   27:putfield        #93  <Field ProgressBar j>
		m = (Button)a1.a(0x7f09011d);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #94  <Int 0x7f09011d>
	//   15   34:invokeinterface #83  <Method View a.a(int)>
	//   16   39:checkcast       #96  <Class Button>
	//   17   42:putfield        #100 <Field Button m>
		n = (CheckBox)a1.a(0x7f0902ae);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #101 <Int 0x7f0902ae>
	//   21   49:invokeinterface #83  <Method View a.a(int)>
	//   22   54:checkcast       #103 <Class CheckBox>
	//   23   57:putfield        #107 <Field CheckBox n>
		o = a1.a(0x7f0902af);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #108 <Int 0x7f0902af>
	//   27   64:invokeinterface #83  <Method View a.a(int)>
	//   28   69:putfield        #112 <Field View o>
		t = (TextView)a1.a(0x7f0902ab);
	//   29   72:aload_0         
	//   30   73:aload_1         
	//   31   74:ldc1            #113 <Int 0x7f0902ab>
	//   32   76:invokeinterface #83  <Method View a.a(int)>
	//   33   81:checkcast       #115 <Class TextView>
	//   34   84:putfield        #119 <Field TextView t>
		u = a1.a(0x7f09011e);
	//   35   87:aload_0         
	//   36   88:aload_1         
	//   37   89:ldc1            #120 <Int 0x7f09011e>
	//   38   91:invokeinterface #83  <Method View a.a(int)>
	//   39   96:putfield        #123 <Field View u>
		v = (NestedScrollView)a1.a(0x7f0903ae);
	//   40   99:aload_0         
	//   41  100:aload_1         
	//   42  101:ldc1            #124 <Int 0x7f0903ae>
	//   43  103:invokeinterface #83  <Method View a.a(int)>
	//   44  108:checkcast       #126 <Class NestedScrollView>
	//   45  111:putfield        #130 <Field NestedScrollView v>
		if(m != null)
	//*  46  114:aload_0         
	//*  47  115:getfield        #100 <Field Button m>
	//*  48  118:ifnull          136
			m.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.n();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field LocalOtaHttpsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void LocalOtaHttpsActivity_.n()>
				//    3    7:return          
				}

				final LocalOtaHttpsActivity_ a;

			
			{
				a = LocalOtaHttpsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field LocalOtaHttpsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   49  121:aload_0         
	//   50  122:getfield        #100 <Field Button m>
	//   51  125:new             #10  <Class LocalOtaHttpsActivity_$1>
	//   52  128:dup             
	//   53  129:aload_0         
	//   54  130:invokespecial   #131 <Method void LocalOtaHttpsActivity_$1(LocalOtaHttpsActivity_)>
	//   55  133:invokevirtual   #135 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(t != null)
	//*  56  136:aload_0         
	//*  57  137:getfield        #119 <Field TextView t>
	//*  58  140:ifnull          158
			t.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.J();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field LocalOtaHttpsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void LocalOtaHttpsActivity_.J()>
				//    3    7:return          
				}

				final LocalOtaHttpsActivity_ a;

			
			{
				a = LocalOtaHttpsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field LocalOtaHttpsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   59  143:aload_0         
	//   60  144:getfield        #119 <Field TextView t>
	//   61  147:new             #12  <Class LocalOtaHttpsActivity_$2>
	//   62  150:dup             
	//   63  151:aload_0         
	//   64  152:invokespecial   #136 <Method void LocalOtaHttpsActivity_$2(LocalOtaHttpsActivity_)>
	//   65  155:invokevirtual   #137 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(o != null)
	//*  66  158:aload_0         
	//*  67  159:getfield        #112 <Field View o>
	//*  68  162:ifnull          180
			o.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.K();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field LocalOtaHttpsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void LocalOtaHttpsActivity_.K()>
				//    3    7:return          
				}

				final LocalOtaHttpsActivity_ a;

			
			{
				a = LocalOtaHttpsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field LocalOtaHttpsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   69  165:aload_0         
	//   70  166:getfield        #112 <Field View o>
	//   71  169:new             #14  <Class LocalOtaHttpsActivity_$3>
	//   72  172:dup             
	//   73  173:aload_0         
	//   74  174:invokespecial   #138 <Method void LocalOtaHttpsActivity_$3(LocalOtaHttpsActivity_)>
	//   75  177:invokevirtual   #141 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   76  180:aload_0         
	//   77  181:invokevirtual   #144 <Method void e()>
	//   78  184:return          
	}

	public void b(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.LocalOtaHttpsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field LocalOtaHttpsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.LocalOtaHttpsActivity_.a(LocalOtaHttpsActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final LocalOtaHttpsActivity_ b;

			
			{
				b = LocalOtaHttpsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field LocalOtaHttpsActivity_ b>
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
	//    0    0:ldc1            #66  <String "">
	//    1    2:new             #16  <Class LocalOtaHttpsActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #146 <Method void LocalOtaHttpsActivity_$4(LocalOtaHttpsActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #73  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	void f()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.LocalOtaHttpsActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LocalOtaHttpsActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.LocalOtaHttpsActivity_.b(LocalOtaHttpsActivity_)>
			//    3    7:return          
			}

			final LocalOtaHttpsActivity_ a;

			
			{
				a = LocalOtaHttpsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LocalOtaHttpsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #66  <String "">
	//    1    2:new             #20  <Class LocalOtaHttpsActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #147 <Method void LocalOtaHttpsActivity_$6(LocalOtaHttpsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #73  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field c a>
	//    2    4:invokestatic    #151 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #153 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #155 <Method void LocalOtaHttpsActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #151 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0080);
	//   13   23:aload_0         
	//   14   24:ldc1            #156 <Int 0x7f0b0080>
	//   15   26:invokevirtual   #160 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #161 <Method void LocalOtaHttpsActivity.setContentView(int)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field c a>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #163 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #166 <Method void LocalOtaHttpsActivity.setContentView(View)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field c a>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #163 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #169 <Method void LocalOtaHttpsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field c a>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #163 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c a = new c();
}
