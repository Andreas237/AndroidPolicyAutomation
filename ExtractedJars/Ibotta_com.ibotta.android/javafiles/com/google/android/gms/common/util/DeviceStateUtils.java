// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.*;
import android.media.AudioManager;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.gms.internal.stable.zzg;

// Referenced classes of package com.google.android.gms.common.util:
//			PlatformVersion

public final class DeviceStateUtils
{

	private DeviceStateUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static int getDeviceState(Context context)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #35  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #37  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #40  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static float getPowerPercentage(Context context)
	{
		com/google/android/gms/common/util/DeviceStateUtils;
	//    0    0:ldc1            #2   <Class DeviceStateUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		float f;
		if(SystemClock.elapsedRealtime() - zzzw >= 60000L || Float.isNaN(zzzx))
			break MISSING_BLOCK_LABEL_35;
	//    2    3:invokestatic    #49  <Method long SystemClock.elapsedRealtime()>
	//    3    6:getstatic       #51  <Field long zzzw>
	//    4    9:lsub            
	//    5   10:ldc2w           #52  <Long 60000L>
	//    6   13:lcmp            
	//    7   14:ifge            35
	//    8   17:getstatic       #25  <Field float zzzx>
	//    9   20:invokestatic    #59  <Method boolean Float.isNaN(float)>
	//   10   23:ifne            35
		f = zzzx;
	//   11   26:getstatic       #25  <Field float zzzx>
	//   12   29:fstore_1        
		com/google/android/gms/common/util/DeviceStateUtils;
	//   13   30:ldc1            #2   <Class DeviceStateUtils>
		JVM INSTR monitorexit ;
	//   14   32:monitorexit     
		return f;
	//   15   33:fload_1         
	//   16   34:freturn         
		context = ((Context) (context.getApplicationContext().registerReceiver(((android.content.BroadcastReceiver) (null)), filter)));
	//   17   35:aload_0         
	//   18   36:invokevirtual   #65  <Method Context Context.getApplicationContext()>
	//   19   39:aconst_null     
	//   20   40:getstatic       #22  <Field IntentFilter filter>
	//   21   43:invokevirtual   #69  <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   22   46:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_75;
	//   23   47:aload_0         
	//   24   48:ifnull          75
		int i = ((Intent) (context)).getIntExtra("level", -1);
	//   25   51:aload_0         
	//   26   52:ldc1            #71  <String "level">
	//   27   54:iconst_m1       
	//   28   55:invokevirtual   #77  <Method int Intent.getIntExtra(String, int)>
	//   29   58:istore_2        
		int j = ((Intent) (context)).getIntExtra("scale", -1);
	//   30   59:aload_0         
	//   31   60:ldc1            #79  <String "scale">
	//   32   62:iconst_m1       
	//   33   63:invokevirtual   #77  <Method int Intent.getIntExtra(String, int)>
	//   34   66:istore_3        
		zzzx = (float)i / (float)j;
	//   35   67:iload_2         
	//   36   68:i2f             
	//   37   69:iload_3         
	//   38   70:i2f             
	//   39   71:fdiv            
	//   40   72:putstatic       #25  <Field float zzzx>
		zzzw = SystemClock.elapsedRealtime();
	//   41   75:invokestatic    #49  <Method long SystemClock.elapsedRealtime()>
	//   42   78:putstatic       #51  <Field long zzzw>
		f = zzzx;
	//   43   81:getstatic       #25  <Field float zzzx>
	//   44   84:fstore_1        
		com/google/android/gms/common/util/DeviceStateUtils;
	//   45   85:ldc1            #2   <Class DeviceStateUtils>
		JVM INSTR monitorexit ;
	//   46   87:monitorexit     
		return f;
	//   47   88:fload_1         
	//   48   89:freturn         
		context;
	//   49   90:astore_0        
	//*  50   91:ldc1            #2   <Class DeviceStateUtils>
		throw context;
	//   51   93:monitorexit     
	//   52   94:aload_0         
	//   53   95:athrow          
	}

