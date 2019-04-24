// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.internal.telephony;

import android.os.*;
import android.telephony.NeighboringCellInfo;
import java.util.List;

// Referenced classes of package com.android.internal.telephony:
//			ITelephony

static class ITelephony$Stub$Proxy
	implements ITelephony
{

	public void answerRingingCall()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(7, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          7
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public void call(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #54  <Method void Parcel.writeString(String)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:iconst_3        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #44  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_2         
	//   23   42:invokevirtual   #47  <Method void Parcel.recycle()>
		return;
	//   24   45:return          
		s;
	//   25   46:astore_1        
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #47  <Method void Parcel.recycle()>
		throw s;
	//   30   55:aload_1         
	//   31   56:athrow          
	}

	public void cancelMissedCallsNotification()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(9, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          9
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void dial(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #54  <Method void Parcel.writeString(String)>
		mRemote.transact(2, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:iconst_2        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #44  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_2         
	//   23   42:invokevirtual   #47  <Method void Parcel.recycle()>
		return;
	//   24   45:return          
		s;
	//   25   46:astore_1        
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #47  <Method void Parcel.recycle()>
		throw s;
	//   30   55:aload_1         
	//   31   56:athrow          
	}

	public int disableApnType(String s)
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #54  <Method void Parcel.writeString(String)>
		mRemote.transact(30, parcel, parcel1, 0);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field IBinder mRemote>
	//   12   24:bipush          30
	//   13   26:aload_3         
	//   14   27:aload           4
	//   15   29:iconst_0        
	//   16   30:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   35:pop             
		parcel1.readException();
	//   18   36:aload           4
	//   19   38:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   20   41:aload           4
	//   21   43:invokevirtual   #62  <Method int Parcel.readInt()>
	//   22   46:istore_2        
		parcel1.recycle();
	//   23   47:aload           4
	//   24   49:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   52:aload_3         
	//   26   53:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   27   56:iload_2         
	//   28   57:ireturn         
		s;
	//   29   58:astore_1        
		parcel1.recycle();
	//   30   59:aload           4
	//   31   61:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   64:aload_3         
	//   33   65:invokevirtual   #47  <Method void Parcel.recycle()>
		throw s;
	//   34   68:aload_1         
	//   35   69:athrow          
	}

	public boolean disableDataConnectivity()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(8, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          8
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public void disableLocationUpdates()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(14, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          14
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public int enableApnType(String s)
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #54  <Method void Parcel.writeString(String)>
		mRemote.transact(15, parcel, parcel1, 0);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field IBinder mRemote>
	//   12   24:bipush          15
	//   13   26:aload_3         
	//   14   27:aload           4
	//   15   29:iconst_0        
	//   16   30:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   35:pop             
		parcel1.readException();
	//   18   36:aload           4
	//   19   38:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   20   41:aload           4
	//   21   43:invokevirtual   #62  <Method int Parcel.readInt()>
	//   22   46:istore_2        
		parcel1.recycle();
	//   23   47:aload           4
	//   24   49:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   52:aload_3         
	//   26   53:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   27   56:iload_2         
	//   28   57:ireturn         
		s;
	//   29   58:astore_1        
		parcel1.recycle();
	//   30   59:aload           4
	//   31   61:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   64:aload_3         
	//   33   65:invokevirtual   #47  <Method void Parcel.recycle()>
		throw s;
	//   34   68:aload_1         
	//   35   69:athrow          
	}

	public boolean enableDataConnectivity()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(36, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          36
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public void enableLocationUpdates()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(29, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          29
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public boolean endCall()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(41, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          41
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean endCallForSubscriber(int i)
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #75  <Method void Parcel.writeInt(int)>
		mRemote.transact(39, parcel, parcel1, 0);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field IBinder mRemote>
	//   12   24:bipush          39
	//   13   26:aload_3         
	//   14   27:aload           4
	//   15   29:iconst_0        
	//   16   30:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   35:pop             
		parcel1.readException();
	//   18   36:aload           4
	//   19   38:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   20   41:aload           4
	//   21   43:invokevirtual   #62  <Method int Parcel.readInt()>
	//   22   46:istore_1        
		boolean flag;
		if(i != 0)
	//*  23   47:iload_1         
	//*  24   48:ifeq            56
			flag = true;
	//   25   51:iconst_1        
	//   26   52:istore_2        
		else
	//*  27   53:goto            58
			flag = false;
	//   28   56:iconst_0        
	//   29   57:istore_2        
		parcel1.recycle();
	//   30   58:aload           4
	//   31   60:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   63:aload_3         
	//   33   64:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   34   67:iload_2         
	//   35   68:ireturn         
		Exception exception;
		exception;
	//   36   69:astore          5
		parcel1.recycle();
	//   37   71:aload           4
	//   38   73:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   76:aload_3         
	//   40   77:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   41   80:aload           5
	//   42   82:athrow          
	}

	public int getActivePhoneType()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(22, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          22
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int getCallState()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(19, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          19
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int getCdmaEriIconIndex()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(23, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          23
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int getCdmaEriIconMode()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(24, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          24
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public String getCdmaEriText()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		String s;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(25, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          25
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #84  <Method String Parcel.readString()>
	//   19   37:astore_3        
		parcel1.recycle();
	//   20   38:aload_2         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return s;
	//   24   46:aload_3         
	//   25   47:areturn         
		Exception exception;
		exception;
	//   26   48:astore_3        
		parcel1.recycle();
	//   27   49:aload_2         
	//   28   50:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   53:aload_1         
	//   30   54:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   57:aload_3         
	//   32   58:athrow          
	}

	public Bundle getCellLocation()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		Bundle bundle;
label0:
		{
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(17, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          17
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #92  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #98  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #88  <Class Bundle>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			bundle = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #47  <Method void Parcel.recycle()>
		return bundle;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public int getDataActivity()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(20, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          20
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int getDataState()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(21, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          21
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public String getInterfaceDescriptor()
	{
		return "com.android.internal.telephony.ITelephony";
	//    0    0:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    1    2:areturn         
	}

	public int getLteOnCdmaMode()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(6, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          6
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public List getNeighboringCellInfo()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		java.util.ArrayList arraylist;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(18, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          18
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		arraylist = parcel1.createTypedArrayList(NeighboringCellInfo.CREATOR);
	//   17   33:aload_2         
	//   18   34:getstatic       #107 <Field android.os.Parcelable$Creator NeighboringCellInfo.CREATOR>
	//   19   37:invokevirtual   #111 <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   20   40:astore_3        
		parcel1.recycle();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #47  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   25   49:aload_3         
	//   26   50:areturn         
		Exception exception;
		exception;
	//   27   51:astore_3        
		parcel1.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   56:aload_1         
	//   31   57:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   32   60:aload_3         
	//   33   61:athrow          
	}

	public int getNetworkType()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(38, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          38
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int getVoiceMessageCount()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(37, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          37
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public boolean handlePinMmi(String s)
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
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4   10:aload           4
	//    5   12:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   14:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   17:aload           4
	//    8   19:aload_1         
	//    9   20:invokevirtual   #54  <Method void Parcel.writeString(String)>
		mRemote.transact(10, parcel, parcel1, 0);
	//   10   23:aload_0         
	//   11   24:getfield        #19  <Field IBinder mRemote>
	//   12   27:bipush          10
	//   13   29:aload           4
	//   14   31:aload           5
	//   15   33:iconst_0        
	//   16   34:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   39:pop             
		parcel1.readException();
	//   18   40:aload           5
	//   19   42:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   20   45:aload           5
	//   21   47:invokevirtual   #62  <Method int Parcel.readInt()>
	//   22   50:istore_2        
		boolean flag;
		if(i != 0)
	//*  23   51:iload_2         
	//*  24   52:ifeq            60
			flag = true;
	//   25   55:iconst_1        
	//   26   56:istore_3        
		else
	//*  27   57:goto            62
			flag = false;
	//   28   60:iconst_0        
	//   29   61:istore_3        
		parcel1.recycle();
	//   30   62:aload           5
	//   31   64:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   67:aload           4
	//   33   69:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   34   72:iload_3         
	//   35   73:ireturn         
		s;
	//   36   74:astore_1        
		parcel1.recycle();
	//   37   75:aload           5
	//   38   77:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   80:aload           4
	//   40   82:invokevirtual   #47  <Method void Parcel.recycle()>
		throw s;
	//   41   85:aload_1         
	//   42   86:athrow          
	}

	public boolean hasIccCard()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(5, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:iconst_5        
	//   10   20:aload_3         
	//   11   21:aload           4
	//   12   23:iconst_0        
	//   13   24:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   29:pop             
		parcel1.readException();
	//   15   30:aload           4
	//   16   32:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   35:aload           4
	//   18   37:invokevirtual   #62  <Method int Parcel.readInt()>
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
	//   28   54:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   57:aload_3         
	//   30   58:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   61:iload_2         
	//   32   62:ireturn         
		Exception exception;
		exception;
	//   33   63:astore          5
		parcel1.recycle();
	//   34   65:aload           4
	//   35   67:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   70:aload_3         
	//   37   71:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   74:aload           5
	//   39   76:athrow          
	}

	public boolean isDataConnectivityPossible()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(16, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          16
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isIdle()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(4, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:iconst_4        
	//   10   20:aload_3         
	//   11   21:aload           4
	//   12   23:iconst_0        
	//   13   24:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   29:pop             
		parcel1.readException();
	//   15   30:aload           4
	//   16   32:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   35:aload           4
	//   18   37:invokevirtual   #62  <Method int Parcel.readInt()>
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
	//   28   54:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   57:aload_3         
	//   30   58:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   61:iload_2         
	//   32   62:ireturn         
		Exception exception;
		exception;
	//   33   63:astore          5
		parcel1.recycle();
	//   34   65:aload           4
	//   35   67:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   70:aload_3         
	//   37   71:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   74:aload           5
	//   39   76:athrow          
	}

	public boolean isOffhook()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(31, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          31
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isRadioOn()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(11, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          11
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isRinging()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(33, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          33
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isSimPinEnabled()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(35, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          35
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean needsOtaServiceProvisioning()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(26, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          26
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean setRadio(boolean flag)
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            92
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #75  <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #19  <Field IBinder mRemote>
	//*  17   33:bipush          27
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:iconst_0        
	//*  21   39:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   44:pop             
	//*  23   45:aload           4
	//*  24   47:invokevirtual   #44  <Method void Parcel.readException()>
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #62  <Method int Parcel.readInt()>
	//*  27   55:istore_2        
	//*  28   56:iload_2         
	//*  29   57:ifeq            65
	//*  30   60:iconst_1        
	//*  31   61:istore_1        
	//*  32   62:goto            67
	//*  33   65:iconst_0        
	//*  34   66:istore_1        
	//*  35   67:aload           4
	//*  36   69:invokevirtual   #47  <Method void Parcel.recycle()>
	//*  37   72:aload_3         
	//*  38   73:invokevirtual   #47  <Method void Parcel.recycle()>
	//*  39   76:iload_1         
	//*  40   77:ireturn         
	//*  41   78:astore          5
	//*  42   80:aload           4
	//*  43   82:invokevirtual   #47  <Method void Parcel.recycle()>
	//*  44   85:aload_3         
	//*  45   86:invokevirtual   #47  <Method void Parcel.recycle()>
	//*  46   89:aload           5
	//*  47   91:athrow          
			i = 0;
	//   48   92:iconst_0        
	//   49   93:istore_2        
		parcel.writeInt(i);
		mRemote.transact(27, parcel, parcel1, 0);
		parcel1.readException();
		i = parcel1.readInt();
		if(i != 0)
			flag = true;
		else
			flag = false;
		parcel1.recycle();
		parcel.recycle();
		return flag;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  50   94:goto            24
	}

	public boolean showCallScreen()
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(1, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:iconst_1        
	//   10   20:aload_3         
	//   11   21:aload           4
	//   12   23:iconst_0        
	//   13   24:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   29:pop             
		parcel1.readException();
	//   15   30:aload           4
	//   16   32:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   35:aload           4
	//   18   37:invokevirtual   #62  <Method int Parcel.readInt()>
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
	//   28   54:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   57:aload_3         
	//   30   58:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   31   61:iload_2         
	//   32   62:ireturn         
		Exception exception;
		exception;
	//   33   63:astore          5
		parcel1.recycle();
	//   34   65:aload           4
	//   35   67:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   70:aload_3         
	//   37   71:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   38   74:aload           5
	//   39   76:athrow          
	}

	public boolean showCallScreenWithDialpad(boolean flag)
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
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            92
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #75  <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #19  <Field IBinder mRemote>
	//*  17   33:bipush          40
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:iconst_0        
	//*  21   39:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   44:pop             
	//*  23   45:aload           4
	//*  24   47:invokevirtual   #44  <Method void Parcel.readException()>
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #62  <Method int Parcel.readInt()>
	//*  27   55:istore_2        
	//*  28   56:iload_2         
	//*  29   57:ifeq            65
	//*  30   60:iconst_1        
	//*  31   61:istore_1        
	//*  32   62:goto            67
	//*  33   65:iconst_0        
	//*  34   66:istore_1        
	//*  35   67:aload           4
	//*  36   69:invokevirtual   #47  <Method void Parcel.recycle()>
	//*  37   72:aload_3         
	//*  38   73:invokevirtual   #47  <Method void Parcel.recycle()>
	//*  39   76:iload_1         
	//*  40   77:ireturn         
	//*  41   78:astore          5
	//*  42   80:aload           4
	//*  43   82:invokevirtual   #47  <Method void Parcel.recycle()>
	//*  44   85:aload_3         
	//*  45   86:invokevirtual   #47  <Method void Parcel.recycle()>
	//*  46   89:aload           5
	//*  47   91:athrow          
			i = 0;
	//   48   92:iconst_0        
	//   49   93:istore_2        
		parcel.writeInt(i);
		mRemote.transact(40, parcel, parcel1, 0);
		parcel1.readException();
		i = parcel1.readInt();
		if(i != 0)
			flag = true;
		else
			flag = false;
		parcel1.recycle();
		parcel.recycle();
		return flag;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  50   94:goto            24
	}

	public void silenceRinger()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(32, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          32
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public boolean supplyPin(String s)
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
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4   10:aload           4
	//    5   12:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   14:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   17:aload           4
	//    8   19:aload_1         
	//    9   20:invokevirtual   #54  <Method void Parcel.writeString(String)>
		mRemote.transact(34, parcel, parcel1, 0);
	//   10   23:aload_0         
	//   11   24:getfield        #19  <Field IBinder mRemote>
	//   12   27:bipush          34
	//   13   29:aload           4
	//   14   31:aload           5
	//   15   33:iconst_0        
	//   16   34:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   39:pop             
		parcel1.readException();
	//   18   40:aload           5
	//   19   42:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   20   45:aload           5
	//   21   47:invokevirtual   #62  <Method int Parcel.readInt()>
	//   22   50:istore_2        
		boolean flag;
		if(i != 0)
	//*  23   51:iload_2         
	//*  24   52:ifeq            60
			flag = true;
	//   25   55:iconst_1        
	//   26   56:istore_3        
		else
	//*  27   57:goto            62
			flag = false;
	//   28   60:iconst_0        
	//   29   61:istore_3        
		parcel1.recycle();
	//   30   62:aload           5
	//   31   64:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   67:aload           4
	//   33   69:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   34   72:iload_3         
	//   35   73:ireturn         
		s;
	//   36   74:astore_1        
		parcel1.recycle();
	//   37   75:aload           5
	//   38   77:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   80:aload           4
	//   40   82:invokevirtual   #47  <Method void Parcel.recycle()>
		throw s;
	//   41   85:aload_1         
	//   42   86:athrow          
	}

	public boolean supplyPuk(String s, String s1)
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
		int i;
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4   10:aload           5
	//    5   12:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   14:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   17:aload           5
	//    8   19:aload_1         
	//    9   20:invokevirtual   #54  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   10   23:aload           5
	//   11   25:aload_2         
	//   12   26:invokevirtual   #54  <Method void Parcel.writeString(String)>
		mRemote.transact(13, parcel, parcel1, 0);
	//   13   29:aload_0         
	//   14   30:getfield        #19  <Field IBinder mRemote>
	//   15   33:bipush          13
	//   16   35:aload           5
	//   17   37:aload           6
	//   18   39:iconst_0        
	//   19   40:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   45:pop             
		parcel1.readException();
	//   21   46:aload           6
	//   22   48:invokevirtual   #44  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   23   51:aload           6
	//   24   53:invokevirtual   #62  <Method int Parcel.readInt()>
	//   25   56:istore_3        
		boolean flag;
		if(i != 0)
	//*  26   57:iload_3         
	//*  27   58:ifeq            67
			flag = true;
	//   28   61:iconst_1        
	//   29   62:istore          4
		else
	//*  30   64:goto            70
			flag = false;
	//   31   67:iconst_0        
	//   32   68:istore          4
		parcel1.recycle();
	//   33   70:aload           6
	//   34   72:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   75:aload           5
	//   36   77:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   37   80:iload           4
	//   38   82:ireturn         
		s;
	//   39   83:astore_1        
		parcel1.recycle();
	//   40   84:aload           6
	//   41   86:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   89:aload           5
	//   43   91:invokevirtual   #47  <Method void Parcel.recycle()>
		throw s;
	//   44   94:aload_1         
	//   45   95:athrow          
	}

	public void toggleRadioOnOff()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(12, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          12
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void updateServiceLocation()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(28, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          28
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	private IBinder mRemote;

	ITelephony$Stub$Proxy(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mRemote = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field IBinder mRemote>
	//    5    9:return          
	}
}
