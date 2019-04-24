// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzkn, zzel, zzkk, 
//			zzkm, zzpl, zzqw, zzqz, 
//			zzri, zzjn, zzrl, zzrf, 
//			zzrc, zzkh, zzlg

public final class zzkp extends zzej
	implements zzkn
{

	zzkp(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilder">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void zza(PublisherAdViewOptions publisheradviewoptions)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.Parcelable) (publisheradviewoptions)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(9, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          9
	//    8   13:aload_2         
	//    9   14:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void zza(zzpl zzpl)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.Parcelable) (zzpl)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(6, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:aload_2         
	//    9   14:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void zza(zzqw zzqw)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (zzqw)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #37  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(3, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void zza(zzqz zzqz)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (zzqz)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #37  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(4, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void zza(zzri zzri, zzjn zzjn)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.IInterface) (zzri)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #37  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.Parcelable) (zzjn)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(8, parcel);
	//    9   15:aload_0         
	//   10   16:bipush          8
	//   11   18:aload_3         
	//   12   19:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   22:return          
	}

	public final void zza(zzrl zzrl)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (zzrl)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #37  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(10, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          10
	//    8   13:aload_2         
	//    9   14:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void zza(String s, zzrf zzrf, zzrc zzrc)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeString(s);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #47  <Method void Parcel.writeString(String)>
		zzel.zza(parcel, ((android.os.IInterface) (zzrf)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #37  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (zzrc)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #37  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(5, parcel);
	//   12   24:aload_0         
	//   13   25:iconst_5        
	//   14   26:aload           4
	//   15   28:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   16   31:return          
	}

	public final void zzb(zzkh zzkh)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (zzkh)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #37  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(2, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void zzb(zzlg zzlg)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (zzlg)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #37  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(7, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final zzkk zzdh()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(1, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #56  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   10:aload_2         
	//    7   11:invokevirtual   #60  <Method IBinder Parcel.readStrongBinder()>
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
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
	//   14   24:aload_1         
	//   15   25:ldc1            #62  <String "com.google.android.gms.ads.internal.client.IAdLoader">
	//   16   27:invokeinterface #68  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   32:astore_3        
			if(iinterface instanceof zzkk)
	//*  18   33:aload_3         
	//*  19   34:instanceof      #70  <Class zzkk>
	//*  20   37:ifeq            48
				obj = ((Object) ((zzkk)iinterface));
	//   21   40:aload_3         
	//   22   41:checkcast       #70  <Class zzkk>
	//   23   44:astore_1        
			else
	//*  24   45:goto            57
				obj = ((Object) (new zzkm(((IBinder) (obj)))));
	//   25   48:new             #72  <Class zzkm>
	//   26   51:dup             
	//   27   52:aload_1         
	//   28   53:invokespecial   #74  <Method void zzkm(IBinder)>
	//   29   56:astore_1        
		}
		parcel.recycle();
	//   30   57:aload_2         
	//   31   58:invokevirtual   #78  <Method void Parcel.recycle()>
		return ((zzkk) (obj));
	//   32   61:aload_1         
	//   33   62:areturn         
	}
}
