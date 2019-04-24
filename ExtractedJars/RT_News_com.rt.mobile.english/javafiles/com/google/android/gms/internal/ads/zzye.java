// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzyc, zzel, zzlp, 
//			zzpt, zzpx, zzlo, zzps, 
//			zzpw

public final class zzye extends zzej
	implements zzyc
{

	zzye(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final String getAdvertiser()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(7, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #31  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final String getBody()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(4, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return s;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final String getCallToAction()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(6, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #31  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final Bundle getExtras()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(13, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          13
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		Bundle bundle = (Bundle)zzel.zza(parcel, Bundle.CREATOR);
	//    6   11:aload_1         
	//    7   12:getstatic       #46  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    8   15:invokestatic    #52  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//    9   18:checkcast       #42  <Class Bundle>
	//   10   21:astore_2        
		parcel.recycle();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #35  <Method void Parcel.recycle()>
		return bundle;
	//   13   26:aload_2         
	//   14   27:areturn         
	}

	public final String getHeadline()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(2, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return s;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final List getImages()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(3, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		java.util.ArrayList arraylist = zzel.zzb(parcel);
	//    6   10:aload_1         
	//    7   11:invokestatic    #59  <Method java.util.ArrayList zzel.zzb(Parcel)>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final boolean getOverrideClickHandling()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(12, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzel.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #64  <Method boolean zzel.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean getOverrideImpressionRecording()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(11, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzel.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #64  <Method boolean zzel.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final zzlo getVideoController()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(16, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		zzlo zzlo = zzlp.zze(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #71  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #77  <Method zzlo zzlp.zze(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #35  <Method void Parcel.recycle()>
		return zzlo;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final void recordImpression()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(8, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #82  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void zzb(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #86  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #86  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper2)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #86  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(22, parcel);
	//   12   24:aload_0         
	//   13   25:bipush          22
	//   14   27:aload           4
	//   15   29:invokevirtual   #82  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   16   32:return          
	}

	public final void zzj(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #86  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(9, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          9
	//    8   13:aload_2         
	//    9   14:invokevirtual   #82  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void zzk(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #86  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(10, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          10
	//    8   13:aload_2         
	//    9   14:invokevirtual   #82  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final IObjectWrapper zzke()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(21, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          21
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #71  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #97  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #35  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final zzps zzkf()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(19, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          19
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		zzps zzps = zzpt.zzg(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #71  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #105 <Method zzps zzpt.zzg(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #35  <Method void Parcel.recycle()>
		return zzps;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final zzpw zzkg()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(5, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		zzpw zzpw = zzpx.zzh(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #71  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #113 <Method zzpw zzpx.zzh(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #35  <Method void Parcel.recycle()>
		return zzpw;
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public final void zzl(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #86  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(14, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          14
	//    8   13:aload_2         
	//    9   14:invokevirtual   #82  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final IObjectWrapper zzmv()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(15, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          15
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #71  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #97  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #35  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final IObjectWrapper zzmw()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(20, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #71  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #97  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #35  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}
}
