// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			GoogleApiManager

final class zzbn
	implements Runnable
{

	zzbn(GoogleApiManager.zzc zzc, ConnectionResult connectionresult)
	{
		zzkr = zzc;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field GoogleApiManager$zzc zzkr>
		zzkl = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field ConnectionResult zzkl>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		if(zzkl.isSuccess())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ConnectionResult zzkl>
	//*   2    4:invokevirtual   #27  <Method boolean ConnectionResult.isSuccess()>
	//*   3    7:ifeq            59
		{
			GoogleApiManager.zzc.zza(zzkr, true);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field GoogleApiManager$zzc zzkr>
	//    6   14:iconst_1        
	//    7   15:invokestatic    #33  <Method boolean GoogleApiManager$zzc.zza(GoogleApiManager$zzc, boolean)>
	//    8   18:pop             
			if(GoogleApiManager.zzc.zza(zzkr).requiresSignIn())
	//*   9   19:aload_0         
	//*  10   20:getfield        #14  <Field GoogleApiManager$zzc zzkr>
	//*  11   23:invokestatic    #36  <Method com.google.android.gms.common.api.Api$Client GoogleApiManager$zzc.zza(GoogleApiManager$zzc)>
	//*  12   26:invokeinterface #41  <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  13   31:ifeq            42
			{
				GoogleApiManager.zzc.zzb(zzkr);
	//   14   34:aload_0         
	//   15   35:getfield        #14  <Field GoogleApiManager$zzc zzkr>
	//   16   38:invokestatic    #45  <Method void GoogleApiManager$zzc.zzb(GoogleApiManager$zzc)>
				return;
	//   17   41:return          
			} else
			{
				GoogleApiManager.zzc.zza(zzkr).getRemoteService(((com.google.android.gms.common.internal.IAccountAccessor) (null)), Collections.emptySet());
	//   18   42:aload_0         
	//   19   43:getfield        #14  <Field GoogleApiManager$zzc zzkr>
	//   20   46:invokestatic    #36  <Method com.google.android.gms.common.api.Api$Client GoogleApiManager$zzc.zza(GoogleApiManager$zzc)>
	//   21   49:aconst_null     
	//   22   50:invokestatic    #51  <Method java.util.Set Collections.emptySet()>
	//   23   53:invokeinterface #55  <Method void com.google.android.gms.common.api.Api$Client.getRemoteService(com.google.android.gms.common.internal.IAccountAccessor, java.util.Set)>
				return;
	//   24   58:return          
			}
		} else
		{
			((GoogleApiManager.zza)GoogleApiManager.zzj(zzkr.zzjy).get(((Object) (GoogleApiManager.zzc.zzc(zzkr))))).onConnectionFailed(zzkl);
	//   25   59:aload_0         
	//   26   60:getfield        #14  <Field GoogleApiManager$zzc zzkr>
	//   27   63:getfield        #59  <Field GoogleApiManager GoogleApiManager$zzc.zzjy>
	//   28   66:invokestatic    #65  <Method Map GoogleApiManager.zzj(GoogleApiManager)>
	//   29   69:aload_0         
	//   30   70:getfield        #14  <Field GoogleApiManager$zzc zzkr>
	//   31   73:invokestatic    #69  <Method zzh GoogleApiManager$zzc.zzc(GoogleApiManager$zzc)>
	//   32   76:invokeinterface #75  <Method Object Map.get(Object)>
	//   33   81:checkcast       #77  <Class GoogleApiManager$zza>
	//   34   84:aload_0         
	//   35   85:getfield        #16  <Field ConnectionResult zzkl>
	//   36   88:invokevirtual   #81  <Method void GoogleApiManager$zza.onConnectionFailed(ConnectionResult)>
			return;
	//   37   91:return          
		}
	}

	private final ConnectionResult zzkl;
	private final GoogleApiManager.zzc zzkr;
}
