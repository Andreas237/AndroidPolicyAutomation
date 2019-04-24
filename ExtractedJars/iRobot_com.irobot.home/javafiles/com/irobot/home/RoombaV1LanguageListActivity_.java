// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.irobot.home.model.RobotLanguage;
import com.irobot.home.model.rest.LanguagePack;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			RoombaV1LanguageListActivity, IRobotApplication_

public final class RoombaV1LanguageListActivity_ extends RoombaV1LanguageListActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "robotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class RoombaV1LanguageListActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("supportsLanguageOta", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "supportsLanguageOta">
		//    2    3:iload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class RoombaV1LanguageListActivity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #37  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #43  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #45  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, j, a);
		//   13   29:aload_0         
		//   14   30:getfield        #45  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #37  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #48  <Field Bundle a>
		//   20   42:invokevirtual   #53  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #57  <Field Context b>
		//*  24   52:instanceof      #59  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
		//   26   58:aload_0         
		//   27   59:getfield        #57  <Field Context b>
		//   28   62:checkcast       #59  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #37  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #48  <Field Bundle a>
		//   34   74:invokestatic    #64  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #57  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #37  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #48  <Field Bundle a>
		//   42   92:invokevirtual   #70  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #72  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #57  <Field Context b>
		//   47  103:invokespecial   #74  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/RoombaV1LanguageListActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class RoombaV1LanguageListActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public RoombaV1LanguageListActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void RoombaV1LanguageListActivity()>
	//    2    4:aload_0         
	//    3    5:new             #39  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void c()>
	//    6   12:putfield        #42  <Field c k>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #30  <Class RoombaV1LanguageListActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #47  <Method void RoombaV1LanguageListActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #51  <Method void c.a(b)>
		c = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #57  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #61  <Field IRobotApplication c>
		i();
	//    5   11:aload_0         
	//    6   12:invokespecial   #64  <Method void i()>
	//    7   15:return          
	}

	static void a(RoombaV1LanguageListActivity_ roombav1languagelistactivity_)
	{
		((RoombaV1LanguageListActivity) (roombav1languagelistactivity_)).RoombaV1LanguageListActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void RoombaV1LanguageListActivity.g()>
	//    2    4:return          
	}

	static void a(RoombaV1LanguageListActivity_ roombav1languagelistactivity_, int j)
	{
		((RoombaV1LanguageListActivity) (roombav1languagelistactivity_)).RoombaV1LanguageListActivity.f(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method void RoombaV1LanguageListActivity.f(int)>
	//    3    5:return          
	}

	static void a(RoombaV1LanguageListActivity_ roombav1languagelistactivity_, Parcelable parcelable)
	{
		((RoombaV1LanguageListActivity) (roombav1languagelistactivity_)).com.irobot.home.RoombaV1LanguageListActivity.e(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method void com.irobot.home.RoombaV1LanguageListActivity.e(Parcelable)>
	//    3    5:return          
	}

	static void a(RoombaV1LanguageListActivity_ roombav1languagelistactivity_, RobotLanguage robotlanguage)
	{
		((RoombaV1LanguageListActivity) (roombav1languagelistactivity_)).com.irobot.home.RoombaV1LanguageListActivity.a(robotlanguage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void com.irobot.home.RoombaV1LanguageListActivity.a(RobotLanguage)>
	//    3    5:return          
	}

	static void a(RoombaV1LanguageListActivity_ roombav1languagelistactivity_, LanguagePack languagepack)
	{
		((RoombaV1LanguageListActivity) (roombav1languagelistactivity_)).com.irobot.home.RoombaV1LanguageListActivity.a(languagepack);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #86  <Method void com.irobot.home.RoombaV1LanguageListActivity.a(LanguagePack)>
	//    3    5:return          
	}

	static void a(RoombaV1LanguageListActivity_ roombav1languagelistactivity_, boolean flag)
	{
		((RoombaV1LanguageListActivity) (roombav1languagelistactivity_)).com.irobot.home.RoombaV1LanguageListActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #90  <Method void com.irobot.home.RoombaV1LanguageListActivity.a(boolean)>
	//    3    5:return          
	}

	static void b(RoombaV1LanguageListActivity_ roombav1languagelistactivity_)
	{
		((RoombaV1LanguageListActivity) (roombav1languagelistactivity_)).RoombaV1LanguageListActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void RoombaV1LanguageListActivity.f()>
	//    2    4:return          
	}

	static void b(RoombaV1LanguageListActivity_ roombav1languagelistactivity_, int j)
	{
		((RoombaV1LanguageListActivity) (roombav1languagelistactivity_)).RoombaV1LanguageListActivity.g(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #95  <Method void RoombaV1LanguageListActivity.g(int)>
	//    3    5:return          
	}

	static void c(RoombaV1LanguageListActivity_ roombav1languagelistactivity_, int j)
	{
		((RoombaV1LanguageListActivity) (roombav1languagelistactivity_)).RoombaV1LanguageListActivity.h(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #98  <Method void RoombaV1LanguageListActivity.h(int)>
	//    3    5:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method Intent getIntent()>
	//    2    4:invokevirtual   #108 <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("robotBlid"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #110 <String "robotBlid">
	//*   8   15:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				d = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #110 <String "robotBlid">
	//   13   25:invokevirtual   #120 <Method String Bundle.getString(String)>
	//   14   28:putfield        #124 <Field String d>
			if(bundle.containsKey("supportsLanguageOta"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #126 <String "supportsLanguageOta">
	//*  17   34:invokevirtual   #116 <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				e = bundle.getBoolean("supportsLanguageOta");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #126 <String "supportsLanguageOta">
	//   22   44:invokevirtual   #129 <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #132 <Field boolean e>
		}
	//   24   50:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #136 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(RobotLanguage robotlanguage)
	{
		org.androidannotations.api.b.a("", new Runnable(robotlanguage) {

			public void run()
			{
				com.irobot.home.RoombaV1LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RoombaV1LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field RobotLanguage a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.RoombaV1LanguageListActivity_.a(RoombaV1LanguageListActivity_, RobotLanguage)>
			//    5   11:return          
			}

			final RobotLanguage a;
			final RoombaV1LanguageListActivity_ b;

			
			{
				b = RoombaV1LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RoombaV1LanguageListActivity_ b>
				a = robotlanguage;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field RobotLanguage a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #140 <String "">
	//    1    2:new             #12  <Class RoombaV1LanguageListActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #142 <Method void RoombaV1LanguageListActivity_$2(RoombaV1LanguageListActivity_, RobotLanguage)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #147 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(LanguagePack languagepack)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", languagepack) {

			public void a()
			{
				try
				{
					org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a(this, "", 0L, "") {

						public void a()
						{
							try
							{
								com.irobot.home.RoombaV1LanguageListActivity_.a(a.b, a.a);
						//    0    0:aload_0         
						//    1    1:getfield        #14  <Field RoombaV1LanguageListActivity_$8 a>
						//    2    4:getfield        #24  <Field RoombaV1LanguageListActivity_ com.irobot.home.RoombaV1LanguageListActivity_$8.b>
						//    3    7:aload_0         
						//    4    8:getfield        #14  <Field RoombaV1LanguageListActivity_$8 a>
						//    5   11:getfield        #27  <Field LanguagePack com.irobot.home.RoombaV1LanguageListActivity_$8.a>
						//    6   14:invokestatic    #32  <Method void com.irobot.home.RoombaV1LanguageListActivity_.a(RoombaV1LanguageListActivity_, LanguagePack)>
								return;
						//    7   17:return          
							}
							catch(Throwable throwable)
						//*   8   18:astore_1        
							{
								Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
						//    9   19:invokestatic    #38  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
						//   10   22:invokestatic    #42  <Method Thread Thread.currentThread()>
						//   11   25:aload_1         
						//   12   26:invokeinterface #48  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
							}
						//   13   31:return          
						}

						final _cls8 a;

			
			{
				a = _pcls8;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RoombaV1LanguageListActivity_$8 a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #17  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
					}
)));
			//    0    0:new             #11  <Class RoombaV1LanguageListActivity_$8$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:ldc1            #29  <String "">
			//    4    7:lconst_0        
			//    5    8:ldc1            #29  <String "">
			//    6   10:invokespecial   #32  <Method void RoombaV1LanguageListActivity_$8$1(RoombaV1LanguageListActivity_$8, String, long, String)>
			//    7   13:invokestatic    #37  <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
					return;
			//    8   16:return          
				}
				catch(Throwable throwable)
			//*   9   17:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//   10   18:invokestatic    #43  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//   11   21:invokestatic    #47  <Method Thread Thread.currentThread()>
			//   12   24:aload_1         
			//   13   25:invokeinterface #53  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   14   30:return          
			}

			final LanguagePack a;
			final RoombaV1LanguageListActivity_ b;

			
			{
				b = RoombaV1LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RoombaV1LanguageListActivity_ b>
				a = languagepack;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #20  <Field LanguagePack a>
				super(s, l, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #23  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #24  <Class RoombaV1LanguageListActivity_$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #140 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #140 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #150 <Method void RoombaV1LanguageListActivity_$8(RoombaV1LanguageListActivity_, String, long, String, LanguagePack)>
	//    8   14:invokestatic    #155 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		f = (ListView)a1.a(0x7f0901ff);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #157 <Int 0x7f0901ff>
	//    3    4:invokeinterface #159 <Method View a.a(int)>
	//    4    9:checkcast       #161 <Class ListView>
	//    5   12:putfield        #164 <Field ListView f>
		g = (ProgressBar)a1.a(0x7f090223);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #165 <Int 0x7f090223>
	//    9   19:invokeinterface #159 <Method View a.a(int)>
	//   10   24:checkcast       #167 <Class ProgressBar>
	//   11   27:putfield        #170 <Field ProgressBar g>
		e();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #172 <Method void e()>
	//   14   34:return          
	}

	public void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.RoombaV1LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RoombaV1LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.RoombaV1LanguageListActivity_.a(RoombaV1LanguageListActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final RoombaV1LanguageListActivity_ b;

			
			{
				b = RoombaV1LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RoombaV1LanguageListActivity_ b>
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
	//    0    0:ldc1            #140 <String "">
	//    1    2:new             #18  <Class RoombaV1LanguageListActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #174 <Method void RoombaV1LanguageListActivity_$5(RoombaV1LanguageListActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #147 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void e(Parcelable parcelable)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("checkForNewLanguage", 0L, "", parcelable) {

			public void a()
			{
				try
				{
					com.irobot.home.RoombaV1LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoombaV1LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field Parcelable a>
			//    4    8:invokestatic    #29  <Method void com.irobot.home.RoombaV1LanguageListActivity_.a(RoombaV1LanguageListActivity_, Parcelable)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #35  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #39  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #45  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final Parcelable a;
			final RoombaV1LanguageListActivity_ b;

			
			{
				b = RoombaV1LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaV1LanguageListActivity_ b>
				a = parcelable;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #19  <Field Parcelable a>
				super(s, l, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #22  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #28  <Class RoombaV1LanguageListActivity_$9>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #176 <String "checkForNewLanguage">
	//    4    7:lconst_0        
	//    5    8:ldc1            #140 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #179 <Method void RoombaV1LanguageListActivity_$9(RoombaV1LanguageListActivity_, String, long, String, Parcelable)>
	//    8   14:invokestatic    #155 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.RoombaV1LanguageListActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RoombaV1LanguageListActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.RoombaV1LanguageListActivity_.b(RoombaV1LanguageListActivity_)>
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

			final RoombaV1LanguageListActivity_ a;

			
			{
				a = RoombaV1LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RoombaV1LanguageListActivity_ a>
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
	//    0    0:new             #22  <Class RoombaV1LanguageListActivity_$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #140 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #140 <String "">
	//    6   10:invokespecial   #182 <Method void RoombaV1LanguageListActivity_$7(RoombaV1LanguageListActivity_, String, long, String)>
	//    7   13:invokestatic    #155 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void f(int j)
	{
		org.androidannotations.api.b.a("", new Runnable(j) {

			public void run()
			{
				com.irobot.home.RoombaV1LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV1LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaV1LanguageListActivity_.a(RoombaV1LanguageListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final RoombaV1LanguageListActivity_ b;

			
			{
				b = RoombaV1LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV1LanguageListActivity_ b>
				a = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #140 <String "">
	//    1    2:new             #14  <Class RoombaV1LanguageListActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #184 <Method void RoombaV1LanguageListActivity_$3(RoombaV1LanguageListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #147 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RoombaV1LanguageListActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoombaV1LanguageListActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.RoombaV1LanguageListActivity_.a(RoombaV1LanguageListActivity_)>
			//    3    7:return          
			}

			final RoombaV1LanguageListActivity_ a;

			
			{
				a = RoombaV1LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaV1LanguageListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #140 <String "">
	//    1    2:new             #10  <Class RoombaV1LanguageListActivity_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #186 <Method void RoombaV1LanguageListActivity_$1(RoombaV1LanguageListActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #147 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void g(int j)
	{
		org.androidannotations.api.b.a("", new Runnable(j) {

			public void run()
			{
				com.irobot.home.RoombaV1LanguageListActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV1LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaV1LanguageListActivity_.b(RoombaV1LanguageListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final RoombaV1LanguageListActivity_ b;

			
			{
				b = RoombaV1LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV1LanguageListActivity_ b>
				a = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #140 <String "">
	//    1    2:new             #16  <Class RoombaV1LanguageListActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #187 <Method void RoombaV1LanguageListActivity_$4(RoombaV1LanguageListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #147 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void h(int j)
	{
		org.androidannotations.api.b.a("", new Runnable(j) {

			public void run()
			{
				com.irobot.home.RoombaV1LanguageListActivity_.c(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV1LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #29  <Method void com.irobot.home.RoombaV1LanguageListActivity_.c(RoombaV1LanguageListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final RoombaV1LanguageListActivity_ b;

			
			{
				b = RoombaV1LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV1LanguageListActivity_ b>
				a = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #140 <String "">
	//    1    2:new             #20  <Class RoombaV1LanguageListActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #188 <Method void RoombaV1LanguageListActivity_$6(RoombaV1LanguageListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #147 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(k);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field c k>
	//    2    4:invokestatic    #192 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #194 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #196 <Method void RoombaV1LanguageListActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #192 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0066);
	//   13   23:aload_0         
	//   14   24:ldc1            #197 <Int 0x7f0b0066>
	//   15   26:invokevirtual   #200 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #201 <Method void RoombaV1LanguageListActivity.setContentView(int)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #203 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #206 <Method void RoombaV1LanguageListActivity.setContentView(View)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #203 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #209 <Method void RoombaV1LanguageListActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field c k>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #203 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #213 <Method void RoombaV1LanguageListActivity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #64  <Method void i()>
	//    5    9:return          
	}

	private final c k = new c();
}
