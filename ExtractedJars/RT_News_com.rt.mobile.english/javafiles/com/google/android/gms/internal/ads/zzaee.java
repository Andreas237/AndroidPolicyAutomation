// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.BaseGmsClient;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaen, zzaep

public final class zzaee extends BaseGmsClient
{

	public zzaee(Context context, Looper looper, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseconnectioncallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseonconnectionfailedlistener)
	{
		Context context1 = context;
	//    0    0:aload_1         
	//    1    1:astore          5
		if(context.getApplicationContext() != null)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #14  <Method Context Context.getApplicationContext()>
	//*   4    7:ifnull          16
			context1 = context.getApplicationContext();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #14  <Method Context Context.getApplicationContext()>
	//    7   14:astore          5
		super(context1, looper, 8, baseconnectioncallbacks, baseonconnectionfailedlistener, ((String) (null)));
	//    8   16:aload_0         
	//    9   17:aload           5
	//   10   19:aload_2         
	//   11   20:bipush          8
	//   12   22:aload_3         
	//   13   23:aload           4
	//   14   25:aconst_null     
	//   15   26:invokespecial   #17  <Method void BaseGmsClient(Context, Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, String)>
	//   16   29:return          
	}

	protected final IInterface createServiceInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
	//    4    6:aload_1         
	//    5    7:ldc1            #23  <String "com.google.android.gms.ads.internal.request.IAdRequestService">
	//    6    9:invokeinterface #29  <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzaen)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #31  <Class zzaen>
	//*  10   19:ifeq            27
			return ((IInterface) ((zzaen)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #31  <Class zzaen>
	//   13   26:areturn         
		else
			return ((IInterface) (new zzaep(ibinder)));
	//   14   27:new             #33  <Class zzaep>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #36  <Method void zzaep(IBinder)>
	//   18   35:areturn         
	}

	protected final String getServiceDescriptor()
	{
		return "com.google.android.gms.ads.internal.request.IAdRequestService";
	//    0    0:ldc1            #23  <String "com.google.android.gms.ads.internal.request.IAdRequestService">
	//    1    2:areturn         
	}

	protected final String getStartServiceAction()
	{
		return "com.google.android.gms.ads.service.START";
	//    0    0:ldc1            #42  <String "com.google.android.gms.ads.service.START">
	//    1    2:areturn         
	}

	public final zzaen zzob()
		throws DeadObjectException
	{
		return (zzaen)super.getService();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method IInterface BaseGmsClient.getService()>
	//    2    4:checkcast       #31  <Class zzaen>
	//    3    7:areturn         
	}
}
