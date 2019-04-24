// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzla, zzlc

public abstract class zzlb extends zzek
	implements zzla
{

	public zzlb()
	{
		super("com.google.android.gms.ads.internal.client.IAppEventListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAppEventListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzla zzd(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAppEventListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzla)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzla>
	//*  10   19:ifeq            27
			return (zzla)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzla>
	//   13   26:areturn         
		else
			return ((zzla) (new zzlc(ibinder)));
	//   14   27:new             #24  <Class zzlc>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzlc(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          23
		{
			onAppEvent(parcel.readString(), parcel.readString());
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #37  <Method String Parcel.readString()>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #37  <Method String Parcel.readString()>
	//    8   14:invokevirtual   #41  <Method void onAppEvent(String, String)>
			parcel1.writeNoException();
	//    9   17:aload_3         
	//   10   18:invokevirtual   #44  <Method void Parcel.writeNoException()>
			return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
		} else
		{
			return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		}
	}
}
