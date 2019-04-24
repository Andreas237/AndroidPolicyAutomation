// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzaap

class zzaap$zzb$1
	implements Runnable
{

	public void run()
	{
		if(zzaBi.isSuccess())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ConnectionResult zzaBi>
	//*   2    4:invokevirtual   #35  <Method boolean ConnectionResult.isSuccess()>
	//*   3    7:ifeq            59
		{
			zzaap.zzb.zza(zzaBk, true);
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field zzaap$zzb zzaBk>
	//    6   14:iconst_1        
	//    7   15:invokestatic    #39  <Method boolean zzaap$zzb.zza(zzaap$zzb, boolean)>
	//    8   18:pop             
			if(zzaap.zzb.zza(zzaBk).zzqD())
	//*   9   19:aload_0         
	//*  10   20:getfield        #22  <Field zzaap$zzb zzaBk>
	//*  11   23:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze zzaap$zzb.zza(zzaap$zzb)>
	//*  12   26:invokeinterface #47  <Method boolean com.google.android.gms.common.api.Api$zze.zzqD()>
	//*  13   31:ifeq            42
			{
				zzaap.zzb.zzb(zzaBk);
	//   14   34:aload_0         
	//   15   35:getfield        #22  <Field zzaap$zzb zzaBk>
	//   16   38:invokestatic    #50  <Method void zzaap$zzb.zzb(zzaap$zzb)>
				return;
	//   17   41:return          
			} else
			{
				zzaap.zzb.zza(zzaBk).zza(((com.google.android.gms.common.internal.zzr) (null)), Collections.emptySet());
	//   18   42:aload_0         
	//   19   43:getfield        #22  <Field zzaap$zzb zzaBk>
	//   20   46:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze zzaap$zzb.zza(zzaap$zzb)>
	//   21   49:aconst_null     
	//   22   50:invokestatic    #56  <Method java.util.Set Collections.emptySet()>
	//   23   53:invokeinterface #59  <Method void com.google.android.gms.common.api.Api$zze.zza(com.google.android.gms.common.internal.zzr, java.util.Set)>
				return;
	//   24   58:return          
			}
		} else
		{
			((zzaap.zza)zzaap.zzj(zzaBk.zzaBg).get(((Object) (zzaap.zzb.zzc(zzaBk))))).onConnectionFailed(zzaBi);
	//   25   59:aload_0         
	//   26   60:getfield        #22  <Field zzaap$zzb zzaBk>
	//   27   63:getfield        #63  <Field zzaap zzaap$zzb.zzaBg>
	//   28   66:invokestatic    #67  <Method Map zzaap.zzj(zzaap)>
	//   29   69:aload_0         
	//   30   70:getfield        #22  <Field zzaap$zzb zzaBk>
	//   31   73:invokestatic    #71  <Method zzzs zzaap$zzb.zzc(zzaap$zzb)>
	//   32   76:invokeinterface #77  <Method Object Map.get(Object)>
	//   33   81:checkcast       #79  <Class zzaap$zza>
	//   34   84:aload_0         
	//   35   85:getfield        #24  <Field ConnectionResult zzaBi>
	//   36   88:invokevirtual   #82  <Method void zzaap$zza.onConnectionFailed(ConnectionResult)>
			return;
	//   37   91:return          
		}
	}

	final ConnectionResult zzaBi;
	final zzaap.zzb zzaBk;

	zzaap$zzb$1(zzaap.zzb zzb1, ConnectionResult connectionresult)
	{
		zzaBk = zzb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field zzaap$zzb zzaBk>
		zzaBi = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ConnectionResult zzaBi>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
