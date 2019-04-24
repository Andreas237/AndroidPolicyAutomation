// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.os.*;

public interface IObjectWrapper
	extends IInterface
{
	public static abstract class zza extends Binder
		implements IObjectWrapper
	{

		public static IObjectWrapper zzcd(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
		//    4    6:aload_0         
		//    5    7:ldc1            #15  <String "com.google.android.gms.dynamic.IObjectWrapper">
		//    6    9:invokeinterface #28  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IObjectWrapper))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IObjectWrapper>
		//*  12   23:ifeq            31
				return (IObjectWrapper)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IObjectWrapper>
		//   15   30:areturn         
			else
				return ((IObjectWrapper) (new zza(ibinder)));
		//   16   31:new             #9   <Class IObjectWrapper$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #31  <Method void IObjectWrapper$zza$zza(IBinder)>
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
		//*   1    1:lookupswitch    1: default 20
		//		               1598968902: 23
		//*   2   20:goto            31
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.dynamic.IObjectWrapper");
		//    3   23:aload_3         
		//    4   24:ldc1            #15  <String "com.google.android.gms.dynamic.IObjectWrapper">
		//    5   26:invokevirtual   #43  <Method void Parcel.writeString(String)>
				return true;
		//    6   29:iconst_1        
		//    7   30:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//    8   31:aload_0         
		//    9   32:iload_1         
		//   10   33:aload_2         
		//   11   34:aload_3         
		//   12   35:iload           4
		//   13   37:invokespecial   #45  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   14   40:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.google.android.gms.dynamic.IObjectWrapper");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #15  <String "com.google.android.gms.dynamic.IObjectWrapper">
		//    5    8:invokevirtual   #19  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static class zza.zza
		implements IObjectWrapper
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		private IBinder zzrk;

		zza.zza(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzrk = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder zzrk>
		//    5    9:return          
		}
	}

}
