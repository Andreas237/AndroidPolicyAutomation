// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzl;

// Referenced classes of package com.google.android.gms.internal:
//			zzaso, zzase

public class zzarv extends zzl
{

	public zzarv(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zzg zzg)
	{
		super(context, looper, 23, zzg, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          23
	//    4    5:aload           6
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #17  <Method void zzl(Context, Looper, int, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    8   13:aload_0         
	//    9   14:new             #7   <Class zzarv$1>
	//   10   17:dup             
	//   11   18:aload_0         
	//   12   19:invokespecial   #20  <Method void zzarv$1(zzarv)>
	//   13   22:putfield        #22  <Field zzaso zzbkt>
		zzbks = s;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #24  <Field String zzbks>
	//   17   31:return          
	}

	static void zza(zzarv zzarv1)
	{
		zzarv1.zzxC();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method void zzxC()>
	//    2    4:return          
	}

	protected zzase zzdf(IBinder ibinder)
	{
		return zzase.zza.zzdi(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #37  <Method zzase zzase$zza.zzdi(IBinder)>
	//    2    4:areturn         
	}

	public String zzeA()
	{
		return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
	//    0    0:ldc1            #41  <String "com.google.android.gms.location.internal.IGoogleLocationManagerService">
	//    1    2:areturn         
	}

	public String zzez()
	{
		return "com.google.android.location.internal.GoogleLocationManagerService.START";
	//    0    0:ldc1            #44  <String "com.google.android.location.internal.GoogleLocationManagerService.START">
	//    1    2:areturn         
	}

	public IInterface zzh(IBinder ibinder)
	{
		return ((IInterface) (zzdf(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method zzase zzdf(IBinder)>
	//    3    5:areturn         
	}

	public Bundle zzqL()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #52  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("client_name", zzbks);
	//    4    8:aload_1         
	//    5    9:ldc1            #56  <String "client_name">
	//    6   11:aload_0         
	//    7   12:getfield        #24  <Field String zzbks>
	//    8   15:invokevirtual   #60  <Method void Bundle.putString(String, String)>
		return bundle;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	private final String zzbks;
	protected final zzaso zzbkt = new zzaso() {

		public zzase zzIn()
			throws DeadObjectException
		{
			return (zzase)zzbku.zzxD();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzarv zzbku>
		//    2    4:invokevirtual   #27  <Method IInterface zzarv.zzxD()>
		//    3    7:checkcast       #29  <Class zzase>
		//    4   10:areturn         
		}

		public void zzxC()
		{
			zzarv.zza(zzbku);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzarv zzbku>
		//    2    4:invokestatic    #34  <Method void zzarv.zza(zzarv)>
		//    3    7:return          
		}

		public IInterface zzxD()
			throws DeadObjectException
		{
			return ((IInterface) (zzIn()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #36  <Method zzase zzIn()>
		//    2    4:areturn         
		}

		final zzarv zzbku;

			
			{
				zzbku = zzarv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field zzarv zzbku>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
	}
;
}
