// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//			zze

public static abstract class zze$zza extends Binder
	implements zze
{
	static class zza
		implements zze
	{

		public void activate()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #30  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
		//    6   11:invokevirtual   #34  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(3, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_3        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #40  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #43  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #46  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #46  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public String getName()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			String s;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #30  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
		//    6   11:invokevirtual   #34  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #40  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #43  <Method void Parcel.readException()>
			s = parcel1.readString();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #54  <Method String Parcel.readString()>
		//   19   36:astore_3        
			parcel1.recycle();
		//   20   37:aload_2         
		//   21   38:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_1         
		//   23   42:invokevirtual   #46  <Method void Parcel.recycle()>
			return s;
		//   24   45:aload_3         
		//   25   46:areturn         
			Exception exception;
			exception;
		//   26   47:astore_3        
			parcel1.recycle();
		//   27   48:aload_2         
		//   28   49:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   52:aload_1         
		//   30   53:invokevirtual   #46  <Method void Parcel.recycle()>
			throw exception;
		//   31   56:aload_3         
		//   32   57:athrow          
		}

		public String getShortName()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			String s;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #30  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
		//    6   11:invokevirtual   #34  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(2, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_2        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #40  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #43  <Method void Parcel.readException()>
			s = parcel1.readString();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #54  <Method String Parcel.readString()>
		//   19   36:astore_3        
			parcel1.recycle();
		//   20   37:aload_2         
		//   21   38:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_1         
		//   23   42:invokevirtual   #46  <Method void Parcel.recycle()>
			return s;
		//   24   45:aload_3         
		//   25   46:areturn         
			Exception exception;
			exception;
		//   26   47:astore_3        
			parcel1.recycle();
		//   27   48:aload_2         
		//   28   49:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   52:aload_1         
		//   30   53:invokevirtual   #46  <Method void Parcel.recycle()>
			throw exception;
		//   31   56:aload_3         
		//   32   57:athrow          
		}

		public int hashCodeRemote()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #30  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
		//    6   11:invokevirtual   #34  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(5, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_5        
		//   10   19:aload_2         
		//   11   20:aload_3         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #40  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_3         
		//   16   29:invokevirtual   #43  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   32:aload_3         
		//   18   33:invokevirtual   #60  <Method int Parcel.readInt()>
		//   19   36:istore_1        
			parcel1.recycle();
		//   20   37:aload_3         
		//   21   38:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_2         
		//   23   42:invokevirtual   #46  <Method void Parcel.recycle()>
			return i;
		//   24   45:iload_1         
		//   25   46:ireturn         
			Exception exception;
			exception;
		//   26   47:astore          4
			parcel1.recycle();
		//   27   49:aload_3         
		//   28   50:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   53:aload_2         
		//   30   54:invokevirtual   #46  <Method void Parcel.recycle()>
			throw exception;
		//   31   57:aload           4
		//   32   59:athrow          
		}

		public boolean zza(zze zze1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #28  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
		//    4   10:aload           4
		//    5   12:ldc1            #30  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
		//    6   14:invokevirtual   #34  <Method void Parcel.writeInterfaceToken(String)>
			if(zze1 == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          100
_L1:
			zze1 = ((zze) (zze1.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #63  <Method IBinder zze.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			int i;
			parcel.writeStrongBinder(((IBinder) (zze1)));
		//   13   31:aload           4
		//   14   33:aload_1         
		//   15   34:invokevirtual   #66  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(4, parcel, parcel1, 0);
		//   16   37:aload_0         
		//   17   38:getfield        #18  <Field IBinder zzrk>
		//   18   41:iconst_4        
		//   19   42:aload           4
		//   20   44:aload           5
		//   21   46:iconst_0        
		//   22   47:invokeinterface #40  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   52:pop             
			parcel1.readException();
		//   24   53:aload           5
		//   25   55:invokevirtual   #43  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   26   58:aload           5
		//   27   60:invokevirtual   #60  <Method int Parcel.readInt()>
		//   28   63:istore_2        
			boolean flag;
			if(i != 0)
		//*  29   64:iload_2         
		//*  30   65:ifeq            73
				flag = true;
		//   31   68:iconst_1        
		//   32   69:istore_3        
			else
		//*  33   70:goto            75
				flag = false;
		//   34   73:iconst_0        
		//   35   74:istore_3        
			parcel1.recycle();
		//   36   75:aload           5
		//   37   77:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   80:aload           4
		//   39   82:invokevirtual   #46  <Method void Parcel.recycle()>
			return flag;
		//   40   85:iload_3         
		//   41   86:ireturn         
			zze1;
		//   42   87:astore_1        
			parcel1.recycle();
		//   43   88:aload           5
		//   44   90:invokevirtual   #46  <Method void Parcel.recycle()>
			parcel.recycle();
		//   45   93:aload           4
		//   46   95:invokevirtual   #46  <Method void Parcel.recycle()>
			throw zze1;
		//   47   98:aload_1         
		//   48   99:athrow          
_L2:
			zze1 = null;
		//   49  100:aconst_null     
		//   50  101:astore_1        
			if(true) goto _L4; else goto _L3
		//   51  102:goto            31
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


	public static zze zzem(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zze))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zze>
	//*  12   23:ifeq            31
			return (zze)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zze>
	//   15   30:areturn         
		else
			return ((zze) (new zza(ibinder)));
	//   16   31:new             #9   <Class zze$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void zze$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    6: default 60
	//	               1: 71
	//	               2: 93
	//	               3: 115
	//	               4: 131
	//	               5: 173
	//	               1598968902: 63
	//*   2   60:goto            195
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
	//    3   63:aload_3         
	//    4   64:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
	//    5   66:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6   69:iconst_1        
	//    7   70:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
	//    8   71:aload_2         
	//    9   72:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
	//   10   74:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getName()));
	//   11   77:aload_0         
	//   12   78:invokevirtual   #41  <Method String getName()>
	//   13   81:astore_2        
			parcel1.writeNoException();
	//   14   82:aload_3         
	//   15   83:invokevirtual   #45  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   16   86:aload_3         
	//   17   87:aload_2         
	//   18   88:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//   19   91:iconst_1        
	//   20   92:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
	//   21   93:aload_2         
	//   22   94:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
	//   23   96:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getShortName()));
	//   24   99:aload_0         
	//   25  100:invokevirtual   #48  <Method String getShortName()>
	//   26  103:astore_2        
			parcel1.writeNoException();
	//   27  104:aload_3         
	//   28  105:invokevirtual   #45  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   29  108:aload_3         
	//   30  109:aload_2         
	//   31  110:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//   32  113:iconst_1        
	//   33  114:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
	//   34  115:aload_2         
	//   35  116:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
	//   36  118:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			activate();
	//   37  121:aload_0         
	//   38  122:invokevirtual   #51  <Method void activate()>
			parcel1.writeNoException();
	//   39  125:aload_3         
	//   40  126:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//   41  129:iconst_1        
	//   42  130:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
	//   43  131:aload_2         
	//   44  132:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
	//   45  134:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag = zza(zzem(parcel.readStrongBinder()));
	//   46  137:aload_0         
	//   47  138:aload_2         
	//   48  139:invokevirtual   #55  <Method IBinder Parcel.readStrongBinder()>
	//   49  142:invokestatic    #57  <Method zze zzem(IBinder)>
	//   50  145:invokevirtual   #60  <Method boolean zza(zze)>
	//   51  148:istore          5
			parcel1.writeNoException();
	//   52  150:aload_3         
	//   53  151:invokevirtual   #45  <Method void Parcel.writeNoException()>
			if(flag)
	//*  54  154:iload           5
	//*  55  156:ifeq            164
				i = 1;
	//   56  159:iconst_1        
	//   57  160:istore_1        
			else
	//*  58  161:goto            166
				i = 0;
	//   59  164:iconst_0        
	//   60  165:istore_1        
			parcel1.writeInt(i);
	//   61  166:aload_3         
	//   62  167:iload_1         
	//   63  168:invokevirtual   #64  <Method void Parcel.writeInt(int)>
			return true;
	//   64  171:iconst_1        
	//   65  172:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
	//   66  173:aload_2         
	//   67  174:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate">
	//   68  176:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			i = hashCodeRemote();
	//   69  179:aload_0         
	//   70  180:invokevirtual   #68  <Method int hashCodeRemote()>
	//   71  183:istore_1        
			parcel1.writeNoException();
	//   72  184:aload_3         
	//   73  185:invokevirtual   #45  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//   74  188:aload_3         
	//   75  189:iload_1         
	//   76  190:invokevirtual   #64  <Method void Parcel.writeInt(int)>
			return true;
	//   77  193:iconst_1        
	//   78  194:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   79  195:aload_0         
	//   80  196:iload_1         
	//   81  197:aload_2         
	//   82  198:aload_3         
	//   83  199:iload           4
	//   84  201:invokespecial   #70  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   85  204:ireturn         
	}
}
