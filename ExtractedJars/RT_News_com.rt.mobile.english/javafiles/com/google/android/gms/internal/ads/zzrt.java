// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzrr, zzel, zzlp, 
//			zzpw, zzpy, zzps, zzpu, 
//			zzlo, zzro

public final class zzrt extends zzej
	implements zzrr
{

	zzrt(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void cancelUnconfirmedClick()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(22, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          22
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void destroy()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(13, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          13
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final String getAdvertiser()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(7, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #39  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #42  <Method void Parcel.recycle()>
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
	//    4    6:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #39  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #42  <Method void Parcel.recycle()>
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
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #39  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #42  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final Bundle getExtras()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(20, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		Bundle bundle = (Bundle)zzel.zza(parcel, Bundle.CREATOR);
	//    6   11:aload_1         
	//    7   12:getstatic       #52  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    8   15:invokestatic    #58  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//    9   18:checkcast       #48  <Class Bundle>
	//   10   21:astore_2        
		parcel.recycle();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #42  <Method void Parcel.recycle()>
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
	//    4    6:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #39  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #42  <Method void Parcel.recycle()>
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
	//    4    6:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		java.util.ArrayList arraylist = zzel.zzb(parcel);
	//    6   10:aload_1         
	//    7   11:invokestatic    #65  <Method java.util.ArrayList zzel.zzb(Parcel)>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #42  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final String getMediationAdapterClassName()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(12, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #39  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #42  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final String getPrice()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(10, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #39  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #42  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final double getStarRating()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(8, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_3        
		double d = parcel.readDouble();
	//    6   11:aload_3         
	//    7   12:invokevirtual   #72  <Method double Parcel.readDouble()>
	//    8   15:dstore_1        
		parcel.recycle();
	//    9   16:aload_3         
	//   10   17:invokevirtual   #42  <Method void Parcel.recycle()>
		return d;
	//   11   20:dload_1         
	//   12   21:dreturn         
	}

	public final String getStore()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(9, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #39  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #42  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final zzlo getVideoController()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(11, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		zzlo zzlo = zzlp.zze(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #79  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #85  <Method zzlo zzlp.zze(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #42  <Method void Parcel.recycle()>
		return zzlo;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final void performClick(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #90  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(15, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          15
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final boolean recordImpression(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #90  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		bundle = ((Bundle) (((zzej)this).transactAndReadException(16, parcel)));
	//    6   10:aload_0         
	//    7   11:bipush          16
	//    8   13:aload_3         
	//    9   14:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   17:astore_1        
		boolean flag = zzel.zza(((Parcel) (bundle)));
	//   11   18:aload_1         
	//   12   19:invokestatic    #95  <Method boolean zzel.zza(Parcel)>
	//   13   22:istore_2        
		((Parcel) (bundle)).recycle();
	//   14   23:aload_1         
	//   15   24:invokevirtual   #42  <Method void Parcel.recycle()>
		return flag;
	//   16   27:iload_2         
	//   17   28:ireturn         
	}

	public final void reportTouchEvent(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #90  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(17, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          17
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void zza(zzro zzro)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (zzro)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #100 <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(21, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          21
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final zzpw zzjz()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(5, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   10:aload_2         
	//    7   11:invokevirtual   #79  <Method IBinder Parcel.readStrongBinder()>
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
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//   14   24:aload_1         
	//   15   25:ldc1            #104 <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//   16   27:invokeinterface #110 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   32:astore_3        
			if(iinterface instanceof zzpw)
	//*  18   33:aload_3         
	//*  19   34:instanceof      #112 <Class zzpw>
	//*  20   37:ifeq            48
				obj = ((Object) ((zzpw)iinterface));
	//   21   40:aload_3         
	//   22   41:checkcast       #112 <Class zzpw>
	//   23   44:astore_1        
			else
	//*  24   45:goto            57
				obj = ((Object) (new zzpy(((IBinder) (obj)))));
	//   25   48:new             #114 <Class zzpy>
	//   26   51:dup             
	//   27   52:aload_1         
	//   28   53:invokespecial   #116 <Method void zzpy(IBinder)>
	//   29   56:astore_1        
		}
		parcel.recycle();
	//   30   57:aload_2         
	//   31   58:invokevirtual   #42  <Method void Parcel.recycle()>
		return ((zzpw) (obj));
	//   32   61:aload_1         
	//   33   62:areturn         
	}

	public final IObjectWrapper zzka()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(18, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          18
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #79  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #124 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #42  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final IObjectWrapper zzke()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(19, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          19
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #79  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #124 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #42  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final zzps zzkf()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(14, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          14
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #34  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   11:aload_2         
	//    7   12:invokevirtual   #79  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:astore_1        
		if(obj == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       25
		{
			obj = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		} else
	//*  13   22:goto            58
		{
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
	//   14   25:aload_1         
	//   15   26:ldc1            #129 <String "com.google.android.gms.ads.internal.formats.client.IAttributionInfo">
	//   16   28:invokeinterface #110 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   33:astore_3        
			if(iinterface instanceof zzps)
	//*  18   34:aload_3         
	//*  19   35:instanceof      #131 <Class zzps>
	//*  20   38:ifeq            49
				obj = ((Object) ((zzps)iinterface));
	//   21   41:aload_3         
	//   22   42:checkcast       #131 <Class zzps>
	//   23   45:astore_1        
			else
	//*  24   46:goto            58
				obj = ((Object) (new zzpu(((IBinder) (obj)))));
	//   25   49:new             #133 <Class zzpu>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #134 <Method void zzpu(IBinder)>
	//   29   57:astore_1        
		}
		parcel.recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #42  <Method void Parcel.recycle()>
		return ((zzps) (obj));
	//   32   62:aload_1         
	//   33   63:areturn         
	}
}
