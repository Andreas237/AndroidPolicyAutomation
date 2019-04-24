// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzbak, zzbaw

public interface zzbap
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzbap
	{

		public static zzbap zzfe(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
		//    4    6:aload_0         
		//    5    7:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
		//    6    9:invokeinterface #28  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzbap))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzbap>
		//*  12   23:ifeq            31
				return (zzbap)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzbap>
		//   15   30:areturn         
			else
				return ((zzbap) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzbap$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #31  <Method void zzbap$zza$zza(IBinder)>
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
		//		               3: 71
		//		               4: 142
		//		               6: 184
		//		               7: 226
		//		               8: 297
		//		               1598968902: 63
		//*   2   60:goto            339
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
		//    3   63:aload_3         
		//    4   64:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
		//    5   66:invokevirtual   #43  <Method void Parcel.writeString(String)>
				return true;
		//    6   69:iconst_1        
		//    7   70:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
		//    8   71:aload_2         
		//    9   72:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
		//   10   74:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				ConnectionResult connectionresult;
				if(parcel.readInt() != 0)
		//*  11   77:aload_2         
		//*  12   78:invokevirtual   #50  <Method int Parcel.readInt()>
		//*  13   81:ifeq            101
					connectionresult = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(parcel);
		//   14   84:getstatic       #56  <Field android.os.Parcelable$Creator ConnectionResult.CREATOR>
		//   15   87:aload_2         
		//   16   88:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   17   93:checkcast       #52  <Class ConnectionResult>
		//   18   96:astore          5
				else
		//*  19   98:goto            104
					connectionresult = null;
		//   20  101:aconst_null     
		//   21  102:astore          5
				if(parcel.readInt() != 0)
		//*  22  104:aload_2         
		//*  23  105:invokevirtual   #50  <Method int Parcel.readInt()>
		//*  24  108:ifeq            127
					parcel = ((Parcel) ((zzbak)zzbak.CREATOR.createFromParcel(parcel)));
		//   25  111:getstatic       #65  <Field android.os.Parcelable$Creator zzbak.CREATOR>
		//   26  114:aload_2         
		//   27  115:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   28  120:checkcast       #64  <Class zzbak>
		//   29  123:astore_2        
				else
		//*  30  124:goto            129
					parcel = null;
		//   31  127:aconst_null     
		//   32  128:astore_2        
				zza(connectionresult, ((zzbak) (parcel)));
		//   33  129:aload_0         
		//   34  130:aload           5
		//   35  132:aload_2         
		//   36  133:invokevirtual   #68  <Method void zza(ConnectionResult, zzbak)>
				parcel1.writeNoException();
		//   37  136:aload_3         
		//   38  137:invokevirtual   #71  <Method void Parcel.writeNoException()>
				return true;
		//   39  140:iconst_1        
		//   40  141:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
		//   41  142:aload_2         
		//   42  143:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
		//   43  145:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  44  148:aload_2         
		//*  45  149:invokevirtual   #50  <Method int Parcel.readInt()>
		//*  46  152:ifeq            171
					parcel = ((Parcel) ((Status)Status.CREATOR.createFromParcel(parcel)));
		//   47  155:getstatic       #74  <Field android.os.Parcelable$Creator Status.CREATOR>
		//   48  158:aload_2         
		//   49  159:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   50  164:checkcast       #73  <Class Status>
		//   51  167:astore_2        
				else
		//*  52  168:goto            173
					parcel = null;
		//   53  171:aconst_null     
		//   54  172:astore_2        
				zzbL(((Status) (parcel)));
		//   55  173:aload_0         
		//   56  174:aload_2         
		//   57  175:invokevirtual   #78  <Method void zzbL(Status)>
				parcel1.writeNoException();
		//   58  178:aload_3         
		//   59  179:invokevirtual   #71  <Method void Parcel.writeNoException()>
				return true;
		//   60  182:iconst_1        
		//   61  183:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
		//   62  184:aload_2         
		//   63  185:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
		//   64  187:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  65  190:aload_2         
		//*  66  191:invokevirtual   #50  <Method int Parcel.readInt()>
		//*  67  194:ifeq            213
					parcel = ((Parcel) ((Status)Status.CREATOR.createFromParcel(parcel)));
		//   68  197:getstatic       #74  <Field android.os.Parcelable$Creator Status.CREATOR>
		//   69  200:aload_2         
		//   70  201:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   71  206:checkcast       #73  <Class Status>
		//   72  209:astore_2        
				else
		//*  73  210:goto            215
					parcel = null;
		//   74  213:aconst_null     
		//   75  214:astore_2        
				zzbM(((Status) (parcel)));
		//   76  215:aload_0         
		//   77  216:aload_2         
		//   78  217:invokevirtual   #81  <Method void zzbM(Status)>
				parcel1.writeNoException();
		//   79  220:aload_3         
		//   80  221:invokevirtual   #71  <Method void Parcel.writeNoException()>
				return true;
		//   81  224:iconst_1        
		//   82  225:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
		//   83  226:aload_2         
		//   84  227:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
		//   85  229:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				Status status;
				if(parcel.readInt() != 0)
		//*  86  232:aload_2         
		//*  87  233:invokevirtual   #50  <Method int Parcel.readInt()>
		//*  88  236:ifeq            256
					status = (Status)Status.CREATOR.createFromParcel(parcel);
		//   89  239:getstatic       #74  <Field android.os.Parcelable$Creator Status.CREATOR>
		//   90  242:aload_2         
		//   91  243:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   92  248:checkcast       #73  <Class Status>
		//   93  251:astore          5
				else
		//*  94  253:goto            259
					status = null;
		//   95  256:aconst_null     
		//   96  257:astore          5
				if(parcel.readInt() != 0)
		//*  97  259:aload_2         
		//*  98  260:invokevirtual   #50  <Method int Parcel.readInt()>
		//*  99  263:ifeq            282
					parcel = ((Parcel) ((GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(parcel)));
		//  100  266:getstatic       #84  <Field android.os.Parcelable$Creator GoogleSignInAccount.CREATOR>
		//  101  269:aload_2         
		//  102  270:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  103  275:checkcast       #83  <Class GoogleSignInAccount>
		//  104  278:astore_2        
				else
		//* 105  279:goto            284
					parcel = null;
		//  106  282:aconst_null     
		//  107  283:astore_2        
				zza(status, ((GoogleSignInAccount) (parcel)));
		//  108  284:aload_0         
		//  109  285:aload           5
		//  110  287:aload_2         
		//  111  288:invokevirtual   #87  <Method void zza(Status, GoogleSignInAccount)>
				parcel1.writeNoException();
		//  112  291:aload_3         
		//  113  292:invokevirtual   #71  <Method void Parcel.writeNoException()>
				return true;
		//  114  295:iconst_1        
		//  115  296:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
		//  116  297:aload_2         
		//  117  298:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
		//  118  300:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 119  303:aload_2         
		//* 120  304:invokevirtual   #50  <Method int Parcel.readInt()>
		//* 121  307:ifeq            326
					parcel = ((Parcel) ((zzbaw)zzbaw.CREATOR.createFromParcel(parcel)));
		//  122  310:getstatic       #90  <Field android.os.Parcelable$Creator zzbaw.CREATOR>
		//  123  313:aload_2         
		//  124  314:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  125  319:checkcast       #89  <Class zzbaw>
		//  126  322:astore_2        
				else
		//* 127  323:goto            328
					parcel = null;
		//  128  326:aconst_null     
		//  129  327:astore_2        
				zzb(((zzbaw) (parcel)));
		//  130  328:aload_0         
		//  131  329:aload_2         
		//  132  330:invokevirtual   #94  <Method void zzb(zzbaw)>
				parcel1.writeNoException();
		//  133  333:aload_3         
		//  134  334:invokevirtual   #71  <Method void Parcel.writeNoException()>
				return true;
		//  135  337:iconst_1        
		//  136  338:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  137  339:aload_0         
		//  138  340:iload_1         
		//  139  341:aload_2         
		//  140  342:aload_3         
		//  141  343:iload           4
		//  142  345:invokespecial   #96  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  143  348:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.google.android.gms.signin.internal.ISignInCallbacks");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #15  <String "com.google.android.gms.signin.internal.ISignInCallbacks">
		//    5    8:invokevirtual   #19  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static class zza.zza
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

		zza.zza(IBinder ibinder)
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


	public abstract void zza(ConnectionResult connectionresult, zzbak zzbak)
		throws RemoteException;

	public abstract void zza(Status status, GoogleSignInAccount googlesigninaccount)
		throws RemoteException;

	public abstract void zzb(zzbaw zzbaw)
		throws RemoteException;

	public abstract void zzbL(Status status)
		throws RemoteException;

	public abstract void zzbM(Status status)
		throws RemoteException;
}
