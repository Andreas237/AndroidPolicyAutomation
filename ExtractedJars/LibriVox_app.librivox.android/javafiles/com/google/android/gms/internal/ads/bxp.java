// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bxn, bck, bwx, 
//			bwz, no, bxc, bxe, 
//			nz, ck, cp, tv, 
//			bxu, bxw, km, nn, 
//			zzwf, nx, cj, co, 
//			tu

public final class bxp extends bci
	implements bxn
{

	bxp(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IClientApi");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IClientApi">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final bwx createAdLoaderBuilder(a a, String s, km km, int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          5
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeString(s);
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokevirtual   #32  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (km)));
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//   12   24:aload           5
	//   13   26:iload           4
	//   14   28:invokevirtual   #36  <Method void Parcel.writeInt(int)>
		s = ((String) (((bci)this).a(3, parcel)));
	//   15   31:aload_0         
	//   16   32:iconst_3        
	//   17   33:aload           5
	//   18   35:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   19   38:astore_2        
		a = ((a) (((Parcel) (s)).readStrongBinder()));
	//   20   39:aload_2         
	//   21   40:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   22   43:astore_1        
		if(a == null)
	//*  23   44:aload_1         
	//*  24   45:ifnonnull       53
		{
			a = null;
	//   25   48:aconst_null     
	//   26   49:astore_1        
		} else
	//*  27   50:goto            86
		{
			km = ((km) (((IBinder) (a)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder")));
	//   28   53:aload_1         
	//   29   54:ldc1            #45  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilder">
	//   30   56:invokeinterface #51  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   31   61:astore_3        
			if(km instanceof bwx)
	//*  32   62:aload_3         
	//*  33   63:instanceof      #53  <Class bwx>
	//*  34   66:ifeq            77
				a = ((a) ((bwx)km));
	//   35   69:aload_3         
	//   36   70:checkcast       #53  <Class bwx>
	//   37   73:astore_1        
			else
	//*  38   74:goto            86
				a = ((a) (new bwz(((IBinder) (a)))));
	//   39   77:new             #55  <Class bwz>
	//   40   80:dup             
	//   41   81:aload_1         
	//   42   82:invokespecial   #57  <Method void bwz(IBinder)>
	//   43   85:astore_1        
		}
		((Parcel) (s)).recycle();
	//   44   86:aload_2         
	//   45   87:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((bwx) (a));
	//   46   90:aload_1         
	//   47   91:areturn         
	}

	public final nn createAdOverlay(a a)
	{
		Object obj = ((Object) (((bci)this).z()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(((Parcel) (obj)), ((android.os.IInterface) (a)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		a = ((a) (((bci)this).a(8, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:bipush          8
	//    8   13:aload_2         
	//    9   14:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   10   17:astore_1        
		obj = ((Object) (com.google.android.gms.internal.ads.no.a(((Parcel) (a)).readStrongBinder())));
	//   11   18:aload_1         
	//   12   19:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   13   22:invokestatic    #68  <Method nn com.google.android.gms.internal.ads.no.a(IBinder)>
	//   14   25:astore_2        
		((Parcel) (a)).recycle();
	//   15   26:aload_1         
	//   16   27:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((nn) (obj));
	//   17   30:aload_2         
	//   18   31:areturn         
	}

	public final bxc createBannerAdManager(a a, zzwf zzwf, String s, km km, int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          6
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a)));
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwf)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #73  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokevirtual   #32  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (km)));
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//   15   31:aload           6
	//   16   33:iload           5
	//   17   35:invokevirtual   #36  <Method void Parcel.writeInt(int)>
		zzwf = ((zzwf) (((bci)this).a(1, parcel)));
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:aload           6
	//   21   42:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   22   45:astore_2        
		a = ((a) (((Parcel) (zzwf)).readStrongBinder()));
	//   23   46:aload_2         
	//   24   47:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   25   50:astore_1        
		if(a == null)
	//*  26   51:aload_1         
	//*  27   52:ifnonnull       60
		{
			a = null;
	//   28   55:aconst_null     
	//   29   56:astore_1        
		} else
	//*  30   57:goto            93
		{
			s = ((String) (((IBinder) (a)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")));
	//   31   60:aload_1         
	//   32   61:ldc1            #75  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//   33   63:invokeinterface #51  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   34   68:astore_3        
			if(s instanceof bxc)
	//*  35   69:aload_3         
	//*  36   70:instanceof      #77  <Class bxc>
	//*  37   73:ifeq            84
				a = ((a) ((bxc)s));
	//   38   76:aload_3         
	//   39   77:checkcast       #77  <Class bxc>
	//   40   80:astore_1        
			else
	//*  41   81:goto            93
				a = ((a) (new bxe(((IBinder) (a)))));
	//   42   84:new             #79  <Class bxe>
	//   43   87:dup             
	//   44   88:aload_1         
	//   45   89:invokespecial   #80  <Method void bxe(IBinder)>
	//   46   92:astore_1        
		}
		((Parcel) (zzwf)).recycle();
	//   47   93:aload_2         
	//   48   94:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((bxc) (a));
	//   49   97:aload_1         
	//   50   98:areturn         
	}

	public final nx createInAppPurchaseManager(a a)
	{
		Object obj = ((Object) (((bci)this).z()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(((Parcel) (obj)), ((android.os.IInterface) (a)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		a = ((a) (((bci)this).a(7, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   10   17:astore_1        
		obj = ((Object) (com.google.android.gms.internal.ads.nz.a(((Parcel) (a)).readStrongBinder())));
	//   11   18:aload_1         
	//   12   19:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   13   22:invokestatic    #87  <Method nx com.google.android.gms.internal.ads.nz.a(IBinder)>
	//   14   25:astore_2        
		((Parcel) (a)).recycle();
	//   15   26:aload_1         
	//   16   27:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((nx) (obj));
	//   17   30:aload_2         
	//   18   31:areturn         
	}

	public final bxc createInterstitialAdManager(a a, zzwf zzwf, String s, km km, int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          6
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a)));
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwf)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #73  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokevirtual   #32  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (km)));
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//   15   31:aload           6
	//   16   33:iload           5
	//   17   35:invokevirtual   #36  <Method void Parcel.writeInt(int)>
		zzwf = ((zzwf) (((bci)this).a(2, parcel)));
	//   18   38:aload_0         
	//   19   39:iconst_2        
	//   20   40:aload           6
	//   21   42:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   22   45:astore_2        
		a = ((a) (((Parcel) (zzwf)).readStrongBinder()));
	//   23   46:aload_2         
	//   24   47:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   25   50:astore_1        
		if(a == null)
	//*  26   51:aload_1         
	//*  27   52:ifnonnull       60
		{
			a = null;
	//   28   55:aconst_null     
	//   29   56:astore_1        
		} else
	//*  30   57:goto            93
		{
			s = ((String) (((IBinder) (a)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")));
	//   31   60:aload_1         
	//   32   61:ldc1            #75  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//   33   63:invokeinterface #51  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   34   68:astore_3        
			if(s instanceof bxc)
	//*  35   69:aload_3         
	//*  36   70:instanceof      #77  <Class bxc>
	//*  37   73:ifeq            84
				a = ((a) ((bxc)s));
	//   38   76:aload_3         
	//   39   77:checkcast       #77  <Class bxc>
	//   40   80:astore_1        
			else
	//*  41   81:goto            93
				a = ((a) (new bxe(((IBinder) (a)))));
	//   42   84:new             #79  <Class bxe>
	//   43   87:dup             
	//   44   88:aload_1         
	//   45   89:invokespecial   #80  <Method void bxe(IBinder)>
	//   46   92:astore_1        
		}
		((Parcel) (zzwf)).recycle();
	//   47   93:aload_2         
	//   48   94:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((bxc) (a));
	//   49   97:aload_1         
	//   50   98:areturn         
	}

	public final cj createNativeAdViewDelegate(a a, a a1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		a = ((a) (((bci)this).a(5, parcel)));
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   13   21:astore_1        
		a1 = ((a) (com.google.android.gms.internal.ads.ck.a(((Parcel) (a)).readStrongBinder())));
	//   14   22:aload_1         
	//   15   23:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   16   26:invokestatic    #95  <Method cj com.google.android.gms.internal.ads.ck.a(IBinder)>
	//   17   29:astore_2        
		((Parcel) (a)).recycle();
	//   18   30:aload_1         
	//   19   31:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((cj) (a1));
	//   20   34:aload_2         
	//   21   35:areturn         
	}

	public final co createNativeAdViewHolderDelegate(a a, a a1, a a2)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          4
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a2)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		a = ((a) (((bci)this).a(11, parcel)));
	//   12   24:aload_0         
	//   13   25:bipush          11
	//   14   27:aload           4
	//   15   29:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   16   32:astore_1        
		a1 = ((a) (com.google.android.gms.internal.ads.cp.a(((Parcel) (a)).readStrongBinder())));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   19   37:invokestatic    #102 <Method co com.google.android.gms.internal.ads.cp.a(IBinder)>
	//   20   40:astore_2        
		((Parcel) (a)).recycle();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((co) (a1));
	//   23   45:aload_2         
	//   24   46:areturn         
	}

	public final tu createRewardedVideoAd(a a, km km, int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          4
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (km)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//    9   18:aload           4
	//   10   20:iload_3         
	//   11   21:invokevirtual   #36  <Method void Parcel.writeInt(int)>
		a = ((a) (((bci)this).a(6, parcel)));
	//   12   24:aload_0         
	//   13   25:bipush          6
	//   14   27:aload           4
	//   15   29:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   16   32:astore_1        
		km = ((km) (com.google.android.gms.internal.ads.tv.a(((Parcel) (a)).readStrongBinder())));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   19   37:invokestatic    #109 <Method tu com.google.android.gms.internal.ads.tv.a(IBinder)>
	//   20   40:astore_2        
		((Parcel) (a)).recycle();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((tu) (km));
	//   23   45:aload_2         
	//   24   46:areturn         
	}

	public final tu createRewardedVideoAdSku(a a, int i)
	{
		Object obj = ((Object) (((bci)this).z()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		com.google.android.gms.internal.ads.bck.a(((Parcel) (obj)), ((android.os.IInterface) (a)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((Parcel) (obj)).writeInt(i);
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #36  <Method void Parcel.writeInt(int)>
		a = ((a) (((bci)this).a(12, ((Parcel) (obj)))));
	//    9   15:aload_0         
	//   10   16:bipush          12
	//   11   18:aload_3         
	//   12   19:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   13   22:astore_1        
		obj = ((Object) (com.google.android.gms.internal.ads.tv.a(((Parcel) (a)).readStrongBinder())));
	//   14   23:aload_1         
	//   15   24:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   16   27:invokestatic    #109 <Method tu com.google.android.gms.internal.ads.tv.a(IBinder)>
	//   17   30:astore_3        
		((Parcel) (a)).recycle();
	//   18   31:aload_1         
	//   19   32:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((tu) (obj));
	//   20   35:aload_3         
	//   21   36:areturn         
	}

	public final bxc createSearchAdManager(a a, zzwf zzwf, String s, int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          5
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwf)));
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokestatic    #73  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokevirtual   #32  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//   12   24:aload           5
	//   13   26:iload           4
	//   14   28:invokevirtual   #36  <Method void Parcel.writeInt(int)>
		zzwf = ((zzwf) (((bci)this).a(10, parcel)));
	//   15   31:aload_0         
	//   16   32:bipush          10
	//   17   34:aload           5
	//   18   36:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   19   39:astore_2        
		a = ((a) (((Parcel) (zzwf)).readStrongBinder()));
	//   20   40:aload_2         
	//   21   41:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   22   44:astore_1        
		if(a == null)
	//*  23   45:aload_1         
	//*  24   46:ifnonnull       54
		{
			a = null;
	//   25   49:aconst_null     
	//   26   50:astore_1        
		} else
	//*  27   51:goto            87
		{
			s = ((String) (((IBinder) (a)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")));
	//   28   54:aload_1         
	//   29   55:ldc1            #75  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//   30   57:invokeinterface #51  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   31   62:astore_3        
			if(s instanceof bxc)
	//*  32   63:aload_3         
	//*  33   64:instanceof      #77  <Class bxc>
	//*  34   67:ifeq            78
				a = ((a) ((bxc)s));
	//   35   70:aload_3         
	//   36   71:checkcast       #77  <Class bxc>
	//   37   74:astore_1        
			else
	//*  38   75:goto            87
				a = ((a) (new bxe(((IBinder) (a)))));
	//   39   78:new             #79  <Class bxe>
	//   40   81:dup             
	//   41   82:aload_1         
	//   42   83:invokespecial   #80  <Method void bxe(IBinder)>
	//   43   86:astore_1        
		}
		((Parcel) (zzwf)).recycle();
	//   44   87:aload_2         
	//   45   88:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((bxc) (a));
	//   46   91:aload_1         
	//   47   92:areturn         
	}

	public final bxu getMobileAdsSettingsManager(a a)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel = ((bci)this).a(4, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   10   16:astore_2        
		a = ((a) (parcel.readStrongBinder()));
	//   11   17:aload_2         
	//   12   18:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   13   21:astore_1        
		if(a == null)
	//*  14   22:aload_1         
	//*  15   23:ifnonnull       31
		{
			a = null;
	//   16   26:aconst_null     
	//   17   27:astore_1        
		} else
	//*  18   28:goto            64
		{
			android.os.IInterface iinterface = ((IBinder) (a)).queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
	//   19   31:aload_1         
	//   20   32:ldc1            #117 <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager">
	//   21   34:invokeinterface #51  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   22   39:astore_3        
			if(iinterface instanceof bxu)
	//*  23   40:aload_3         
	//*  24   41:instanceof      #119 <Class bxu>
	//*  25   44:ifeq            55
				a = ((a) ((bxu)iinterface));
	//   26   47:aload_3         
	//   27   48:checkcast       #119 <Class bxu>
	//   28   51:astore_1        
			else
	//*  29   52:goto            64
				a = ((a) (new bxw(((IBinder) (a)))));
	//   30   55:new             #121 <Class bxw>
	//   31   58:dup             
	//   32   59:aload_1         
	//   33   60:invokespecial   #122 <Method void bxw(IBinder)>
	//   34   63:astore_1        
		}
		parcel.recycle();
	//   35   64:aload_2         
	//   36   65:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((bxu) (a));
	//   37   68:aload_1         
	//   38   69:areturn         
	}

	public final bxu getMobileAdsSettingsManagerWithClientJarVersion(a a, int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #26  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #36  <Method void Parcel.writeInt(int)>
		parcel = ((bci)this).a(9, parcel);
	//    9   15:aload_0         
	//   10   16:bipush          9
	//   11   18:aload_3         
	//   12   19:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   13   22:astore_3        
		a = ((a) (parcel.readStrongBinder()));
	//   14   23:aload_3         
	//   15   24:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   16   27:astore_1        
		if(a == null)
	//*  17   28:aload_1         
	//*  18   29:ifnonnull       37
		{
			a = null;
	//   19   32:aconst_null     
	//   20   33:astore_1        
		} else
	//*  21   34:goto            73
		{
			android.os.IInterface iinterface = ((IBinder) (a)).queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
	//   22   37:aload_1         
	//   23   38:ldc1            #117 <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager">
	//   24   40:invokeinterface #51  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   25   45:astore          4
			if(iinterface instanceof bxu)
	//*  26   47:aload           4
	//*  27   49:instanceof      #119 <Class bxu>
	//*  28   52:ifeq            64
				a = ((a) ((bxu)iinterface));
	//   29   55:aload           4
	//   30   57:checkcast       #119 <Class bxu>
	//   31   60:astore_1        
			else
	//*  32   61:goto            73
				a = ((a) (new bxw(((IBinder) (a)))));
	//   33   64:new             #121 <Class bxw>
	//   34   67:dup             
	//   35   68:aload_1         
	//   36   69:invokespecial   #122 <Method void bxw(IBinder)>
	//   37   72:astore_1        
		}
		parcel.recycle();
	//   38   73:aload_3         
	//   39   74:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((bxu) (a));
	//   40   77:aload_1         
	//   41   78:areturn         
	}
}
