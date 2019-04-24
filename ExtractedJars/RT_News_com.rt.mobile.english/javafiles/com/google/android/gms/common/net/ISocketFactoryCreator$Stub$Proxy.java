// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.net;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.common.net:
//			ISocketFactoryCreator

public static class ISocketFactoryCreator$Stub$Proxy extends zza
	implements ISocketFactoryCreator
{

	public IObjectWrapper newSocketFactory(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2, boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          5
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper2)));
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, flag);
	//   12   24:aload           5
	//   13   26:iload           4
	//   14   28:invokestatic    #35  <Method void zzc.zza(Parcel, boolean)>
		iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(1, parcel)));
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:aload           5
	//   18   35:invokevirtual   #39  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   19   38:astore_1        
		iobjectwrapper1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder());
	//   20   39:aload_1         
	//   21   40:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
	//   22   43:invokestatic    #51  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   23   46:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   24   47:aload_1         
	//   25   48:invokevirtual   #55  <Method void Parcel.recycle()>
		return iobjectwrapper1;
	//   26   51:aload_2         
	//   27   52:areturn         
	}

	public IObjectWrapper newSocketFactoryWithCacheDir(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2, String s)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          5
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper2)));
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
		parcel.writeString(s);
	//   12   24:aload           5
	//   13   26:aload           4
	//   14   28:invokevirtual   #62  <Method void Parcel.writeString(String)>
		iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(2, parcel)));
	//   15   31:aload_0         
	//   16   32:iconst_2        
	//   17   33:aload           5
	//   18   35:invokevirtual   #39  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   19   38:astore_1        
		iobjectwrapper1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder());
	//   20   39:aload_1         
	//   21   40:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
	//   22   43:invokestatic    #51  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   23   46:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   24   47:aload_1         
	//   25   48:invokevirtual   #55  <Method void Parcel.recycle()>
		return iobjectwrapper1;
	//   26   51:aload_2         
	//   27   52:areturn         
	}

	ISocketFactoryCreator$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.net.ISocketFactoryCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.net.ISocketFactoryCreator">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
