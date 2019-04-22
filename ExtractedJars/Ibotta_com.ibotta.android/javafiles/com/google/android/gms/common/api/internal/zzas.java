// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.SignInClient;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzaj, zzaq, zzak

final class zzas
	implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

	private zzas(zzaj zzaj1)
	{
		zzhv = zzaj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzaj zzhv>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}

	zzas(zzaj zzaj1, zzak zzak)
	{
		this(zzaj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void zzas(zzaj)>
	//    3    5:return          
	}

	public final void onConnected(Bundle bundle)
	{
		zzaj.zzf(zzhv).signIn(((com.google.android.gms.signin.internal.ISignInCallbacks) (new zzaq(zzhv))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzaj zzhv>
	//    2    4:invokestatic    #29  <Method SignInClient zzaj.zzf(zzaj)>
	//    3    7:new             #31  <Class zzaq>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field zzaj zzhv>
	//    7   15:invokespecial   #32  <Method void zzaq(zzaj)>
	//    8   18:invokeinterface #38  <Method void SignInClient.signIn(com.google.android.gms.signin.internal.ISignInCallbacks)>
	//    9   23:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzaj.zzc(zzhv).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzaj zzhv>
	//    2    4:invokestatic    #45  <Method Lock zzaj.zzc(zzaj)>
	//    3    7:invokeinterface #50  <Method void Lock.lock()>
		if(zzaj.zzb(zzhv, connectionresult))
	//*   4   12:aload_0         
	//*   5   13:getfield        #14  <Field zzaj zzhv>
	//*   6   16:aload_1         
	//*   7   17:invokestatic    #54  <Method boolean zzaj.zzb(zzaj, ConnectionResult)>
	//*   8   20:ifeq            40
		{
			zzaj.zzi(zzhv);
	//    9   23:aload_0         
	//   10   24:getfield        #14  <Field zzaj zzhv>
	//   11   27:invokestatic    #57  <Method void zzaj.zzi(zzaj)>
			zzaj.zzj(zzhv);
	//   12   30:aload_0         
	//   13   31:getfield        #14  <Field zzaj zzhv>
	//   14   34:invokestatic    #60  <Method void zzaj.zzj(zzaj)>
			break MISSING_BLOCK_LABEL_48;
	//   15   37:goto            48
		}
		zzaj.zza(zzhv, connectionresult);
	//   16   40:aload_0         
	//   17   41:getfield        #14  <Field zzaj zzhv>
	//   18   44:aload_1         
	//   19   45:invokestatic    #64  <Method void zzaj.zza(zzaj, ConnectionResult)>
		zzaj.zzc(zzhv).unlock();
	//   20   48:aload_0         
	//   21   49:getfield        #14  <Field zzaj zzhv>
	//   22   52:invokestatic    #45  <Method Lock zzaj.zzc(zzaj)>
	//   23   55:invokeinterface #67  <Method void Lock.unlock()>
		return;
	//   24   60:return          
		connectionresult;
	//   25   61:astore_1        
		zzaj.zzc(zzhv).unlock();
	//   26   62:aload_0         
	//   27   63:getfield        #14  <Field zzaj zzhv>
	//   28   66:invokestatic    #45  <Method Lock zzaj.zzc(zzaj)>
	//   29   69:invokeinterface #67  <Method void Lock.unlock()>
		throw connectionresult;
	//   30   74:aload_1         
	//   31   75:athrow          
	}

	public final void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	private final zzaj zzhv;
}
