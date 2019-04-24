// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import android.os.*;
import com.google.android.gms.internal.stable.*;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			ICommonCallbacks

public interface ICommonService
	extends IInterface
{
	public static abstract class Stub extends zzb
		implements ICommonService
	{

		public static ICommonService asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.service.ICommonService">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof ICommonService)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class ICommonService>
		//*  10   19:ifeq            27
				return (ICommonService)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class ICommonService>
		//   13   26:areturn         
			else
				return ((ICommonService) (new Proxy(ibinder)));
		//   14   27:new             #9   <Class ICommonService$Stub$Proxy>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void ICommonService$Stub$Proxy(IBinder)>
		//   18   35:areturn         
		}

		protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			if(i == 1)
		//*   0    0:iload_1         
		//*   1    1:iconst_1        
		//*   2    2:icmpne          18
			{
				clearDefaultAccount(ICommonCallbacks.Stub.asInterface(parcel.readStrongBinder()));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
		//    6   10:invokestatic    #44  <Method ICommonCallbacks ICommonCallbacks$Stub.asInterface(IBinder)>
		//    7   13:invokevirtual   #48  <Method void clearDefaultAccount(ICommonCallbacks)>
				return true;
		//    8   16:iconst_1        
		//    9   17:ireturn         
			} else
			{
				return false;
		//   10   18:iconst_0        
		//   11   19:ireturn         
			}
		}

		public Stub()
		{
			super("com.google.android.gms.common.internal.service.ICommonService");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.service.ICommonService">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static class Stub.Proxy extends zza
		implements ICommonService
	{

		public void clearDefaultAccount(ICommonCallbacks icommoncallbacks)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore_2        
			zzc.zza(parcel, ((IInterface) (icommoncallbacks)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #32  <Method void zzc.zza(Parcel, IInterface)>
			((zza)this).transactOneway(1, parcel);
		//    6   10:aload_0         
		//    7   11:iconst_1        
		//    8   12:aload_2         
		//    9   13:invokevirtual   #36  <Method void zza.transactOneway(int, Parcel)>
		//   10   16:return          
		}

		Stub.Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.service.ICommonService");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.service.ICommonService">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract void clearDefaultAccount(ICommonCallbacks icommoncallbacks)
		throws RemoteException;
}
