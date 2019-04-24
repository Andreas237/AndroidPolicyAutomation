// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.BaseGmsClient;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzsk, zzsl

public final class zzsf extends BaseGmsClient
{

	zzsf(Context context, Looper looper, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseconnectioncallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseonconnectionfailedlistener)
	{
		super(context, looper, 166, baseconnectioncallbacks, baseonconnectionfailedlistener, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:sipush          166
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aconst_null     
	//    7   10:invokespecial   #11  <Method void BaseGmsClient(Context, Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, String)>
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
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
	//    4    6:aload_1         
	//    5    7:ldc1            #17  <String "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService">
	//    6    9:invokeinterface #23  <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzsk)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #25  <Class zzsk>
	//*  10   19:ifeq            27
			return ((IInterface) ((zzsk)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #25  <Class zzsk>
	//   13   26:areturn         
		else
			return ((IInterface) (new zzsl(ibinder)));
	//   14   27:new             #27  <Class zzsl>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #30  <Method void zzsl(IBinder)>
	//   18   35:areturn         
	}

	protected final String getServiceDescriptor()
	{
		return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
	//    0    0:ldc1            #17  <String "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService">
	//    1    2:areturn         
	}

	protected final String getStartServiceAction()
	{
		return "com.google.android.gms.ads.service.HTTP";
	//    0    0:ldc1            #36  <String "com.google.android.gms.ads.service.HTTP">
	//    1    2:areturn         
	}

	public final zzsk zzlb()
		throws DeadObjectException
	{
		return (zzsk)super.getService();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method IInterface BaseGmsClient.getService()>
	//    2    4:checkcast       #25  <Class zzsk>
	//    3    7:areturn         
	}
}
