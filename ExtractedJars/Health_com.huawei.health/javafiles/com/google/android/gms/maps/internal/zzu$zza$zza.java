// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzu

static class zzu$zza$zza
	implements zzu
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public boolean zza(zzf zzf1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzf1 == null) goto _L2; else goto _L1
	//    7   17:aload_1         
	//    8   18:ifnull          100
_L1:
		zzf1 = ((zzf) (zzf1.asBinder()));
	//    9   21:aload_1         
	//   10   22:invokeinterface #40  <Method IBinder zzf.asBinder()>
	//   11   27:astore_1        
	//*  12   28:goto            31
_L4:
		int i;
		parcel.writeStrongBinder(((IBinder) (zzf1)));
	//   13   31:aload           4
	//   14   33:aload_1         
	//   15   34:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(1, parcel, parcel1, 0);
	//   16   37:aload_0         
	//   17   38:getfield        #18  <Field IBinder zzrk>
	//   18   41:iconst_1        
	//   19   42:aload           4
	//   20   44:aload           5
	//   21   46:iconst_0        
	//   22   47:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   52:pop             
		parcel1.readException();
	//   24   53:aload           5
	//   25   55:invokevirtual   #52  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   26   58:aload           5
	//   27   60:invokevirtual   #56  <Method int Parcel.readInt()>
	//   28   63:istore_2        
		boolean flag;
		if(i != 0)
	//*  29   64:iload_2         
	//*  30   65:ifeq            73
			flag = true;
	//   31   68:iconst_1        
	//   32   69:istore_3        
		else
	//*  33   70:goto            75
			flag = false;
	//   34   73:iconst_0        
	//   35   74:istore_3        
		parcel1.recycle();
	//   36   75:aload           5
	//   37   77:invokevirtual   #59  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   80:aload           4
	//   39   82:invokevirtual   #59  <Method void Parcel.recycle()>
		return flag;
	//   40   85:iload_3         
	//   41   86:ireturn         
		zzf1;
	//   42   87:astore_1        
		parcel1.recycle();
	//   43   88:aload           5
	//   44   90:invokevirtual   #59  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   93:aload           4
	//   46   95:invokevirtual   #59  <Method void Parcel.recycle()>
		throw zzf1;
	//   47   98:aload_1         
	//   48   99:athrow          
_L2:
		zzf1 = null;
	//   49  100:aconst_null     
	//   50  101:astore_1        
		if(true) goto _L4; else goto _L3
	//   51  102:goto            31
_L3:
	}

	private IBinder zzrk;

	zzu$zza$zza(IBinder ibinder)
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
