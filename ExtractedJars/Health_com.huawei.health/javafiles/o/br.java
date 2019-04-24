// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;

// Referenced classes of package o:
//			bq

public interface br
	extends IInterface
{
	public static abstract class d extends Binder
		implements br
	{

		public static br c(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.alipay.android.app.IAlixPay");
		//    4    6:aload_0         
		//    5    7:ldc1            #16  <String "com.alipay.android.app.IAlixPay">
		//    6    9:invokeinterface #29  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof br))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class br>
		//*  12   23:ifeq            31
				return (br)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class br>
		//   15   30:areturn         
			else
				return ((br) (new e(ibinder)));
		//   16   31:new             #9   <Class br$d$e>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #32  <Method void br$d$e(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    6: default 60
		//		               1: 71
		//		               2: 97
		//		               3: 119
		//		               4: 142
		//		               5: 165
		//		               1598968902: 63
		//*   2   60:goto            191
			case 1598968902: 
				parcel1.writeString("com.alipay.android.app.IAlixPay");
		//    3   63:aload_3         
		//    4   64:ldc1            #16  <String "com.alipay.android.app.IAlixPay">
		//    5   66:invokevirtual   #42  <Method void Parcel.writeString(String)>
				return true;
		//    6   69:iconst_1        
		//    7   70:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.alipay.android.app.IAlixPay");
		//    8   71:aload_2         
		//    9   72:ldc1            #16  <String "com.alipay.android.app.IAlixPay">
		//   10   74:invokevirtual   #45  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (c(parcel.readString())));
		//   11   77:aload_0         
		//   12   78:aload_2         
		//   13   79:invokevirtual   #49  <Method String Parcel.readString()>
		//   14   82:invokevirtual   #52  <Method String c(String)>
		//   15   85:astore_2        
				parcel1.writeNoException();
		//   16   86:aload_3         
		//   17   87:invokevirtual   #55  <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//   18   90:aload_3         
		//   19   91:aload_2         
		//   20   92:invokevirtual   #42  <Method void Parcel.writeString(String)>
				return true;
		//   21   95:iconst_1        
		//   22   96:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.alipay.android.app.IAlixPay");
		//   23   97:aload_2         
		//   24   98:ldc1            #16  <String "com.alipay.android.app.IAlixPay">
		//   25  100:invokevirtual   #45  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (c()));
		//   26  103:aload_0         
		//   27  104:invokevirtual   #57  <Method String c()>
		//   28  107:astore_2        
				parcel1.writeNoException();
		//   29  108:aload_3         
		//   30  109:invokevirtual   #55  <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//   31  112:aload_3         
		//   32  113:aload_2         
		//   33  114:invokevirtual   #42  <Method void Parcel.writeString(String)>
				return true;
		//   34  117:iconst_1        
		//   35  118:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.alipay.android.app.IAlixPay");
		//   36  119:aload_2         
		//   37  120:ldc1            #16  <String "com.alipay.android.app.IAlixPay">
		//   38  122:invokevirtual   #45  <Method void Parcel.enforceInterface(String)>
				e(bq.a.d(parcel.readStrongBinder()));
		//   39  125:aload_0         
		//   40  126:aload_2         
		//   41  127:invokevirtual   #61  <Method IBinder Parcel.readStrongBinder()>
		//   42  130:invokestatic    #66  <Method bq bq$a.d(IBinder)>
		//   43  133:invokevirtual   #69  <Method void e(bq)>
				parcel1.writeNoException();
		//   44  136:aload_3         
		//   45  137:invokevirtual   #55  <Method void Parcel.writeNoException()>
				return true;
		//   46  140:iconst_1        
		//   47  141:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.alipay.android.app.IAlixPay");
		//   48  142:aload_2         
		//   49  143:ldc1            #16  <String "com.alipay.android.app.IAlixPay">
		//   50  145:invokevirtual   #45  <Method void Parcel.enforceInterface(String)>
				c(bq.a.d(parcel.readStrongBinder()));
		//   51  148:aload_0         
		//   52  149:aload_2         
		//   53  150:invokevirtual   #61  <Method IBinder Parcel.readStrongBinder()>
		//   54  153:invokestatic    #66  <Method bq bq$a.d(IBinder)>
		//   55  156:invokevirtual   #71  <Method void c(bq)>
				parcel1.writeNoException();
		//   56  159:aload_3         
		//   57  160:invokevirtual   #55  <Method void Parcel.writeNoException()>
				return true;
		//   58  163:iconst_1        
		//   59  164:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.alipay.android.app.IAlixPay");
		//   60  165:aload_2         
		//   61  166:ldc1            #16  <String "com.alipay.android.app.IAlixPay">
		//   62  168:invokevirtual   #45  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (e(parcel.readString())));
		//   63  171:aload_0         
		//   64  172:aload_2         
		//   65  173:invokevirtual   #49  <Method String Parcel.readString()>
		//   66  176:invokevirtual   #73  <Method String e(String)>
		//   67  179:astore_2        
				parcel1.writeNoException();
		//   68  180:aload_3         
		//   69  181:invokevirtual   #55  <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//   70  184:aload_3         
		//   71  185:aload_2         
		//   72  186:invokevirtual   #42  <Method void Parcel.writeString(String)>
				return true;
		//   73  189:iconst_1        
		//   74  190:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   75  191:aload_0         
		//   76  192:iload_1         
		//   77  193:aload_2         
		//   78  194:aload_3         
		//   79  195:iload           4
		//   80  197:invokespecial   #75  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   81  200:ireturn         
		}

		public d()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.alipay.android.app.IAlixPay");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #16  <String "com.alipay.android.app.IAlixPay">
		//    5    8:invokevirtual   #20  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static final class d.e
		implements br
	{

		public final IBinder asBinder()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder d>
		//    2    4:areturn         
		}

		public final String c()
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
			parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.alipay.android.app.IAlixPay">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			d.transact(2, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder d>
		//    9   18:iconst_2        
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

		public final String c(String s)
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
			parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.alipay.android.app.IAlixPay">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #57  <Method void Parcel.writeString(String)>
			d.transact(1, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder d>
		//   12   23:iconst_1        
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

		public final void c(bq bq1)
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
			parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.alipay.android.app.IAlixPay">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bq1 == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			bq1 = ((bq) (bq1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #62  <Method IBinder bq.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (bq1)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #65  <Method void Parcel.writeStrongBinder(IBinder)>
			d.transact(4, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder d>
		//   18   37:iconst_4        
		//   19   38:aload_2         
		//   20   39:aload_3         
		//   21   40:iconst_0        
		//   22   41:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   46:pop             
			parcel1.readException();
		//   24   47:aload_3         
		//   25   48:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   51:aload_3         
		//   27   52:invokevirtual   #52  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   55:aload_2         
		//   29   56:invokevirtual   #52  <Method void Parcel.recycle()>
			return;
		//   30   59:return          
			bq1;
		//   31   60:astore_1        
			parcel1.recycle();
		//   32   61:aload_3         
		//   33   62:invokevirtual   #52  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   65:aload_2         
		//   35   66:invokevirtual   #52  <Method void Parcel.recycle()>
			throw bq1;
		//   36   69:aload_1         
		//   37   70:athrow          
_L2:
			bq1 = null;
		//   38   71:aconst_null     
		//   39   72:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   73:goto            28
_L3:
		}

		public final String e(String s)
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
			parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.alipay.android.app.IAlixPay">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #57  <Method void Parcel.writeString(String)>
			d.transact(5, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder d>
		//   12   23:iconst_5        
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

		public final void e(bq bq1)
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
			parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.alipay.android.app.IAlixPay">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bq1 == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			bq1 = ((bq) (bq1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #62  <Method IBinder bq.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (bq1)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #65  <Method void Parcel.writeStrongBinder(IBinder)>
			d.transact(3, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder d>
		//   18   37:iconst_3        
		//   19   38:aload_2         
		//   20   39:aload_3         
		//   21   40:iconst_0        
		//   22   41:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   46:pop             
			parcel1.readException();
		//   24   47:aload_3         
		//   25   48:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   51:aload_3         
		//   27   52:invokevirtual   #52  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   55:aload_2         
		//   29   56:invokevirtual   #52  <Method void Parcel.recycle()>
			return;
		//   30   59:return          
			bq1;
		//   31   60:astore_1        
			parcel1.recycle();
		//   32   61:aload_3         
		//   33   62:invokevirtual   #52  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   65:aload_2         
		//   35   66:invokevirtual   #52  <Method void Parcel.recycle()>
			throw bq1;
		//   36   69:aload_1         
		//   37   70:athrow          
_L2:
			bq1 = null;
		//   38   71:aconst_null     
		//   39   72:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   73:goto            28
_L3:
		}

		private IBinder d;

		d.e(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			d = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder d>
		//    5    9:return          
		}
	}


	public abstract String c()
		throws RemoteException;

	public abstract String c(String s)
		throws RemoteException;

	public abstract void c(bq bq)
		throws RemoteException;

	public abstract String e(String s)
		throws RemoteException;

	public abstract void e(bq bq)
		throws RemoteException;
}
