// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzacd, zzacc

private static class zzacd$zza$zza
	implements zzacd
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	public void zza(zzacc zzacc1)
		throws RemoteException
	{
		IBinder ibinder;
		Parcel parcel;
		ibinder = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    5:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
	//    4    6:aload_3         
	//    5    7:ldc1            #32  <String "com.google.android.gms.common.internal.service.ICommonService">
	//    6    9:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzacc1 == null)
			break MISSING_BLOCK_LABEL_23;
	//    7   12:aload_1         
	//    8   13:ifnull          23
		ibinder = zzacc1.asBinder();
	//    9   16:aload_1         
	//   10   17:invokeinterface #40  <Method IBinder zzacc.asBinder()>
	//   11   22:astore_2        
		parcel.writeStrongBinder(ibinder);
	//   12   23:aload_3         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrp.transact(1, parcel, ((Parcel) (null)), 1);
	//   15   28:aload_0         
	//   16   29:getfield        #18  <Field IBinder zzrp>
	//   17   32:iconst_1        
	//   18   33:aload_3         
	//   19   34:aconst_null     
	//   20   35:iconst_1        
	//   21   36:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   22   41:pop             
		parcel.recycle();
	//   23   42:aload_3         
	//   24   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   25   46:return          
		zzacc1;
	//   26   47:astore_1        
		parcel.recycle();
	//   27   48:aload_3         
	//   28   49:invokevirtual   #52  <Method void Parcel.recycle()>
		throw zzacc1;
	//   29   52:aload_1         
	//   30   53:athrow          
	}

	private IBinder zzrp;

	zzacd$zza$zza(IBinder ibinder)
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
