// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.*;
import com.google.android.gms.common.internal.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzbaq, zzbap, zzban, zzbar, 
//			zzbau

static class zzbaq$zza$zza
	implements zzbaq
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void zza(int i, Account account, zzbap zzbap1)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           4
	//    8   19:iload_1         
	//    9   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(account == null)
			break MISSING_BLOCK_LABEL_43;
	//   10   23:aload_2         
	//   11   24:ifnull          43
		parcel.writeInt(1);
	//   12   27:aload           4
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		account.writeToParcel(parcel, 0);
	//   15   33:aload_2         
	//   16   34:aload           4
	//   17   36:iconst_0        
	//   18   37:invokevirtual   #46  <Method void Account.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_49;
	//   19   40:goto            49
		parcel.writeInt(0);
	//   20   43:aload           4
	//   21   45:iconst_0        
	//   22   46:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(zzbap1 == null) goto _L2; else goto _L1
	//   23   49:aload_3         
	//   24   50:ifnull          115
_L1:
		account = ((Account) (zzbap1.asBinder()));
	//   25   53:aload_3         
	//   26   54:invokeinterface #50  <Method IBinder zzbap.asBinder()>
	//   27   59:astore_2        
	//*  28   60:goto            63
_L4:
		parcel.writeStrongBinder(((IBinder) (account)));
	//   29   63:aload           4
	//   30   65:aload_2         
	//   31   66:invokevirtual   #53  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(8, parcel, parcel1, 0);
	//   32   69:aload_0         
	//   33   70:getfield        #18  <Field IBinder zzrk>
	//   34   73:bipush          8
	//   35   75:aload           4
	//   36   77:aload           5
	//   37   79:iconst_0        
	//   38   80:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   39   85:pop             
		parcel1.readException();
	//   40   86:aload           5
	//   41   88:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   42   91:aload           5
	//   43   93:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   44   96:aload           4
	//   45   98:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   46  101:return          
		account;
	//   47  102:astore_2        
		parcel1.recycle();
	//   48  103:aload           5
	//   49  105:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   50  108:aload           4
	//   51  110:invokevirtual   #65  <Method void Parcel.recycle()>
		throw account;
	//   52  113:aload_2         
	//   53  114:athrow          
_L2:
		account = null;
	//   54  115:aconst_null     
	//   55  116:astore_2        
		if(true) goto _L4; else goto _L3
	//   56  117:goto            63
_L3:
	}

	public void zza(zzad zzad1, zzx zzx1)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzad1 == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzad1.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #70  <Method void zzad.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(zzx1 == null) goto _L2; else goto _L1
	//   20   38:aload_2         
	//   21   39:ifnull          99
_L1:
		zzad1 = ((zzad) (zzx1.asBinder()));
	//   22   42:aload_2         
	//   23   43:invokeinterface #73  <Method IBinder zzx.asBinder()>
	//   24   48:astore_1        
	//*  25   49:goto            52
_L4:
		parcel.writeStrongBinder(((IBinder) (zzad1)));
	//   26   52:aload_3         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #53  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(5, parcel, parcel1, 0);
	//   29   57:aload_0         
	//   30   58:getfield        #18  <Field IBinder zzrk>
	//   31   61:iconst_5        
	//   32   62:aload_3         
	//   33   63:aload           4
	//   34   65:iconst_0        
	//   35   66:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   36   71:pop             
		parcel1.readException();
	//   37   72:aload           4
	//   38   74:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   39   77:aload           4
	//   40   79:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   82:aload_3         
	//   42   83:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   43   86:return          
		zzad1;
	//   44   87:astore_1        
		parcel1.recycle();
	//   45   88:aload           4
	//   46   90:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   93:aload_3         
	//   48   94:invokevirtual   #65  <Method void Parcel.recycle()>
		throw zzad1;
	//   49   97:aload_1         
	//   50   98:athrow          
_L2:
		zzad1 = null;
	//   51   99:aconst_null     
	//   52  100:astore_1        
		if(true) goto _L4; else goto _L3
	//   53  101:goto            52
_L3:
	}

	public void zza(zzd zzd1, zzbap zzbap1)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzd1 == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzd1.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #77  <Method void zzd.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(zzbap1 == null) goto _L2; else goto _L1
	//   20   38:aload_2         
	//   21   39:ifnull          99
_L1:
		zzd1 = ((zzd) (zzbap1.asBinder()));
	//   22   42:aload_2         
	//   23   43:invokeinterface #50  <Method IBinder zzbap.asBinder()>
	//   24   48:astore_1        
	//*  25   49:goto            52
