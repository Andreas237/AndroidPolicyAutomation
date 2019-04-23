// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IUiSettingsDelegate

public final class zzbx extends zza
	implements IUiSettingsDelegate
{

	zzbx(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
	//    3    4:invokespecial   #13  <Method void zza(IBinder, String)>
	//    4    7:return          
	}

	public final boolean isCompassEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(10, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #32  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isIndoorLevelPickerEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(17, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          17
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #32  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isMapToolbarEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(19, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          19
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #32  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isMyLocationButtonEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(11, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #32  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isRotateGesturesEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(15, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          15
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #32  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isScrollGesturesEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(12, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #32  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isTiltGesturesEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(14, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          14
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #32  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isZoomControlsEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(9, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #32  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isZoomGesturesEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(13, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          13
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #32  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final void setAllGesturesEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(8, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          8
	//    8   13:aload_2         
	//    9   14:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void setCompassEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(2, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void setIndoorLevelPickerEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(16, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          16
	//    8   13:aload_2         
	//    9   14:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void setMapToolbarEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(18, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          18
	//    8   13:aload_2         
	//    9   14:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void setMyLocationButtonEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(3, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void setRotateGesturesEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(7, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void setScrollGesturesEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(4, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void setTiltGesturesEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(6, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:aload_2         
	//    9   14:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void setZoomControlsEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void setZoomGesturesEnabled(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #52  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(5, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #56  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}
}
