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

public static abstract class zzaxu$zza extends Binder
	implements zzaxu
{
	private static class zza
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


	public static zzaxu zzeX(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzaxu))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzaxu>
	//*  12   23:ifeq            31
			return (zzaxu)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzaxu>
	//   15   30:areturn         
		else
			return ((zzaxu) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzaxu$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzaxu$zza$zza(IBinder)>
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
	//	               3: 78
	//	               4: 149
	//	               6: 191
	//	               7: 233
	//	               8: 304
	//	               1598968902: 70
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    2   60:aload_0         
	//    3   61:iload_1         
	//    4   62:aload_2         
	//    5   63:aload_3         
	//    6   64:iload           4
	//    7   66:invokespecial   #39  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    8   69:ireturn         

		case 1598968902: 
			parcel1.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
	//    9   70:aload_3         
	//   10   71:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//   11   73:invokevirtual   #45  <Method void Parcel.writeString(String)>
			return true;
	//   12   76:iconst_1        
	//   13   77:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
	//   14   78:aload_2         
	//   15   79:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//   16   81:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			ConnectionResult connectionresult;
			if(parcel.readInt() != 0)
	//*  17   84:aload_2         
	//*  18   85:invokevirtual   #52  <Method int Parcel.readInt()>
	//*  19   88:ifeq            138
				connectionresult = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(parcel);
	//   20   91:getstatic       #58  <Field android.os.Parcelable$Creator ConnectionResult.CREATOR>
	//   21   94:aload_2         
	//   22   95:invokeinterface #64  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23  100:checkcast       #54  <Class ConnectionResult>
	//   24  103:astore          5
			else
	//*  25  105:aload_2         
	//*  26  106:invokevirtual   #52  <Method int Parcel.readInt()>
	//*  27  109:ifeq            144
	//*  28  112:getstatic       #67  <Field android.os.Parcelable$Creator zzaxp.CREATOR>
	//*  29  115:aload_2         
	//*  30  116:invokeinterface #64  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//*  31  121:checkcast       #66  <Class zzaxp>
	//*  32  124:astore_2        
	//*  33  125:aload_0         
	//*  34  126:aload           5
	//*  35  128:aload_2         
	//*  36  129:invokevirtual   #70  <Method void zza(ConnectionResult, zzaxp)>
	//*  37  132:aload_3         
	//*  38  133:invokevirtual   #73  <Method void Parcel.writeNoException()>
	//*  39  136:iconst_1        
	//*  40  137:ireturn         
				connectionresult = null;
	//   41  138:aconst_null     
	//   42  139:astore          5
			if(parcel.readInt() != 0)
				parcel = ((Parcel) ((zzaxp)zzaxp.CREATOR.createFromParcel(parcel)));
			else
	//*  43  141:goto            105
				parcel = null;
	//   44  144:aconst_null     
	//   45  145:astore_2        
			zza(connectionresult, ((zzaxp) (parcel)));
			parcel1.writeNoException();
			return true;

	//*  46  146:goto            125
		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
	//   47  149:aload_2         
	//   48  150:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//   49  152:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  50  155:aload_2         
	//*  51  156:invokevirtual   #52  <Method int Parcel.readInt()>
	//*  52  159:ifeq            186
				parcel = ((Parcel) ((Status)Status.CREATOR.createFromParcel(parcel)));
	//   53  162:getstatic       #76  <Field android.os.Parcelable$Creator Status.CREATOR>
	//   54  165:aload_2         
	//   55  166:invokeinterface #64  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   56  171:checkcast       #75  <Class Status>
	//   57  174:astore_2        
			else
	//*  58  175:aload_0         
	//*  59  176:aload_2         
	//*  60  177:invokevirtual   #80  <Method void zzbI(Status)>
	//*  61  180:aload_3         
	//*  62  181:invokevirtual   #73  <Method void Parcel.writeNoException()>
	//*  63  184:iconst_1        
	//*  64  185:ireturn         
				parcel = null;
	//   65  186:aconst_null     
	//   66  187:astore_2        
			zzbI(((Status) (parcel)));
			parcel1.writeNoException();
			return true;

	//*  67  188:goto            175
		case 6: // '\006'
			parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
	//   68  191:aload_2         
	//   69  192:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//   70  194:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  71  197:aload_2         
	//*  72  198:invokevirtual   #52  <Method int Parcel.readInt()>
	//*  73  201:ifeq            228
				parcel = ((Parcel) ((Status)Status.CREATOR.createFromParcel(parcel)));
	//   74  204:getstatic       #76  <Field android.os.Parcelable$Creator Status.CREATOR>
	//   75  207:aload_2         
	//   76  208:invokeinterface #64  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   77  213:checkcast       #75  <Class Status>
	//   78  216:astore_2        
			else
	//*  79  217:aload_0         
	//*  80  218:aload_2         
	//*  81  219:invokevirtual   #83  <Method void zzbJ(Status)>
	//*  82  222:aload_3         
	//*  83  223:invokevirtual   #73  <Method void Parcel.writeNoException()>
	//*  84  226:iconst_1        
	//*  85  227:ireturn         
				parcel = null;
	//   86  228:aconst_null     
	//   87  229:astore_2        
			zzbJ(((Status) (parcel)));
			parcel1.writeNoException();
			return true;

	//*  88  230:goto            217
		case 7: // '\007'
			parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
	//   89  233:aload_2         
	//   90  234:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//   91  236:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			Status status;
			if(parcel.readInt() != 0)
	//*  92  239:aload_2         
	//*  93  240:invokevirtual   #52  <Method int Parcel.readInt()>
	//*  94  243:ifeq            293
				status = (Status)Status.CREATOR.createFromParcel(parcel);
	//   95  246:getstatic       #76  <Field android.os.Parcelable$Creator Status.CREATOR>
	//   96  249:aload_2         
	//   97  250:invokeinterface #64  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   98  255:checkcast       #75  <Class Status>
	//   99  258:astore          5
			else
	//* 100  260:aload_2         
	//* 101  261:invokevirtual   #52  <Method int Parcel.readInt()>
	//* 102  264:ifeq            299
	//* 103  267:getstatic       #86  <Field android.os.Parcelable$Creator GoogleSignInAccount.CREATOR>
	//* 104  270:aload_2         
	//* 105  271:invokeinterface #64  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//* 106  276:checkcast       #85  <Class GoogleSignInAccount>
	//* 107  279:astore_2        
	//* 108  280:aload_0         
	//* 109  281:aload           5
	//* 110  283:aload_2         
	//* 111  284:invokevirtual   #89  <Method void zza(Status, GoogleSignInAccount)>
	//* 112  287:aload_3         
	//* 113  288:invokevirtual   #73  <Method void Parcel.writeNoException()>
	//* 114  291:iconst_1        
	//* 115  292:ireturn         
				status = null;
	//  116  293:aconst_null     
	//  117  294:astore          5
			if(parcel.readInt() != 0)
				parcel = ((Parcel) ((GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(parcel)));
			else
	//* 118  296:goto            260
				parcel = null;
	//  119  299:aconst_null     
	//  120  300:astore_2        
			zza(status, ((GoogleSignInAccount) (parcel)));
			parcel1.writeNoException();
			return true;

	//* 121  301:goto            280
		case 8: // '\b'
			parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
	//  122  304:aload_2         
	//  123  305:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//  124  307:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			break;
		}
		if(parcel.readInt() != 0)
	//* 125  310:aload_2         
	//* 126  311:invokevirtual   #52  <Method int Parcel.readInt()>
	//* 127  314:ifeq            341
			parcel = ((Parcel) ((zzayb)zzayb.CREATOR.createFromParcel(parcel)));
	//  128  317:getstatic       #92  <Field android.os.Parcelable$Creator zzayb.CREATOR>
	//  129  320:aload_2         
	//  130  321:invokeinterface #64  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  131  326:checkcast       #91  <Class zzayb>
	//  132  329:astore_2        
		else
	//* 133  330:aload_0         
	//* 134  331:aload_2         
	//* 135  332:invokevirtual   #96  <Method void zzb(zzayb)>
	//* 136  335:aload_3         
	//* 137  336:invokevirtual   #73  <Method void Parcel.writeNoException()>
	//* 138  339:iconst_1        
	//* 139  340:ireturn         
			parcel = null;
	//  140  341:aconst_null     
	//  141  342:astore_2        
		zzb(((zzayb) (parcel)));
		parcel1.writeNoException();
		return true;
	//* 142  343:goto            330
	}

	public zzaxu$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.signin.internal.ISignInCallbacks");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
