// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzr

private static class zzr$zza$zza
	implements zzr
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	public Account getAccount()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.common.internal.IAccountAccessor">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrp.transact(2, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrp>
	//    9   18:iconst_2        
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_3         
	//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   17   32:aload_3         
	//   18   33:invokevirtual   #50  <Method int Parcel.readInt()>
	//   19   36:ifeq            62
_L1:
		Account account = (Account)Account.CREATOR.createFromParcel(parcel1);
	//   20   39:getstatic       #56  <Field android.os.Parcelable$Creator Account.CREATOR>
	//   21   42:aload_3         
	//   22   43:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   48:checkcast       #52  <Class Account>
	//   24   51:astore_1        
_L4:
		parcel1.recycle();
	//   25   52:aload_3         
	//   26   53:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   56:aload_2         
	//   28   57:invokevirtual   #65  <Method void Parcel.recycle()>
		return account;
	//   29   60:aload_1         
	//   30   61:areturn         
_L2:
		account = null;
	//   31   62:aconst_null     
	//   32   63:astore_1        
		if(true) goto _L4; else goto _L3
	//   33   64:goto            52
_L3:
		Exception exception;
		exception;
	//   34   67:astore_1        
		parcel1.recycle();
	//   35   68:aload_3         
	//   36   69:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   72:aload_2         
	//   38   73:invokevirtual   #65  <Method void Parcel.recycle()>
		throw exception;
	//   39   76:aload_1         
	//   40   77:athrow          
	}

	private IBinder zzrp;

	zzr$zza$zza(IBinder ibinder)
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
