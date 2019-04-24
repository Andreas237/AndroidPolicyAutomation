// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzack

static class zzack$zza$zza
	implements zzack
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void zzdd(int i)
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
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonCallbacks");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(1, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:iconst_1        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #49  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_2         
	//   23   42:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   45:return          
		Exception exception;
		exception;
	//   25   46:astore          4
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   56:aload           4
	//   31   58:athrow          
	}

	private IBinder zzrk;

	zzack$zza$zza(IBinder ibinder)
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
