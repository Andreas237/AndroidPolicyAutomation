// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.*;

// Referenced classes of package android.support.v4.app:
//			INotificationSideChannel

private static class INotificationSideChannel$Stub$Proxy
	implements INotificationSideChannel
{

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public void cancel(String s, int i, String s1)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
	//    2    5:aload           4
	//    3    7:ldc1            #34  <String "android.support.v4.app.INotificationSideChannel">
	//    4    9:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    5   12:aload           4
	//    6   14:aload_1         
	//    7   15:invokevirtual   #41  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//    8   18:aload           4
	//    9   20:iload_2         
	//   10   21:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		parcel.writeString(s1);
	//   11   24:aload           4
	//   12   26:aload_3         
	//   13   27:invokevirtual   #41  <Method void Parcel.writeString(String)>
		mRemote.transact(2, parcel, ((Parcel) (null)), 1);
	//   14   30:aload_0         
	//   15   31:getfield        #19  <Field IBinder mRemote>
	//   16   34:iconst_2        
	//   17   35:aload           4
	//   18   37:aconst_null     
	//   19   38:iconst_1        
	//   20   39:invokeinterface #51  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   21   44:pop             
		parcel.recycle();
	//   22   45:aload           4
	//   23   47:invokevirtual   #54  <Method void Parcel.recycle()>
		return;
	//   24   50:return          
		s;
	//   25   51:astore_1        
		parcel.recycle();
	//   26   52:aload           4
	//   27   54:invokevirtual   #54  <Method void Parcel.recycle()>
		throw s;
	//   28   57:aload_1         
	//   29   58:athrow          
	}

	public void cancelAll(String s)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
	//    2    4:aload_2         
	//    3    5:ldc1            #34  <String "android.support.v4.app.INotificationSideChannel">
	//    4    7:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #41  <Method void Parcel.writeString(String)>
		mRemote.transact(3, parcel, ((Parcel) (null)), 1);
	//    8   15:aload_0         
	//    9   16:getfield        #19  <Field IBinder mRemote>
	//   10   19:iconst_3        
	//   11   20:aload_2         
	//   12   21:aconst_null     
	//   13   22:iconst_1        
	//   14   23:invokeinterface #51  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   15   28:pop             
		parcel.recycle();
	//   16   29:aload_2         
	//   17   30:invokevirtual   #54  <Method void Parcel.recycle()>
		return;
	//   18   33:return          
		s;
	//   19   34:astore_1        
		parcel.recycle();
	//   20   35:aload_2         
	//   21   36:invokevirtual   #54  <Method void Parcel.recycle()>
		throw s;
	//   22   39:aload_1         
	//   23   40:athrow          
	}

	public String getInterfaceDescriptor()
	{
		return "android.support.v4.app.INotificationSideChannel";
	//    0    0:ldc1            #34  <String "android.support.v4.app.INotificationSideChannel">
	//    1    2:areturn         
	}

	public void notify(String s, int i, String s1, Notification notification)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          5
		parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
	//    2    5:aload           5
	//    3    7:ldc1            #34  <String "android.support.v4.app.INotificationSideChannel">
	//    4    9:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    5   12:aload           5
	//    6   14:aload_1         
	//    7   15:invokevirtual   #41  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//    8   18:aload           5
	//    9   20:iload_2         
	//   10   21:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		parcel.writeString(s1);
	//   11   24:aload           5
	//   12   26:aload_3         
	//   13   27:invokevirtual   #41  <Method void Parcel.writeString(String)>
		if(notification == null)
			break MISSING_BLOCK_LABEL_52;
	//   14   30:aload           4
	//   15   32:ifnull          52
		parcel.writeInt(1);
	//   16   35:aload           5
	//   17   37:iconst_1        
	//   18   38:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		notification.writeToParcel(parcel, 0);
	//   19   41:aload           4
	//   20   43:aload           5
	//   21   45:iconst_0        
	//   22   46:invokevirtual   #66  <Method void Notification.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_58;
	//   23   49:goto            58
		parcel.writeInt(0);
	//   24   52:aload           5
	//   25   54:iconst_0        
	//   26   55:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		mRemote.transact(1, parcel, ((Parcel) (null)), 1);
	//   27   58:aload_0         
	//   28   59:getfield        #19  <Field IBinder mRemote>
	//   29   62:iconst_1        
	//   30   63:aload           5
	//   31   65:aconst_null     
	//   32   66:iconst_1        
	//   33   67:invokeinterface #51  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   34   72:pop             
		parcel.recycle();
	//   35   73:aload           5
	//   36   75:invokevirtual   #54  <Method void Parcel.recycle()>
		return;
	//   37   78:return          
		s;
	//   38   79:astore_1        
		parcel.recycle();
	//   39   80:aload           5
	//   40   82:invokevirtual   #54  <Method void Parcel.recycle()>
		throw s;
	//   41   85:aload_1         
	//   42   86:athrow          
	}

	private IBinder mRemote;

	INotificationSideChannel$Stub$Proxy(IBinder ibinder)
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
