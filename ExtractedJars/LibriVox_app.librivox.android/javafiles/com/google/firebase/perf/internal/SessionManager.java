// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.internal;

import android.content.Context;
import android.content.Intent;
import android.support.v4.a.g;
import com.google.android.gms.internal.firebase-perf.ax;
import com.google.firebase.FirebaseApp;

// Referenced classes of package com.google.firebase.perf.internal:
//			f, GaugeManager, zzt, a

public class SessionManager extends f
{

	private SessionManager()
	{
		this(GaugeManager.zzbf(), zzt.a(), a.a());
	//    0    0:aload_0         
	//    1    1:invokestatic    #32  <Method GaugeManager GaugeManager.zzbf()>
	//    2    4:invokestatic    #38  <Method zzt zzt.a()>
	//    3    7:invokestatic    #43  <Method a a.a()>
	//    4   10:invokespecial   #46  <Method void SessionManager(GaugeManager, zzt, a)>
	//    5   13:return          
	}

	private SessionManager(GaugeManager gaugemanager, zzt zzt1, a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void f()>
		zzbk = gaugemanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field GaugeManager zzbk>
		zzfw = zzt1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field zzt zzfw>
		zzcy = a1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #53  <Field a zzcy>
		zzfv = FirebaseApp.getInstance().a();
	//   11   19:aload_0         
	//   12   20:invokestatic    #59  <Method FirebaseApp FirebaseApp.getInstance()>
	//   13   23:invokevirtual   #62  <Method Context FirebaseApp.a()>
	//   14   26:putfield        #64  <Field Context zzfv>
		((f)this).zzap();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #67  <Method void f.zzap()>
	//   17   33:return          
	}

	public static SessionManager zzcn()
	{
		return zzfu;
	//    0    0:getstatic       #25  <Field SessionManager zzfu>
	//    1    3:areturn         
	}

	public static Context zzcp()
	{
		return FirebaseApp.getInstance().a();
	//    0    0:invokestatic    #59  <Method FirebaseApp FirebaseApp.getInstance()>
	//    1    3:invokevirtual   #62  <Method Context FirebaseApp.a()>
	//    2    6:areturn         
	}

	private final void zzd(ax ax1)
	{
		if(zzfw.c())
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field zzt zzfw>
	//*   2    4:invokevirtual   #76  <Method boolean zzt.c()>
	//*   3    7:ifeq            26
		{
			zzbk.zza(zzfw.b(), ax1);
	//    4   10:aload_0         
	//    5   11:getfield        #49  <Field GaugeManager zzbk>
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field zzt zzfw>
	//    8   18:invokevirtual   #80  <Method String zzt.b()>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #84  <Method void GaugeManager.zza(String, ax)>
			return;
	//   11   25:return          
		} else
		{
			zzbk.zzbg();
	//   12   26:aload_0         
	//   13   27:getfield        #49  <Field GaugeManager zzbk>
	//   14   30:invokevirtual   #87  <Method void GaugeManager.zzbg()>
			return;
	//   15   33:return          
		}
	}

	public final void zzb(ax ax1)
	{
		super.zzb(ax1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void f.zzb(ax)>
		if(zzcy.b())
	//*   3    5:aload_0         
	//*   4    6:getfield        #53  <Field a zzcy>
	//*   5    9:invokevirtual   #92  <Method boolean a.b()>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		if(ax1 == ax.b)
	//*   8   16:aload_1         
	//*   9   17:getstatic       #97  <Field ax ax.b>
	//*  10   20:if_acmpne       29
		{
			zzc(ax1);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #100 <Method void zzc(ax)>
			return;
	//   14   28:return          
		}
		if(!zzcq())
	//*  15   29:aload_0         
	//*  16   30:invokevirtual   #103 <Method boolean zzcq()>
	//*  17   33:ifne            41
			zzd(ax1);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokespecial   #105 <Method void zzd(ax)>
	//   21   41:return          
	}

	public final void zzc(ax ax1)
	{
		zzfw = zzt.a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #38  <Method zzt zzt.a()>
	//    2    4:putfield        #51  <Field zzt zzfw>
		Intent intent = new Intent("SessionIdUpdate");
	//    3    7:new             #107 <Class Intent>
	//    4   10:dup             
	//    5   11:ldc1            #109 <String "SessionIdUpdate">
	//    6   13:invokespecial   #112 <Method void Intent(String)>
	//    7   16:astore_2        
		g.a(zzfv).a(intent);
	//    8   17:aload_0         
	//    9   18:getfield        #64  <Field Context zzfv>
	//   10   21:invokestatic    #117 <Method g g.a(Context)>
	//   11   24:aload_2         
	//   12   25:invokevirtual   #120 <Method boolean g.a(Intent)>
	//   13   28:pop             
		if(zzfw.c())
	//*  14   29:aload_0         
	//*  15   30:getfield        #51  <Field zzt zzfw>
	//*  16   33:invokevirtual   #76  <Method boolean zzt.c()>
	//*  17   36:ifeq            54
			zzbk.zzc(zzfw.b(), ax1);
	//   18   39:aload_0         
	//   19   40:getfield        #49  <Field GaugeManager zzbk>
	//   20   43:aload_0         
	//   21   44:getfield        #51  <Field zzt zzfw>
	//   22   47:invokevirtual   #80  <Method String zzt.b()>
	//   23   50:aload_1         
	//   24   51:invokevirtual   #122 <Method void GaugeManager.zzc(String, ax)>
		zzd(ax1);
	//   25   54:aload_0         
	//   26   55:aload_1         
	//   27   56:invokespecial   #105 <Method void zzd(ax)>
	//   28   59:return          
	}

	public final zzt zzco()
	{
		return zzfw;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzt zzfw>
	//    2    4:areturn         
	}

	final boolean zzcq()
	{
		if(zzfw.d())
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field zzt zzfw>
	//*   2    4:invokevirtual   #126 <Method boolean zzt.d()>
	//*   3    7:ifeq            23
		{
			zzc(zzcy.c());
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field a zzcy>
	//    7   15:invokevirtual   #129 <Method ax a.c()>
	//    8   18:invokevirtual   #100 <Method void zzc(ax)>
			return true;
	//    9   21:iconst_1        
	//   10   22:ireturn         
		} else
		{
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		}
	}

	private static final SessionManager zzfu = new SessionManager();
	private final GaugeManager zzbk;
	private final a zzcy;
	private final Context zzfv;
	private zzt zzfw;

	static 
	{
	//    0    0:new             #2   <Class SessionManager>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void SessionManager()>
	//    3    7:putstatic       #25  <Field SessionManager zzfu>
	//*   4   10:return          
	}
}
