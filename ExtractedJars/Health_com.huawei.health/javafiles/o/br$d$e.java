// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;

// Referenced classes of package o:
//			br, bq

static final class br$d$e
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

	br$d$e(IBinder ibinder)
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
