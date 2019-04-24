// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.adjust.sdk:
//			Util, AdjustFactory, ILogger

class DeviceInfo
{

	DeviceInfo(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		Object obj = ((Object) (context.getResources()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method Resources Context.getResources()>
	//    4    8:astore          6
		DisplayMetrics displaymetrics = ((Resources) (obj)).getDisplayMetrics();
	//    5   10:aload           6
	//    6   12:invokevirtual   #45  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    7   15:astore          5
		Object obj1 = ((Object) (((Resources) (obj)).getConfiguration()));
	//    8   17:aload           6
	//    9   19:invokevirtual   #49  <Method Configuration Resources.getConfiguration()>
	//   10   22:astore          7
		obj = ((Object) (((Configuration) (obj1)).locale));
	//   11   24:aload           7
	//   12   26:getfield        #55  <Field Locale Configuration.locale>
	//   13   29:astore          6
		int i = ((Configuration) (obj1)).screenLayout;
	//   14   31:aload           7
	//   15   33:getfield        #59  <Field int Configuration.screenLayout>
	//   16   36:istore_3        
		boolean flag;
		if(Util.getPlayAdId(context) != null)
	//*  17   37:aload_1         
	//*  18   38:invokestatic    #65  <Method String Util.getPlayAdId(Context)>
	//*  19   41:ifnull          50
			flag = true;
	//   20   44:iconst_1        
	//   21   45:istore          4
		else
	//*  22   47:goto            53
			flag = false;
	//   23   50:iconst_0        
	//   24   51:istore          4
		obj1 = ((Object) (getMacAddress(context, flag)));
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:iload           4
	//   28   57:invokespecial   #69  <Method String getMacAddress(Context, boolean)>
	//   29   60:astore          7
		packageName = getPackageName(context);
	//   30   62:aload_0         
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokespecial   #72  <Method String getPackageName(Context)>
	//   34   68:putfield        #74  <Field String packageName>
		appVersion = getAppVersion(context);
	//   35   71:aload_0         
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:invokespecial   #77  <Method String getAppVersion(Context)>
	//   39   77:putfield        #79  <Field String appVersion>
		deviceType = getDeviceType(i);
	//   40   80:aload_0         
	//   41   81:aload_0         
	//   42   82:iload_3         
	//   43   83:invokespecial   #83  <Method String getDeviceType(int)>
	//   44   86:putfield        #85  <Field String deviceType>
		deviceName = getDeviceName();
	//   45   89:aload_0         
	//   46   90:aload_0         
	//   47   91:invokespecial   #89  <Method String getDeviceName()>
	//   48   94:putfield        #91  <Field String deviceName>
		deviceManufacturer = getDeviceManufacturer();
	//   49   97:aload_0         
	//   50   98:aload_0         
	//   51   99:invokespecial   #94  <Method String getDeviceManufacturer()>
	//   52  102:putfield        #96  <Field String deviceManufacturer>
		osName = getOsName();
	//   53  105:aload_0         
	//   54  106:aload_0         
	//   55  107:invokespecial   #99  <Method String getOsName()>
	//   56  110:putfield        #101 <Field String osName>
		osVersion = getOsVersion();
	//   57  113:aload_0         
	//   58  114:aload_0         
	//   59  115:invokespecial   #104 <Method String getOsVersion()>
	//   60  118:putfield        #106 <Field String osVersion>
		apiLevel = getApiLevel();
	//   61  121:aload_0         
	//   62  122:aload_0         
	//   63  123:invokespecial   #109 <Method String getApiLevel()>
	//   64  126:putfield        #111 <Field String apiLevel>
		language = getLanguage(((Locale) (obj)));
	//   65  129:aload_0         
	//   66  130:aload_0         
	//   67  131:aload           6
	//   68  133:invokespecial   #115 <Method String getLanguage(Locale)>
	//   69  136:putfield        #117 <Field String language>
		country = getCountry(((Locale) (obj)));
	//   70  139:aload_0         
	//   71  140:aload_0         
	//   72  141:aload           6
	//   73  143:invokespecial   #120 <Method String getCountry(Locale)>
	//   74  146:putfield        #122 <Field String country>
		screenSize = getScreenSize(i);
	//   75  149:aload_0         
	//   76  150:aload_0         
	//   77  151:iload_3         
	//   78  152:invokespecial   #125 <Method String getScreenSize(int)>
	//   79  155:putfield        #127 <Field String screenSize>
		screenFormat = getScreenFormat(i);
	//   80  158:aload_0         
	//   81  159:aload_0         
	//   82  160:iload_3         
	//   83  161:invokespecial   #130 <Method String getScreenFormat(int)>
	//   84  164:putfield        #132 <Field String screenFormat>
		screenDensity = getScreenDensity(displaymetrics);
	//   85  167:aload_0         
	//   86  168:aload_0         
	//   87  169:aload           5
	//   88  171:invokespecial   #136 <Method String getScreenDensity(DisplayMetrics)>
	//   89  174:putfield        #138 <Field String screenDensity>
		displayWidth = getDisplayWidth(displaymetrics);
	//   90  177:aload_0         
	//   91  178:aload_0         
	//   92  179:aload           5
	//   93  181:invokespecial   #141 <Method String getDisplayWidth(DisplayMetrics)>
	//   94  184:putfield        #143 <Field String displayWidth>
		displayHeight = getDisplayHeight(displaymetrics);
	//   95  187:aload_0         
	//   96  188:aload_0         
	//   97  189:aload           5
	//   98  191:invokespecial   #146 <Method String getDisplayHeight(DisplayMetrics)>
	//   99  194:putfield        #148 <Field String displayHeight>
		clientSdk = getClientSdk(s);
	//  100  197:aload_0         
	//  101  198:aload_0         
	//  102  199:aload_2         
	//  103  200:invokespecial   #152 <Method String getClientSdk(String)>
	//  104  203:putfield        #154 <Field String clientSdk>
		androidId = getAndroidId(context, flag);
	//  105  206:aload_0         
	//  106  207:aload_0         
	//  107  208:aload_1         
	//  108  209:iload           4
	//  109  211:invokespecial   #157 <Method String getAndroidId(Context, boolean)>
	//  110  214:putfield        #159 <Field String androidId>
		fbAttributionId = getFacebookAttributionId(context);
	//  111  217:aload_0         
	//  112  218:aload_0         
	//  113  219:aload_1         
	//  114  220:invokespecial   #162 <Method String getFacebookAttributionId(Context)>
	//  115  223:putfield        #164 <Field String fbAttributionId>
		pluginKeys = Util.getPluginKeys(context);
	//  116  226:aload_0         
	//  117  227:aload_1         
	//  118  228:invokestatic    #168 <Method Map Util.getPluginKeys(Context)>
	//  119  231:putfield        #170 <Field Map pluginKeys>
		macSha1 = getMacSha1(((String) (obj1)));
	//  120  234:aload_0         
	//  121  235:aload_0         
	//  122  236:aload           7
	//  123  238:invokespecial   #173 <Method String getMacSha1(String)>
	//  124  241:putfield        #175 <Field String macSha1>
		macShortMd5 = getMacShortMd5(((String) (obj1)));
	//  125  244:aload_0         
	//  126  245:aload_0         
	//  127  246:aload           7
	//  128  248:invokespecial   #178 <Method String getMacShortMd5(String)>
	//  129  251:putfield        #180 <Field String macShortMd5>
	//  130  254:return          
	}

	private String getAndroidId(Context context, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            9
			return Util.getAndroidId(context);
	//    2    4:aload_1         
	//    3    5:invokestatic    #183 <Method String Util.getAndroidId(Context)>
	//    4    8:areturn         
		else
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
	}

	private String getApiLevel()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #185 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("");
	//    4    8:aload_1         
	//    5    9:ldc1            #188 <String "">
	//    6   11:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(android.os.Build.VERSION.SDK_INT);
	//    8   15:aload_1         
	//    9   16:getstatic       #197 <Field int android.os.Build$VERSION.SDK_INT>
	//   10   19:invokevirtual   #200 <Method StringBuilder StringBuilder.append(int)>
	//   11   22:pop             
		return stringbuilder.toString();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #203 <Method String StringBuilder.toString()>
	//   14   27:areturn         
	}

	private String getAppVersion(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #209 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #211 <Method String Context.getPackageName()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #217 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:getfield        #222 <Field String PackageInfo.versionName>
	//    7   15:astore_1        
		}
	//*   8   16:aload_1         
	//*   9   17:areturn         
	//*  10   18:aconst_null     
	//*  11   19:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		return ((String) (context));
	//*  12   20:astore_1        
	//*  13   21:goto            18
	}

