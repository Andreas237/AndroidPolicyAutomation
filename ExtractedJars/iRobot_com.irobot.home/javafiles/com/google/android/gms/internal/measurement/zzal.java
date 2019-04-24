// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.*;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzau, zzbi, zzat, zzam, 
//			zzar, zzap, zzao, zzaq, 
//			zzcw, zzcx, zzas, zzaw, 
//			zzay, zzaz, zzcd, zzck

public final class zzal extends zzau
{

	public zzal(zzaw zzaw, zzay zzay)
	{
		super(zzaw);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzau(zzaw)>
		Preconditions.checkNotNull(((Object) (zzay)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		zzvq = new zzbi(zzaw, zzay);
	//    6   10:aload_0         
	//    7   11:new             #19  <Class zzbi>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #21  <Method void zzbi(zzaw, zzay)>
	//   12   20:putfield        #23  <Field zzbi zzvq>
	//   13   23:return          
	}

	static zzbi zza(zzal zzal1)
	{
		return zzal1.zzvq;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzbi zzvq>
	//    2    4:areturn         
	}

	final void onServiceConnected()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #33  <Method void zzk.zzaf()>
		zzvq.onServiceConnected();
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field zzbi zzvq>
	//    3    7:invokevirtual   #35  <Method void zzbi.onServiceConnected()>
	//    4   10:return          
	}

	public final void setLocalDispatchPeriod(int i)
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method void zzau.zzcl()>
		((zzat)this).zzb("setLocalDispatchPeriod (sec)", ((Object) (Integer.valueOf(i))));
	//    2    4:aload_0         
	//    3    5:ldc1            #42  <String "setLocalDispatchPeriod (sec)">
	//    4    7:iload_1         
	//    5    8:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//    6   11:invokevirtual   #54  <Method void zzat.zzb(String, Object)>
		((zzat)this).zzca().zza(((Runnable) (new zzam(this, i))));
	//    7   14:aload_0         
	//    8   15:invokevirtual   #58  <Method zzk zzat.zzca()>
	//    9   18:new             #60  <Class zzam>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:iload_1         
	//   13   24:invokespecial   #63  <Method void zzam(zzal, int)>
	//   14   27:invokevirtual   #66  <Method void zzk.zza(Runnable)>
	//   15   30:return          
	}

	public final void start()
	{
		zzvq.start();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzbi zzvq>
	//    2    4:invokevirtual   #69  <Method void zzbi.start()>
	//    3    7:return          
	}

	public final long zza(zzaz zzaz)
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method void zzau.zzcl()>
		Preconditions.checkNotNull(((Object) (zzaz)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:pop             
		zzk.zzaf();
	//    5    9:invokestatic    #33  <Method void zzk.zzaf()>
		long l = zzvq.zza(zzaz, true);
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field zzbi zzvq>
	//    8   16:aload_1         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #73  <Method long zzbi.zza(zzaz, boolean)>
	//   11   21:lstore_2        
		if(l == 0L)
	//*  12   22:lload_2         
	//*  13   23:lconst_0        
	//*  14   24:lcmp            
	//*  15   25:ifne            36
			zzvq.zzb(zzaz);
	//   16   28:aload_0         
	//   17   29:getfield        #23  <Field zzbi zzvq>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #76  <Method void zzbi.zzb(zzaz)>
		return l;
	//   20   36:lload_2         
	//   21   37:lreturn         
	}

	public final void zza(zzcd zzcd)
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method void zzau.zzcl()>
		((zzat)this).zzca().zza(((Runnable) (new zzar(this, zzcd))));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #58  <Method zzk zzat.zzca()>
	//    4    8:new             #79  <Class zzar>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #82  <Method void zzar(zzal, zzcd)>
	//    9   17:invokevirtual   #66  <Method void zzk.zza(Runnable)>
	//   10   20:return          
	}