	public static boolean hasConsentedNlp(Context context)
	{
		return zzg.getInt(context.getContentResolver(), "network_location_opt_in", -1) == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    4:ldc1            #87  <String "network_location_opt_in">
	//    3    6:iconst_m1       
	//    4    7:invokestatic    #93  <Method int zzg.getInt(android.content.ContentResolver, String, int)>
	//    5   10:iconst_1        
	//    6   11:icmpne          16
	//    7   14:iconst_1        
	//    8   15:ireturn         
	//    9   16:iconst_0        
	//   10   17:ireturn         
	}

	public static boolean isCallActive(Context context)
	{
		return ((AudioManager)context.getSystemService("audio")).getMode() == 2;
	//    0    0:aload_0         
	//    1    1:ldc1            #96  <String "audio">
	//    2    3:invokevirtual   #100 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #102 <Class AudioManager>
	//    4    9:invokevirtual   #106 <Method int AudioManager.getMode()>
	//    5   12:iconst_2        
	//    6   13:icmpne          18
	//    7   16:iconst_1        
	//    8   17:ireturn         
	//    9   18:iconst_0        
	//   10   19:ireturn         
	}

	public static boolean isInteractive(Context context)
	{
		return isInteractive((PowerManager)context.getSystemService("power"));
	//    0    0:aload_0         
	//    1    1:ldc1            #109 <String "power">
	//    2    3:invokevirtual   #100 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #111 <Class PowerManager>
	//    4    9:invokestatic    #114 <Method boolean isInteractive(PowerManager)>
	//    5   12:ireturn         
	}

	public static boolean isInteractive(PowerManager powermanager)
	{
		if(PlatformVersion.isAtLeastKitKatWatch())
	//*   0    0:invokestatic    #120 <Method boolean PlatformVersion.isAtLeastKitKatWatch()>
	//*   1    3:ifeq            11
			return powermanager.isInteractive();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #122 <Method boolean PowerManager.isInteractive()>
	//    4   10:ireturn         
		else
			return powermanager.isScreenOn();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #125 <Method boolean PowerManager.isScreenOn()>
	//    7   15:ireturn         
	}

	public static boolean isUserSetupComplete(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #132 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          26
			return android.provider.Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", -1) == 1;
	//    3    8:aload_0         
	//    4    9:invokevirtual   #85  <Method android.content.ContentResolver Context.getContentResolver()>
	//    5   12:ldc1            #134 <String "user_setup_complete">
	//    6   14:iconst_m1       
	//    7   15:invokestatic    #137 <Method int android.provider.Settings$Secure.getInt(android.content.ContentResolver, String, int)>
	//    8   18:iconst_1        
	//    9   19:icmpne          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
		else
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	public static void resetForTest()
	{
		com/google/android/gms/common/util/DeviceStateUtils;
	//    0    0:ldc1            #2   <Class DeviceStateUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzzw = 0L;
	//    2    3:lconst_0        
	//    3    4:putstatic       #51  <Field long zzzw>
		zzzx = (0.0F / 0.0F);
	//    4    7:ldc1            #23  <Float (0.0F / 0.0F)>
	//    5    9:putstatic       #25  <Field float zzzx>
		com/google/android/gms/common/util/DeviceStateUtils;
	//    6   12:ldc1            #2   <Class DeviceStateUtils>
		JVM INSTR monitorexit ;
	//    7   14:monitorexit     
		return;
	//    8   15:return          
		Exception exception;
		exception;
	//    9   16:astore_0        
	//*  10   17:ldc1            #2   <Class DeviceStateUtils>
		throw exception;
	//   11   19:monitorexit     
	//   12   20:aload_0         
	//   13   21:athrow          
	}

	private static final IntentFilter filter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
	private static long zzzw;
	private static float zzzx = (0.0F / 0.0F);

	static 
	{
	//    0    0:new             #14  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "android.intent.action.BATTERY_CHANGED">
	//    3    6:invokespecial   #20  <Method void IntentFilter(String)>
	//    4    9:putstatic       #22  <Field IntentFilter filter>
	//    5   12:ldc1            #23  <Float (0.0F / 0.0F)>
	//    6   14:putstatic       #25  <Field float zzzx>
	//*   7   17:return          
	}
}