	private String getClientSdk(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       7
			return "android4.2.3";
	//    2    4:ldc1            #224 <String "android4.2.3">
	//    3    6:areturn         
		else
			return String.format(Locale.US, "%s@%s", new Object[] {
				s, "android4.2.3"
			});
	//    4    7:getstatic       #229 <Field Locale Locale.US>
	//    5   10:ldc1            #231 <String "%s@%s">
	//    6   12:iconst_2        
	//    7   13:anewarray       Object[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:aload_1         
	//   11   19:aastore         
	//   12   20:dup             
	//   13   21:iconst_1        
	//   14   22:ldc1            #224 <String "android4.2.3">
	//   15   24:aastore         
	//   16   25:invokestatic    #237 <Method String String.format(Locale, String, Object[])>
	//   17   28:areturn         
	}

	private String getCountry(Locale locale)
	{
		return locale.getCountry();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #239 <Method String Locale.getCountry()>
	//    2    4:areturn         
	}

	private String getDeviceManufacturer()
	{
		return Build.MANUFACTURER;
	//    0    0:getstatic       #244 <Field String Build.MANUFACTURER>
	//    1    3:areturn         
	}

	private String getDeviceName()
	{
		return Build.MODEL;
	//    0    0:getstatic       #247 <Field String Build.MODEL>
	//    1    3:areturn         
	}

