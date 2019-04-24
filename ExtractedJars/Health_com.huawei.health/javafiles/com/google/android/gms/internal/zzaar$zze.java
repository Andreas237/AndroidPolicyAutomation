// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaar, zzbai

class zzaar$zze
	implements com.google.android.gms.common.api.lient.ConnectionCallbacks, com.google.android.gms.common.api.lient.OnConnectionFailedListener
{

	public void onConnected(Bundle bundle)
	{
		zzaar.zzf(zzaBA).zza(((zzbap) (new zzaar$zzd(zzaBA))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaar zzaBA>
	//    2    4:invokestatic    #30  <Method zzbai zzaar.zzf(zzaar)>
	//    3    7:new             #32  <Class zzaar$zzd>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field zzaar zzaBA>
	//    7   15:invokespecial   #33  <Method void zzaar$zzd(zzaar)>
	//    8   18:invokeinterface #39  <Method void zzbai.zza(zzbap)>
	//    9   23:return          
	}

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzaar.zzc(zzaBA).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaar zzaBA>
	//    2    4:invokestatic    #46  <Method Lock zzaar.zzc(zzaar)>
	//    3    7:invokeinterface #51  <Method void Lock.lock()>
		if(zzaar.zzb(zzaBA, connectionresult))
	//*   4   12:aload_0         
	//*   5   13:getfield        #17  <Field zzaar zzaBA>
	//*   6   16:aload_1         
	//*   7   17:invokestatic    #55  <Method boolean zzaar.zzb(zzaar, ConnectionResult)>
	//*   8   20:ifeq            40
		{
			zzaar.zzi(zzaBA);
	//    9   23:aload_0         
	//   10   24:getfield        #17  <Field zzaar zzaBA>
	//   11   27:invokestatic    #58  <Method void zzaar.zzi(zzaar)>
			zzaar.zzj(zzaBA);
	//   12   30:aload_0         
	//   13   31:getfield        #17  <Field zzaar zzaBA>
	//   14   34:invokestatic    #61  <Method void zzaar.zzj(zzaar)>
			break MISSING_BLOCK_LABEL_48;
	//   15   37:goto            48
		}
		zzaar.zza(zzaBA, connectionresult);
	//   16   40:aload_0         
	//   17   41:getfield        #17  <Field zzaar zzaBA>
	//   18   44:aload_1         
	//   19   45:invokestatic    #64  <Method void zzaar.zza(zzaar, ConnectionResult)>
		zzaar.zzc(zzaBA).unlock();
	//   20   48:aload_0         
	//   21   49:getfield        #17  <Field zzaar zzaBA>
	//   22   52:invokestatic    #46  <Method Lock zzaar.zzc(zzaar)>
	//   23   55:invokeinterface #67  <Method void Lock.unlock()>
		return;
	//   24   60:return          
		connectionresult;
	//   25   61:astore_1        
		zzaar.zzc(zzaBA).unlock();
	//   26   62:aload_0         
	//   27   63:getfield        #17  <Field zzaar zzaBA>
	//   28   66:invokestatic    #46  <Method Lock zzaar.zzc(zzaar)>
	//   29   69:invokeinterface #67  <Method void Lock.unlock()>
		throw connectionresult;
	//   30   74:aload_1         
	//   31   75:athrow          
	}

	public void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	final zzaar zzaBA;

	private zzaar$zze(zzaar zzaar1)
	{
		zzaBA = zzaar1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzaar zzaBA>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	zzaar$zze(zzaar zzaar1, zzaar._cls1 _pcls1)
	{
		this(zzaar1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void zzaar$zze(zzaar)>
	//    3    5:return          
	}
}
