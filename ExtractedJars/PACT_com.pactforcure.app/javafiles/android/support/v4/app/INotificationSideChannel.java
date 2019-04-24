// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.*;

public interface INotificationSideChannel
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements INotificationSideChannel
	{

		public static INotificationSideChannel asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//    6    9:invokeinterface #38  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof INotificationSideChannel))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class INotificationSideChannel>
		//*  12   23:ifeq            31
				return (INotificationSideChannel)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class INotificationSideChannel>
		//   15   30:areturn         
			else
				return ((INotificationSideChannel) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class INotificationSideChannel$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #41  <Method void INotificationSideChannel$Stub$Proxy(IBinder)>
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
		//		               1: 62
		//		               2: 120
		//		               3: 144
		//		               1598968902: 54
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//    2   44:aload_0         
		//    3   45:iload_1         
		//    4   46:aload_2         
		//    5   47:aload_3         
		//    6   48:iload           4
		//    7   50:invokespecial   #49  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//    8   53:ireturn         

			case 1598968902: 
				parcel1.writeString("android.support.v4.app.INotificationSideChannel");
		//    9   54:aload_3         
		//   10   55:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   11   57:invokevirtual   #55  <Method void Parcel.writeString(String)>
				return true;
		//   12   60:iconst_1        
		//   13   61:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
		//   14   62:aload_2         
		//   15   63:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   16   65:invokevirtual   #58  <Method void Parcel.enforceInterface(String)>
				parcel1 = ((Parcel) (parcel.readString()));
		//   17   68:aload_2         
		//   18   69:invokevirtual   #62  <Method String Parcel.readString()>
		//   19   72:astore_3        
				i = parcel.readInt();
		//   20   73:aload_2         
		//   21   74:invokevirtual   #66  <Method int Parcel.readInt()>
		//   22   77:istore_1        
				String s = parcel.readString();
		//   23   78:aload_2         
		//   24   79:invokevirtual   #62  <Method String Parcel.readString()>
		//   25   82:astore          5
				if(parcel.readInt() != 0)
		//*  26   84:aload_2         
		//*  27   85:invokevirtual   #66  <Method int Parcel.readInt()>
		//*  28   88:ifeq            115
					parcel = ((Parcel) ((Notification)Notification.CREATOR.createFromParcel(parcel)));
		//   29   91:getstatic       #72  <Field android.os.Parcelable$Creator Notification.CREATOR>
		//   30   94:aload_2         
		//   31   95:invokeinterface #78  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   32  100:checkcast       #68  <Class Notification>
		//   33  103:astore_2        
				else
		//*  34  104:aload_0         
		//*  35  105:aload_3         
		//*  36  106:iload_1         
		//*  37  107:aload           5
		//*  38  109:aload_2         
		//*  39  110:invokevirtual   #82  <Method void notify(String, int, String, Notification)>
		//*  40  113:iconst_1        
		//*  41  114:ireturn         
					parcel = null;
		//   42  115:aconst_null     
		//   43  116:astore_2        
				notify(((String) (parcel1)), i, s, ((Notification) (parcel)));
				return true;

		//*  44  117:goto            104
			case 2: // '\002'
				parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
		//   45  120:aload_2         
		//   46  121:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   47  123:invokevirtual   #58  <Method void Parcel.enforceInterface(String)>
				cancel(parcel.readString(), parcel.readInt(), parcel.readString());
		//   48  126:aload_0         
		//   49  127:aload_2         
		//   50  128:invokevirtual   #62  <Method String Parcel.readString()>
		//   51  131:aload_2         
		//   52  132:invokevirtual   #66  <Method int Parcel.readInt()>
		//   53  135:aload_2         
		//   54  136:invokevirtual   #62  <Method String Parcel.readString()>
		//   55  139:invokevirtual   #86  <Method void cancel(String, int, String)>
				return true;
		//   56  142:iconst_1        
		//   57  143:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
		//   58  144:aload_2         
		//   59  145:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   60  147:invokevirtual   #58  <Method void Parcel.enforceInterface(String)>
				cancelAll(parcel.readString());
		//   61  150:aload_0         
		//   62  151:aload_2         
		//   63  152:invokevirtual   #62  <Method String Parcel.readString()>
		//   64  155:invokevirtual   #89  <Method void cancelAll(String)>
				return true;
		//   65  158:iconst_1        
		//   66  159:ireturn         
			}
		}

		private static final String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";
		static final int TRANSACTION_cancel = 2;
		static final int TRANSACTION_cancelAll = 3;
		static final int TRANSACTION_notify = 1;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Binder()>
			attachInterface(((IInterface) (this)), "android.support.v4.app.INotificationSideChannel");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//    5    8:invokevirtual   #29  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	private static class Stub.Proxy
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
				break MISSING_BLOCK_LABEL_70;
		//   14   30:aload           4
		//   15   32:ifnull          70
			parcel.writeInt(1);
		//   16   35:aload           5
		//   17   37:iconst_1        
		//   18   38:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			notification.writeToParcel(parcel, 0);
		//   19   41:aload           4
		//   20   43:aload           5
		//   21   45:iconst_0        
		//   22   46:invokevirtual   #66  <Method void Notification.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(1, parcel, ((Parcel) (null)), 1);
		//   23   49:aload_0         
		//   24   50:getfield        #19  <Field IBinder mRemote>
		//   25   53:iconst_1        
		//   26   54:aload           5
		//   27   56:aconst_null     
		//   28   57:iconst_1        
		//   29   58:invokeinterface #51  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   63:pop             
			parcel.recycle();
		//   31   64:aload           5
		//   32   66:invokevirtual   #54  <Method void Parcel.recycle()>
			return;
		//   33   69:return          
			parcel.writeInt(0);
		//   34   70:aload           5
		//   35   72:iconst_0        
		//   36   73:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  37   76:goto            49
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

		Stub.Proxy(IBinder ibinder)
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


	public abstract void cancel(String s, int i, String s1)
		throws RemoteException;

	public abstract void cancelAll(String s)
		throws RemoteException;

	public abstract void notify(String s, int i, String s1, Notification notification)
		throws RemoteException;
}
