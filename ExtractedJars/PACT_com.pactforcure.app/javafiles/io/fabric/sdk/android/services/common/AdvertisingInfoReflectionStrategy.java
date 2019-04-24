// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.lang.reflect.Method;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			AdvertisingInfoStrategy, AdvertisingInfo

class AdvertisingInfoReflectionStrategy
	implements AdvertisingInfoStrategy
{

	public AdvertisingInfoReflectionStrategy(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #46  <Field Context context>
	//    6   12:return          
	}

	private String getAdvertisingId()
	{
		String s;
		try
		{
			s = (String)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(getInfo(), new Object[0]);
	//    0    0:ldc1            #13  <String "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info">
	//    1    2:invokestatic    #57  <Method Class Class.forName(String)>
	//    2    5:ldc1            #25  <String "getId">
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #61  <Method Method Class.getMethod(String, Class[])>
	//    6   14:aload_0         
	//    7   15:invokespecial   #65  <Method Object getInfo()>
	//    8   18:iconst_0        
	//    9   19:anewarray       Object[]
	//   10   22:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   11   25:checkcast       #73  <Class String>
	//   12   28:astore_1        
		}
	//*  13   29:aload_1         
	//*  14   30:areturn         
		catch(Exception exception)
	//*  15   31:astore_1        
		{
			Fabric.getLogger().w("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
	//   16   32:invokestatic    #79  <Method Logger Fabric.getLogger()>
	//   17   35:ldc1            #81  <String "Fabric">
	//   18   37:ldc1            #83  <String "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info">
	//   19   39:invokeinterface #89  <Method void Logger.w(String, String)>
			return null;
	//   20   44:aconst_null     
	//   21   45:areturn         
		}
		return s;
	}

	private Object getInfo()
	{
		Object obj;
		try
		{
			obj = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[] {
				android/content/Context
			}).invoke(((Object) (null)), new Object[] {
				context
			});
	//    0    0:ldc1            #10  <String "com.google.android.gms.ads.identifier.AdvertisingIdClient">
	//    1    2:invokestatic    #57  <Method Class Class.forName(String)>
	//    2    5:ldc1            #22  <String "getAdvertisingIdInfo">
	//    3    7:iconst_1        
	//    4    8:anewarray       Class[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc1            #40  <Class Context>
	//    8   15:aastore         
	//    9   16:invokevirtual   #61  <Method Method Class.getMethod(String, Class[])>
	//   10   19:aconst_null     
	//   11   20:iconst_1        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload_0         
	//   16   27:getfield        #46  <Field Context context>
	//   17   30:aastore         
	//   18   31:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   19   34:astore_1        
		}
	//*  20   35:aload_1         
	//*  21   36:areturn         
		catch(Exception exception)
	//*  22   37:astore_1        
		{
			Fabric.getLogger().w("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
	//   23   38:invokestatic    #79  <Method Logger Fabric.getLogger()>
	//   24   41:ldc1            #81  <String "Fabric">
	//   25   43:ldc1            #91  <String "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient">
	//   26   45:invokeinterface #89  <Method void Logger.w(String, String)>
			return ((Object) (null));
	//   27   50:aconst_null     
	//   28   51:areturn         
		}
		return obj;
	}

	private boolean isLimitAdTrackingEnabled()
	{
		boolean flag;
		try
		{
			flag = ((Boolean)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(getInfo(), new Object[0])).booleanValue();
	//    0    0:ldc1            #13  <String "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info">
	//    1    2:invokestatic    #57  <Method Class Class.forName(String)>
	//    2    5:ldc1            #31  <String "isLimitAdTrackingEnabled">
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #61  <Method Method Class.getMethod(String, Class[])>
	//    6   14:aload_0         
	//    7   15:invokespecial   #65  <Method Object getInfo()>
	//    8   18:iconst_0        
	//    9   19:anewarray       Object[]
	//   10   22:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   11   25:checkcast       #94  <Class Boolean>
	//   12   28:invokevirtual   #97  <Method boolean Boolean.booleanValue()>
	//   13   31:istore_1        
		}
	//*  14   32:iload_1         
	//*  15   33:ireturn         
		catch(Exception exception)
	//*  16   34:astore_2        
		{
			Fabric.getLogger().w("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
	//   17   35:invokestatic    #79  <Method Logger Fabric.getLogger()>
	//   18   38:ldc1            #81  <String "Fabric">
	//   19   40:ldc1            #99  <String "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info">
	//   20   42:invokeinterface #89  <Method void Logger.w(String, String)>
			return false;
	//   21   47:iconst_0        
	//   22   48:ireturn         
		}
		return flag;
	}

	public AdvertisingInfo getAdvertisingInfo()
	{
		if(isGooglePlayServiceAvailable(context))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #46  <Field Context context>
	//*   3    5:invokevirtual   #105 <Method boolean isGooglePlayServiceAvailable(Context)>
	//*   4    8:ifeq            27
			return new AdvertisingInfo(getAdvertisingId(), isLimitAdTrackingEnabled());
	//    5   11:new             #107 <Class AdvertisingInfo>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #109 <Method String getAdvertisingId()>
	//    9   19:aload_0         
	//   10   20:invokespecial   #111 <Method boolean isLimitAdTrackingEnabled()>
	//   11   23:invokespecial   #114 <Method void AdvertisingInfo(String, boolean)>
	//   12   26:areturn         
		else
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
	}

	boolean isGooglePlayServiceAvailable(Context context1)
	{
		int i;
		try
		{
			i = ((Integer)Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[] {
				android/content/Context
			}).invoke(((Object) (null)), new Object[] {
				context1
			})).intValue();
	//    0    0:ldc1            #16  <String "com.google.android.gms.common.GooglePlayServicesUtil">
	//    1    2:invokestatic    #57  <Method Class Class.forName(String)>
	//    2    5:ldc1            #28  <String "isGooglePlayServicesAvailable">
	//    3    7:iconst_1        
	//    4    8:anewarray       Class[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc1            #40  <Class Context>
	//    8   15:aastore         
	//    9   16:invokevirtual   #61  <Method Method Class.getMethod(String, Class[])>
	//   10   19:aconst_null     
	//   11   20:iconst_1        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload_1         
	//   16   27:aastore         
	//   17   28:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   18   31:checkcast       #116 <Class Integer>
	//   19   34:invokevirtual   #120 <Method int Integer.intValue()>
	//   20   37:istore_2        
		}
	//*  21   38:iload_2         
	//*  22   39:ifne            44
	//*  23   42:iconst_1        
	//*  24   43:ireturn         
	//*  25   44:iconst_0        
	//*  26   45:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context1)
	//*  27   46:astore_1        
		{
			return false;
	//   28   47:iconst_0        
	//   29   48:ireturn         
		}
		return i == 0;
	}

	private static final String CLASS_NAME_ADVERTISING_ID_CLIENT = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
	private static final String CLASS_NAME_ADVERTISING_ID_CLIENT_INFO = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
	private static final String CLASS_NAME_GOOGLE_PLAY_SERVICES_UTILS = "com.google.android.gms.common.GooglePlayServicesUtil";
	private static final int GOOGLE_PLAY_SERVICES_SUCCESS_CODE = 0;
	private static final String METHOD_NAME_GET_ADVERTISING_ID_INFO = "getAdvertisingIdInfo";
	private static final String METHOD_NAME_GET_ID = "getId";
	private static final String METHOD_NAME_IS_GOOGLE_PLAY_SERVICES_AVAILABLE = "isGooglePlayServicesAvailable";
	private static final String METHOD_NAME_IS_LIMITED_AD_TRACKING_ENABLED = "isLimitAdTrackingEnabled";
	private final Context context;
}
