// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.phenotype;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

// Referenced classes of package com.google.android.gms.internal.phenotype:
//			zzb, zzc

public final class zze extends GmsClient
{

	public zze(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 51, clientsettings, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          51
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:aload           5
	//    7   10:invokespecial   #10  <Method void GmsClient(Context, Looper, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    8   13:return          
	}

	protected final IInterface createServiceInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
	//    4    6:aload_1         
	//    5    7:ldc1            #15  <String "com.google.android.gms.phenotype.internal.IPhenotypeService">
	//    6    9:invokeinterface #21  <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzb)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #23  <Class zzb>
	//*  10   19:ifeq            27
			return ((IInterface) ((zzb)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #23  <Class zzb>
	//   13   26:areturn         
		else
			return ((IInterface) (new zzc(ibinder)));
	//   14   27:new             #25  <Class zzc>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #28  <Method void zzc(IBinder)>
	//   18   35:areturn         
	}

	public final int getMinApkVersion()
	{
		return 0xb5f608;
	//    0    0:ldc1            #31  <Int 0xb5f608>
	//    1    2:ireturn         
	}

	protected final String getServiceDescriptor()
	{
		return "com.google.android.gms.phenotype.internal.IPhenotypeService";
	//    0    0:ldc1            #15  <String "com.google.android.gms.phenotype.internal.IPhenotypeService">
	//    1    2:areturn         
	}

	protected final String getStartServiceAction()
	{
		return "com.google.android.gms.phenotype.service.START";
	//    0    0:ldc1            #36  <String "com.google.android.gms.phenotype.service.START">
	//    1    2:areturn         
	}
}
