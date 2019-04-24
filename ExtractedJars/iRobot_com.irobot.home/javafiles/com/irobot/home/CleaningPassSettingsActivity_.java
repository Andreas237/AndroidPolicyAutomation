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
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			CleaningPassSettingsActivity

public final class CleaningPassSettingsActivity_ extends CleaningPassSettingsActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #29  <String "robotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class CleaningPassSettingsActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("shouldSendUpdates", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <String "shouldSendUpdates">
		//    2    3:iload_1         
		//    3    4:invokespecial   #38  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class CleaningPassSettingsActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #43  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #47  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #49  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #49  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #43  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #52  <Field Bundle a>
		//   20   42:invokevirtual   #57  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #61  <Field Context b>
		//*  24   52:instanceof      #63  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #61  <Field Context b>
		//   28   62:checkcast       #63  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #43  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #52  <Field Bundle a>
		//   34   74:invokestatic    #68  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #61  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #43  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #52  <Field Bundle a>
		//   42   92:invokevirtual   #74  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #76  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #61  <Field Context b>
		//   47  103:invokespecial   #79  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/CleaningPassSettingsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class CleaningPassSettingsActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			e = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment e>
		//    8   15:return          
		}
	}


	public CleaningPassSettingsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void CleaningPassSettingsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c l>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #16  <Class CleaningPassSettingsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void CleaningPassSettingsActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		j();
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void j()>
	//    4    8:return          
	}

	private void j()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method Intent getIntent()>
	//    2    4:invokevirtual   #50  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("robotBlid"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #52  <String "robotBlid">
	//*   8   15:invokevirtual   #58  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #52  <String "robotBlid">
	//   13   25:invokevirtual   #62  <Method String Bundle.getString(String)>
	//   14   28:putfield        #65  <Field String a>
			if(bundle.containsKey("shouldSendUpdates"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #67  <String "shouldSendUpdates">
	//*  17   34:invokevirtual   #58  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getBoolean("shouldSendUpdates");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #67  <String "shouldSendUpdates">
	//   22   44:invokevirtual   #70  <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #74  <Field boolean b>
		}
	//   24   50:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #78  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (RelativeLayout)a1.a(0x7f09005a);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #82  <Int 0x7f09005a>
	//    3    4:invokeinterface #84  <Method View a.a(int)>
	//    4    9:checkcast       #86  <Class RelativeLayout>
	//    5   12:putfield        #90  <Field RelativeLayout c>
		d = (RelativeLayout)a1.a(0x7f0902a8);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #91  <Int 0x7f0902a8>
	//    9   19:invokeinterface #84  <Method View a.a(int)>
	//   10   24:checkcast       #86  <Class RelativeLayout>
	//   11   27:putfield        #94  <Field RelativeLayout d>
		e = (RelativeLayout)a1.a(0x7f090469);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #95  <Int 0x7f090469>
	//   15   34:invokeinterface #84  <Method View a.a(int)>
	//   16   39:checkcast       #86  <Class RelativeLayout>
	//   17   42:putfield        #98  <Field RelativeLayout e>
		f = (RelativeLayout)a1.a(0x7f0903f4);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #99  <Int 0x7f0903f4>
	//   21   49:invokeinterface #84  <Method View a.a(int)>
	//   22   54:checkcast       #86  <Class RelativeLayout>
	//   23   57:putfield        #102 <Field RelativeLayout f>
		g = a1.a(0x7f09005b);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #103 <Int 0x7f09005b>
	//   27   64:invokeinterface #84  <Method View a.a(int)>
	//   28   69:putfield        #107 <Field View g>
		h = (ProgressBar)a1.a(0x7f09047b);
	//   29   72:aload_0         
	//   30   73:aload_1         
	//   31   74:ldc1            #108 <Int 0x7f09047b>
	//   32   76:invokeinterface #84  <Method View a.a(int)>
	//   33   81:checkcast       #110 <Class ProgressBar>
	//   34   84:putfield        #114 <Field ProgressBar h>
		if(c != null)
	//*  35   87:aload_0         
	//*  36   88:getfield        #90  <Field RelativeLayout c>
	//*  37   91:ifnull          109
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CleaningPassSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CleaningPassSettingsActivity_.f()>
				//    3    7:return          
				}

				final CleaningPassSettingsActivity_ a;

			
			{
				a = CleaningPassSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CleaningPassSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   38   94:aload_0         
	//   39   95:getfield        #90  <Field RelativeLayout c>
	//   40   98:new             #10  <Class CleaningPassSettingsActivity_$1>
	//   41  101:dup             
	//   42  102:aload_0         
	//   43  103:invokespecial   #117 <Method void CleaningPassSettingsActivity_$1(CleaningPassSettingsActivity_)>
	//   44  106:invokevirtual   #121 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  45  109:aload_0         
	//*  46  110:getfield        #94  <Field RelativeLayout d>
	//*  47  113:ifnull          131
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CleaningPassSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CleaningPassSettingsActivity_.g()>
				//    3    7:return          
				}

				final CleaningPassSettingsActivity_ a;

			
			{
				a = CleaningPassSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CleaningPassSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   48  116:aload_0         
	//   49  117:getfield        #94  <Field RelativeLayout d>
	//   50  120:new             #12  <Class CleaningPassSettingsActivity_$2>
	//   51  123:dup             
	//   52  124:aload_0         
	//   53  125:invokespecial   #122 <Method void CleaningPassSettingsActivity_$2(CleaningPassSettingsActivity_)>
	//   54  128:invokevirtual   #121 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  55  131:aload_0         
	//*  56  132:getfield        #98  <Field RelativeLayout e>
	//*  57  135:ifnull          153
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CleaningPassSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CleaningPassSettingsActivity_.h()>
				//    3    7:return          
				}

				final CleaningPassSettingsActivity_ a;

			
			{
				a = CleaningPassSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CleaningPassSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   58  138:aload_0         
	//   59  139:getfield        #98  <Field RelativeLayout e>
	//   60  142:new             #14  <Class CleaningPassSettingsActivity_$3>
	//   61  145:dup             
	//   62  146:aload_0         
	//   63  147:invokespecial   #123 <Method void CleaningPassSettingsActivity_$3(CleaningPassSettingsActivity_)>
	//   64  150:invokevirtual   #121 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   65  153:aload_0         
	//   66  154:invokevirtual   #125 <Method void e()>
	//   67  157:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c l>
	//    2    4:invokestatic    #129 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #131 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #133 <Method void CleaningPassSettingsActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #129 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0035);
	//   13   23:aload_0         
	//   14   24:ldc1            #134 <Int 0x7f0b0035>
	//   15   26:invokevirtual   #138 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #139 <Method void CleaningPassSettingsActivity.setContentView(int)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #141 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #144 <Method void CleaningPassSettingsActivity.setContentView(View)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #141 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #147 <Method void CleaningPassSettingsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c l>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #141 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #151 <Method void CleaningPassSettingsActivity.setIntent(Intent)>
		j();
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void j()>
	//    5    9:return          
	}

	private final c l = new c();
}
