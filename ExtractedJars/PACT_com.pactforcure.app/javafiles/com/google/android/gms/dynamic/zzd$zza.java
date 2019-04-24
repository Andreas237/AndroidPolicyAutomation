// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.os.*;

// Referenced classes of package com.google.android.gms.dynamic:
//			zzd

public static abstract class zzd$zza extends Binder
	implements zzd
{
	private static class zza
		implements zzd
	{

		public IBinder asBinder()
		{
			return zzrp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrp>
		//    2    4:areturn         
		}

		private IBinder zzrp;

		zza(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzrp = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder zzrp>
		//    5    9:return          
		}
	}


	public static zzd zzcd(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.dynamic.IObjectWrapper">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzd))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzd>
	//*  12   23:ifeq            31
			return (zzd)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzd>
	//   15   30:areturn         
		else
			return ((zzd) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzd$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzd$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public IBinder asBinder()
	{
		return ((IBinder) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1598968902 1598968902: default 20
	//	               1598968902 30
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    2   20:aload_0         
	//    3   21:iload_1         
	//    4   22:aload_2         
	//    5   23:aload_3         
	//    6   24:iload           4
	//    7   26:invokespecial   #39  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    8   29:ireturn         

		case 1598968902: 
			parcel1.writeString("com.google.android.gms.dynamic.IObjectWrapper");
	//    9   30:aload_3         
	//   10   31:ldc1            #15  <String "com.google.android.gms.dynamic.IObjectWrapper">
	//   11   33:invokevirtual   #45  <Method void Parcel.writeString(String)>
			break;
		}
		return true;
	//   12   36:iconst_1        
	//   13   37:ireturn         
	}

	public zzd$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.dynamic.IObjectWrapper");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.dynamic.IObjectWrapper">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
