// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzaen, zzel, zzaej, 
//			zzaef, zzaeq, zzaey, zzaet

public final class zzaep extends zzej
	implements zzaen
{

	zzaep(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.request.IAdRequestService">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void zza(zzaef zzaef, zzaeq zzaeq)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.Parcelable) (zzaef)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		zzel.zza(parcel, ((android.os.IInterface) (zzaeq)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #30  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(2, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_2        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #34  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   21:return          
	}

	public final void zza(zzaey zzaey, zzaet zzaet)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.Parcelable) (zzaey)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		zzel.zza(parcel, ((android.os.IInterface) (zzaet)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #30  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(4, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_4        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #34  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   21:return          
	}

	public final zzaej zzb(zzaef zzaef)
		throws RemoteException
	{
		Object obj = ((Object) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(((Parcel) (obj)), ((android.os.Parcelable) (zzaef)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		zzaef = ((zzaef) (((zzej)this).transactAndReadException(1, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) ((zzaej)zzel.zza(((Parcel) (zzaef)), zzaej.CREATOR)));
	//   11   17:aload_1         
	//   12   18:getstatic       #48  <Field android.os.Parcelable$Creator zzaej.CREATOR>
	//   13   21:invokestatic    #51  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   14   24:checkcast       #44  <Class zzaej>
	//   15   27:astore_2        
		((Parcel) (zzaef)).recycle();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #57  <Method void Parcel.recycle()>
		return ((zzaej) (obj));
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public final void zzb(zzaey zzaey, zzaet zzaet)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.Parcelable) (zzaey)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		zzel.zza(parcel, ((android.os.IInterface) (zzaet)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #30  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(5, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #34  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   21:return          
	}
}
