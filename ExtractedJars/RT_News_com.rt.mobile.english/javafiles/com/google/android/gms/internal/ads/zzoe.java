// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzod, zzof, zzoa, 
//			zzoc

public abstract class zzoe extends zzek
	implements zzod
{

	public zzoe()
	{
		super("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzod zzf(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzod)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzod>
	//*  10   19:ifeq            27
			return (zzod)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzod>
	//   13   26:areturn         
		else
			return ((zzod) (new zzof(ibinder)));
	//   14   27:new             #24  <Class zzof>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzof(IBinder)>
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
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
	//   11   19:aload_2         
	//   12   20:ldc1            #39  <String "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd">
	//   13   22:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   14   27:astore          5
				if(iinterface instanceof zzoa)
	//*  15   29:aload           5
	//*  16   31:instanceof      #41  <Class zzoa>
	//*  17   34:ifeq            46
					parcel = ((Parcel) ((zzoa)iinterface));
	//   18   37:aload           5
	//   19   39:checkcast       #41  <Class zzoa>
	//   20   42:astore_2        
				else
	//*  21   43:goto            55
					parcel = ((Parcel) (new zzoc(((IBinder) (parcel)))));
	//   22   46:new             #43  <Class zzoc>
	//   23   49:dup             
	//   24   50:aload_2         
	//   25   51:invokespecial   #44  <Method void zzoc(IBinder)>
	//   26   54:astore_2        
			}
			zza(((zzoa) (parcel)));
	//   27   55:aload_0         
	//   28   56:aload_2         
	//   29   57:invokevirtual   #48  <Method void zza(zzoa)>
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
