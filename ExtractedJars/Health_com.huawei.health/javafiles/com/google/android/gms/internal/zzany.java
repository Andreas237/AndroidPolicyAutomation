// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.zzj;

public class zzany
{

	private static boolean zzCH()
	{
		return !TextUtils.isEmpty(((CharSequence) (Build.PRODUCT))) && Build.PRODUCT.startsWith("glass_");
	//    0    0:getstatic       #19  <Field String Build.PRODUCT>
	//    1    3:invokestatic    #25  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    6:ifne            22
	//    3    9:getstatic       #19  <Field String Build.PRODUCT>
	//    4   12:ldc1            #27  <String "glass_">
	//    5   14:invokevirtual   #33  <Method boolean String.startsWith(String)>
	//    6   17:ifeq            22
	//    7   20:iconst_1        
	//    8   21:ireturn         
	//    9   22:iconst_0        
	//   10   23:ireturn         
	}

	public static boolean zzbo(Context context)
	{
		return zzj.zzaZ(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method boolean zzj.zzaZ(Context)>
	//    2    4:ireturn         
	}

	public static int zzbp(Context context)
	{
		if(zzaUv == -1)
	//*   0    0:getstatic       #10  <Field int zzaUv>
	//*   1    3:iconst_m1       
	//*   2    4:icmpne          70
			if(zzbo(context))
	//*   3    7:aload_0         
	//*   4    8:invokestatic    #44  <Method boolean zzbo(Context)>
	//*   5   11:ifeq            21
				zzaUv = 3;
	//    6   14:iconst_3        
	//    7   15:putstatic       #10  <Field int zzaUv>
			else
	//*   8   18:goto            70
			if(zzbs(context))
	//*   9   21:aload_0         
	//*  10   22:invokestatic    #47  <Method boolean zzbs(Context)>
	//*  11   25:ifne            31
	//*  12   28:goto            38
				zzaUv = 0;
	//   13   31:iconst_0        
	//   14   32:putstatic       #10  <Field int zzaUv>
			else
	//*  15   35:goto            70
			if(zzbq(context))
	//*  16   38:aload_0         
	//*  17   39:invokestatic    #50  <Method boolean zzbq(Context)>
	//*  18   42:ifeq            52
				zzaUv = 2;
	//   19   45:iconst_2        
	//   20   46:putstatic       #10  <Field int zzaUv>
			else
	//*  21   49:goto            70
			if(zzCH())
	//*  22   52:invokestatic    #52  <Method boolean zzCH()>
	//*  23   55:ifeq            66
				zzaUv = 6;
	//   24   58:bipush          6
	//   25   60:putstatic       #10  <Field int zzaUv>
			else
	//*  26   63:goto            70
				zzaUv = 1;
	//   27   66:iconst_1        
	//   28   67:putstatic       #10  <Field int zzaUv>
		return zzaUv;
	//   29   70:getstatic       #10  <Field int zzaUv>
	//   30   73:ireturn         
	}

	private static boolean zzbq(Context context)
	{
		return zzj.zzb(context.getResources()) && !zzbr(context);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method android.content.res.Resources Context.getResources()>
	//    2    4:invokestatic    #62  <Method boolean zzj.zzb(android.content.res.Resources)>
	//    3    7:ifeq            19
	//    4   10:aload_0         
	//    5   11:invokestatic    #65  <Method boolean zzbr(Context)>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private static boolean zzbr(Context context)
	{
		int i;
		try
		{
			i = ((TelephonyManager)context.getSystemService("phone")).getPhoneType();
	//    0    0:aload_0         
	//    1    1:ldc1            #69  <String "phone">
	//    2    3:invokevirtual   #73  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #75  <Class TelephonyManager>
	//    4    9:invokevirtual   #79  <Method int TelephonyManager.getPhoneType()>
	//    5   12:istore_1        
		}
	//*   6   13:iload_1         
	//*   7   14:ifeq            19
	//*   8   17:iconst_1        
	//*   9   18:ireturn         
	//*  10   19:iconst_0        
	//*  11   20:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  12   21:astore_0        
		{
			Log.wtf("Fitness", "Unable to determine type of device, assuming phone.", ((Throwable) (context)));
	//   13   22:ldc1            #81  <String "Fitness">
	//   14   24:ldc1            #83  <String "Unable to determine type of device, assuming phone.">
	//   15   26:aload_0         
	//   16   27:invokestatic    #89  <Method int Log.wtf(String, String, Throwable)>
	//   17   30:pop             
			return true;
	//   18   31:iconst_1        
	//   19   32:ireturn         
		}
		return i != 0;
	}

	private static boolean zzbs(Context context)
	{
		context = ((Context) (context.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_0        
		return ((PackageManager) (context)).hasSystemFeature("com.google.android.tv") || ((PackageManager) (context)).hasSystemFeature("android.hardware.type.television") || ((PackageManager) (context)).hasSystemFeature("android.software.leanback");
	//    3    5:aload_0         
	//    4    6:ldc1            #95  <String "com.google.android.tv">
	//    5    8:invokevirtual   #100 <Method boolean PackageManager.hasSystemFeature(String)>
	//    6   11:ifne            32
	//    7   14:aload_0         
	//    8   15:ldc1            #102 <String "android.hardware.type.television">
	//    9   17:invokevirtual   #100 <Method boolean PackageManager.hasSystemFeature(String)>
	//   10   20:ifne            32
	//   11   23:aload_0         
	//   12   24:ldc1            #104 <String "android.software.leanback">
	//   13   26:invokevirtual   #100 <Method boolean PackageManager.hasSystemFeature(String)>
	//   14   29:ifeq            34
	//   15   32:iconst_1        
	//   16   33:ireturn         
	//   17   34:iconst_0        
	//   18   35:ireturn         
	}

	private static int zzaUv = -1;

	static 
	{
	//    0    0:iconst_m1       
	//    1    1:putstatic       #10  <Field int zzaUv>
	//*   2    4:return          
	}
}
