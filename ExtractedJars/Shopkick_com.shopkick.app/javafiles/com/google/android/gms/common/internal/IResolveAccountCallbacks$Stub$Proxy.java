// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

// Referenced classes of package com.google.android.gms.common.internal:
//			IResolveAccountCallbacks, ResolveAccountResponse

public static class IResolveAccountCallbacks$Stub$Proxy extends zaa
	implements IResolveAccountCallbacks
{

	public void onAccountResolutionComplete(ResolveAccountResponse resolveaccountresponse)
		throws RemoteException
	{
		android.os.Parcel parcel = ((zaa)this).zaa();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method android.os.Parcel zaa.zaa()>
	//    2    4:astore_2        
		zac.zaa(parcel, ((android.os.Parcelable) (resolveaccountresponse)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #31  <Method void zac.zaa(android.os.Parcel, android.os.Parcelable)>
		((zaa)this).zab(2, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #35  <Method void zaa.zab(int, android.os.Parcel)>
	//   10   16:return          
	}

	IResolveAccountCallbacks$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.IResolveAccountCallbacks">
	//    3    4:invokespecial   #17  <Method void zaa(IBinder, String)>
	//    4    7:return          
	}
}
