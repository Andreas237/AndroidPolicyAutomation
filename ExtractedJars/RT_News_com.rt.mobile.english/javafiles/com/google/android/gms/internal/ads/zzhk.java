// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.BaseGmsClient;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzho, zzhp

public final class zzhk extends BaseGmsClient
{

	zzhk(Context context, Looper looper, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseconnectioncallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseonconnectionfailedlistener)
	{
		super(context, looper, 123, baseconnectioncallbacks, baseonconnectionfailedlistener, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          123
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:aconst_null     
	//    7    9:invokespecial   #11  <Method void BaseGmsClient(Context, Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, String)>
	//    8   12:return          
	}

	protected final IInterface createServiceInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
	//    4    6:aload_1         
	//    5    7:ldc1            #17  <String "com.google.android.gms.ads.internal.cache.ICacheService">
	//    6    9:invokeinterface #23  <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzho)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #25  <Class zzho>
	//*  10   19:ifeq            27
			return ((IInterface) ((zzho)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #25  <Class zzho>
	//   13   26:areturn         
		else
			return ((IInterface) (new zzhp(ibinder)));
	//   14   27:new             #27  <Class zzhp>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #30  <Method void zzhp(IBinder)>
	//   18   35:areturn         
	}

	protected final String getServiceDescriptor()
	{
		return "com.google.android.gms.ads.internal.cache.ICacheService";
	//    0    0:ldc1            #17  <String "com.google.android.gms.ads.internal.cache.ICacheService">
	//    1    2:areturn         
	}

	protected final String getStartServiceAction()
	{
		return "com.google.android.gms.ads.service.CACHE";
	//    0    0:ldc1            #36  <String "com.google.android.gms.ads.service.CACHE">
	//    1    2:areturn         
	}

	public final zzho zzhl()
		throws DeadObjectException
	{
		return (zzho)super.getService();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method IInterface BaseGmsClient.getService()>
	//    2    4:checkcast       #25  <Class zzho>
	//    3    7:areturn         
	}
}
