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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			RobotSoftwareUpdateActivity, IRobotApplication_

public final class RobotSoftwareUpdateActivity_ extends RobotSoftwareUpdateActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("assetId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "assetId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #33  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class RobotSoftwareUpdateActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i1)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i1);
		//    3    7:aload_0         
		//    4    8:getfield        #27  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #38  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #42  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #44  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i1, a);
		//   13   29:aload_0         
		//   14   30:getfield        #44  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #38  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #47  <Field Bundle a>
		//   20   42:invokevirtual   #52  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #56  <Field Context b>
		//*  24   52:instanceof      #58  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i1, a);
		//   26   58:aload_0         
		//   27   59:getfield        #56  <Field Context b>
		//   28   62:checkcast       #58  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #38  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #47  <Field Bundle a>
		//   34   74:invokestatic    #63  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #56  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #38  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #47  <Field Bundle a>
		//   42   92:invokevirtual   #69  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #71  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #56  <Field Context b>
		//   47  103:invokespecial   #73  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/RobotSoftwareUpdateActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class RobotSoftwareUpdateActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/RobotSoftwareUpdateActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class RobotSoftwareUpdateActivity_>
		//    4    7:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
			e = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #27  <Field Fragment e>
		//    8   15:return          
		}
	}


	public RobotSoftwareUpdateActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void RobotSoftwareUpdateActivity()>
	//    2    4:aload_0         
	//    3    5:new             #41  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void c()>
	//    6   12:putfield        #44  <Field c m>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #32  <Class RobotSoftwareUpdateActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #49  <Method void RobotSoftwareUpdateActivity_$a(Context)>
	//    4    8:areturn         
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #32  <Class RobotSoftwareUpdateActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void RobotSoftwareUpdateActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #63  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #66  <Field IRobotApplication a>
		r();
	//    5   11:aload_0         
	//    6   12:invokespecial   #68  <Method void r()>
	//    7   15:return          
	}

	static void a(RobotSoftwareUpdateActivity_ robotsoftwareupdateactivity_)
	{
		((RobotSoftwareUpdateActivity) (robotsoftwareupdateactivity_)).RobotSoftwareUpdateActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void RobotSoftwareUpdateActivity.h()>
	//    2    4:return          
	}

	static void b(RobotSoftwareUpdateActivity_ robotsoftwareupdateactivity_)
	{
		((RobotSoftwareUpdateActivity) (robotsoftwareupdateactivity_)).RobotSoftwareUpdateActivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void RobotSoftwareUpdateActivity.i()>
	//    2    4:return          
	}

	static void c(RobotSoftwareUpdateActivity_ robotsoftwareupdateactivity_)
	{
		((RobotSoftwareUpdateActivity) (robotsoftwareupdateactivity_)).RobotSoftwareUpdateActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void RobotSoftwareUpdateActivity.j()>
	//    2    4:return          
	}

	static void d(RobotSoftwareUpdateActivity_ robotsoftwareupdateactivity_)
	{
		((RobotSoftwareUpdateActivity) (robotsoftwareupdateactivity_)).RobotSoftwareUpdateActivity.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void RobotSoftwareUpdateActivity.k()>
	//    2    4:return          
	}

	static void e(RobotSoftwareUpdateActivity_ robotsoftwareupdateactivity_)
	{
		((RobotSoftwareUpdateActivity) (robotsoftwareupdateactivity_)).RobotSoftwareUpdateActivity.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void RobotSoftwareUpdateActivity.l()>
	//    2    4:return          
	}

	static void f(RobotSoftwareUpdateActivity_ robotsoftwareupdateactivity_)
	{
		((RobotSoftwareUpdateActivity) (robotsoftwareupdateactivity_)).RobotSoftwareUpdateActivity.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void RobotSoftwareUpdateActivity.m()>
	//    2    4:return          
	}

	static void g(RobotSoftwareUpdateActivity_ robotsoftwareupdateactivity_)
	{
		((RobotSoftwareUpdateActivity) (robotsoftwareupdateactivity_)).RobotSoftwareUpdateActivity.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void RobotSoftwareUpdateActivity.n()>
	//    2    4:return          
	}

	static void h(RobotSoftwareUpdateActivity_ robotsoftwareupdateactivity_)
	{
		((RobotSoftwareUpdateActivity) (robotsoftwareupdateactivity_)).RobotSoftwareUpdateActivity.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void RobotSoftwareUpdateActivity.o()>
	//    2    4:return          
	}

	static void i(RobotSoftwareUpdateActivity_ robotsoftwareupdateactivity_)
	{
		((RobotSoftwareUpdateActivity) (robotsoftwareupdateactivity_)).RobotSoftwareUpdateActivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void RobotSoftwareUpdateActivity.p()>
	//    2    4:return          
	}

	private void r()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method Intent getIntent()>
	//    2    4:invokevirtual   #111 <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("assetId"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #113 <String "assetId">
	//*   8   15:invokevirtual   #119 <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			b = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #113 <String "assetId">
	//   13   25:invokevirtual   #123 <Method String Bundle.getString(String)>
	//   14   28:putfield        #126 <Field String b>
	//   15   31:return          
	}

	public View a(int i1)
	{
		return findViewById(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #130 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (Button)a1.a(0x7f090473);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #134 <Int 0x7f090473>
	//    3    4:invokeinterface #136 <Method View a.a(int)>
	//    4    9:checkcast       #138 <Class Button>
	//    5   12:putfield        #141 <Field Button c>
		d = (TextView)a1.a(0x7f09047d);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #142 <Int 0x7f09047d>
	//    9   19:invokeinterface #136 <Method View a.a(int)>
	//   10   24:checkcast       #144 <Class TextView>
	//   11   27:putfield        #147 <Field TextView d>
		e = (TextView)a1.a(0x7f090446);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #148 <Int 0x7f090446>
	//   15   34:invokeinterface #136 <Method View a.a(int)>
	//   16   39:checkcast       #144 <Class TextView>
	//   17   42:putfield        #150 <Field TextView e>
		f = (TextView)a1.a(0x7f090447);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #151 <Int 0x7f090447>
	//   21   49:invokeinterface #136 <Method View a.a(int)>
	//   22   54:checkcast       #144 <Class TextView>
	//   23   57:putfield        #153 <Field TextView f>
		g = (TextView)a1.a(0x7f09041b);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #154 <Int 0x7f09041b>
	//   27   64:invokeinterface #136 <Method View a.a(int)>
	//   28   69:checkcast       #144 <Class TextView>
	//   29   72:putfield        #156 <Field TextView g>
		h = (TextView)a1.a(0x7f0903f1);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #157 <Int 0x7f0903f1>
	//   33   79:invokeinterface #136 <Method View a.a(int)>
	//   34   84:checkcast       #144 <Class TextView>
	//   35   87:putfield        #159 <Field TextView h>
		i = (LinearLayout)a1.a(0x7f09008b);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #160 <Int 0x7f09008b>
	//   39   94:invokeinterface #136 <Method View a.a(int)>
	//   40   99:checkcast       #162 <Class LinearLayout>
	//   41  102:putfield        #165 <Field LinearLayout i>
		j = (ProgressBar)a1.a(0x7f090223);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #166 <Int 0x7f090223>
	//   45  109:invokeinterface #136 <Method View a.a(int)>
	//   46  114:checkcast       #168 <Class ProgressBar>
	//   47  117:putfield        #171 <Field ProgressBar j>
		k = (ImageButton)a1.a(0x7f0901b0);
	//   48  120:aload_0         
	//   49  121:aload_1         
	//   50  122:ldc1            #172 <Int 0x7f0901b0>
	//   51  124:invokeinterface #136 <Method View a.a(int)>
	//   52  129:checkcast       #174 <Class ImageButton>
	//   53  132:putfield        #177 <Field ImageButton k>
		if(k != null)
	//*  54  135:aload_0         
	//*  55  136:getfield        #177 <Field ImageButton k>
	//*  56  139:ifnull          157
			k.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSoftwareUpdateActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSoftwareUpdateActivity_.f()>
				//    3    7:return          
				}

				final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   57  142:aload_0         
	//   58  143:getfield        #177 <Field ImageButton k>
	//   59  146:new             #10  <Class RobotSoftwareUpdateActivity_$1>
	//   60  149:dup             
	//   61  150:aload_0         
	//   62  151:invokespecial   #179 <Method void RobotSoftwareUpdateActivity_$1(RobotSoftwareUpdateActivity_)>
	//   63  154:invokevirtual   #183 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(c != null)
	//*  64  157:aload_0         
	//*  65  158:getfield        #141 <Field Button c>
	//*  66  161:ifnull          179
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSoftwareUpdateActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSoftwareUpdateActivity_.g()>
				//    3    7:return          
				}

				final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   67  164:aload_0         
	//   68  165:getfield        #141 <Field Button c>
	//   69  168:new             #20  <Class RobotSoftwareUpdateActivity_$4>
	//   70  171:dup             
	//   71  172:aload_0         
	//   72  173:invokespecial   #184 <Method void RobotSoftwareUpdateActivity_$4(RobotSoftwareUpdateActivity_)>
	//   73  176:invokevirtual   #185 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   74  179:aload_0         
	//   75  180:invokevirtual   #187 <Method void e()>
	//   76  183:return          
	}

	protected void h()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotSoftwareUpdateActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSoftwareUpdateActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.RobotSoftwareUpdateActivity_.a(RobotSoftwareUpdateActivity_)>
			//    3    7:return          
			}

			final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #22  <Class RobotSoftwareUpdateActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #190 <Method void RobotSoftwareUpdateActivity_$5(RobotSoftwareUpdateActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #195 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void i()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotSoftwareUpdateActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSoftwareUpdateActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.RobotSoftwareUpdateActivity_.b(RobotSoftwareUpdateActivity_)>
			//    3    7:return          
			}

			final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #24  <Class RobotSoftwareUpdateActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #196 <Method void RobotSoftwareUpdateActivity_$6(RobotSoftwareUpdateActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #195 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void j()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotSoftwareUpdateActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSoftwareUpdateActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.RobotSoftwareUpdateActivity_.c(RobotSoftwareUpdateActivity_)>
			//    3    7:return          
			}

			final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #26  <Class RobotSoftwareUpdateActivity_$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #197 <Method void RobotSoftwareUpdateActivity_$7(RobotSoftwareUpdateActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #195 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void k()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				RobotSoftwareUpdateActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSoftwareUpdateActivity_ a>
			//    2    4:invokestatic    #24  <Method void RobotSoftwareUpdateActivity_.d(RobotSoftwareUpdateActivity_)>
			//    3    7:return          
			}

			final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #28  <Class RobotSoftwareUpdateActivity_$8>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #198 <Method void RobotSoftwareUpdateActivity_$8(RobotSoftwareUpdateActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #195 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void l()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotSoftwareUpdateActivity_.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSoftwareUpdateActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.RobotSoftwareUpdateActivity_.e(RobotSoftwareUpdateActivity_)>
			//    3    7:return          
			}

			final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #30  <Class RobotSoftwareUpdateActivity_$9>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #199 <Method void RobotSoftwareUpdateActivity_$9(RobotSoftwareUpdateActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #195 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void m()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				RobotSoftwareUpdateActivity_.f(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSoftwareUpdateActivity_ a>
			//    2    4:invokestatic    #24  <Method void RobotSoftwareUpdateActivity_.f(RobotSoftwareUpdateActivity_)>
			//    3    7:return          
			}

			final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #12  <Class RobotSoftwareUpdateActivity_$10>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #200 <Method void RobotSoftwareUpdateActivity_$10(RobotSoftwareUpdateActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #195 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void n()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				RobotSoftwareUpdateActivity_.g(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSoftwareUpdateActivity_ a>
			//    2    4:invokestatic    #24  <Method void RobotSoftwareUpdateActivity_.g(RobotSoftwareUpdateActivity_)>
			//    3    7:return          
			}

			final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #14  <Class RobotSoftwareUpdateActivity_$11>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #204 <Method void RobotSoftwareUpdateActivity_$11(RobotSoftwareUpdateActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #195 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void o()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				RobotSoftwareUpdateActivity_.h(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSoftwareUpdateActivity_ a>
			//    2    4:invokestatic    #24  <Method void RobotSoftwareUpdateActivity_.h(RobotSoftwareUpdateActivity_)>
			//    3    7:return          
			}

			final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #16  <Class RobotSoftwareUpdateActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #206 <Method void RobotSoftwareUpdateActivity_$2(RobotSoftwareUpdateActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #195 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(m);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field c m>
	//    2    4:invokestatic    #210 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #212 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #214 <Method void RobotSoftwareUpdateActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #210 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0069);
	//   13   23:aload_0         
	//   14   24:ldc1            #215 <Int 0x7f0b0069>
	//   15   26:invokevirtual   #219 <Method void setContentView(int)>
	//   16   29:return          
	}

	protected void p()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				RobotSoftwareUpdateActivity_.i(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSoftwareUpdateActivity_ a>
			//    2    4:invokestatic    #24  <Method void RobotSoftwareUpdateActivity_.i(RobotSoftwareUpdateActivity_)>
			//    3    7:return          
			}

			final RobotSoftwareUpdateActivity_ a;

			
			{
				a = RobotSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #18  <Class RobotSoftwareUpdateActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #220 <Method void RobotSoftwareUpdateActivity_$3(RobotSoftwareUpdateActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #195 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void setContentView(int i1)
	{
		super.setContentView(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #221 <Method void RobotSoftwareUpdateActivity.setContentView(int)>
		m.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field c m>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #223 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #226 <Method void RobotSoftwareUpdateActivity.setContentView(View)>
		m.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field c m>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #223 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #229 <Method void RobotSoftwareUpdateActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		m.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field c m>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #223 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #233 <Method void RobotSoftwareUpdateActivity.setIntent(Intent)>
		r();
	//    3    5:aload_0         
	//    4    6:invokespecial   #68  <Method void r()>
	//    5    9:return          
	}

	private final c m = new c();
}