_L4:
		parcel.writeStrongBinder(((IBinder) (zzd1)));
	//   26   52:aload_3         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #53  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(2, parcel, parcel1, 0);
	//   29   57:aload_0         
	//   30   58:getfield        #18  <Field IBinder zzrk>
	//   31   61:iconst_2        
	//   32   62:aload_3         
	//   33   63:aload           4
	//   34   65:iconst_0        
	//   35   66:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   36   71:pop             
		parcel1.readException();
	//   37   72:aload           4
	//   38   74:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   39   77:aload           4
	//   40   79:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   82:aload_3         
	//   42   83:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   43   86:return          
		zzd1;
	//   44   87:astore_1        
		parcel1.recycle();
	//   45   88:aload           4
	//   46   90:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   93:aload_3         
	//   48   94:invokevirtual   #65  <Method void Parcel.recycle()>
		throw zzd1;
	//   49   97:aload_1         
	//   50   98:athrow          
_L2:
		zzd1 = null;
	//   51   99:aconst_null     
	//   52  100:astore_1        
		if(true) goto _L4; else goto _L3
	//   53  101:goto            52
_L3:
	}

	public void zza(zzr zzr1, int i, boolean flag)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzr1 == null) goto _L2; else goto _L1
	//    7   17:aload_1         
	//    8   18:ifnull          104
_L1:
		zzr1 = ((zzr) (zzr1.asBinder()));
	//    9   21:aload_1         
	//   10   22:invokeinterface #81  <Method IBinder zzr.asBinder()>
	//   11   27:astore_1        
	//*  12   28:goto            31
_L4:
		parcel.writeStrongBinder(((IBinder) (zzr1)));
	//   13   31:aload           4
	//   14   33:aload_1         
	//   15   34:invokevirtual   #53  <Method void Parcel.writeStrongBinder(IBinder)>
		parcel.writeInt(i);
	//   16   37:aload           4
	//   17   39:iload_2         
	//   18   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(flag)
	//*  19   43:iload_3         
	//*  20   44:ifeq            109
			i = 1;
	//   21   47:iconst_1        
	//   22   48:istore_2        
		else
	//*  23   49:goto            52
	//*  24   52:aload           4
	//*  25   54:iload_2         
	//*  26   55:invokevirtual   #40  <Method void Parcel.writeInt(int)>
	//*  27   58:aload_0         
	//*  28   59:getfield        #18  <Field IBinder zzrk>
	//*  29   62:bipush          9
	//*  30   64:aload           4
	//*  31   66:aload           5
	//*  32   68:iconst_0        
	//*  33   69:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  34   74:pop             
	//*  35   75:aload           5
	//*  36   77:invokevirtual   #62  <Method void Parcel.readException()>
	//*  37   80:aload           5
	//*  38   82:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  39   85:aload           4
	//*  40   87:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  41   90:return          
	//*  42   91:astore_1        
	//*  43   92:aload           5
	//*  44   94:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  45   97:aload           4
	//*  46   99:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  47  102:aload_1         
	//*  48  103:athrow          
	//*  49  104:aconst_null     
	//*  50  105:astore_1        
	//*  51  106:goto            31
			i = 0;
	//   52  109:iconst_0        
	//   53  110:istore_2        
		parcel.writeInt(i);
		zzrk.transact(9, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		zzr1;
		parcel1.recycle();
		parcel.recycle();
		throw zzr1;
_L2:
		zzr1 = null;
		if(true) goto _L4; else goto _L3
_L3:
	//*  54  111:goto            52
	}

	public void zza(zzban zzban1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzban1 == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzban1.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #85  <Method void zzban.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(3, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:iconst_3        
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:iconst_0        
	//   26   45:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   50:pop             
		parcel1.readException();
	//   28   51:aload_3         
	//   29   52:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   55:aload_3         
	//   31   56:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   59:aload_2         
	//   33   60:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   34   63:return          
		zzban1;
	//   35   64:astore_1        
		parcel1.recycle();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #65  <Method void Parcel.recycle()>
		throw zzban1;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	public void zza(zzbar zzbar1, zzbap zzbap1)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzbar1 == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzbar1.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #89  <Method void zzbar.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(zzbap1 == null) goto _L2; else goto _L1
	//   20   38:aload_2         
	//   21   39:ifnull          100
_L1:
		zzbar1 = ((zzbar) (zzbap1.asBinder()));
	//   22   42:aload_2         
	//   23   43:invokeinterface #50  <Method IBinder zzbap.asBinder()>
	//   24   48:astore_1        
	//*  25   49:goto            52
_L4:
		parcel.writeStrongBinder(((IBinder) (zzbar1)));
	//   26   52:aload_3         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #53  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(10, parcel, parcel1, 0);
	//   29   57:aload_0         
	//   30   58:getfield        #18  <Field IBinder zzrk>
	//   31   61:bipush          10
	//   32   63:aload_3         
	//   33   64:aload           4
	//   34   66:iconst_0        
	//   35   67:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   36   72:pop             
		parcel1.readException();
	//   37   73:aload           4
	//   38   75:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   39   78:aload           4
	//   40   80:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   83:aload_3         
	//   42   84:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   43   87:return          
		zzbar1;
	//   44   88:astore_1        
		parcel1.recycle();
	//   45   89:aload           4
	//   46   91:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   94:aload_3         
	//   48   95:invokevirtual   #65  <Method void Parcel.recycle()>
		throw zzbar1;
	//   49   98:aload_1         
	//   50   99:athrow          
_L2:
		zzbar1 = null;
	//   51  100:aconst_null     
	//   52  101:astore_1        
		if(true) goto _L4; else goto _L3
	//   53  102:goto            52
_L3:
	}

	public void zza(zzbau zzbau1, zzbap zzbap1)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzbau1 == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzbau1.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #93  <Method void zzbau.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(zzbap1 == null) goto _L2; else goto _L1
	//   20   38:aload_2         
	//   21   39:ifnull          100
