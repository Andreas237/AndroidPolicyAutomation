// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.dynamite:
//			IDynamiteLoader

public static class IDynamiteLoader$Stub$Proxy extends zza
	implements IDynamiteLoader
{

	public IObjectWrapper createModuleContext(IObjectWrapper iobjectwrapper, String s, int i)
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
		parcel.writeInt(i);
	//    9   18:aload           4
	//   10   20:iload_3         
	//   11   21:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(2, parcel)));
	//   12   24:aload_0         
	//   13   25:iconst_2        
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

	public int getModuleVersion(IObjectWrapper iobjectwrapper, String s)
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
		iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(1, parcel)));
	//    9   18:aload_0         
	//   10   19:iconst_1        
	//   11   20:aload           4
	//   12   22:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   13   25:astore_1        
		int i = ((Parcel) (iobjectwrapper)).readInt();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #67  <Method int Parcel.readInt()>
	//   16   30:istore_3        
		((Parcel) (iobjectwrapper)).recycle();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #60  <Method void Parcel.recycle()>
		return i;
	//   19   35:iload_3         
	//   20   36:ireturn         
	}

	public int getModuleVersion2(IObjectWrapper iobjectwrapper, String s, boolean flag)
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
		zzc.zza(parcel, flag);
	//    9   18:aload           5
	//   10   20:iload_3         
	//   11   21:invokestatic    #72  <Method void zzc.zza(Parcel, boolean)>
		iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(3, parcel)));
	//   12   24:aload_0         
	//   13   25:iconst_3        
	//   14   26:aload           5
	//   15   28:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   16   31:astore_1        
		int i = ((Parcel) (iobjectwrapper)).readInt();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #67  <Method int Parcel.readInt()>
	//   19   36:istore          4
		((Parcel) (iobjectwrapper)).recycle();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #60  <Method void Parcel.recycle()>
		return i;
	//   22   42:iload           4
	//   23   44:ireturn         
	}

	IDynamiteLoader$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.dynamite.IDynamiteLoader");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.dynamite.IDynamiteLoader">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
