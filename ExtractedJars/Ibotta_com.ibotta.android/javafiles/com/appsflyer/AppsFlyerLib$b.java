// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.Reference;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.appsflyer:
//			AppsFlyerLib, ServerConfigHandler, AppsFlyerConversionListener

final class AppsFlyerLib$b extends AppsFlyerLib$a
{

	public final String _mth02CB()
	{
		return ServerConfigHandler.getUrl("https://api.%s/install_data/v3/");
	//    0    0:ldc1            #20  <String "https://api.%s/install_data/v3/">
	//    1    2:invokestatic    #26  <Method String ServerConfigHandler.getUrl(String)>
	//    2    5:areturn         
	}

	protected final void _mth02CE(String s, int i)
	{
		AppsFlyerLib._mth02CB().onInstallConversionFailure(s);
	//    0    0:invokestatic    #31  <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
	//    1    3:aload_1         
	//    2    4:invokeinterface #37  <Method void AppsFlyerConversionListener.onInstallConversionFailure(String)>
		if(i >= 400 && i < 500)
	//*   3    9:iload_2         
	//*   4   10:sipush          400
	//*   5   13:icmplt          63
	//*   6   16:iload_2         
	//*   7   17:sipush          500
	//*   8   20:icmpge          63
		{
			i = AppsFlyerLib._mth02CB((Context)((Reference) (super._fld02CE)).get()).getInt("appsflyerConversionDataRequestRetries", 0);
	//    9   23:aload_0         
	//   10   24:getfield        #40  <Field java.lang.ref.WeakReference AppsFlyerLib$a._fld02CE>
	//   11   27:invokevirtual   #46  <Method Object Reference.get()>
	//   12   30:checkcast       #48  <Class Context>
	//   13   33:invokestatic    #51  <Method SharedPreferences AppsFlyerLib._mth02CB(Context)>
	//   14   36:ldc1            #53  <String "appsflyerConversionDataRequestRetries">
	//   15   38:iconst_0        
	//   16   39:invokeinterface #59  <Method int SharedPreferences.getInt(String, int)>
	//   17   44:istore_2        
			AppsFlyerLib._mth0971((Context)((Reference) (super._fld02CE)).get(), "appsflyerConversionDataRequestRetries", i + 1);
	//   18   45:aload_0         
	//   19   46:getfield        #40  <Field java.lang.ref.WeakReference AppsFlyerLib$a._fld02CE>
	//   20   49:invokevirtual   #46  <Method Object Reference.get()>
	//   21   52:checkcast       #48  <Class Context>
	//   22   55:ldc1            #53  <String "appsflyerConversionDataRequestRetries">
	//   23   57:iload_2         
	//   24   58:iconst_1        
	//   25   59:iadd            
	//   26   60:invokestatic    #63  <Method void AppsFlyerLib._mth0971(Context, String, int)>
		}
	//   27   63:return          
	}

	protected final void _mth02CE(Map map)
	{
		map.put("is_first_launch", ((Object) (Boolean.toString(true))));
	//    0    0:aload_1         
	//    1    1:ldc1            #66  <String "is_first_launch">
	//    2    3:iconst_1        
	//    3    4:invokestatic    #72  <Method String Boolean.toString(boolean)>
	//    4    7:invokeinterface #78  <Method Object Map.put(Object, Object)>
	//    5   12:pop             
		AppsFlyerLib._mth02CB().onInstallConversionDataLoaded(map);
	//    6   13:invokestatic    #31  <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
	//    7   16:aload_1         
	//    8   17:invokeinterface #81  <Method void AppsFlyerConversionListener.onInstallConversionDataLoaded(Map)>
		AppsFlyerLib._mth0971((Context)((Reference) (super._fld02CE)).get(), "appsflyerConversionDataRequestRetries", 0);
	//    9   22:aload_0         
	//   10   23:getfield        #40  <Field java.lang.ref.WeakReference AppsFlyerLib$a._fld02CE>
	//   11   26:invokevirtual   #46  <Method Object Reference.get()>
	//   12   29:checkcast       #48  <Class Context>
	//   13   32:ldc1            #53  <String "appsflyerConversionDataRequestRetries">
	//   14   34:iconst_0        
	//   15   35:invokestatic    #63  <Method void AppsFlyerLib._mth0971(Context, String, int)>
	//   16   38:return          
	}

	private AppsFlyerLib _fld02CF;

	public AppsFlyerLib$b(AppsFlyerLib appsflyerlib, Context context, String s, ScheduledExecutorService scheduledexecutorservice)
	{
		_fld02CF = appsflyerlib;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AppsFlyerLib _fld02CF>
		super(appsflyerlib, context, s, scheduledexecutorservice);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:aload           4
	//    8   11:invokespecial   #15  <Method void AppsFlyerLib$a(AppsFlyerLib, Context, String, ScheduledExecutorService)>
	//    9   14:return          
	}
}
