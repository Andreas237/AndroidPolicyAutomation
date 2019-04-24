// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzr;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaap, zzzs

private class zzaap$zzb
	implements com.google.android.gms.common.internal.zzf.zzf, zzabj$zza
{

	static com.google.android.gms.common.api.Api.zze zza(zzaap$zzb zzaap$zzb1)
	{
		return zzaap$zzb1.zzazq;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field com.google.android.gms.common.api.Api$zze zzazq>
	//    2    4:areturn         
	}

	static boolean zza(zzaap$zzb zzaap$zzb1, boolean flag)
	{
		zzaap$zzb1.zzaBj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean zzaBj>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void zzb(zzaap$zzb zzaap$zzb1)
	{
		zzaap$zzb1.zzwi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void zzwi()>
	//    2    4:return          
	}

	static zzzs zzc(zzaap$zzb zzaap$zzb1)
	{
		return zzaap$zzb1.zzaxH;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzzs zzaxH>
	//    2    4:areturn         
	}

	private void zzwi()
	{
		if(zzaBj && zzazW != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field boolean zzaBj>
	//*   2    4:ifeq            31
	//*   3    7:aload_0         
	//*   4    8:getfield        #36  <Field zzr zzazW>
	//*   5   11:ifnull          31
			zzazq.zza(zzazW, zzajm);
	//    6   14:aload_0         
	//    7   15:getfield        #42  <Field com.google.android.gms.common.api.Api$zze zzazq>
	//    8   18:aload_0         
	//    9   19:getfield        #36  <Field zzr zzazW>
	//   10   22:aload_0         
	//   11   23:getfield        #38  <Field Set zzajm>
	//   12   26:invokeinterface #62  <Method void com.google.android.gms.common.api.Api$zze.zza(zzr, Set)>
	//   13   31:return          
	}

	public void zzb(zzr zzr, Set set)
	{
		if(zzr == null || set == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       36
		{
			Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", ((Throwable) (new Exception())));
	//    4    8:ldc1            #65  <String "GoogleApiManager">
	//    5   10:ldc1            #67  <String "Received null response from onSignInSuccess">
	//    6   12:new             #69  <Class Exception>
	//    7   15:dup             
	//    8   16:invokespecial   #70  <Method void Exception()>
	//    9   19:invokestatic    #76  <Method int Log.wtf(String, String, Throwable)>
	//   10   22:pop             
			zzi(new ConnectionResult(4));
	//   11   23:aload_0         
	//   12   24:new             #78  <Class ConnectionResult>
	//   13   27:dup             
	//   14   28:iconst_4        
	//   15   29:invokespecial   #81  <Method void ConnectionResult(int)>
	//   16   32:invokevirtual   #85  <Method void zzi(ConnectionResult)>
			return;
	//   17   35:return          
		} else
		{
			zzazW = zzr;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #36  <Field zzr zzazW>
			zzajm = set;
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:putfield        #38  <Field Set zzajm>
			zzwi();
	//   24   46:aload_0         
	//   25   47:invokespecial   #54  <Method void zzwi()>
			return;
	//   26   50:return          
		}
	}

	public void zzg(ConnectionResult connectionresult)
	{
		zzaap.zza(zzaBg).post(new Runnable(connectionresult) {

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
						zzaap.zzb.zza(zzaBk).zza(((zzr) (null)), Collections.emptySet());
			//   18   42:aload_0         
			//   19   43:getfield        #22  <Field zzaap$zzb zzaBk>
			//   20   46:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze zzaap$zzb.zza(zzaap$zzb)>
			//   21   49:aconst_null     
			//   22   50:invokestatic    #56  <Method Set Collections.emptySet()>
			//   23   53:invokeinterface #59  <Method void com.google.android.gms.common.api.Api$zze.zza(zzr, Set)>
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

			
			{
				zzaBk = zzaap.zzb.this;
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
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzaap zzaBg>
	//    2    4:invokestatic    #91  <Method Handler zzaap.zza(zzaap)>
	//    3    7:new             #13  <Class zzaap$zzb$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #94  <Method void zzaap$zzb$1(zzaap$zzb, ConnectionResult)>
	//    8   16:invokevirtual   #100 <Method boolean Handler.post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void zzi(ConnectionResult connectionresult)
	{
		((zzaap$zza)zzaap.zzj(zzaBg).get(((Object) (zzaxH)))).zzi(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzaap zzaBg>
	//    2    4:invokestatic    #105 <Method Map zzaap.zzj(zzaap)>
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field zzzs zzaxH>
	//    5   11:invokeinterface #111 <Method Object Map.get(Object)>
	//    6   16:checkcast       #113 <Class zzaap$zza>
	//    7   19:aload_1         
	//    8   20:invokevirtual   #114 <Method void zzaap$zza.zzi(ConnectionResult)>
	//    9   23:return          
	}

	final zzaap zzaBg;
	private boolean zzaBj;
	private Set zzajm;
	private final zzzs zzaxH;
	private zzr zzazW;
	private final com.google.android.gms.common.api.Api.zze zzazq;

	public zzaap$zzb(zzaap zzaap1, com.google.android.gms.common.api.Api.zze zze, zzzs zzzs)
	{
		zzaBg = zzaap1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field zzaap zzaBg>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #34  <Method void Object()>
		zzazW = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #36  <Field zzr zzazW>
		zzajm = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #38  <Field Set zzajm>
		zzaBj = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #40  <Field boolean zzaBj>
		zzazq = zze;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #42  <Field com.google.android.gms.common.api.Api$zze zzazq>
		zzaxH = zzzs;
	//   17   29:aload_0         
	//   18   30:aload_3         
	//   19   31:putfield        #44  <Field zzzs zzaxH>
	//   20   34:return          
	}
}
