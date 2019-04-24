// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzatx, zzel, zzatv, 
//			zzatt

public final class zzaty extends zzej
	implements zzatx
{

	zzaty(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.gass.internal.IGassService");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.gass.internal.IGassService">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final zzatv zza(zzatt zzatt)
		throws RemoteException
	{
		Object obj = ((Object) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(((Parcel) (obj)), ((android.os.Parcelable) (zzatt)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		zzatt = ((zzatt) (((zzej)this).transactAndReadException(1, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #31  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) ((zzatv)zzel.zza(((Parcel) (zzatt)), zzatv.CREATOR)));
	//   11   17:aload_1         
	//   12   18:getstatic       #37  <Field android.os.Parcelable$Creator zzatv.CREATOR>
	//   13   21:invokestatic    #40  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   14   24:checkcast       #33  <Class zzatv>
	//   15   27:astore_2        
		((Parcel) (zzatt)).recycle();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #46  <Method void Parcel.recycle()>
		return ((zzatv) (obj));
	//   18   32:aload_2         
	//   19   33:areturn         
	}
}
