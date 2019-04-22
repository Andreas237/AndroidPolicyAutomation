// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.*;

// Referenced classes of package com.appsflyer:
//			AppsFlyerLib, AppsFlyerProperties, AFLogger

public class SingleInstallBroadcastReceiver extends BroadcastReceiver
{

	public SingleInstallBroadcastReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		String s = intent.getStringExtra("referrer");
	//    3    5:aload_2         
	//    4    6:ldc1            #13  <String "referrer">
	//    5    8:invokevirtual   #19  <Method String Intent.getStringExtra(String)>
	//    6   11:astore          5
		if(s != null)
	//*   7   13:aload           5
	//*   8   15:ifnull          75
		{
			if(s.contains("AppsFlyer_Test") && intent.getStringExtra("TestIntegrationMode") != null)
	//*   9   18:aload           5
	//*  10   20:ldc1            #21  <String "AppsFlyer_Test">
	//*  11   22:invokevirtual   #27  <Method boolean String.contains(CharSequence)>
	//*  12   25:ifeq            46
	//*  13   28:aload_2         
	//*  14   29:ldc1            #29  <String "TestIntegrationMode">
	//*  15   31:invokevirtual   #19  <Method String Intent.getStringExtra(String)>
	//*  16   34:ifnull          46
			{
				AppsFlyerLib.getInstance()._mth02CE(context, intent);
	//   17   37:invokestatic    #35  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
	//   18   40:aload_1         
	//   19   41:aload_2         
	//   20   42:invokevirtual   #38  <Method void AppsFlyerLib._mth02CE(Context, Intent)>
				return;
	//   21   45:return          
			}
			if(context.getSharedPreferences("appsflyer-data", 0).getString("referrer", ((String) (null))) != null)
	//*  22   46:aload_1         
	//*  23   47:ldc1            #40  <String "appsflyer-data">
	//*  24   49:iconst_0        
	//*  25   50:invokevirtual   #46  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//*  26   53:ldc1            #13  <String "referrer">
	//*  27   55:aconst_null     
	//*  28   56:invokeinterface #52  <Method String SharedPreferences.getString(String, String)>
	//*  29   61:ifnull          75
			{
				AppsFlyerLib.getInstance();
	//   30   64:invokestatic    #35  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
	//   31   67:pop             
				AppsFlyerLib._mth02CE(context, s);
	//   32   68:aload_1         
	//   33   69:aload           5
	//   34   71:invokestatic    #55  <Method void AppsFlyerLib._mth02CE(Context, String)>
				return;
	//   35   74:return          
			}
		}
		s = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
	//   36   75:invokestatic    #60  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   37   78:ldc1            #62  <String "referrer_timestamp">
	//   38   80:invokevirtual   #64  <Method String AppsFlyerProperties.getString(String)>
	//   39   83:astore          5
		long l = System.currentTimeMillis();
	//   40   85:invokestatic    #70  <Method long System.currentTimeMillis()>
	//   41   88:lstore_3        
		if(s != null && l - ((Number) (Long.valueOf(s))).longValue() < 2000L)
	//*  42   89:aload           5
	//*  43   91:ifnull          112
	//*  44   94:lload_3         
	//*  45   95:aload           5
	//*  46   97:invokestatic    #76  <Method Long Long.valueOf(String)>
	//*  47  100:invokevirtual   #81  <Method long Number.longValue()>
	//*  48  103:lsub            
	//*  49  104:ldc2w           #82  <Long 2000L>
	//*  50  107:lcmp            
	//*  51  108:ifge            112
		{
			return;
	//   52  111:return          
		} else
		{
			AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
	//   53  112:ldc1            #85  <String "SingleInstallBroadcastReceiver called">
	//   54  114:invokestatic    #91  <Method void AFLogger.afInfoLog(String)>
			AppsFlyerLib.getInstance()._mth02CE(context, intent);
	//   55  117:invokestatic    #35  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
	//   56  120:aload_1         
	//   57  121:aload_2         
	//   58  122:invokevirtual   #38  <Method void AppsFlyerLib._mth02CE(Context, Intent)>
			AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
	//   59  125:invokestatic    #60  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   60  128:ldc1            #62  <String "referrer_timestamp">
	//   61  130:invokestatic    #70  <Method long System.currentTimeMillis()>
	//   62  133:invokestatic    #94  <Method String String.valueOf(long)>
	//   63  136:invokevirtual   #98  <Method void AppsFlyerProperties.set(String, String)>
			return;
	//   64  139:return          
		}
	}
}
