// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;

public interface IStatusCallback
	extends IInterface
{
	public static abstract class Stub extends zzb
		implements IStatusCallback
	{

		public static IStatusCallback asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.common.api.internal.IStatusCallback">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof IStatusCallback)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class IStatusCallback>
		//*  10   19:ifeq            27
				return (IStatusCallback)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class IStatusCallback>
		//   13   26:areturn         
			else
				return ((IStatusCallback) (new zza(ibinder)));
		//   14   27:new             #9   <Class IStatusCallback$Stub$zza>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void IStatusCallback$Stub$zza(IBinder)>
		//   18   35:areturn         
		}

		protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			if(i == 1)
		//*   0    0:iload_1         
		//*   1    1:iconst_1        
		//*   2    2:icmpne          21
			{
				onResult((Status)zzc.zza(parcel, Status.CREATOR));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:getstatic       #39  <Field android.os.Parcelable$Creator Status.CREATOR>
		//    6   10:invokestatic    #44  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//    7   13:checkcast       #35  <Class Status>
		//    8   16:invokevirtual   #48  <Method void onResult(Status)>
				return true;
		//    9   19:iconst_1        
		//   10   20:ireturn         
			} else
			{
				return false;
		//   11   21:iconst_0        
		//   12   22:ireturn         
			}
		}

		public Stub()
		{
			super("com.google.android.gms.common.api.internal.IStatusCallback");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.common.api.internal.IStatusCallback">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static final class Stub.zza extends com.google.android.gms.internal.stable.zza
		implements IStatusCallback
	{

		public final void onResult(Status status)
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.stable.zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.stable.zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore_2        
			zzc.zza(parcel, ((android.os.Parcelable) (status)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #31  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			((com.google.android.gms.internal.stable.zza)this).transactOneway(1, parcel);
		//    6   10:aload_0         
		//    7   11:iconst_1        
		//    8   12:aload_2         
		//    9   13:invokevirtual   #35  <Method void com.google.android.gms.internal.stable.zza.transactOneway(int, Parcel)>
		//   10   16:return          
		}

		Stub.zza(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.api.internal.IStatusCallback");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.api.internal.IStatusCallback">
		//    3    4:invokespecial   #17  <Method void com.google.android.gms.internal.stable.zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract void onResult(Status status)
		throws RemoteException;
}
