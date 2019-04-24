// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzqk, zzel, zzlp, 
//			zzpw, zzpy, zzps, zzpu, 
//			zzlo

public final class zzqm extends zzej
	implements zzqk
{

	zzqm(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void destroy()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(12, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final String getBody()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(5, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #38  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #41  <Method void Parcel.recycle()>
		return s;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final String getCallToAction()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(7, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #38  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #41  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final Bundle getExtras()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(11, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		Bundle bundle = (Bundle)zzel.zza(parcel, Bundle.CREATOR);
	//    6   11:aload_1         
	//    7   12:getstatic       #50  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    8   15:invokestatic    #56  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//    9   18:checkcast       #46  <Class Bundle>
	//   10   21:astore_2        
		parcel.recycle();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #41  <Method void Parcel.recycle()>
		return bundle;
	//   13   26:aload_2         
	//   14   27:areturn         
	}

	public final String getHeadline()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(3, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #38  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #41  <Method void Parcel.recycle()>
		return s;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final List getImages()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(4, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		java.util.ArrayList arraylist = zzel.zzb(parcel);
	//    6   10:aload_1         
	//    7   11:invokestatic    #63  <Method java.util.ArrayList zzel.zzb(Parcel)>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #41  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final String getMediationAdapterClassName()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(19, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          19
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #38  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #41  <Method void Parcel.recycle()>
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
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #38  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #41  <Method void Parcel.recycle()>
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
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_3        
		double d = parcel.readDouble();
	//    6   11:aload_3         
	//    7   12:invokevirtual   #70  <Method double Parcel.readDouble()>
	//    8   15:dstore_1        
		parcel.recycle();
	//    9   16:aload_3         
	//   10   17:invokevirtual   #41  <Method void Parcel.recycle()>
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
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #38  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #41  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final zzlo getVideoController()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(13, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          13
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		zzlo zzlo = zzlp.zze(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #77  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #83  <Method zzlo zzlp.zze(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #41  <Method void Parcel.recycle()>
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
	//    5    7:invokestatic    #88  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(14, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          14
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
	//    5    7:invokestatic    #88  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		bundle = ((Bundle) (((zzej)this).transactAndReadException(15, parcel)));
	//    6   10:aload_0         
	//    7   11:bipush          15
	//    8   13:aload_3         
	//    9   14:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   17:astore_1        
		boolean flag = zzel.zza(((Parcel) (bundle)));
	//   11   18:aload_1         
	//   12   19:invokestatic    #93  <Method boolean zzel.zza(Parcel)>
	//   13   22:istore_2        
		((Parcel) (bundle)).recycle();
	//   14   23:aload_1         
	//   15   24:invokevirtual   #41  <Method void Parcel.recycle()>
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
	//    5    7:invokestatic    #88  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(16, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          16
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final zzpw zzjz()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(6, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   11:aload_2         
	//    7   12:invokevirtual   #77  <Method IBinder Parcel.readStrongBinder()>
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
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//   14   25:aload_1         
	//   15   26:ldc1            #98  <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//   16   28:invokeinterface #104 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   33:astore_3        
			if(iinterface instanceof zzpw)
	//*  18   34:aload_3         
	//*  19   35:instanceof      #106 <Class zzpw>
	//*  20   38:ifeq            49
				obj = ((Object) ((zzpw)iinterface));
	//   21   41:aload_3         
	//   22   42:checkcast       #106 <Class zzpw>
	//   23   45:astore_1        
			else
	//*  24   46:goto            58
				obj = ((Object) (new zzpy(((IBinder) (obj)))));
	//   25   49:new             #108 <Class zzpy>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #110 <Method void zzpy(IBinder)>
	//   29   57:astore_1        
		}
		parcel.recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #41  <Method void Parcel.recycle()>
		return ((zzpw) (obj));
	//   32   62:aload_1         
	//   33   63:areturn         
	}

	public final IObjectWrapper zzka()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(2, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #77  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #118 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #41  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public final IObjectWrapper zzke()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(18, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          18
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #77  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #118 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #41  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final zzps zzkf()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(17, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          17
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   11:aload_2         
	//    7   12:invokevirtual   #77  <Method IBinder Parcel.readStrongBinder()>
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
	//   15   26:ldc1            #123 <String "com.google.android.gms.ads.internal.formats.client.IAttributionInfo">
	//   16   28:invokeinterface #104 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   33:astore_3        
			if(iinterface instanceof zzps)
	//*  18   34:aload_3         
	//*  19   35:instanceof      #125 <Class zzps>
	//*  20   38:ifeq            49
				obj = ((Object) ((zzps)iinterface));
	//   21   41:aload_3         
	//   22   42:checkcast       #125 <Class zzps>
	//   23   45:astore_1        
			else
	//*  24   46:goto            58
				obj = ((Object) (new zzpu(((IBinder) (obj)))));
	//   25   49:new             #127 <Class zzpu>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #128 <Method void zzpu(IBinder)>
	//   29   57:astore_1        
		}
		parcel.recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #41  <Method void Parcel.recycle()>
		return ((zzps) (obj));
	//   32   62:aload_1         
	//   33   63:areturn         
	}
}
