// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.os.Bundle;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$3
	implements Runnable
{

	public void run()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #26  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void Bundle()>
	//    3    7:astore_1        
		try
		{
			Class.forName("com.facebook.core.Core");
	//    4    8:ldc1            #29  <String "com.facebook.core.Core">
	//    5   10:invokestatic    #35  <Method Class Class.forName(String)>
	//    6   13:pop             
			bundle.putInt("core_lib_included", 1);
	//    7   14:aload_1         
	//    8   15:ldc1            #37  <String "core_lib_included">
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
		}
	//*  11   21:ldc1            #43  <String "com.facebook.login.Login">
	//*  12   23:invokestatic    #35  <Method Class Class.forName(String)>
	//*  13   26:pop             
	//*  14   27:aload_1         
	//*  15   28:ldc1            #45  <String "login_lib_included">
	//*  16   30:iconst_1        
	//*  17   31:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
	//*  18   34:ldc1            #47  <String "com.facebook.share.Share">
	//*  19   36:invokestatic    #35  <Method Class Class.forName(String)>
	//*  20   39:pop             
	//*  21   40:aload_1         
	//*  22   41:ldc1            #49  <String "share_lib_included">
	//*  23   43:iconst_1        
	//*  24   44:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
	//*  25   47:ldc1            #51  <String "com.facebook.places.Places">
	//*  26   49:invokestatic    #35  <Method Class Class.forName(String)>
	//*  27   52:pop             
	//*  28   53:aload_1         
	//*  29   54:ldc1            #53  <String "places_lib_included">
	//*  30   56:iconst_1        
	//*  31   57:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
	//*  32   60:ldc1            #55  <String "com.facebook.messenger.Messenger">
	//*  33   62:invokestatic    #35  <Method Class Class.forName(String)>
	//*  34   65:pop             
	//*  35   66:aload_1         
	//*  36   67:ldc1            #57  <String "messenger_lib_included">
	//*  37   69:iconst_1        
	//*  38   70:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
	//*  39   73:ldc1            #59  <String "com.facebook.applinks.AppLinks">
	//*  40   75:invokestatic    #35  <Method Class Class.forName(String)>
	//*  41   78:pop             
	//*  42   79:aload_1         
	//*  43   80:ldc1            #61  <String "applinks_lib_included">
	//*  44   82:iconst_1        
	//*  45   83:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
	//*  46   86:ldc1            #63  <String "com.facebook.all.All">
	//*  47   88:invokestatic    #35  <Method Class Class.forName(String)>
	//*  48   91:pop             
	//*  49   92:aload_1         
	//*  50   93:ldc1            #65  <String "all_lib_included">
	//*  51   95:iconst_1        
	//*  52   96:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
	//*  53   99:aload_0         
	//*  54  100:getfield        #17  <Field AppEventsLogger val$logger>
	//*  55  103:ldc1            #67  <String "fb_sdk_initialize">
	//*  56  105:aconst_null     
	//*  57  106:aload_1         
	//*  58  107:invokevirtual   #71  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//*  59  110:return          
		catch(ClassNotFoundException classnotfoundexception) { }
	//   60  111:astore_2        
		try
		{
			Class.forName("com.facebook.login.Login");
			bundle.putInt("login_lib_included", 1);
		}
	//*  61  112:goto            21
		catch(ClassNotFoundException classnotfoundexception1) { }
	//   62  115:astore_2        
		try
		{
			Class.forName("com.facebook.share.Share");
			bundle.putInt("share_lib_included", 1);
		}
	//*  63  116:goto            34
		catch(ClassNotFoundException classnotfoundexception2) { }
	//   64  119:astore_2        
		try
		{
			Class.forName("com.facebook.places.Places");
			bundle.putInt("places_lib_included", 1);
		}
	//*  65  120:goto            47
		catch(ClassNotFoundException classnotfoundexception3) { }
	//   66  123:astore_2        
		try
		{
			Class.forName("com.facebook.messenger.Messenger");
			bundle.putInt("messenger_lib_included", 1);
		}
	//*  67  124:goto            60
		catch(ClassNotFoundException classnotfoundexception4) { }
	//   68  127:astore_2        
		try
		{
			Class.forName("com.facebook.applinks.AppLinks");
			bundle.putInt("applinks_lib_included", 1);
		}
	//*  69  128:goto            73
		catch(ClassNotFoundException classnotfoundexception5) { }
	//   70  131:astore_2        
		try
		{
			Class.forName("com.facebook.all.All");
			bundle.putInt("all_lib_included", 1);
		}
	//*  71  132:goto            86
		catch(ClassNotFoundException classnotfoundexception6) { }
	//   72  135:astore_2        
		val$logger.logSdkEvent("fb_sdk_initialize", ((Double) (null)), bundle);
	//*  73  136:goto            99
	}

	final AppEventsLogger val$logger;

	AppEventsLogger$3(AppEventsLogger appeventslogger)
	{
		val$logger = appeventslogger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppEventsLogger val$logger>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
