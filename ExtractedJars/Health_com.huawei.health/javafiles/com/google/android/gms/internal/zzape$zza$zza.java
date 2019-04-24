// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.result.SessionStopResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzape

static class zzape$zza$zza
	implements zzape
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void zza(SessionStopResult sessionstopresult)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.ISessionStopCallback");
	//    2    4:aload_2         
	//    3    5:ldc1            #32  <String "com.google.android.gms.fitness.internal.ISessionStopCallback">
	//    4    7:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sessionstopresult == null)
			break MISSING_BLOCK_LABEL_28;
	//    5   10:aload_1         
	//    6   11:ifnull          28
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sessionstopresult.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #46  <Method void SessionStopResult.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_33;
	//   14   25:goto            33
		parcel.writeInt(0);
	//   15   28:aload_2         
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(1, parcel, ((Parcel) (null)), 1);
	//   18   33:aload_0         
	//   19   34:getfield        #18  <Field IBinder zzrk>
	//   20   37:iconst_1        
	//   21   38:aload_2         
	//   22   39:aconst_null     
	//   23   40:iconst_1        
	//   24   41:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   25   46:pop             
		parcel.recycle();
	//   26   47:aload_2         
	//   27   48:invokevirtual   #55  <Method void Parcel.recycle()>
		return;
	//   28   51:return          
		sessionstopresult;
	//   29   52:astore_1        
		parcel.recycle();
	//   30   53:aload_2         
	//   31   54:invokevirtual   #55  <Method void Parcel.recycle()>
		throw sessionstopresult;
	//   32   57:aload_1         
	//   33   58:athrow          
	}

	private IBinder zzrk;

	zzape$zza$zza(IBinder ibinder)
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