	private String getDeviceType(int i)
	{
		switch(i & 0xf)
	//*   0    0:iload_1         
	//*   1    1:bipush          15
	//*   2    3:iand            
		{
	//*   3    4:tableswitch     1 4: default 36
	//	               1 41
	//	               2 41
	//	               3 38
	//	               4 38
		default:
			return null;
	//    4   36:aconst_null     
	//    5   37:areturn         

		case 3: // '\003'
		case 4: // '\004'
			return "tablet";
	//    6   38:ldc1            #249 <String "tablet">
	//    7   40:areturn         

		case 1: // '\001'
		case 2: // '\002'
			return "phone";
	//    8   41:ldc1            #251 <String "phone">
	//    9   43:areturn         
		}
	}

	private String getDisplayHeight(DisplayMetrics displaymetrics)
	{
		return String.valueOf(displaymetrics.heightPixels);
	//    0    0:aload_1         
	//    1    1:getfield        #256 <Field int DisplayMetrics.heightPixels>
	//    2    4:invokestatic    #259 <Method String String.valueOf(int)>
	//    3    7:areturn         
	}

	private String getDisplayWidth(DisplayMetrics displaymetrics)
	{
		return String.valueOf(displaymetrics.widthPixels);
	//    0    0:aload_1         
	//    1    1:getfield        #262 <Field int DisplayMetrics.widthPixels>
	//    2    4:invokestatic    #259 <Method String String.valueOf(int)>
	//    3    7:areturn         
	}

