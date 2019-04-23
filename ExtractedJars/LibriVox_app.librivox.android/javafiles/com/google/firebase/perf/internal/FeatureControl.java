// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.internal;

import android.util.Log;
import com.google.android.gms.internal.firebase-perf.aa;
import com.google.android.gms.internal.firebase-perf.h;
import com.google.firebase.perf.a;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.firebase.perf.internal:
//			RemoteConfigManager

public class FeatureControl
{

	private FeatureControl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #40  <Method RemoteConfigManager RemoteConfigManager.zzcb()>
	//    4    8:putfield        #42  <Field RemoteConfigManager zzck>
		a a1 = a.a();
	//    5   11:invokestatic    #48  <Method a a.a()>
	//    6   14:astore_1        
		if(a1 == null)
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       39
		{
			Log.d("FirebasePerformance", "Firebase Performance not initialized in time for FeatureControl to use.");
	//    9   19:ldc1            #50  <String "FirebasePerformance">
	//   10   21:ldc1            #52  <String "Firebase Performance not initialized in time for FeatureControl to use.">
	//   11   23:invokestatic    #58  <Method int Log.d(String, String)>
	//   12   26:pop             
			zzcl = new aa();
	//   13   27:aload_0         
	//   14   28:new             #60  <Class aa>
	//   15   31:dup             
	//   16   32:invokespecial   #61  <Method void aa()>
	//   17   35:putfield        #63  <Field aa zzcl>
			return;
	//   18   38:return          
		} else
		{
			zzcl = a1.d();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #66  <Method aa a.d()>
	//   22   44:putfield        #63  <Field aa zzcl>
			return;
	//   23   47:return          
		}
	}

	public static FeatureControl zzar()
	{
		com/google/firebase/perf/internal/FeatureControl;
	//    0    0:ldc1            #2   <Class FeatureControl>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		FeatureControl featurecontrol;
		if(zzcj == null)
	//*   2    3:getstatic       #70  <Field FeatureControl zzcj>
	//*   3    6:ifnonnull       19
			zzcj = new FeatureControl();
	//    4    9:new             #2   <Class FeatureControl>
	//    5   12:dup             
	//    6   13:invokespecial   #71  <Method void FeatureControl()>
	//    7   16:putstatic       #70  <Field FeatureControl zzcj>
		featurecontrol = zzcj;
	//    8   19:getstatic       #70  <Field FeatureControl zzcj>
	//    9   22:astore_0        
		com/google/firebase/perf/internal/FeatureControl;
	//   10   23:ldc1            #2   <Class FeatureControl>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return featurecontrol;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class FeatureControl>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	private final long zzb(String s, long l)
	{
		int i = h.a(zzck.zzc(s, l));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field RemoteConfigManager zzck>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #76  <Method long RemoteConfigManager.zzc(String, long)>
	//    5    9:invokestatic    #81  <Method int h.a(long)>
	//    6   12:istore          4
		i = zzcl.a(s, i);
	//    7   14:aload_0         
	//    8   15:getfield        #63  <Field aa zzcl>
	//    9   18:aload_1         
	//   10   19:iload           4
	//   11   21:invokevirtual   #84  <Method int aa.a(String, int)>
	//   12   24:istore          4
		if(i != 0x7fffffff)
	//*  13   26:iload           4
	//*  14   28:ldc1            #85  <Int 0x7fffffff>
	//*  15   30:icmpeq          46
		{
			if(i == 0x80000000)
	//*  16   33:iload           4
	//*  17   35:ldc1            #86  <Int 0x80000000>
	//*  18   37:icmpne          42
				return l;
	//   19   40:lload_2         
	//   20   41:lreturn         
			else
				return (long)i;
	//   21   42:iload           4
	//   22   44:i2l             
	//   23   45:lreturn         
		} else
		{
			return l;
	//   24   46:lload_2         
	//   25   47:lreturn         
		}
	}

	public final boolean zzas()
	{
		return zzb("sessions_feature_enabled", 1L) != 0L;
	//    0    0:aload_0         
	//    1    1:ldc1            #90  <String "sessions_feature_enabled">
	//    2    3:lconst_1        
	//    3    4:invokespecial   #92  <Method long zzb(String, long)>
	//    4    7:lconst_0        
	//    5    8:lcmp            
	//    6    9:ifeq            14
	//    7   12:iconst_1        
	//    8   13:ireturn         
	//    9   14:iconst_0        
	//   10   15:ireturn         
	}

	public final boolean zzat()
	{
		return zzb("sessions_cpu_capture_enabled", 1L) != 0L;
	//    0    0:aload_0         
	//    1    1:ldc1            #95  <String "sessions_cpu_capture_enabled">
	//    2    3:lconst_1        
	//    3    4:invokespecial   #92  <Method long zzb(String, long)>
	//    4    7:lconst_0        
	//    5    8:lcmp            
	//    6    9:ifeq            14
	//    7   12:iconst_1        
	//    8   13:ireturn         
	//    9   14:iconst_0        
	//   10   15:ireturn         
	}

	public final boolean zzau()
	{
		return zzb("sessions_memory_capture_enabled", 1L) != 0L;
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "sessions_memory_capture_enabled">
	//    2    3:lconst_1        
	//    3    4:invokespecial   #92  <Method long zzb(String, long)>
	//    4    7:lconst_0        
	//    5    8:lcmp            
	//    6    9:ifeq            14
	//    7   12:iconst_1        
	//    8   13:ireturn         
	//    9   14:iconst_0        
	//   10   15:ireturn         
	}

	public final float zzav()
	{
		float f = zzck.zza("sessions_sampling_percentage", 1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field RemoteConfigManager zzck>
	//    2    4:ldc1            #102 <String "sessions_sampling_percentage">
	//    3    6:fconst_1        
	//    4    7:invokevirtual   #106 <Method float RemoteConfigManager.zza(String, float)>
	//    5   10:fstore_1        
		return zzcl.a("sessions_sampling_percentage", f);
	//    6   11:aload_0         
	//    7   12:getfield        #63  <Field aa zzcl>
	//    8   15:ldc1            #102 <String "sessions_sampling_percentage">
	//    9   17:fload_1         
	//   10   18:invokevirtual   #108 <Method float aa.a(String, float)>
	//   11   21:freturn         
	}

	public final long zzaw()
	{
		return zzb("sessions_cpu_capture_frequency_fg_ms", 100L);
	//    0    0:aload_0         
	//    1    1:ldc1            #112 <String "sessions_cpu_capture_frequency_fg_ms">
	//    2    3:ldc2w           #113 <Long 100L>
	//    3    6:invokespecial   #92  <Method long zzb(String, long)>
	//    4    9:lreturn         
	}

	public final long zzax()
	{
		return zzb("sessions_memory_capture_frequency_fg_ms", 100L);
	//    0    0:aload_0         
	//    1    1:ldc1            #117 <String "sessions_memory_capture_frequency_fg_ms">
	//    2    3:ldc2w           #113 <Long 100L>
	//    3    6:invokespecial   #92  <Method long zzb(String, long)>
	//    4    9:lreturn         
	}

	public final long zzay()
	{
		return zzb("sessions_cpu_capture_frequency_bg_ms", 0L);
	//    0    0:aload_0         
	//    1    1:ldc1            #120 <String "sessions_cpu_capture_frequency_bg_ms">
	//    2    3:lconst_0        
	//    3    4:invokespecial   #92  <Method long zzb(String, long)>
	//    4    7:lreturn         
	}

	public final long zzaz()
	{
		return zzb("sessions_memory_capture_frequency_bg_ms", 0L);
	//    0    0:aload_0         
	//    1    1:ldc1            #123 <String "sessions_memory_capture_frequency_bg_ms">
	//    2    3:lconst_0        
	//    3    4:invokespecial   #92  <Method long zzb(String, long)>
	//    4    7:lreturn         
	}

	public final long zzba()
	{
		return zzb("sessions_max_length_minutes", zzcm);
	//    0    0:aload_0         
	//    1    1:ldc1            #126 <String "sessions_max_length_minutes">
	//    2    3:getstatic       #30  <Field long zzcm>
	//    3    6:invokespecial   #92  <Method long zzb(String, long)>
	//    4    9:lreturn         
	}

	private static FeatureControl zzcj;
	private static final long zzcm;
	private final RemoteConfigManager zzck = RemoteConfigManager.zzcb();
	private final aa zzcl;

	static 
	{
		zzcm = TimeUnit.HOURS.toMinutes(4L);
	//    0    0:getstatic       #22  <Field TimeUnit TimeUnit.HOURS>
	//    1    3:ldc2w           #23  <Long 4L>
	//    2    6:invokevirtual   #28  <Method long TimeUnit.toMinutes(long)>
	//    3    9:putstatic       #30  <Field long zzcm>
	//*   4   12:return          
	}
}
