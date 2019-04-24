// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.irobot.core.AccountLoggedOutEvent;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.ResolvedMissionStatusEvent;
import com.irobot.core.RobotBatteryLevelEvent;
import com.irobot.core.RobotPadCategoryEvent;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaCleanActivity, IRobotApplication_

public final class BraavaCleanActivity_ extends BraavaCleanActivity
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
			super(context, com/irobot/home/BraavaCleanActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BraavaCleanActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BraavaCleanActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void BraavaCleanActivity()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void c()>
	//    6   12:putfield        #48  <Field c t>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #36  <Class BraavaCleanActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void BraavaCleanActivity_$a(Context)>
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
	//    5   11:return          
	}

	static void a(BraavaCleanActivity_ braavacleanactivity_)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void BraavaCleanActivity.q()>
	//    2    4:return          
	}

	static void a(BraavaCleanActivity_ braavacleanactivity_, AccountLoggedOutEvent accountloggedoutevent)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.onAccountLoggedOutEvent(accountloggedoutevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #75  <Method void BraavaCleanActivity.onAccountLoggedOutEvent(AccountLoggedOutEvent)>
	//    3    5:return          
	}

	static void a(BraavaCleanActivity_ braavacleanactivity_, AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.onAssetUpdateAvailabilityEvent(assetupdateavailabilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void BraavaCleanActivity.onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent)>
	//    3    5:return          
	}

	static void a(BraavaCleanActivity_ braavacleanactivity_, ResolvedMissionStatusEvent resolvedmissionstatusevent)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.onResolvedMissionStatusEvent(resolvedmissionstatusevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void BraavaCleanActivity.onResolvedMissionStatusEvent(ResolvedMissionStatusEvent)>
	//    3    5:return          
	}

	static void a(BraavaCleanActivity_ braavacleanactivity_, RobotBatteryLevelEvent robotbatterylevelevent)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.onRobotBatteryLevelEvent(robotbatterylevelevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void BraavaCleanActivity.onRobotBatteryLevelEvent(RobotBatteryLevelEvent)>
	//    3    5:return          
	}

	static void a(BraavaCleanActivity_ braavacleanactivity_, RobotPadCategoryEvent robotpadcategoryevent)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.onRobotPadCategoryEvent(robotpadcategoryevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #95  <Method void BraavaCleanActivity.onRobotPadCategoryEvent(RobotPadCategoryEvent)>
	//    3    5:return          
	}

	static void b(BraavaCleanActivity_ braavacleanactivity_)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.z();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void BraavaCleanActivity.z()>
	//    2    4:return          
	}

	static void b(BraavaCleanActivity_ braavacleanactivity_, AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.onAssetUpdateAvailabilityEvent(assetupdateavailabilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void BraavaCleanActivity.onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent)>
	//    3    5:return          
	}

	static void b(BraavaCleanActivity_ braavacleanactivity_, ResolvedMissionStatusEvent resolvedmissionstatusevent)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.onResolvedMissionStatusEvent(resolvedmissionstatusevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void BraavaCleanActivity.onResolvedMissionStatusEvent(ResolvedMissionStatusEvent)>
	//    3    5:return          
	}

	static void b(BraavaCleanActivity_ braavacleanactivity_, RobotBatteryLevelEvent robotbatterylevelevent)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.onRobotBatteryLevelEvent(robotbatterylevelevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void BraavaCleanActivity.onRobotBatteryLevelEvent(RobotBatteryLevelEvent)>
	//    3    5:return          
	}

	static void b(BraavaCleanActivity_ braavacleanactivity_, RobotPadCategoryEvent robotpadcategoryevent)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.onRobotPadCategoryEvent(robotpadcategoryevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #95  <Method void BraavaCleanActivity.onRobotPadCategoryEvent(RobotPadCategoryEvent)>
	//    3    5:return          
	}

	static void c(BraavaCleanActivity_ braavacleanactivity_)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.z();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void BraavaCleanActivity.z()>
	//    2    4:return          
	}

	static void d(BraavaCleanActivity_ braavacleanactivity_)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method void BraavaCleanActivity.f()>
	//    2    4:return          
	}

	static void e(BraavaCleanActivity_ braavacleanactivity_)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void BraavaCleanActivity.p()>
	//    2    4:return          
	}

	static void f(BraavaCleanActivity_ braavacleanactivity_)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.C();
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void BraavaCleanActivity.C()>
	//    2    4:return          
	}

	static void g(BraavaCleanActivity_ braavacleanactivity_)
	{
		((BraavaCleanActivity) (braavacleanactivity_)).BraavaCleanActivity.F();
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method void BraavaCleanActivity.F()>
	//    2    4:return          
	}

	protected void C()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					BraavaCleanActivity_.f(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BraavaCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void BraavaCleanActivity_.f(BraavaCleanActivity_)>
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

			final BraavaCleanActivity_ a;

			
			{
				a = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BraavaCleanActivity_ a>
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
	//    0    0:new             #24  <Class BraavaCleanActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #117 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #117 <String "">
	//    6   10:invokespecial   #120 <Method void BraavaCleanActivity_$4(BraavaCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #125 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void F()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					BraavaCleanActivity_.g(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BraavaCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void BraavaCleanActivity_.g(BraavaCleanActivity_)>
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

			final BraavaCleanActivity_ a;

			
			{
				a = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BraavaCleanActivity_ a>
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
	//    0    0:new             #26  <Class BraavaCleanActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #117 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #117 <String "">
	//    6   10:invokespecial   #126 <Method void BraavaCleanActivity_$5(BraavaCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #125 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #130 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = a1.a(0x7f09015e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #134 <Int 0x7f09015e>
	//    3    4:invokeinterface #136 <Method View a.a(int)>
	//    4    9:putfield        #139 <Field View c>
		d = (ImageView)a1.a(0x7f09024f);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:ldc1            #140 <Int 0x7f09024f>
	//    8   16:invokeinterface #136 <Method View a.a(int)>
	//    9   21:checkcast       #142 <Class ImageView>
	//   10   24:putfield        #145 <Field ImageView d>
		e = (RelativeLayout)a1.a(0x7f090291);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #146 <Int 0x7f090291>
	//   14   31:invokeinterface #136 <Method View a.a(int)>
	//   15   36:checkcast       #148 <Class RelativeLayout>
	//   16   39:putfield        #151 <Field RelativeLayout e>
		f = (ImageView)a1.a(0x7f090290);
	//   17   42:aload_0         
	//   18   43:aload_1         
	//   19   44:ldc1            #152 <Int 0x7f090290>
	//   20   46:invokeinterface #136 <Method View a.a(int)>
	//   21   51:checkcast       #142 <Class ImageView>
	//   22   54:putfield        #154 <Field ImageView f>
		g = (LinearLayout)a1.a(0x7f0901b1);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #155 <Int 0x7f0901b1>
	//   26   61:invokeinterface #136 <Method View a.a(int)>
	//   27   66:checkcast       #157 <Class LinearLayout>
	//   28   69:putfield        #160 <Field LinearLayout g>
		if(d != null)
	//*  29   72:aload_0         
	//*  30   73:getfield        #145 <Field ImageView d>
	//*  31   76:ifnull          94
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaCleanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaCleanActivity_.j()>
				//    3    7:return          
				}

				final BraavaCleanActivity_ a;

			
			{
				a = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   32   79:aload_0         
	//   33   80:getfield        #145 <Field ImageView d>
	//   34   83:new             #10  <Class BraavaCleanActivity_$1>
	//   35   86:dup             
	//   36   87:aload_0         
	//   37   88:invokespecial   #162 <Method void BraavaCleanActivity_$1(BraavaCleanActivity_)>
	//   38   91:invokevirtual   #166 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  39   94:aload_0         
	//*  40   95:getfield        #151 <Field RelativeLayout e>
	//*  41   98:ifnull          116
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaCleanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaCleanActivity_.k()>
				//    3    7:return          
				}

				final BraavaCleanActivity_ a;

			
			{
				a = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   42  101:aload_0         
	//   43  102:getfield        #151 <Field RelativeLayout e>
	//   44  105:new             #28  <Class BraavaCleanActivity_$6>
	//   45  108:dup             
	//   46  109:aload_0         
	//   47  110:invokespecial   #167 <Method void BraavaCleanActivity_$6(BraavaCleanActivity_)>
	//   48  113:invokevirtual   #168 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   49  116:aload_0         
	//   50  117:invokevirtual   #170 <Method void e()>
	//   51  120:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					BraavaCleanActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BraavaCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void BraavaCleanActivity_.d(BraavaCleanActivity_)>
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

			final BraavaCleanActivity_ a;

			
			{
				a = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BraavaCleanActivity_ a>
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
	//    0    0:new             #20  <Class BraavaCleanActivity_$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #117 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #117 <String "">
	//    6   10:invokespecial   #171 <Method void BraavaCleanActivity_$2(BraavaCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #125 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onAccountLoggedOutEvent(AccountLoggedOutEvent accountloggedoutevent)
	{
		org.androidannotations.api.b.a("", new Runnable(accountloggedoutevent) {

			public void run()
			{
				com.irobot.home.BraavaCleanActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BraavaCleanActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AccountLoggedOutEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaCleanActivity_.a(BraavaCleanActivity_, AccountLoggedOutEvent)>
			//    5   11:return          
			}

			final AccountLoggedOutEvent a;
			final BraavaCleanActivity_ b;

			
			{
				b = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaCleanActivity_ b>
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
	//    0    0:ldc1            #117 <String "">
	//    1    2:new             #30  <Class BraavaCleanActivity_$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #174 <Method void BraavaCleanActivity_$7(BraavaCleanActivity_, AccountLoggedOutEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #186 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #192 <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #195 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       18
		{
			a(this, assetupdateavailabilityevent);
	//    4   12:aload_0         
	//    5   13:aload_1         
	//    6   14:invokestatic    #197 <Method void a(BraavaCleanActivity_, AssetUpdateAvailabilityEvent)>
			return;
	//    7   17:return          
		} else
		{
			org.androidannotations.api.b.a("", new Runnable(assetupdateavailabilityevent) {

				public void run()
				{
					com.irobot.home.BraavaCleanActivity_.b(b, a);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field BraavaCleanActivity_ b>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field AssetUpdateAvailabilityEvent a>
				//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaCleanActivity_.b(BraavaCleanActivity_, AssetUpdateAvailabilityEvent)>
				//    5   11:return          
				}

				final AssetUpdateAvailabilityEvent a;
				final BraavaCleanActivity_ b;

			
			{
				b = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaCleanActivity_ b>
				a = assetupdateavailabilityevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetUpdateAvailabilityEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
, 0L);
	//    8   18:ldc1            #117 <String "">
	//    9   20:new             #18  <Class BraavaCleanActivity_$13>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #199 <Method void BraavaCleanActivity_$13(BraavaCleanActivity_, AssetUpdateAvailabilityEvent)>
	//   14   29:lconst_0        
	//   15   30:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
			return;
	//   16   33:return          
		}
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(t);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field c t>
	//    2    4:invokestatic    #203 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #205 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #207 <Method void BraavaCleanActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #203 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0067);
	//   13   23:aload_0         
	//   14   24:ldc1            #208 <Int 0x7f0b0067>
	//   15   26:invokevirtual   #212 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void onResolvedMissionStatusEvent(ResolvedMissionStatusEvent resolvedmissionstatusevent)
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #186 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #192 <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #195 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       18
		{
			a(this, resolvedmissionstatusevent);
	//    4   12:aload_0         
	//    5   13:aload_1         
	//    6   14:invokestatic    #214 <Method void a(BraavaCleanActivity_, ResolvedMissionStatusEvent)>
			return;
	//    7   17:return          
		} else
		{
			org.androidannotations.api.b.a("", new Runnable(resolvedmissionstatusevent) {

				public void run()
				{
					com.irobot.home.BraavaCleanActivity_.b(b, a);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field BraavaCleanActivity_ b>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field ResolvedMissionStatusEvent a>
				//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaCleanActivity_.b(BraavaCleanActivity_, ResolvedMissionStatusEvent)>
				//    5   11:return          
				}

				final ResolvedMissionStatusEvent a;
				final BraavaCleanActivity_ b;

			
			{
				b = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaCleanActivity_ b>
				a = resolvedmissionstatusevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ResolvedMissionStatusEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
, 0L);
	//    8   18:ldc1            #117 <String "">
	//    9   20:new             #14  <Class BraavaCleanActivity_$11>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #216 <Method void BraavaCleanActivity_$11(BraavaCleanActivity_, ResolvedMissionStatusEvent)>
	//   14   29:lconst_0        
	//   15   30:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
			return;
	//   16   33:return          
		}
	}

	public void onRobotBatteryLevelEvent(RobotBatteryLevelEvent robotbatterylevelevent)
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #186 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #192 <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #195 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       18
		{
			a(this, robotbatterylevelevent);
	//    4   12:aload_0         
	//    5   13:aload_1         
	//    6   14:invokestatic    #221 <Method void a(BraavaCleanActivity_, RobotBatteryLevelEvent)>
			return;
	//    7   17:return          
		} else
		{
			org.androidannotations.api.b.a("", new Runnable(robotbatterylevelevent) {

				public void run()
				{
					com.irobot.home.BraavaCleanActivity_.b(b, a);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field BraavaCleanActivity_ b>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field RobotBatteryLevelEvent a>
				//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaCleanActivity_.b(BraavaCleanActivity_, RobotBatteryLevelEvent)>
				//    5   11:return          
				}

				final RobotBatteryLevelEvent a;
				final BraavaCleanActivity_ b;

			
			{
				b = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaCleanActivity_ b>
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
	//    8   18:ldc1            #117 <String "">
	//    9   20:new             #12  <Class BraavaCleanActivity_$10>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #223 <Method void BraavaCleanActivity_$10(BraavaCleanActivity_, RobotBatteryLevelEvent)>
	//   14   29:lconst_0        
	//   15   30:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
			return;
	//   16   33:return          
		}
	}

	public void onRobotPadCategoryEvent(RobotPadCategoryEvent robotpadcategoryevent)
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #186 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #192 <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #195 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       18
		{
			a(this, robotpadcategoryevent);
	//    4   12:aload_0         
	//    5   13:aload_1         
	//    6   14:invokestatic    #225 <Method void a(BraavaCleanActivity_, RobotPadCategoryEvent)>
			return;
	//    7   17:return          
		} else
		{
			org.androidannotations.api.b.a("", new Runnable(robotpadcategoryevent) {

				public void run()
				{
					com.irobot.home.BraavaCleanActivity_.b(b, a);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field BraavaCleanActivity_ b>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field RobotPadCategoryEvent a>
				//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaCleanActivity_.b(BraavaCleanActivity_, RobotPadCategoryEvent)>
				//    5   11:return          
				}

				final RobotPadCategoryEvent a;
				final BraavaCleanActivity_ b;

			
			{
				b = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaCleanActivity_ b>
				a = robotpadcategoryevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field RobotPadCategoryEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
, 0L);
	//    8   18:ldc1            #117 <String "">
	//    9   20:new             #16  <Class BraavaCleanActivity_$12>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #227 <Method void BraavaCleanActivity_$12(BraavaCleanActivity_, RobotPadCategoryEvent)>
	//   14   29:lconst_0        
	//   15   30:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
			return;
	//   16   33:return          
		}
	}

	protected void p()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.BraavaCleanActivity_.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BraavaCleanActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.BraavaCleanActivity_.e(BraavaCleanActivity_)>
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

			final BraavaCleanActivity_ a;

			
			{
				a = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BraavaCleanActivity_ a>
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
	//    0    0:new             #22  <Class BraavaCleanActivity_$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #117 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #117 <String "">
	//    6   10:invokespecial   #228 <Method void BraavaCleanActivity_$3(BraavaCleanActivity_, String, long, String)>
	//    7   13:invokestatic    #125 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void q()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BraavaCleanActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BraavaCleanActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.BraavaCleanActivity_.a(BraavaCleanActivity_)>
			//    3    7:return          
			}

			final BraavaCleanActivity_ a;

			
			{
				a = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #117 <String "">
	//    1    2:new             #32  <Class BraavaCleanActivity_$8>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #229 <Method void BraavaCleanActivity_$8(BraavaCleanActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #230 <Method void BraavaCleanActivity.setContentView(int)>
		t.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c t>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #232 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #235 <Method void BraavaCleanActivity.setContentView(View)>
		t.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c t>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #232 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #238 <Method void BraavaCleanActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		t.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field c t>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #232 <Method void c.a(a)>
	//    8   14:return          
	}

	public void z()
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #186 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #192 <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #195 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       17
		{
			b(this);
	//    4   12:aload_0         
	//    5   13:invokestatic    #240 <Method void b(BraavaCleanActivity_)>
			return;
	//    6   16:return          
		} else
		{
			org.androidannotations.api.b.a("", new Runnable() {

				public void run()
				{
					com.irobot.home.BraavaCleanActivity_.c(a);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BraavaCleanActivity_ a>
				//    2    4:invokestatic    #24  <Method void com.irobot.home.BraavaCleanActivity_.c(BraavaCleanActivity_)>
				//    3    7:return          
				}

				final BraavaCleanActivity_ a;

			
			{
				a = BraavaCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
, 0L);
	//    7   17:ldc1            #117 <String "">
	//    8   19:new             #34  <Class BraavaCleanActivity_$9>
	//    9   22:dup             
	//   10   23:aload_0         
	//   11   24:invokespecial   #241 <Method void BraavaCleanActivity_$9(BraavaCleanActivity_)>
	//   12   27:lconst_0        
	//   13   28:invokestatic    #179 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
			return;
	//   14   31:return          
		}
	}

	private final c t = new c();
}
