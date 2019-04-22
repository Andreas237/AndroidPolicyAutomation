// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.dynamite:
//			IDynamiteLoaderV2

public static class IDynamiteLoaderV2$Stub$Proxy extends zza
	implements IDynamiteLoaderV2
{

	public IObjectWrapper loadModule(IObjectWrapper iobjectwrapper, String s, byte abyte0[])
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
		parcel.writeString(s);
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokevirtual   #38  <Method void Parcel.writeString(String)>
		parcel.writeByteArray(abyte0);
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokevirtual   #42  <Method void Parcel.writeByteArray(byte[])>
		iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(1, parcel)));
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:aload           4
	//   15   28:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   16   31:astore_1        
		s = ((String) (com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder())));
	//   17   32:aload_1         
	//   18   33:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//   19   36:invokestatic    #56  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   20   39:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   21   40:aload_1         
	//   22   41:invokevirtual   #60  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (s));
	//   23   44:aload_2         
	//   24   45:areturn         
	}

	public IObjectWrapper loadModule2(IObjectWrapper iobjectwrapper, String s, int i, IObjectWrapper iobjectwrapper1)
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
		parcel.writeString(s);
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokevirtual   #38  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//    9   18:aload           5
	//   10   20:iload_3         
	//   11   21:invokevirtual   #67  <Method void Parcel.writeInt(int)>
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//   12   24:aload           5
	//   13   26:aload           4
	//   14   28:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(2, parcel)));
	//   15   31:aload_0         
	//   16   32:iconst_2        
	//   17   33:aload           5
	//   18   35:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   19   38:astore_1        
		s = ((String) (com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder())));
	//   20   39:aload_1         
	//   21   40:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//   22   43:invokestatic    #56  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   23   46:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   24   47:aload_1         
	//   25   48:invokevirtual   #60  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (s));
	//   26   51:aload_2         
	//   27   52:areturn         
	}

	IDynamiteLoaderV2$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.dynamite.IDynamiteLoaderV2">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
