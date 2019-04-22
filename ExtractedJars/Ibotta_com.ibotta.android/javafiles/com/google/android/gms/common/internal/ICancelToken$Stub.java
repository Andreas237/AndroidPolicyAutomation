// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//			ICancelToken

public static abstract class ICancelToken$Stub extends zzb
	implements ICancelToken
{
	public static class Proxy extends zza
		implements ICancelToken
	{

		public void cancel()
			throws RemoteException
		{
			((zza)this).transactOneway(2, ((zza)this).obtainAndWriteInterfaceToken());
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    4    6:invokevirtual   #30  <Method void zza.transactOneway(int, Parcel)>
		//    5    9:return          
		}

		Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.ICancelToken");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.ICancelToken">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public static ICancelToken asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.ICancelToken">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof ICancelToken)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class ICancelToken>
	//*  10   19:ifeq            27
			return (ICancelToken)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class ICancelToken>
	//   13   26:areturn         
		else
			return ((ICancelToken) (new Proxy(ibinder)));
	//   14   27:new             #9   <Class ICancelToken$Stub$Proxy>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #29  <Method void ICancelToken$Stub$Proxy(IBinder)>
	//   18   35:areturn         
	}

	protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          11
		{
			cancel();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #36  <Method void cancel()>
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		} else
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
	}

	public ICancelToken$Stub()
	{
		super("com.google.android.gms.common.internal.ICancelToken");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.ICancelToken">
	//    2    3:invokespecial   #17  <Method void zzb(String)>
	//    3    6:return          
	}
}
