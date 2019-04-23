// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IStreetViewPanoramaViewDelegate, IStreetViewPanoramaDelegate, zzbu, zzbp

public final class zzbw extends zza
	implements IStreetViewPanoramaViewDelegate
{

	zzbw(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//    3    4:invokespecial   #13  <Method void zza(IBinder, String)>
	//    4    7:return          
	}

	public final IStreetViewPanoramaDelegate getStreetViewPanorama()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(1, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5    9:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   10:aload_2         
	//    7   11:invokevirtual   #32  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:astore_1        
		if(obj == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       24
		{
			obj = null;
	//   11   19:aconst_null     
	//   12   20:astore_1        
		} else
	//*  13   21:goto            57
		{
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//   14   24:aload_1         
	//   15   25:ldc1            #34  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//   16   27:invokeinterface #40  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   32:astore_3        
			if(iinterface instanceof IStreetViewPanoramaDelegate)
	//*  18   33:aload_3         
	//*  19   34:instanceof      #42  <Class IStreetViewPanoramaDelegate>
	//*  20   37:ifeq            48
				obj = ((Object) ((IStreetViewPanoramaDelegate)iinterface));
	//   21   40:aload_3         
	//   22   41:checkcast       #42  <Class IStreetViewPanoramaDelegate>
	//   23   44:astore_1        
			else
	//*  24   45:goto            57
				obj = ((Object) (new zzbu(((IBinder) (obj)))));
	//   25   48:new             #44  <Class zzbu>
	//   26   51:dup             
	//   27   52:aload_1         
	//   28   53:invokespecial   #46  <Method void zzbu(IBinder)>
	//   29   56:astore_1        
		}
		parcel.recycle();
	//   30   57:aload_2         
	//   31   58:invokevirtual   #50  <Method void Parcel.recycle()>
		return ((IStreetViewPanoramaDelegate) (obj));
	//   32   61:aload_1         
	//   33   62:areturn         
	}

	public final void getStreetViewPanoramaAsync(zzbp zzbp)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.IInterface) (zzbp)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
		((zza)this).transactAndReadExceptionReturnVoid(9, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          9
	//    8   13:aload_2         
	//    9   14:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final IObjectWrapper getView()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(8, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #32  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #71  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #50  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final void onCreate(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #76  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactAndReadExceptionReturnVoid(2, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void onDestroy()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(5, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onLowMemory()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(6, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onPause()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(4, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onResume()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(3, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #76  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		parcel = ((zza)this).transactAndReadException(7, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   10   17:astore_2        
		if(parcel.readInt() != 0)
	//*  11   18:aload_2         
	//*  12   19:invokevirtual   #85  <Method int Parcel.readInt()>
	//*  13   22:ifeq            30
			bundle.readFromParcel(parcel);
	//   14   25:aload_1         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #91  <Method void Bundle.readFromParcel(Parcel)>
		parcel.recycle();
	//   17   30:aload_2         
	//   18   31:invokevirtual   #50  <Method void Parcel.recycle()>
	//   19   34:return          
	}

	public final void onStart()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(10, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onStop()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(11, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}
}
