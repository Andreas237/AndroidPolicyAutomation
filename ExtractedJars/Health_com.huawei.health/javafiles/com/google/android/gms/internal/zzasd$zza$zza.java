// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzasd

static class zzasd$zza$zza
	implements zzasd
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void zza(int i, PendingIntent pendingintent)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
	//    2    4:aload_3         
	//    3    5:ldc1            #32  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
	//    4    7:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    5   10:aload_3         
	//    6   11:iload_1         
	//    7   12:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(pendingintent == null)
			break MISSING_BLOCK_LABEL_33;
	//    8   15:aload_2         
	//    9   16:ifnull          33
		parcel.writeInt(1);
	//   10   19:aload_3         
	//   11   20:iconst_1        
	//   12   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		pendingintent.writeToParcel(parcel, 0);
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokevirtual   #46  <Method void PendingIntent.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   17   30:goto            38
		parcel.writeInt(0);
	//   18   33:aload_3         
	//   19   34:iconst_0        
	//   20   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(3, parcel, ((Parcel) (null)), 1);
	//   21   38:aload_0         
	//   22   39:getfield        #18  <Field IBinder zzrk>
	//   23   42:iconst_3        
	//   24   43:aload_3         
	//   25   44:aconst_null     
	//   26   45:iconst_1        
	//   27   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   28   51:pop             
		parcel.recycle();
	//   29   52:aload_3         
	//   30   53:invokevirtual   #55  <Method void Parcel.recycle()>
		return;
	//   31   56:return          
		pendingintent;
	//   32   57:astore_2        
		parcel.recycle();
	//   33   58:aload_3         
	//   34   59:invokevirtual   #55  <Method void Parcel.recycle()>
		throw pendingintent;
	//   35   62:aload_2         
	//   36   63:athrow          
	}

	public void zza(int i, String as[])
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
	//    2    4:aload_3         
	//    3    5:ldc1            #32  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
	//    4    7:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    5   10:aload_3         
	//    6   11:iload_1         
	//    7   12:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		parcel.writeStringArray(as);
	//    8   15:aload_3         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #61  <Method void Parcel.writeStringArray(String[])>
		zzrk.transact(1, parcel, ((Parcel) (null)), 1);
	//   11   20:aload_0         
	//   12   21:getfield        #18  <Field IBinder zzrk>
	//   13   24:iconst_1        
	//   14   25:aload_3         
	//   15   26:aconst_null     
	//   16   27:iconst_1        
	//   17   28:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   18   33:pop             
		parcel.recycle();
	//   19   34:aload_3         
	//   20   35:invokevirtual   #55  <Method void Parcel.recycle()>
		return;
	//   21   38:return          
		as;
	//   22   39:astore_2        
		parcel.recycle();
	//   23   40:aload_3         
	//   24   41:invokevirtual   #55  <Method void Parcel.recycle()>
		throw as;
	//   25   44:aload_2         
	//   26   45:athrow          
	}

	public void zzb(int i, String as[])
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
	//    2    4:aload_3         
	//    3    5:ldc1            #32  <String "com.google.android.gms.location.internal.IGeofencerCallbacks">
	//    4    7:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    5   10:aload_3         
	//    6   11:iload_1         
	//    7   12:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		parcel.writeStringArray(as);
	//    8   15:aload_3         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #61  <Method void Parcel.writeStringArray(String[])>
		zzrk.transact(2, parcel, ((Parcel) (null)), 1);
	//   11   20:aload_0         
	//   12   21:getfield        #18  <Field IBinder zzrk>
	//   13   24:iconst_2        
	//   14   25:aload_3         
	//   15   26:aconst_null     
	//   16   27:iconst_1        
	//   17   28:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   18   33:pop             
		parcel.recycle();
	//   19   34:aload_3         
	//   20   35:invokevirtual   #55  <Method void Parcel.recycle()>
		return;
	//   21   38:return          
		as;
	//   22   39:astore_2        
		parcel.recycle();
	//   23   40:aload_3         
	//   24   41:invokevirtual   #55  <Method void Parcel.recycle()>
		throw as;
	//   25   44:aload_2         
	//   26   45:athrow          
	}

	private IBinder zzrk;

	zzasd$zza$zza(IBinder ibinder)
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
