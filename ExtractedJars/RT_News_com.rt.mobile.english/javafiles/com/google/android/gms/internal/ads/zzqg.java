// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzqf, zzqh

public abstract class zzqg extends zzek
	implements zzqf
{

	public zzqg()
	{
		super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzqf zzj(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzqf)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzqf>
	//*  10   19:ifeq            27
			return (zzqf)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzqf>
	//   13   26:areturn         
		else
			return ((zzqf) (new zzqh(ibinder)));
	//   14   27:new             #24  <Class zzqh>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzqh(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 51
	//	               2 44
	//	               3 30
		default:
			return false;
	//    2   28:iconst_0        
	//    3   29:ireturn         

		case 3: // '\003'
			zzc(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    4   30:aload_0         
	//    5   31:aload_2         
	//    6   32:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//    7   35:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    8   38:invokevirtual   #47  <Method void zzc(com.google.android.gms.dynamic.IObjectWrapper)>
			break;

	//*   9   41:goto            62
		case 2: // '\002'
			unregisterNativeAd();
	//   10   44:aload_0         
	//   11   45:invokevirtual   #50  <Method void unregisterNativeAd()>
			break;

	//*  12   48:goto            62
		case 1: // '\001'
			zza(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   13   51:aload_0         
	//   14   52:aload_2         
	//   15   53:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   16   56:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   17   59:invokevirtual   #53  <Method void zza(com.google.android.gms.dynamic.IObjectWrapper)>
			break;
		}
		parcel1.writeNoException();
	//   18   62:aload_3         
	//   19   63:invokevirtual   #56  <Method void Parcel.writeNoException()>
		return true;
	//   20   66:iconst_1        
	//   21   67:ireturn         
	}
}
