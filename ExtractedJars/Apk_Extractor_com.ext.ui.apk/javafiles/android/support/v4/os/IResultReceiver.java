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
		//		               1: 46
		//		               1598968902: 38
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//    2   28:aload_0         
		//    3   29:iload_1         
		//    4   30:aload_2         
		//    5   31:aload_3         
		//    6   32:iload           4
		//    7   34:invokespecial   #45  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//    8   37:ireturn         

			case 1598968902: 
				parcel1.writeString("android.support.v4.os.IResultReceiver");
		//    9   38:aload_3         
		//   10   39:ldc1            #14  <String "android.support.v4.os.IResultReceiver">
		//   11   41:invokevirtual   #51  <Method void Parcel.writeString(String)>
				return true;
		//   12   44:iconst_1        
		//   13   45:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("android.support.v4.os.IResultReceiver");
		//   14   46:aload_2         
		//   15   47:ldc1            #14  <String "android.support.v4.os.IResultReceiver">
		//   16   49:invokevirtual   #54  <Method void Parcel.enforceInterface(String)>
				i = parcel.readInt();
		//   17   52:aload_2         
		//   18   53:invokevirtual   #58  <Method int Parcel.readInt()>
		//   19   56:istore_1        
				break;
			}
			if(parcel.readInt() != 0)
		//*  20   57:aload_2         
		//*  21   58:invokevirtual   #58  <Method int Parcel.readInt()>
		//*  22   61:ifeq            85
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   23   64:getstatic       #64  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   24   67:aload_2         
		//   25   68:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   26   73:checkcast       #60  <Class Bundle>
		//   27   76:astore_2        
			else
		//*  28   77:aload_0         
		//*  29   78:iload_1         
		//*  30   79:aload_2         
		//*  31   80:invokevirtual   #74  <Method void send(int, Bundle)>
		//*  32   83:iconst_1        
		//*  33   84:ireturn         
				parcel = null;
		//   34   85:aconst_null     
		//   35   86:astore_2        
			send(i, ((Bundle) (parcel)));
			return true;
		//*  36   87:goto            77
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

	private static class Stub.Proxy
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
				break MISSING_BLOCK_LABEL_49;
		//    8   15:aload_2         
		//    9   16:ifnull          49
			parcel.writeInt(1);
		//   10   19:aload_3         
		//   11   20:iconst_1        
		//   12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokevirtual   #50  <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(1, parcel, ((Parcel) (null)), 1);
		//   17   30:aload_0         
		//   18   31:getfield        #19  <Field IBinder mRemote>
		//   19   34:iconst_1        
		//   20   35:aload_3         
		//   21   36:aconst_null     
		//   22   37:iconst_1        
		//   23   38:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   24   43:pop             
			parcel.recycle();
		//   25   44:aload_3         
		//   26   45:invokevirtual   #59  <Method void Parcel.recycle()>
			return;
		//   27   48:return          
			parcel.writeInt(0);
		//   28   49:aload_3         
		//   29   50:iconst_0        
		//   30   51:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  31   54:goto            30
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
