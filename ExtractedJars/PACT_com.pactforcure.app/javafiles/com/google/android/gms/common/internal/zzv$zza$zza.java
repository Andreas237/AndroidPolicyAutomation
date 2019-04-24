// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzv, zzu, zzan, zzj

private static class zzv$zza$zza
	implements zzv
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	public void zza(zzu zzu1, zzan zzan1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzu1 == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          77
_L1:
		zzu1 = ((zzu) (zzu1.asBinder()));
	//    9   19:aload_1         
	//   10   20:invokeinterface #40  <Method IBinder zzu.asBinder()>
	//   11   25:astore_1        
_L5:
		parcel.writeStrongBinder(((IBinder) (zzu1)));
	//   12   26:aload_3         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
		if(zzan1 == null) goto _L4; else goto _L3
	//   15   31:aload_2         
	//   16   32:ifnull          82
_L3:
		parcel.writeInt(1);
	//   17   35:aload_3         
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		zzan1.writeToParcel(parcel, 0);
	//   20   40:aload_2         
	//   21   41:aload_3         
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #53  <Method void zzan.writeToParcel(Parcel, int)>
_L6:
		zzrp.transact(47, parcel, parcel1, 0);
	//   24   46:aload_0         
	//   25   47:getfield        #18  <Field IBinder zzrp>
	//   26   50:bipush          47
	//   27   52:aload_3         
	//   28   53:aload           4
	//   29   55:iconst_0        
	//   30   56:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   31   61:pop             
		parcel1.readException();
	//   32   62:aload           4
	//   33   64:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   34   67:aload           4
	//   35   69:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   72:aload_3         
	//   37   73:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   38   76:return          
_L2:
		zzu1 = null;
	//   39   77:aconst_null     
	//   40   78:astore_1        
		  goto _L5
	//*  41   79:goto            26
_L4:
		parcel.writeInt(0);
	//   42   82:aload_3         
	//   43   83:iconst_0        
	//   44   84:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		  goto _L6
	//*  45   87:goto            46
		zzu1;
	//   46   90:astore_1        
		parcel1.recycle();
	//   47   91:aload           4
	//   48   93:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49   96:aload_3         
	//   50   97:invokevirtual   #65  <Method void Parcel.recycle()>
		throw zzu1;
	//   51  100:aload_1         
	//   52  101:athrow          
		  goto _L5
	}

	public void zza(zzu zzu1, zzj zzj1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzu1 == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          77
_L1:
		zzu1 = ((zzu) (zzu1.asBinder()));
	//    9   19:aload_1         
	//   10   20:invokeinterface #40  <Method IBinder zzu.asBinder()>
	//   11   25:astore_1        
_L5:
		parcel.writeStrongBinder(((IBinder) (zzu1)));
	//   12   26:aload_3         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
		if(zzj1 == null) goto _L4; else goto _L3
	//   15   31:aload_2         
	//   16   32:ifnull          82
_L3:
		parcel.writeInt(1);
	//   17   35:aload_3         
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		zzj1.writeToParcel(parcel, 0);
	//   20   40:aload_2         
	//   21   41:aload_3         
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #70  <Method void zzj.writeToParcel(Parcel, int)>
_L6:
		zzrp.transact(46, parcel, parcel1, 0);
	//   24   46:aload_0         
	//   25   47:getfield        #18  <Field IBinder zzrp>
	//   26   50:bipush          46
	//   27   52:aload_3         
	//   28   53:aload           4
	//   29   55:iconst_0        
	//   30   56:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   31   61:pop             
		parcel1.readException();
	//   32   62:aload           4
	//   33   64:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   34   67:aload           4
	//   35   69:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   72:aload_3         
	//   37   73:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   38   76:return          
_L2:
		zzu1 = null;
	//   39   77:aconst_null     
	//   40   78:astore_1        
		  goto _L5
	//*  41   79:goto            26
_L4:
		parcel.writeInt(0);
	//   42   82:aload_3         
	//   43   83:iconst_0        
	//   44   84:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		  goto _L6
	//*  45   87:goto            46
		zzu1;
	//   46   90:astore_1        
		parcel1.recycle();
	//   47   91:aload           4
	//   48   93:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49   96:aload_3         
	//   50   97:invokevirtual   #65  <Method void Parcel.recycle()>
		throw zzu1;
	//   51  100:aload_1         
	//   52  101:athrow          
		  goto _L5
	}

	private IBinder zzrp;

	zzv$zza$zza(IBinder ibinder)
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
