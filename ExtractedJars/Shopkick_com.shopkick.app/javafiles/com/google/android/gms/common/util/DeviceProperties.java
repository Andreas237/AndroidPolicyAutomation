// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;

// Referenced classes of package com.google.android.gms.common.util:
//			PlatformVersion

public final class DeviceProperties
{

	private DeviceProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isAuto(Context context)
	{
		if(zzgs == null)
	//*   0    0:getstatic       #23  <Field Boolean zzgs>
	//*   1    3:ifnonnull       38
		{
			boolean flag;
			if(PlatformVersion.isAtLeastO() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))
	//*   2    6:invokestatic    #29  <Method boolean PlatformVersion.isAtLeastO()>
	//*   3    9:ifeq            29
	//*   4   12:aload_0         
	//*   5   13:invokevirtual   #35  <Method PackageManager Context.getPackageManager()>
	//*   6   16:ldc1            #37  <String "android.hardware.type.automotive">
	//*   7   18:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   21:ifeq            29
				flag = true;
	//    9   24:iconst_1        
	//   10   25:istore_1        
			else
	//*  11   26:goto            31
				flag = false;
	//   12   29:iconst_0        
	//   13   30:istore_1        
			zzgs = Boolean.valueOf(flag);
	//   14   31:iload_1         
	//   15   32:invokestatic    #49  <Method Boolean Boolean.valueOf(boolean)>
	//   16   35:putstatic       #23  <Field Boolean zzgs>
		}
		return zzgs.booleanValue();
	//   17   38:getstatic       #23  <Field Boolean zzgs>
	//   18   41:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   19   44:ireturn         
	}

	public static boolean isLatchsky(Context context)
	{
		if(zzgq == null)
	//*   0    0:getstatic       #56  <Field Boolean zzgq>
	//*   1    3:ifnonnull       43
		{
			context = ((Context) (context.getPackageManager()));
	//    2    6:aload_0         
	//    3    7:invokevirtual   #35  <Method PackageManager Context.getPackageManager()>
	//    4   10:astore_0        
			boolean flag;
			if(((PackageManager) (context)).hasSystemFeature("com.google.android.feature.services_updater") && ((PackageManager) (context)).hasSystemFeature("cn.google.services"))
	//*   5   11:aload_0         
	//*   6   12:ldc1            #58  <String "com.google.android.feature.services_updater">
	//*   7   14:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   17:ifeq            34
	//*   9   20:aload_0         
	//*  10   21:ldc1            #60  <String "cn.google.services">
	//*  11   23:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
	//*  12   26:ifeq            34
				flag = true;
	//   13   29:iconst_1        
	//   14   30:istore_1        
			else
	//*  15   31:goto            36
				flag = false;
	//   16   34:iconst_0        
	//   17   35:istore_1        
			zzgq = Boolean.valueOf(flag);
	//   18   36:iload_1         
	//   19   37:invokestatic    #49  <Method Boolean Boolean.valueOf(boolean)>
	//   20   40:putstatic       #56  <Field Boolean zzgq>
		}
		return zzgq.booleanValue();
	//   21   43:getstatic       #56  <Field Boolean zzgq>
	//   22   46:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   23   49:ireturn         
	}

	public static boolean isSidewinder(Context context)
	{
		if(zzgp == null)
	//*   0    0:getstatic       #66  <Field Boolean zzgp>
	//*   1    3:ifnonnull       38
		{
			boolean flag;
			if(PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google"))
	//*   2    6:invokestatic    #69  <Method boolean PlatformVersion.isAtLeastLollipop()>
	//*   3    9:ifeq            29
	//*   4   12:aload_0         
	//*   5   13:invokevirtual   #35  <Method PackageManager Context.getPackageManager()>
	//*   6   16:ldc1            #71  <String "cn.google">
	//*   7   18:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   21:ifeq            29
				flag = true;
	//    9   24:iconst_1        
	//   10   25:istore_1        
			else
	//*  11   26:goto            31
				flag = false;
	//   12   29:iconst_0        
	//   13   30:istore_1        
			zzgp = Boolean.valueOf(flag);
	//   14   31:iload_1         
	//   15   32:invokestatic    #49  <Method Boolean Boolean.valueOf(boolean)>
	//   16   35:putstatic       #66  <Field Boolean zzgp>
		}
		return zzgp.booleanValue();
	//   17   38:getstatic       #66  <Field Boolean zzgp>
	//   18   41:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
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
				if(zzgm != null)
					break label0;
	//    6    8:getstatic       #75  <Field Boolean zzgm>
	//    7   11:ifnonnull       105
				boolean flag;
				if((resources.getConfiguration().screenLayout & 0xf) > 3)
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #81  <Method Configuration Resources.getConfiguration()>
	//*  10   18:getfield        #87  <Field int Configuration.screenLayout>
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
					if(zzgn == null)
	//*  22   39:getstatic       #89  <Field Boolean zzgn>
	//*  23   42:ifnonnull       85
					{
						resources = ((Resources) (resources.getConfiguration()));
	//   24   45:aload_0         
	//   25   46:invokevirtual   #81  <Method Configuration Resources.getConfiguration()>
	//   26   49:astore_0        
						boolean flag1;
						if((((Configuration) (resources)).screenLayout & 0xf) <= 3 && ((Configuration) (resources)).smallestScreenWidthDp >= 600)
	//*  27   50:aload_0         
	//*  28   51:getfield        #87  <Field int Configuration.screenLayout>
	//*  29   54:bipush          15
	//*  30   56:iand            
	//*  31   57:iconst_3        
	//*  32   58:icmpgt          76
	//*  33   61:aload_0         
	//*  34   62:getfield        #92  <Field int Configuration.smallestScreenWidthDp>
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
						zzgn = Boolean.valueOf(flag1);
	//   42   78:iload_2         
	//   43   79:invokestatic    #49  <Method Boolean Boolean.valueOf(boolean)>
	//   44   82:putstatic       #89  <Field Boolean zzgn>
					}
					flag2 = flag3;
	//   45   85:iload_3         
	//   46   86:istore_2        
					if(!zzgn.booleanValue())
						break label1;
	//   47   87:getstatic       #89  <Field Boolean zzgn>
	//   48   90:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   49   93:ifeq            98
				}
				flag2 = true;
	//   50   96:iconst_1        
	//   51   97:istore_2        
			}
			zzgm = Boolean.valueOf(flag2);
	//   52   98:iload_2         
	//   53   99:invokestatic    #49  <Method Boolean Boolean.valueOf(boolean)>
	//   54  102:putstatic       #75  <Field Boolean zzgm>
		}
		return zzgm.booleanValue();
	//   55  105:getstatic       #75  <Field Boolean zzgm>
	//   56  108:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   57  111:ireturn         
	}

	public static boolean isTv(Context context)
	{
		if(zzgt == null)
	//*   0    0:getstatic       #95  <Field Boolean zzgt>
	//*   1    3:ifnonnull       55
		{
			context = ((Context) (context.getPackageManager()));
	//    2    6:aload_0         
	//    3    7:invokevirtual   #35  <Method PackageManager Context.getPackageManager()>
	//    4   10:astore_0        
			boolean flag;
			if(!((PackageManager) (context)).hasSystemFeature("com.google.android.tv") && !((PackageManager) (context)).hasSystemFeature("android.hardware.type.television") && !((PackageManager) (context)).hasSystemFeature("android.software.leanback"))
	//*   5   11:aload_0         
	//*   6   12:ldc1            #97  <String "com.google.android.tv">
	//*   7   14:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   17:ifne            46
	//*   9   20:aload_0         
	//*  10   21:ldc1            #99  <String "android.hardware.type.television">
	//*  11   23:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
	//*  12   26:ifne            46
	//*  13   29:aload_0         
	//*  14   30:ldc1            #101 <String "android.software.leanback">
	//*  15   32:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
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
			zzgt = Boolean.valueOf(flag);
	//   23   48:iload_1         
	//   24   49:invokestatic    #49  <Method Boolean Boolean.valueOf(boolean)>
	//   25   52:putstatic       #95  <Field Boolean zzgt>
		}
		return zzgt.booleanValue();
	//   26   55:getstatic       #95  <Field Boolean zzgt>
	//   27   58:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   28   61:ireturn         
	}

	public static boolean isUserBuild()
	{
		return "user".equals(((Object) (Build.TYPE)));
	//    0    0:ldc1            #104 <String "user">
	//    1    2:getstatic       #110 <Field String Build.TYPE>
	//    2    5:invokevirtual   #116 <Method boolean String.equals(Object)>
	//    3    8:ireturn         
	}

	public static boolean isWearable(Context context)
	{
		if(zzgo == null)
	//*   0    0:getstatic       #120 <Field Boolean zzgo>
	//*   1    3:ifnonnull       38
		{
			boolean flag;
			if(PlatformVersion.isAtLeastKitKatWatch() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"))
	//*   2    6:invokestatic    #123 <Method boolean PlatformVersion.isAtLeastKitKatWatch()>
	//*   3    9:ifeq            29
	//*   4   12:aload_0         
	//*   5   13:invokevirtual   #35  <Method PackageManager Context.getPackageManager()>
	//*   6   16:ldc1            #125 <String "android.hardware.type.watch">
	//*   7   18:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   8   21:ifeq            29
				flag = true;
	//    9   24:iconst_1        
	//   10   25:istore_1        
			else
	//*  11   26:goto            31
				flag = false;
	//   12   29:iconst_0        
	//   13   30:istore_1        
			zzgo = Boolean.valueOf(flag);
	//   14   31:iload_1         
	//   15   32:invokestatic    #49  <Method Boolean Boolean.valueOf(boolean)>
	//   16   35:putstatic       #120 <Field Boolean zzgo>
		}
		return zzgo.booleanValue();
	//   17   38:getstatic       #120 <Field Boolean zzgo>
	//   18   41:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   19   44:ireturn         
	}

	public static boolean isWearableWithoutPlayStore(Context context)
	{
		return isWearable(context) && (!PlatformVersion.isAtLeastN() || isSidewinder(context) && !PlatformVersion.isAtLeastO());
	//    0    0:aload_0         
	//    1    1:invokestatic    #129 <Method boolean isWearable(Context)>
	//    2    4:ifeq            28
	//    3    7:invokestatic    #132 <Method boolean PlatformVersion.isAtLeastN()>
	//    4   10:ifeq            26
	//    5   13:aload_0         
	//    6   14:invokestatic    #134 <Method boolean isSidewinder(Context)>
	//    7   17:ifeq            28
	//    8   20:invokestatic    #29  <Method boolean PlatformVersion.isAtLeastO()>
	//    9   23:ifne            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	public static boolean zzf(Context context)
	{
		if(zzgr == null)
	//*   0    0:getstatic       #137 <Field Boolean zzgr>
	//*   1    3:ifnonnull       47
		{
			boolean flag;
			if(!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"))
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #35  <Method PackageManager Context.getPackageManager()>
	//*   4   10:ldc1            #139 <String "android.hardware.type.iot">
	//*   5   12:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   6   15:ifne            38
	//*   7   18:aload_0         
	//*   8   19:invokevirtual   #35  <Method PackageManager Context.getPackageManager()>
	//*   9   22:ldc1            #141 <String "android.hardware.type.embedded">
	//*  10   24:invokevirtual   #43  <Method boolean PackageManager.hasSystemFeature(String)>
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
			zzgr = Boolean.valueOf(flag);
	//   18   40:iload_1         
	//   19   41:invokestatic    #49  <Method Boolean Boolean.valueOf(boolean)>
	//   20   44:putstatic       #137 <Field Boolean zzgr>
		}
		return zzgr.booleanValue();
	//   21   47:getstatic       #137 <Field Boolean zzgr>
	//   22   50:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   23   53:ireturn         
	}

	private static Boolean zzgm;
	private static Boolean zzgn;
	private static Boolean zzgo;
	private static Boolean zzgp;
	private static Boolean zzgq;
	private static Boolean zzgr;
	private static Boolean zzgs;
	private static Boolean zzgt;
}
