// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzaxu, zzaxp, zzayb

private static class zzaxu$zza$zza
	implements zzaxu
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	public void zza(ConnectionResult connectionresult, zzaxp zzaxp1)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(connectionresult == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          75
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		connectionresult.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void ConnectionResult.writeToParcel(Parcel, int)>
_L3:
		if(zzaxp1 == null)
			break MISSING_BLOCK_LABEL_95;
	//   16   30:aload_2         
	//   17   31:ifnull          95
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzaxp1.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #49  <Method void zzaxp.writeToParcel(Parcel, int)>
_L4:
		zzrp.transact(3, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #18  <Field IBinder zzrp>
	//   27   49:iconst_3        
	//   28   50:aload_3         
	//   29   51:aload           4
	//   30   53:iconst_0        
	//   31   54:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   59:pop             
		parcel1.readException();
	//   33   60:aload           4
	//   34   62:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   65:aload           4
	//   36   67:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   70:aload_3         
	//   38   71:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   39   74:return          
_L2:
		parcel.writeInt(0);
	//   40   75:aload_3         
	//   41   76:iconst_0        
	//   42   77:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   80:goto            30
		connectionresult;
	//   44   83:astore_1        
		parcel1.recycle();
	//   45   84:aload           4
	//   46   86:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   89:aload_3         
	//   48   90:invokevirtual   #61  <Method void Parcel.recycle()>
		throw connectionresult;
	//   49   93:aload_1         
	//   50   94:athrow          
		parcel.writeInt(0);
	//   51   95:aload_3         
	//   52   96:iconst_0        
	//   53   97:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  100:goto            45
	}

	public void zza(Status status, GoogleSignInAccount googlesigninaccount)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(status == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		status.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #66  <Method void Status.writeToParcel(Parcel, int)>
_L3:
		if(googlesigninaccount == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		googlesigninaccount.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #69  <Method void GoogleSignInAccount.writeToParcel(Parcel, int)>
_L4:
		zzrp.transact(7, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #18  <Field IBinder zzrp>
	//   27   49:bipush          7
	//   28   51:aload_3         
	//   29   52:aload           4
	//   30   54:iconst_0        
	//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   60:pop             
		parcel1.readException();
	//   33   61:aload           4
	//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   39   75:return          
_L2:
		parcel.writeInt(0);
	//   40   76:aload_3         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   81:goto            30
		status;
	//   44   84:astore_1        
		parcel1.recycle();
	//   45   85:aload           4
	//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
		throw status;
	//   49   94:aload_1         
	//   50   95:athrow          
		parcel.writeInt(0);
	//   51   96:aload_3         
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  101:goto            45
	}

	public void zzb(zzayb zzayb1)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(zzayb1 == null)
			break MISSING_BLOCK_LABEL_57;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzayb1.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #74  <Method void zzayb.writeToParcel(Parcel, int)>
_L1:
		zzrp.transact(8, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #18  <Field IBinder zzrp>
	//   18   33:bipush          8
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   43:pop             
		parcel1.readException();
	//   24   44:aload_3         
	//   25   45:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   30   56:return          
		parcel.writeInt(0);
	//   31   57:aload_2         
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   62:goto            29
		zzayb1;
	//   35   65:astore_1        
		parcel1.recycle();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #61  <Method void Parcel.recycle()>
		throw zzayb1;
	//   40   74:aload_1         
	//   41   75:athrow          
	}

	public void zzbI(Status status)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(status == null)
			break MISSING_BLOCK_LABEL_56;
	//    7   14:aload_1         
	//    8   15:ifnull          56
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		status.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #66  <Method void Status.writeToParcel(Parcel, int)>
_L1:
		zzrp.transact(4, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #18  <Field IBinder zzrp>
	//   18   33:iconst_4        
	//   19   34:aload_2         
	//   20   35:aload_3         
	//   21   36:iconst_0        
	//   22   37:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   42:pop             
		parcel1.readException();
	//   24   43:aload_3         
	//   25   44:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   30   55:return          
		parcel.writeInt(0);
	//   31   56:aload_2         
	//   32   57:iconst_0        
	//   33   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   61:goto            29
		status;
	//   35   64:astore_1        
		parcel1.recycle();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #61  <Method void Parcel.recycle()>
		throw status;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	public void zzbJ(Status status)
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
		parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(status == null)
			break MISSING_BLOCK_LABEL_57;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		status.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #66  <Method void Status.writeToParcel(Parcel, int)>
_L1:
		zzrp.transact(6, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #18  <Field IBinder zzrp>
	//   18   33:bipush          6
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   43:pop             
		parcel1.readException();
	//   24   44:aload_3         
	//   25   45:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   30   56:return          
		parcel.writeInt(0);
	//   31   57:aload_2         
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   62:goto            29
		status;
	//   35   65:astore_1        
		parcel1.recycle();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #61  <Method void Parcel.recycle()>
		throw status;
	//   40   74:aload_1         
	//   41   75:athrow          
	}

	private IBinder zzrp;

	zzaxu$zza$zza(IBinder ibinder)
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
