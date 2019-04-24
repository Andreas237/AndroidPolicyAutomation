// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.common.internal:
//			IGoogleCertificatesApi

public static class IGoogleCertificatesApi$Stub$Proxy extends zza
	implements IGoogleCertificatesApi
{

	public IObjectWrapper getGoogleCertificates()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(1, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #42  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #46  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public IObjectWrapper getGoogleReleaseCertificates()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(2, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #42  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #46  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googlecertificatesquery, IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		zzc.zza(parcel, ((android.os.Parcelable) (googlecertificatesquery)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #56  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
		googlecertificatesquery = ((GoogleCertificatesQuery) (((zza)this).transactAndReadException(5, parcel)));
	//    9   18:aload_0         
	//   10   19:iconst_5        
	//   11   20:aload           4
	//   12   22:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   13   25:astore_1        
		boolean flag = zzc.zza(((Parcel) (googlecertificatesquery)));
	//   14   26:aload_1         
	//   15   27:invokestatic    #62  <Method boolean zzc.zza(Parcel)>
	//   16   30:istore_3        
		((Parcel) (googlecertificatesquery)).recycle();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   19   35:iload_3         
	//   20   36:ireturn         
	}

	public boolean isGoogleReleaseSigned(String s, IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeString(s);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #68  <Method void Parcel.writeString(String)>
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
		s = ((String) (((zza)this).transactAndReadException(3, parcel)));
	//    9   18:aload_0         
	//   10   19:iconst_3        
	//   11   20:aload           4
	//   12   22:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   13   25:astore_1        
		boolean flag = zzc.zza(((Parcel) (s)));
	//   14   26:aload_1         
	//   15   27:invokestatic    #62  <Method boolean zzc.zza(Parcel)>
	//   16   30:istore_3        
		((Parcel) (s)).recycle();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   19   35:iload_3         
	//   20   36:ireturn         
	}

	public boolean isGoogleSigned(String s, IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeString(s);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #68  <Method void Parcel.writeString(String)>
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
		s = ((String) (((zza)this).transactAndReadException(4, parcel)));
	//    9   18:aload_0         
	//   10   19:iconst_4        
	//   11   20:aload           4
	//   12   22:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   13   25:astore_1        
		boolean flag = zzc.zza(((Parcel) (s)));
	//   14   26:aload_1         
	//   15   27:invokestatic    #62  <Method boolean zzc.zza(Parcel)>
	//   16   30:istore_3        
		((Parcel) (s)).recycle();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   19   35:iload_3         
	//   20   36:ireturn         
	}

	IGoogleCertificatesApi$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.IGoogleCertificatesApi">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