	public final void zza(zzck zzck)
	{
		Preconditions.checkNotNull(((Object) (zzck)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		((zzau)this).zzcl();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #40  <Method void zzau.zzcl()>
		((zzat)this).zzb("Hit delivery requested", ((Object) (zzck)));
	//    5    9:aload_0         
	//    6   10:ldc1            #85  <String "Hit delivery requested">
	//    7   12:aload_1         
	//    8   13:invokevirtual   #54  <Method void zzat.zzb(String, Object)>
		((zzat)this).zzca().zza(((Runnable) (new zzap(this, zzck))));
	//    9   16:aload_0         
	//   10   17:invokevirtual   #58  <Method zzk zzat.zzca()>
	//   11   20:new             #87  <Class zzap>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokespecial   #90  <Method void zzap(zzal, zzck)>
	//   16   29:invokevirtual   #66  <Method void zzk.zza(Runnable)>
	//   17   32:return          
	}

	public final void zza(String s, Runnable runnable)
	{
		Preconditions.checkNotEmpty(s, "campaign param can't be empty");
	//    0    0:aload_1         
	//    1    1:ldc1            #93  <String "campaign param can't be empty">
	//    2    3:invokestatic    #97  <Method String Preconditions.checkNotEmpty(String, Object)>
	//    3    6:pop             
		((zzat)this).zzca().zza(((Runnable) (new zzao(this, s, runnable))));
	//    4    7:aload_0         
	//    5    8:invokevirtual   #58  <Method zzk zzat.zzca()>
	//    6   11:new             #99  <Class zzao>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:invokespecial   #102 <Method void zzao(zzal, String, Runnable)>
	//   12   21:invokevirtual   #66  <Method void zzk.zza(Runnable)>
	//   13   24:return          
	}

	protected final void zzag()
	{
		((zzau) (zzvq)).zzq();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzbi zzvq>
	//    2    4:invokevirtual   #106 <Method void zzau.zzq()>
	//    3    7:return          
	}

	public final void zzbr()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method void zzau.zzcl()>
		((zzat)this).zzca().zza(((Runnable) (new zzaq(this))));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #58  <Method zzk zzat.zzca()>
	//    4    8:new             #109 <Class zzaq>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #112 <Method void zzaq(zzal)>
	//    8   16:invokevirtual   #66  <Method void zzk.zza(Runnable)>
	//    9   19:return          
	}

	public final void zzbs()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method void zzau.zzcl()>
		Context context = ((zzat)this).getContext();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #117 <Method Context zzat.getContext()>
	//    4    8:astore_1        
		if(zzcw.zza(context) && zzcx.zze(context))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #122 <Method boolean zzcw.zza(Context)>
	//*   7   13:ifeq            55
	//*   8   16:aload_1         
	//*   9   17:invokestatic    #127 <Method boolean zzcx.zze(Context)>
	//*  10   20:ifeq            55
		{
			Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
	//   11   23:new             #129 <Class Intent>
	//   12   26:dup             
	//   13   27:ldc1            #131 <String "com.google.android.gms.analytics.ANALYTICS_DISPATCH">
	//   14   29:invokespecial   #134 <Method void Intent(String)>
	//   15   32:astore_2        
			intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
	//   16   33:aload_2         
	//   17   34:new             #136 <Class ComponentName>
	//   18   37:dup             
	//   19   38:aload_1         
	//   20   39:ldc1            #138 <String "com.google.android.gms.analytics.AnalyticsService">
	//   21   41:invokespecial   #141 <Method void ComponentName(Context, String)>
	//   22   44:invokevirtual   #145 <Method Intent Intent.setComponent(ComponentName)>
	//   23   47:pop             
			context.startService(intent);
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:invokevirtual   #151 <Method ComponentName Context.startService(Intent)>
	//   27   53:pop             
			return;
	//   28   54:return          
		} else
		{
			zza(((zzcd) (null)));
	//   29   55:aload_0         
	//   30   56:aconst_null     
	//   31   57:invokevirtual   #153 <Method void zza(zzcd)>
			return;
	//   32   60:return          
		}
	}

	public final boolean zzbt()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method void zzau.zzcl()>
		Future future = ((zzat)this).zzca().zza(((java.util.concurrent.Callable) (new zzas(this))));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #58  <Method zzk zzat.zzca()>
	//    4    8:new             #163 <Class zzas>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #164 <Method void zzas(zzal)>
	//    8   16:invokevirtual   #167 <Method Future zzk.zza(java.util.concurrent.Callable)>
	//    9   19:astore_1        
		try
		{
			future.get(4L, TimeUnit.SECONDS);
	//   10   20:aload_1         
	//   11   21:ldc2w           #168 <Long 4L>
	//   12   24:getstatic       #175 <Field TimeUnit TimeUnit.SECONDS>
	//   13   27:invokeinterface #181 <Method Object Future.get(long, TimeUnit)>
	//   14   32:pop             
		}
	//*  15   33:iconst_1        
	//*  16   34:ireturn         
	//*  17   35:astore_1        
	//*  18   36:aload_0         
	//*  19   37:ldc1            #183 <String "syncDispatchLocalHits timed out">
	//*  20   39:aload_1         
	//*  21   40:invokevirtual   #186 <Method void zzat.zzd(String, Object)>
	//*  22   43:iconst_0        
	//*  23   44:ireturn         
	//*  24   45:astore_1        
	//*  25   46:aload_0         
	//*  26   47:ldc1            #188 <String "syncDispatchLocalHits failed">
	//*  27   49:aload_1         
	//*  28   50:invokevirtual   #190 <Method void zzat.zze(String, Object)>
	//*  29   53:iconst_0        
	//*  30   54:ireturn         
		catch(InterruptedException interruptedexception)
	//*  31   55:astore_1        
		{
			((zzat)this).zzd("syncDispatchLocalHits interrupted", ((Object) (interruptedexception)));
	//   32   56:aload_0         
	//   33   57:ldc1            #192 <String "syncDispatchLocalHits interrupted">
	//   34   59:aload_1         
	//   35   60:invokevirtual   #186 <Method void zzat.zzd(String, Object)>
			return false;
	//   36   63:iconst_0        
	//   37   64:ireturn         
		}
		catch(ExecutionException executionexception)
		{
			((zzat)this).zze("syncDispatchLocalHits failed", ((Object) (executionexception)));
			return false;
		}
		catch(TimeoutException timeoutexception)
		{
			((zzat)this).zzd("syncDispatchLocalHits timed out", ((Object) (timeoutexception)));
			return false;
		}
		return true;
	}

	public final void zzbu()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method void zzau.zzcl()>
		zzk.zzaf();
	//    2    4:invokestatic    #33  <Method void zzk.zzaf()>
		zzbi zzbi1 = zzvq;
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field zzbi zzvq>
	//    5   11:astore_1        
		zzk.zzaf();
	//    6   12:invokestatic    #33  <Method void zzk.zzaf()>
		((zzau) (zzbi1)).zzcl();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #40  <Method void zzau.zzcl()>
		((zzat) (zzbi1)).zzq("Service disconnected");
	//    9   19:aload_1         
	//   10   20:ldc1            #195 <String "Service disconnected">
	//   11   22:invokevirtual   #197 <Method void zzat.zzq(String)>
	//   12   25:return          
	}

	final void zzbv()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #33  <Method void zzk.zzaf()>
		zzvq.zzbv();
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field zzbi zzvq>
	//    3    7:invokevirtual   #200 <Method void zzbi.zzbv()>
	//    4   10:return          
	}

	private final zzbi zzvq;
}
