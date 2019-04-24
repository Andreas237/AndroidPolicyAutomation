// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;

// Referenced classes of package o:
//			bq

static final class bq$a$e
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

	bq$a$e(IBinder ibinder)
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
