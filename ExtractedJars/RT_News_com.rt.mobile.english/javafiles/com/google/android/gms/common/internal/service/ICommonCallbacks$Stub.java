// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import android.os.*;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			ICommonCallbacks

public static abstract class ICommonCallbacks$Stub extends zzb
	implements ICommonCallbacks
{
	public static class Proxy extends zza
		implements ICommonCallbacks
	{

		public void onDefaultAccountCleared(int i)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore_2        
			parcel.writeInt(i);
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokevirtual   #31  <Method void Parcel.writeInt(int)>
			((zza)this).transactAndReadExceptionReturnVoid(1, parcel);
		//    6   10:aload_0         
		//    7   11:iconst_1        
		//    8   12:aload_2         
		//    9   13:invokevirtual   #35  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
		//   10   16:return          
		}

		Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.service.ICommonCallbacks");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public static ICommonCallbacks asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof ICommonCallbacks)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class ICommonCallbacks>
	//*  10   19:ifeq            27
			return (ICommonCallbacks)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class ICommonCallbacks>
	//   13   26:areturn         
		else
			return ((ICommonCallbacks) (new Proxy(ibinder)));
	//   14   27:new             #9   <Class ICommonCallbacks$Stub$Proxy>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #29  <Method void ICommonCallbacks$Stub$Proxy(IBinder)>
	//   18   35:areturn         
	}

	protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          19
		{
			onDefaultAccountCleared(parcel.readInt());
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #39  <Method int Parcel.readInt()>
	//    6   10:invokevirtual   #43  <Method void onDefaultAccountCleared(int)>
			parcel1.writeNoException();
	//    7   13:aload_3         
	//    8   14:invokevirtual   #46  <Method void Parcel.writeNoException()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	public ICommonCallbacks$Stub()
	{
		super("com.google.android.gms.common.internal.service.ICommonCallbacks");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
	//    2    3:invokespecial   #17  <Method void zzb(String)>
	//    3    6:return          
	}
}
