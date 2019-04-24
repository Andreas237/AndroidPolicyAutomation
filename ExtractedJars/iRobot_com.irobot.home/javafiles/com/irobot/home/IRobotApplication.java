// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.LocaleList;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import com.crashlytics.android.Crashlytics;
import com.irobot.core.AccountError;
import com.irobot.core.AccountErrorEvent;
import com.irobot.core.AccountInfo;
import com.irobot.core.AccountInfoUpdatedEvent;
import com.irobot.core.AccountLoggedInEvent;
import com.irobot.core.AccountLoggedOutEvent;
import com.irobot.core.AccountService;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ApplicationUIService;
import com.irobot.core.ApplicationUIServiceCommand;
import com.irobot.core.ApplicationUIServiceData;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetEvent;
import com.irobot.core.AssetId;
import com.irobot.core.ConnectFailureEvent;
import com.irobot.core.ConnectFailureReason;
import com.irobot.core.Core;
import com.irobot.core.EuropeanUnionCountries;
import com.irobot.core.Event;
import com.irobot.core.EventType;
import com.irobot.core.FeatureType;
import com.irobot.core.NetworkManager;
import com.irobot.core.NetworkStatistics;
import com.irobot.core.PersistentMapIdentifier;
import com.irobot.core.TimeService;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.o.b.a;
import com.irobot.home.q.b;
import com.irobot.home.rest.RegistrationRestClient;
import com.irobot.home.rest.RegistrationRestErrorHandler;
import com.irobot.home.service.RobotUploadService;
import com.irobot.home.util.StandbyModeDetector;
import com.irobot.home.util.i;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import com.irobot.home.util.p;
import com.irobot.home.util.t;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.Executors;
import org.androidannotations.api.b.c;
import org.androidannotations.api.b.d;
import org.androidannotations.api.b.f;
import org.androidannotations.api.b.g;
import org.androidannotations.api.b.j;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity_, BraavaCleanActivity_, AppWelcomeActivity_, i, 
//			SplashActivity, BugReportActivity, BugReportActivity_

