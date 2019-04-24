// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

public interface zzcn
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzcn
	{

		public static zzcn zzf(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzcn))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzcn>
		//*  12   23:ifeq            31
				return (zzcn)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzcn>
		//   15   30:areturn         
			else
				return ((zzcn) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzcn$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void zzcn$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore          6
			boolean flag = false;
		//    2    3:iconst_0        
		//    3    4:istore          5
			String s;
			switch(i)
		//*   4    6:iload_1         
			{
		//*   5    7:lookupswitch    5: default 56
		//		               1: 74
		//		               2: 96
		//		               3: 147
		//		               4: 173
		//		               1598968902: 66
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//    6   56:aload_0         
		//    7   57:iload_1         
		//    8   58:aload_2         
		//    9   59:aload_3         
		//   10   60:iload           4
		//   11   62:invokespecial   #30  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   12   65:ireturn         

			case 1598968902: 
				parcel1.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
		//   13   66:aload_3         
		//   14   67:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
		//   15   69:invokevirtual   #36  <Method void Parcel.writeString(String)>
				return true;
		//   16   72:iconst_1        
		//   17   73:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
		//   18   74:aload_2         
		//   19   75:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
		//   20   77:invokevirtual   #39  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getId()));
		//   21   80:aload_0         
		//   22   81:invokevirtual   #43  <Method String getId()>
		//   23   84:astore_2        
				parcel1.writeNoException();
		//   24   85:aload_3         
		//   25   86:invokevirtual   #47  <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//   26   89:aload_3         
		//   27   90:aload_2         
		//   28   91:invokevirtual   #36  <Method void Parcel.writeString(String)>
				return true;
		//   29   94:iconst_1        
		//   30   95:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
		//   31   96:aload_2         
		//   32   97:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
		//   33   99:invokevirtual   #39  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  34  102:aload_2         
		//*  35  103:invokevirtual   #51  <Method int Parcel.readInt()>
		//*  36  106:ifeq            141
					flag1 = true;
		//   37  109:iconst_1        
		//   38  110:istore          6
				else
		//*  39  112:aload_0         
		//*  40  113:iload           6
		//*  41  115:invokevirtual   #54  <Method boolean zzf(boolean)>
		//*  42  118:istore          6
		//*  43  120:aload_3         
		//*  44  121:invokevirtual   #47  <Method void Parcel.writeNoException()>
		//*  45  124:iload           5
		//*  46  126:istore_1        
		//*  47  127:iload           6
		//*  48  129:ifeq            134
		//*  49  132:iconst_1        
		//*  50  133:istore_1        
		//*  51  134:aload_3         
		//*  52  135:iload_1         
		//*  53  136:invokevirtual   #58  <Method void Parcel.writeInt(int)>
		//*  54  139:iconst_1        
		//*  55  140:ireturn         
					flag1 = false;
		//   56  141:iconst_0        
		//   57  142:istore          6
				flag1 = zzf(flag1);
				parcel1.writeNoException();
				i = ((int) (flag));
				if(flag1)
					i = 1;
				parcel1.writeInt(i);
				return true;

		//*  58  144:goto            112
			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
		//   59  147:aload_2         
		//   60  148:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
		//   61  150:invokevirtual   #39  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (zzv(parcel.readString())));
		//   62  153:aload_0         
		//   63  154:aload_2         
		//   64  155:invokevirtual   #61  <Method String Parcel.readString()>
		//   65  158:invokevirtual   #65  <Method String zzv(String)>
		//   66  161:astore_2        
				parcel1.writeNoException();
		//   67  162:aload_3         
		//   68  163:invokevirtual   #47  <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//   69  166:aload_3         
		//   70  167:aload_2         
		//   71  168:invokevirtual   #36  <Method void Parcel.writeString(String)>
				return true;
		//   72  171:iconst_1        
		//   73  172:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
		//   74  173:aload_2         
		//   75  174:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
		//   76  176:invokevirtual   #39  <Method void Parcel.enforceInterface(String)>
				s = parcel.readString();
		//   77  179:aload_2         
		//   78  180:invokevirtual   #61  <Method String Parcel.readString()>
		//   79  183:astore          7
				break;
			}
			if(parcel.readInt() != 0)
		//*  80  185:aload_2         
		//*  81  186:invokevirtual   #51  <Method int Parcel.readInt()>
		//*  82  189:ifeq            195
				flag1 = true;
		//   83  192:iconst_1        
		//   84  193:istore          6
			zzc(s, flag1);
		//   85  195:aload_0         
		//   86  196:aload           7
		//   87  198:iload           6
		//   88  200:invokevirtual   #69  <Method void zzc(String, boolean)>
			parcel1.writeNoException();
		//   89  203:aload_3         
		//   90  204:invokevirtual   #47  <Method void Parcel.writeNoException()>
			return true;
		//   91  207:iconst_1        
		//   92  208:ireturn         
		}
	}

	private static class zza.zza
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

		zza.zza(IBinder ibinder)
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


	public abstract String getId()
		throws RemoteException;

	public abstract void zzc(String s, boolean flag)
		throws RemoteException;

	public abstract boolean zzf(boolean flag)
		throws RemoteException;

	public abstract String zzv(String s)
		throws RemoteException;
}
