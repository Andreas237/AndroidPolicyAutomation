// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.os.*;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.dynamite:
//			zza

private static class zza$zza$zza
	implements zza
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	public int zza(zzd zzd1, String s, boolean flag)
		throws RemoteException
	{
		int i;
		Parcel parcel;
		Parcel parcel1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		parcel = Parcel.obtain();
	//    2    3:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    6:astore          5
		parcel1 = Parcel.obtain();
	//    4    8:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    5   11:astore          6
		parcel.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
	//    6   13:aload           5
	//    7   15:ldc1            #32  <String "com.google.android.gms.dynamite.IDynamiteLoader">
	//    8   17:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzd1 == null)
			break MISSING_BLOCK_LABEL_98;
	//    9   20:aload_1         
	//   10   21:ifnull          98
		zzd1 = ((zzd) (zzd1.asBinder()));
	//   11   24:aload_1         
	//   12   25:invokeinterface #40  <Method IBinder zzd.asBinder()>
	//   13   30:astore_1        
_L1:
		parcel.writeStrongBinder(((IBinder) (zzd1)));
	//   14   31:aload           5
	//   15   33:aload_1         
	//   16   34:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
		parcel.writeString(s);
	//   17   37:aload           5
	//   18   39:aload_2         
	//   19   40:invokevirtual   #46  <Method void Parcel.writeString(String)>
		if(flag)
	//*  20   43:iload_3         
	//*  21   44:ifeq            50
			i = 1;
	//   22   47:iconst_1        
	//   23   48:istore          4
		parcel.writeInt(i);
	//   24   50:aload           5
	//   25   52:iload           4
	//   26   54:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		zzrp.transact(3, parcel, parcel1, 0);
	//   27   57:aload_0         
	//   28   58:getfield        #18  <Field IBinder zzrp>
	//   29   61:iconst_3        
	//   30   62:aload           5
	//   31   64:aload           6
	//   32   66:iconst_0        
	//   33   67:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   34   72:pop             
		parcel1.readException();
	//   35   73:aload           6
	//   36   75:invokevirtual   #59  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   37   78:aload           6
	//   38   80:invokevirtual   #63  <Method int Parcel.readInt()>
	//   39   83:istore          4
		parcel1.recycle();
	//   40   85:aload           6
	//   41   87:invokevirtual   #66  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   90:aload           5
	//   43   92:invokevirtual   #66  <Method void Parcel.recycle()>
		return i;
	//   44   95:iload           4
	//   45   97:ireturn         
		zzd1 = null;
	//   46   98:aconst_null     
	//   47   99:astore_1        
		  goto _L1
	//*  48  100:goto            31
		zzd1;
	//   49  103:astore_1        
		parcel1.recycle();
	//   50  104:aload           6
	//   51  106:invokevirtual   #66  <Method void Parcel.recycle()>
		parcel.recycle();
	//   52  109:aload           5
	//   53  111:invokevirtual   #66  <Method void Parcel.recycle()>
		throw zzd1;
	//   54  114:aload_1         
	//   55  115:athrow          
	}

	public zzd zza(zzd zzd1, String s, int i)
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
		parcel.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "com.google.android.gms.dynamite.IDynamiteLoader">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzd1 == null)
			break MISSING_BLOCK_LABEL_88;
	//    7   17:aload_1         
	//    8   18:ifnull          88
		zzd1 = ((zzd) (zzd1.asBinder()));
	//    9   21:aload_1         
	//   10   22:invokeinterface #40  <Method IBinder zzd.asBinder()>
	//   11   27:astore_1        
