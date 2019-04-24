// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

// Referenced classes of package com.google.android.gms.common.internal:
//			IAccountAccessor

public static final class IAccountAccessor$Stub$zza extends zza
	implements IAccountAccessor
{

	public final Account getAccount()
	{
		Parcel parcel = ((zza)this).zza(2, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    6:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5    9:astore_1        
		Account account = (Account)zzc.zza(parcel, Account.CREATOR);
	//    6   10:aload_1         
	//    7   11:getstatic       #32  <Field android.os.Parcelable$Creator Account.CREATOR>
	//    8   14:invokestatic    #37  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//    9   17:checkcast       #28  <Class Account>
	//   10   20:astore_2        
		parcel.recycle();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #43  <Method void Parcel.recycle()>
		return account;
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	IAccountAccessor$Stub$zza(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.IAccountAccessor");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.IAccountAccessor">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
