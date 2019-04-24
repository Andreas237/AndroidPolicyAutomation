// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.*;

public interface IResultReceiver
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements IResultReceiver
	{

		public static IResultReceiver asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "android.support.v4.os.IResultReceiver">
		//    6    9:invokeinterface #34  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IResultReceiver))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IResultReceiver>
		//*  12   23:ifeq            31
				return (IResultReceiver)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IResultReceiver>
		//   15   30:areturn         
			else
				return ((IResultReceiver) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class IResultReceiver$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #37  <Method void IResultReceiver$Stub$Proxy(IBinder)>
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
		//*   1    1:lookupswitch    2: default 28
		//		               1: 39
		//		               1598968902: 31
		//*   2   28:goto            83
			case 1598968902: 
				parcel1.writeString("android.support.v4.os.IResultReceiver");
		//    3   31:aload_3         
		//    4   32:ldc1            #14  <String "android.support.v4.os.IResultReceiver">
		//    5   34:invokevirtual   #49  <Method void Parcel.writeString(String)>
				return true;
		//    6   37:iconst_1        
		//    7   38:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("android.support.v4.os.IResultReceiver");
		//    8   39:aload_2         
		//    9   40:ldc1            #14  <String "android.support.v4.os.IResultReceiver">
		//   10   42:invokevirtual   #52  <Method void Parcel.enforceInterface(String)>
				i = parcel.readInt();
		//   11   45:aload_2         
		//   12   46:invokevirtual   #56  <Method int Parcel.readInt()>
		//   13   49:istore_1        
				if(parcel.readInt() != 0)
		//*  14   50:aload_2         
		//*  15   51:invokevirtual   #56  <Method int Parcel.readInt()>
		//*  16   54:ifeq            73
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   17   57:getstatic       #62  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   18   60:aload_2         
		//   19   61:invokeinterface #68  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   20   66:checkcast       #58  <Class Bundle>
		//   21   69:astore_2        
				else
		//*  22   70:goto            75
					parcel = null;
		//   23   73:aconst_null     
		//   24   74:astore_2        
				send(i, ((Bundle) (parcel)));
		//   25   75:aload_0         
		//   26   76:iload_1         
		//   27   77:aload_2         
		//   28   78:invokevirtual   #72  <Method void send(int, Bundle)>
				return true;
		//   29   81:iconst_1        
		//   30   82:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   31   83:aload_0         
		//   32   84:iload_1         
		//   33   85:aload_2         
		//   34   86:aload_3         
		//   35   87:iload           4
		//   36   89:invokespecial   #74  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   37   92:ireturn         
		}

		private static final String DESCRIPTOR = "android.support.v4.os.IResultReceiver";
		static final int TRANSACTION_send = 1;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Binder()>
			attachInterface(((IInterface) (this)), "android.support.v4.os.IResultReceiver");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "android.support.v4.os.IResultReceiver">
		//    5    8:invokevirtual   #25  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static class Stub.Proxy
		implements IResultReceiver
	{

		public IBinder asBinder()
		{
			return mRemote;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder mRemote>
		//    2    4:areturn         
		}

		public String getInterfaceDescriptor()
		{
			return "android.support.v4.os.IResultReceiver";
		//    0    0:ldc1            #26  <String "android.support.v4.os.IResultReceiver">
		//    1    2:areturn         
		}

		public void send(int i, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel.writeInterfaceToken("android.support.v4.os.IResultReceiver");
		//    2    4:aload_3         
		//    3    5:ldc1            #26  <String "android.support.v4.os.IResultReceiver">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    5   10:aload_3         
		//    6   11:iload_1         
		//    7   12:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_33;
		//    8   15:aload_2         
		//    9   16:ifnull          33
			parcel.writeInt(1);
		//   10   19:aload_3         
		//   11   20:iconst_1        
		//   12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokevirtual   #50  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   17   30:goto            38
			parcel.writeInt(0);
		//   18   33:aload_3         
		//   19   34:iconst_0        
		//   20   35:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(1, parcel, ((Parcel) (null)), 1);
		//   21   38:aload_0         
		//   22   39:getfield        #19  <Field IBinder mRemote>
		//   23   42:iconst_1        
		//   24   43:aload_3         
		//   25   44:aconst_null     
		//   26   45:iconst_1        
		//   27   46:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   28   51:pop             
			parcel.recycle();
		//   29   52:aload_3         
		//   30   53:invokevirtual   #59  <Method void Parcel.recycle()>
			return;
		//   31   56:return          
			bundle;
		//   32   57:astore_2        
			parcel.recycle();
		//   33   58:aload_3         
		//   34   59:invokevirtual   #59  <Method void Parcel.recycle()>
			throw bundle;
		//   35   62:aload_2         
		//   36   63:athrow          
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


	public abstract void send(int i, Bundle bundle)
		throws RemoteException;
}
