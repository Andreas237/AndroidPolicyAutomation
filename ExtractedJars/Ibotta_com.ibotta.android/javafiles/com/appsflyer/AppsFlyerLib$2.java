// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

// Referenced classes of package com.appsflyer:
//			AppsFlyerLib, AFLogger, v, AFExecutor, 
//			g

final class AppsFlyerLib$2
	implements p.b
{

	public final void _mth02CA(WeakReference weakreference)
	{
		Context context = ((Context)((Reference) (weakreference)).get()).getApplicationContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method Object Reference.get()>
	//    2    4:checkcast       #29  <Class Context>
	//    3    7:invokevirtual   #33  <Method Context Context.getApplicationContext()>
	//    4   10:astore_2        
		AFLogger.afInfoLog("onBecameBackground");
	//    5   11:ldc1            #35  <String "onBecameBackground">
	//    6   13:invokestatic    #41  <Method void AFLogger.afInfoLog(String)>
		AppsFlyerLib.getInstance()._mth02CE();
	//    7   16:invokestatic    #45  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
	//    8   19:invokevirtual   #48  <Method void AppsFlyerLib._mth02CE()>
		AFLogger.afInfoLog("callStatsBackground background call");
	//    9   22:ldc1            #50  <String "callStatsBackground background call">
	//   10   24:invokestatic    #41  <Method void AFLogger.afInfoLog(String)>
		Object obj = ((Object) (new WeakReference(((Object) (context)))));
	//   11   27:new             #52  <Class WeakReference>
	//   12   30:dup             
	//   13   31:aload_2         
	//   14   32:invokespecial   #55  <Method void WeakReference(Object)>
	//   15   35:astore_3        
		AppsFlyerLib.getInstance()._mth02CF(((WeakReference) (obj)));
	//   16   36:invokestatic    #45  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
	//   17   39:aload_3         
	//   18   40:invokevirtual   #58  <Method void AppsFlyerLib._mth02CF(WeakReference)>
		obj = ((Object) (v._mth02CB()));
	//   19   43:invokestatic    #64  <Method v v._mth02CB()>
	//   20   46:astore_3        
		if(((v) (obj))._mth02BB())
	//*  21   47:aload_3         
	//*  22   48:invokevirtual   #68  <Method boolean v._mth02BB()>
	//*  23   51:ifeq            80
		{
			((v) (obj))._mth02CE();
	//   24   54:aload_3         
	//   25   55:invokevirtual   #69  <Method void v._mth02CE()>
			if(context != null)
	//*  26   58:aload_2         
	//*  27   59:ifnull          73
				v._mth0971(context.getPackageName(), context.getPackageManager());
	//   28   62:aload_2         
	//   29   63:invokevirtual   #73  <Method String Context.getPackageName()>
	//   30   66:aload_2         
	//   31   67:invokevirtual   #77  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   32   70:invokestatic    #81  <Method void v._mth0971(String, android.content.pm.PackageManager)>
			((v) (obj))._mth02CA();
	//   33   73:aload_3         
	//   34   74:invokevirtual   #83  <Method void v._mth02CA()>
		} else
	//*  35   77:goto            85
		{
			AFLogger.afDebugLog("RD status is OFF");
	//   36   80:ldc1            #85  <String "RD status is OFF">
	//   37   82:invokestatic    #88  <Method void AFLogger.afDebugLog(String)>
		}
		AFExecutor.getInstance()._mth02CF();
	//   38   85:invokestatic    #93  <Method AFExecutor AFExecutor.getInstance()>
	//   39   88:invokevirtual   #95  <Method void AFExecutor._mth02CF()>
		weakreference = ((WeakReference) (g._mth0971((Context)((Reference) (weakreference)).get())));
	//   40   91:aload_1         
	//   41   92:invokevirtual   #27  <Method Object Reference.get()>
	//   42   95:checkcast       #29  <Class Context>
	//   43   98:invokestatic    #100 <Method g g._mth0971(Context)>
	//   44  101:astore_1        
		((g) (weakreference))._fld02CF.post(((g) (weakreference))._fld02BB);
	//   45  102:aload_1         
	//   46  103:getfield        #103 <Field Handler g._fld02CF>
	//   47  106:aload_1         
	//   48  107:getfield        #106 <Field Runnable g._fld02BB>
	//   49  110:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
	//   50  113:pop             
	//   51  114:return          
	}

	public final void _mth02CB(Activity activity)
	{
		if(2 > AppsFlyerLib._mth0971(AppsFlyerLib._mth02CB(((Context) (activity)))))
	//*   0    0:iconst_2        
	//*   1    1:aload_1         
	//*   2    2:invokestatic    #118 <Method android.content.SharedPreferences AppsFlyerLib._mth02CB(Context)>
	//*   3    5:invokestatic    #121 <Method int AppsFlyerLib._mth0971(android.content.SharedPreferences)>
	//*   4    8:icmple          40
		{
			g g1 = g._mth0971(((Context) (activity)));
	//    5   11:aload_1         
	//    6   12:invokestatic    #100 <Method g g._mth0971(Context)>
	//    7   15:astore_2        
			g1._fld02CF.post(g1._fld02BB);
	//    8   16:aload_2         
	//    9   17:getfield        #103 <Field Handler g._fld02CF>
	//   10   20:aload_2         
	//   11   21:getfield        #106 <Field Runnable g._fld02BB>
	//   12   24:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
	//   13   27:pop             
			g1._fld02CF.post(g1._fld0971);
	//   14   28:aload_2         
	//   15   29:getfield        #103 <Field Handler g._fld02CF>
	//   16   32:aload_2         
	//   17   33:getfield        #123 <Field Runnable g._fld0971>
	//   18   36:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
	//   19   39:pop             
		}
		AFLogger.afInfoLog("onBecameForeground");
	//   20   40:ldc1            #125 <String "onBecameForeground">
	//   21   42:invokestatic    #41  <Method void AFLogger.afInfoLog(String)>
		AppsFlyerLib.getInstance()._mth02CA();
	//   22   45:invokestatic    #45  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
	//   23   48:invokevirtual   #126 <Method void AppsFlyerLib._mth02CA()>
		AppsFlyerLib.getInstance()._mth02CB(((Context) (activity)), ((String) (null)), ((java.util.Map) (null)));
	//   24   51:invokestatic    #45  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
	//   25   54:aload_1         
	//   26   55:aconst_null     
	//   27   56:aconst_null     
	//   28   57:invokevirtual   #129 <Method void AppsFlyerLib._mth02CB(Context, String, java.util.Map)>
		AFLogger.resetDeltaTime();
	//   29   60:invokestatic    #132 <Method void AFLogger.resetDeltaTime()>
	//   30   63:return          
	}

	private AppsFlyerLib _fld02CA;

	AppsFlyerLib$2(AppsFlyerLib appsflyerlib)
	{
		_fld02CA = appsflyerlib;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AppsFlyerLib _fld02CA>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
