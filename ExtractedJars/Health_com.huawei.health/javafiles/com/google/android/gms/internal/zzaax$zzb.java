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
//			zzaax, zzzz

class zzaax$zzb
	implements com.google.android.gms.common.internal.zzf.zzf, zzabr$zza
{

	static com.google.android.gms.common.api.Api.zze zza(zzaax$zzb zzaax$zzb1)
	{
		return zzaax$zzb1.zzaAJ;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
	//    2    4:areturn         
	}

	static boolean zza(zzaax$zzb zzaax$zzb1, boolean flag)
	{
		zzaax$zzb1.zzaCI = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean zzaCI>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void zzb(zzaax$zzb zzaax$zzb1)
	{
		zzaax$zzb1.zzwP();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void zzwP()>
	//    2    4:return          
	}

	static zzzz zzc(zzaax$zzb zzaax$zzb1)
	{
		return zzaax$zzb1.zzayU;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzzz zzayU>
	//    2    4:areturn         
	}

	private void zzwP()
	{
		if(zzaCI && zzaBw != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field boolean zzaCI>
	//*   2    4:ifeq            31
	//*   3    7:aload_0         
	//*   4    8:getfield        #36  <Field zzr zzaBw>
	//*   5   11:ifnull          31
			zzaAJ.zza(zzaBw, zzakq);
	//    6   14:aload_0         
	//    7   15:getfield        #42  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
	//    8   18:aload_0         
	//    9   19:getfield        #36  <Field zzr zzaBw>
	//   10   22:aload_0         
	//   11   23:getfield        #38  <Field Set zzakq>
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
			zzaBw = zzr;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #36  <Field zzr zzaBw>
			zzakq = set;
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:putfield        #38  <Field Set zzakq>
			zzwP();
	//   24   46:aload_0         
	//   25   47:invokespecial   #54  <Method void zzwP()>
			return;
	//   26   50:return          
		}
	}

	public void zzg(ConnectionResult connectionresult)
	{
		zzaax.zza(zzaCx).post(new Runnable(connectionresult) {

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
						zzaax.zzb.zza(zzaCJ).zza(((zzr) (null)), Collections.emptySet());
			//   18   42:aload_0         
			//   19   43:getfield        #22  <Field zzaax$zzb zzaCJ>
			//   20   46:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze zzaax$zzb.zza(zzaax$zzb)>
			//   21   49:aconst_null     
			//   22   50:invokestatic    #56  <Method Set Collections.emptySet()>
			//   23   53:invokeinterface #59  <Method void com.google.android.gms.common.api.Api$zze.zza(zzr, Set)>
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

			
			{
				zzaCJ = zzaax.zzb.this;
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
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzaax zzaCx>
	//    2    4:invokestatic    #91  <Method Handler zzaax.zza(zzaax)>
	//    3    7:new             #13  <Class zzaax$zzb$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #94  <Method void zzaax$zzb$1(zzaax$zzb, ConnectionResult)>
	//    8   16:invokevirtual   #100 <Method boolean Handler.post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void zzi(ConnectionResult connectionresult)
	{
		((zzaax$zza)zzaax.zzj(zzaCx).get(((Object) (zzayU)))).zzi(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzaax zzaCx>
	//    2    4:invokestatic    #105 <Method Map zzaax.zzj(zzaax)>
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field zzzz zzayU>
	//    5   11:invokeinterface #111 <Method Object Map.get(Object)>
	//    6   16:checkcast       #113 <Class zzaax$zza>
	//    7   19:aload_1         
	//    8   20:invokevirtual   #114 <Method void zzaax$zza.zzi(ConnectionResult)>
	//    9   23:return          
	}

	private final com.google.android.gms.common.api.Api.zze zzaAJ;
	private zzr zzaBw;
	private boolean zzaCI;
	final zzaax zzaCx;
	private Set zzakq;
	private final zzzz zzayU;

	public zzaax$zzb(zzaax zzaax1, com.google.android.gms.common.api.Api.zze zze, zzzz zzzz)
	{
		zzaCx = zzaax1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field zzaax zzaCx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #34  <Method void Object()>
		zzaBw = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #36  <Field zzr zzaBw>
		zzakq = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #38  <Field Set zzakq>
		zzaCI = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #40  <Field boolean zzaCI>
		zzaAJ = zze;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #42  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		zzayU = zzzz;
	//   17   29:aload_0         
	//   18   30:aload_3         
	//   19   31:putfield        #44  <Field zzzz zzayU>
	//   20   34:return          
	}
}
