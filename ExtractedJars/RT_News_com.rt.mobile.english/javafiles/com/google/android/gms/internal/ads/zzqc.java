// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzqa, zzel

public final class zzqc extends zzej
	implements zzqa
{

	zzqc(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void destroy()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(4, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #34  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(3, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final IObjectWrapper zzak(String s)
		throws RemoteException
	{
		Object obj = ((Object) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		((Parcel) (obj)).writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #42  <Method void Parcel.writeString(String)>
		s = ((String) (((zzej)this).transactAndReadException(2, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #46  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) (com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (s)).readStrongBinder())));
	//   11   17:aload_1         
	//   12   18:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//   13   21:invokestatic    #56  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   14   24:astore_2        
		((Parcel) (s)).recycle();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #59  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (obj));
	//   17   29:aload_2         
	//   18   30:areturn         
	}

	public final void zzb(IObjectWrapper iobjectwrapper, int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #34  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #65  <Method void Parcel.writeInt(int)>
		((zzej)this).transactAndReadExceptionReturnVoid(5, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   21:return          
	}

	public final void zzb(String s, IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		parcel.writeString(s);
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #42  <Method void Parcel.writeString(String)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #34  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(1, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   21:return          
	}

	public final void zzc(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #34  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(6, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}
}