_L1:
		zzbau1 = ((zzbau) (zzbap1.asBinder()));
	//   22   42:aload_2         
	//   23   43:invokeinterface #50  <Method IBinder zzbap.asBinder()>
	//   24   48:astore_1        
	//*  25   49:goto            52
_L4:
		parcel.writeStrongBinder(((IBinder) (zzbau1)));
	//   26   52:aload_3         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #53  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(12, parcel, parcel1, 0);
	//   29   57:aload_0         
	//   30   58:getfield        #18  <Field IBinder zzrk>
	//   31   61:bipush          12
	//   32   63:aload_3         
	//   33   64:aload           4
	//   34   66:iconst_0        
	//   35   67:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   36   72:pop             
		parcel1.readException();
	//   37   73:aload           4
	//   38   75:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   39   78:aload           4
	//   40   80:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   83:aload_3         
	//   42   84:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   43   87:return          
		zzbau1;
	//   44   88:astore_1        
		parcel1.recycle();
	//   45   89:aload           4
	//   46   91:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   94:aload_3         
	//   48   95:invokevirtual   #65  <Method void Parcel.recycle()>
		throw zzbau1;
	//   49   98:aload_1         
	//   50   99:athrow          
_L2:
		zzbau1 = null;
	//   51  100:aconst_null     
	//   52  101:astore_1        
		if(true) goto _L4; else goto _L3
	//   53  102:goto            52
_L3:
	}

	public void zzaP(boolean flag)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            73
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:iconst_4        
	//*  18   34:aload_3         
	//*  19   35:aload           4
	//*  20   37:iconst_0        
	//*  21   38:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   43:pop             
	//*  23   44:aload           4
	//*  24   46:invokevirtual   #62  <Method void Parcel.readException()>
	//*  25   49:aload           4
	//*  26   51:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  27   54:aload_3         
	//*  28   55:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  29   58:return          
	//*  30   59:astore          5
	//*  31   61:aload           4
	//*  32   63:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  33   66:aload_3         
	//*  34   67:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  35   70:aload           5
	//*  36   72:athrow          
			i = 0;
	//   37   73:iconst_0        
	//   38   74:istore_2        
		parcel.writeInt(i);
		zzrk.transact(4, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  39   75:goto            24
	}

	public void zzaQ(boolean flag)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            74
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:bipush          13
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:iconst_0        
	//*  21   39:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   44:pop             
	//*  23   45:aload           4
	//*  24   47:invokevirtual   #62  <Method void Parcel.readException()>
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  27   55:aload_3         
	//*  28   56:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  29   59:return          
	//*  30   60:astore          5
	//*  31   62:aload           4
	//*  32   64:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  33   67:aload_3         
	//*  34   68:invokevirtual   #65  <Method void Parcel.recycle()>
	//*  35   71:aload           5
	//*  36   73:athrow          
			i = 0;
	//   37   74:iconst_0        
	//   38   75:istore_2        
		parcel.writeInt(i);
		zzrk.transact(13, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  39   76:goto            24
	}

	public void zzb(zzbap zzbap1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzbap1 == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          72
_L1:
		zzbap1 = ((zzbap) (zzbap1.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #50  <Method IBinder zzbap.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (zzbap1)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #53  <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(11, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:bipush          11
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:iconst_0        
	//   22   42:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   47:pop             
		parcel1.readException();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   52:aload_3         
	//   27   53:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   56:aload_2         
	//   29   57:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   30   60:return          
		zzbap1;
	//   31   61:astore_1        
		parcel1.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_2         
	//   35   67:invokevirtual   #65  <Method void Parcel.recycle()>
		throw zzbap1;
	//   36   70:aload_1         
	//   37   71:athrow          
_L2:
		zzbap1 = null;
	//   38   72:aconst_null     
	//   39   73:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   74:goto            28
_L3:
	}

	public void zznv(int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInService">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(7, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          7
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #65  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	private IBinder zzrk;

	zzbaq$zza$zza(IBinder ibinder)
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
