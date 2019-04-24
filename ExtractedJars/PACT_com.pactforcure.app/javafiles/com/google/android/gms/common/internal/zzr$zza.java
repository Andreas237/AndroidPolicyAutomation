// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzr

public static abstract class zzr$zza extends Binder
	implements zzr
{
	private static class zza
		implements zzr
	{

		public IBinder asBinder()
		{
			return zzrp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrp>
		//    2    4:areturn         
		}

		public Account getAccount()
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
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.common.internal.IAccountAccessor">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrp.transact(2, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrp>
		//    9   18:iconst_2        
		//   10   19:aload_2         
		//   11   20:aload_3         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_3         
		//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
			if(parcel1.readInt() == 0) goto _L2; else goto _L1
		//   17   32:aload_3         
		//   18   33:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   36:ifeq            62
_L1:
			Account account = (Account)Account.CREATOR.createFromParcel(parcel1);
		//   20   39:getstatic       #56  <Field android.os.Parcelable$Creator Account.CREATOR>
		//   21   42:aload_3         
		//   22   43:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   48:checkcast       #52  <Class Account>
		//   24   51:astore_1        
_L4:
			parcel1.recycle();
		//   25   52:aload_3         
		//   26   53:invokevirtual   #65  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   56:aload_2         
		//   28   57:invokevirtual   #65  <Method void Parcel.recycle()>
			return account;
		//   29   60:aload_1         
		//   30   61:areturn         
_L2:
			account = null;
		//   31   62:aconst_null     
		//   32   63:astore_1        
			if(true) goto _L4; else goto _L3
		//   33   64:goto            52
_L3:
			Exception exception;
			exception;
		//   34   67:astore_1        
			parcel1.recycle();
		//   35   68:aload_3         
		//   36   69:invokevirtual   #65  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   72:aload_2         
		//   38   73:invokevirtual   #65  <Method void Parcel.recycle()>
			throw exception;
		//   39   76:aload_1         
		//   40   77:athrow          
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


	public static zzr zzbr(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.common.internal.IAccountAccessor">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzr))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzr>
	//*  12   23:ifeq            31
			return (zzr)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzr>
	//   15   30:areturn         
		else
			return ((zzr) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzr$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void zzr$zza$zza(IBinder)>
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
	//*   1    1:lookupswitch    2: default 28
	//	               2: 46
	//	               1598968902: 38
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    2   28:aload_0         
	//    3   29:iload_1         
	//    4   30:aload_2         
	//    5   31:aload_3         
	//    6   32:iload           4
	//    7   34:invokespecial   #32  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    8   37:ireturn         

		case 1598968902: 
			parcel1.writeString("com.google.android.gms.common.internal.IAccountAccessor");
	//    9   38:aload_3         
	//   10   39:ldc1            #13  <String "com.google.android.gms.common.internal.IAccountAccessor">
	//   11   41:invokevirtual   #38  <Method void Parcel.writeString(String)>
			return true;
	//   12   44:iconst_1        
	//   13   45:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
	//   14   46:aload_2         
	//   15   47:ldc1            #13  <String "com.google.android.gms.common.internal.IAccountAccessor">
	//   16   49:invokevirtual   #41  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getAccount()));
	//   17   52:aload_0         
	//   18   53:invokevirtual   #45  <Method Account getAccount()>
	//   19   56:astore_2        
			parcel1.writeNoException();
	//   20   57:aload_3         
	//   21   58:invokevirtual   #49  <Method void Parcel.writeNoException()>
			break;
		}
		if(parcel != null)
	//*  22   61:aload_2         
	//*  23   62:ifnull          78
		{
			parcel1.writeInt(1);
	//   24   65:aload_3         
	//   25   66:iconst_1        
	//   26   67:invokevirtual   #53  <Method void Parcel.writeInt(int)>
			((Account) (parcel)).writeToParcel(parcel1, 1);
	//   27   70:aload_2         
	//   28   71:aload_3         
	//   29   72:iconst_1        
	//   30   73:invokevirtual   #59  <Method void Account.writeToParcel(Parcel, int)>
			return true;
	//   31   76:iconst_1        
	//   32   77:ireturn         
		} else
		{
			parcel1.writeInt(0);
	//   33   78:aload_3         
	//   34   79:iconst_0        
	//   35   80:invokevirtual   #53  <Method void Parcel.writeInt(int)>
			return true;
	//   36   83:iconst_1        
	//   37   84:ireturn         
		}
	}
}
