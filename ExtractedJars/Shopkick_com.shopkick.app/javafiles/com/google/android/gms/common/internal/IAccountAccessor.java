// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IAccountAccessor
	extends IInterface
{
	public static abstract class Stub extends zzb
		implements IAccountAccessor
	{

		public static IAccountAccessor asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.IAccountAccessor">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof IAccountAccessor)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class IAccountAccessor>
		//*  10   19:ifeq            27
				return (IAccountAccessor)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class IAccountAccessor>
		//   13   26:areturn         
			else
				return ((IAccountAccessor) (new zza(ibinder)));
		//   14   27:new             #9   <Class IAccountAccessor$Stub$zza>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void IAccountAccessor$Stub$zza(IBinder)>
		//   18   35:areturn         
		}

		protected final boolean zza(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			if(i == 2)
		//*   0    0:iload_1         
		//*   1    1:iconst_2        
		//*   2    2:icmpne          21
			{
				parcel = ((Parcel) (getAccount()));
		//    3    5:aload_0         
		//    4    6:invokevirtual   #36  <Method Account getAccount()>
		//    5    9:astore_2        
				parcel1.writeNoException();
		//    6   10:aload_3         
		//    7   11:invokevirtual   #41  <Method void Parcel.writeNoException()>
				zzc.zzb(parcel1, ((android.os.Parcelable) (parcel)));
		//    8   14:aload_3         
		//    9   15:aload_2         
		//   10   16:invokestatic    #47  <Method void zzc.zzb(Parcel, android.os.Parcelable)>
				return true;
		//   11   19:iconst_1        
		//   12   20:ireturn         
			} else
			{
				return false;
		//   13   21:iconst_0        
		//   14   22:ireturn         
			}
		}

		public Stub()
		{
			super("com.google.android.gms.common.internal.IAccountAccessor");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.IAccountAccessor">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static final class Stub.zza extends com.google.android.gms.internal.common.zza
		implements IAccountAccessor
	{

		public final Account getAccount()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(2, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5    9:astore_1        
			Account account = (Account)zzc.zza(parcel, Account.CREATOR);
		//    6   10:aload_1         
		//    7   11:getstatic       #34  <Field android.os.Parcelable$Creator Account.CREATOR>
		//    8   14:invokestatic    #39  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//    9   17:checkcast       #30  <Class Account>
		//   10   20:astore_2        
			parcel.recycle();
		//   11   21:aload_1         
		//   12   22:invokevirtual   #45  <Method void Parcel.recycle()>
			return account;
		//   13   25:aload_2         
		//   14   26:areturn         
		}

		Stub.zza(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.IAccountAccessor");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.IAccountAccessor">
		//    3    4:invokespecial   #17  <Method void com.google.android.gms.internal.common.zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract Account getAccount()
		throws RemoteException;
}
