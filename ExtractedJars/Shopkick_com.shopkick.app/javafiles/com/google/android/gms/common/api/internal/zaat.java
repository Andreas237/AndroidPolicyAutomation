// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.zad;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaak, zaar, zaal

final class zaat
	implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

	private zaat(zaak zaak1)
	{
		zagi = zaak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zaak zagi>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}

	zaat(zaak zaak1, zaal zaal)
	{
		this(zaak1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void zaat(zaak)>
	//    3    5:return          
	}

	public final void onConnected(Bundle bundle)
	{
		zaak.zaf(zagi).zaa(((com.google.android.gms.signin.internal.zad) (new zaar(zagi))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zaak zagi>
	//    2    4:invokestatic    #29  <Method zad zaak.zaf(zaak)>
	//    3    7:new             #31  <Class zaar>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field zaak zagi>
	//    7   15:invokespecial   #32  <Method void zaar(zaak)>
	//    8   18:invokeinterface #38  <Method void zad.zaa(com.google.android.gms.signin.internal.zad)>
	//    9   23:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		zaak.zac(zagi).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zaak zagi>
	//    2    4:invokestatic    #45  <Method Lock zaak.zac(zaak)>
	//    3    7:invokeinterface #50  <Method void Lock.lock()>
		if(zaak.zab(zagi, connectionresult))
	//*   4   12:aload_0         
	//*   5   13:getfield        #14  <Field zaak zagi>
	//*   6   16:aload_1         
	//*   7   17:invokestatic    #54  <Method boolean zaak.zab(zaak, ConnectionResult)>
	//*   8   20:ifeq            40
		{
			zaak.zai(zagi);
	//    9   23:aload_0         
	//   10   24:getfield        #14  <Field zaak zagi>
	//   11   27:invokestatic    #57  <Method void zaak.zai(zaak)>
			zaak.zaj(zagi);
	//   12   30:aload_0         
	//   13   31:getfield        #14  <Field zaak zagi>
	//   14   34:invokestatic    #60  <Method void zaak.zaj(zaak)>
			break MISSING_BLOCK_LABEL_48;
	//   15   37:goto            48
		}
		zaak.zaa(zagi, connectionresult);
	//   16   40:aload_0         
	//   17   41:getfield        #14  <Field zaak zagi>
	//   18   44:aload_1         
	//   19   45:invokestatic    #63  <Method void zaak.zaa(zaak, ConnectionResult)>
		zaak.zac(zagi).unlock();
	//   20   48:aload_0         
	//   21   49:getfield        #14  <Field zaak zagi>
	//   22   52:invokestatic    #45  <Method Lock zaak.zac(zaak)>
	//   23   55:invokeinterface #66  <Method void Lock.unlock()>
		return;
	//   24   60:return          
		connectionresult;
	//   25   61:astore_1        
		zaak.zac(zagi).unlock();
	//   26   62:aload_0         
	//   27   63:getfield        #14  <Field zaak zagi>
	//   28   66:invokestatic    #45  <Method Lock zaak.zac(zaak)>
	//   29   69:invokeinterface #66  <Method void Lock.unlock()>
		throw connectionresult;
	//   30   74:aload_1         
	//   31   75:athrow          
	}

	public final void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	private final zaak zagi;
}
