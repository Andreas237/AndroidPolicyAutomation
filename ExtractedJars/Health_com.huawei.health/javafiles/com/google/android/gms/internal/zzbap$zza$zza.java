// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzbap, zzbak, zzbaw

static class zzbap$zza$zza
	implements zzbap
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void zza(ConnectionResult connectionresult, zzbak zzbak1)
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
		if(connectionresult == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		connectionresult.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void ConnectionResult.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(zzbak1 == null)
			break MISSING_BLOCK_LABEL_56;
	//   20   38:aload_2         
	//   21   39:ifnull          56
		parcel.writeInt(1);
	//   22   42:aload_3         
	//   23   43:iconst_1        
	//   24   44:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzbak1.writeToParcel(parcel, 0);
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #49  <Method void zzbak.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_61;
	//   29   53:goto            61
		parcel.writeInt(0);
	//   30   56:aload_3         
	//   31   57:iconst_0        
	//   32   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(3, parcel, parcel1, 0);
	//   33   61:aload_0         
	//   34   62:getfield        #18  <Field IBinder zzrk>
	//   35   65:iconst_3        
	//   36   66:aload_3         
	//   37   67:aload           4
	//   38   69:iconst_0        
	//   39   70:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   40   75:pop             
		parcel1.readException();
	//   41   76:aload           4
	//   42   78:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   43   81:aload           4
	//   44   83:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   86:aload_3         
	//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   47   90:return          
		connectionresult;
	//   48   91:astore_1        
		parcel1.recycle();
	//   49   92:aload           4
	//   50   94:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   51   97:aload_3         
	//   52   98:invokevirtual   #61  <Method void Parcel.recycle()>
		throw connectionresult;
	//   53  101:aload_1         
	//   54  102:athrow          
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
		if(status == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		status.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #66  <Method void Status.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(googlesigninaccount == null)
			break MISSING_BLOCK_LABEL_56;
	//   20   38:aload_2         
	//   21   39:ifnull          56
		parcel.writeInt(1);
	//   22   42:aload_3         
	//   23   43:iconst_1        
	//   24   44:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		googlesigninaccount.writeToParcel(parcel, 0);
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #69  <Method void GoogleSignInAccount.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_61;
	//   29   53:goto            61
		parcel.writeInt(0);
	//   30   56:aload_3         
	//   31   57:iconst_0        
	//   32   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(7, parcel, parcel1, 0);
	//   33   61:aload_0         
	//   34   62:getfield        #18  <Field IBinder zzrk>
	//   35   65:bipush          7
	//   36   67:aload_3         
	//   37   68:aload           4
	//   38   70:iconst_0        
	//   39   71:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   40   76:pop             
		parcel1.readException();
	//   41   77:aload           4
	//   42   79:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   43   82:aload           4
	//   44   84:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   87:aload_3         
	//   46   88:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   47   91:return          
		status;
	//   48   92:astore_1        
		parcel1.recycle();
	//   49   93:aload           4
	//   50   95:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   51   98:aload_3         
	//   52   99:invokevirtual   #61  <Method void Parcel.recycle()>
		throw status;
	//   53  102:aload_1         
	//   54  103:athrow          
	}

	public void zzb(zzbaw zzbaw1)
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
		if(zzbaw1 == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzbaw1.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #74  <Method void zzbaw.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(8, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:bipush          8
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   56:aload_3         
	//   31   57:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   34   64:return          
		zzbaw1;
	//   35   65:astore_1        
		parcel1.recycle();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #61  <Method void Parcel.recycle()>
		throw zzbaw1;
	//   40   74:aload_1         
	//   41   75:athrow          
	}

	public void zzbL(Status status)
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
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		status.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #66  <Method void Status.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(4, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:iconst_4        
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:iconst_0        
	//   26   45:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   50:pop             
		parcel1.readException();
	//   28   51:aload_3         
	//   29   52:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   55:aload_3         
	//   31   56:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   59:aload_2         
	//   33   60:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   34   63:return          
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

	public void zzbM(Status status)
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
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		status.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #66  <Method void Status.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		zzrk.transact(6, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:bipush          6
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   56:aload_3         
	//   31   57:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   34   64:return          
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

	private IBinder zzrk;

	zzbap$zza$zza(IBinder ibinder)
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
