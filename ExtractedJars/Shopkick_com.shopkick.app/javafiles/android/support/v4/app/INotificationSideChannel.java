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
			if(i != 0x5f4e5446)
		//*   0    0:iload_1         
		//*   1    1:ldc1            #48  <Int 0x5f4e5446>
		//*   2    3:icmpeq          140
			{
				String s;
				switch(i)
		//*   3    6:iload_1         
				{
		//*   4    7:tableswitch     1 3: default 32
		//		               1 82
		//		               2 58
		//		               3 42
				default:
					return super.onTransact(i, parcel, parcel1, j);
		//    5   32:aload_0         
		//    6   33:iload_1         
		//    7   34:aload_2         
		//    8   35:aload_3         
		//    9   36:iload           4
		//   10   38:invokespecial   #50  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   11   41:ireturn         

				case 3: // '\003'
					parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
		//   12   42:aload_2         
		//   13   43:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   14   45:invokevirtual   #56  <Method void Parcel.enforceInterface(String)>
					cancelAll(parcel.readString());
		//   15   48:aload_0         
		//   16   49:aload_2         
		//   17   50:invokevirtual   #60  <Method String Parcel.readString()>
		//   18   53:invokevirtual   #63  <Method void cancelAll(String)>
					return true;
		//   19   56:iconst_1        
		//   20   57:ireturn         

				case 2: // '\002'
					parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
		//   21   58:aload_2         
		//   22   59:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   23   61:invokevirtual   #56  <Method void Parcel.enforceInterface(String)>
					cancel(parcel.readString(), parcel.readInt(), parcel.readString());
		//   24   64:aload_0         
		//   25   65:aload_2         
		//   26   66:invokevirtual   #60  <Method String Parcel.readString()>
		//   27   69:aload_2         
		//   28   70:invokevirtual   #67  <Method int Parcel.readInt()>
		//   29   73:aload_2         
		//   30   74:invokevirtual   #60  <Method String Parcel.readString()>
		//   31   77:invokevirtual   #71  <Method void cancel(String, int, String)>
					return true;
		//   32   80:iconst_1        
		//   33   81:ireturn         

				case 1: // '\001'
					parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
		//   34   82:aload_2         
		//   35   83:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   36   85:invokevirtual   #56  <Method void Parcel.enforceInterface(String)>
					parcel1 = ((Parcel) (parcel.readString()));
		//   37   88:aload_2         
		//   38   89:invokevirtual   #60  <Method String Parcel.readString()>
		//   39   92:astore_3        
					i = parcel.readInt();
		//   40   93:aload_2         
		//   41   94:invokevirtual   #67  <Method int Parcel.readInt()>
		//   42   97:istore_1        
					s = parcel.readString();
		//   43   98:aload_2         
		//   44   99:invokevirtual   #60  <Method String Parcel.readString()>
		//   45  102:astore          5
					break;
				}
				if(parcel.readInt() != 0)
		//*  46  104:aload_2         
		//*  47  105:invokevirtual   #67  <Method int Parcel.readInt()>
		//*  48  108:ifeq            127
					parcel = ((Parcel) ((Notification)Notification.CREATOR.createFromParcel(parcel)));
		//   49  111:getstatic       #77  <Field android.os.Parcelable$Creator Notification.CREATOR>
		//   50  114:aload_2         
		//   51  115:invokeinterface #83  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   52  120:checkcast       #73  <Class Notification>
		//   53  123:astore_2        
				else
		//*  54  124:goto            129
					parcel = null;
		//   55  127:aconst_null     
		//   56  128:astore_2        
				notify(((String) (parcel1)), i, s, ((Notification) (parcel)));
		//   57  129:aload_0         
		//   58  130:aload_3         
		//   59  131:iload_1         
		//   60  132:aload           5
		//   61  134:aload_2         
		//   62  135:invokevirtual   #87  <Method void notify(String, int, String, Notification)>
				return true;
		//   63  138:iconst_1        
		//   64  139:ireturn         
			} else
			{
				parcel1.writeString("android.support.v4.app.INotificationSideChannel");
		//   65  140:aload_3         
		//   66  141:ldc1            #14  <String "android.support.v4.app.INotificationSideChannel">
		//   67  143:invokevirtual   #90  <Method void Parcel.writeString(String)>
				return true;
		//   68  146:iconst_1        
		//   69  147:ireturn         
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
