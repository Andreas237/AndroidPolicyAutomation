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
import android.widget.ListView;
import android.widget.ProgressBar;
import com.irobot.core.AssetOtaUpdateStatusEvent;
import com.irobot.core.ConnectionStateEvent;
import com.irobot.home.model.RobotLanguage;
import com.irobot.home.model.rest.LanguagePack;
import java.util.ArrayList;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			RoombaV2LanguageListActivity, IRobotApplication_

public final class RoombaV2LanguageListActivity_ extends RoombaV2LanguageListActivity
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
		//    4    7:checkcast       #2   <Class RoombaV2LanguageListActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("supportsLanguageOta", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "supportsLanguageOta">
		//    2    3:iload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class RoombaV2LanguageListActivity_$a>
		//    5   10:areturn         
		}

		public e a(int l)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, l);
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
				d.startActivityForResult(c, l, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, l, a);
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
			super(context, com/irobot/home/RoombaV2LanguageListActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class RoombaV2LanguageListActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public RoombaV2LanguageListActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void RoombaV2LanguageListActivity()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void c()>
	//    6   12:putfield        #48  <Field c k>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #36  <Class RoombaV2LanguageListActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void RoombaV2LanguageListActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method void c.a(b)>
		c = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #63  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #67  <Field IRobotApplication c>
		k();
	//    5   11:aload_0         
	//    6   12:invokespecial   #69  <Method void k()>
	//    7   15:return          
	}

	static void a(RoombaV2LanguageListActivity_ roombav2languagelistactivity_)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void RoombaV2LanguageListActivity.g()>
	//    2    4:return          
	}

	static void a(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, int l)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.f(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #78  <Method void RoombaV2LanguageListActivity.f(int)>
	//    3    5:return          
	}

	static void a(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, AssetOtaUpdateStatusEvent assetotaupdatestatusevent)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.onAssetOtaUpdateStatusEvent(assetotaupdatestatusevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method void RoombaV2LanguageListActivity.onAssetOtaUpdateStatusEvent(AssetOtaUpdateStatusEvent)>
	//    3    5:return          
	}

	static void a(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, ConnectionStateEvent connectionstateevent)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.onConnectionStateEvent(connectionstateevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #88  <Method void RoombaV2LanguageListActivity.onConnectionStateEvent(ConnectionStateEvent)>
	//    3    5:return          
	}

	static void a(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, RobotLanguage robotlanguage)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).com.irobot.home.RoombaV2LanguageListActivity.a(robotlanguage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void com.irobot.home.RoombaV2LanguageListActivity.a(RobotLanguage)>
	//    3    5:return          
	}

	static void a(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, LanguagePack languagepack)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).com.irobot.home.RoombaV2LanguageListActivity.a(languagepack);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void com.irobot.home.RoombaV2LanguageListActivity.a(LanguagePack)>
	//    3    5:return          
	}

	static void a(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, ArrayList arraylist)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.processAvailableLanguages(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void RoombaV2LanguageListActivity.processAvailableLanguages(ArrayList)>
	//    3    5:return          
	}

	static void a(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, boolean flag)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).com.irobot.home.RoombaV2LanguageListActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #105 <Method void com.irobot.home.RoombaV2LanguageListActivity.a(boolean)>
	//    3    5:return          
	}

	static void b(RoombaV2LanguageListActivity_ roombav2languagelistactivity_)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void RoombaV2LanguageListActivity.i()>
	//    2    4:return          
	}

	static void b(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, int l)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.g(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #111 <Method void RoombaV2LanguageListActivity.g(int)>
	//    3    5:return          
	}

	static void c(RoombaV2LanguageListActivity_ roombav2languagelistactivity_)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method void RoombaV2LanguageListActivity.f()>
	//    2    4:return          
	}

	static void c(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, int l)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.h(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #116 <Method void RoombaV2LanguageListActivity.h(int)>
	//    3    5:return          
	}

	static void d(RoombaV2LanguageListActivity_ roombav2languagelistactivity_)
	{
		((RoombaV2LanguageListActivity) (roombav2languagelistactivity_)).RoombaV2LanguageListActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method void RoombaV2LanguageListActivity.j()>
	//    2    4:return          
	}

	private void k()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method Intent getIntent()>
	//    2    4:invokevirtual   #130 <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("robotBlid"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #132 <String "robotBlid">
	//*   8   15:invokevirtual   #138 <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				d = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #132 <String "robotBlid">
	//   13   25:invokevirtual   #142 <Method String Bundle.getString(String)>
	//   14   28:putfield        #145 <Field String d>
			if(bundle.containsKey("supportsLanguageOta"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #147 <String "supportsLanguageOta">
	//*  17   34:invokevirtual   #138 <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				e = bundle.getBoolean("supportsLanguageOta");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #147 <String "supportsLanguageOta">
	//   22   44:invokevirtual   #150 <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #154 <Field boolean e>
		}
	//   24   50:return          
	}

	public View a(int l)
	{
		return findViewById(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #158 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(RobotLanguage robotlanguage)
	{
		org.androidannotations.api.b.a("", new Runnable(robotlanguage) {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RoombaV2LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field RobotLanguage a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.RoombaV2LanguageListActivity_.a(RoombaV2LanguageListActivity_, RobotLanguage)>
			//    5   11:return          
			}

			final RobotLanguage a;
			final RoombaV2LanguageListActivity_ b;

			
			{
				b = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RoombaV2LanguageListActivity_ b>
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
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #28  <Class RoombaV2LanguageListActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #164 <Method void RoombaV2LanguageListActivity_$6(RoombaV2LanguageListActivity_, RobotLanguage)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(LanguagePack languagepack)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", languagepack) {

			public void a()
			{
				try
				{
					com.irobot.home.RoombaV2LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field RoombaV2LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field LanguagePack a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaV2LanguageListActivity_.a(RoombaV2LanguageListActivity_, LanguagePack)>
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

			final LanguagePack a;
			final RoombaV2LanguageListActivity_ b;

			
			{
				b = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaV2LanguageListActivity_ b>
				a = languagepack;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #18  <Field LanguagePack a>
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
	//    0    0:new             #24  <Class RoombaV2LanguageListActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #162 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #162 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #172 <Method void RoombaV2LanguageListActivity_$4(RoombaV2LanguageListActivity_, String, long, String, LanguagePack)>
	//    8   14:invokestatic    #177 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		f = (ListView)a1.a(0x7f0901ff);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #179 <Int 0x7f0901ff>
	//    3    4:invokeinterface #181 <Method View a.a(int)>
	//    4    9:checkcast       #183 <Class ListView>
	//    5   12:putfield        #186 <Field ListView f>
		g = (ProgressBar)a1.a(0x7f090223);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #187 <Int 0x7f090223>
	//    9   19:invokeinterface #181 <Method View a.a(int)>
	//   10   24:checkcast       #189 <Class ProgressBar>
	//   11   27:putfield        #192 <Field ProgressBar g>
		e();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #194 <Method void e()>
	//   14   34:return          
	}

	public void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RoombaV2LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.RoombaV2LanguageListActivity_.a(RoombaV2LanguageListActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final RoombaV2LanguageListActivity_ b;

			
			{
				b = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RoombaV2LanguageListActivity_ b>
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
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #34  <Class RoombaV2LanguageListActivity_$9>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #196 <Method void RoombaV2LanguageListActivity_$9(RoombaV2LanguageListActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.RoombaV2LanguageListActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RoombaV2LanguageListActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.RoombaV2LanguageListActivity_.c(RoombaV2LanguageListActivity_)>
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

			final RoombaV2LanguageListActivity_ a;

			
			{
				a = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RoombaV2LanguageListActivity_ a>
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
	//    0    0:new             #22  <Class RoombaV2LanguageListActivity_$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #162 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #162 <String "">
	//    6   10:invokespecial   #199 <Method void RoombaV2LanguageListActivity_$3(RoombaV2LanguageListActivity_, String, long, String)>
	//    7   13:invokestatic    #177 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void f(int l)
	{
		org.androidannotations.api.b.a("", new Runnable(l) {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV2LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaV2LanguageListActivity_.a(RoombaV2LanguageListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final RoombaV2LanguageListActivity_ b;

			
			{
				b = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity_ b>
				a = l;
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
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #30  <Class RoombaV2LanguageListActivity_$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #201 <Method void RoombaV2LanguageListActivity_$7(RoombaV2LanguageListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoombaV2LanguageListActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.RoombaV2LanguageListActivity_.a(RoombaV2LanguageListActivity_)>
			//    3    7:return          
			}

			final RoombaV2LanguageListActivity_ a;

			
			{
				a = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaV2LanguageListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #10  <Class RoombaV2LanguageListActivity_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #203 <Method void RoombaV2LanguageListActivity_$1(RoombaV2LanguageListActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void g(int l)
	{
		org.androidannotations.api.b.a("", new Runnable(l) {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV2LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaV2LanguageListActivity_.b(RoombaV2LanguageListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final RoombaV2LanguageListActivity_ b;

			
			{
				b = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity_ b>
				a = l;
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
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #32  <Class RoombaV2LanguageListActivity_$8>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #204 <Method void RoombaV2LanguageListActivity_$8(RoombaV2LanguageListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void h(int l)
	{
		org.androidannotations.api.b.a("", new Runnable(l) {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.c(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV2LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #29  <Method void com.irobot.home.RoombaV2LanguageListActivity_.c(RoombaV2LanguageListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final RoombaV2LanguageListActivity_ b;

			
			{
				b = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity_ b>
				a = l;
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
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #12  <Class RoombaV2LanguageListActivity_$10>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #205 <Method void RoombaV2LanguageListActivity_$10(RoombaV2LanguageListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void i()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoombaV2LanguageListActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.RoombaV2LanguageListActivity_.b(RoombaV2LanguageListActivity_)>
			//    3    7:return          
			}

			final RoombaV2LanguageListActivity_ a;

			
			{
				a = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaV2LanguageListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #20  <Class RoombaV2LanguageListActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #206 <Method void RoombaV2LanguageListActivity_$2(RoombaV2LanguageListActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void j()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					RoombaV2LanguageListActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RoombaV2LanguageListActivity_ a>
			//    2    4:invokestatic    #25  <Method void RoombaV2LanguageListActivity_.d(RoombaV2LanguageListActivity_)>
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

			final RoombaV2LanguageListActivity_ a;

			
			{
				a = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RoombaV2LanguageListActivity_ a>
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
	//    0    0:new             #26  <Class RoombaV2LanguageListActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #162 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #162 <String "">
	//    6   10:invokespecial   #207 <Method void RoombaV2LanguageListActivity_$5(RoombaV2LanguageListActivity_, String, long, String)>
	//    7   13:invokestatic    #177 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onAssetOtaUpdateStatusEvent(AssetOtaUpdateStatusEvent assetotaupdatestatusevent)
	{
		org.androidannotations.api.b.a("", new Runnable(assetotaupdatestatusevent) {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV2LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AssetOtaUpdateStatusEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaV2LanguageListActivity_.a(RoombaV2LanguageListActivity_, AssetOtaUpdateStatusEvent)>
			//    5   11:return          
			}

			final AssetOtaUpdateStatusEvent a;
			final RoombaV2LanguageListActivity_ b;

			
			{
				b = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity_ b>
				a = assetotaupdatestatusevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetOtaUpdateStatusEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #18  <Class RoombaV2LanguageListActivity_$13>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #210 <Method void RoombaV2LanguageListActivity_$13(RoombaV2LanguageListActivity_, AssetOtaUpdateStatusEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onConnectionStateEvent(ConnectionStateEvent connectionstateevent)
	{
		org.androidannotations.api.b.a("", new Runnable(connectionstateevent) {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV2LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field ConnectionStateEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaV2LanguageListActivity_.a(RoombaV2LanguageListActivity_, ConnectionStateEvent)>
			//    5   11:return          
			}

			final ConnectionStateEvent a;
			final RoombaV2LanguageListActivity_ b;

			
			{
				b = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity_ b>
				a = connectionstateevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ConnectionStateEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #14  <Class RoombaV2LanguageListActivity_$11>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #213 <Method void RoombaV2LanguageListActivity_$11(RoombaV2LanguageListActivity_, ConnectionStateEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(k);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field c k>
	//    2    4:invokestatic    #217 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #219 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #221 <Method void RoombaV2LanguageListActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #217 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0066);
	//   13   23:aload_0         
	//   14   24:ldc1            #222 <Int 0x7f0b0066>
	//   15   26:invokevirtual   #225 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void processAvailableLanguages(ArrayList arraylist)
	{
		org.androidannotations.api.b.a("", new Runnable(arraylist) {

			public void run()
			{
				com.irobot.home.RoombaV2LanguageListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RoombaV2LanguageListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field ArrayList a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RoombaV2LanguageListActivity_.a(RoombaV2LanguageListActivity_, ArrayList)>
			//    5   11:return          
			}

			final ArrayList a;
			final RoombaV2LanguageListActivity_ b;

			
			{
				b = RoombaV2LanguageListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity_ b>
				a = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ArrayList a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #162 <String "">
	//    1    2:new             #16  <Class RoombaV2LanguageListActivity_$12>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #227 <Method void RoombaV2LanguageListActivity_$12(RoombaV2LanguageListActivity_, ArrayList)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #169 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void setContentView(int l)
	{
		super.setContentView(l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #229 <Method void RoombaV2LanguageListActivity.setContentView(int)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #231 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #234 <Method void RoombaV2LanguageListActivity.setContentView(View)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #231 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #237 <Method void RoombaV2LanguageListActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field c k>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #231 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #241 <Method void RoombaV2LanguageListActivity.setIntent(Intent)>
		k();
	//    3    5:aload_0         
	//    4    6:invokespecial   #69  <Method void k()>
	//    5    9:return          
	}

	private final c k = new c();
}
