// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzcb, GoogleApiManager, zzbn, zzh

private final class GoogleApiManager$zzc
	implements zzcb, com.google.android.gms.common.internal.ionProgressReportCallbacks
{

	static com.google.android.gms.common.api.Api.Client zza(GoogleApiManager$zzc googleapimanager$zzc)
	{
		return googleapimanager$zzc.zzka;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field com.google.android.gms.common.api.Api$Client zzka>
	//    2    4:areturn         
	}

	static boolean zza(GoogleApiManager$zzc googleapimanager$zzc, boolean flag)
	{
		googleapimanager$zzc.zzkq = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #38  <Field boolean zzkq>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	static void zzb(GoogleApiManager$zzc googleapimanager$zzc)
	{
		googleapimanager$zzc.zzbu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void zzbu()>
	//    2    4:return          
	}

	private final void zzbu()
	{
		if(zzkq && zzko != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean zzkq>
	//*   2    4:ifeq            31
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field IAccountAccessor zzko>
	//*   5   11:ifnull          31
			zzka.getRemoteService(zzko, zzkp);
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field com.google.android.gms.common.api.Api$Client zzka>
	//    8   18:aload_0         
	//    9   19:getfield        #34  <Field IAccountAccessor zzko>
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field Set zzkp>
	//   12   26:invokeinterface #60  <Method void com.google.android.gms.common.api.Api$Client.getRemoteService(IAccountAccessor, Set)>
	//   13   31:return          
	}

	static zzh zzc(GoogleApiManager$zzc googleapimanager$zzc)
	{
		return googleapimanager$zzc.zzhc;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field zzh zzhc>
	//    2    4:areturn         
	}

	public final void onReportServiceBinding(ConnectionResult connectionresult)
	{
		GoogleApiManager.zza(zzjy).post(((Runnable) (new zzbn(this, connectionresult))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #68  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    3    7:new             #70  <Class zzbn>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #73  <Method void zzbn(GoogleApiManager$zzc, ConnectionResult)>
	//    8   16:invokevirtual   #79  <Method boolean Handler.post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public final void zza(IAccountAccessor iaccountaccessor, Set set)
	{
		if(iaccountaccessor != null && set != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            26
		{
			zzko = iaccountaccessor;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #34  <Field IAccountAccessor zzko>
			zzkp = set;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #36  <Field Set zzkp>
			zzbu();
	//   11   21:aload_0         
	//   12   22:invokespecial   #53  <Method void zzbu()>
			return;
	//   13   25:return          
		} else
		{
			Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", ((Throwable) (new Exception())));
	//   14   26:ldc1            #82  <String "GoogleApiManager">
	//   15   28:ldc1            #84  <String "Received null response from onSignInSuccess">
	//   16   30:new             #86  <Class Exception>
	//   17   33:dup             
	//   18   34:invokespecial   #87  <Method void Exception()>
	//   19   37:invokestatic    #93  <Method int Log.wtf(String, String, Throwable)>
	//   20   40:pop             
			zzg(new ConnectionResult(4));
	//   21   41:aload_0         
	//   22   42:new             #95  <Class ConnectionResult>
	//   23   45:dup             
	//   24   46:iconst_4        
	//   25   47:invokespecial   #98  <Method void ConnectionResult(int)>
	//   26   50:invokevirtual   #101 <Method void zzg(ConnectionResult)>
			return;
	//   27   53:return          
		}
	}

	public final void zzg(ConnectionResult connectionresult)
	{
		((GoogleApiManager$zza)GoogleApiManager.zzj(zzjy).get(((Object) (zzhc)))).zzg(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field GoogleApiManager zzjy>
	//    2    4:invokestatic    #106 <Method Map GoogleApiManager.zzj(GoogleApiManager)>
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field zzh zzhc>
	//    5   11:invokeinterface #112 <Method Object Map.get(Object)>
	//    6   16:checkcast       #114 <Class GoogleApiManager$zza>
	//    7   19:aload_1         
	//    8   20:invokevirtual   #115 <Method void GoogleApiManager$zza.zzg(ConnectionResult)>
	//    9   23:return          
	}

	private final zzh zzhc;
	final GoogleApiManager zzjy;
	private final com.google.android.gms.common.api.Api.Client zzka;
	private IAccountAccessor zzko;
	private Set zzkp;
	private boolean zzkq;

	public GoogleApiManager$zzc(GoogleApiManager googleapimanager, com.google.android.gms.common.api.Api.Client client, zzh zzh)
	{
		zzjy = googleapimanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field GoogleApiManager zzjy>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #32  <Method void Object()>
		zzko = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #34  <Field IAccountAccessor zzko>
		zzkp = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #36  <Field Set zzkp>
		zzkq = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #38  <Field boolean zzkq>
		zzka = client;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #40  <Field com.google.android.gms.common.api.Api$Client zzka>
		zzhc = zzh;
	//   17   29:aload_0         
	//   18   30:aload_3         
	//   19   31:putfield        #42  <Field zzh zzhc>
	//   20   34:return          
	}
}
