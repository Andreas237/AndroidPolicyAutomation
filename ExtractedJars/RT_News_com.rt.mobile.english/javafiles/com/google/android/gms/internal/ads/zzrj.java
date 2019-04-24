// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzri, zzrk, zzkt

public abstract class zzrj extends zzek
	implements zzri
{

	public zzrj()
	{
		super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzri zzp(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzri)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzri>
	//*  10   19:ifeq            27
			return (zzri)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzri>
	//   13   26:areturn         
		else
			return ((zzri) (new zzrk(ibinder)));
	//   14   27:new             #24  <Class zzrk>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzrk(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          29
		{
			zza(zzkt.zzb(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//    6   10:invokestatic    #43  <Method zzks zzkt.zzb(IBinder)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//    9   17:invokestatic    #49  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   10   20:invokevirtual   #53  <Method void zza(zzks, com.google.android.gms.dynamic.IObjectWrapper)>
			parcel1.writeNoException();
	//   11   23:aload_3         
	//   12   24:invokevirtual   #56  <Method void Parcel.writeNoException()>
			return true;
	//   13   27:iconst_1        
	//   14   28:ireturn         
		} else
		{
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
		}
	}
}
