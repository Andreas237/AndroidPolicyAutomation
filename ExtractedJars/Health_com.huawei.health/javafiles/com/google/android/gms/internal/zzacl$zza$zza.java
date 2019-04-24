// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzacl, zzack

static class zzacl$zza$zza
	implements zzacl
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void zza(zzack zzack1)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
	//    2    4:aload_2         
	//    3    5:ldc1            #32  <String "com.google.android.gms.common.internal.service.ICommonService">
	//    4    7:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzack1 == null) goto _L2; else goto _L1
	//    5   10:aload_1         
	//    6   11:ifnull          55
_L1:
		zzack1 = ((zzack) (zzack1.asBinder()));
	//    7   14:aload_1         
	//    8   15:invokeinterface #40  <Method IBinder zzack.asBinder()>
	//    9   20:astore_1        
	//*  10   21:goto            24
_L4:
		parcel.writeStrongBinder(((IBinder) (zzack1)));
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(1, parcel, ((Parcel) (null)), 1);
	//   14   29:aload_0         
	//   15   30:getfield        #18  <Field IBinder zzrk>
	//   16   33:iconst_1        
	//   17   34:aload_2         
	//   18   35:aconst_null     
	//   19   36:iconst_1        
	//   20   37:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   21   42:pop             
		parcel.recycle();
	//   22   43:aload_2         
	//   23   44:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   47:return          
		zzack1;
	//   25   48:astore_1        
		parcel.recycle();
	//   26   49:aload_2         
	//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
		throw zzack1;
	//   28   53:aload_1         
	//   29   54:athrow          
_L2:
		zzack1 = null;
	//   30   55:aconst_null     
	//   31   56:astore_1        
		if(true) goto _L4; else goto _L3
	//   32   57:goto            24
_L3:
	}

	private IBinder zzrk;

	zzacl$zza$zza(IBinder ibinder)
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
