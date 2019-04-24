// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.ab;
import com.yandex.metrica.impl.bv;
import com.yandex.metrica.impl.ob.nf;
import com.yandex.metrica.impl.ob.ng;
import com.yandex.metrica.impl.ob.nk;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

// Referenced classes of package com.yandex.metrica:
//			e, c, MetricaEventHandler, YandexMetricaConfig, 
//			ReporterConfig, IReporter, Revenue, DeferredDeeplinkParametersListener

public final class YandexMetrica
{

	private YandexMetrica()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	public static void activate(Context context, YandexMetricaConfig yandexmetricaconfig)
	{
		a.a(((Object) (context)));
	//    0    0:getstatic       #36  <Field nk a>
	//    1    3:aload_0         
	//    2    4:invokeinterface #71  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    3    9:pop             
		b.a(((Object) (yandexmetricaconfig)));
	//    4   10:getstatic       #40  <Field nk b>
	//    5   13:aload_1         
	//    6   14:invokeinterface #71  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    7   19:pop             
		bv.a(context, com.yandex.metrica.e.a(yandexmetricaconfig));
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokestatic    #76  <Method e e.a(YandexMetricaConfig)>
	//   11   25:invokestatic    #81  <Method void bv.a(Context, e)>
	//   12   28:return          
	}

	public static void activateReporter(Context context, ReporterConfig reporterconfig)
	{
		a.a(((Object) (context)));
	//    0    0:getstatic       #36  <Field nk a>
	//    1    3:aload_0         
	//    2    4:invokeinterface #71  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    3    9:pop             
		c.a(((Object) (reporterconfig)));
	//    4   10:getstatic       #44  <Field nk c>
	//    5   13:aload_1         
	//    6   14:invokeinterface #71  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    7   19:pop             
		bv.b(context).a(com.yandex.metrica.c.a(reporterconfig));
	//    8   20:aload_0         
	//    9   21:invokestatic    #87  <Method bv bv.b(Context)>
	//   10   24:aload_1         
	//   11   25:invokestatic    #92  <Method c c.a(ReporterConfig)>
	//   12   28:invokevirtual   #95  <Method void bv.a(c)>
	//   13   31:return          
	}

	public static void enableActivityAutoTracking(Application application)
	{
		d.a(((Object) (application)));
	//    0    0:getstatic       #48  <Field nk d>
	//    1    3:aload_0         
	//    2    4:invokeinterface #71  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    3    9:pop             
		bv.c().a(application);
	//    4   10:invokestatic    #100 <Method ab bv.c()>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #104 <Method void ab.a(Application)>
	//    7   17:return          
	}

	public static int getLibraryApiLevel()
	{
		return 67;
	//    0    0:bipush          67
	//    1    2:ireturn         
	}

	public static String getLibraryVersion()
	{
		return "3.1.0";
	//    0    0:ldc1            #110 <String "3.1.0">
	//    1    2:areturn         
	}

	public static IReporter getReporter(Context context, String s)
	{
		a.a(((Object) (context)));
	//    0    0:getstatic       #36  <Field nk a>
	//    1    3:aload_0         
	//    2    4:invokeinterface #71  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    3    9:pop             
		return ((IReporter) (bv.b(context).b(com.yandex.metrica.c.a(s).a())));
	//    4   10:aload_0         
	//    5   11:invokestatic    #87  <Method bv bv.b(Context)>
	//    6   14:aload_1         
	//    7   15:invokestatic    #116 <Method c$a c.a(String)>
	//    8   18:invokevirtual   #121 <Method c c$a.a()>
	//    9   21:invokevirtual   #124 <Method b bv.b(c)>
	//   10   24:areturn         
	}

	public static void pauseSession(Activity activity)
	{
		bv.c().c(activity);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #129 <Method void ab.c(Activity)>
	//    3    7:return          
	}

	public static transient void registerReferrerBroadcastReceivers(BroadcastReceiver abroadcastreceiver[])
	{
		f.a(((Object) (abroadcastreceiver)));
	//    0    0:getstatic       #56  <Field nk f>
	//    1    3:aload_0         
	//    2    4:invokeinterface #71  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    3    9:pop             
		MetricaEventHandler.a(abroadcastreceiver);
	//    4   10:aload_0         
	//    5   11:invokestatic    #135 <Method void MetricaEventHandler.a(BroadcastReceiver[])>
	//    6   14:return          
	}

	public static void reportAppOpen(Activity activity)
	{
		e.a(((Object) (activity)));
	//    0    0:getstatic       #52  <Field nk e>
	//    1    3:aload_0         
	//    2    4:invokeinterface #71  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    3    9:pop             
		bv.c().a(activity);
	//    4   10:invokestatic    #100 <Method ab bv.c()>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #138 <Method void ab.a(Activity)>
	//    7   17:return          
	}

	public static void reportAppOpen(String s)
	{
		bv.c().d(s);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #140 <Method void ab.d(String)>
	//    3    7:return          
	}

	public static void reportError(String s, Throwable throwable)
	{
		bv.c().reportError(s, throwable);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method void ab.reportError(String, Throwable)>
	//    4    8:return          
	}

	public static void reportEvent(String s)
	{
		bv.c().reportEvent(s);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #147 <Method void ab.reportEvent(String)>
	//    3    7:return          
	}

	public static void reportEvent(String s, String s1)
	{
		bv.c().reportEvent(s, s1);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #150 <Method void ab.reportEvent(String, String)>
	//    4    8:return          
	}

	public static void reportEvent(String s, Map map)
	{
		bv.c().reportEvent(s, map);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #153 <Method void ab.reportEvent(String, Map)>
	//    4    8:return          
	}

	public static void reportNativeCrash(String s)
	{
		bv.c().c(s);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #158 <Method void ab.c(String)>
	//    3    7:return          
	}

