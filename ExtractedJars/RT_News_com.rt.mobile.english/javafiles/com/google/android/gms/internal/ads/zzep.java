// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzen, zzel

public final class zzep extends zzej
	implements zzen
{

	zzep(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.clearcut.IClearcut");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.clearcut.IClearcut">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper, String s)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeString(s);
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #33  <Method void Parcel.writeString(String)>
		((zzej)this).transactAndReadExceptionReturnVoid(2, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_2        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #37  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   21:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper, String s, String s1)
		throws RemoteException
	{
		s1 = ((String) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(((Parcel) (s1)), ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((Parcel) (s1)).writeString(s);
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #33  <Method void Parcel.writeString(String)>
		((Parcel) (s1)).writeString(((String) (null)));
	//    9   15:aload_3         
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #33  <Method void Parcel.writeString(String)>
		((zzej)this).transactAndReadExceptionReturnVoid(8, ((Parcel) (s1)));
	//   12   20:aload_0         
	//   13   21:bipush          8
	//   14   23:aload_3         
	//   15   24:invokevirtual   #37  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   16   27:return          
	}

	public final void zza(int ai[])
		throws RemoteException
	{
		ai = ((int []) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_1        
		((Parcel) (ai)).writeIntArray(((int []) (null)));
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #43  <Method void Parcel.writeIntArray(int[])>
		((zzej)this).transactAndReadExceptionReturnVoid(4, ((Parcel) (ai)));
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_1         
	//    9   13:invokevirtual   #37  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void zzbd()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(3, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #37  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void zzc(byte abyte0[])
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeByteArray(abyte0);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #50  <Method void Parcel.writeByteArray(byte[])>
		((zzej)this).transactAndReadExceptionReturnVoid(5, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #37  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void zzg(int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeInt(i);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #55  <Method void Parcel.writeInt(int)>
		((zzej)this).transactAndReadExceptionReturnVoid(6, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:aload_2         
	//    9   14:invokevirtual   #37  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void zzh(int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeInt(i);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #55  <Method void Parcel.writeInt(int)>
		((zzej)this).transactAndReadExceptionReturnVoid(7, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #37  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}
}
