// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.content.Context;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			m, k, SDKAdPreferences

public class StartAppSDK
{

	public StartAppSDK()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void addWrapper(Context context, String s, String s1)
	{
		m.a().a(context, s, s1);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #19  <Method void m.a(Context, String, String)>
	//    5    9:return          
	}

	public static void enableReturnAds(boolean flag)
	{
		m.a().e(flag);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #24  <Method void m.e(boolean)>
	//    3    7:return          
	}

	public static void inAppPurchaseMade(Context context)
	{
		inAppPurchaseMade(context, 0.0D);
	//    0    0:aload_0         
	//    1    1:dconst_0        
	//    2    2:invokestatic    #29  <Method void inAppPurchaseMade(Context, double)>
	//    3    5:return          
	}

	public static void inAppPurchaseMade(Context context, double d)
	{
		k.b(context, "payingUser", Boolean.valueOf(true));
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <String "payingUser">
	//    2    3:iconst_1        
	//    3    4:invokestatic    #37  <Method Boolean Boolean.valueOf(boolean)>
	//    4    7:invokestatic    #43  <Method void k.b(Context, String, Boolean)>
		k.b(context, "inAppPurchaseAmount", Float.valueOf((float)((double)k.a(context, "inAppPurchaseAmount", Float.valueOf(0.0F)).floatValue() + d)));
	//    5   10:aload_0         
	//    6   11:ldc1            #45  <String "inAppPurchaseAmount">
	//    7   13:aload_0         
	//    8   14:ldc1            #45  <String "inAppPurchaseAmount">
	//    9   16:fconst_0        
	//   10   17:invokestatic    #50  <Method Float Float.valueOf(float)>
	//   11   20:invokestatic    #53  <Method Float k.a(Context, String, Float)>
	//   12   23:invokevirtual   #57  <Method float Float.floatValue()>
	//   13   26:f2d             
	//   14   27:dload_1         
	//   15   28:dadd            
	//   16   29:d2f             
	//   17   30:invokestatic    #50  <Method Float Float.valueOf(float)>
	//   18   33:invokestatic    #60  <Method void k.b(Context, String, Float)>
		m.a().a(context, com.startapp.android.publish.common.metaData.MetaDataRequest.a.c);
	//   19   36:invokestatic    #17  <Method m m.a()>
	//   20   39:aload_0         
	//   21   40:getstatic       #66  <Field com.startapp.android.publish.common.metaData.MetaDataRequest$a com.startapp.android.publish.common.metaData.MetaDataRequest$a.c>
	//   22   43:invokevirtual   #69  <Method void m.a(Context, com.startapp.android.publish.common.metaData.MetaDataRequest$a)>
	//   23   46:return          
	}

	public static void init(Activity activity, String s)
	{
		init(activity, s, new SDKAdPreferences());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #73  <Class SDKAdPreferences>
	//    3    5:dup             
	//    4    6:invokespecial   #74  <Method void SDKAdPreferences()>
	//    5    9:invokestatic    #77  <Method void init(Activity, String, SDKAdPreferences)>
	//    6   12:return          
	}

	public static void init(Activity activity, String s, SDKAdPreferences sdkadpreferences)
	{
		m.a().a(((Context) (activity)), ((String) (null)), s, sdkadpreferences, true);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #80  <Method void m.a(Context, String, String, SDKAdPreferences, boolean)>
	//    7   11:return          
	}

	public static void init(Activity activity, String s, SDKAdPreferences sdkadpreferences, boolean flag)
	{
		m.a().a(((Context) (activity)), ((String) (null)), s, sdkadpreferences, flag);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #80  <Method void m.a(Context, String, String, SDKAdPreferences, boolean)>
	//    7   11:return          
	}

	public static void init(Activity activity, String s, String s1)
	{
		init(activity, s, s1, new SDKAdPreferences());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #73  <Class SDKAdPreferences>
	//    4    6:dup             
	//    5    7:invokespecial   #74  <Method void SDKAdPreferences()>
	//    6   10:invokestatic    #85  <Method void init(Activity, String, String, SDKAdPreferences)>
	//    7   13:return          
	}

	public static void init(Activity activity, String s, String s1, SDKAdPreferences sdkadpreferences)
	{
		m.a().a(((Context) (activity)), s, s1, sdkadpreferences, true);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #80  <Method void m.a(Context, String, String, SDKAdPreferences, boolean)>
	//    7   11:return          
	}

