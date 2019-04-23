// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IStreetViewPanoramaFragmentDelegate, IStreetViewPanoramaDelegate, zzbu, zzbp

public final class zzbv extends zza
	implements IStreetViewPanoramaFragmentDelegate
{

	zzbv(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
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
		((zza)this).transactAndReadExceptionReturnVoid(12, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          12
	//    8   13:aload_2         
	//    9   14:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final boolean isReady()
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
	//    7   12:invokestatic    #68  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #50  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
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
	//    5    7:invokestatic    #73  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactAndReadExceptionReturnVoid(3, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final IObjectWrapper onCreateView(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #73  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(4, parcel)));
	//   12   24:aload_0         
	//   13   25:iconst_4        
	//   14   26:aload           4
	//   15   28:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   16   31:astore_1        
		iobjectwrapper1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder());
	//   17   32:aload_1         
	//   18   33:invokevirtual   #32  <Method IBinder Parcel.readStrongBinder()>
	//   19   36:invokestatic    #81  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   20   39:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   21   40:aload_1         
	//   22   41:invokevirtual   #50  <Method void Parcel.recycle()>
		return iobjectwrapper1;
	//   23   44:aload_2         
	//   24   45:areturn         
	}

	public final void onDestroy()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(8, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onDestroyView()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(7, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onInflate(IObjectWrapper iobjectwrapper, StreetViewPanoramaOptions streetviewpanoramaoptions, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, ((android.os.Parcelable) (streetviewpanoramaoptions)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #73  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #73  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactAndReadExceptionReturnVoid(2, parcel);
	//   12   24:aload_0         
	//   13   25:iconst_2        
	//   14   26:aload           4
	//   15   28:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   16   31:return          
	}

	public final void onLowMemory()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(9, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onPause()
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

	public final void onResume()
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
	//    5    7:invokestatic    #73  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		parcel = ((zza)this).transactAndReadException(10, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          10
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   10   17:astore_2        
		if(parcel.readInt() != 0)
	//*  11   18:aload_2         
	//*  12   19:invokevirtual   #93  <Method int Parcel.readInt()>
	//*  13   22:ifeq            30
			bundle.readFromParcel(parcel);
	//   14   25:aload_1         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #99  <Method void Bundle.readFromParcel(Parcel)>
		parcel.recycle();
	//   17   30:aload_2         
	//   18   31:invokevirtual   #50  <Method void Parcel.recycle()>
	//   19   34:return          
	}

	public final void onStart()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(13, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          13
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onStop()
		throws RemoteException
	{
		((zza)this).transactAndReadExceptionReturnVoid(14, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          14
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #63  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}
}
