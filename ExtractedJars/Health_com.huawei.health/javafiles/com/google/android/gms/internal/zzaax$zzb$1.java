// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzaax

class zzaax$zzb$1
	implements Runnable
{

	public void run()
	{
		if(zzaCH.isSuccess())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ConnectionResult zzaCH>
	//*   2    4:invokevirtual   #35  <Method boolean ConnectionResult.isSuccess()>
	//*   3    7:ifeq            59
		{
			zzaax.zzb.zza(zzaCJ, true);
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field zzaax$zzb zzaCJ>
	//    6   14:iconst_1        
	//    7   15:invokestatic    #39  <Method boolean zzaax$zzb.zza(zzaax$zzb, boolean)>
	//    8   18:pop             
			if(zzaax.zzb.zza(zzaCJ).zzrd())
	//*   9   19:aload_0         
	//*  10   20:getfield        #22  <Field zzaax$zzb zzaCJ>
	//*  11   23:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze zzaax$zzb.zza(zzaax$zzb)>
	//*  12   26:invokeinterface #47  <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
	//*  13   31:ifeq            42
			{
				zzaax.zzb.zzb(zzaCJ);
	//   14   34:aload_0         
	//   15   35:getfield        #22  <Field zzaax$zzb zzaCJ>
	//   16   38:invokestatic    #50  <Method void zzaax$zzb.zzb(zzaax$zzb)>
				return;
	//   17   41:return          
			} else
			{
				zzaax.zzb.zza(zzaCJ).zza(((com.google.android.gms.common.internal.zzr) (null)), Collections.emptySet());
	//   18   42:aload_0         
	//   19   43:getfield        #22  <Field zzaax$zzb zzaCJ>
	//   20   46:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze zzaax$zzb.zza(zzaax$zzb)>
	//   21   49:aconst_null     
	//   22   50:invokestatic    #56  <Method java.util.Set Collections.emptySet()>
	//   23   53:invokeinterface #59  <Method void com.google.android.gms.common.api.Api$zze.zza(com.google.android.gms.common.internal.zzr, java.util.Set)>
				return;
	//   24   58:return          
			}
		} else
		{
			((zzaax.zza)zzaax.zzj(zzaCJ.zzaCx).get(((Object) (zzaax.zzb.zzc(zzaCJ))))).onConnectionFailed(zzaCH);
	//   25   59:aload_0         
	//   26   60:getfield        #22  <Field zzaax$zzb zzaCJ>
	//   27   63:getfield        #63  <Field zzaax zzaax$zzb.zzaCx>
	//   28   66:invokestatic    #67  <Method Map zzaax.zzj(zzaax)>
	//   29   69:aload_0         
	//   30   70:getfield        #22  <Field zzaax$zzb zzaCJ>
	//   31   73:invokestatic    #71  <Method zzzz zzaax$zzb.zzc(zzaax$zzb)>
	//   32   76:invokeinterface #77  <Method Object Map.get(Object)>
	//   33   81:checkcast       #79  <Class zzaax$zza>
	//   34   84:aload_0         
	//   35   85:getfield        #24  <Field ConnectionResult zzaCH>
	//   36   88:invokevirtual   #82  <Method void zzaax$zza.onConnectionFailed(ConnectionResult)>
			return;
	//   37   91:return          
		}
	}

	final ConnectionResult zzaCH;
	final zzaax.zzb zzaCJ;

	zzaax$zzb$1(zzaax.zzb zzb1, ConnectionResult connectionresult)
	{
		zzaCJ = zzb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field zzaax$zzb zzaCJ>
		zzaCH = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ConnectionResult zzaCH>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