_L1:
		parcel.writeStrongBinder(((IBinder) (zzd1)));
	//   12   28:aload           4
	//   13   30:aload_1         
	//   14   31:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
		parcel.writeString(s);
	//   15   34:aload           4
	//   16   36:aload_2         
	//   17   37:invokevirtual   #46  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//   18   40:aload           4
	//   19   42:iload_3         
	//   20   43:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		zzrp.transact(2, parcel, parcel1, 0);
	//   21   46:aload_0         
	//   22   47:getfield        #18  <Field IBinder zzrp>
	//   23   50:iconst_2        
	//   24   51:aload           4
	//   25   53:aload           5
	//   26   55:iconst_0        
	//   27   56:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   28   61:pop             
		parcel1.readException();
	//   29   62:aload           5
	//   30   64:invokevirtual   #59  <Method void Parcel.readException()>
		zzd1 = com.google.android.gms.dynamic.zzd.zza.zzcd(parcel1.readStrongBinder());
	//   31   67:aload           5
	//   32   69:invokevirtual   #71  <Method IBinder Parcel.readStrongBinder()>
	//   33   72:invokestatic    #77  <Method zzd com.google.android.gms.dynamic.zzd$zza.zzcd(IBinder)>
	//   34   75:astore_1        
		parcel1.recycle();
	//   35   76:aload           5
	//   36   78:invokevirtual   #66  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   81:aload           4
	//   38   83:invokevirtual   #66  <Method void Parcel.recycle()>
		return zzd1;
	//   39   86:aload_1         
	//   40   87:areturn         
		zzd1 = null;
	//   41   88:aconst_null     
	//   42   89:astore_1        
		  goto _L1
	//*  43   90:goto            28
		zzd1;
	//   44   93:astore_1        
		parcel1.recycle();
	//   45   94:aload           5
	//   46   96:invokevirtual   #66  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   99:aload           4
	//   48  101:invokevirtual   #66  <Method void Parcel.recycle()>
		throw zzd1;
	//   49  104:aload_1         
	//   50  105:athrow          
	}

	public int zzf(zzd zzd1, String s)
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
		parcel.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "com.google.android.gms.dynamite.IDynamiteLoader">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzd1 == null)
			break MISSING_BLOCK_LABEL_79;
	//    7   17:aload_1         
	//    8   18:ifnull          79
		zzd1 = ((zzd) (zzd1.asBinder()));
	//    9   21:aload_1         
	//   10   22:invokeinterface #40  <Method IBinder zzd.asBinder()>
	//   11   27:astore_1        
_L1:
		int i;
		parcel.writeStrongBinder(((IBinder) (zzd1)));
	//   12   28:aload           4
	//   13   30:aload_1         
	//   14   31:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
		parcel.writeString(s);
	//   15   34:aload           4
	//   16   36:aload_2         
	//   17   37:invokevirtual   #46  <Method void Parcel.writeString(String)>
		zzrp.transact(1, parcel, parcel1, 0);
	//   18   40:aload_0         
	//   19   41:getfield        #18  <Field IBinder zzrp>
	//   20   44:iconst_1        
	//   21   45:aload           4
	//   22   47:aload           5
	//   23   49:iconst_0        
	//   24   50:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   25   55:pop             
		parcel1.readException();
	//   26   56:aload           5
	//   27   58:invokevirtual   #59  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   28   61:aload           5
	//   29   63:invokevirtual   #63  <Method int Parcel.readInt()>
	//   30   66:istore_3        
		parcel1.recycle();
	//   31   67:aload           5
	//   32   69:invokevirtual   #66  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   72:aload           4
	//   34   74:invokevirtual   #66  <Method void Parcel.recycle()>
		return i;
	//   35   77:iload_3         
	//   36   78:ireturn         
		zzd1 = null;
	//   37   79:aconst_null     
	//   38   80:astore_1        
		  goto _L1
	//*  39   81:goto            28
		zzd1;
	//   40   84:astore_1        
		parcel1.recycle();
	//   41   85:aload           5
	//   42   87:invokevirtual   #66  <Method void Parcel.recycle()>
		parcel.recycle();
	//   43   90:aload           4
	//   44   92:invokevirtual   #66  <Method void Parcel.recycle()>
		throw zzd1;
	//   45   95:aload_1         
	//   46   96:athrow          
	}

	private IBinder zzrp;

	zza$zza$zza(IBinder ibinder)
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
