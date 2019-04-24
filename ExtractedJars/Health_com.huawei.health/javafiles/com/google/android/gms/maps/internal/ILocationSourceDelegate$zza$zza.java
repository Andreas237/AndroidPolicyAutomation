// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.maps.internal:
//			ILocationSourceDelegate, zzp

static class ILocationSourceDelegate$zza$zza
	implements ILocationSourceDelegate
{

	public void activate(zzp zzp1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.ILocationSourceDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(zzp1 == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          71
_L1:
		zzp1 = ((zzp) (zzp1.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #41  <Method IBinder zzp.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (zzp1)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #44  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(1, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:iconst_1        
	//   19   38:aload_2         
	//   20   39:aload_3         
	//   21   40:iconst_0        
	//   22   41:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   46:pop             
		parcel1.readException();
	//   24   47:aload_3         
	//   25   48:invokevirtual   #53  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   55:aload_2         
	//   29   56:invokevirtual   #56  <Method void Parcel.recycle()>
		return;
	//   30   59:return          
		zzp1;
	//   31   60:astore_1        
		parcel1.recycle();
	//   32   61:aload_3         
	//   33   62:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   65:aload_2         
	//   35   66:invokevirtual   #56  <Method void Parcel.recycle()>
		throw zzp1;
	//   36   69:aload_1         
	//   37   70:athrow          
_L2:
		zzp1 = null;
	//   38   71:aconst_null     
	//   39   72:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   73:goto            28
_L3:
	}

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void deactivate()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.ILocationSourceDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(2, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_2        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #53  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #56  <Method void Parcel.recycle()>
		return;
	//   21   40:return          
		Exception exception;
		exception;
	//   22   41:astore_3        
		parcel1.recycle();
	//   23   42:aload_2         
	//   24   43:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   46:aload_1         
	//   26   47:invokevirtual   #56  <Method void Parcel.recycle()>
		throw exception;
	//   27   50:aload_3         
	//   28   51:athrow          
	}

	private IBinder zzrk;

	ILocationSourceDelegate$zza$zza(IBinder ibinder)
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