public class IRobotApplication extends Application
	implements android.app.Application.ActivityLifecycleCallbacks, com.irobot.home.util.StandbyModeDetector.a
{
	public static final class a extends Enum
	{

		public static a valueOf(String s1)
		{
			return (a)Enum.valueOf(com/irobot/home/IRobotApplication$a, s1);
		//    0    0:ldc1            #2   <Class IRobotApplication$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class IRobotApplication$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field IRobotApplication$a[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.irobot.home.IRobotApplication$a_3B_.clone()>
		//    2    6:checkcast       #42  <Class IRobotApplication$a[]>
		//    3    9:areturn         
		}

		private static final a $VALUES[];
		public static final a False;
		public static final a None;
		public static final a True;

		static 
		{
			True = new a("True", 0);
		//    0    0:new             #2   <Class IRobotApplication$a>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "True">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void IRobotApplication$a(String, int)>
		//    5   10:putstatic       #23  <Field IRobotApplication$a True>
			False = new a("False", 1);
		//    6   13:new             #2   <Class IRobotApplication$a>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "False">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void IRobotApplication$a(String, int)>
		//   11   23:putstatic       #26  <Field IRobotApplication$a False>
			None = new a("None", 2);
		//   12   26:new             #2   <Class IRobotApplication$a>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "None">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void IRobotApplication$a(String, int)>
		//   17   36:putstatic       #29  <Field IRobotApplication$a None>
			$VALUES = (new a[] {
				True, False, None
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       a[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field IRobotApplication$a True>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field IRobotApplication$a False>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field IRobotApplication$a None>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field IRobotApplication$a[] $VALUES>
		//*  33   64:return          
		}

		private a(String s1, int i1)
		{
			super(s1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public IRobotApplication()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Application()>
		j = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #59  <Field String j>
		b = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #61  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #62  <Method void HashMap()>
	//    9   17:putfield        #64  <Field HashMap b>
		c = new HashMap();
	//   10   20:aload_0         
	//   11   21:new             #61  <Class HashMap>
	//   12   24:dup             
	//   13   25:invokespecial   #62  <Method void HashMap()>
	//   14   28:putfield        #66  <Field HashMap c>
		m = "https://irobot-homesupport--tst4.custhelp.com/cc/api/v1/";
	//   15   31:aload_0         
	//   16   32:ldc1            #68  <String "https://irobot-homesupport--tst4.custhelp.com/cc/api/v1/">
	//   17   34:putfield        #70  <Field String m>
		n = a.None;
	//   18   37:aload_0         
	//   19   38:getstatic       #73  <Field IRobotApplication$a IRobotApplication$a.None>
	//   20   41:putfield        #75  <Field IRobotApplication$a n>
		p = 0;
	//   21   44:aload_0         
	//   22   45:iconst_0        
	//   23   46:putfield        #77  <Field int p>
		q = false;
	//   24   49:aload_0         
	//   25   50:iconst_0        
	//   26   51:putfield        #79  <Field boolean q>
	//   27   54:return          
	}

	static int a(int i1)
	{
		u = i1;
	//    0    0:iload_0         
	//    1    1:putstatic       #82  <Field int u>
		return i1;
	//    2    4:iload_0         
	//    3    5:ireturn         
	}

	static Timer a(IRobotApplication irobotapplication)
	{
		return irobotapplication.t;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Timer t>
	//    2    4:areturn         
	}

	static Timer a(IRobotApplication irobotapplication, Timer timer)
	{
		irobotapplication.t = timer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field Timer t>
		return timer;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private static void a(Activity activity, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT != 23)
	//*   0    0:getstatic       #94  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpeq          9
			return;
	//    3    8:return          
		Object obj = ((Object) (((Object) (activity.getWindow())).getClass()));
	//    4    9:aload_0         
	//    5   10:invokevirtual   #100 <Method Window Activity.getWindow()>
	//    6   13:invokevirtual   #106 <Method Class Object.getClass()>
	//    7   16:astore          4
		int i1;
		int j1;
		try
		{
			Class class1 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
	//    8   18:ldc1            #108 <String "android.view.MiuiWindowManager$LayoutParams">
	//    9   20:invokestatic    #114 <Method Class Class.forName(String)>
	//   10   23:astore          5
			j1 = class1.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(((Object) (class1)));
	//   11   25:aload           5
	//   12   27:ldc1            #116 <String "EXTRA_FLAG_STATUS_BAR_DARK_MODE">
	//   13   29:invokevirtual   #120 <Method Field Class.getField(String)>
	//   14   32:aload           5
	//   15   34:invokevirtual   #126 <Method int Field.getInt(Object)>
	//   16   37:istore_3        
			obj = ((Object) (((Class) (obj)).getMethod("setExtraFlags", new Class[] {
				Integer.TYPE, Integer.TYPE
			})));
	//   17   38:aload           4
	//   18   40:ldc1            #128 <String "setExtraFlags">
	//   19   42:iconst_2        
	//   20   43:anewarray       Class[]
	//   21   46:dup             
	//   22   47:iconst_0        
	//   23   48:getstatic       #134 <Field Class Integer.TYPE>
	//   24   51:aastore         
	//   25   52:dup             
	//   26   53:iconst_1        
	//   27   54:getstatic       #134 <Field Class Integer.TYPE>
	//   28   57:aastore         
	//   29   58:invokevirtual   #138 <Method Method Class.getMethod(String, Class[])>
	//   30   61:astore          4
			activity = ((Activity) (activity.getWindow()));
	//   31   63:aload_0         
	//   32   64:invokevirtual   #100 <Method Window Activity.getWindow()>
	//   33   67:astore_0        
		}
	//*  34   68:iload_1         
	//*  35   69:ifeq            105
	//*  36   72:iload_3         
	//*  37   73:istore_2        
	//*  38   74:goto            77
	//*  39   77:aload           4
	//*  40   79:aload_0         
	//*  41   80:iconst_2        
	//*  42   81:anewarray       Object[]
	//*  43   84:dup             
	//*  44   85:iconst_0        
	//*  45   86:iload_2         
	//*  46   87:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  47   90:aastore         
	//*  48   91:dup             
	//*  49   92:iconst_1        
	//*  50   93:iload_3         
	//*  51   94:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  52   97:aastore         
	//*  53   98:invokevirtual   #148 <Method Object Method.invoke(Object, Object[])>
	//*  54  101:pop             
	//*  55  102:return          
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*  56  103:astore_0        
		{
			return;
	//   57  104:return          
		}
		if(flag)
			i1 = j1;
		else
			i1 = 0;
	//   58  105:iconst_0        
	//   59  106:istore_2        
		((Method) (obj)).invoke(((Object) (activity)), new Object[] {
			Integer.valueOf(i1), Integer.valueOf(j1)
		});
		return;
	//*  60  107:goto            77
	}

	static int q()
	{
		int i1 = u + 1;
	//    0    0:getstatic       #82  <Field int u>
	//    1    3:iconst_1        
	//    2    4:iadd            
	//    3    5:istore_0        
		u = i1;
	//    4    6:iload_0         
	//    5    7:putstatic       #82  <Field int u>
		return i1;
	//    6   10:iload_0         
	//    7   11:ireturn         
	}

	private void r()
	{
		((com.irobot.home.util.k.a)((com.irobot.home.util.k.a)a.a().b().a(false)).a().a(UUID.randomUUID().toString())).n();
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field k a>
	//    2    4:invokevirtual   #156 <Method com.irobot.home.util.k$a k.a()>
	//    3    7:invokevirtual   #161 <Method c com.irobot.home.util.k$a.b()>
	//    4   10:iconst_0        
	//    5   11:invokevirtual   #166 <Method org.androidannotations.api.b.e c.a(boolean)>
	//    6   14:checkcast       #158 <Class com.irobot.home.util.k$a>
	//    7   17:invokevirtual   #169 <Method j com.irobot.home.util.k$a.a()>
	//    8   20:invokestatic    #175 <Method UUID UUID.randomUUID()>
	//    9   23:invokevirtual   #179 <Method String UUID.toString()>
	//   10   26:invokevirtual   #184 <Method org.androidannotations.api.b.e j.a(String)>
	//   11   29:checkcast       #158 <Class com.irobot.home.util.k$a>
	//   12   32:invokevirtual   #186 <Method void com.irobot.home.util.k$a.n()>
	//   13   35:return          
	}

	private void s()
	{
		g.a(true);
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field b g>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #193 <Method void b.a(boolean)>
		h = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #195 <Field boolean h>
		f.i();
	//    7   13:aload_0         
	//    8   14:getfield        #197 <Field IRobotModel f>
	//    9   17:invokevirtual   #201 <Method void IRobotModel.i()>
		NetworkManager.defaultManager().networkStatistics().ignoreFailures();
	//   10   20:invokestatic    #207 <Method NetworkManager NetworkManager.defaultManager()>
	//   11   23:invokevirtual   #211 <Method NetworkStatistics NetworkManager.networkStatistics()>
	//   12   26:invokevirtual   #216 <Method void NetworkStatistics.ignoreFailures()>
	//   13   29:return          
	}

	private void t()
	{
		com.irobot.home.util.j.a(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #221 <Method void com.irobot.home.util.j.a(IRobotApplication)>
		com.irobot.home.o.b.a.a(this);
	//    2    4:aload_0         
	//    3    5:invokestatic    #224 <Method void a.a(IRobotApplication)>
		com.irobot.home.h.c.a(this);
	//    4    8:aload_0         
	//    5    9:invokestatic    #227 <Method void com.irobot.home.h.c.a(IRobotApplication)>
		com.irobot.home.aws.authentication.a.a(this);
	//    6   12:aload_0         
	//    7   13:invokestatic    #230 <Method void com.irobot.home.aws.authentication.a.a(IRobotApplication)>
	//    8   16:return          
	}

	private void u()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #232 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #233 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Core Copyright: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #235 <String "Core Copyright: ">
	//    6   11:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(Core.copyright());
	//    8   15:aload_1         
	//    9   16:invokestatic    #244 <Method String Core.copyright()>
	//   10   19:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj)).toString());
	//   12   23:ldc1            #246 <String "iRobotApp">
	//   13   25:aload_1         
	//   14   26:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   15   29:invokestatic    #252 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   16   32:new             #232 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #233 <Method void StringBuilder()>
	//   19   39:astore_1        
		((StringBuilder) (obj)).append("Core Codename: ");
	//   20   40:aload_1         
	//   21   41:ldc1            #254 <String "Core Codename: ">
	//   22   43:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		((StringBuilder) (obj)).append(Core.codename());
	//   24   47:aload_1         
	//   25   48:invokestatic    #257 <Method String Core.codename()>
	//   26   51:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj)).toString());
	//   28   55:ldc1            #246 <String "iRobotApp">
	//   29   57:aload_1         
	//   30   58:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   31   61:invokestatic    #252 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   32   64:new             #232 <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #233 <Method void StringBuilder()>
	//   35   71:astore_1        
		((StringBuilder) (obj)).append("Core Version: ");
	//   36   72:aload_1         
	//   37   73:ldc2            #259 <String "Core Version: ">
	//   38   76:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
		((StringBuilder) (obj)).append(Core.version());
	//   40   80:aload_1         
	//   41   81:invokestatic    #262 <Method String Core.version()>
	//   42   84:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj)).toString());
	//   44   88:ldc1            #246 <String "iRobotApp">
	//   45   90:aload_1         
	//   46   91:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   47   94:invokestatic    #252 <Method void o.a(String, String)>
		com.irobot.home.util.o.a("iRobotApp", "EVENTS");
	//   48   97:ldc1            #246 <String "iRobotApp">
	//   49   99:ldc2            #264 <String "EVENTS">
	//   50  102:invokestatic    #252 <Method void o.a(String, String)>
		obj = ((Object) (Event.create()));
	//   51  105:invokestatic    #270 <Method Event Event.create()>
	//   52  108:astore_1        
		Object obj1 = ((Object) (new StringBuilder()));
	//   53  109:new             #232 <Class StringBuilder>
	//   54  112:dup             
	//   55  113:invokespecial   #233 <Method void StringBuilder()>
	//   56  116:astore_2        
		((StringBuilder) (obj1)).append("Event timestamp: ");
	//   57  117:aload_2         
	//   58  118:ldc2            #272 <String "Event timestamp: ">
	//   59  121:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   60  124:pop             
		((StringBuilder) (obj1)).append(((Object) (((Event) (obj)).timestamp())));
	//   61  125:aload_2         
	//   62  126:aload_1         
	//   63  127:invokevirtual   #276 <Method java.util.Date Event.timestamp()>
	//   64  130:invokevirtual   #279 <Method StringBuilder StringBuilder.append(Object)>
	//   65  133:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj1)).toString());
	//   66  134:ldc1            #246 <String "iRobotApp">
	//   67  136:aload_2         
	//   68  137:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   69  140:invokestatic    #252 <Method void o.a(String, String)>
		obj1 = ((Object) (new StringBuilder()));
	//   70  143:new             #232 <Class StringBuilder>
	//   71  146:dup             
	//   72  147:invokespecial   #233 <Method void StringBuilder()>
	//   73  150:astore_2        
		((StringBuilder) (obj1)).append("Event key: ");
	//   74  151:aload_2         
	//   75  152:ldc2            #281 <String "Event key: ">
	//   76  155:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   77  158:pop             
		((StringBuilder) (obj1)).append(((Event) (obj)).key());
	//   78  159:aload_2         
	//   79  160:aload_1         
	//   80  161:invokevirtual   #284 <Method String Event.key()>
	//   81  164:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   82  167:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj1)).toString());
	//   83  168:ldc1            #246 <String "iRobotApp">
	//   84  170:aload_2         
	//   85  171:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   86  174:invokestatic    #252 <Method void o.a(String, String)>
		obj = ((Object) (AssetId.assetIdForString("839383928299038")));
	//   87  177:ldc2            #286 <String "839383928299038">
	//   88  180:invokestatic    #292 <Method AssetId AssetId.assetIdForString(String)>
	//   89  183:astore_1        
		obj1 = ((Object) (AssetEvent.create(((AssetId) (obj)))));
	//   90  184:aload_1         
	//   91  185:invokestatic    #297 <Method AssetEvent AssetEvent.create(AssetId)>
	//   92  188:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   93  189:new             #232 <Class StringBuilder>
	//   94  192:dup             
	//   95  193:invokespecial   #233 <Method void StringBuilder()>
	//   96  196:astore_3        
		stringbuilder.append("Asset Event identifier: ");
	//   97  197:aload_3         
	//   98  198:ldc2            #299 <String "Asset Event identifier: ">
	//   99  201:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  100  204:pop             
		stringbuilder.append(((AssetEvent) (obj1)).assetId().getId());
	//  101  205:aload_3         
	//  102  206:aload_2         
	//  103  207:invokevirtual   #303 <Method AssetId AssetEvent.assetId()>
	//  104  210:invokevirtual   #306 <Method String AssetId.getId()>
	//  105  213:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  106  216:pop             
		com.irobot.home.util.o.a("iRobotApp", stringbuilder.toString());
	//  107  217:ldc1            #246 <String "iRobotApp">
	//  108  219:aload_3         
	//  109  220:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  110  223:invokestatic    #252 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//  111  226:new             #232 <Class StringBuilder>
	//  112  229:dup             
	//  113  230:invokespecial   #233 <Method void StringBuilder()>
	//  114  233:astore_3        
		stringbuilder.append("Asset Event timestamp: ");
	//  115  234:aload_3         
	//  116  235:ldc2            #308 <String "Asset Event timestamp: ">
	//  117  238:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  118  241:pop             
		stringbuilder.append(((Object) (((AssetEvent) (obj1)).timestamp())));
	//  119  242:aload_3         
	//  120  243:aload_2         
	//  121  244:invokevirtual   #309 <Method java.util.Date AssetEvent.timestamp()>
	//  122  247:invokevirtual   #279 <Method StringBuilder StringBuilder.append(Object)>
	//  123  250:pop             
		com.irobot.home.util.o.a("iRobotApp", stringbuilder.toString());
	//  124  251:ldc1            #246 <String "iRobotApp">
	//  125  253:aload_3         
	//  126  254:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  127  257:invokestatic    #252 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//  128  260:new             #232 <Class StringBuilder>
	//  129  263:dup             
	//  130  264:invokespecial   #233 <Method void StringBuilder()>
	//  131  267:astore_3        
		stringbuilder.append("Asset Event key: ");
	//  132  268:aload_3         
	//  133  269:ldc2            #311 <String "Asset Event key: ">
	//  134  272:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  135  275:pop             
		stringbuilder.append(((AssetEvent) (obj1)).key());
	//  136  276:aload_3         
	//  137  277:aload_2         
	//  138  278:invokevirtual   #312 <Method String AssetEvent.key()>
	//  139  281:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  140  284:pop             
		com.irobot.home.util.o.a("iRobotApp", stringbuilder.toString());
	//  141  285:ldc1            #246 <String "iRobotApp">
	//  142  287:aload_3         
	//  143  288:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  144  291:invokestatic    #252 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//  145  294:new             #232 <Class StringBuilder>
	//  146  297:dup             
	//  147  298:invokespecial   #233 <Method void StringBuilder()>
	//  148  301:astore_3        
		stringbuilder.append("Event timestamp: ");
	//  149  302:aload_3         
	//  150  303:ldc2            #272 <String "Event timestamp: ">
	//  151  306:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  152  309:pop             
		stringbuilder.append(((Object) (((Event) (obj1)).timestamp())));
	//  153  310:aload_3         
	//  154  311:aload_2         
	//  155  312:invokevirtual   #276 <Method java.util.Date Event.timestamp()>
	//  156  315:invokevirtual   #279 <Method StringBuilder StringBuilder.append(Object)>
	//  157  318:pop             
		com.irobot.home.util.o.a("iRobotApp", stringbuilder.toString());
	//  158  319:ldc1            #246 <String "iRobotApp">
	//  159  321:aload_3         
	//  160  322:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  161  325:invokestatic    #252 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//  162  328:new             #232 <Class StringBuilder>
	//  163  331:dup             
	//  164  332:invokespecial   #233 <Method void StringBuilder()>
	//  165  335:astore_3        
		stringbuilder.append("Event key: ");
	//  166  336:aload_3         
	//  167  337:ldc2            #281 <String "Event key: ">
	//  168  340:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  169  343:pop             
		stringbuilder.append(((Event) (obj1)).key());
	//  170  344:aload_3         
	//  171  345:aload_2         
	//  172  346:invokevirtual   #284 <Method String Event.key()>
	//  173  349:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  174  352:pop             
		com.irobot.home.util.o.a("iRobotApp", stringbuilder.toString());
	//  175  353:ldc1            #246 <String "iRobotApp">
	//  176  355:aload_3         
	//  177  356:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  178  359:invokestatic    #252 <Method void o.a(String, String)>
		obj = ((Object) (ConnectFailureEvent.create(((AssetId) (obj)), ConnectFailureReason.Unknown)));
	//  179  362:aload_1         
	//  180  363:getstatic       #318 <Field ConnectFailureReason ConnectFailureReason.Unknown>
	//  181  366:invokestatic    #323 <Method ConnectFailureEvent ConnectFailureEvent.create(AssetId, ConnectFailureReason)>
	//  182  369:astore_1        
		obj1 = ((Object) (new StringBuilder()));
	//  183  370:new             #232 <Class StringBuilder>
	//  184  373:dup             
	//  185  374:invokespecial   #233 <Method void StringBuilder()>
	//  186  377:astore_2        
		((StringBuilder) (obj1)).append("Connect Failure Event identifier: ");
	//  187  378:aload_2         
	//  188  379:ldc2            #325 <String "Connect Failure Event identifier: ">
	//  189  382:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  190  385:pop             
		((StringBuilder) (obj1)).append(((ConnectFailureEvent) (obj)).assetId().getId());
	//  191  386:aload_2         
	//  192  387:aload_1         
	//  193  388:invokevirtual   #326 <Method AssetId ConnectFailureEvent.assetId()>
	//  194  391:invokevirtual   #306 <Method String AssetId.getId()>
	//  195  394:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  196  397:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj1)).toString());
	//  197  398:ldc1            #246 <String "iRobotApp">
	//  198  400:aload_2         
	//  199  401:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  200  404:invokestatic    #252 <Method void o.a(String, String)>
		obj1 = ((Object) (new StringBuilder()));
	//  201  407:new             #232 <Class StringBuilder>
	//  202  410:dup             
	//  203  411:invokespecial   #233 <Method void StringBuilder()>
	//  204  414:astore_2        
		((StringBuilder) (obj1)).append("Connect Failure Event reason: ");
	//  205  415:aload_2         
	//  206  416:ldc2            #328 <String "Connect Failure Event reason: ">
	//  207  419:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  208  422:pop             
		((StringBuilder) (obj1)).append(((Object) (((ConnectFailureEvent) (obj)).reason())));
	//  209  423:aload_2         
	//  210  424:aload_1         
	//  211  425:invokevirtual   #332 <Method ConnectFailureReason ConnectFailureEvent.reason()>
	//  212  428:invokevirtual   #279 <Method StringBuilder StringBuilder.append(Object)>
	//  213  431:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj1)).toString());
	//  214  432:ldc1            #246 <String "iRobotApp">
	//  215  434:aload_2         
	//  216  435:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  217  438:invokestatic    #252 <Method void o.a(String, String)>
		obj1 = ((Object) (new StringBuilder()));
	//  218  441:new             #232 <Class StringBuilder>
	//  219  444:dup             
	//  220  445:invokespecial   #233 <Method void StringBuilder()>
	//  221  448:astore_2        
		((StringBuilder) (obj1)).append("Connect Failure Event timestamp: ");
	//  222  449:aload_2         
	//  223  450:ldc2            #334 <String "Connect Failure Event timestamp: ">
	//  224  453:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  225  456:pop             
		((StringBuilder) (obj1)).append(((Object) (((ConnectFailureEvent) (obj)).timestamp())));
	//  226  457:aload_2         
	//  227  458:aload_1         
	//  228  459:invokevirtual   #335 <Method java.util.Date ConnectFailureEvent.timestamp()>
	//  229  462:invokevirtual   #279 <Method StringBuilder StringBuilder.append(Object)>
	//  230  465:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj1)).toString());
	//  231  466:ldc1            #246 <String "iRobotApp">
	//  232  468:aload_2         
	//  233  469:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  234  472:invokestatic    #252 <Method void o.a(String, String)>
		obj1 = ((Object) (new StringBuilder()));
	//  235  475:new             #232 <Class StringBuilder>
	//  236  478:dup             
	//  237  479:invokespecial   #233 <Method void StringBuilder()>
	//  238  482:astore_2        
		((StringBuilder) (obj1)).append("Connect Failure Event key: ");
	//  239  483:aload_2         
	//  240  484:ldc2            #337 <String "Connect Failure Event key: ">
	//  241  487:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  242  490:pop             
		((StringBuilder) (obj1)).append(((ConnectFailureEvent) (obj)).key());
	//  243  491:aload_2         
	//  244  492:aload_1         
	//  245  493:invokevirtual   #338 <Method String ConnectFailureEvent.key()>
	//  246  496:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  247  499:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj1)).toString());
	//  248  500:ldc1            #246 <String "iRobotApp">
	//  249  502:aload_2         
	//  250  503:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  251  506:invokestatic    #252 <Method void o.a(String, String)>
		obj1 = ((Object) (new StringBuilder()));
	//  252  509:new             #232 <Class StringBuilder>
	//  253  512:dup             
	//  254  513:invokespecial   #233 <Method void StringBuilder()>
	//  255  516:astore_2        
		((StringBuilder) (obj1)).append("Event timestamp: ");
	//  256  517:aload_2         
	//  257  518:ldc2            #272 <String "Event timestamp: ">
	//  258  521:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  259  524:pop             
		((StringBuilder) (obj1)).append(((Object) (((Event) (obj)).timestamp())));
	//  260  525:aload_2         
	//  261  526:aload_1         
	//  262  527:invokevirtual   #276 <Method java.util.Date Event.timestamp()>
	//  263  530:invokevirtual   #279 <Method StringBuilder StringBuilder.append(Object)>
	//  264  533:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj1)).toString());
	//  265  534:ldc1            #246 <String "iRobotApp">
	//  266  536:aload_2         
	//  267  537:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  268  540:invokestatic    #252 <Method void o.a(String, String)>
		obj1 = ((Object) (new StringBuilder()));
	//  269  543:new             #232 <Class StringBuilder>
	//  270  546:dup             
	//  271  547:invokespecial   #233 <Method void StringBuilder()>
	//  272  550:astore_2        
		((StringBuilder) (obj1)).append("Event key: ");
	//  273  551:aload_2         
	//  274  552:ldc2            #281 <String "Event key: ">
	//  275  555:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  276  558:pop             
		((StringBuilder) (obj1)).append(((Event) (obj)).key());
	//  277  559:aload_2         
	//  278  560:aload_1         
	//  279  561:invokevirtual   #284 <Method String Event.key()>
	//  280  564:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  281  567:pop             
		com.irobot.home.util.o.a("iRobotApp", ((StringBuilder) (obj1)).toString());
	//  282  568:ldc1            #246 <String "iRobotApp">
	//  283  570:aload_2         
	//  284  571:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  285  574:invokestatic    #252 <Method void o.a(String, String)>
	//  286  577:return          
	}

	private void v()
	{
		if(((Boolean)a.b().a()).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field k a>
	//*   2    4:invokevirtual   #342 <Method d k.b()>
	//*   3    7:invokevirtual   #347 <Method Object d.a()>
	//*   4   10:checkcast       #349 <Class Boolean>
	//*   5   13:invokevirtual   #353 <Method boolean Boolean.booleanValue()>
	//*   6   16:ifeq            48
		{
			((com.irobot.home.util.k.a)a.a().g().a(0x5c88324b)).n();
	//    7   19:aload_0         
	//    8   20:getfield        #151 <Field k a>
	//    9   23:invokevirtual   #156 <Method com.irobot.home.util.k$a k.a()>
	//   10   26:invokevirtual   #356 <Method f com.irobot.home.util.k$a.g()>
	//   11   29:ldc2            #357 <Int 0x5c88324b>
	//   12   32:invokevirtual   #362 <Method org.androidannotations.api.b.e f.a(int)>
	//   13   35:checkcast       #158 <Class com.irobot.home.util.k$a>
	//   14   38:invokevirtual   #186 <Method void com.irobot.home.util.k$a.n()>
			AnalyticsSubsystem.getInstance().trackAppLaunchedAfterAppInstall();
	//   15   41:invokestatic    #368 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   16   44:invokevirtual   #371 <Method void AnalyticsSubsystem.trackAppLaunchedAfterAppInstall()>
			return;
	//   17   47:return          
		}
		if(0x5c88324b > ((Integer)a.g().a()).intValue())
	//*  18   48:ldc2            #357 <Int 0x5c88324b>
	//*  19   51:aload_0         
	//*  20   52:getfield        #151 <Field k a>
	//*  21   55:invokevirtual   #374 <Method g k.g()>
	//*  22   58:invokevirtual   #377 <Method Object g.a()>
	//*  23   61:checkcast       #130 <Class Integer>
	//*  24   64:invokevirtual   #380 <Method int Integer.intValue()>
	//*  25   67:icmple          98
		{
			((com.irobot.home.util.k.a)a.a().g().a(0x5c88324b)).n();
	//   26   70:aload_0         
	//   27   71:getfield        #151 <Field k a>
	//   28   74:invokevirtual   #156 <Method com.irobot.home.util.k$a k.a()>
	//   29   77:invokevirtual   #356 <Method f com.irobot.home.util.k$a.g()>
	//   30   80:ldc2            #357 <Int 0x5c88324b>
	//   31   83:invokevirtual   #362 <Method org.androidannotations.api.b.e f.a(int)>
	//   32   86:checkcast       #158 <Class com.irobot.home.util.k$a>
	//   33   89:invokevirtual   #186 <Method void com.irobot.home.util.k$a.n()>
			AnalyticsSubsystem.getInstance().trackAppLaunchedAfterAppUpgrade();
	//   34   92:invokestatic    #368 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   35   95:invokevirtual   #383 <Method void AnalyticsSubsystem.trackAppLaunchedAfterAppUpgrade()>
		}
	//   36   98:return          
	}

	void a()
	{
		d.setRestErrorHandler(((org.androidannotations.a.a.a.b) (e)));
	//    0    0:aload_0         
	//    1    1:getfield        #385 <Field RegistrationRestClient d>
	//    2    4:aload_0         
	//    3    5:getfield        #387 <Field RegistrationRestErrorHandler e>
	//    4    8:invokeinterface #393 <Method void RegistrationRestClient.setRestErrorHandler(org.androidannotations.a.a.a.b)>
		String s1;
		if("release".equalsIgnoreCase("release"))
	//*   5   13:ldc2            #395 <String "release">
	//*   6   16:ldc2            #395 <String "release">
	//*   7   19:invokevirtual   #401 <Method boolean String.equalsIgnoreCase(String)>
	//*   8   22:ifeq            32
			s1 = "https://homesupport.irobot.com/cc/api/v1/";
	//    9   25:ldc2            #403 <String "https://homesupport.irobot.com/cc/api/v1/">
	//   10   28:astore_1        
		else
	//*  11   29:goto            35
			s1 = "https://irobot-homesupport--tst4.custhelp.com/cc/api/v1/";
	//   12   32:ldc1            #68  <String "https://irobot-homesupport--tst4.custhelp.com/cc/api/v1/">
	//   13   34:astore_1        
		b(s1);
	//   14   35:aload_0         
	//   15   36:aload_1         
	//   16   37:invokevirtual   #406 <Method void b(String)>
	//   17   40:return          
	}

	public void a(PersistentMapIdentifier persistentmapidentifier)
	{
		r = persistentmapidentifier;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #409 <Field PersistentMapIdentifier r>
	//    3    5:return          
	}

	public void a(com.irobot.home.model.a a1)
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #188 <Field b g>
	//*   2    4:ifnonnull       16
		{
			com.irobot.home.util.o.e("iRobotApp", "ProtocolHandler object not initialized");
	//    3    7:ldc1            #246 <String "iRobotApp">
	//    4    9:ldc2            #412 <String "ProtocolHandler object not initialized">
	//    5   12:invokestatic    #414 <Method void o.e(String, String)>
			return;
	//    6   15:return          
		}
		AssetId assetid = a1.b();
	//    7   16:aload_1         
	//    8   17:invokevirtual   #418 <Method AssetId com.irobot.home.model.a.b()>
	//    9   20:astore_3        
		Assembler assembler = Assembler.getInstance();
	//   10   21:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//   11   24:astore_2        
		if(!assembler.isInitialized(assetid))
	//*  12   25:aload_2         
	//*  13   26:aload_3         
	//*  14   27:invokevirtual   #427 <Method boolean Assembler.isInitialized(AssetId)>
	//*  15   30:ifne            78
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   33:new             #232 <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #233 <Method void StringBuilder()>
	//   19   40:astore_3        
			stringbuilder.append("Assembling robot subsystems for BLID: ");
	//   20   41:aload_3         
	//   21   42:ldc2            #429 <String "Assembling robot subsystems for BLID: ">
	//   22   45:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
			stringbuilder.append(a1.b().getId());
	//   24   49:aload_3         
	//   25   50:aload_1         
	//   26   51:invokevirtual   #418 <Method AssetId com.irobot.home.model.a.b()>
	//   27   54:invokevirtual   #306 <Method String AssetId.getId()>
	//   28   57:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
			com.irobot.home.util.o.b("iRobotApp", stringbuilder.toString());
	//   30   61:ldc1            #246 <String "iRobotApp">
	//   31   63:aload_3         
	//   32   64:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   33   67:invokestatic    #431 <Method void o.b(String, String)>
			assembler.initializeAsset(a1.a());
	//   34   70:aload_2         
	//   35   71:aload_1         
	//   36   72:invokevirtual   #434 <Method com.irobot.core.AssetInfo com.irobot.home.model.a.a()>
	//   37   75:invokevirtual   #438 <Method void Assembler.initializeAsset(com.irobot.core.AssetInfo)>
		}
	//   38   78:return          
	}

	public void a(String s1)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences("DEVEL", 0).edit();
	//    0    0:aload_0         
	//    1    1:ldc2            #440 <String "DEVEL">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #444 <Method SharedPreferences getSharedPreferences(String, int)>
	//    4    8:invokeinterface #450 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_2        
		editor.putString("accepted_terms_version_1", s1);
	//    6   14:aload_2         
	//    7   15:ldc2            #452 <String "accepted_terms_version_1">
	//    8   18:aload_1         
	//    9   19:invokeinterface #458 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   10   24:pop             
		editor.apply();
	//   11   25:aload_2         
	//   12   26:invokeinterface #461 <Method void android.content.SharedPreferences$Editor.apply()>
	//   13   31:return          
	}

	public void a(Locale locale, Boolean boolean1)
	{
		Locale locale1 = locale;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(com.irobot.home.util.j.b(locale))
	//*   2    2:aload_1         
	//*   3    3:invokestatic    #465 <Method boolean com.irobot.home.util.j.b(Locale)>
	//*   4    6:ifeq            21
		{
			com.irobot.home.util.o.e("iRobotApp", "Attempted to set app language using an undetermined locale.");
	//    5    9:ldc1            #246 <String "iRobotApp">
	//    6   11:ldc2            #467 <String "Attempted to set app language using an undetermined locale.">
	//    7   14:invokestatic    #414 <Method void o.e(String, String)>
			locale1 = i.b;
	//    8   17:getstatic       #472 <Field Locale i.b>
	//    9   20:astore_3        
		}
		PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putString("user_preferred_language_tag_key", com.irobot.home.util.j.a(locale1)).apply();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #476 <Method Context getBaseContext()>
	//   12   25:invokestatic    #482 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   13   28:invokeinterface #450 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   14   33:ldc2            #484 <String "user_preferred_language_tag_key">
	//   15   36:aload_3         
	//   16   37:invokestatic    #487 <Method String com.irobot.home.util.j.a(Locale)>
	//   17   40:invokeinterface #458 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   18   45:invokeinterface #461 <Method void android.content.SharedPreferences$Editor.apply()>
		Object obj = ((Object) (Assembler.getInstance().getAccountService()));
	//   19   50:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//   20   53:invokevirtual   #491 <Method AccountService Assembler.getAccountService()>
	//   21   56:astore          4
		if(i.b.equals(((Object) (locale1))))
	//*  22   58:getstatic       #472 <Field Locale i.b>
	//*  23   61:aload_3         
	//*  24   62:invokevirtual   #497 <Method boolean Locale.equals(Object)>
	//*  25   65:ifeq            75
			locale = ((Locale) (com.irobot.home.util.j.n()));
	//   26   68:invokestatic    #499 <Method String com.irobot.home.util.j.n()>
	//   27   71:astore_1        
		else
	//*  28   72:goto            86
			locale = ((Locale) (com.irobot.home.util.j.a(com.irobot.home.util.j.g(getBaseContext()))));
	//   29   75:aload_0         
	//   30   76:invokevirtual   #476 <Method Context getBaseContext()>
	//   31   79:invokestatic    #502 <Method Locale com.irobot.home.util.j.g(Context)>
	//   32   82:invokestatic    #487 <Method String com.irobot.home.util.j.a(Locale)>
	//   33   85:astore_1        
		((AccountService) (obj)).setLocale(com.irobot.home.util.g.a(((String) (locale))));
	//   34   86:aload           4
	//   35   88:aload_1         
	//   36   89:invokestatic    #507 <Method String com.irobot.home.util.g.a(String)>
	//   37   92:invokevirtual   #512 <Method void AccountService.setLocale(String)>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  38   95:getstatic       #94  <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   98:bipush          24
	//*  40  100:icmplt          120
			locale = Resources.getSystem().getConfiguration().getLocales().get(0);
	//   41  103:invokestatic    #518 <Method Resources Resources.getSystem()>
	//   42  106:invokevirtual   #522 <Method Configuration Resources.getConfiguration()>
	//   43  109:invokevirtual   #528 <Method LocaleList Configuration.getLocales()>
	//   44  112:iconst_0        
	//   45  113:invokevirtual   #534 <Method Locale LocaleList.get(int)>
	//   46  116:astore_1        
		else
	//*  47  117:goto            130
			locale = Resources.getSystem().getConfiguration().locale;
	//   48  120:invokestatic    #518 <Method Resources Resources.getSystem()>
	//   49  123:invokevirtual   #522 <Method Configuration Resources.getConfiguration()>
	//   50  126:getfield        #537 <Field Locale Configuration.locale>
	//   51  129:astore_1        
		obj = ((Object) (locale1));
	//   52  130:aload_3         
	//   53  131:astore          4
		if(i.b.equals(((Object) (locale1))))
	//*  54  133:getstatic       #472 <Field Locale i.b>
	//*  55  136:aload_3         
	//*  56  137:invokevirtual   #497 <Method boolean Locale.equals(Object)>
	//*  57  140:ifeq            146
			obj = ((Object) (locale));
	//   58  143:aload_1         
	//   59  144:astore          4
		locale1 = ((Locale) (obj));
	//   60  146:aload           4
	//   61  148:astore_3        
		if(!com.irobot.home.util.j.i(((Locale) (obj)).getCountry()))
	//*  62  149:aload           4
	//*  63  151:invokevirtual   #540 <Method String Locale.getCountry()>
	//*  64  154:invokestatic    #542 <Method boolean com.irobot.home.util.j.i(String)>
	//*  65  157:ifne            182
			locale1 = new Locale(((Locale) (obj)).getLanguage(), locale.getCountry(), ((Locale) (obj)).getVariant());
	//   66  160:new             #493 <Class Locale>
	//   67  163:dup             
	//   68  164:aload           4
	//   69  166:invokevirtual   #545 <Method String Locale.getLanguage()>
	//   70  169:aload_1         
	//   71  170:invokevirtual   #540 <Method String Locale.getCountry()>
	//   72  173:aload           4
	//   73  175:invokevirtual   #548 <Method String Locale.getVariant()>
	//   74  178:invokespecial   #551 <Method void Locale(String, String, String)>
	//   75  181:astore_3        
		Locale.setDefault(locale1);
	//   76  182:aload_3         
	//   77  183:invokestatic    #555 <Method void Locale.setDefault(Locale)>
		obj = ((Object) (getBaseContext().getResources().getConfiguration()));
	//   78  186:aload_0         
	//   79  187:invokevirtual   #476 <Method Context getBaseContext()>
	//   80  190:invokevirtual   #560 <Method Resources Context.getResources()>
	//   81  193:invokevirtual   #522 <Method Configuration Resources.getConfiguration()>
	//   82  196:astore          4
		if(android.os.Build.VERSION.SDK_INT > 25)
	//*  83  198:getstatic       #94  <Field int android.os.Build$VERSION.SDK_INT>
	//*  84  201:bipush          25
	//*  85  203:icmple          230
		{
			((Configuration) (obj)).setLocales(Resources.getSystem().getConfiguration().getLocales());
	//   86  206:aload           4
	//   87  208:invokestatic    #518 <Method Resources Resources.getSystem()>
	//   88  211:invokevirtual   #522 <Method Configuration Resources.getConfiguration()>
	//   89  214:invokevirtual   #528 <Method LocaleList Configuration.getLocales()>
	//   90  217:invokevirtual   #564 <Method void Configuration.setLocales(LocaleList)>
			locale = ((Locale) (createConfigurationContext(((Configuration) (obj)))));
	//   91  220:aload_0         
	//   92  221:aload           4
	//   93  223:invokevirtual   #568 <Method Context createConfigurationContext(Configuration)>
	//   94  226:astore_1        
		} else
	//*  95  227:goto            235
		{
			locale = ((Locale) (getBaseContext()));
	//   96  230:aload_0         
	//   97  231:invokevirtual   #476 <Method Context getBaseContext()>
	//   98  234:astore_1        
		}
		((Configuration) (obj)).setLocale(locale1);
	//   99  235:aload           4
	//  100  237:aload_3         
	//  101  238:invokevirtual   #570 <Method void Configuration.setLocale(Locale)>
		((Context) (locale)).getResources().updateConfiguration(((Configuration) (obj)), getBaseContext().getResources().getDisplayMetrics());
	//  102  241:aload_1         
	//  103  242:invokevirtual   #560 <Method Resources Context.getResources()>
	//  104  245:aload           4
	//  105  247:aload_0         
	//  106  248:invokevirtual   #476 <Method Context getBaseContext()>
	//  107  251:invokevirtual   #560 <Method Resources Context.getResources()>
	//  108  254:invokevirtual   #574 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  109  257:invokevirtual   #578 <Method void Resources.updateConfiguration(Configuration, DisplayMetrics)>
		if(boolean1.booleanValue())
	//* 110  260:aload_2         
	//* 111  261:invokevirtual   #353 <Method boolean Boolean.booleanValue()>
	//* 112  264:ifeq            375
		{
			if(com.irobot.home.util.j.i())
	//* 113  267:invokestatic    #580 <Method boolean com.irobot.home.util.j.i()>
	//* 114  270:ifeq            280
				locale = ((Locale) (com.irobot.home.util.j.j()));
	//  115  273:invokestatic    #583 <Method com.irobot.home.model.a com.irobot.home.util.j.j()>
	//  116  276:astore_1        
			else
	//* 117  277:goto            282
				locale = null;
	//  118  280:aconst_null     
	//  119  281:astore_1        
			if(locale != null)
	//* 120  282:aload_1         
	//* 121  283:ifnull          350
			{
				locale = ((Locale) (((com.irobot.home.model.a) (locale)).a()));
	//  122  286:aload_1         
	//  123  287:invokevirtual   #434 <Method com.irobot.core.AssetInfo com.irobot.home.model.a.a()>
	//  124  290:astore_1        
				if(AssetCapabilityUtils.isCloudCapable(((com.irobot.core.AssetInfo) (locale))))
	//* 125  291:aload_1         
	//* 126  292:invokestatic    #589 <Method boolean AssetCapabilityUtils.isCloudCapable(com.irobot.core.AssetInfo)>
	//* 127  295:ifeq            313
					locale = ((Locale) (new Intent(((Context) (this)), com/irobot/home/RobotCleanActivity_)));
	//  128  298:new             #591 <Class Intent>
	//  129  301:dup             
	//  130  302:aload_0         
	//  131  303:ldc2            #593 <Class RobotCleanActivity_>
	//  132  306:invokespecial   #596 <Method void Intent(Context, Class)>
	//  133  309:astore_1        
				else
	//* 134  310:goto            362
				if(AssetCapabilityUtils.isNonCloudCapableMoppingRobot(((com.irobot.core.AssetInfo) (locale))))
	//* 135  313:aload_1         
	//* 136  314:invokestatic    #599 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(com.irobot.core.AssetInfo)>
	//* 137  317:ifeq            335
					locale = ((Locale) (new Intent(((Context) (this)), com/irobot/home/BraavaCleanActivity_)));
	//  138  320:new             #591 <Class Intent>
	//  139  323:dup             
	//  140  324:aload_0         
	//  141  325:ldc2            #601 <Class BraavaCleanActivity_>
	//  142  328:invokespecial   #596 <Method void Intent(Context, Class)>
	//  143  331:astore_1        
				else
	//* 144  332:goto            362
					locale = ((Locale) (new Intent(((Context) (this)), com/irobot/home/AppWelcomeActivity_)));
	//  145  335:new             #591 <Class Intent>
	//  146  338:dup             
	//  147  339:aload_0         
	//  148  340:ldc2            #603 <Class AppWelcomeActivity_>
	//  149  343:invokespecial   #596 <Method void Intent(Context, Class)>
	//  150  346:astore_1        
			} else
	//* 151  347:goto            362
			{
				locale = ((Locale) (new Intent(((Context) (this)), com/irobot/home/AppWelcomeActivity_)));
	//  152  350:new             #591 <Class Intent>
	//  153  353:dup             
	//  154  354:aload_0         
	//  155  355:ldc2            #603 <Class AppWelcomeActivity_>
	//  156  358:invokespecial   #596 <Method void Intent(Context, Class)>
	//  157  361:astore_1        
			}
			((Intent) (locale)).addFlags(0x14008000);
	//  158  362:aload_1         
	//  159  363:ldc2            #604 <Int 0x14008000>
	//  160  366:invokevirtual   #608 <Method Intent Intent.addFlags(int)>
	//  161  369:pop             
			startActivity(((Intent) (locale)));
	//  162  370:aload_0         
	//  163  371:aload_1         
	//  164  372:invokevirtual   #612 <Method void startActivity(Intent)>
		}
	//  165  375:return          
	}

	public void a(boolean flag)
	{
		k = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #614 <Field boolean k>
		getSharedPreferences("DEVEL", 0).edit().putBoolean("eula_accepted_version_1", flag).apply();
	//    3    5:aload_0         
	//    4    6:ldc2            #440 <String "DEVEL">
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #444 <Method SharedPreferences getSharedPreferences(String, int)>
	//    7   13:invokeinterface #450 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    8   18:ldc2            #616 <String "eula_accepted_version_1">
	//    9   21:iload_1         
	//   10   22:invokeinterface #620 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   11   27:invokeinterface #461 <Method void android.content.SharedPreferences$Editor.apply()>
	//   12   32:return          
	}

	public void b()
	{
		if(!com.irobot.home.util.j.a())
	//*   0    0:invokestatic    #622 <Method boolean com.irobot.home.util.j.a()>
	//*   1    3:ifne            7
			return;
	//    2    6:return          
		if(com.irobot.home.util.j.e(((Context) (this))))
	//*   3    7:aload_0         
	//*   4    8:invokestatic    #625 <Method boolean com.irobot.home.util.j.e(Context)>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(!l)
	//*   7   15:aload_0         
	//*   8   16:getfield        #627 <Field boolean l>
	//*   9   19:ifne            23
			return;
	//   10   22:return          
		AccountService accountservice = Assembler.getInstance().getAccountService();
	//   11   23:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//   12   26:invokevirtual   #491 <Method AccountService Assembler.getAccountService()>
	//   13   29:astore_1        
		if(accountservice.isAccountProviderInitialized() && n == a.False)
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #630 <Method boolean AccountService.isAccountProviderInitialized()>
	//*  16   34:ifeq            48
	//*  17   37:aload_0         
	//*  18   38:getfield        #75  <Field IRobotApplication$a n>
	//*  19   41:getstatic       #633 <Field IRobotApplication$a IRobotApplication$a.False>
	//*  20   44:if_acmpne       48
		{
			return;
	//   21   47:return          
		} else
		{
			com.irobot.home.i.a a1 = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//   22   48:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//   23   51:invokevirtual   #637 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   24   54:checkcast       #639 <Class com.irobot.home.i.a>
	//   25   57:astore_2        
			a1.a(((Object) (this)), EventType.AccountErrorEvent);
	//   26   58:aload_2         
	//   27   59:aload_0         
	//   28   60:getstatic       #645 <Field EventType EventType.AccountErrorEvent>
	//   29   63:invokevirtual   #648 <Method void com.irobot.home.i.a.a(Object, EventType)>
			a1.a(((Object) (this)), EventType.AccountLoggedInEvent);
	//   30   66:aload_2         
	//   31   67:aload_0         
	//   32   68:getstatic       #651 <Field EventType EventType.AccountLoggedInEvent>
	//   33   71:invokevirtual   #648 <Method void com.irobot.home.i.a.a(Object, EventType)>
			a1.a(((Object) (this)), EventType.AccountLoggedOutEvent);
	//   34   74:aload_2         
	//   35   75:aload_0         
	//   36   76:getstatic       #654 <Field EventType EventType.AccountLoggedOutEvent>
	//   37   79:invokevirtual   #648 <Method void com.irobot.home.i.a.a(Object, EventType)>
			a1.a(((Object) (this)), EventType.AccountInfoUpdatedEvent);
	//   38   82:aload_2         
	//   39   83:aload_0         
	//   40   84:getstatic       #657 <Field EventType EventType.AccountInfoUpdatedEvent>
	//   41   87:invokevirtual   #648 <Method void com.irobot.home.i.a.a(Object, EventType)>
			n = a.None;
	//   42   90:aload_0         
	//   43   91:getstatic       #73  <Field IRobotApplication$a IRobotApplication$a.None>
	//   44   94:putfield        #75  <Field IRobotApplication$a n>
			accountservice.initializeAccountSession();
	//   45   97:aload_1         
	//   46   98:invokevirtual   #660 <Method void AccountService.initializeAccountSession()>
			return;
	//   47  101:return          
		}
	}

	public void b(String s1)
	{
		m = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String m>
		d.setRootUrl(s1);
	//    3    5:aload_0         
	//    4    6:getfield        #385 <Field RegistrationRestClient d>
	//    5    9:aload_1         
	//    6   10:invokeinterface #663 <Method void RegistrationRestClient.setRootUrl(String)>
	//    7   15:return          
	}

	public a c()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field IRobotApplication$a n>
	//    2    4:areturn         
	}

	public void c(String s1)
	{
		if(!Assembler.getInstance().getAccountService().isLoggedIn())
	//*   0    0:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//*   1    3:invokevirtual   #491 <Method AccountService Assembler.getAccountService()>
	//*   2    6:invokevirtual   #669 <Method boolean AccountService.isLoggedIn()>
	//*   3    9:ifne            26
		{
			j = s1;
	//    4   12:aload_0         
	//    5   13:aload_1         
	//    6   14:putfield        #59  <Field String j>
			com.irobot.home.util.o.d("iRobotApp", "Will skip showing the dialog, because user is not logged in the gigya account");
	//    7   17:ldc1            #246 <String "iRobotApp">
	//    8   19:ldc2            #671 <String "Will skip showing the dialog, because user is not logged in the gigya account">
	//    9   22:invokestatic    #673 <Method void o.d(String, String)>
			return;
	//   10   25:return          
		}
		if(!i)
	//*  11   26:aload_0         
	//*  12   27:getfield        #675 <Field boolean i>
	//*  13   30:ifne            83
		{
			Context context = getApplicationContext();
	//   14   33:aload_0         
	//   15   34:invokevirtual   #678 <Method Context getApplicationContext()>
	//   16   37:astore_2        
			Intent intent = new Intent("com.irobot.home.InvalidRobotPasswordActivity_");
	//   17   38:new             #591 <Class Intent>
	//   18   41:dup             
	//   19   42:ldc2            #680 <String "com.irobot.home.InvalidRobotPasswordActivity_">
	//   20   45:invokespecial   #682 <Method void Intent(String)>
	//   21   48:astore_3        
			intent.putExtra("blid", s1);
	//   22   49:aload_3         
	//   23   50:ldc2            #684 <String "blid">
	//   24   53:aload_1         
	//   25   54:invokevirtual   #688 <Method Intent Intent.putExtra(String, String)>
	//   26   57:pop             
			s1 = ((String) (PendingIntent.getActivity(context, 22, intent, 0)));
	//   27   58:aload_2         
	//   28   59:bipush          22
	//   29   61:aload_3         
	//   30   62:iconst_0        
	//   31   63:invokestatic    #694 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   32   66:astore_1        
			try
			{
				((PendingIntent) (s1)).send();
	//   33   67:aload_1         
	//   34   68:invokevirtual   #697 <Method void PendingIntent.send()>
				i = true;
	//   35   71:aload_0         
	//   36   72:iconst_1        
	//   37   73:putfield        #675 <Field boolean i>
				return;
	//   38   76:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  39   77:astore_1        
			{
				((android.app.PendingIntent.CanceledException) (s1)).printStackTrace();
	//   40   78:aload_1         
	//   41   79:invokevirtual   #700 <Method void android.app.PendingIntent$CanceledException.printStackTrace()>
			}
			return;
	//   42   82:return          
		} else
		{
			com.irobot.home.util.o.d("iRobotApp", "Skipping the add/remove dialog, because we've already shown it once");
	//   43   83:ldc1            #246 <String "iRobotApp">
	//   44   85:ldc2            #702 <String "Skipping the add/remove dialog, because we've already shown it once">
	//   45   88:invokestatic    #673 <Method void o.d(String, String)>
			return;
	//   46   91:return          
		}
	}

	public AccountError d()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #705 <Field AccountError o>
	//    2    4:areturn         
	}

	public boolean d(String s1)
	{
		return s1.equalsIgnoreCase(j);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field String j>
	//    3    5:invokevirtual   #401 <Method boolean String.equalsIgnoreCase(String)>
	//    4    8:ireturn         
	}

	public com.irobot.home.i e(String s1)
	{
		com.irobot.home.i j1 = (com.irobot.home.i)c.get(((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field HashMap c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #709 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #711 <Class com.irobot.home.i>
	//    5   11:astore_3        
		com.irobot.home.i i1 = j1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(j1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       38
		{
			i1 = new com.irobot.home.i(this, s1);
	//   10   18:new             #711 <Class com.irobot.home.i>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #714 <Method void com.irobot.home.i(IRobotApplication, String)>
	//   15   27:astore_2        
			c.put(((Object) (s1)), ((Object) (i1)));
	//   16   28:aload_0         
	//   17   29:getfield        #66  <Field HashMap c>
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #718 <Method Object HashMap.put(Object, Object)>
	//   21   37:pop             
		}
		return i1;
	//   22   38:aload_2         
	//   23   39:areturn         
	}

	public String e()
	{
		return getSharedPreferences("DEVEL", 0).getString("accepted_terms_version_1", "");
	//    0    0:aload_0         
	//    1    1:ldc2            #440 <String "DEVEL">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #444 <Method SharedPreferences getSharedPreferences(String, int)>
	//    4    8:ldc2            #452 <String "accepted_terms_version_1">
	//    5   11:ldc2            #720 <String "">
	//    6   14:invokeinterface #724 <Method String SharedPreferences.getString(String, String)>
	//    7   19:areturn         
	}

	public PersistentMapIdentifier f()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #409 <Field PersistentMapIdentifier r>
	//    2    4:areturn         
	}

	public void f(String s1)
	{
		l = s1.equalsIgnoreCase("country_not_set") ^ true;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #727 <String "country_not_set">
	//    3    5:invokevirtual   #401 <Method boolean String.equalsIgnoreCase(String)>
	//    4    8:iconst_1        
	//    5    9:ixor            
	//    6   10:putfield        #627 <Field boolean l>
		if(l)
	//*   7   13:aload_0         
	//*   8   14:getfield        #627 <Field boolean l>
	//*   9   17:ifeq            68
		{
			ApplicationUIService applicationuiservice = Assembler.getInstance().getApplicationUIService();
	//   10   20:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//   11   23:invokevirtual   #731 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//   12   26:astore_2        
			ApplicationUIServiceData applicationuiservicedata = ApplicationUIServiceData.create();
	//   13   27:invokestatic    #736 <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
	//   14   30:astore_3        
			applicationuiservicedata.setCountryCode(s1);
	//   15   31:aload_3         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #739 <Method void ApplicationUIServiceData.setCountryCode(String)>
			applicationuiservice.sendCommand(ApplicationUIServiceCommand.UpdateApplicationData, applicationuiservicedata);
	//   18   36:aload_2         
	//   19   37:getstatic       #745 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.UpdateApplicationData>
	//   20   40:aload_3         
	//   21   41:invokevirtual   #751 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
			Assembler.getInstance().getAccountService().setCountryCode(s1);
	//   22   44:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//   23   47:invokevirtual   #491 <Method AccountService Assembler.getAccountService()>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #752 <Method void AccountService.setCountryCode(String)>
			b();
	//   26   54:aload_0         
	//   27   55:invokevirtual   #754 <Method void b()>
			Assembler.getInstance().getTimeService().setCountryCode(s1);
	//   28   58:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//   29   61:invokevirtual   #758 <Method TimeService Assembler.getTimeService()>
	//   30   64:aload_1         
	//   31   65:invokevirtual   #761 <Method void TimeService.setCountryCode(String)>
		}
		PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putString("user_preferred_country_tag_key", s1).apply();
	//   32   68:aload_0         
	//   33   69:invokevirtual   #476 <Method Context getBaseContext()>
	//   34   72:invokestatic    #482 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   35   75:invokeinterface #450 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   36   80:ldc2            #763 <String "user_preferred_country_tag_key">
	//   37   83:aload_1         
	//   38   84:invokeinterface #458 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   39   89:invokeinterface #461 <Method void android.content.SharedPreferences$Editor.apply()>
		com.irobot.home.util.j.x();
	//   40   94:invokestatic    #766 <Method void com.irobot.home.util.j.x()>
		if(!s1.equals(((Object) (Locale.US.getCountry())))) goto _L2; else goto _L1
	//   41   97:aload_1         
	//   42   98:getstatic       #769 <Field Locale Locale.US>
	//   43  101:invokevirtual   #540 <Method String Locale.getCountry()>
	//   44  104:invokevirtual   #770 <Method boolean String.equals(Object)>
	//   45  107:ifeq            143
_L1:
		s1 = ((String) (((com.irobot.home.util.k.a)a.a().j().a(true)).k()));
	//   46  110:aload_0         
	//   47  111:getfield        #151 <Field k a>
	//   48  114:invokevirtual   #156 <Method com.irobot.home.util.k$a k.a()>
	//   49  117:invokevirtual   #772 <Method c com.irobot.home.util.k$a.j()>
	//   50  120:iconst_1        
	//   51  121:invokevirtual   #166 <Method org.androidannotations.api.b.e c.a(boolean)>
	//   52  124:checkcast       #158 <Class com.irobot.home.util.k$a>
	//   53  127:invokevirtual   #774 <Method c com.irobot.home.util.k$a.k()>
	//   54  130:astore_1        
_L4:
		((com.irobot.home.util.k.a)((c) (s1)).a(false)).n();
	//   55  131:aload_1         
	//   56  132:iconst_0        
	//   57  133:invokevirtual   #166 <Method org.androidannotations.api.b.e c.a(boolean)>
	//   58  136:checkcast       #158 <Class com.irobot.home.util.k$a>
	//   59  139:invokevirtual   #186 <Method void com.irobot.home.util.k$a.n()>
		return;
	//   60  142:return          
_L2:
		Iterator iterator = EuropeanUnionCountries.getList().iterator();
	//   61  143:invokestatic    #780 <Method HashSet EuropeanUnionCountries.getList()>
	//   62  146:invokevirtual   #786 <Method Iterator HashSet.iterator()>
	//   63  149:astore_2        
		do
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
	//   64  150:aload_2         
	//   65  151:invokeinterface #791 <Method boolean Iterator.hasNext()>
	//   66  156:ifeq            201
		while(!s1.equals(((Object) ((String)iterator.next()))));
	//   67  159:aload_1         
	//   68  160:aload_2         
	//   69  161:invokeinterface #794 <Method Object Iterator.next()>
	//   70  166:checkcast       #397 <Class String>
	//   71  169:invokevirtual   #770 <Method boolean String.equals(Object)>
	//   72  172:ifeq            150
		s1 = ((String) (a.a().k().a(true)));
	//   73  175:aload_0         
	//   74  176:getfield        #151 <Field k a>
	//   75  179:invokevirtual   #156 <Method com.irobot.home.util.k$a k.a()>
	//   76  182:invokevirtual   #774 <Method c com.irobot.home.util.k$a.k()>
	//   77  185:iconst_1        
	//   78  186:invokevirtual   #166 <Method org.androidannotations.api.b.e c.a(boolean)>
	//   79  189:astore_1        
_L5:
		s1 = ((String) (((com.irobot.home.util.k.a)s1).j()));
	//   80  190:aload_1         
	//   81  191:checkcast       #158 <Class com.irobot.home.util.k$a>
	//   82  194:invokevirtual   #772 <Method c com.irobot.home.util.k$a.j()>
	//   83  197:astore_1        
		if(true) goto _L4; else goto _L3
	//   84  198:goto            131
_L3:
		s1 = ((String) (a.a().k().a(false)));
	//   85  201:aload_0         
	//   86  202:getfield        #151 <Field k a>
	//   87  205:invokevirtual   #156 <Method com.irobot.home.util.k$a k.a()>
	//   88  208:invokevirtual   #774 <Method c com.irobot.home.util.k$a.k()>
	//   89  211:iconst_0        
	//   90  212:invokevirtual   #166 <Method org.androidannotations.api.b.e c.a(boolean)>
	//   91  215:astore_1        
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	//*  92  216:goto            190
	}

	public void g()
	{
		com.irobot.home.util.o.b("iRobotApp", "Loading model from preferences");
	//    0    0:ldc1            #246 <String "iRobotApp">
	//    1    2:ldc2            #796 <String "Loading model from preferences">
	//    2    5:invokestatic    #431 <Method void o.b(String, String)>
		com.irobot.home.o.b.a.a(this);
	//    3    8:aload_0         
	//    4    9:invokestatic    #224 <Method void a.a(IRobotApplication)>
		com.irobot.home.h.c.a(this);
	//    5   12:aload_0         
	//    6   13:invokestatic    #227 <Method void com.irobot.home.h.c.a(IRobotApplication)>
		RobotUploadService.a(this);
	//    7   16:aload_0         
	//    8   17:invokestatic    #799 <Method void RobotUploadService.a(IRobotApplication)>
		com.irobot.home.c.a a1 = com.irobot.home.c.a.a();
	//    9   20:invokestatic    #804 <Method com.irobot.home.c.a com.irobot.home.c.a.a()>
	//   10   23:astore_1        
		a1.a(this);
	//   11   24:aload_1         
	//   12   25:aload_0         
	//   13   26:invokevirtual   #805 <Method void com.irobot.home.c.a.a(IRobotApplication)>
		com.irobot.home.h.c.a(((com.irobot.home.h.g) (a1.b())));
	//   14   29:aload_1         
	//   15   30:invokevirtual   #808 <Method com.irobot.home.c.a$a com.irobot.home.c.a.b()>
	//   16   33:invokestatic    #811 <Method void com.irobot.home.h.c.a(com.irobot.home.h.g)>
		f = new IRobotModel(this);
	//   17   36:aload_0         
	//   18   37:new             #199 <Class IRobotModel>
	//   19   40:dup             
	//   20   41:aload_0         
	//   21   42:invokespecial   #813 <Method void IRobotModel(IRobotApplication)>
	//   22   45:putfield        #197 <Field IRobotModel f>
		g = new b(this);
	//   23   48:aload_0         
	//   24   49:new             #190 <Class b>
	//   25   52:dup             
	//   26   53:aload_0         
	//   27   54:invokespecial   #814 <Method void b(IRobotApplication)>
	//   28   57:putfield        #188 <Field b g>
		com.irobot.home.util.j.q();
	//   29   60:invokestatic    #816 <Method void com.irobot.home.util.j.q()>
		f.h();
	//   30   63:aload_0         
	//   31   64:getfield        #197 <Field IRobotModel f>
	//   32   67:invokevirtual   #818 <Method void IRobotModel.h()>
		if(f.b() != 0)
	//*  33   70:aload_0         
	//*  34   71:getfield        #197 <Field IRobotModel f>
	//*  35   74:invokevirtual   #820 <Method int IRobotModel.b()>
	//*  36   77:ifeq            84
			k();
	//   37   80:aload_0         
	//   38   81:invokevirtual   #822 <Method void k()>
	//   39   84:return          
	}

	public void g(String s1)
	{
		if(!h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field boolean h>
	//*   2    4:ifne            11
			s();
	//    3    7:aload_0         
	//    4    8:invokespecial   #824 <Method void s()>
	//    5   11:return          
	}

	public IRobotModel h()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field IRobotModel f>
	//    2    4:areturn         
	}

	public b i()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field b g>
	//    2    4:areturn         
	}

	public void j()
	{
		i = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #675 <Field boolean i>
		j = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #59  <Field String j>
	//    6   10:return          
	}

	public void k()
	{
		Intent intent = new Intent("com.irobot.home.MODEL_CHANGED");
	//    0    0:new             #591 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #828 <String "com.irobot.home.MODEL_CHANGED">
	//    3    7:invokespecial   #682 <Method void Intent(String)>
	//    4   10:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*   5   11:getstatic       #94  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   14:bipush          12
	//*   7   16:icmplt          26
			intent.addFlags(32);
	//    8   19:aload_1         
	//    9   20:bipush          32
	//   10   22:invokevirtual   #608 <Method Intent Intent.addFlags(int)>
	//   11   25:pop             
		android.support.v4.content.c.a(((Context) (this))).a(intent);
	//   12   26:aload_0         
	//   13   27:invokestatic    #833 <Method android.support.v4.content.c android.support.v4.content.c.a(Context)>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #836 <Method boolean android.support.v4.content.c.a(Intent)>
	//   16   34:pop             
	//   17   35:return          
	}

	public boolean l()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean q>
	//    2    4:ireturn         
	}

	public void m()
	{
		if(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field boolean h>
	//*   2    4:ifeq            15
			g.a(false);
	//    3    7:aload_0         
	//    4    8:getfield        #188 <Field b g>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #193 <Method void b.a(boolean)>
	//    7   15:return          
	}

	public void n()
	{
		a(com.irobot.home.util.j.g(getBaseContext()), Boolean.valueOf(false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #476 <Method Context getBaseContext()>
	//    3    5:invokestatic    #502 <Method Locale com.irobot.home.util.j.g(Context)>
	//    4    8:iconst_0        
	//    5    9:invokestatic    #839 <Method Boolean Boolean.valueOf(boolean)>
	//    6   12:invokevirtual   #841 <Method void a(Locale, Boolean)>
	//    7   15:return          
	}

	public void o()
	{
		SharedPreferences sharedpreferences = getBaseContext().getSharedPreferences("DEVEL", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #476 <Method Context getBaseContext()>
	//    2    4:ldc2            #440 <String "DEVEL">
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #842 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   11:astore_1        
		Assembler.getInstance().setPMapsEnabled(sharedpreferences.getBoolean("enable_pmaps", false));
	//    6   12:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//    7   15:aload_1         
	//    8   16:ldc2            #844 <String "enable_pmaps">
	//    9   19:iconst_0        
	//   10   20:invokeinterface #848 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   11   25:invokevirtual   #851 <Method void Assembler.setPMapsEnabled(boolean)>
		Assembler.getInstance().setKeepOutZonesEnabled(sharedpreferences.getBoolean("enable_keepoutzones", false));
	//   12   28:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//   13   31:aload_1         
	//   14   32:ldc2            #853 <String "enable_keepoutzones">
	//   15   35:iconst_0        
	//   16   36:invokeinterface #848 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   17   41:invokevirtual   #856 <Method void Assembler.setKeepOutZonesEnabled(boolean)>
	//   18   44:return          
	}

	public void onAccountErrorEvent(AccountErrorEvent accounterrorevent)
	{
		com.irobot.home.util.o.b("iRobotApp", "AccountErrorEvent received");
	//    0    0:ldc1            #246 <String "iRobotApp">
	//    1    2:ldc2            #861 <String "AccountErrorEvent received">
	//    2    5:invokestatic    #431 <Method void o.b(String, String)>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    8:new             #232 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #233 <Method void StringBuilder()>
	//    6   15:astore_2        
		stringbuilder.append("** Error: ");
	//    7   16:aload_2         
	//    8   17:ldc2            #863 <String "** Error: ">
	//    9   20:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
		stringbuilder.append(((Object) (accounterrorevent.error())));
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokevirtual   #868 <Method AccountError AccountErrorEvent.error()>
	//   14   29:invokevirtual   #279 <Method StringBuilder StringBuilder.append(Object)>
	//   15   32:pop             
		com.irobot.home.util.o.a("iRobotApp", stringbuilder.toString());
	//   16   33:ldc1            #246 <String "iRobotApp">
	//   17   35:aload_2         
	//   18   36:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   19   39:invokestatic    #252 <Method void o.a(String, String)>
		n = a.True;
	//   20   42:aload_0         
	//   21   43:getstatic       #871 <Field IRobotApplication$a IRobotApplication$a.True>
	//   22   46:putfield        #75  <Field IRobotApplication$a n>
		o = accounterrorevent.error();
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokevirtual   #868 <Method AccountError AccountErrorEvent.error()>
	//   26   54:putfield        #705 <Field AccountError o>
	//   27   57:return          
	}

	public void onAccountInfoUpdatedEvent(AccountInfoUpdatedEvent accountinfoupdatedevent)
	{
		com.irobot.home.util.p.b();
	//    0    0:invokestatic    #877 <Method void p.b()>
		com.irobot.home.util.o.b("iRobotApp", "AccountInfoUpdatedEvent received");
	//    1    3:ldc1            #246 <String "iRobotApp">
	//    2    5:ldc2            #879 <String "AccountInfoUpdatedEvent received">
	//    3    8:invokestatic    #431 <Method void o.b(String, String)>
		StringBuilder stringbuilder = new StringBuilder();
	//    4   11:new             #232 <Class StringBuilder>
	//    5   14:dup             
	//    6   15:invokespecial   #233 <Method void StringBuilder()>
	//    7   18:astore_2        
		stringbuilder.append("** Email Address: ");
	//    8   19:aload_2         
	//    9   20:ldc2            #881 <String "** Email Address: ">
	//   10   23:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:pop             
		stringbuilder.append(accountinfoupdatedevent.accountInfo().email());
	//   12   27:aload_2         
	//   13   28:aload_1         
	//   14   29:invokevirtual   #887 <Method AccountInfo AccountInfoUpdatedEvent.accountInfo()>
	//   15   32:invokevirtual   #892 <Method String AccountInfo.email()>
	//   16   35:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
		com.irobot.home.util.o.a("iRobotApp", stringbuilder.toString());
	//   18   39:ldc1            #246 <String "iRobotApp">
	//   19   41:aload_2         
	//   20   42:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   21   45:invokestatic    #252 <Method void o.a(String, String)>
		n = a.False;
	//   22   48:aload_0         
	//   23   49:getstatic       #633 <Field IRobotApplication$a IRobotApplication$a.False>
	//   24   52:putfield        #75  <Field IRobotApplication$a n>
	//   25   55:return          
	}

	public void onAccountLoggedInEvent(AccountLoggedInEvent accountloggedinevent)
	{
		com.irobot.home.util.p.b();
	//    0    0:invokestatic    #877 <Method void p.b()>
		com.irobot.home.util.o.b("iRobotApp", "AccountLoggedInEvent received");
	//    1    3:ldc1            #246 <String "iRobotApp">
	//    2    5:ldc2            #896 <String "AccountLoggedInEvent received">
	//    3    8:invokestatic    #431 <Method void o.b(String, String)>
		StringBuilder stringbuilder = new StringBuilder();
	//    4   11:new             #232 <Class StringBuilder>
	//    5   14:dup             
	//    6   15:invokespecial   #233 <Method void StringBuilder()>
	//    7   18:astore_2        
		stringbuilder.append("** Email Address: ");
	//    8   19:aload_2         
	//    9   20:ldc2            #881 <String "** Email Address: ">
	//   10   23:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:pop             
		stringbuilder.append(accountloggedinevent.accountInfo().email());
	//   12   27:aload_2         
	//   13   28:aload_1         
	//   14   29:invokevirtual   #899 <Method AccountInfo AccountLoggedInEvent.accountInfo()>
	//   15   32:invokevirtual   #892 <Method String AccountInfo.email()>
	//   16   35:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
		com.irobot.home.util.o.a("iRobotApp", stringbuilder.toString());
	//   18   39:ldc1            #246 <String "iRobotApp">
	//   19   41:aload_2         
	//   20   42:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   21   45:invokestatic    #252 <Method void o.a(String, String)>
		n = a.False;
	//   22   48:aload_0         
	//   23   49:getstatic       #633 <Field IRobotApplication$a IRobotApplication$a.False>
	//   24   52:putfield        #75  <Field IRobotApplication$a n>
	//   25   55:return          
	}

	public void onAccountLoggedOutEvent(AccountLoggedOutEvent accountloggedoutevent)
	{
		com.irobot.home.util.p.c();
	//    0    0:invokestatic    #903 <Method void p.c()>
		com.irobot.home.util.o.b("iRobotApp", "AccountLoggedOutEvent received");
	//    1    3:ldc1            #246 <String "iRobotApp">
	//    2    5:ldc2            #905 <String "AccountLoggedOutEvent received">
	//    3    8:invokestatic    #431 <Method void o.b(String, String)>
		n = a.False;
	//    4   11:aload_0         
	//    5   12:getstatic       #633 <Field IRobotApplication$a IRobotApplication$a.False>
	//    6   15:putfield        #75  <Field IRobotApplication$a n>
	//    7   18:return          
	}

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #909 <Method void t()>
		if(android.os.Build.VERSION.SDK_INT == 23)
	//*   2    4:getstatic       #94  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          23
	//*   4    9:icmpne          17
			a(activity, true);
	//    5   12:aload_1         
	//    6   13:iconst_1        
	//    7   14:invokestatic    #911 <Method void a(Activity, boolean)>
		b();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #754 <Method void b()>
	//   10   21:return          
	}

	public void onActivityDestroyed(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityPaused(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityResumed(Activity activity)
	{
		if(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field boolean h>
	//*   2    4:ifeq            19
		{
			g.a();
	//    3    7:aload_0         
	//    4    8:getfield        #188 <Field b g>
	//    5   11:invokevirtual   #917 <Method void b.a()>
			h = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #195 <Field boolean h>
		}
	//    9   19:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onActivityStarted(Activity activity)
	{
		int i1 = p + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int p>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_2        
		p = i1;
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:putfield        #77  <Field int p>
		if(i1 > 0 && !q)
	//*   8   12:iload_2         
	//*   9   13:ifle            68
	//*  10   16:aload_0         
	//*  11   17:getfield        #79  <Field boolean q>
	//*  12   20:ifne            68
		{
			AnalyticsSubsystem.getInstance().trackAppForegrounded();
	//   13   23:invokestatic    #368 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   14   26:invokevirtual   #922 <Method void AnalyticsSubsystem.trackAppForegrounded()>
			q = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #79  <Field boolean q>
			NetworkManager.defaultManager().networkStatistics().countFailures();
	//   18   34:invokestatic    #207 <Method NetworkManager NetworkManager.defaultManager()>
	//   19   37:invokevirtual   #211 <Method NetworkStatistics NetworkManager.networkStatistics()>
	//   20   40:invokevirtual   #925 <Method void NetworkStatistics.countFailures()>
			if(!(activity instanceof SplashActivity))
	//*  21   43:aload_1         
	//*  22   44:instanceof      #927 <Class SplashActivity>
	//*  23   47:ifne            68
			{
				AccountService accountservice = Assembler.getInstance().getAccountService();
	//   24   50:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//   25   53:invokevirtual   #491 <Method AccountService Assembler.getAccountService()>
	//   26   56:astore_3        
				if(accountservice.isLoggedIn())
	//*  27   57:aload_3         
	//*  28   58:invokevirtual   #669 <Method boolean AccountService.isLoggedIn()>
	//*  29   61:ifeq            68
					accountservice.refreshAccountInfo();
	//   30   64:aload_3         
	//   31   65:invokevirtual   #930 <Method void AccountService.refreshAccountInfo()>
			}
		}
		if(s != null)
	//*  32   68:aload_0         
	//*  33   69:getfield        #932 <Field RelativeLayout s>
	//*  34   72:ifnull          97
		{
			((ViewGroup)s.getParent()).removeView(((View) (s)));
	//   35   75:aload_0         
	//   36   76:getfield        #932 <Field RelativeLayout s>
	//   37   79:invokevirtual   #938 <Method android.view.ViewParent RelativeLayout.getParent()>
	//   38   82:checkcast       #940 <Class ViewGroup>
	//   39   85:aload_0         
	//   40   86:getfield        #932 <Field RelativeLayout s>
	//   41   89:invokevirtual   #944 <Method void ViewGroup.removeView(View)>
			s = null;
	//   42   92:aload_0         
	//   43   93:aconst_null     
	//   44   94:putfield        #932 <Field RelativeLayout s>
		}
		if(Assembler.getInstance().getAccountService().isFeatureEnabled(FeatureType.FeedbackReport) && !(activity instanceof BugReportActivity))
	//*  45   97:invokestatic    #423 <Method Assembler Assembler.getInstance()>
	//*  46  100:invokevirtual   #491 <Method AccountService Assembler.getAccountService()>
	//*  47  103:getstatic       #950 <Field FeatureType FeatureType.FeedbackReport>
	//*  48  106:invokevirtual   #954 <Method boolean AccountService.isFeatureEnabled(FeatureType)>
	//*  49  109:ifeq            241
	//*  50  112:aload_1         
	//*  51  113:instanceof      #956 <Class BugReportActivity>
	//*  52  116:ifne            241
		{
			Object obj = ((Object) (activity.getResources().getDisplayMetrics()));
	//   53  119:aload_1         
	//   54  120:invokevirtual   #957 <Method Resources Activity.getResources()>
	//   55  123:invokevirtual   #574 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   56  126:astore_3        
			s = new RelativeLayout(((Context) (activity)));
	//   57  127:aload_0         
	//   58  128:new             #934 <Class RelativeLayout>
	//   59  131:dup             
	//   60  132:aload_1         
	//   61  133:invokespecial   #960 <Method void RelativeLayout(Context)>
	//   62  136:putfield        #932 <Field RelativeLayout s>
			obj = ((Object) (new android.widget.RelativeLayout.LayoutParams((int)((double)(((DisplayMetrics) (obj)).density * 100F) + 0.5D), (int)((double)(((DisplayMetrics) (obj)).density * 100F) + 0.5D))));
	//   63  139:new             #962 <Class android.widget.RelativeLayout$LayoutParams>
	//   64  142:dup             
	//   65  143:aload_3         
	//   66  144:getfield        #968 <Field float DisplayMetrics.density>
	//   67  147:ldc2            #969 <Float 100F>
	//   68  150:fmul            
	//   69  151:f2d             
	//   70  152:ldc2w           #970 <Double 0.5D>
	//   71  155:dadd            
	//   72  156:d2i             
	//   73  157:aload_3         
	//   74  158:getfield        #968 <Field float DisplayMetrics.density>
	//   75  161:ldc2            #969 <Float 100F>
	//   76  164:fmul            
	//   77  165:f2d             
	//   78  166:ldc2w           #970 <Double 0.5D>
	//   79  169:dadd            
	//   80  170:d2i             
	//   81  171:invokespecial   #974 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   82  174:astore_3        
			((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
	//   83  175:aload_3         
	//   84  176:bipush          10
	//   85  178:invokevirtual   #978 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9);
	//   86  181:aload_3         
	//   87  182:bipush          9
	//   88  184:invokevirtual   #978 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			s.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   89  187:aload_0         
	//   90  188:getfield        #932 <Field RelativeLayout s>
	//   91  191:aload_3         
	//   92  192:invokevirtual   #982 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			s.setOnTouchListener(new android.view.View.OnTouchListener(activity) {

				public boolean onTouch(View view, MotionEvent motionevent)
				{
					if(com.irobot.home.IRobotApplication.a(b) != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field IRobotApplication b>
				//*   2    4:invokestatic    #32  <Method Timer com.irobot.home.IRobotApplication.a(IRobotApplication)>
				//*   3    7:ifnull          20
						com.irobot.home.IRobotApplication.a(b).cancel();
				//    4   10:aload_0         
				//    5   11:getfield        #21  <Field IRobotApplication b>
				//    6   14:invokestatic    #32  <Method Timer com.irobot.home.IRobotApplication.a(IRobotApplication)>
				//    7   17:invokevirtual   #37  <Method void Timer.cancel()>
					if(3 <= IRobotApplication.q())
				//*   8   20:iconst_3        
				//*   9   21:invokestatic    #41  <Method int IRobotApplication.q()>
				//*  10   24:icmpgt          99
					{
						com.irobot.home.IRobotApplication.a(0);
				//   11   27:iconst_0        
				//   12   28:invokestatic    #44  <Method int com.irobot.home.IRobotApplication.a(int)>
				//   13   31:pop             
						view = ((View) (com.irobot.home.util.f.a(a.getWindow().getDecorView().getRootView(), "screenshot", ((Context) (a)))));
				//   14   32:aload_0         
				//   15   33:getfield        #23  <Field Activity a>
				//   16   36:invokevirtual   #50  <Method Window Activity.getWindow()>
				//   17   39:invokevirtual   #56  <Method View Window.getDecorView()>
				//   18   42:invokevirtual   #61  <Method View View.getRootView()>
				//   19   45:ldc1            #63  <String "screenshot">
				//   20   47:aload_0         
				//   21   48:getfield        #23  <Field Activity a>
				//   22   51:invokestatic    #68  <Method String com.irobot.home.util.f.a(View, String, Context)>
				//   23   54:astore_1        
						view = ((View) ((BugReportActivity_.a)com.irobot.home.BugReportActivity_.a(((Context) (b))).b(((String) (view))).g(0x10000000)));
				//   24   55:aload_0         
				//   25   56:getfield        #21  <Field IRobotApplication b>
				//   26   59:invokestatic    #73  <Method BugReportActivity_$a com.irobot.home.BugReportActivity_.a(Context)>
				//   27   62:aload_1         
				//   28   63:invokevirtual   #78  <Method BugReportActivity_$a com.irobot.home.BugReportActivity_$a.b(String)>
				//   29   66:ldc1            #79  <Int 0x10000000>
				//   30   68:invokevirtual   #83  <Method org.androidannotations.api.a.d com.irobot.home.BugReportActivity_$a.g(int)>
				//   31   71:checkcast       #75  <Class BugReportActivity_$a>
				//   32   74:astore_1        
						motionevent = ((MotionEvent) (com.irobot.home.util.j.k()));
				//   33   75:invokestatic    #89  <Method AssetId com.irobot.home.util.j.k()>
				//   34   78:astore_2        
						if(motionevent != null)
				//*  35   79:aload_2         
				//*  36   80:ifnull          92
							((BugReportActivity_.a) (view)).a(((AssetId) (motionevent)).getId());
				//   37   83:aload_1         
				//   38   84:aload_2         
				//   39   85:invokevirtual   #95  <Method String AssetId.getId()>
				//   40   88:invokevirtual   #97  <Method BugReportActivity_$a com.irobot.home.BugReportActivity_$a.a(String)>
				//   41   91:pop             
						((BugReportActivity_.a) (view)).a();
				//   42   92:aload_1         
				//   43   93:invokevirtual   #100 <Method org.androidannotations.api.a.e com.irobot.home.BugReportActivity_$a.a()>
				//   44   96:pop             
						return false;
				//   45   97:iconst_0        
				//   46   98:ireturn         
					} else
					{
						com.irobot.home.IRobotApplication.a(b, new Timer());
				//   47   99:aload_0         
				//   48  100:getfield        #21  <Field IRobotApplication b>
				//   49  103:new             #34  <Class Timer>
				//   50  106:dup             
				//   51  107:invokespecial   #101 <Method void Timer()>
				//   52  110:invokestatic    #104 <Method Timer com.irobot.home.IRobotApplication.a(IRobotApplication, Timer)>
				//   53  113:pop             
						com.irobot.home.IRobotApplication.a(b).schedule(((TimerTask) (new TimerTask(this) {

							public void run()
							{
								com.irobot.home.IRobotApplication.a(0);
							//    0    0:iconst_0        
							//    1    1:invokestatic    #25  <Method int com.irobot.home.IRobotApplication.a(int)>
							//    2    4:pop             
							//    3    5:return          
							}

							final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field IRobotApplication$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void TimerTask()>
			//    5    9:return          
			}
						}
)), 500L);
				//   54  114:aload_0         
				//   55  115:getfield        #21  <Field IRobotApplication b>
				//   56  118:invokestatic    #32  <Method Timer com.irobot.home.IRobotApplication.a(IRobotApplication)>
				//   57  121:new             #13  <Class IRobotApplication$1$1>
				//   58  124:dup             
				//   59  125:aload_0         
				//   60  126:invokespecial   #107 <Method void IRobotApplication$1$1(IRobotApplication$1)>
				//   61  129:ldc2w           #108 <Long 500L>
				//   62  132:invokevirtual   #113 <Method void Timer.schedule(TimerTask, long)>
						return false;
				//   63  135:iconst_0        
				//   64  136:ireturn         
					}
				}

				final Activity a;
				final IRobotApplication b;

			
			{
				b = IRobotApplication.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field IRobotApplication b>
				a = activity;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Activity a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   93  195:aload_0         
	//   94  196:getfield        #932 <Field RelativeLayout s>
	//   95  199:new             #10  <Class IRobotApplication$1>
	//   96  202:dup             
	//   97  203:aload_0         
	//   98  204:aload_1         
	//   99  205:invokespecial   #985 <Method void IRobotApplication$1(IRobotApplication, Activity)>
	//  100  208:invokevirtual   #989 <Method void RelativeLayout.setOnTouchListener(android.view.View$OnTouchListener)>
			activity = ((Activity) ((ViewGroup)activity.findViewById(0x1020002)));
	//  101  211:aload_1         
	//  102  212:ldc2            #990 <Int 0x1020002>
	//  103  215:invokevirtual   #994 <Method View Activity.findViewById(int)>
	//  104  218:checkcast       #940 <Class ViewGroup>
	//  105  221:astore_1        
			if(activity != null)
	//* 106  222:aload_1         
	//* 107  223:ifnull          241
			{
				((ViewGroup) (activity)).addView(((View) (s)));
	//  108  226:aload_1         
	//  109  227:aload_0         
	//  110  228:getfield        #932 <Field RelativeLayout s>
	//  111  231:invokevirtual   #997 <Method void ViewGroup.addView(View)>
				s.bringToFront();
	//  112  234:aload_0         
	//  113  235:getfield        #932 <Field RelativeLayout s>
	//  114  238:invokevirtual   #1000 <Method void RelativeLayout.bringToFront()>
			}
		}
	//  115  241:return          
	}

	public void onActivityStopped(Activity activity)
	{
		int i1 = p - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int p>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_2        
		p = i1;
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:putfield        #77  <Field int p>
		if(i1 <= 0)
	//*   8   12:iload_2         
	//*   9   13:ifgt            27
		{
			AnalyticsSubsystem.getInstance().trackAppBackgrounded();
	//   10   16:invokestatic    #368 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   11   19:invokevirtual   #1004 <Method void AnalyticsSubsystem.trackAppBackgrounded()>
			q = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #79  <Field boolean q>
		}
	//   15   27:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1008 <Method void Application.onConfigurationChanged(Configuration)>
		n();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #1009 <Method void n()>
	//    5    9:return          
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1012 <Method void Application.onCreate()>
		t();
	//    2    4:aload_0         
	//    3    5:invokespecial   #909 <Method void t()>
		com.irobot.home.util.p.a();
	//    4    8:invokestatic    #1013 <Method void p.a()>
		com.irobot.home.core.b.a();
	//    5   11:invokestatic    #1016 <Method void com.irobot.home.core.b.a()>
		com.irobot.home.util.o.b("iRobotApp", "--start-- IRobotApp create.");
	//    6   14:ldc1            #246 <String "iRobotApp">
	//    7   16:ldc2            #1018 <String "--start-- IRobotApp create.">
	//    8   19:invokestatic    #431 <Method void o.b(String, String)>
		n();
	//    9   22:aload_0         
	//   10   23:invokevirtual   #1009 <Method void n()>
		o();
	//   11   26:aload_0         
	//   12   27:invokevirtual   #1020 <Method void o()>
		net.danlew.android.joda.a.a(((Context) (this)));
	//   13   30:aload_0         
	//   14   31:invokestatic    #1024 <Method void net.danlew.android.joda.a.a(Context)>
		v();
	//   15   34:aload_0         
	//   16   35:invokespecial   #1026 <Method void v()>
		org.androidannotations.api.a.a(((java.util.concurrent.Executor) (Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors(), ((java.util.concurrent.ThreadFactory) (new com.irobot.home.r.a("AndroidAnnotation", false)))))));
	//   17   38:invokestatic    #1032 <Method Runtime Runtime.getRuntime()>
	//   18   41:invokevirtual   #1035 <Method int Runtime.availableProcessors()>
	//   19   44:new             #1037 <Class com.irobot.home.r.a>
	//   20   47:dup             
	//   21   48:ldc2            #1039 <String "AndroidAnnotation">
	//   22   51:iconst_0        
	//   23   52:invokespecial   #1042 <Method void com.irobot.home.r.a(String, boolean)>
	//   24   55:invokestatic    #1048 <Method java.util.concurrent.ScheduledExecutorService Executors.newScheduledThreadPool(int, java.util.concurrent.ThreadFactory)>
	//   25   58:invokestatic    #1053 <Method void org.androidannotations.api.a.a(java.util.concurrent.Executor)>
		registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (this)));
	//   26   61:aload_0         
	//   27   62:aload_0         
	//   28   63:invokevirtual   #1057 <Method void registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
		StandbyModeDetector.a().a(((com.irobot.home.util.StandbyModeDetector.a) (this)));
	//   29   66:invokestatic    #1062 <Method StandbyModeDetector StandbyModeDetector.a()>
	//   30   69:aload_0         
	//   31   70:invokevirtual   #1065 <Method boolean StandbyModeDetector.a(com.irobot.home.util.StandbyModeDetector$a)>
	//   32   73:pop             
		Object obj = ((Object) (getSharedPreferences("DEVEL", 0)));
	//   33   74:aload_0         
	//   34   75:ldc2            #440 <String "DEVEL">
	//   35   78:iconst_0        
	//   36   79:invokevirtual   #444 <Method SharedPreferences getSharedPreferences(String, int)>
	//   37   82:astore_1        
		i.c = ((SharedPreferences) (obj)).getBoolean("devel_website", i.m);
	//   38   83:aload_1         
	//   39   84:ldc2            #1067 <String "devel_website">
	//   40   87:getstatic       #1069 <Field boolean i.m>
	//   41   90:invokeinterface #848 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   42   95:putstatic       #1071 <Field boolean i.c>
		i.d = ((SharedPreferences) (obj)).getBoolean("manual_select_soft_ap", false);
	//   43   98:aload_1         
	//   44   99:ldc2            #1073 <String "manual_select_soft_ap">
	//   45  102:iconst_0        
	//   46  103:invokeinterface #848 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   47  108:putstatic       #1075 <Field boolean i.d>
		i.e = ((SharedPreferences) (obj)).getBoolean("use_cloud", true);
	//   48  111:aload_1         
	//   49  112:ldc2            #1077 <String "use_cloud">
	//   50  115:iconst_1        
	//   51  116:invokeinterface #848 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   52  121:putstatic       #1079 <Field boolean i.e>
		i.f = ((SharedPreferences) (obj)).getBoolean("metric_units_key", false);
	//   53  124:aload_1         
	//   54  125:ldc2            #1081 <String "metric_units_key">
	//   55  128:iconst_0        
	//   56  129:invokeinterface #848 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   57  134:putstatic       #1083 <Field boolean i.f>
		i.g = ((SharedPreferences) (obj)).getBoolean("reset_robot_after_setup", true);
	//   58  137:aload_1         
	//   59  138:ldc2            #1085 <String "reset_robot_after_setup">
	//   60  141:iconst_1        
	//   61  142:invokeinterface #848 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   62  147:putstatic       #1087 <Field boolean i.g>
		k = ((SharedPreferences) (obj)).getBoolean("eula_accepted_version_1", false);
	//   63  150:aload_0         
	//   64  151:aload_1         
	//   65  152:ldc2            #616 <String "eula_accepted_version_1">
	//   66  155:iconst_0        
	//   67  156:invokeinterface #848 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   68  161:putfield        #614 <Field boolean k>
		l = com.irobot.home.util.j.a(getBaseContext(), false).equalsIgnoreCase("country_not_set") ^ true;
	//   69  164:aload_0         
	//   70  165:aload_0         
	//   71  166:invokevirtual   #476 <Method Context getBaseContext()>
	//   72  169:iconst_0        
	//   73  170:invokestatic    #1090 <Method String com.irobot.home.util.j.a(Context, boolean)>
	//   74  173:ldc2            #727 <String "country_not_set">
	//   75  176:invokevirtual   #401 <Method boolean String.equalsIgnoreCase(String)>
	//   76  179:iconst_1        
	//   77  180:ixor            
	//   78  181:putfield        #627 <Field boolean l>
		m = "https://homesupport.irobot.com/cc/api/v1/";
	//   79  184:aload_0         
	//   80  185:ldc2            #403 <String "https://homesupport.irobot.com/cc/api/v1/">
	//   81  188:putfield        #70  <Field String m>
		if(((Boolean)a.b().a()).booleanValue())
	//*  82  191:aload_0         
	//*  83  192:getfield        #151 <Field k a>
	//*  84  195:invokevirtual   #342 <Method d k.b()>
	//*  85  198:invokevirtual   #347 <Method Object d.a()>
	//*  86  201:checkcast       #349 <Class Boolean>
	//*  87  204:invokevirtual   #353 <Method boolean Boolean.booleanValue()>
	//*  88  207:ifeq            223
		{
			com.irobot.home.util.o.b("Bootstrap", "Initializing app for the first time.");
	//   89  210:ldc2            #1092 <String "Bootstrap">
	//   90  213:ldc2            #1094 <String "Initializing app for the first time.">
	//   91  216:invokestatic    #431 <Method void o.b(String, String)>
			r();
	//   92  219:aload_0         
	//   93  220:invokespecial   #1096 <Method void r()>
		}
		g();
	//   94  223:aload_0         
	//   95  224:invokevirtual   #1098 <Method void g()>
		b();
	//   96  227:aload_0         
	//   97  228:invokevirtual   #754 <Method void b()>
		com.irobot.home.util.t.a(((Context) (this)));
	//   98  231:aload_0         
	//   99  232:invokestatic    #1101 <Method void t.a(Context)>
		u();
	//  100  235:aload_0         
	//  101  236:invokespecial   #1103 <Method void u()>
		obj = ((Object) (com.irobot.home.util.j.h(((Context) (this)))));
	//  102  239:aload_0         
	//  103  240:invokestatic    #1106 <Method String com.irobot.home.util.j.h(Context)>
	//  104  243:astore_1        
		AnalyticsSubsystem.getInstance().trackCountryPickerSelection(((String) (obj)));
	//  105  244:invokestatic    #368 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//  106  247:aload_1         
	//  107  248:invokevirtual   #1109 <Method void AnalyticsSubsystem.trackCountryPickerSelection(String)>
		b.a.a.a.c.a((new b.a.a.a.c.a(((Context) (this)))).a(new b.a.a.a.i[] {
			new Crashlytics()
		}).a(true).a());
	//  108  251:new             #1111 <Class b.a.a.a.c$a>
	//  109  254:dup             
	//  110  255:aload_0         
	//  111  256:invokespecial   #1112 <Method void b.a.a.a.c$a(Context)>
	//  112  259:iconst_1        
	//  113  260:anewarray       b.a.a.a.i[]
	//  114  263:dup             
	//  115  264:iconst_0        
	//  116  265:new             #1116 <Class Crashlytics>
	//  117  268:dup             
	//  118  269:invokespecial   #1117 <Method void Crashlytics()>
	//  119  272:aastore         
	//  120  273:invokevirtual   #1120 <Method b.a.a.a.c$a b.a.a.a.c$a.a(b.a.a.a.i[])>
	//  121  276:iconst_1        
	//  122  277:invokevirtual   #1123 <Method b.a.a.a.c$a b.a.a.a.c$a.a(boolean)>
	//  123  280:invokevirtual   #1126 <Method b.a.a.a.c b.a.a.a.c$a.a()>
	//  124  283:invokestatic    #1131 <Method b.a.a.a.c b.a.a.a.c.a(b.a.a.a.c)>
	//  125  286:pop             
	//  126  287:return          
	}

	public void onTrimMemory(int i1)
	{
		super.onTrimMemory(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1134 <Method void Application.onTrimMemory(int)>
		if(i1 == 20)
	//*   3    5:iload_1         
	//*   4    6:bipush          20
	//*   5    8:icmpne          15
			s();
	//    6   11:aload_0         
	//    7   12:invokespecial   #824 <Method void s()>
	//    8   15:return          
	}

	public void p()
	{
		if(android.os.Build.VERSION.SDK_INT > 23)
	//*   0    0:getstatic       #94  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmple          12
			n();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #1009 <Method void n()>
	//    5   12:return          
	}

	private static int u;
	k a;
	HashMap b;
	HashMap c;
	RegistrationRestClient d;
	RegistrationRestErrorHandler e;
	private IRobotModel f;
	private b g;
	private boolean h;
	private boolean i;
	private String j;
	private boolean k;
	private boolean l;
	private String m;
	private a n;
	private AccountError o;
	private int p;
	private boolean q;
	private PersistentMapIdentifier r;
	private RelativeLayout s;
	private Timer t;

	static 
	{
	//    0    0:return          
	}
}
