// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.internal:
//			zzapq

public static abstract class zzapq$zza extends Binder
	implements zzapq
{
	private static class zza
		implements zzapq
	{

		public IBinder asBinder()
		{
			return zzrp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrp>
		//    2    4:areturn         
		}

		public boolean getBooleanFlagValue(String s, boolean flag, int i)
			throws RemoteException
		{
			boolean flag1;
			Parcel parcel;
			Parcel parcel1;
			flag1 = true;
		//    0    0:iconst_1        
		//    1    1:istore          5
			parcel = Parcel.obtain();
		//    2    3:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    6:astore          6
			parcel1 = Parcel.obtain();
		//    4    8:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    5   11:astore          7
			parcel.writeInterfaceToken("com.google.android.gms.flags.IFlagProvider");
		//    6   13:aload           6
		//    7   15:ldc1            #33  <String "com.google.android.gms.flags.IFlagProvider">
		//    8   17:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    9   20:aload           6
		//   10   22:aload_1         
		//   11   23:invokevirtual   #40  <Method void Parcel.writeString(String)>
			int j;
			if(flag)
		//*  12   26:iload_2         
		//*  13   27:ifeq            92
				j = 1;
		//   14   30:iconst_1        
		//   15   31:istore          4
			else
		//*  16   33:aload           6
		//*  17   35:iload           4
		//*  18   37:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		//*  19   40:aload           6
		//*  20   42:iload_3         
		//*  21   43:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		//*  22   46:aload_0         
		//*  23   47:getfield        #18  <Field IBinder zzrp>
		//*  24   50:iconst_2        
		//*  25   51:aload           6
		//*  26   53:aload           7
		//*  27   55:iconst_0        
		//*  28   56:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  29   61:pop             
		//*  30   62:aload           7
		//*  31   64:invokevirtual   #53  <Method void Parcel.readException()>
		//*  32   67:aload           7
		//*  33   69:invokevirtual   #57  <Method int Parcel.readInt()>
		//*  34   72:istore_3        
		//*  35   73:iload_3         
		//*  36   74:ifeq            98
		//*  37   77:iload           5
		//*  38   79:istore_2        
		//*  39   80:aload           7
		//*  40   82:invokevirtual   #60  <Method void Parcel.recycle()>
		//*  41   85:aload           6
		//*  42   87:invokevirtual   #60  <Method void Parcel.recycle()>
		//*  43   90:iload_2         
		//*  44   91:ireturn         
				j = 0;
		//   45   92:iconst_0        
		//   46   93:istore          4
			parcel.writeInt(j);
			parcel.writeInt(i);
			zzrp.transact(2, parcel, parcel1, 0);
			parcel1.readException();
			i = parcel1.readInt();
			if(i != 0)
				flag = flag1;
			else
		//*  47   95:goto            33
				flag = false;
		//   48   98:iconst_0        
		//   49   99:istore_2        
			parcel1.recycle();
			parcel.recycle();
			return flag;
		//*  50  100:goto            80
			s;
		//   51  103:astore_1        
			parcel1.recycle();
		//   52  104:aload           7
		//   53  106:invokevirtual   #60  <Method void Parcel.recycle()>
			parcel.recycle();
		//   54  109:aload           6
		//   55  111:invokevirtual   #60  <Method void Parcel.recycle()>
			throw s;
		//   56  114:aload_1         
		//   57  115:athrow          
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
			zzrp.transact(3, parcel, parcel1, 0);
		//   16   35:aload_0         
		//   17   36:getfield        #18  <Field IBinder zzrp>
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
			zzrp.transact(4, parcel, parcel1, 0);
		//   16   36:aload_0         
		//   17   37:getfield        #18  <Field IBinder zzrp>
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
			zzrp.transact(5, parcel, parcel1, 0);
		//   16   35:aload_0         
		//   17   36:getfield        #18  <Field IBinder zzrp>
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

		public void init(zzd zzd1)
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
			if(zzd1 == null)
				break MISSING_BLOCK_LABEL_57;
		//    7   14:aload_1         
		//    8   15:ifnull          57
			zzd1 = ((zzd) (zzd1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #85  <Method IBinder zzd.asBinder()>
		//   11   24:astore_1        
_L1:
			parcel.writeStrongBinder(((IBinder) (zzd1)));
		//   12   25:aload_2         
		//   13   26:aload_1         
		//   14   27:invokevirtual   #88  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrp.transact(1, parcel, parcel1, 0);
		//   15   30:aload_0         
		//   16   31:getfield        #18  <Field IBinder zzrp>
		//   17   34:iconst_1        
		//   18   35:aload_2         
		//   19   36:aload_3         
		//   20   37:iconst_0        
		//   21   38:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   22   43:pop             
			parcel1.readException();
		//   23   44:aload_3         
		//   24   45:invokevirtual   #53  <Method void Parcel.readException()>
			parcel1.recycle();
		//   25   48:aload_3         
		//   26   49:invokevirtual   #60  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   52:aload_2         
		//   28   53:invokevirtual   #60  <Method void Parcel.recycle()>
			return;
		//   29   56:return          
			zzd1 = null;
		//   30   57:aconst_null     
		//   31   58:astore_1        
			  goto _L1
		//*  32   59:goto            25
			zzd1;
		//   33   62:astore_1        
			parcel1.recycle();
		//   34   63:aload_3         
		//   35   64:invokevirtual   #60  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   67:aload_2         
		//   37   68:invokevirtual   #60  <Method void Parcel.recycle()>
			throw zzd1;
		//   38   71:aload_1         
		//   39   72:athrow          
		}

		private IBinder zzrp;

		zza(IBinder ibinder)
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


	public static zzapq asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzapq))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzapq>
	//*  12   23:ifeq            31
			return (zzapq)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzapq>
	//   15   30:areturn         
		else
			return ((zzapq) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzapq$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzapq$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public IBinder asBinder()
	{
		return ((IBinder) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		switch(i)
	//*   2    3:iload_1         
		{
	//*   3    4:lookupswitch    6: default 64
	//	               1: 82
	//	               2: 105
	//	               3: 168
	//	               4: 202
	//	               5: 238
	//	               1598968902: 74
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    4   64:aload_0         
	//    5   65:iload_1         
	//    6   66:aload_2         
	//    7   67:aload_3         
	//    8   68:iload           4
	//    9   70:invokespecial   #39  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   10   73:ireturn         

		case 1598968902: 
			parcel1.writeString("com.google.android.gms.flags.IFlagProvider");
	//   11   74:aload_3         
	//   12   75:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   13   77:invokevirtual   #45  <Method void Parcel.writeString(String)>
			return true;
	//   14   80:iconst_1        
	//   15   81:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//   16   82:aload_2         
	//   17   83:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   18   85:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			init(com.google.android.gms.dynamic.zzd.zza.zzcd(parcel.readStrongBinder()));
	//   19   88:aload_0         
	//   20   89:aload_2         
	//   21   90:invokevirtual   #51  <Method IBinder Parcel.readStrongBinder()>
	//   22   93:invokestatic    #57  <Method zzd com.google.android.gms.dynamic.zzd$zza.zzcd(IBinder)>
	//   23   96:invokevirtual   #61  <Method void init(zzd)>
			parcel1.writeNoException();
	//   24   99:aload_3         
	//   25  100:invokevirtual   #64  <Method void Parcel.writeNoException()>
			return true;
	//   26  103:iconst_1        
	//   27  104:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//   28  105:aload_2         
	//   29  106:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   30  108:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			String s = parcel.readString();
	//   31  111:aload_2         
	//   32  112:invokevirtual   #68  <Method String Parcel.readString()>
	//   33  115:astore          9
			boolean flag1;
			if(parcel.readInt() != 0)
	//*  34  117:aload_2         
	//*  35  118:invokevirtual   #72  <Method int Parcel.readInt()>
	//*  36  121:ifeq            162
				flag1 = true;
	//   37  124:iconst_1        
	//   38  125:istore          6
			else
	//*  39  127:aload_0         
	//*  40  128:aload           9
	//*  41  130:iload           6
	//*  42  132:aload_2         
	//*  43  133:invokevirtual   #72  <Method int Parcel.readInt()>
	//*  44  136:invokevirtual   #76  <Method boolean getBooleanFlagValue(String, boolean, int)>
	//*  45  139:istore          6
	//*  46  141:aload_3         
	//*  47  142:invokevirtual   #64  <Method void Parcel.writeNoException()>
	//*  48  145:iload           5
	//*  49  147:istore_1        
	//*  50  148:iload           6
	//*  51  150:ifeq            155
	//*  52  153:iconst_1        
	//*  53  154:istore_1        
	//*  54  155:aload_3         
	//*  55  156:iload_1         
	//*  56  157:invokevirtual   #80  <Method void Parcel.writeInt(int)>
	//*  57  160:iconst_1        
	//*  58  161:ireturn         
				flag1 = false;
	//   59  162:iconst_0        
	//   60  163:istore          6
			flag1 = getBooleanFlagValue(s, flag1, parcel.readInt());
			parcel1.writeNoException();
			i = ((int) (flag));
			if(flag1)
				i = 1;
			parcel1.writeInt(i);
			return true;

	//*  61  165:goto            127
		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//   62  168:aload_2         
	//   63  169:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   64  171:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			i = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
	//   65  174:aload_0         
	//   66  175:aload_2         
	//   67  176:invokevirtual   #68  <Method String Parcel.readString()>
	//   68  179:aload_2         
	//   69  180:invokevirtual   #72  <Method int Parcel.readInt()>
	//   70  183:aload_2         
	//   71  184:invokevirtual   #72  <Method int Parcel.readInt()>
	//   72  187:invokevirtual   #84  <Method int getIntFlagValue(String, int, int)>
	//   73  190:istore_1        
			parcel1.writeNoException();
	//   74  191:aload_3         
	//   75  192:invokevirtual   #64  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//   76  195:aload_3         
	//   77  196:iload_1         
	//   78  197:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			return true;
	//   79  200:iconst_1        
	//   80  201:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//   81  202:aload_2         
	//   82  203:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   83  205:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			long l = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
	//   84  208:aload_0         
	//   85  209:aload_2         
	//   86  210:invokevirtual   #68  <Method String Parcel.readString()>
	//   87  213:aload_2         
	//   88  214:invokevirtual   #88  <Method long Parcel.readLong()>
	//   89  217:aload_2         
	//   90  218:invokevirtual   #72  <Method int Parcel.readInt()>
	//   91  221:invokevirtual   #92  <Method long getLongFlagValue(String, long, int)>
	//   92  224:lstore          7
			parcel1.writeNoException();
	//   93  226:aload_3         
	//   94  227:invokevirtual   #64  <Method void Parcel.writeNoException()>
			parcel1.writeLong(l);
	//   95  230:aload_3         
	//   96  231:lload           7
	//   97  233:invokevirtual   #96  <Method void Parcel.writeLong(long)>
			return true;
	//   98  236:iconst_1        
	//   99  237:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//  100  238:aload_2         
	//  101  239:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//  102  241:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt())));
	//  103  244:aload_0         
	//  104  245:aload_2         
	//  105  246:invokevirtual   #68  <Method String Parcel.readString()>
	//  106  249:aload_2         
	//  107  250:invokevirtual   #68  <Method String Parcel.readString()>
	//  108  253:aload_2         
	//  109  254:invokevirtual   #72  <Method int Parcel.readInt()>
	//  110  257:invokevirtual   #100 <Method String getStringFlagValue(String, String, int)>
	//  111  260:astore_2        
			parcel1.writeNoException();
	//  112  261:aload_3         
	//  113  262:invokevirtual   #64  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  114  265:aload_3         
	//  115  266:aload_2         
	//  116  267:invokevirtual   #45  <Method void Parcel.writeString(String)>
			return true;
	//  117  270:iconst_1        
	//  118  271:ireturn         
		}
	}

	public zzapq$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.flags.IFlagProvider");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
