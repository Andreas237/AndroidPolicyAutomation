// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzcq

public static abstract class zzcq$zza extends Binder
	implements zzcq
{
	static class zza
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


	public static zzcq zzf(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzcq))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzcq>
	//*  12   23:ifeq            31
			return (zzcq)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzcq>
	//   15   30:areturn         
		else
			return ((zzcq) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzcq$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void zzcq$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    5: default 52
	//	               1: 63
	//	               2: 85
	//	               3: 138
	//	               4: 164
	//	               1598968902: 55
	//*   2   52:goto            206
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    3   55:aload_3         
	//    4   56:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    5   58:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6   61:iconst_1        
	//    7   62:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    8   63:aload_2         
	//    9   64:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//   10   66:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getId()));
	//   11   69:aload_0         
	//   12   70:invokevirtual   #41  <Method String getId()>
	//   13   73:astore_2        
			parcel1.writeNoException();
	//   14   74:aload_3         
	//   15   75:invokevirtual   #45  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   16   78:aload_3         
	//   17   79:aload_2         
	//   18   80:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//   19   83:iconst_1        
	//   20   84:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//   21   85:aload_2         
	//   22   86:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//   23   88:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag;
			if(parcel.readInt() != 0)
	//*  24   91:aload_2         
	//*  25   92:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  26   95:ifeq            104
				flag = true;
	//   27   98:iconst_1        
	//   28   99:istore          5
			else
	//*  29  101:goto            107
				flag = false;
	//   30  104:iconst_0        
	//   31  105:istore          5
			flag = zzf(flag);
	//   32  107:aload_0         
	//   33  108:iload           5
	//   34  110:invokevirtual   #52  <Method boolean zzf(boolean)>
	//   35  113:istore          5
			parcel1.writeNoException();
	//   36  115:aload_3         
	//   37  116:invokevirtual   #45  <Method void Parcel.writeNoException()>
			if(flag)
	//*  38  119:iload           5
	//*  39  121:ifeq            129
				i = 1;
	//   40  124:iconst_1        
	//   41  125:istore_1        
			else
	//*  42  126:goto            131
				i = 0;
	//   43  129:iconst_0        
	//   44  130:istore_1        
			parcel1.writeInt(i);
	//   45  131:aload_3         
	//   46  132:iload_1         
	//   47  133:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			return true;
	//   48  136:iconst_1        
	//   49  137:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//   50  138:aload_2         
	//   51  139:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//   52  141:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (zzv(parcel.readString())));
	//   53  144:aload_0         
	//   54  145:aload_2         
	//   55  146:invokevirtual   #59  <Method String Parcel.readString()>
	//   56  149:invokevirtual   #63  <Method String zzv(String)>
	//   57  152:astore_2        
			parcel1.writeNoException();
	//   58  153:aload_3         
	//   59  154:invokevirtual   #45  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   60  157:aload_3         
	//   61  158:aload_2         
	//   62  159:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//   63  162:iconst_1        
	//   64  163:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//   65  164:aload_2         
	//   66  165:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//   67  167:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			String s = parcel.readString();
	//   68  170:aload_2         
	//   69  171:invokevirtual   #59  <Method String Parcel.readString()>
	//   70  174:astore          6
			boolean flag1;
			if(parcel.readInt() != 0)
	//*  71  176:aload_2         
	//*  72  177:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  73  180:ifeq            189
				flag1 = true;
	//   74  183:iconst_1        
	//   75  184:istore          5
			else
	//*  76  186:goto            192
				flag1 = false;
	//   77  189:iconst_0        
	//   78  190:istore          5
			zzc(s, flag1);
	//   79  192:aload_0         
	//   80  193:aload           6
	//   81  195:iload           5
	//   82  197:invokevirtual   #67  <Method void zzc(String, boolean)>
			parcel1.writeNoException();
	//   83  200:aload_3         
	//   84  201:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//   85  204:iconst_1        
	//   86  205:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   87  206:aload_0         
	//   88  207:iload_1         
	//   89  208:aload_2         
	//   90  209:aload_3         
	//   91  210:iload           4
	//   92  212:invokespecial   #69  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   93  215:ireturn         
	}
}