	public static void init(Activity activity, String s, String s1, SDKAdPreferences sdkadpreferences, boolean flag)
	{
		m.a().a(((Context) (activity)), s, s1, sdkadpreferences, flag);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #80  <Method void m.a(Context, String, String, SDKAdPreferences, boolean)>
	//    7   12:return          
	}

	public static void init(Activity activity, String s, String s1, boolean flag)
	{
		init(activity, s, s1, new SDKAdPreferences(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #73  <Class SDKAdPreferences>
	//    4    6:dup             
	//    5    7:invokespecial   #74  <Method void SDKAdPreferences()>
	//    6   10:iload_3         
	//    7   11:invokestatic    #89  <Method void init(Activity, String, String, SDKAdPreferences, boolean)>
	//    8   14:return          
	}

	public static void init(Activity activity, String s, boolean flag)
	{
		init(activity, s, new SDKAdPreferences(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #73  <Class SDKAdPreferences>
	//    3    5:dup             
	//    4    6:invokespecial   #74  <Method void SDKAdPreferences()>
	//    5    9:iload_2         
	//    6   10:invokestatic    #92  <Method void init(Activity, String, SDKAdPreferences, boolean)>
	//    7   13:return          
	}

	public static void init(Context context, String s, String s1)
	{
		init(context, s, s1, new SDKAdPreferences());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #73  <Class SDKAdPreferences>
	//    4    6:dup             
	//    5    7:invokespecial   #74  <Method void SDKAdPreferences()>
	//    6   10:invokestatic    #96  <Method void init(Context, String, String, SDKAdPreferences)>
	//    7   13:return          
	}

	public static void init(Context context, String s, String s1, SDKAdPreferences sdkadpreferences)
	{
		m.a().a(context, s, s1, sdkadpreferences, true);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #80  <Method void m.a(Context, String, String, SDKAdPreferences, boolean)>
	//    7   11:return          
	}

	public static void init(Context context, String s, String s1, SDKAdPreferences sdkadpreferences, boolean flag)
	{
		m.a().a(context, s, s1, sdkadpreferences, flag);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #80  <Method void m.a(Context, String, String, SDKAdPreferences, boolean)>
	//    7   12:return          
	}

	public static void init(Context context, String s, String s1, boolean flag)
	{
		init(context, s, s1, new SDKAdPreferences(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #73  <Class SDKAdPreferences>
	//    4    6:dup             
	//    5    7:invokespecial   #74  <Method void SDKAdPreferences()>
	//    6   10:iload_3         
	//    7   11:invokestatic    #100 <Method void init(Context, String, String, SDKAdPreferences, boolean)>
	//    8   14:return          
	}

	public static void init(Context context, String s, boolean flag)
	{
		init(context, ((String) (null)), s, flag);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #103 <Method void init(Context, String, String, boolean)>
	//    5    7:return          
	}

	private static void pauseServices(Context context)
	{
		m.a().a(context);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #106 <Method void m.a(Context)>
		m.a().b(context);
	//    3    7:invokestatic    #17  <Method m m.a()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #108 <Method void m.b(Context)>
	//    6   14:return          
	}

	private static void resumeServices(Context context)
	{
		m.a().c(context);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #111 <Method void m.c(Context)>
		m.a().d(context);
	//    3    7:invokestatic    #17  <Method m m.a()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #114 <Method void m.d(Context)>
	//    6   14:return          
	}

	public static void setUserConsent(Context context, String s, long l, boolean flag)
	{
		m.a().a(context, s, l, flag, true);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:iconst_1        
	//    6    9:invokevirtual   #119 <Method void m.a(Context, String, long, boolean, boolean)>
	//    7   12:return          
	}

	public static void startNewSession(Context context)
	{
		m.a().a(context, com.startapp.android.publish.common.metaData.MetaDataRequest.a.d);
	//    0    0:invokestatic    #17  <Method m m.a()>
	//    1    3:aload_0         
	//    2    4:getstatic       #122 <Field com.startapp.android.publish.common.metaData.MetaDataRequest$a com.startapp.android.publish.common.metaData.MetaDataRequest$a.d>
	//    3    7:invokevirtual   #69  <Method void m.a(Context, com.startapp.android.publish.common.metaData.MetaDataRequest$a)>
	//    4   10:return          
	}
}
