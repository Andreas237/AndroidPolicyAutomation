// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzw

private static class zzw$zza$zza
	implements zzw
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	public boolean zzd(String s, zzd zzd1)
		throws RemoteException
	{
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		parcel = Parcel.obtain();
	//    2    3:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    6:astore          5
		parcel1 = Parcel.obtain();
	//    4    8:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    5   11:astore          6
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
	//    6   13:aload           5
	//    7   15:ldc1            #33  <String "com.google.android.gms.common.internal.IGoogleCertificatesApi">
	//    8   17:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    9   20:aload           5
	//   10   22:aload_1         
	//   11   23:invokevirtual   #40  <Method void Parcel.writeString(String)>
		if(zzd1 == null)
			break MISSING_BLOCK_LABEL_90;
	//   12   26:aload_2         
	//   13   27:ifnull          90
		s = ((String) (zzd1.asBinder()));
	//   14   30:aload_2         
	//   15   31:invokeinterface #44  <Method IBinder zzd.asBinder()>
	//   16   36:astore_1        
_L1:
		int i;
		parcel.writeStrongBinder(((IBinder) (s)));
	//   17   37:aload           5
	//   18   39:aload_1         
	//   19   40:invokevirtual   #47  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrp.transact(3, parcel, parcel1, 0);
	//   20   43:aload_0         
	//   21   44:getfield        #18  <Field IBinder zzrp>
	//   22   47:iconst_3        
	//   23   48:aload           5
	//   24   50:aload           6
	//   25   52:iconst_0        
	//   26   53:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   58:pop             
		parcel1.readException();
	//   28   59:aload           6
	//   29   61:invokevirtual   #56  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   30   64:aload           6
	//   31   66:invokevirtual   #60  <Method int Parcel.readInt()>
	//   32   69:istore_3        
		if(i != 0)
	//*  33   70:iload_3         
	//*  34   71:ifeq            77
			flag = true;
	//   35   74:iconst_1        
	//   36   75:istore          4
		parcel1.recycle();
	//   37   77:aload           6
	//   38   79:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   82:aload           5
	//   40   84:invokevirtual   #63  <Method void Parcel.recycle()>
		return flag;
	//   41   87:iload           4
	//   42   89:ireturn         
		s = null;
	//   43   90:aconst_null     
	//   44   91:astore_1        
		  goto _L1
	//*  45   92:goto            37
		s;
	//   46   95:astore_1        
		parcel1.recycle();
	//   47   96:aload           6
	//   48   98:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49  101:aload           5
	//   50  103:invokevirtual   #63  <Method void Parcel.recycle()>
		throw s;
	//   51  106:aload_1         
	//   52  107:athrow          
	}

	public boolean zze(String s, zzd zzd1)
		throws RemoteException
	{
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		parcel = Parcel.obtain();
	//    2    3:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    6:astore          5
		parcel1 = Parcel.obtain();
	//    4    8:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    5   11:astore          6
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
	//    6   13:aload           5
	//    7   15:ldc1            #33  <String "com.google.android.gms.common.internal.IGoogleCertificatesApi">
	//    8   17:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    9   20:aload           5
	//   10   22:aload_1         
	//   11   23:invokevirtual   #40  <Method void Parcel.writeString(String)>
		if(zzd1 == null)
			break MISSING_BLOCK_LABEL_90;
	//   12   26:aload_2         
	//   13   27:ifnull          90
		s = ((String) (zzd1.asBinder()));
	//   14   30:aload_2         
	//   15   31:invokeinterface #44  <Method IBinder zzd.asBinder()>
	//   16   36:astore_1        
_L1:
		int i;
		parcel.writeStrongBinder(((IBinder) (s)));
	//   17   37:aload           5
	//   18   39:aload_1         
	//   19   40:invokevirtual   #47  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrp.transact(4, parcel, parcel1, 0);
	//   20   43:aload_0         
	//   21   44:getfield        #18  <Field IBinder zzrp>
	//   22   47:iconst_4        
	//   23   48:aload           5
	//   24   50:aload           6
	//   25   52:iconst_0        
	//   26   53:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   58:pop             
		parcel1.readException();
	//   28   59:aload           6
	//   29   61:invokevirtual   #56  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   30   64:aload           6
	//   31   66:invokevirtual   #60  <Method int Parcel.readInt()>
	//   32   69:istore_3        
		if(i != 0)
	//*  33   70:iload_3         
	//*  34   71:ifeq            77
			flag = true;
	//   35   74:iconst_1        
	//   36   75:istore          4
		parcel1.recycle();
	//   37   77:aload           6
	//   38   79:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   82:aload           5
	//   40   84:invokevirtual   #63  <Method void Parcel.recycle()>
		return flag;
	//   41   87:iload           4
	//   42   89:ireturn         
		s = null;
	//   43   90:aconst_null     
	//   44   91:astore_1        
		  goto _L1
	//*  45   92:goto            37
		s;
	//   46   95:astore_1        
		parcel1.recycle();
	//   47   96:aload           6
	//   48   98:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49  101:aload           5
	//   50  103:invokevirtual   #63  <Method void Parcel.recycle()>
		throw s;
	//   51  106:aload_1         
	//   52  107:athrow          
	}

	public zzd zzxv()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		zzd zzd1;
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.common.internal.IGoogleCertificatesApi">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrp.transact(1, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrp>
	//    9   18:iconst_1        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #56  <Method void Parcel.readException()>
		zzd1 = com.google.android.gms.dynamic.zzd.zza.zzcd(parcel1.readStrongBinder());
	//   17   32:aload_2         
	//   18   33:invokevirtual   #70  <Method IBinder Parcel.readStrongBinder()>
	//   19   36:invokestatic    #76  <Method zzd com.google.android.gms.dynamic.zzd$zza.zzcd(IBinder)>
	//   20   39:astore_3        
		parcel1.recycle();
	//   21   40:aload_2         
	//   22   41:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #63  <Method void Parcel.recycle()>
		return zzd1;
	//   25   48:aload_3         
	//   26   49:areturn         
		Exception exception;
		exception;
	//   27   50:astore_3        
		parcel1.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #63  <Method void Parcel.recycle()>
		throw exception;
	//   32   59:aload_3         
	//   33   60:athrow          
	}

	public zzd zzxw()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		zzd zzd1;
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.common.internal.IGoogleCertificatesApi">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrp.transact(2, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrp>
	//    9   18:iconst_2        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #56  <Method void Parcel.readException()>
		zzd1 = com.google.android.gms.dynamic.zzd.zza.zzcd(parcel1.readStrongBinder());
	//   17   32:aload_2         
	//   18   33:invokevirtual   #70  <Method IBinder Parcel.readStrongBinder()>
	//   19   36:invokestatic    #76  <Method zzd com.google.android.gms.dynamic.zzd$zza.zzcd(IBinder)>
	//   20   39:astore_3        
		parcel1.recycle();
	//   21   40:aload_2         
	//   22   41:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #63  <Method void Parcel.recycle()>
		return zzd1;
	//   25   48:aload_3         
	//   26   49:areturn         
		Exception exception;
		exception;
	//   27   50:astore_3        
		parcel1.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #63  <Method void Parcel.recycle()>
		throw exception;
	//   32   59:aload_3         
	//   33   60:athrow          
	}

	private IBinder zzrp;

	zzw$zza$zza(IBinder ibinder)
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
