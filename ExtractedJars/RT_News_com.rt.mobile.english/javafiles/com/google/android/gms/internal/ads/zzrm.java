// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzrl, zzrn, zzrr, 
//			zzrt

public abstract class zzrm extends zzek
	implements zzrl
{

	public zzrm()
	{
		super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzrl zzq(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzrl)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzrl>
	//*  10   19:ifeq            27
			return (zzrl)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzrl>
	//   13   26:areturn         
		else
			return ((zzrl) (new zzrn(ibinder)));
	//   14   27:new             #24  <Class zzrn>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzrn(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          66
		{
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//    3    5:aload_2         
	//    4    6:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//    5    9:astore_2        
			if(parcel == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       19
			{
				parcel = null;
	//    8   14:aconst_null     
	//    9   15:astore_2        
			} else
	//*  10   16:goto            55
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
	//   11   19:aload_2         
	//   12   20:ldc1            #39  <String "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd">
	//   13   22:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   14   27:astore          5
				if(iinterface instanceof zzrr)
	//*  15   29:aload           5
	//*  16   31:instanceof      #41  <Class zzrr>
	//*  17   34:ifeq            46
					parcel = ((Parcel) ((zzrr)iinterface));
	//   18   37:aload           5
	//   19   39:checkcast       #41  <Class zzrr>
	//   20   42:astore_2        
				else
	//*  21   43:goto            55
					parcel = ((Parcel) (new zzrt(((IBinder) (parcel)))));
	//   22   46:new             #43  <Class zzrt>
	//   23   49:dup             
	//   24   50:aload_2         
	//   25   51:invokespecial   #44  <Method void zzrt(IBinder)>
	//   26   54:astore_2        
			}
			zza(((zzrr) (parcel)));
	//   27   55:aload_0         
	//   28   56:aload_2         
	//   29   57:invokevirtual   #48  <Method void zza(zzrr)>
			parcel1.writeNoException();
	//   30   60:aload_3         
	//   31   61:invokevirtual   #51  <Method void Parcel.writeNoException()>
			return true;
	//   32   64:iconst_1        
	//   33   65:ireturn         
		} else
		{
			return false;
	//   34   66:iconst_0        
	//   35   67:ireturn         
		}
	}
}
