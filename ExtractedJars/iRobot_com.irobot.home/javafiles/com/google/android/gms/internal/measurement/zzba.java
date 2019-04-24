// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzau, zzdc, zzaw, zzbc, 
//			zzbb, zzat, zzal, zzcf, 
//			zzcg, zzbz, zzck, zzbx, 
//			zzcl

public final class zzba extends zzau
{

	protected zzba(zzaw zzaw1)
	{
		super(zzaw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void zzau(zzaw)>
		zzwz = new zzdc(zzaw1.zzbx());
	//    3    5:aload_0         
	//    4    6:new             #19  <Class zzdc>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokevirtual   #25  <Method com.google.android.gms.common.util.Clock zzaw.zzbx()>
	//    8   14:invokespecial   #28  <Method void zzdc(com.google.android.gms.common.util.Clock)>
	//    9   17:putfield        #30  <Field zzdc zzwz>
	//   10   20:aload_0         
	//   11   21:new             #32  <Class zzbc>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #35  <Method void zzbc(zzba)>
	//   15   29:putfield        #37  <Field zzbc zzww>
		zzwy = ((zzbz) (new zzbb(this, zzaw1)));
	//   16   32:aload_0         
	//   17   33:new             #39  <Class zzbb>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #42  <Method void zzbb(zzba, zzaw)>
	//   22   42:putfield        #44  <Field zzbz zzwy>
	//   23   45:return          
	}

	private final void onServiceDisconnected(ComponentName componentname)
	{
		zzk.zzaf();
	//    0    0:invokestatic    #53  <Method void zzk.zzaf()>
		if(zzwx != null)
	//*   1    3:aload_0         
	//*   2    4:getfield        #55  <Field zzcl zzwx>
	//*   3    7:ifnull          29
		{
			zzwx = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #55  <Field zzcl zzwx>
			((zzat)this).zza("Disconnected from device AnalyticsService", ((Object) (componentname)));
	//    7   15:aload_0         
	//    8   16:ldc1            #57  <String "Disconnected from device AnalyticsService">
	//    9   18:aload_1         
	//   10   19:invokevirtual   #63  <Method void zzat.zza(String, Object)>
			((zzat)this).zzcc().zzbu();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #67  <Method zzal zzat.zzcc()>
	//   13   26:invokevirtual   #72  <Method void zzal.zzbu()>
		}
	//   14   29:return          
	}

	static zzbc zza(zzba zzba1)
	{
		return zzba1.zzww;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field zzbc zzww>
	//    2    4:areturn         
	}

	static void zza(zzba zzba1, ComponentName componentname)
	{
		zzba1.onServiceDisconnected(componentname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void onServiceDisconnected(ComponentName)>
	//    3    5:return          
	}

	static void zza(zzba zzba1, zzcl zzcl1)
	{
		zzba1.zza(zzcl1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void zza(zzcl)>
	//    3    5:return          
	}

	private final void zza(zzcl zzcl1)
	{
		zzk.zzaf();
	//    0    0:invokestatic    #53  <Method void zzk.zzaf()>
		zzwx = zzcl1;
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:putfield        #55  <Field zzcl zzwx>
		zzcy();
	//    4    8:aload_0         
	//    5    9:invokespecial   #83  <Method void zzcy()>
		((zzat)this).zzcc().onServiceConnected();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #67  <Method zzal zzat.zzcc()>
	//    8   16:invokevirtual   #86  <Method void zzal.onServiceConnected()>
	//    9   19:return          
	}

	static void zzb(zzba zzba1)
	{
		zzba1.zzcz();
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method void zzcz()>
	//    2    4:return          
	}

	private final void zzcy()
	{
		zzwz.start();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field zzdc zzwz>
	//    2    4:invokevirtual   #93  <Method void zzdc.start()>
		zzwy.zzh(((Long)zzcf.zzaaf.get()).longValue());
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field zzbz zzwy>
	//    5   11:getstatic       #99  <Field zzcg zzcf.zzaaf>
	//    6   14:invokevirtual   #105 <Method Object zzcg.get()>
	//    7   17:checkcast       #107 <Class Long>
	//    8   20:invokevirtual   #111 <Method long Long.longValue()>
	//    9   23:invokevirtual   #117 <Method void zzbz.zzh(long)>
	//   10   26:return          
	}

	private final void zzcz()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #53  <Method void zzk.zzaf()>
		if(!isConnected())
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #121 <Method boolean isConnected()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			((zzat)this).zzq("Inactivity, disconnecting from device AnalyticsService");
	//    5   11:aload_0         
	//    6   12:ldc1            #123 <String "Inactivity, disconnecting from device AnalyticsService">
	//    7   14:invokevirtual   #127 <Method void zzat.zzq(String)>
			disconnect();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #130 <Method void disconnect()>
			return;
	//   10   21:return          
		}
	}

	public final boolean connect()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #53  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #134 <Method void zzau.zzcl()>
		if(zzwx != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #55  <Field zzcl zzwx>
	//*   5   11:ifnull          16
			return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		zzcl zzcl1 = zzww.zzda();
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field zzbc zzww>
	//   10   20:invokevirtual   #138 <Method zzcl zzbc.zzda()>
	//   11   23:astore_1        
		if(zzcl1 != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          39
		{
			zzwx = zzcl1;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #55  <Field zzcl zzwx>
			zzcy();
	//   17   33:aload_0         
	//   18   34:invokespecial   #83  <Method void zzcy()>
			return true;
	//   19   37:iconst_1        
	//   20   38:ireturn         
		} else
		{
			return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
		}
	}

	public final void disconnect()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #53  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #134 <Method void zzau.zzcl()>
		try
		{
			ConnectionTracker.getInstance().unbindService(((zzat)this).getContext(), ((android.content.ServiceConnection) (zzww)));
	//    3    7:invokestatic    #148 <Method ConnectionTracker ConnectionTracker.getInstance()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #152 <Method android.content.Context zzat.getContext()>
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field zzbc zzww>
	//    8   18:invokevirtual   #156 <Method void ConnectionTracker.unbindService(android.content.Context, android.content.ServiceConnection)>
		}
	//*   9   21:aload_0         
	//*  10   22:getfield        #55  <Field zzcl zzwx>
	//*  11   25:ifnull          40
	//*  12   28:aload_0         
	//*  13   29:aconst_null     
	//*  14   30:putfield        #55  <Field zzcl zzwx>
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #67  <Method zzal zzat.zzcc()>
	//*  17   37:invokevirtual   #72  <Method void zzal.zzbu()>
	//*  18   40:return          
		catch(Object obj) { }
	//   19   41:astore_1        
		if(zzwx != null)
		{
			zzwx = null;
			((zzat)this).zzcc().zzbu();
		}
		return;
	//*  20   42:goto            21
	}

	public final boolean isConnected()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #53  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #134 <Method void zzau.zzcl()>
		return zzwx != null;
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field zzcl zzwx>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected final void zzag()
	{
	//    0    0:return          
	}

	public final boolean zzb(zzck zzck1)
	{
		Preconditions.checkNotNull(((Object) (zzck1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		zzk.zzaf();
	//    3    5:invokestatic    #53  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #134 <Method void zzau.zzcl()>
		zzcl zzcl1 = zzwx;
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field zzcl zzwx>
	//    8   16:astore_3        
		if(zzcl1 == null)
	//*   9   17:aload_3         
	//*  10   18:ifnonnull       23
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		String s;
		if(zzck1.zzet())
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #171 <Method boolean zzck.zzet()>
	//*  15   27:ifeq            37
			s = zzbx.zzed();
	//   16   30:invokestatic    #177 <Method String zzbx.zzed()>
	//   17   33:astore_2        
		else
	//*  18   34:goto            44
			s = zzbx.zzee();
	//   19   37:invokestatic    #180 <Method String zzbx.zzee()>
	//   20   40:astore_2        
	//*  21   41:goto            34
		java.util.List list = Collections.emptyList();
	//   22   44:invokestatic    #186 <Method java.util.List Collections.emptyList()>
	//   23   47:astore          4
		try
		{
			zzcl1.zza(zzck1.zzcw(), zzck1.zzer(), s, list);
	//   24   49:aload_3         
	//   25   50:aload_1         
	//   26   51:invokevirtual   #190 <Method java.util.Map zzck.zzcw()>
	//   27   54:aload_1         
	//   28   55:invokevirtual   #193 <Method long zzck.zzer()>
	//   29   58:aload_2         
	//   30   59:aload           4
	//   31   61:invokeinterface #198 <Method void zzcl.zza(java.util.Map, long, String, java.util.List)>
			zzcy();
	//   32   66:aload_0         
	//   33   67:invokespecial   #83  <Method void zzcy()>
		}
	//*  34   70:iconst_1        
	//*  35   71:ireturn         
	//*  36   72:aload_0         
	//*  37   73:ldc1            #200 <String "Failed to send hits to AnalyticsService">
	//*  38   75:invokevirtual   #127 <Method void zzat.zzq(String)>
	//*  39   78:iconst_0        
	//*  40   79:ireturn         
		// Misplaced declaration of an exception variable
		catch(zzck zzck1)
		{
			((zzat)this).zzq("Failed to send hits to AnalyticsService");
			return false;
		}
		return true;
	//*  41   80:astore_1        
	//*  42   81:goto            72
	}

	public final boolean zzcx()
	{
		RemoteException remoteexception;
		zzk.zzaf();
	//    0    0:invokestatic    #53  <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #134 <Method void zzau.zzcl()>
		zzcl zzcl1 = zzwx;
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field zzcl zzwx>
	//    5   11:astore_1        
		if(zzcl1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		try
		{
			zzcl1.zzbr();
	//   10   18:aload_1         
	//   11   19:invokeinterface #204 <Method void zzcl.zzbr()>
			zzcy();
	//   12   24:aload_0         
	//   13   25:invokespecial   #83  <Method void zzcy()>
		}
	//*  14   28:iconst_1        
	//*  15   29:ireturn         
	//*  16   30:aload_0         
	//*  17   31:ldc1            #206 <String "Failed to clear hits from AnalyticsService">
	//*  18   33:invokevirtual   #127 <Method void zzat.zzq(String)>
	//*  19   36:iconst_0        
	//*  20   37:ireturn         
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			((zzat)this).zzq("Failed to clear hits from AnalyticsService");
			return false;
		}
		return true;
	//*  21   38:astore_1        
	//*  22   39:goto            30
	}

	private final zzbc zzww = new zzbc(this);
	private zzcl zzwx;
	private final zzbz zzwy;
	private final zzdc zzwz;
}
