// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaj, zzaxn

private class zzaaj$zze
	implements com.google.android.gms.common.api.lient.ConnectionCallbacks, com.google.android.gms.common.api.lient.OnConnectionFailedListener
{

	public void onConnected(Bundle bundle)
	{
		zzaaj.zzf(zzaAa).zza(((zzaxu) (new zzaaj$zzd(zzaAa))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaaj zzaAa>
	//    2    4:invokestatic    #30  <Method zzaxn zzaaj.zzf(zzaaj)>
	//    3    7:new             #32  <Class zzaaj$zzd>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field zzaaj zzaAa>
	//    7   15:invokespecial   #33  <Method void zzaaj$zzd(zzaaj)>
	//    8   18:invokeinterface #39  <Method void zzaxn.zza(zzaxu)>
	//    9   23:return          
	}

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzaaj.zzc(zzaAa).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaaj zzaAa>
	//    2    4:invokestatic    #46  <Method Lock zzaaj.zzc(zzaaj)>
	//    3    7:invokeinterface #51  <Method void Lock.lock()>
		if(!zzaaj.zzb(zzaAa, connectionresult)) goto _L2; else goto _L1
	//    4   12:aload_0         
	//    5   13:getfield        #17  <Field zzaaj zzaAa>
	//    6   16:aload_1         
	//    7   17:invokestatic    #55  <Method boolean zzaaj.zzb(zzaaj, ConnectionResult)>
	//    8   20:ifeq            50
_L1:
		zzaaj.zzi(zzaAa);
	//    9   23:aload_0         
	//   10   24:getfield        #17  <Field zzaaj zzaAa>
	//   11   27:invokestatic    #58  <Method void zzaaj.zzi(zzaaj)>
		zzaaj.zzj(zzaAa);
	//   12   30:aload_0         
	//   13   31:getfield        #17  <Field zzaaj zzaAa>
	//   14   34:invokestatic    #61  <Method void zzaaj.zzj(zzaaj)>
_L4:
		zzaaj.zzc(zzaAa).unlock();
	//   15   37:aload_0         
	//   16   38:getfield        #17  <Field zzaaj zzaAa>
	//   17   41:invokestatic    #46  <Method Lock zzaaj.zzc(zzaaj)>
	//   18   44:invokeinterface #64  <Method void Lock.unlock()>
		return;
	//   19   49:return          
_L2:
		zzaaj.zza(zzaAa, connectionresult);
	//   20   50:aload_0         
	//   21   51:getfield        #17  <Field zzaaj zzaAa>
	//   22   54:aload_1         
	//   23   55:invokestatic    #67  <Method void zzaaj.zza(zzaaj, ConnectionResult)>
		if(true) goto _L4; else goto _L3
	//   24   58:goto            37
_L3:
		connectionresult;
	//   25   61:astore_1        
		zzaaj.zzc(zzaAa).unlock();
	//   26   62:aload_0         
	//   27   63:getfield        #17  <Field zzaaj zzaAa>
	//   28   66:invokestatic    #46  <Method Lock zzaaj.zzc(zzaaj)>
	//   29   69:invokeinterface #64  <Method void Lock.unlock()>
		throw connectionresult;
	//   30   74:aload_1         
	//   31   75:athrow          
	}

	public void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	final zzaaj zzaAa;

	private zzaaj$zze(zzaaj zzaaj1)
	{
		zzaAa = zzaaj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzaaj zzaAa>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	zzaaj$zze(zzaaj zzaaj1, zzaaj._cls1 _pcls1)
	{
		this(zzaaj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void zzaaj$zze(zzaaj)>
	//    3    5:return          
	}
}
