// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf, zzn, zzac, zzg, 
//			zzl

public abstract class zzl extends zzf
	implements com.google.android.gms.common.api.Api.zze, zzm.zza
{

	protected zzl(Context context, Looper looper, int i, zzg zzg1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		this(context, looper, zzn.zzaU(context), GoogleApiAvailability.getInstance(), i, zzg1, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)zzac.zzw(((Object) (connectioncallbacks))), (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)zzac.zzw(((Object) (onconnectionfailedlistener))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokestatic    #28  <Method zzn zzn.zzaU(Context)>
	//    5    7:invokestatic    #34  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:invokestatic    #40  <Method Object zzac.zzw(Object)>
	//   10   18:checkcast       #42  <Class com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks>
	//   11   21:aload           6
	//   12   23:invokestatic    #40  <Method Object zzac.zzw(Object)>
	//   13   26:checkcast       #44  <Class com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener>
	//   14   29:invokespecial   #47  <Method void zzl(Context, Looper, zzn, GoogleApiAvailability, int, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   15   32:return          
	}

	protected zzl(Context context, Looper looper, zzn zzn1, GoogleApiAvailability googleapiavailability, int i, zzg zzg1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
			com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, zzn1, ((com.google.android.gms.common.zze) (googleapiavailability)), i, zza(connectioncallbacks), zza(onconnectionfailedlistener), zzg1.zzxP());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           7
	//    7   10:invokestatic    #52  <Method zzf$zzb zza(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    8   13:aload           8
	//    9   15:invokestatic    #55  <Method zzf$zzc zza(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   10   18:aload           6
	//   11   20:invokevirtual   #61  <Method String zzg.zzxP()>
	//   12   23:invokespecial   #64  <Method void zzf(Context, Looper, zzn, com.google.android.gms.common.zze, int, zzf$zzb, zzf$zzc, String)>
		zzaAL = zzg1;
	//   13   26:aload_0         
	//   14   27:aload           6
	//   15   29:putfield        #66  <Field zzg zzaAL>
		zzahh = zzg1.getAccount();
	//   16   32:aload_0         
	//   17   33:aload           6
	//   18   35:invokevirtual   #70  <Method Account zzg.getAccount()>
	//   19   38:putfield        #72  <Field Account zzahh>
		zzakq = zzb(zzg1.zzxM());
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:aload           6
	//   23   45:invokevirtual   #76  <Method Set zzg.zzxM()>
	//   24   48:invokespecial   #80  <Method Set zzb(Set)>
	//   25   51:putfield        #82  <Field Set zzakq>
	//   26   54:return          
	}

	private static zzf.zzb zza(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		if(connectioncallbacks == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((zzf.zzb) (new Runnable(connectioncallbacks) {

				public void run()
				{
					com.google.android.gms.internal.zzl.zzd(zzR).zza(zzP, zzQ);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field zzl zzR>
				//    2    4:invokestatic    #33  <Method zzt$zza zzl.zzd(zzl)>
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field String zzP>
				//    5   11:aload_0         
				//    6   12:getfield        #25  <Field long zzQ>
				//    7   15:invokevirtual   #39  <Method void zzt$zza.zza(String, long)>
					com.google.android.gms.internal.zzl.zzd(zzR).zzd(((Object)this).toString());
				//    8   18:aload_0         
				//    9   19:getfield        #21  <Field zzl zzR>
				//   10   22:invokestatic    #33  <Method zzt$zza zzl.zzd(zzl)>
				//   11   25:aload_0         
				//   12   26:invokevirtual   #43  <Method String Object.toString()>
				//   13   29:invokevirtual   #44  <Method void zzt$zza.zzd(String)>
				//   14   32:return          
				}

				final String zzP;
				final long zzQ;
				final zzl zzR;

			
			{
				zzR = zzl1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field zzl zzR>
				zzP = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String zzP>
				zzQ = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #25  <Field long zzQ>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
));
	//    4    6:new             #11  <Class zzl$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #86  <Method void zzl$1(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    8   14:areturn         
	}

	private static zzf.zzc zza(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		if(onconnectionfailedlistener == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new zzf.zzc(onconnectionfailedlistener) {

				public void onConnectionFailed(ConnectionResult connectionresult)
				{
					zzaFT.onConnectionFailed(connectionresult);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzaFT>
				//    2    4:aload_1         
				//    3    5:invokeinterface #28  <Method void com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
				//    4   10:return          
				}

				final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zzaFT;

			
			{
				zzaFT = onconnectionfailedlistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzaFT>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    4    6:new             #13  <Class zzl$2>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #90  <Method void zzl$2(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    8   14:areturn         
	}

	private Set zzb(Set set)
	{
		Set set1 = zzc(set);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #94  <Method Set zzc(Set)>
	//    3    5:astore_2        
		for(Iterator iterator = set1.iterator(); iterator.hasNext();)
	//*   4    6:aload_2         
	//*   5    7:invokeinterface #100 <Method Iterator Set.iterator()>
	//*   6   12:astore_3        
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            53
			if(!set.contains(((Object) ((Scope)iterator.next()))))
	//*  10   22:aload_1         
	//*  11   23:aload_3         
	//*  12   24:invokeinterface #110 <Method Object Iterator.next()>
	//*  13   29:checkcast       #112 <Class Scope>
	//*  14   32:invokeinterface #116 <Method boolean Set.contains(Object)>
	//*  15   37:ifne            50
				throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
	//   16   40:new             #118 <Class IllegalStateException>
	//   17   43:dup             
	//   18   44:ldc1            #120 <String "Expanding scopes is not permitted, use implied scopes instead">
	//   19   46:invokespecial   #123 <Method void IllegalStateException(String)>
	//   20   49:athrow          

	//*  21   50:goto            13
		return set1;
	//   22   53:aload_2         
	//   23   54:areturn         
	}

	public final Account getAccount()
	{
		return zzahh;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Account zzahh>
	//    2    4:areturn         
	}

	protected Set zzc(Set set)
	{
		return set;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public zzc[] zzxA()
	{
		return new zzc[0];
	//    0    0:iconst_0        
	//    1    1:anewarray       zzc[]
	//    2    4:areturn         
	}

	protected final Set zzxF()
	{
		return zzakq;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Set zzakq>
	//    2    4:areturn         
	}

	protected final zzg zzxW()
	{
		return zzaAL;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field zzg zzaAL>
	//    2    4:areturn         
	}

	private final zzg zzaAL;
	private final Account zzahh;
	private final Set zzakq;
}
