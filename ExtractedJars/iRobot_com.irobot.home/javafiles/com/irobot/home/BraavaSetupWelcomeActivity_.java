// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaSetupWelcomeActivity

public final class BraavaSetupWelcomeActivity_ extends BraavaSetupWelcomeActivity
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
			super(context, com/irobot/home/BraavaSetupWelcomeActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BraavaSetupWelcomeActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BraavaSetupWelcomeActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void BraavaSetupWelcomeActivity()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c g>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #14  <Class BraavaSetupWelcomeActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void BraavaSetupWelcomeActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #39  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (ViewPager)a1.a(0x7f0903cf);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #43  <Int 0x7f0903cf>
	//    3    4:invokeinterface #45  <Method View a.a(int)>
	//    4    9:checkcast       #47  <Class ViewPager>
	//    5   12:putfield        #50  <Field ViewPager a>
		b = (LinearLayout)a1.a(0x7f0902e6);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #51  <Int 0x7f0902e6>
	//    9   19:invokeinterface #45  <Method View a.a(int)>
	//   10   24:checkcast       #53  <Class LinearLayout>
	//   11   27:putfield        #57  <Field LinearLayout b>
		c = (Button)a1.a(0x7f090283);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #58  <Int 0x7f090283>
	//   15   34:invokeinterface #45  <Method View a.a(int)>
	//   16   39:checkcast       #60  <Class Button>
	//   17   42:putfield        #64  <Field Button c>
		d = (Button)a1.a(0x7f0903e1);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #65  <Int 0x7f0903e1>
	//   21   49:invokeinterface #45  <Method View a.a(int)>
	//   22   54:checkcast       #60  <Class Button>
	//   23   57:putfield        #68  <Field Button d>
		if(c != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #64  <Field Button c>
	//*  26   64:ifnull          82
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaSetupWelcomeActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaSetupWelcomeActivity_.f()>
				//    3    7:return          
				}

				final BraavaSetupWelcomeActivity_ a;

			
			{
				a = BraavaSetupWelcomeActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaSetupWelcomeActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   27   67:aload_0         
	//   28   68:getfield        #64  <Field Button c>
	//   29   71:new             #10  <Class BraavaSetupWelcomeActivity_$1>
	//   30   74:dup             
	//   31   75:aload_0         
	//   32   76:invokespecial   #71  <Method void BraavaSetupWelcomeActivity_$1(BraavaSetupWelcomeActivity_)>
	//   33   79:invokevirtual   #75  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  34   82:aload_0         
	//*  35   83:getfield        #68  <Field Button d>
	//*  36   86:ifnull          104
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaSetupWelcomeActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaSetupWelcomeActivity_.g()>
				//    3    7:return          
				}

				final BraavaSetupWelcomeActivity_ a;

			
			{
				a = BraavaSetupWelcomeActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaSetupWelcomeActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   37   89:aload_0         
	//   38   90:getfield        #68  <Field Button d>
	//   39   93:new             #12  <Class BraavaSetupWelcomeActivity_$2>
	//   40   96:dup             
	//   41   97:aload_0         
	//   42   98:invokespecial   #76  <Method void BraavaSetupWelcomeActivity_$2(BraavaSetupWelcomeActivity_)>
	//   43  101:invokevirtual   #75  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   44  104:aload_0         
	//   45  105:invokevirtual   #79  <Method void e()>
	//   46  108:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c g>
	//    2    4:invokestatic    #83  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #85  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #87  <Method void BraavaSetupWelcomeActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #83  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0070);
	//   13   23:aload_0         
	//   14   24:ldc1            #88  <Int 0x7f0b0070>
	//   15   26:invokevirtual   #92  <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #93  <Method void BraavaSetupWelcomeActivity.setContentView(int)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #95  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void BraavaSetupWelcomeActivity.setContentView(View)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #95  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #101 <Method void BraavaSetupWelcomeActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c g>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #95  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c g = new c();
}
