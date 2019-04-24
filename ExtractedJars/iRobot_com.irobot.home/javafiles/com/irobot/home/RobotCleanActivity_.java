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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.irobot.core.AccountLoggedOutEvent;
import com.irobot.core.AssetCommandTimeoutEvent;
import com.irobot.core.DataDeserializationErrorEvent;
import com.irobot.core.RobotBatteryLevelEvent;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity, IRobotApplication_

public final class RobotCleanActivity_ extends RobotCleanActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(boolean flag)
		{
			return (a)super.a("isVirtualRobot", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "isVirtualRobot">
		//    2    3:iload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class RobotCleanActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #27  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #31  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #37  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #39  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #39  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #31  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #42  <Field Bundle a>
		//   20   42:invokevirtual   #47  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #51  <Field Context b>
		//*  24   52:instanceof      #53  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #51  <Field Context b>
		//   28   62:checkcast       #53  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #31  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #42  <Field Bundle a>
		//   34   74:invokestatic    #58  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #51  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #31  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #42  <Field Bundle a>
		//   42   92:invokevirtual   #64  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #66  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #51  <Field Context b>
		//   47  103:invokespecial   #68  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/RobotCleanActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class RobotCleanActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public RobotCleanActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void RobotCleanActivity()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void c()>
	//    6   12:putfield        #50  <Field c w>
	//    7   15:return          
	}

	private void O()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method Intent getIntent()>
	//    2    4:invokevirtual   #62  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("isVirtualRobot"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #64  <String "isVirtualRobot">
	//*   8   15:invokevirtual   #70  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			t = bundle.getBoolean("isVirtualRobot");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #64  <String "isVirtualRobot">
	//   13   25:invokevirtual   #73  <Method boolean Bundle.getBoolean(String)>
	//   14   28:putfield        #77  <Field boolean t>
	//   15   31:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #38  <Class RobotCleanActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #81  <Method void RobotCleanActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #85  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #91  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #94  <Field IRobotApplication a>
		O();
	//    5   11:aload_0         
	//    6   12:invokespecial   #96  <Method void O()>
	//    7   15:return          
	}

	static void a(RobotCleanActivity_ robotcleanactivity_)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void RobotCleanActivity.q()>
	//    2    4:return          
	}

	static void a(RobotCleanActivity_ robotcleanactivity_, AccountLoggedOutEvent accountloggedoutevent)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.onAccountLoggedOutEvent(accountloggedoutevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #105 <Method void RobotCleanActivity.onAccountLoggedOutEvent(AccountLoggedOutEvent)>
	//    3    5:return          
	}

	static void a(RobotCleanActivity_ robotcleanactivity_, AssetCommandTimeoutEvent assetcommandtimeoutevent)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.onAssetCommandTimeoutEvent(assetcommandtimeoutevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #110 <Method void RobotCleanActivity.onAssetCommandTimeoutEvent(AssetCommandTimeoutEvent)>
	//    3    5:return          
	}

	static void a(RobotCleanActivity_ robotcleanactivity_, DataDeserializationErrorEvent datadeserializationerrorevent)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.onDataDeserializationErrorEvent(datadeserializationerrorevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void RobotCleanActivity.onDataDeserializationErrorEvent(DataDeserializationErrorEvent)>
	//    3    5:return          
	}

	static void a(RobotCleanActivity_ robotcleanactivity_, RobotBatteryLevelEvent robotbatterylevelevent)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.onRobotBatteryLevelEvent(robotbatterylevelevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #120 <Method void RobotCleanActivity.onRobotBatteryLevelEvent(RobotBatteryLevelEvent)>
	//    3    5:return          
	}

	static void b(RobotCleanActivity_ robotcleanactivity_)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.G();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void RobotCleanActivity.G()>
	//    2    4:return          
	}

	static void c(RobotCleanActivity_ robotcleanactivity_)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method void RobotCleanActivity.f()>
	//    2    4:return          
	}

	static void d(RobotCleanActivity_ robotcleanactivity_)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #132 <Method void RobotCleanActivity.p()>
	//    2    4:return          
	}

	static void e(RobotCleanActivity_ robotcleanactivity_)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.x();
	//    0    0:aload_0         
	//    1    1:invokespecial   #136 <Method void RobotCleanActivity.x()>
	//    2    4:return          
	}

	static void f(RobotCleanActivity_ robotcleanactivity_)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.C();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method void RobotCleanActivity.C()>
	//    2    4:return          
	}

	static void g(RobotCleanActivity_ robotcleanactivity_)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.D();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method void RobotCleanActivity.D()>
	//    2    4:return          
	}

	static void h(RobotCleanActivity_ robotcleanactivity_)
	{
		((RobotCleanActivity) (robotcleanactivity_)).RobotCleanActivity.F();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void RobotCleanActivity.F()>
	//    2    4:return          
	}

	protected void C()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					RobotCleanActivity_.f(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RobotCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void RobotCleanActivity_.f(RobotCleanActivity_)>
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

			final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RobotCleanActivity_ a>
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
	//    0    0:new             #26  <Class RobotCleanActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #149 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #149 <String "">
	//    6   10:invokespecial   #152 <Method void RobotCleanActivity_$4(RobotCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #157 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void D()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					RobotCleanActivity_.g(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RobotCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void RobotCleanActivity_.g(RobotCleanActivity_)>
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

			final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RobotCleanActivity_ a>
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
	//    0    0:new             #28  <Class RobotCleanActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #149 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #149 <String "">
	//    6   10:invokespecial   #158 <Method void RobotCleanActivity_$5(RobotCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #157 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void F()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					RobotCleanActivity_.h(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RobotCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void RobotCleanActivity_.h(RobotCleanActivity_)>
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

			final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RobotCleanActivity_ a>
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
	//    0    0:new             #30  <Class RobotCleanActivity_$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #149 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #149 <String "">
	//    6   10:invokespecial   #159 <Method void RobotCleanActivity_$6(RobotCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #157 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void G()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotCleanActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotCleanActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.RobotCleanActivity_.b(RobotCleanActivity_)>
			//    3    7:return          
			}

			final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #149 <String "">
	//    1    2:new             #18  <Class RobotCleanActivity_$13>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #161 <Method void RobotCleanActivity_$13(RobotCleanActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #166 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #170 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = a1.a(0x7f09015e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #174 <Int 0x7f09015e>
	//    3    4:invokeinterface #176 <Method View a.a(int)>
	//    4    9:putfield        #179 <Field View c>
		d = (ImageView)a1.a(0x7f09024f);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:ldc1            #180 <Int 0x7f09024f>
	//    8   16:invokeinterface #176 <Method View a.a(int)>
	//    9   21:checkcast       #182 <Class ImageView>
	//   10   24:putfield        #185 <Field ImageView d>
		e = (RelativeLayout)a1.a(0x7f090291);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #186 <Int 0x7f090291>
	//   14   31:invokeinterface #176 <Method View a.a(int)>
	//   15   36:checkcast       #188 <Class RelativeLayout>
	//   16   39:putfield        #191 <Field RelativeLayout e>
		f = (ImageView)a1.a(0x7f090290);
	//   17   42:aload_0         
	//   18   43:aload_1         
	//   19   44:ldc1            #192 <Int 0x7f090290>
	//   20   46:invokeinterface #176 <Method View a.a(int)>
	//   21   51:checkcast       #182 <Class ImageView>
	//   22   54:putfield        #194 <Field ImageView f>
		g = (LinearLayout)a1.a(0x7f0901b1);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #195 <Int 0x7f0901b1>
	//   26   61:invokeinterface #176 <Method View a.a(int)>
	//   27   66:checkcast       #197 <Class LinearLayout>
	//   28   69:putfield        #200 <Field LinearLayout g>
		if(d != null)
	//*  29   72:aload_0         
	//*  30   73:getfield        #185 <Field ImageView d>
	//*  31   76:ifnull          94
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotCleanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotCleanActivity_.j()>
				//    3    7:return          
				}

				final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   32   79:aload_0         
	//   33   80:getfield        #185 <Field ImageView d>
	//   34   83:new             #10  <Class RobotCleanActivity_$1>
	//   35   86:dup             
	//   36   87:aload_0         
	//   37   88:invokespecial   #201 <Method void RobotCleanActivity_$1(RobotCleanActivity_)>
	//   38   91:invokevirtual   #205 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  39   94:aload_0         
	//*  40   95:getfield        #191 <Field RelativeLayout e>
	//*  41   98:ifnull          116
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotCleanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotCleanActivity_.k()>
				//    3    7:return          
				}

				final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   42  101:aload_0         
	//   43  102:getfield        #191 <Field RelativeLayout e>
	//   44  105:new             #32  <Class RobotCleanActivity_$7>
	//   45  108:dup             
	//   46  109:aload_0         
	//   47  110:invokespecial   #206 <Method void RobotCleanActivity_$7(RobotCleanActivity_)>
	//   48  113:invokevirtual   #207 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   49  116:aload_0         
	//   50  117:invokevirtual   #209 <Method void e()>
	//   51  120:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.RobotCleanActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RobotCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.RobotCleanActivity_.c(RobotCleanActivity_)>
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

			final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RobotCleanActivity_ a>
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
	//    0    0:new             #20  <Class RobotCleanActivity_$14>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #149 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #149 <String "">
	//    6   10:invokespecial   #210 <Method void RobotCleanActivity_$14(RobotCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #157 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onAccountLoggedOutEvent(AccountLoggedOutEvent accountloggedoutevent)
	{
		org.androidannotations.api.b.a("", new Runnable(accountloggedoutevent) {

			public void run()
			{
				com.irobot.home.RobotCleanActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RobotCleanActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AccountLoggedOutEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RobotCleanActivity_.a(RobotCleanActivity_, AccountLoggedOutEvent)>
			//    5   11:return          
			}

			final AccountLoggedOutEvent a;
			final RobotCleanActivity_ b;

			
			{
				b = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotCleanActivity_ b>
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
	//    0    0:ldc1            #149 <String "">
	//    1    2:new             #34  <Class RobotCleanActivity_$8>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #213 <Method void RobotCleanActivity_$8(RobotCleanActivity_, AccountLoggedOutEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #166 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onAssetCommandTimeoutEvent(AssetCommandTimeoutEvent assetcommandtimeoutevent)
	{
		org.androidannotations.api.b.a("", new Runnable(assetcommandtimeoutevent) {

			public void run()
			{
				com.irobot.home.RobotCleanActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RobotCleanActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AssetCommandTimeoutEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RobotCleanActivity_.a(RobotCleanActivity_, AssetCommandTimeoutEvent)>
			//    5   11:return          
			}

			final AssetCommandTimeoutEvent a;
			final RobotCleanActivity_ b;

			
			{
				b = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotCleanActivity_ b>
				a = assetcommandtimeoutevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetCommandTimeoutEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #149 <String "">
	//    1    2:new             #14  <Class RobotCleanActivity_$11>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #216 <Method void RobotCleanActivity_$11(RobotCleanActivity_, AssetCommandTimeoutEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #166 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(w);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field c w>
	//    2    4:invokestatic    #220 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #222 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #224 <Method void RobotCleanActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #220 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0067);
	//   13   23:aload_0         
	//   14   24:ldc1            #225 <Int 0x7f0b0067>
	//   15   26:invokevirtual   #229 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void onDataDeserializationErrorEvent(DataDeserializationErrorEvent datadeserializationerrorevent)
	{
		org.androidannotations.api.b.a("", new Runnable(datadeserializationerrorevent) {

			public void run()
			{
				com.irobot.home.RobotCleanActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RobotCleanActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field DataDeserializationErrorEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RobotCleanActivity_.a(RobotCleanActivity_, DataDeserializationErrorEvent)>
			//    5   11:return          
			}

			final DataDeserializationErrorEvent a;
			final RobotCleanActivity_ b;

			
			{
				b = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotCleanActivity_ b>
				a = datadeserializationerrorevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field DataDeserializationErrorEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #149 <String "">
	//    1    2:new             #12  <Class RobotCleanActivity_$10>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #231 <Method void RobotCleanActivity_$10(RobotCleanActivity_, DataDeserializationErrorEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #166 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onRobotBatteryLevelEvent(RobotBatteryLevelEvent robotbatterylevelevent)
	{
		org.androidannotations.api.b.a("", new Runnable(robotbatterylevelevent) {

			public void run()
			{
				com.irobot.home.RobotCleanActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RobotCleanActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field RobotBatteryLevelEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RobotCleanActivity_.a(RobotCleanActivity_, RobotBatteryLevelEvent)>
			//    5   11:return          
			}

			final RobotBatteryLevelEvent a;
			final RobotCleanActivity_ b;

			
			{
				b = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotCleanActivity_ b>
				a = robotbatterylevelevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field RobotBatteryLevelEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #149 <String "">
	//    1    2:new             #16  <Class RobotCleanActivity_$12>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #233 <Method void RobotCleanActivity_$12(RobotCleanActivity_, RobotBatteryLevelEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #166 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void p()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					RobotCleanActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RobotCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void RobotCleanActivity_.d(RobotCleanActivity_)>
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

			final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RobotCleanActivity_ a>
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
	//    0    0:new             #22  <Class RobotCleanActivity_$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #149 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #149 <String "">
	//    6   10:invokespecial   #234 <Method void RobotCleanActivity_$2(RobotCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #157 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void q()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotCleanActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotCleanActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.RobotCleanActivity_.a(RobotCleanActivity_)>
			//    3    7:return          
			}

			final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #149 <String "">
	//    1    2:new             #36  <Class RobotCleanActivity_$9>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #235 <Method void RobotCleanActivity_$9(RobotCleanActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #166 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #236 <Method void RobotCleanActivity.setContentView(int)>
		w.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field c w>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #238 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #241 <Method void RobotCleanActivity.setContentView(View)>
		w.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field c w>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #238 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #244 <Method void RobotCleanActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		w.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #50  <Field c w>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #238 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #248 <Method void RobotCleanActivity.setIntent(Intent)>
		O();
	//    3    5:aload_0         
	//    4    6:invokespecial   #96  <Method void O()>
	//    5    9:return          
	}

	public void x()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.RobotCleanActivity_.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RobotCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.RobotCleanActivity_.e(RobotCleanActivity_)>
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

			final RobotCleanActivity_ a;

			
			{
				a = RobotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RobotCleanActivity_ a>
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
	//    0    0:new             #24  <Class RobotCleanActivity_$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #149 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #149 <String "">
	//    6   10:invokespecial   #249 <Method void RobotCleanActivity_$3(RobotCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #157 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	private final c w = new c();
}
