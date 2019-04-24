// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzcn

private static class zzcn$zza$zza
	implements zzcn
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	public String getId()
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
		String s;
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrp.transact(1, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrp>
	//    9   18:iconst_1        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #49  <Method String Parcel.readString()>
	//   19   36:astore_3        
		parcel1.recycle();
	//   20   37:aload_2         
	//   21   38:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_1         
	//   23   42:invokevirtual   #52  <Method void Parcel.recycle()>
		return s;
	//   24   45:aload_3         
	//   25   46:areturn         
		Exception exception;
		exception;
	//   26   47:astore_3        
		parcel1.recycle();
	//   27   48:aload_2         
	//   28   49:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   52:aload_1         
	//   30   53:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   56:aload_3         
	//   32   57:athrow          
	}

	public void zzc(String s, boolean flag)
		throws RemoteException
	{
		int i;
		Parcel parcel;
		Parcel parcel1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    5:astore          4
		parcel1 = Parcel.obtain();
	//    4    7:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    5   10:astore          5
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    6   12:aload           4
	//    7   14:ldc1            #33  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    8   16:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    9   19:aload           4
	//   10   21:aload_1         
	//   11   22:invokevirtual   #58  <Method void Parcel.writeString(String)>
		if(flag)
	//*  12   25:iload_2         
	//*  13   26:ifeq            31
			i = 1;
	//   14   29:iconst_1        
	//   15   30:istore_3        
		parcel.writeInt(i);
	//   16   31:aload           4
	//   17   33:iload_3         
	//   18   34:invokevirtual   #62  <Method void Parcel.writeInt(int)>
		zzrp.transact(4, parcel, parcel1, 0);
	//   19   37:aload_0         
	//   20   38:getfield        #18  <Field IBinder zzrp>
	//   21   41:iconst_4        
	//   22   42:aload           4
	//   23   44:aload           5
	//   24   46:iconst_0        
	//   25   47:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   52:pop             
		parcel1.readException();
	//   27   53:aload           5
	//   28   55:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   58:aload           5
	//   30   60:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   63:aload           4
	//   32   65:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   33   68:return          
		s;
	//   34   69:astore_1        
		parcel1.recycle();
	//   35   70:aload           5
	//   36   72:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   75:aload           4
	//   38   77:invokevirtual   #52  <Method void Parcel.recycle()>
		throw s;
	//   39   80:aload_1         
	//   40   81:athrow          
	}

	public boolean zzf(boolean flag)
		throws RemoteException
	{
		boolean flag1;
		Parcel parcel;
		Parcel parcel1;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    5:astore          4
		parcel1 = Parcel.obtain();
	//    4    7:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    5   10:astore          5
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    6   12:aload           4
	//    7   14:ldc1            #33  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    8   16:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		if(flag)
	//*   9   19:iload_1         
	//*  10   20:ifeq            76
			i = 1;
	//   11   23:iconst_1        
	//   12   24:istore_2        
		else
	//*  13   25:aload           4
	//*  14   27:iload_2         
	//*  15   28:invokevirtual   #62  <Method void Parcel.writeInt(int)>
	//*  16   31:aload_0         
	//*  17   32:getfield        #18  <Field IBinder zzrp>
	//*  18   35:iconst_2        
	//*  19   36:aload           4
	//*  20   38:aload           5
	//*  21   40:iconst_0        
	//*  22   41:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  23   46:pop             
	//*  24   47:aload           5
	//*  25   49:invokevirtual   #46  <Method void Parcel.readException()>
	//*  26   52:aload           5
	//*  27   54:invokevirtual   #68  <Method int Parcel.readInt()>
	//*  28   57:istore_2        
	//*  29   58:iload_2         
	//*  30   59:ifeq            81
	//*  31   62:iload_3         
	//*  32   63:istore_1        
	//*  33   64:aload           5
	//*  34   66:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  35   69:aload           4
	//*  36   71:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  37   74:iload_1         
	//*  38   75:ireturn         
			i = 0;
	//   39   76:iconst_0        
	//   40   77:istore_2        
		parcel.writeInt(i);
		zzrp.transact(2, parcel, parcel1, 0);
		parcel1.readException();
		i = parcel1.readInt();
		if(i != 0)
			flag = flag1;
		else
	//*  41   78:goto            25
			flag = false;
	//   42   81:iconst_0        
	//   43   82:istore_1        
		parcel1.recycle();
		parcel.recycle();
		return flag;
	//*  44   83:goto            64
		Exception exception;
		exception;
	//   45   86:astore          6
		parcel1.recycle();
	//   46   88:aload           5
	//   47   90:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   48   93:aload           4
	//   49   95:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   50   98:aload           6
	//   51  100:athrow          
	}

	public String zzv(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #58  <Method void Parcel.writeString(String)>
		zzrp.transact(3, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrp>
	//   12   23:iconst_3        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #46  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #49  <Method String Parcel.readString()>
	//   22   41:astore_1        
		parcel1.recycle();
	//   23   42:aload_3         
	//   24   43:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   46:aload_2         
	//   26   47:invokevirtual   #52  <Method void Parcel.recycle()>
		return s;
	//   27   50:aload_1         
	//   28   51:areturn         
		s;
	//   29   52:astore_1        
		parcel1.recycle();
	//   30   53:aload_3         
	//   31   54:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   57:aload_2         
	//   33   58:invokevirtual   #52  <Method void Parcel.recycle()>
		throw s;
	//   34   61:aload_1         
	//   35   62:athrow          
	}

	private IBinder zzrp;

	zzcn$zza$zza(IBinder ibinder)
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
