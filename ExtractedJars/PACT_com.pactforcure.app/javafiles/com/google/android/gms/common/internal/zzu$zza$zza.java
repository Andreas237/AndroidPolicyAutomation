// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzu

private static class zzu$zza$zza
	implements zzu
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	public void zza(int i, IBinder ibinder, Bundle bundle)
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
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           4
	//    8   19:iload_1         
	//    9   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		parcel.writeStrongBinder(ibinder);
	//   10   23:aload           4
	//   11   25:aload_2         
	//   12   26:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_78;
	//   13   29:aload_3         
	//   14   30:ifnull          78
		parcel.writeInt(1);
	//   15   33:aload           4
	//   16   35:iconst_1        
	//   17   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   18   39:aload_3         
	//   19   40:aload           4
	//   20   42:iconst_0        
	//   21   43:invokevirtual   #49  <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		zzrp.transact(1, parcel, parcel1, 0);
	//   22   46:aload_0         
	//   23   47:getfield        #18  <Field IBinder zzrp>
	//   24   50:iconst_1        
	//   25   51:aload           4
	//   26   53:aload           5
	//   27   55:iconst_0        
	//   28   56:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   29   61:pop             
		parcel1.readException();
	//   30   62:aload           5
	//   31   64:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   32   67:aload           5
	//   33   69:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   72:aload           4
	//   35   74:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   36   77:return          
		parcel.writeInt(0);
	//   37   78:aload           4
	//   38   80:iconst_0        
	//   39   81:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  40   84:goto            46
		ibinder;
	//   41   87:astore_2        
		parcel1.recycle();
	//   42   88:aload           5
	//   43   90:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   44   93:aload           4
	//   45   95:invokevirtual   #61  <Method void Parcel.recycle()>
		throw ibinder;
	//   46   98:aload_2         
	//   47   99:athrow          
	}

	public void zzb(int i, Bundle bundle)
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
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_65;
	//   10   20:aload_2         
	//   11   21:ifnull          65
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #49  <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		zzrp.transact(2, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #18  <Field IBinder zzrp>
	//   21   39:iconst_2        
	//   22   40:aload_3         
	//   23   41:aload           4
	//   24   43:iconst_0        
	//   25   44:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   49:pop             
		parcel1.readException();
	//   27   50:aload           4
	//   28   52:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   55:aload           4
	//   30   57:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   60:aload_3         
	//   32   61:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   33   64:return          
		parcel.writeInt(0);
	//   34   65:aload_3         
	//   35   66:iconst_0        
	//   36   67:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   70:goto            35
		bundle;
	//   38   73:astore_2        
		parcel1.recycle();
	//   39   74:aload           4
	//   40   76:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   79:aload_3         
	//   42   80:invokevirtual   #61  <Method void Parcel.recycle()>
		throw bundle;
	//   43   83:aload_2         
	//   44   84:athrow          
	}

	private IBinder zzrp;

	zzu$zza$zza(IBinder ibinder)
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
