// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzld, zzel, zzkn, 
//			zzkp, zzaaq, zzks, zzku, 
//			zzaba, zzqb, zzqg, zzaha, 
//			zzlj, zzll, zzxn, zzaap, 
//			zzjn, zzaaz, zzqa, zzqf, 
//			zzagz

public final class zzlf extends zzej
	implements zzld
{

	zzlf(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IClientApi");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IClientApi">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final zzkn createAdLoaderBuilder(IObjectWrapper iobjectwrapper, String s, zzxn zzxn, int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          5
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeString(s);
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokevirtual   #34  <Method void Parcel.writeString(String)>
		zzel.zza(parcel, ((android.os.IInterface) (zzxn)));
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//   12   24:aload           5
	//   13   26:iload           4
	//   14   28:invokevirtual   #38  <Method void Parcel.writeInt(int)>
		s = ((String) (((zzej)this).transactAndReadException(3, parcel)));
	//   15   31:aload_0         
	//   16   32:iconst_3        
	//   17   33:aload           5
	//   18   35:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   19   38:astore_2        
		iobjectwrapper = ((IObjectWrapper) (((Parcel) (s)).readStrongBinder()));
	//   20   39:aload_2         
	//   21   40:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   22   43:astore_1        
		if(iobjectwrapper == null)
	//*  23   44:aload_1         
	//*  24   45:ifnonnull       53
		{
			iobjectwrapper = null;
	//   25   48:aconst_null     
	//   26   49:astore_1        
		} else
	//*  27   50:goto            86
		{
			zzxn = ((zzxn) (((IBinder) (iobjectwrapper)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder")));
	//   28   53:aload_1         
	//   29   54:ldc1            #48  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilder">
	//   30   56:invokeinterface #54  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   31   61:astore_3        
			if(zzxn instanceof zzkn)
	//*  32   62:aload_3         
	//*  33   63:instanceof      #56  <Class zzkn>
	//*  34   66:ifeq            77
				iobjectwrapper = ((IObjectWrapper) ((zzkn)zzxn));
	//   35   69:aload_3         
	//   36   70:checkcast       #56  <Class zzkn>
	//   37   73:astore_1        
			else
	//*  38   74:goto            86
				iobjectwrapper = ((IObjectWrapper) (new zzkp(((IBinder) (iobjectwrapper)))));
	//   39   77:new             #58  <Class zzkp>
	//   40   80:dup             
	//   41   81:aload_1         
	//   42   82:invokespecial   #60  <Method void zzkp(IBinder)>
	//   43   85:astore_1        
		}
		((Parcel) (s)).recycle();
	//   44   86:aload_2         
	//   45   87:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzkn) (iobjectwrapper));
	//   46   90:aload_1         
	//   47   91:areturn         
	}

	public final zzaap createAdOverlay(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Object obj = ((Object) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(((Parcel) (obj)), ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(8, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:bipush          8
	//    8   13:aload_2         
	//    9   14:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   17:astore_1        
		obj = ((Object) (zzaaq.zzu(((Parcel) (iobjectwrapper)).readStrongBinder())));
	//   11   18:aload_1         
	//   12   19:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   13   22:invokestatic    #73  <Method zzaap zzaaq.zzu(IBinder)>
	//   14   25:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   15   26:aload_1         
	//   16   27:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzaap) (obj));
	//   17   30:aload_2         
	//   18   31:areturn         
	}

	public final zzks createBannerAdManager(IObjectWrapper iobjectwrapper, zzjn zzjn, String s, zzxn zzxn, int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          6
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.Parcelable) (zzjn)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #78  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokevirtual   #34  <Method void Parcel.writeString(String)>
		zzel.zza(parcel, ((android.os.IInterface) (zzxn)));
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//   15   31:aload           6
	//   16   33:iload           5
	//   17   35:invokevirtual   #38  <Method void Parcel.writeInt(int)>
		zzjn = ((zzjn) (((zzej)this).transactAndReadException(1, parcel)));
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:aload           6
	//   21   42:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   22   45:astore_2        
		iobjectwrapper = ((IObjectWrapper) (((Parcel) (zzjn)).readStrongBinder()));
	//   23   46:aload_2         
	//   24   47:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   25   50:astore_1        
		if(iobjectwrapper == null)
	//*  26   51:aload_1         
	//*  27   52:ifnonnull       60
		{
			iobjectwrapper = null;
	//   28   55:aconst_null     
	//   29   56:astore_1        
		} else
	//*  30   57:goto            93
		{
			s = ((String) (((IBinder) (iobjectwrapper)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")));
	//   31   60:aload_1         
	//   32   61:ldc1            #80  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//   33   63:invokeinterface #54  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   34   68:astore_3        
			if(s instanceof zzks)
	//*  35   69:aload_3         
	//*  36   70:instanceof      #82  <Class zzks>
	//*  37   73:ifeq            84
				iobjectwrapper = ((IObjectWrapper) ((zzks)s));
	//   38   76:aload_3         
	//   39   77:checkcast       #82  <Class zzks>
	//   40   80:astore_1        
			else
	//*  41   81:goto            93
				iobjectwrapper = ((IObjectWrapper) (new zzku(((IBinder) (iobjectwrapper)))));
	//   42   84:new             #84  <Class zzku>
	//   43   87:dup             
	//   44   88:aload_1         
	//   45   89:invokespecial   #85  <Method void zzku(IBinder)>
	//   46   92:astore_1        
		}
		((Parcel) (zzjn)).recycle();
	//   47   93:aload_2         
	//   48   94:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzks) (iobjectwrapper));
	//   49   97:aload_1         
	//   50   98:areturn         
	}

	public final zzaaz createInAppPurchaseManager(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Object obj = ((Object) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(((Parcel) (obj)), ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(7, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   17:astore_1        
		obj = ((Object) (zzaba.zzw(((Parcel) (iobjectwrapper)).readStrongBinder())));
	//   11   18:aload_1         
	//   12   19:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   13   22:invokestatic    #93  <Method zzaaz zzaba.zzw(IBinder)>
	//   14   25:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   15   26:aload_1         
	//   16   27:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzaaz) (obj));
	//   17   30:aload_2         
	//   18   31:areturn         
	}

	public final zzks createInterstitialAdManager(IObjectWrapper iobjectwrapper, zzjn zzjn, String s, zzxn zzxn, int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          6
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.Parcelable) (zzjn)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #78  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokevirtual   #34  <Method void Parcel.writeString(String)>
		zzel.zza(parcel, ((android.os.IInterface) (zzxn)));
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//   15   31:aload           6
	//   16   33:iload           5
	//   17   35:invokevirtual   #38  <Method void Parcel.writeInt(int)>
		zzjn = ((zzjn) (((zzej)this).transactAndReadException(2, parcel)));
	//   18   38:aload_0         
	//   19   39:iconst_2        
	//   20   40:aload           6
	//   21   42:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   22   45:astore_2        
		iobjectwrapper = ((IObjectWrapper) (((Parcel) (zzjn)).readStrongBinder()));
	//   23   46:aload_2         
	//   24   47:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   25   50:astore_1        
		if(iobjectwrapper == null)
	//*  26   51:aload_1         
	//*  27   52:ifnonnull       60
		{
			iobjectwrapper = null;
	//   28   55:aconst_null     
	//   29   56:astore_1        
		} else
	//*  30   57:goto            93
		{
			s = ((String) (((IBinder) (iobjectwrapper)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")));
	//   31   60:aload_1         
	//   32   61:ldc1            #80  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//   33   63:invokeinterface #54  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   34   68:astore_3        
			if(s instanceof zzks)
	//*  35   69:aload_3         
	//*  36   70:instanceof      #82  <Class zzks>
	//*  37   73:ifeq            84
				iobjectwrapper = ((IObjectWrapper) ((zzks)s));
	//   38   76:aload_3         
	//   39   77:checkcast       #82  <Class zzks>
	//   40   80:astore_1        
			else
	//*  41   81:goto            93
				iobjectwrapper = ((IObjectWrapper) (new zzku(((IBinder) (iobjectwrapper)))));
	//   42   84:new             #84  <Class zzku>
	//   43   87:dup             
	//   44   88:aload_1         
	//   45   89:invokespecial   #85  <Method void zzku(IBinder)>
	//   46   92:astore_1        
		}
		((Parcel) (zzjn)).recycle();
	//   47   93:aload_2         
	//   48   94:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzks) (iobjectwrapper));
	//   49   97:aload_1         
	//   50   98:areturn         
	}

	public final zzqa createNativeAdViewDelegate(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(5, parcel)));
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   13   21:astore_1        
		iobjectwrapper1 = ((IObjectWrapper) (zzqb.zzi(((Parcel) (iobjectwrapper)).readStrongBinder())));
	//   14   22:aload_1         
	//   15   23:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   16   26:invokestatic    #102 <Method zzqa zzqb.zzi(IBinder)>
	//   17   29:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   18   30:aload_1         
	//   19   31:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzqa) (iobjectwrapper1));
	//   20   34:aload_2         
	//   21   35:areturn         
	}

	public final zzqf createNativeAdViewHolderDelegate(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper2)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(11, parcel)));
	//   12   24:aload_0         
	//   13   25:bipush          11
	//   14   27:aload           4
	//   15   29:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   16   32:astore_1        
		iobjectwrapper1 = ((IObjectWrapper) (zzqg.zzj(((Parcel) (iobjectwrapper)).readStrongBinder())));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   19   37:invokestatic    #110 <Method zzqf zzqg.zzj(IBinder)>
	//   20   40:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzqf) (iobjectwrapper1));
	//   23   45:aload_2         
	//   24   46:areturn         
	}

	public final zzagz createRewardedVideoAd(IObjectWrapper iobjectwrapper, zzxn zzxn, int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (zzxn)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//    9   18:aload           4
	//   10   20:iload_3         
	//   11   21:invokevirtual   #38  <Method void Parcel.writeInt(int)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(6, parcel)));
	//   12   24:aload_0         
	//   13   25:bipush          6
	//   14   27:aload           4
	//   15   29:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   16   32:astore_1        
		zzxn = ((zzxn) (zzaha.zzy(((Parcel) (iobjectwrapper)).readStrongBinder())));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   19   37:invokestatic    #118 <Method zzagz zzaha.zzy(IBinder)>
	//   20   40:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzagz) (zzxn));
	//   23   45:aload_2         
	//   24   46:areturn         
	}

	public final zzks createSearchAdManager(IObjectWrapper iobjectwrapper, zzjn zzjn, String s, int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          5
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.Parcelable) (zzjn)));
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokestatic    #78  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokevirtual   #34  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//   12   24:aload           5
	//   13   26:iload           4
	//   14   28:invokevirtual   #38  <Method void Parcel.writeInt(int)>
		zzjn = ((zzjn) (((zzej)this).transactAndReadException(10, parcel)));
	//   15   31:aload_0         
	//   16   32:bipush          10
	//   17   34:aload           5
	//   18   36:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   19   39:astore_2        
		iobjectwrapper = ((IObjectWrapper) (((Parcel) (zzjn)).readStrongBinder()));
	//   20   40:aload_2         
	//   21   41:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   22   44:astore_1        
		if(iobjectwrapper == null)
	//*  23   45:aload_1         
	//*  24   46:ifnonnull       54
		{
			iobjectwrapper = null;
	//   25   49:aconst_null     
	//   26   50:astore_1        
		} else
	//*  27   51:goto            87
		{
			s = ((String) (((IBinder) (iobjectwrapper)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")));
	//   28   54:aload_1         
	//   29   55:ldc1            #80  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//   30   57:invokeinterface #54  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   31   62:astore_3        
			if(s instanceof zzks)
	//*  32   63:aload_3         
	//*  33   64:instanceof      #82  <Class zzks>
	//*  34   67:ifeq            78
				iobjectwrapper = ((IObjectWrapper) ((zzks)s));
	//   35   70:aload_3         
	//   36   71:checkcast       #82  <Class zzks>
	//   37   74:astore_1        
			else
	//*  38   75:goto            87
				iobjectwrapper = ((IObjectWrapper) (new zzku(((IBinder) (iobjectwrapper)))));
	//   39   78:new             #84  <Class zzku>
	//   40   81:dup             
	//   41   82:aload_1         
	//   42   83:invokespecial   #85  <Method void zzku(IBinder)>
	//   43   86:astore_1        
		}
		((Parcel) (zzjn)).recycle();
	//   44   87:aload_2         
	//   45   88:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzks) (iobjectwrapper));
	//   46   91:aload_1         
	//   47   92:areturn         
	}

	public final zzlj getMobileAdsSettingsManager(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel = ((zzej)this).transactAndReadException(4, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_2        
		iobjectwrapper = ((IObjectWrapper) (parcel.readStrongBinder()));
	//   11   17:aload_2         
	//   12   18:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   13   21:astore_1        
		if(iobjectwrapper == null)
	//*  14   22:aload_1         
	//*  15   23:ifnonnull       31
		{
			iobjectwrapper = null;
	//   16   26:aconst_null     
	//   17   27:astore_1        
		} else
	//*  18   28:goto            64
		{
			android.os.IInterface iinterface = ((IBinder) (iobjectwrapper)).queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
	//   19   31:aload_1         
	//   20   32:ldc1            #124 <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager">
	//   21   34:invokeinterface #54  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   22   39:astore_3        
			if(iinterface instanceof zzlj)
	//*  23   40:aload_3         
	//*  24   41:instanceof      #126 <Class zzlj>
	//*  25   44:ifeq            55
				iobjectwrapper = ((IObjectWrapper) ((zzlj)iinterface));
	//   26   47:aload_3         
	//   27   48:checkcast       #126 <Class zzlj>
	//   28   51:astore_1        
			else
	//*  29   52:goto            64
				iobjectwrapper = ((IObjectWrapper) (new zzll(((IBinder) (iobjectwrapper)))));
	//   30   55:new             #128 <Class zzll>
	//   31   58:dup             
	//   32   59:aload_1         
	//   33   60:invokespecial   #129 <Method void zzll(IBinder)>
	//   34   63:astore_1        
		}
		parcel.recycle();
	//   35   64:aload_2         
	//   36   65:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzlj) (iobjectwrapper));
	//   37   68:aload_1         
	//   38   69:areturn         
	}

	public final zzlj getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iobjectwrapper, int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #38  <Method void Parcel.writeInt(int)>
		parcel = ((zzej)this).transactAndReadException(9, parcel);
	//    9   15:aload_0         
	//   10   16:bipush          9
	//   11   18:aload_3         
	//   12   19:invokevirtual   #42  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   13   22:astore_3        
		iobjectwrapper = ((IObjectWrapper) (parcel.readStrongBinder()));
	//   14   23:aload_3         
	//   15   24:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   16   27:astore_1        
		if(iobjectwrapper == null)
	//*  17   28:aload_1         
	//*  18   29:ifnonnull       37
		{
			iobjectwrapper = null;
	//   19   32:aconst_null     
	//   20   33:astore_1        
		} else
	//*  21   34:goto            73
		{
			android.os.IInterface iinterface = ((IBinder) (iobjectwrapper)).queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
	//   22   37:aload_1         
	//   23   38:ldc1            #124 <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager">
	//   24   40:invokeinterface #54  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   25   45:astore          4
			if(iinterface instanceof zzlj)
	//*  26   47:aload           4
	//*  27   49:instanceof      #126 <Class zzlj>
	//*  28   52:ifeq            64
				iobjectwrapper = ((IObjectWrapper) ((zzlj)iinterface));
	//   29   55:aload           4
	//   30   57:checkcast       #126 <Class zzlj>
	//   31   60:astore_1        
			else
	//*  32   61:goto            73
				iobjectwrapper = ((IObjectWrapper) (new zzll(((IBinder) (iobjectwrapper)))));
	//   33   64:new             #128 <Class zzll>
	//   34   67:dup             
	//   35   68:aload_1         
	//   36   69:invokespecial   #129 <Method void zzll(IBinder)>
	//   37   72:astore_1        
		}
		parcel.recycle();
	//   38   73:aload_3         
	//   39   74:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((zzlj) (iobjectwrapper));
	//   40   77:aload_1         
	//   41   78:areturn         
	}
}
