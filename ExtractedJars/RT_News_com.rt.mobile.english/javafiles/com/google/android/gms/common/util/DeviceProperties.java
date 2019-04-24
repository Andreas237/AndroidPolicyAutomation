// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Objects;

// Referenced classes of package com.google.android.gms.common.util:
//			PlatformVersion

public final class DeviceProperties
{

	private DeviceProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isAuto(Context context)
	{
		if(zzzt == null)
	//*   0    0:getstatic       #56  <Field Boolean zzzt>
	//*   1    3:ifnonnull       38
		{
			boolean flag;
			if(PlatformVersion.isAtLeastO() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))
	//*   2    6:invokestatic    #62  <Method boolean PlatformVersion.isAtLeastO()>
	//*   3    9:ifeq            29
	//*   4   12:aload_0         
	//*   5   13:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//*   6   16:ldc1            #8   <String "android.hardware.type.automotive">
	//*   7   18:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   21:ifeq            29
				flag = true;
	//    9   24:iconst_1        
	//   10   25:istore_1        
			else
	//*  11   26:goto            31
				flag = false;
	//   12   29:iconst_0        
	//   13   30:istore_1        
			zzzt = Boolean.valueOf(flag);
	//   14   31:iload_1         
	//   15   32:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//   16   35:putstatic       #56  <Field Boolean zzzt>
		}
		return zzzt.booleanValue();
	//   17   38:getstatic       #56  <Field Boolean zzzt>
	//   18   41:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   19   44:ireturn         
	}

	public static boolean isChromeOsDevice(Context context)
	{
		if(zzzs == null)
	//*   0    0:getstatic       #86  <Field Boolean zzzs>
	//*   1    3:ifnonnull       21
			zzzs = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
	//    2    6:aload_0         
	//    3    7:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//    4   10:ldc1            #11  <String "org.chromium.arc">
	//    5   12:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//    6   15:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    7   18:putstatic       #86  <Field Boolean zzzs>
		return zzzs.booleanValue();
	//    8   21:getstatic       #86  <Field Boolean zzzs>
	//    9   24:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   10   27:ireturn         
	}

	public static boolean isIoT(Context context)
	{
		if(zzzr == null)
	//*   0    0:getstatic       #89  <Field Boolean zzzr>
	//*   1    3:ifnonnull       47
		{
			boolean flag;
			if(!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"))
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//*   4   10:ldc1            #17  <String "android.hardware.type.iot">
	//*   5   12:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   6   15:ifne            38
	//*   7   18:aload_0         
	//*   8   19:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//*   9   22:ldc1            #14  <String "android.hardware.type.embedded">
	//*  10   24:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//*  11   27:ifeq            33
	//*  12   30:goto            38
				flag = false;
	//   13   33:iconst_0        
	//   14   34:istore_1        
			else
	//*  15   35:goto            40
				flag = true;
	//   16   38:iconst_1        
	//   17   39:istore_1        
			zzzr = Boolean.valueOf(flag);
	//   18   40:iload_1         
	//   19   41:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//   20   44:putstatic       #89  <Field Boolean zzzr>
		}
		return zzzr.booleanValue();
	//   21   47:getstatic       #89  <Field Boolean zzzr>
	//   22   50:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   23   53:ireturn         
	}

	public static boolean isLatchsky(Context context)
	{
		if(zzzp == null)
	//*   0    0:getstatic       #92  <Field Boolean zzzp>
	//*   1    3:ifnonnull       38
		{
			boolean flag;
			if(PlatformVersion.isAtLeastM() && context.getPackageManager().hasSystemFeature("cn.google.services"))
	//*   2    6:invokestatic    #95  <Method boolean PlatformVersion.isAtLeastM()>
	//*   3    9:ifeq            29
	//*   4   12:aload_0         
	//*   5   13:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//*   6   16:ldc1            #20  <String "cn.google.services">
	//*   7   18:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   21:ifeq            29
				flag = true;
	//    9   24:iconst_1        
	//   10   25:istore_1        
			else
	//*  11   26:goto            31
				flag = false;
	//   12   29:iconst_0        
	//   13   30:istore_1        
			zzzp = Boolean.valueOf(flag);
	//   14   31:iload_1         
	//   15   32:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//   16   35:putstatic       #92  <Field Boolean zzzp>
		}
		return zzzp.booleanValue();
	//   17   38:getstatic       #92  <Field Boolean zzzp>
	//   18   41:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   19   44:ireturn         
	}

	public static boolean isLowRamOrPreKitKat(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT < 19)
	//*   0    0:getstatic       #102 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmpge          10
			return true;
	//    3    8:iconst_1        
	//    4    9:ireturn         
		if(zzzq == null)
	//*   5   10:getstatic       #104 <Field Boolean zzzq>
	//*   6   13:ifnonnull       40
		{
			context = ((Context) ((ActivityManager)context.getSystemService("activity")));
	//    7   16:aload_0         
	//    8   17:ldc1            #106 <String "activity">
	//    9   19:invokevirtual   #110 <Method Object Context.getSystemService(String)>
	//   10   22:checkcast       #112 <Class ActivityManager>
	//   11   25:astore_0        
			if(context != null)
	//*  12   26:aload_0         
	//*  13   27:ifnull          40
				zzzq = Boolean.valueOf(((ActivityManager) (context)).isLowRamDevice());
	//   14   30:aload_0         
	//   15   31:invokevirtual   #115 <Method boolean ActivityManager.isLowRamDevice()>
	//   16   34:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//   17   37:putstatic       #104 <Field Boolean zzzq>
		}
		return Objects.equal(((Object) (zzzq)), ((Object) (Boolean.TRUE)));
	//   18   40:getstatic       #104 <Field Boolean zzzq>
	//   19   43:getstatic       #118 <Field Boolean Boolean.TRUE>
	//   20   46:invokestatic    #124 <Method boolean Objects.equal(Object, Object)>
	//   21   49:ireturn         
	}

	public static boolean isPixelDevice(Context context)
	{
		if(zzzv == null)
	//*   0    0:getstatic       #127 <Field Boolean zzzv>
	//*   1    3:ifnonnull       21
			zzzv = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_EXPERIENCE"));
	//    2    6:aload_0         
	//    3    7:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//    4   10:ldc1            #23  <String "com.google.android.feature.PIXEL_EXPERIENCE">
	//    5   12:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//    6   15:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    7   18:putstatic       #127 <Field Boolean zzzv>
		return zzzv.booleanValue();
	//    8   21:getstatic       #127 <Field Boolean zzzv>
	//    9   24:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   10   27:ireturn         
	}

	public static boolean isSidewinder(Context context)
	{
		if(zzzo == null)
	//*   0    0:getstatic       #133 <Field Boolean zzzo>
	//*   1    3:ifnonnull       38
		{
			boolean flag;
			if(PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google"))
	//*   2    6:invokestatic    #136 <Method boolean PlatformVersion.isAtLeastLollipop()>
	//*   3    9:ifeq            29
	//*   4   12:aload_0         
	//*   5   13:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//*   6   16:ldc1            #26  <String "cn.google">
	//*   7   18:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   21:ifeq            29
				flag = true;
	//    9   24:iconst_1        
	//   10   25:istore_1        
			else
	//*  11   26:goto            31
				flag = false;
	//   12   29:iconst_0        
	//   13   30:istore_1        
			zzzo = Boolean.valueOf(flag);
	//   14   31:iload_1         
	//   15   32:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//   16   35:putstatic       #133 <Field Boolean zzzo>
		}
		return zzzo.booleanValue();
	//   17   38:getstatic       #133 <Field Boolean zzzo>
	//   18   41:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   19   44:ireturn         
	}

	public static boolean isTablet(Resources resources)
	{
label0:
		{
			boolean flag2;
label1:
			{
				boolean flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
				if(resources == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
					return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
				if(zzzl != null)
					break label0;
	//    6    8:getstatic       #141 <Field Boolean zzzl>
	//    7   11:ifnonnull       105
				boolean flag;
				if((resources.getConfiguration().screenLayout & 0xf) > 3)
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #147 <Method Configuration Resources.getConfiguration()>
	//*  10   18:getfield        #152 <Field int Configuration.screenLayout>
	//*  11   21:bipush          15
	//*  12   23:iand            
	//*  13   24:iconst_3        
	//*  14   25:icmple          33
					flag = true;
	//   15   28:iconst_1        
	//   16   29:istore_1        
				else
	//*  17   30:goto            35
					flag = false;
	//   18   33:iconst_0        
	//   19   34:istore_1        
				if(!flag)
	//*  20   35:iload_1         
	//*  21   36:ifne            96
				{
					if(zzzm == null)
	//*  22   39:getstatic       #154 <Field Boolean zzzm>
	//*  23   42:ifnonnull       85
					{
						resources = ((Resources) (resources.getConfiguration()));
	//   24   45:aload_0         
	//   25   46:invokevirtual   #147 <Method Configuration Resources.getConfiguration()>
	//   26   49:astore_0        
						boolean flag1;
						if((((Configuration) (resources)).screenLayout & 0xf) <= 3 && ((Configuration) (resources)).smallestScreenWidthDp >= 600)
	//*  27   50:aload_0         
	//*  28   51:getfield        #152 <Field int Configuration.screenLayout>
	//*  29   54:bipush          15
	//*  30   56:iand            
	//*  31   57:iconst_3        
	//*  32   58:icmpgt          76
	//*  33   61:aload_0         
	//*  34   62:getfield        #157 <Field int Configuration.smallestScreenWidthDp>
	//*  35   65:sipush          600
	//*  36   68:icmplt          76
							flag1 = true;
	//   37   71:iconst_1        
	//   38   72:istore_2        
						else
	//*  39   73:goto            78
							flag1 = false;
	//   40   76:iconst_0        
	//   41   77:istore_2        
						zzzm = Boolean.valueOf(flag1);
	//   42   78:iload_2         
	//   43   79:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//   44   82:putstatic       #154 <Field Boolean zzzm>
					}
					flag2 = flag3;
	//   45   85:iload_3         
	//   46   86:istore_2        
					if(!zzzm.booleanValue())
						break label1;
	//   47   87:getstatic       #154 <Field Boolean zzzm>
	//   48   90:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   49   93:ifeq            98
				}
				flag2 = true;
	//   50   96:iconst_1        
	//   51   97:istore_2        
			}
			zzzl = Boolean.valueOf(flag2);
	//   52   98:iload_2         
	//   53   99:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//   54  102:putstatic       #141 <Field Boolean zzzl>
		}
		return zzzl.booleanValue();
	//   55  105:getstatic       #141 <Field Boolean zzzl>
	//   56  108:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   57  111:ireturn         
	}

	public static boolean isTv(Context context)
	{
		if(zzzu == null)
	//*   0    0:getstatic       #160 <Field Boolean zzzu>
	//*   1    3:ifnonnull       55
		{
			context = ((Context) (context.getPackageManager()));
	//    2    6:aload_0         
	//    3    7:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//    4   10:astore_0        
			boolean flag;
			if(!((PackageManager) (context)).hasSystemFeature("com.google.android.tv") && !((PackageManager) (context)).hasSystemFeature("android.hardware.type.television") && !((PackageManager) (context)).hasSystemFeature("android.software.leanback"))
	//*   5   11:aload_0         
	//*   6   12:ldc1            #29  <String "com.google.android.tv">
	//*   7   14:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   17:ifne            46
	//*   9   20:aload_0         
	//*  10   21:ldc1            #32  <String "android.hardware.type.television">
	//*  11   23:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//*  12   26:ifne            46
	//*  13   29:aload_0         
	//*  14   30:ldc1            #35  <String "android.software.leanback">
	//*  15   32:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//*  16   35:ifeq            41
	//*  17   38:goto            46
				flag = false;
	//   18   41:iconst_0        
	//   19   42:istore_1        
			else
	//*  20   43:goto            48
				flag = true;
	//   21   46:iconst_1        
	//   22   47:istore_1        
			zzzu = Boolean.valueOf(flag);
	//   23   48:iload_1         
	//   24   49:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//   25   52:putstatic       #160 <Field Boolean zzzu>
		}
		return zzzu.booleanValue();
	//   26   55:getstatic       #160 <Field Boolean zzzu>
	//   27   58:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   28   61:ireturn         
	}

	public static boolean isUserBuild()
	{
		if(GooglePlayServicesUtilLight.sIsTestMode)
	//*   0    0:getstatic       #167 <Field boolean GooglePlayServicesUtilLight.sIsTestMode>
	//*   1    3:ifeq            10
			return GooglePlayServicesUtilLight.sTestIsUserBuild;
	//    2    6:getstatic       #170 <Field boolean GooglePlayServicesUtilLight.sTestIsUserBuild>
	//    3    9:ireturn         
		else
			return "user".equals(((Object) (Build.TYPE)));
	//    4   10:ldc1            #172 <String "user">
	//    5   12:getstatic       #177 <Field String Build.TYPE>
	//    6   15:invokevirtual   #183 <Method boolean String.equals(Object)>
	//    7   18:ireturn         
	}

	public static boolean isWearable(Context context)
	{
		if(zzzn == null)
	//*   0    0:getstatic       #187 <Field Boolean zzzn>
	//*   1    3:ifnonnull       38
		{
			boolean flag;
			if(PlatformVersion.isAtLeastKitKatWatch() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"))
	//*   2    6:invokestatic    #190 <Method boolean PlatformVersion.isAtLeastKitKatWatch()>
	//*   3    9:ifeq            29
	//*   4   12:aload_0         
	//*   5   13:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//*   6   16:ldc1            #192 <String "android.hardware.type.watch">
	//*   7   18:invokevirtual   #74  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   21:ifeq            29
				flag = true;
	//    9   24:iconst_1        
	//   10   25:istore_1        
			else
	//*  11   26:goto            31
				flag = false;
	//   12   29:iconst_0        
	//   13   30:istore_1        
			zzzn = Boolean.valueOf(flag);
	//   14   31:iload_1         
	//   15   32:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//   16   35:putstatic       #187 <Field Boolean zzzn>
		}
		return zzzn.booleanValue();
	//   17   38:getstatic       #187 <Field Boolean zzzn>
	//   18   41:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//   19   44:ireturn         
	}

	public static boolean isWearableWithoutPlayStore(Context context)
	{
		return (!PlatformVersion.isAtLeastN() || isSidewinder(context)) && isWearable(context);
	//    0    0:invokestatic    #197 <Method boolean PlatformVersion.isAtLeastN()>
	//    1    3:ifeq            13
	//    2    6:aload_0         
	//    3    7:invokestatic    #199 <Method boolean isSidewinder(Context)>
	//    4   10:ifeq            22
	//    5   13:aload_0         
	//    6   14:invokestatic    #201 <Method boolean isWearable(Context)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public static void resetForTest()
	{
		zzzm = null;
	//    0    0:aconst_null     
	//    1    1:putstatic       #154 <Field Boolean zzzm>
		zzzl = null;
	//    2    4:aconst_null     
	//    3    5:putstatic       #141 <Field Boolean zzzl>
		zzzn = null;
	//    4    8:aconst_null     
	//    5    9:putstatic       #187 <Field Boolean zzzn>
		zzzo = null;
	//    6   12:aconst_null     
	//    7   13:putstatic       #133 <Field Boolean zzzo>
		zzzp = null;
	//    8   16:aconst_null     
	//    9   17:putstatic       #92  <Field Boolean zzzp>
		zzzq = null;
	//   10   20:aconst_null     
	//   11   21:putstatic       #104 <Field Boolean zzzq>
		zzzr = null;
	//   12   24:aconst_null     
	//   13   25:putstatic       #89  <Field Boolean zzzr>
		zzzs = null;
	//   14   28:aconst_null     
	//   15   29:putstatic       #86  <Field Boolean zzzs>
		zzzt = null;
	//   16   32:aconst_null     
	//   17   33:putstatic       #56  <Field Boolean zzzt>
		zzzu = null;
	//   18   36:aconst_null     
	//   19   37:putstatic       #160 <Field Boolean zzzu>
		zzzv = null;
	//   20   40:aconst_null     
	//   21   41:putstatic       #127 <Field Boolean zzzv>
	//   22   44:return          
	}

	public static void setIsAutoForTest(boolean flag)
	{
		zzzt = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #56  <Field Boolean zzzt>
	//    3    7:return          
	}

	public static void setIsIoTForTest(boolean flag)
	{
		zzzr = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #89  <Field Boolean zzzr>
	//    3    7:return          
	}

	public static void setIsLatchskyForTest(boolean flag)
	{
		zzzp = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #92  <Field Boolean zzzp>
	//    3    7:return          
	}

	public static void setIsLowRamForTest(boolean flag)
	{
		zzzq = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #104 <Field Boolean zzzq>
	//    3    7:return          
	}

	public static void setIsPixelForTest(boolean flag)
	{
		zzzv = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #127 <Field Boolean zzzv>
	//    3    7:return          
	}

	public static void setIsSideWinderForTest(boolean flag)
	{
		zzzo = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #133 <Field Boolean zzzo>
	//    3    7:return          
	}

	public static void setIsTvForTest(boolean flag)
	{
		zzzu = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #160 <Field Boolean zzzu>
	//    3    7:return          
	}

	public static void setIsWearableForTest(boolean flag)
	{
		zzzn = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #80  <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #187 <Field Boolean zzzn>
	//    3    7:return          
	}

	public static final String FEATURE_AUTO = "android.hardware.type.automotive";
	public static final String FEATURE_CHROME_OS = "org.chromium.arc";
	public static final String FEATURE_EMBEDDED = "android.hardware.type.embedded";
	public static final String FEATURE_IOT = "android.hardware.type.iot";
	public static final String FEATURE_LATCHSKY = "cn.google.services";
	public static final String FEATURE_PIXEL = "com.google.android.feature.PIXEL_EXPERIENCE";
	public static final String FEATURE_SIDEWINDER = "cn.google";
	public static final String FEATURE_TV_1 = "com.google.android.tv";
	public static final String FEATURE_TV_2 = "android.hardware.type.television";
	public static final String FEATURE_TV_3 = "android.software.leanback";
	private static Boolean zzzl;
	private static Boolean zzzm;
	private static Boolean zzzn;
	private static Boolean zzzo;
	private static Boolean zzzp;
	private static Boolean zzzq;
	private static Boolean zzzr;
	private static Boolean zzzs;
	private static Boolean zzzt;
	private static Boolean zzzu;
	private static Boolean zzzv;
}
