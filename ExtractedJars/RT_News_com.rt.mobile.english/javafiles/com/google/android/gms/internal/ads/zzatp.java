// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzatn, zzel

public final class zzatp extends zzej
	implements zzatn
{

	zzatp(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.omid.IOmid");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.omid.IOmid">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final String getVersion()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(6, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #31  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final IObjectWrapper zza(String s, IObjectWrapper iobjectwrapper, String s1, String s2, String s3)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          6
		parcel.writeString(s);
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokevirtual   #42  <Method void Parcel.writeString(String)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #47  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeString(s1);
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokevirtual   #42  <Method void Parcel.writeString(String)>
		parcel.writeString(s2);
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokevirtual   #42  <Method void Parcel.writeString(String)>
		parcel.writeString(s3);
	//   15   31:aload           6
	//   16   33:aload           5
	//   17   35:invokevirtual   #42  <Method void Parcel.writeString(String)>
		s = ((String) (((zzej)this).transactAndReadException(3, parcel)));
	//   18   38:aload_0         
	//   19   39:iconst_3        
	//   20   40:aload           6
	//   21   42:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   22   45:astore_1        
		iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (s)).readStrongBinder());
	//   23   46:aload_1         
	//   24   47:invokevirtual   #51  <Method IBinder Parcel.readStrongBinder()>
	//   25   50:invokestatic    #57  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   26   53:astore_2        
		((Parcel) (s)).recycle();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #35  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   29   58:aload_2         
	//   30   59:areturn         
	}

	public final void zza(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #47  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #47  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(5, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #62  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   21:return          
	}

	public final void zzm(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #47  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(4, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #62  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void zzn(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #47  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(7, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #62  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final boolean zzy(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #47  <Method void zzel.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(2, parcel)));
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_3         
	//    9   13:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		boolean flag = zzel.zza(((Parcel) (iobjectwrapper)));
	//   11   17:aload_1         
	//   12   18:invokestatic    #70  <Method boolean zzel.zza(Parcel)>
	//   13   21:istore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #35  <Method void Parcel.recycle()>
		return flag;
	//   16   26:iload_2         
	//   17   27:ireturn         
	}
}