	public static void reportReferralUrl(String s)
	{
		bv.c().e(s);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #161 <Method void ab.e(String)>
	//    3    7:return          
	}

	public static void reportRevenue(Revenue revenue)
	{
		bv.b().a(revenue);
	//    0    0:invokestatic    #166 <Method bv bv.b()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #168 <Method void bv.a(Revenue)>
	//    3    7:return          
	}

	public static void reportUnhandledException(Throwable throwable)
	{
		bv.c().reportUnhandledException(throwable);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #172 <Method void ab.reportUnhandledException(Throwable)>
	//    3    7:return          
	}

	public static void reportUserProfile(UserProfile userprofile)
	{
		bv.b().a(userprofile);
	//    0    0:invokestatic    #166 <Method bv bv.b()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #176 <Method void bv.a(UserProfile)>
	//    3    7:return          
	}

	public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferreddeeplinkparameterslistener)
	{
		g.a(((Object) (deferreddeeplinkparameterslistener)));
	//    0    0:getstatic       #60  <Field nk g>
	//    1    3:aload_0         
	//    2    4:invokeinterface #71  <Method com.yandex.metrica.impl.ob.ni nk.a(Object)>
	//    3    9:pop             
		bv.b().a(deferreddeeplinkparameterslistener);
	//    4   10:invokestatic    #166 <Method bv bv.b()>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #180 <Method void bv.a(DeferredDeeplinkParametersListener)>
	//    7   17:return          
	}

	public static void resumeSession(Activity activity)
	{
		bv.c().b(activity);
	//    0    0:invokestatic    #100 <Method ab bv.c()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #183 <Method void ab.b(Activity)>
	//    3    7:return          
	}

	public static void setLocation(Location location)
	{
		bv.a(location);
	//    0    0:aload_0         
	//    1    1:invokestatic    #187 <Method void bv.a(Location)>
	//    2    4:return          
	}

	public static void setLocationTracking(boolean flag)
	{
		bv.a(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #191 <Method void bv.a(boolean)>
	//    2    4:return          
	}

	public static void setUserProfileID(String s)
	{
		bv.b().b(s);
	//    0    0:invokestatic    #166 <Method bv bv.b()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #194 <Method void bv.b(String)>
	//    3    7:return          
	}

	private static final nk a = new ng(((nk) (new nf("Context"))));
	private static final nk b = new ng(((nk) (new nf("Config"))));
	private static final nk c = new ng(((nk) (new nf("Reporter config"))));
	private static final nk d = new ng(((nk) (new nf("Application"))));
	private static final nk e = new ng(((nk) (new nf("Activity"))));
	private static final nk f = new ng(((nk) (new nf("Broadcast receivers"))));
	private static final nk g = new ng(((nk) (new nf("Deferred deeplink parameters listener"))));

	static 
	{
	//    0    0:new             #23  <Class ng>
	//    1    3:dup             
	//    2    4:new             #25  <Class nf>
	//    3    7:dup             
	//    4    8:ldc1            #27  <String "Context">
	//    5   10:invokespecial   #31  <Method void nf(String)>
	//    6   13:invokespecial   #34  <Method void ng(nk)>
	//    7   16:putstatic       #36  <Field nk a>
	//    8   19:new             #23  <Class ng>
	//    9   22:dup             
	//   10   23:new             #25  <Class nf>
	//   11   26:dup             
	//   12   27:ldc1            #38  <String "Config">
	//   13   29:invokespecial   #31  <Method void nf(String)>
	//   14   32:invokespecial   #34  <Method void ng(nk)>
	//   15   35:putstatic       #40  <Field nk b>
	//   16   38:new             #23  <Class ng>
	//   17   41:dup             
	//   18   42:new             #25  <Class nf>
	//   19   45:dup             
	//   20   46:ldc1            #42  <String "Reporter config">
	//   21   48:invokespecial   #31  <Method void nf(String)>
	//   22   51:invokespecial   #34  <Method void ng(nk)>
	//   23   54:putstatic       #44  <Field nk c>
	//   24   57:new             #23  <Class ng>
	//   25   60:dup             
	//   26   61:new             #25  <Class nf>
	//   27   64:dup             
	//   28   65:ldc1            #46  <String "Application">
	//   29   67:invokespecial   #31  <Method void nf(String)>
	//   30   70:invokespecial   #34  <Method void ng(nk)>
	//   31   73:putstatic       #48  <Field nk d>
	//   32   76:new             #23  <Class ng>
	//   33   79:dup             
	//   34   80:new             #25  <Class nf>
	//   35   83:dup             
	//   36   84:ldc1            #50  <String "Activity">
	//   37   86:invokespecial   #31  <Method void nf(String)>
	//   38   89:invokespecial   #34  <Method void ng(nk)>
	//   39   92:putstatic       #52  <Field nk e>
	//   40   95:new             #23  <Class ng>
	//   41   98:dup             
	//   42   99:new             #25  <Class nf>
	//   43  102:dup             
	//   44  103:ldc1            #54  <String "Broadcast receivers">
	//   45  105:invokespecial   #31  <Method void nf(String)>
	//   46  108:invokespecial   #34  <Method void ng(nk)>
	//   47  111:putstatic       #56  <Field nk f>
	//   48  114:new             #23  <Class ng>
	//   49  117:dup             
	//   50  118:new             #25  <Class nf>
	//   51  121:dup             
	//   52  122:ldc1            #58  <String "Deferred deeplink parameters listener">
	//   53  124:invokespecial   #31  <Method void nf(String)>
	//   54  127:invokespecial   #34  <Method void ng(nk)>
	//   55  130:putstatic       #60  <Field nk g>
	//*  56  133:return          
	}
}
