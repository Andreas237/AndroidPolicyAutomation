// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzpw, zzel

public final class zzpy extends zzej
	implements zzpw
{

	zzpy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final double getScale()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(3, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_3        
		double d = parcel.readDouble();
	//    6   10:aload_3         
	//    7   11:invokevirtual   #31  <Method double Parcel.readDouble()>
	//    8   14:dstore_1        
		parcel.recycle();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return d;
	//   11   19:dload_1         
	//   12   20:dreturn         
	}

	public final Uri getUri()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(2, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		Uri uri = (Uri)zzel.zza(parcel, Uri.CREATOR);
	//    6   10:aload_1         
	//    7   11:getstatic       #44  <Field android.os.Parcelable$Creator Uri.CREATOR>
	//    8   14:invokestatic    #50  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//    9   17:checkcast       #40  <Class Uri>
	//   10   20:astore_2        
		parcel.recycle();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #35  <Method void Parcel.recycle()>
		return uri;
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	public final IObjectWrapper zzjy()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(1, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #56  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #62  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #35  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   22:aload_2         
	//   13   23:areturn         
	}
}
