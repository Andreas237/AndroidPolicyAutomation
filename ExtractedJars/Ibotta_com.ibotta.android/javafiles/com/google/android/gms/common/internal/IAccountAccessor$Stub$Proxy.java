// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.*;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.common.internal:
//			IAccountAccessor

public static class IAccountAccessor$Stub$Proxy extends zza
	implements IAccountAccessor
{

	public Account getAccount()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(2, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		Account account = (Account)zzc.zza(parcel, Account.CREATOR);
	//    6   10:aload_1         
	//    7   11:getstatic       #36  <Field android.os.Parcelable$Creator Account.CREATOR>
	//    8   14:invokestatic    #42  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//    9   17:checkcast       #32  <Class Account>
	//   10   20:astore_2        
		parcel.recycle();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #48  <Method void Parcel.recycle()>
		return account;
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	IAccountAccessor$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.IAccountAccessor");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.IAccountAccessor">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
