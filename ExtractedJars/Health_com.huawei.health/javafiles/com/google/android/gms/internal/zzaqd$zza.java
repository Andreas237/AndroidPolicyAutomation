// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal:
//			zzaqd

public static abstract class zzaqd$zza extends Binder
	implements zzaqd
{
	static class zza
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

		zza(IBinder ibinder)
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


	public static zzaqd asInterface(IBinder ibinder)
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
		if(iinterface != null && (iinterface instanceof zzaqd))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzaqd>
	//*  12   23:ifeq            31
			return (zzaqd)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzaqd>
	//   15   30:areturn         
		else
			return ((zzaqd) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzaqd$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzaqd$zza$zza(IBinder)>
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
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    6: default 60
	//	               1: 71
	//	               2: 94
	//	               3: 159
	//	               4: 193
	//	               5: 229
	//	               1598968902: 63
	//*   2   60:goto            263
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.flags.IFlagProvider");
	//    3   63:aload_3         
	//    4   64:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//    5   66:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   69:iconst_1        
	//    7   70:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//    8   71:aload_2         
	//    9   72:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   10   74:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			init(com.google.android.gms.dynamic.pper.zza.zzcd(parcel.readStrongBinder()));
	//   11   77:aload_0         
	//   12   78:aload_2         
	//   13   79:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   14   82:invokestatic    #55  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   15   85:invokevirtual   #59  <Method void init(IObjectWrapper)>
			parcel1.writeNoException();
	//   16   88:aload_3         
	//   17   89:invokevirtual   #62  <Method void Parcel.writeNoException()>
			return true;
	//   18   92:iconst_1        
	//   19   93:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//   20   94:aload_2         
	//   21   95:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   22   97:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			String s = parcel.readString();
	//   23  100:aload_2         
	//   24  101:invokevirtual   #66  <Method String Parcel.readString()>
	//   25  104:astore          8
			boolean flag;
			if(parcel.readInt() != 0)
	//*  26  106:aload_2         
	//*  27  107:invokevirtual   #70  <Method int Parcel.readInt()>
	//*  28  110:ifeq            119
				flag = true;
	//   29  113:iconst_1        
	//   30  114:istore          5
			else
	//*  31  116:goto            122
				flag = false;
	//   32  119:iconst_0        
	//   33  120:istore          5
			flag = getBooleanFlagValue(s, flag, parcel.readInt());
	//   34  122:aload_0         
	//   35  123:aload           8
	//   36  125:iload           5
	//   37  127:aload_2         
	//   38  128:invokevirtual   #70  <Method int Parcel.readInt()>
	//   39  131:invokevirtual   #74  <Method boolean getBooleanFlagValue(String, boolean, int)>
	//   40  134:istore          5
			parcel1.writeNoException();
	//   41  136:aload_3         
	//   42  137:invokevirtual   #62  <Method void Parcel.writeNoException()>
			if(flag)
	//*  43  140:iload           5
	//*  44  142:ifeq            150
				i = 1;
	//   45  145:iconst_1        
	//   46  146:istore_1        
			else
	//*  47  147:goto            152
				i = 0;
	//   48  150:iconst_0        
	//   49  151:istore_1        
			parcel1.writeInt(i);
	//   50  152:aload_3         
	//   51  153:iload_1         
	//   52  154:invokevirtual   #78  <Method void Parcel.writeInt(int)>
			return true;
	//   53  157:iconst_1        
	//   54  158:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//   55  159:aload_2         
	//   56  160:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   57  162:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			i = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
	//   58  165:aload_0         
	//   59  166:aload_2         
	//   60  167:invokevirtual   #66  <Method String Parcel.readString()>
	//   61  170:aload_2         
	//   62  171:invokevirtual   #70  <Method int Parcel.readInt()>
	//   63  174:aload_2         
	//   64  175:invokevirtual   #70  <Method int Parcel.readInt()>
	//   65  178:invokevirtual   #82  <Method int getIntFlagValue(String, int, int)>
	//   66  181:istore_1        
			parcel1.writeNoException();
	//   67  182:aload_3         
	//   68  183:invokevirtual   #62  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//   69  186:aload_3         
	//   70  187:iload_1         
	//   71  188:invokevirtual   #78  <Method void Parcel.writeInt(int)>
			return true;
	//   72  191:iconst_1        
	//   73  192:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//   74  193:aload_2         
	//   75  194:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   76  196:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			long l = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
	//   77  199:aload_0         
	//   78  200:aload_2         
	//   79  201:invokevirtual   #66  <Method String Parcel.readString()>
	//   80  204:aload_2         
	//   81  205:invokevirtual   #86  <Method long Parcel.readLong()>
	//   82  208:aload_2         
	//   83  209:invokevirtual   #70  <Method int Parcel.readInt()>
	//   84  212:invokevirtual   #90  <Method long getLongFlagValue(String, long, int)>
	//   85  215:lstore          6
			parcel1.writeNoException();
	//   86  217:aload_3         
	//   87  218:invokevirtual   #62  <Method void Parcel.writeNoException()>
			parcel1.writeLong(l);
	//   88  221:aload_3         
	//   89  222:lload           6
	//   90  224:invokevirtual   #94  <Method void Parcel.writeLong(long)>
			return true;
	//   91  227:iconst_1        
	//   92  228:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("com.google.android.gms.flags.IFlagProvider");
	//   93  229:aload_2         
	//   94  230:ldc1            #15  <String "com.google.android.gms.flags.IFlagProvider">
	//   95  232:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt())));
	//   96  235:aload_0         
	//   97  236:aload_2         
	//   98  237:invokevirtual   #66  <Method String Parcel.readString()>
	//   99  240:aload_2         
	//  100  241:invokevirtual   #66  <Method String Parcel.readString()>
	//  101  244:aload_2         
	//  102  245:invokevirtual   #70  <Method int Parcel.readInt()>
	//  103  248:invokevirtual   #98  <Method String getStringFlagValue(String, String, int)>
	//  104  251:astore_2        
			parcel1.writeNoException();
	//  105  252:aload_3         
	//  106  253:invokevirtual   #62  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  107  256:aload_3         
	//  108  257:aload_2         
	//  109  258:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//  110  261:iconst_1        
	//  111  262:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//  112  263:aload_0         
	//  113  264:iload_1         
	//  114  265:aload_2         
	//  115  266:aload_3         
	//  116  267:iload           4
	//  117  269:invokespecial   #100 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//  118  272:ireturn         
	}

	public zzaqd$zza()
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
