// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.iid;

import android.os.*;

// Referenced classes of package com.google.android.gms.iid:
//			zzb

private static class zzb$zza$zza
	implements zzb
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	public void send(Message message)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
	//    2    4:aload_2         
	//    3    5:ldc1            #33  <String "com.google.android.gms.iid.IMessengerCompat">
	//    4    7:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(message == null)
			break MISSING_BLOCK_LABEL_44;
	//    5   10:aload_1         
	//    6   11:ifnull          44
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		message.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #47  <Method void Message.writeToParcel(Parcel, int)>
_L1:
		zzrp.transact(1, parcel, ((Parcel) (null)), 1);
	//   14   25:aload_0         
	//   15   26:getfield        #18  <Field IBinder zzrp>
	//   16   29:iconst_1        
	//   17   30:aload_2         
	//   18   31:aconst_null     
	//   19   32:iconst_1        
	//   20   33:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   21   38:pop             
		parcel.recycle();
	//   22   39:aload_2         
	//   23   40:invokevirtual   #56  <Method void Parcel.recycle()>
		return;
	//   24   43:return          
		parcel.writeInt(0);
	//   25   44:aload_2         
	//   26   45:iconst_0        
	//   27   46:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  28   49:goto            25
		message;
	//   29   52:astore_1        
		parcel.recycle();
	//   30   53:aload_2         
	//   31   54:invokevirtual   #56  <Method void Parcel.recycle()>
		throw message;
	//   32   57:aload_1         
	//   33   58:athrow          
	}

	private IBinder zzrp;

	zzb$zza$zza(IBinder ibinder)
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
