// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzcq

static class zzcq$zza$zza
	implements zzcq
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
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
		zzrk.transact(1, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
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
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    4   10:aload           4
	//    5   12:ldc1            #33  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   17:aload           4
	//    8   19:aload_1         
	//    9   20:invokevirtual   #58  <Method void Parcel.writeString(String)>
		int i;
		if(flag)
	//*  10   23:iload_2         
	//*  11   24:ifeq            83
			i = 1;
	//   12   27:iconst_1        
	//   13   28:istore_3        
		else
	//*  14   29:goto            32
	//*  15   32:aload           4
	//*  16   34:iload_3         
	//*  17   35:invokevirtual   #62  <Method void Parcel.writeInt(int)>
	//*  18   38:aload_0         
	//*  19   39:getfield        #18  <Field IBinder zzrk>
	//*  20   42:iconst_4        
	//*  21   43:aload           4
	//*  22   45:aload           5
	//*  23   47:iconst_0        
	//*  24   48:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  25   53:pop             
	//*  26   54:aload           5
	//*  27   56:invokevirtual   #46  <Method void Parcel.readException()>
	//*  28   59:aload           5
	//*  29   61:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  30   64:aload           4
	//*  31   66:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  32   69:return          
	//*  33   70:astore_1        
	//*  34   71:aload           5
	//*  35   73:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  36   76:aload           4
	//*  37   78:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  38   81:aload_1         
	//*  39   82:athrow          
			i = 0;
	//   40   83:iconst_0        
	//   41   84:istore_3        
		parcel.writeInt(i);
		zzrk.transact(4, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		s;
		parcel1.recycle();
		parcel.recycle();
		throw s;
	//*  42   85:goto            32
	}

	public boolean zzf(boolean flag)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            91
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #62  <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:iconst_2        
	//*  18   34:aload_3         
	//*  19   35:aload           4
	//*  20   37:iconst_0        
	//*  21   38:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   43:pop             
	//*  23   44:aload           4
	//*  24   46:invokevirtual   #46  <Method void Parcel.readException()>
	//*  25   49:aload           4
	//*  26   51:invokevirtual   #68  <Method int Parcel.readInt()>
	//*  27   54:istore_2        
	//*  28   55:iload_2         
	//*  29   56:ifeq            64
	//*  30   59:iconst_1        
	//*  31   60:istore_1        
	//*  32   61:goto            66
	//*  33   64:iconst_0        
	//*  34   65:istore_1        
	//*  35   66:aload           4
	//*  36   68:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  37   71:aload_3         
	//*  38   72:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  39   75:iload_1         
	//*  40   76:ireturn         
	//*  41   77:astore          5
	//*  42   79:aload           4
	//*  43   81:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  44   84:aload_3         
	//*  45   85:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  46   88:aload           5
	//*  47   90:athrow          
			i = 0;
	//   48   91:iconst_0        
	//   49   92:istore_2        
		parcel.writeInt(i);
		zzrk.transact(2, parcel, parcel1, 0);
		parcel1.readException();
		i = parcel1.readInt();
		if(i != 0)
			flag = true;
		else
			flag = false;
		parcel1.recycle();
		parcel.recycle();
		return flag;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  50   93:goto            24
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
		zzrk.transact(3, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
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

	private IBinder zzrk;

	zzcq$zza$zza(IBinder ibinder)
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
