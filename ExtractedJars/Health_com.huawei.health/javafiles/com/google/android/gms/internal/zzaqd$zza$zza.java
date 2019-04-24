// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal:
//			zzaqd

static class zzaqd$zza$zza
	implements zzaqd
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public boolean getBooleanFlagValue(String s, boolean flag, int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore          5
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    8:astore          6
		parcel.writeInterfaceToken("com.google.android.gms.flags.IFlagProvider");
	//    4   10:aload           5
	//    5   12:ldc1            #33  <String "com.google.android.gms.flags.IFlagProvider">
	//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   17:aload           5
	//    8   19:aload_1         
	//    9   20:invokevirtual   #40  <Method void Parcel.writeString(String)>
		int j;
		if(flag)
	//*  10   23:iload_2         
	//*  11   24:ifeq            109
			j = 1;
	//   12   27:iconst_1        
	//   13   28:istore          4
		else
	//*  14   30:goto            33
	//*  15   33:aload           5
	//*  16   35:iload           4
	//*  17   37:invokevirtual   #44  <Method void Parcel.writeInt(int)>
	//*  18   40:aload           5
	//*  19   42:iload_3         
	//*  20   43:invokevirtual   #44  <Method void Parcel.writeInt(int)>
	//*  21   46:aload_0         
	//*  22   47:getfield        #18  <Field IBinder zzrk>
	//*  23   50:iconst_2        
	//*  24   51:aload           5
	//*  25   53:aload           6
	//*  26   55:iconst_0        
	//*  27   56:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  28   61:pop             
	//*  29   62:aload           6
	//*  30   64:invokevirtual   #53  <Method void Parcel.readException()>
	//*  31   67:aload           6
	//*  32   69:invokevirtual   #57  <Method int Parcel.readInt()>
	//*  33   72:istore_3        
	//*  34   73:iload_3         
	//*  35   74:ifeq            82
	//*  36   77:iconst_1        
	//*  37   78:istore_2        
	//*  38   79:goto            84
	//*  39   82:iconst_0        
	//*  40   83:istore_2        
	//*  41   84:aload           6
	//*  42   86:invokevirtual   #60  <Method void Parcel.recycle()>
	//*  43   89:aload           5
	//*  44   91:invokevirtual   #60  <Method void Parcel.recycle()>
	//*  45   94:iload_2         
	//*  46   95:ireturn         
	//*  47   96:astore_1        
	//*  48   97:aload           6
	//*  49   99:invokevirtual   #60  <Method void Parcel.recycle()>
	//*  50  102:aload           5
	//*  51  104:invokevirtual   #60  <Method void Parcel.recycle()>
	//*  52  107:aload_1         
	//*  53  108:athrow          
			j = 0;
	//   54  109:iconst_0        
	//   55  110:istore          4
		parcel.writeInt(j);
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
		s;
		parcel1.recycle();
		parcel.recycle();
		throw s;
	//*  56  112:goto            33
	}

	public int getIntFlagValue(String s, int i, int j)
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
		parcel.writeInterfaceToken("com.google.android.gms.flags.IFlagProvider");
	//    4   10:aload           4
	//    5   12:ldc1            #33  <String "com.google.android.gms.flags.IFlagProvider">
	//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   17:aload           4
	//    8   19:aload_1         
	//    9   20:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//   10   23:aload           4
	//   11   25:iload_2         
	//   12   26:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   13   29:aload           4
	//   14   31:iload_3         
	//   15   32:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		zzrk.transact(3, parcel, parcel1, 0);
	//   16   35:aload_0         
	//   17   36:getfield        #18  <Field IBinder zzrk>
	//   18   39:iconst_3        
	//   19   40:aload           4
	//   20   42:aload           5
	//   21   44:iconst_0        
	//   22   45:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   50:pop             
		parcel1.readException();
	//   24   51:aload           5
	//   25   53:invokevirtual   #53  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   26   56:aload           5
	//   27   58:invokevirtual   #57  <Method int Parcel.readInt()>
	//   28   61:istore_2        
		parcel1.recycle();
	//   29   62:aload           5
	//   30   64:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   67:aload           4
	//   32   69:invokevirtual   #60  <Method void Parcel.recycle()>
		return i;
	//   33   72:iload_2         
	//   34   73:ireturn         
		s;
	//   35   74:astore_1        
		parcel1.recycle();
	//   36   75:aload           5
	//   37   77:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   80:aload           4
	//   39   82:invokevirtual   #60  <Method void Parcel.recycle()>
		throw s;
	//   40   85:aload_1         
	//   41   86:athrow          
	}

	public long getLongFlagValue(String s, long l, int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore          5
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    8:astore          6
		parcel.writeInterfaceToken("com.google.android.gms.flags.IFlagProvider");
	//    4   10:aload           5
	//    5   12:ldc1            #33  <String "com.google.android.gms.flags.IFlagProvider">
	//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   17:aload           5
	//    8   19:aload_1         
	//    9   20:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeLong(l);
	//   10   23:aload           5
	//   11   25:lload_2         
	//   12   26:invokevirtual   #69  <Method void Parcel.writeLong(long)>
		parcel.writeInt(i);
	//   13   29:aload           5
	//   14   31:iload           4
	//   15   33:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		zzrk.transact(4, parcel, parcel1, 0);
	//   16   36:aload_0         
	//   17   37:getfield        #18  <Field IBinder zzrk>
	//   18   40:iconst_4        
	//   19   41:aload           5
	//   20   43:aload           6
	//   21   45:iconst_0        
	//   22   46:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   51:pop             
		parcel1.readException();
	//   24   52:aload           6
	//   25   54:invokevirtual   #53  <Method void Parcel.readException()>
		l = parcel1.readLong();
	//   26   57:aload           6
	//   27   59:invokevirtual   #73  <Method long Parcel.readLong()>
	//   28   62:lstore_2        
		parcel1.recycle();
	//   29   63:aload           6
	//   30   65:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   68:aload           5
	//   32   70:invokevirtual   #60  <Method void Parcel.recycle()>
		return l;
	//   33   73:lload_2         
	//   34   74:lreturn         
		s;
	//   35   75:astore_1        
		parcel1.recycle();
	//   36   76:aload           6
	//   37   78:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   81:aload           5
	//   39   83:invokevirtual   #60  <Method void Parcel.recycle()>
		throw s;
	//   40   86:aload_1         
	//   41   87:athrow          
	}

	public String getStringFlagValue(String s, String s1, int i)
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
		parcel.writeInterfaceToken("com.google.android.gms.flags.IFlagProvider");
	//    4   10:aload           4
	//    5   12:ldc1            #33  <String "com.google.android.gms.flags.IFlagProvider">
	//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   17:aload           4
	//    8   19:aload_1         
	//    9   20:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   10   23:aload           4
	//   11   25:aload_2         
	//   12   26:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//   13   29:aload           4
	//   14   31:iload_3         
	//   15   32:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		zzrk.transact(5, parcel, parcel1, 0);
	//   16   35:aload_0         
	//   17   36:getfield        #18  <Field IBinder zzrk>
	//   18   39:iconst_5        
	//   19   40:aload           4
	//   20   42:aload           5
	//   21   44:iconst_0        
	//   22   45:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   50:pop             
		parcel1.readException();
	//   24   51:aload           5
	//   25   53:invokevirtual   #53  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   26   56:aload           5
	//   27   58:invokevirtual   #79  <Method String Parcel.readString()>
	//   28   61:astore_1        
		parcel1.recycle();
	//   29   62:aload           5
	//   30   64:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   67:aload           4
	//   32   69:invokevirtual   #60  <Method void Parcel.recycle()>
		return s;
	//   33   72:aload_1         
	//   34   73:areturn         
		s;
	//   35   74:astore_1        
		parcel1.recycle();
	//   36   75:aload           5
	//   37   77:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   80:aload           4
	//   39   82:invokevirtual   #60  <Method void Parcel.recycle()>
		throw s;
	//   40   85:aload_1         
	//   41   86:athrow          
	}

	public void init(IObjectWrapper iobjectwrapper)
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
		parcel.writeInterfaceToken("com.google.android.gms.flags.IFlagProvider");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.flags.IFlagProvider">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(iobjectwrapper == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          71
_L1:
		iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #85  <Method IBinder IObjectWrapper.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #88  <Method void Parcel.writeStrongBinder(IBinder)>
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
	//   27   52:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   55:aload_2         
	//   29   56:invokevirtual   #60  <Method void Parcel.recycle()>
		return;
	//   30   59:return          
		iobjectwrapper;
	//   31   60:astore_1        
		parcel1.recycle();
	//   32   61:aload_3         
	//   33   62:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   65:aload_2         
	//   35   66:invokevirtual   #60  <Method void Parcel.recycle()>
		throw iobjectwrapper;
	//   36   69:aload_1         
	//   37   70:athrow          
_L2:
		iobjectwrapper = null;
	//   38   71:aconst_null     
	//   39   72:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   73:goto            28
_L3:
	}

	private IBinder zzrk;

	zzaqd$zza$zza(IBinder ibinder)
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
