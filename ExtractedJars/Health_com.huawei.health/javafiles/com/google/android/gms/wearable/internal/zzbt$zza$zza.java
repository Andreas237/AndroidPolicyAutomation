// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbt

static class zzbt$zza$zza
	implements zzbt
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void zzE(int i, int j)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.wearable.internal.IChannelStreamCallbacks">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   10   20:aload_3         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		zzrk.transact(2, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #18  <Field IBinder zzrk>
	//   15   29:iconst_2        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #47  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #50  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   45:aload           4
	//   24   47:invokevirtual   #53  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   27   54:return          
		Exception exception;
		exception;
	//   28   55:astore          5
		parcel1.recycle();
	//   29   57:aload           4
	//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   62:aload_3         
	//   32   63:invokevirtual   #53  <Method void Parcel.recycle()>
		throw exception;
	//   33   66:aload           5
	//   34   68:athrow          
	}

	private IBinder zzrk;

	zzbt$zza$zza(IBinder ibinder)
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
