// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzaap, zzel

public final class zzaar extends zzej
	implements zzaap
{

	zzaar(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlay">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void onActivityResult(int i, int j, Intent intent)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeInt(i);
	//    3    6:aload           4
	//    4    8:iload_1         
	//    5    9:invokevirtual   #28  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//    6   12:aload           4
	//    7   14:iload_2         
	//    8   15:invokevirtual   #28  <Method void Parcel.writeInt(int)>
		zzel.zza(parcel, ((android.os.Parcelable) (intent)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #34  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(12, parcel);
	//   12   24:aload_0         
	//   13   25:bipush          12
	//   14   27:aload           4
	//   15   29:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   16   32:return          
	}

	public final void onBackPressed()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(10, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onCreate(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #34  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void onDestroy()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(8, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onPause()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(5, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onRestart()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(2, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onResume()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(4, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #34  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		parcel = ((zzej)this).transactAndReadException(6, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:aload_2         
	//    9   14:invokevirtual   #52  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   17:astore_2        
		if(parcel.readInt() != 0)
	//*  11   18:aload_2         
	//*  12   19:invokevirtual   #56  <Method int Parcel.readInt()>
	//*  13   22:ifeq            30
			bundle.readFromParcel(parcel);
	//   14   25:aload_1         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #62  <Method void Bundle.readFromParcel(Parcel)>
		parcel.recycle();
	//   17   30:aload_2         
	//   18   31:invokevirtual   #65  <Method void Parcel.recycle()>
	//   19   34:return          
	}

	public final void onStart()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(3, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onStop()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(7, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void zzax()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(9, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final boolean zznj()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(11, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #52  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzel.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #73  <Method boolean zzel.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #65  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final void zzo(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #78  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(13, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          13
	//    8   13:aload_2         
	//    9   14:invokevirtual   #38  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}
}
