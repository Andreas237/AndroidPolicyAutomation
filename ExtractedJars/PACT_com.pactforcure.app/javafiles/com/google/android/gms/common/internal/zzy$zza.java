// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzy, zzah

public static abstract class zzy$zza extends Binder
	implements zzy
{
	private static class zza
		implements zzy
	{

		public IBinder asBinder()
		{
			return zzrp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrp>
		//    2    4:areturn         
		}

		public zzd zza(zzd zzd1, int i, int j)
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
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
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
			parcel.writeInt(i);
		//   15   34:aload           4
		//   16   36:iload_2         
		//   17   37:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			parcel.writeInt(j);
		//   18   40:aload           4
		//   19   42:iload_3         
		//   20   43:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			zzrp.transact(1, parcel, parcel1, 0);
		//   21   46:aload_0         
		//   22   47:getfield        #18  <Field IBinder zzrp>
		//   23   50:iconst_1        
		//   24   51:aload           4
		//   25   53:aload           5
		//   26   55:iconst_0        
		//   27   56:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   28   61:pop             
			parcel1.readException();
		//   29   62:aload           5
		//   30   64:invokevirtual   #56  <Method void Parcel.readException()>
			zzd1 = com.google.android.gms.dynamic.zzd.zza.zzcd(parcel1.readStrongBinder());
		//   31   67:aload           5
		//   32   69:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   33   72:invokestatic    #65  <Method zzd com.google.android.gms.dynamic.zzd$zza.zzcd(IBinder)>
		//   34   75:astore_1        
			parcel1.recycle();
		//   35   76:aload           5
		//   36   78:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   81:aload           4
		//   38   83:invokevirtual   #68  <Method void Parcel.recycle()>
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
		//   46   96:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   99:aload           4
		//   48  101:invokevirtual   #68  <Method void Parcel.recycle()>
			throw zzd1;
		//   49  104:aload_1         
		//   50  105:athrow          
		}

		public zzd zza(zzd zzd1, zzah zzah1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzd1 == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          86
_L1:
			zzd1 = ((zzd) (zzd1.asBinder()));
		//    9   19:aload_1         
		//   10   20:invokeinterface #40  <Method IBinder zzd.asBinder()>
		//   11   25:astore_1        
_L5:
			parcel.writeStrongBinder(((IBinder) (zzd1)));
		//   12   26:aload_3         
		//   13   27:aload_1         
		//   14   28:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
			if(zzah1 == null) goto _L4; else goto _L3
		//   15   31:aload_2         
		//   16   32:ifnull          91
_L3:
			parcel.writeInt(1);
		//   17   35:aload_3         
		//   18   36:iconst_1        
		//   19   37:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			zzah1.writeToParcel(parcel, 0);
		//   20   40:aload_2         
		//   21   41:aload_3         
		//   22   42:iconst_0        
		//   23   43:invokevirtual   #76  <Method void zzah.writeToParcel(Parcel, int)>
_L6:
			zzrp.transact(2, parcel, parcel1, 0);
		//   24   46:aload_0         
		//   25   47:getfield        #18  <Field IBinder zzrp>
		//   26   50:iconst_2        
		//   27   51:aload_3         
		//   28   52:aload           4
		//   29   54:iconst_0        
		//   30   55:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   31   60:pop             
			parcel1.readException();
		//   32   61:aload           4
		//   33   63:invokevirtual   #56  <Method void Parcel.readException()>
			zzd1 = com.google.android.gms.dynamic.zzd.zza.zzcd(parcel1.readStrongBinder());
		//   34   66:aload           4
		//   35   68:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   36   71:invokestatic    #65  <Method zzd com.google.android.gms.dynamic.zzd$zza.zzcd(IBinder)>
		//   37   74:astore_1        
			parcel1.recycle();
		//   38   75:aload           4
		//   39   77:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   40   80:aload_3         
		//   41   81:invokevirtual   #68  <Method void Parcel.recycle()>
			return zzd1;
		//   42   84:aload_1         
		//   43   85:areturn         
_L2:
			zzd1 = null;
		//   44   86:aconst_null     
		//   45   87:astore_1        
			  goto _L5
		//*  46   88:goto            26
_L4:
			parcel.writeInt(0);
		//   47   91:aload_3         
		//   48   92:iconst_0        
		//   49   93:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			  goto _L6
		//*  50   96:goto            46
			zzd1;
		//   51   99:astore_1        
			parcel1.recycle();
		//   52  100:aload           4
		//   53  102:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   54  105:aload_3         
		//   55  106:invokevirtual   #68  <Method void Parcel.recycle()>
			throw zzd1;
		//   56  109:aload_1         
		//   57  110:athrow          
			  goto _L5
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


	public static zzy zzbx(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzy))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzy>
	//*  12   23:ifeq            31
			return (zzy)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzy>
	//   15   30:areturn         
		else
			return ((zzy) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzy$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void zzy$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		zzd zzd1;
		switch(i)
	//*   2    3:iload_1         
		{
	//*   3    4:lookupswitch    3: default 40
	//	               1: 58
	//	               2: 111
	//	               1598968902: 50
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    4   40:aload_0         
	//    5   41:iload_1         
	//    6   42:aload_2         
	//    7   43:aload_3         
	//    8   44:iload           4
	//    9   46:invokespecial   #30  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   10   49:ireturn         

		case 1598968902: 
			parcel1.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
	//   11   50:aload_3         
	//   12   51:ldc1            #13  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
	//   13   53:invokevirtual   #36  <Method void Parcel.writeString(String)>
			return true;
	//   14   56:iconst_1        
	//   15   57:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
	//   16   58:aload_2         
	//   17   59:ldc1            #13  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
	//   18   61:invokevirtual   #39  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (zza(com.google.android.gms.dynamic.zzd$zza.zzcd(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt())));
	//   19   64:aload_0         
	//   20   65:aload_2         
	//   21   66:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   22   69:invokestatic    #49  <Method zzd com.google.android.gms.dynamic.zzd$zza.zzcd(IBinder)>
	//   23   72:aload_2         
	//   24   73:invokevirtual   #53  <Method int Parcel.readInt()>
	//   25   76:aload_2         
	//   26   77:invokevirtual   #53  <Method int Parcel.readInt()>
	//   27   80:invokevirtual   #56  <Method zzd zza(zzd, int, int)>
	//   28   83:astore_2        
			parcel1.writeNoException();
	//   29   84:aload_3         
	//   30   85:invokevirtual   #60  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  31   88:aload_2         
	//*  32   89:ifnull          106
				parcel = ((Parcel) (((zzd) (parcel)).asBinder()));
	//   33   92:aload_2         
	//   34   93:invokeinterface #65  <Method IBinder zzd.asBinder()>
	//   35   98:astore_2        
			else
	//*  36   99:aload_3         
	//*  37  100:aload_2         
	//*  38  101:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
	//*  39  104:iconst_1        
	//*  40  105:ireturn         
				parcel = null;
	//   41  106:aconst_null     
	//   42  107:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
			return true;

	//*  43  108:goto            99
		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
	//   44  111:aload_2         
	//   45  112:ldc1            #13  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
	//   46  114:invokevirtual   #39  <Method void Parcel.enforceInterface(String)>
			zzd1 = com.google.android.gms.dynamic.zzd$zza.zzcd(parcel.readStrongBinder());
	//   47  117:aload_2         
	//   48  118:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   49  121:invokestatic    #49  <Method zzd com.google.android.gms.dynamic.zzd$zza.zzcd(IBinder)>
	//   50  124:astore          6
			break;
		}
		if(parcel.readInt() != 0)
	//*  51  126:aload_2         
	//*  52  127:invokevirtual   #53  <Method int Parcel.readInt()>
	//*  53  130:ifeq            182
			parcel = ((Parcel) ((zzah)zzah.CREATOR.createFromParcel(parcel)));
	//   54  133:getstatic       #74  <Field android.os.Parcelable$Creator zzah.CREATOR>
	//   55  136:aload_2         
	//   56  137:invokeinterface #80  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   57  142:checkcast       #70  <Class zzah>
	//   58  145:astore_2        
		else
	//*  59  146:aload_0         
	//*  60  147:aload           6
	//*  61  149:aload_2         
	//*  62  150:invokevirtual   #83  <Method zzd zza(zzd, zzah)>
	//*  63  153:astore          6
	//*  64  155:aload_3         
	//*  65  156:invokevirtual   #60  <Method void Parcel.writeNoException()>
	//*  66  159:aload           5
	//*  67  161:astore_2        
	//*  68  162:aload           6
	//*  69  164:ifnull          175
	//*  70  167:aload           6
	//*  71  169:invokeinterface #65  <Method IBinder zzd.asBinder()>
	//*  72  174:astore_2        
	//*  73  175:aload_3         
	//*  74  176:aload_2         
	//*  75  177:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
	//*  76  180:iconst_1        
	//*  77  181:ireturn         
			parcel = null;
	//   78  182:aconst_null     
	//   79  183:astore_2        
		zzd1 = zza(zzd1, ((zzah) (parcel)));
		parcel1.writeNoException();
		parcel = ((Parcel) (obj));
		if(zzd1 != null)
			parcel = ((Parcel) (zzd1.asBinder()));
		parcel1.writeStrongBinder(((IBinder) (parcel)));
		return true;
	//*  80  184:goto            146
	}
}
