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
		//		               1: 55
		//		               2: 113
		//		               3: 137
		//		               1598968902: 47
		//*   2   44:goto            153
			case 1598968902: 
				parcel1.writeString("android.support.v4.app.INotificationSideChannel");
		//    3   47:aload_3         
		//    4   48:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//    5   50:invokevirtual   #53  <Method void Parcel.writeString(String)>
				return true;
		//    6   53:iconst_1        
		//    7   54:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
		//    8   55:aload_2         
		//    9   56:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   10   58:invokevirtual   #56  <Method void Parcel.enforceInterface(String)>
				parcel1 = ((Parcel) (parcel.readString()));
		//   11   61:aload_2         
		//   12   62:invokevirtual   #60  <Method String Parcel.readString()>
		//   13   65:astore_3        
				i = parcel.readInt();
		//   14   66:aload_2         
		//   15   67:invokevirtual   #64  <Method int Parcel.readInt()>
		//   16   70:istore_1        
				String s = parcel.readString();
		//   17   71:aload_2         
		//   18   72:invokevirtual   #60  <Method String Parcel.readString()>
		//   19   75:astore          5
				if(parcel.readInt() != 0)
		//*  20   77:aload_2         
		//*  21   78:invokevirtual   #64  <Method int Parcel.readInt()>
		//*  22   81:ifeq            100
					parcel = ((Parcel) ((Notification)Notification.CREATOR.createFromParcel(parcel)));
		//   23   84:getstatic       #70  <Field android.os.Parcelable$Creator Notification.CREATOR>
		//   24   87:aload_2         
		//   25   88:invokeinterface #76  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   26   93:checkcast       #66  <Class Notification>
		//   27   96:astore_2        
				else
		//*  28   97:goto            102
					parcel = null;
		//   29  100:aconst_null     
		//   30  101:astore_2        
				notify(((String) (parcel1)), i, s, ((Notification) (parcel)));
		//   31  102:aload_0         
		//   32  103:aload_3         
		//   33  104:iload_1         
		//   34  105:aload           5
		//   35  107:aload_2         
		//   36  108:invokevirtual   #80  <Method void notify(String, int, String, Notification)>
				return true;
		//   37  111:iconst_1        
		//   38  112:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
		//   39  113:aload_2         
		//   40  114:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   41  116:invokevirtual   #56  <Method void Parcel.enforceInterface(String)>
				cancel(parcel.readString(), parcel.readInt(), parcel.readString());
		//   42  119:aload_0         
		//   43  120:aload_2         
		//   44  121:invokevirtual   #60  <Method String Parcel.readString()>
		//   45  124:aload_2         
		//   46  125:invokevirtual   #64  <Method int Parcel.readInt()>
		//   47  128:aload_2         
		//   48  129:invokevirtual   #60  <Method String Parcel.readString()>
		//   49  132:invokevirtual   #84  <Method void cancel(String, int, String)>
				return true;
		//   50  135:iconst_1        
		//   51  136:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
		//   52  137:aload_2         
		//   53  138:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   54  140:invokevirtual   #56  <Method void Parcel.enforceInterface(String)>
				cancelAll(parcel.readString());
		//   55  143:aload_0         
		//   56  144:aload_2         
		//   57  145:invokevirtual   #60  <Method String Parcel.readString()>
		//   58  148:invokevirtual   #87  <Method void cancelAll(String)>
				return true;
		//   59  151:iconst_1        
		//   60  152:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   61  153:aload_0         
		//   62  154:iload_1         
		//   63  155:aload_2         
		//   64  156:aload_3         
		//   65  157:iload           4
		//   66  159:invokespecial   #89  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   67  162:ireturn         
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

	static class Stub.Proxy
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