	private String getFacebookAttributionId(Context context)
	{
		String s;
		try
		{
			context = ((Context) (context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[] {
				"aid"
			}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #268 <Method ContentResolver Context.getContentResolver()>
	//    2    4:ldc2            #270 <String "content://com.facebook.katana.provider.AttributionIdProvider">
	//    3    7:invokestatic    #276 <Method Uri Uri.parse(String)>
	//    4   10:iconst_1        
	//    5   11:anewarray       String[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc2            #278 <String "aid">
	//    9   19:aastore         
	//   10   20:aconst_null     
	//   11   21:aconst_null     
	//   12   22:aconst_null     
	//   13   23:invokevirtual   #284 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   14   26:astore_1        
		}
	//*  15   27:aload_1         
	//*  16   28:ifnonnull       33
	//*  17   31:aconst_null     
	//*  18   32:areturn         
	//*  19   33:aload_1         
	//*  20   34:invokeinterface #290 <Method boolean Cursor.moveToFirst()>
	//*  21   39:ifne            50
	//*  22   42:aload_1         
	//*  23   43:invokeinterface #293 <Method void Cursor.close()>
	//*  24   48:aconst_null     
	//*  25   49:areturn         
	//*  26   50:aload_1         
	//*  27   51:aload_1         
	//*  28   52:ldc2            #278 <String "aid">
	//*  29   55:invokeinterface #297 <Method int Cursor.getColumnIndex(String)>
	//*  30   60:invokeinterface #300 <Method String Cursor.getString(int)>
	//*  31   65:astore_2        
	//*  32   66:aload_1         
	//*  33   67:invokeinterface #293 <Method void Cursor.close()>
	//*  34   72:aload_2         
	//*  35   73:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  36   74:astore_1        
		{
			return null;
	//   37   75:aconst_null     
	//   38   76:areturn         
		}
		if(context == null)
			return null;
		if(((Cursor) (context)).moveToFirst())
			break MISSING_BLOCK_LABEL_50;
		((Cursor) (context)).close();
		return null;
		s = ((Cursor) (context)).getString(((Cursor) (context)).getColumnIndex("aid"));
		((Cursor) (context)).close();
		return s;
	}

	private String getLanguage(Locale locale)
	{
		return locale.getLanguage();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #302 <Method String Locale.getLanguage()>
	//    2    4:areturn         
	}

	private String getMacAddress(Context context, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            34
		{
			if(!Util.checkPermission(context, "android.permission.ACCESS_WIFI_STATE"))
	//*   2    4:aload_1         
	//*   3    5:ldc2            #304 <String "android.permission.ACCESS_WIFI_STATE">
	//*   4    8:invokestatic    #308 <Method boolean Util.checkPermission(Context, String)>
	//*   5   11:ifne            29
				AdjustFactory.getLogger().warn("Missing permission: ACCESS_WIFI_STATE", new Object[0]);
	//    6   14:invokestatic    #314 <Method ILogger AdjustFactory.getLogger()>
	//    7   17:ldc2            #316 <String "Missing permission: ACCESS_WIFI_STATE">
	//    8   20:iconst_0        
	//    9   21:anewarray       Object[]
	//   10   24:invokeinterface #322 <Method void ILogger.warn(String, Object[])>
			return Util.getMacAddress(context);
	//   11   29:aload_1         
	//   12   30:invokestatic    #324 <Method String Util.getMacAddress(Context)>
	//   13   33:areturn         
		} else
		{
			return null;
	//   14   34:aconst_null     
	//   15   35:areturn         
		}
	}

	private String getMacSha1(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Util.sha1(s);
	//    4    6:aload_1         
	//    5    7:invokestatic    #327 <Method String Util.sha1(String)>
	//    6   10:areturn         
	}

	private String getMacShortMd5(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Util.md5(s.replaceAll(":", ""));
	//    4    6:aload_1         
	//    5    7:ldc2            #329 <String ":">
	//    6   10:ldc1            #188 <String "">
	//    7   12:invokevirtual   #333 <Method String String.replaceAll(String, String)>
	//    8   15:invokestatic    #336 <Method String Util.md5(String)>
	//    9   18:areturn         
	}

	private String getOsName()
	{
		return "android";
	//    0    0:ldc2            #338 <String "android">
	//    1    3:areturn         
	}

	private String getOsVersion()
	{
		return android.os.Build.VERSION.RELEASE;
	//    0    0:getstatic       #341 <Field String android.os.Build$VERSION.RELEASE>
	//    1    3:areturn         
	}

	private String getPackageName(Context context)
	{
		return context.getPackageName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #211 <Method String Context.getPackageName()>
	//    2    4:areturn         
	}

	private String getScreenDensity(DisplayMetrics displaymetrics)
	{
		int i = displaymetrics.densityDpi;
	//    0    0:aload_1         
	//    1    1:getfield        #344 <Field int DisplayMetrics.densityDpi>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(i < 140)
	//*   7   11:iload_2         
	//*   8   12:sipush          140
	//*   9   15:icmpge          22
			return "low";
	//   10   18:ldc2            #346 <String "low">
	//   11   21:areturn         
		if(i > 200)
	//*  12   22:iload_2         
	//*  13   23:sipush          200
	//*  14   26:icmple          33
			return "high";
	//   15   29:ldc2            #348 <String "high">
	//   16   32:areturn         
		else
			return "medium";
	//   17   33:ldc2            #350 <String "medium">
	//   18   36:areturn         
	}

	private String getScreenFormat(int i)
	{
		i &= 0x30;
	//    0    0:iload_1         
	//    1    1:bipush          48
	//    2    3:iand            
	//    3    4:istore_1        
		if(i != 16)
	//*   4    5:iload_1         
	//*   5    6:bipush          16
	//*   6    8:icmpeq          23
		{
			if(i != 32)
	//*   7   11:iload_1         
	//*   8   12:bipush          32
	//*   9   14:icmpeq          19
				return null;
	//   10   17:aconst_null     
	//   11   18:areturn         
			else
				return "long";
	//   12   19:ldc2            #352 <String "long">
	//   13   22:areturn         
		} else
		{
			return "normal";
	//   14   23:ldc2            #354 <String "normal">
	//   15   26:areturn         
		}
	}

	private String getScreenSize(int i)
	{
		switch(i & 0xf)
	//*   0    0:iload_1         
	//*   1    1:bipush          15
	//*   2    3:iand            
		{
	//*   3    4:tableswitch     1 4: default 36
	//	               1 50
	//	               2 46
	//	               3 42
	//	               4 38
		default:
			return null;
	//    4   36:aconst_null     
	//    5   37:areturn         

		case 4: // '\004'
			return "xlarge";
	//    6   38:ldc2            #356 <String "xlarge">
	//    7   41:areturn         

		case 3: // '\003'
			return "large";
	//    8   42:ldc2            #358 <String "large">
	//    9   45:areturn         

		case 2: // '\002'
			return "normal";
	//   10   46:ldc2            #354 <String "normal">
	//   11   49:areturn         

		case 1: // '\001'
			return "small";
	//   12   50:ldc2            #360 <String "small">
	//   13   53:areturn         
		}
	}

	String androidId;
	String apiLevel;
	String appVersion;
	String clientSdk;
	String country;
	String deviceManufacturer;
	String deviceName;
	String deviceType;
	String displayHeight;
	String displayWidth;
	String fbAttributionId;
	String language;
	String macSha1;
	String macShortMd5;
	String osName;
	String osVersion;
	String packageName;
	Map pluginKeys;
	String screenDensity;
	String screenFormat;
	String screenSize;
}
