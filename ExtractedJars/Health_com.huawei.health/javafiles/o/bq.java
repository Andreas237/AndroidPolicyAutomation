// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;

public interface bq
	extends IInterface
{
	public static abstract class a extends Binder
		implements bq
	{

		public static bq d(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.alipay.android.app.IRemoteServiceCallback");
		//    4    6:aload_0         
		//    5    7:ldc1            #16  <String "com.alipay.android.app.IRemoteServiceCallback">
		//    6    9:invokeinterface #29  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof bq))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class bq>
		//*  12   23:ifeq            31
				return (bq)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class bq>
		//   15   30:areturn         
			else
				return ((bq) (new e(ibinder)));
		//   16   31:new             #9   <Class bq$a$e>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #32  <Method void bq$a$e(IBinder)>
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
		//*   1    1:lookupswitch    4: default 44
		//		               1: 55
		//		               2: 119
		//		               3: 157
		//		               1598968902: 47
		//*   2   44:goto            192
			case 1598968902: 
				parcel1.writeString("com.alipay.android.app.IRemoteServiceCallback");
		//    3   47:aload_3         
		//    4   48:ldc1            #16  <String "com.alipay.android.app.IRemoteServiceCallback">
		//    5   50:invokevirtual   #44  <Method void Parcel.writeString(String)>
				return true;
		//    6   53:iconst_1        
		//    7   54:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
		//    8   55:aload_2         
		//    9   56:ldc1            #16  <String "com.alipay.android.app.IRemoteServiceCallback">
		//   10   58:invokevirtual   #47  <Method void Parcel.enforceInterface(String)>
				String s = parcel.readString();
		//   11   61:aload_2         
		//   12   62:invokevirtual   #51  <Method String Parcel.readString()>
		//   13   65:astore          6
				String s1 = parcel.readString();
		//   14   67:aload_2         
		//   15   68:invokevirtual   #51  <Method String Parcel.readString()>
		//   16   71:astore          7
				i = parcel.readInt();
		//   17   73:aload_2         
		//   18   74:invokevirtual   #55  <Method int Parcel.readInt()>
		//   19   77:istore_1        
				if(parcel.readInt() != 0)
		//*  20   78:aload_2         
		//*  21   79:invokevirtual   #55  <Method int Parcel.readInt()>
		//*  22   82:ifeq            101
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   23   85:getstatic       #61  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   24   88:aload_2         
		//   25   89:invokeinterface #67  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   26   94:checkcast       #57  <Class Bundle>
		//   27   97:astore_2        
				else
		//*  28   98:goto            103
					parcel = null;
		//   29  101:aconst_null     
		//   30  102:astore_2        
				a(s, s1, i, ((Bundle) (parcel)));
		//   31  103:aload_0         
		//   32  104:aload           6
		//   33  106:aload           7
		//   34  108:iload_1         
		//   35  109:aload_2         
		//   36  110:invokevirtual   #70  <Method void a(String, String, int, Bundle)>
				parcel1.writeNoException();
		//   37  113:aload_3         
		//   38  114:invokevirtual   #73  <Method void Parcel.writeNoException()>
				return true;
		//   39  117:iconst_1        
		//   40  118:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
		//   41  119:aload_2         
		//   42  120:ldc1            #16  <String "com.alipay.android.app.IRemoteServiceCallback">
		//   43  122:invokevirtual   #47  <Method void Parcel.enforceInterface(String)>
				boolean flag;
				if(parcel.readInt() != 0)
		//*  44  125:aload_2         
		//*  45  126:invokevirtual   #55  <Method int Parcel.readInt()>
		//*  46  129:ifeq            138
					flag = true;
		//   47  132:iconst_1        
		//   48  133:istore          5
				else
		//*  49  135:goto            141
					flag = false;
		//   50  138:iconst_0        
		//   51  139:istore          5
				a(flag, parcel.readString());
		//   52  141:aload_0         
		//   53  142:iload           5
		//   54  144:aload_2         
		//   55  145:invokevirtual   #51  <Method String Parcel.readString()>
		//   56  148:invokevirtual   #76  <Method void a(boolean, String)>
				parcel1.writeNoException();
		//   57  151:aload_3         
		//   58  152:invokevirtual   #73  <Method void Parcel.writeNoException()>
				return true;
		//   59  155:iconst_1        
		//   60  156:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
		//   61  157:aload_2         
		//   62  158:ldc1            #16  <String "com.alipay.android.app.IRemoteServiceCallback">
		//   63  160:invokevirtual   #47  <Method void Parcel.enforceInterface(String)>
				boolean flag1 = a();
		//   64  163:aload_0         
		//   65  164:invokevirtual   #79  <Method boolean a()>
		//   66  167:istore          5
				parcel1.writeNoException();
		//   67  169:aload_3         
		//   68  170:invokevirtual   #73  <Method void Parcel.writeNoException()>
				if(flag1)
		//*  69  173:iload           5
		//*  70  175:ifeq            183
					i = 1;
		//   71  178:iconst_1        
		//   72  179:istore_1        
				else
		//*  73  180:goto            185
					i = 0;
		//   74  183:iconst_0        
		//   75  184:istore_1        
				parcel1.writeInt(i);
		//   76  185:aload_3         
		//   77  186:iload_1         
		//   78  187:invokevirtual   #83  <Method void Parcel.writeInt(int)>
				return true;
		//   79  190:iconst_1        
		//   80  191:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   81  192:aload_0         
		//   82  193:iload_1         
		//   83  194:aload_2         
		//   84  195:aload_3         
		//   85  196:iload           4
		//   86  198:invokespecial   #85  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   87  201:ireturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.alipay.android.app.IRemoteServiceCallback");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #16  <String "com.alipay.android.app.IRemoteServiceCallback">
		//    5    8:invokevirtual   #20  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static final class a.e
		implements bq
	{

		public final void a(String s, String s1, int i, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore          5
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    8:astore          6
			parcel.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
		//    4   10:aload           5
		//    5   12:ldc1            #31  <String "com.alipay.android.app.IRemoteServiceCallback">
		//    6   14:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   17:aload           5
		//    8   19:aload_1         
		//    9   20:invokevirtual   #38  <Method void Parcel.writeString(String)>
			parcel.writeString(s1);
		//   10   23:aload           5
		//   11   25:aload_2         
		//   12   26:invokevirtual   #38  <Method void Parcel.writeString(String)>
			parcel.writeInt(i);
		//   13   29:aload           5
		//   14   31:iload_3         
		//   15   32:invokevirtual   #42  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_57;
		//   16   35:aload           4
		//   17   37:ifnull          57
			parcel.writeInt(1);
		//   18   40:aload           5
		//   19   42:iconst_1        
		//   20   43:invokevirtual   #42  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   21   46:aload           4
		//   22   48:aload           5
		//   23   50:iconst_0        
		//   24   51:invokevirtual   #48  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_63;
		//   25   54:goto            63
			parcel.writeInt(0);
		//   26   57:aload           5
		//   27   59:iconst_0        
		//   28   60:invokevirtual   #42  <Method void Parcel.writeInt(int)>
			d.transact(1, parcel, parcel1, 0);
		//   29   63:aload_0         
		//   30   64:getfield        #19  <Field IBinder d>
		//   31   67:iconst_1        
		//   32   68:aload           5
		//   33   70:aload           6
		//   34   72:iconst_0        
		//   35   73:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   36   78:pop             
			parcel1.readException();
		//   37   79:aload           6
		//   38   81:invokevirtual   #57  <Method void Parcel.readException()>
			parcel1.recycle();
		//   39   84:aload           6
		//   40   86:invokevirtual   #60  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   89:aload           5
		//   42   91:invokevirtual   #60  <Method void Parcel.recycle()>
			return;
		//   43   94:return          
			s;
		//   44   95:astore_1        
			parcel1.recycle();
		//   45   96:aload           6
		//   46   98:invokevirtual   #60  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47  101:aload           5
		//   48  103:invokevirtual   #60  <Method void Parcel.recycle()>
			throw s;
		//   49  106:aload_1         
		//   50  107:athrow          
		}

		public final void a(boolean flag, String s)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
		//    4   10:aload           4
		//    5   12:ldc1            #31  <String "com.alipay.android.app.IRemoteServiceCallback">
		//    6   14:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			if(flag)
		//*   7   17:iload_1         
		//*   8   18:ifeq            83
				i = 1;
		//    9   21:iconst_1        
		//   10   22:istore_3        
			else
		//*  11   23:goto            26
		//*  12   26:aload           4
		//*  13   28:iload_3         
		//*  14   29:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		//*  15   32:aload           4
		//*  16   34:aload_2         
		//*  17   35:invokevirtual   #38  <Method void Parcel.writeString(String)>
		//*  18   38:aload_0         
		//*  19   39:getfield        #19  <Field IBinder d>
		//*  20   42:iconst_2        
		//*  21   43:aload           4
		//*  22   45:aload           5
		//*  23   47:iconst_0        
		//*  24   48:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  25   53:pop             
		//*  26   54:aload           5
		//*  27   56:invokevirtual   #57  <Method void Parcel.readException()>
		//*  28   59:aload           5
		//*  29   61:invokevirtual   #60  <Method void Parcel.recycle()>
		//*  30   64:aload           4
		//*  31   66:invokevirtual   #60  <Method void Parcel.recycle()>
		//*  32   69:return          
		//*  33   70:astore_2        
		//*  34   71:aload           5
		//*  35   73:invokevirtual   #60  <Method void Parcel.recycle()>
		//*  36   76:aload           4
		//*  37   78:invokevirtual   #60  <Method void Parcel.recycle()>
		//*  38   81:aload_2         
		//*  39   82:athrow          
				i = 0;
		//   40   83:iconst_0        
		//   41   84:istore_3        
			parcel.writeInt(i);
			parcel.writeString(s);
			d.transact(2, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			s;
			parcel1.recycle();
			parcel.recycle();
			throw s;
		//*  42   85:goto            26
		}

		public final boolean a()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.alipay.android.app.IRemoteServiceCallback">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			d.transact(3, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder d>
		//    9   19:iconst_3        
		//   10   20:aload_3         
		//   11   21:aload           4
		//   12   23:iconst_0        
		//   13   24:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   29:pop             
			parcel1.readException();
		//   15   30:aload           4
		//   16   32:invokevirtual   #57  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   35:aload           4
		//   18   37:invokevirtual   #67  <Method int Parcel.readInt()>
		//   19   40:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   41:iload_1         
		//*  21   42:ifeq            50
				flag = true;
		//   22   45:iconst_1        
		//   23   46:istore_2        
			else
		//*  24   47:goto            52
				flag = false;
		//   25   50:iconst_0        
		//   26   51:istore_2        
			parcel1.recycle();
		//   27   52:aload           4
		//   28   54:invokevirtual   #60  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   57:aload_3         
		//   30   58:invokevirtual   #60  <Method void Parcel.recycle()>
			return flag;
		//   31   61:iload_2         
		//   32   62:ireturn         
			Exception exception;
			exception;
		//   33   63:astore          5
			parcel1.recycle();
		//   34   65:aload           4
		//   35   67:invokevirtual   #60  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   70:aload_3         
		//   37   71:invokevirtual   #60  <Method void Parcel.recycle()>
			throw exception;
		//   38   74:aload           5
		//   39   76:athrow          
		}

		public final IBinder asBinder()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder d>
		//    2    4:areturn         
		}

		private IBinder d;

		a.e(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			d = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field IBinder d>
		//    5    9:return          
		}
	}


	public abstract void a(String s, String s1, int i, Bundle bundle)
		throws RemoteException;

	public abstract void a(boolean flag, String s)
		throws RemoteException;

	public abstract boolean a()
		throws RemoteException;
}
