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
		//    5    7:ldc1            #16  <String "android.support.v4.os.IResultReceiver">
		//    6    9:invokeinterface #29  <Method IInterface IBinder.queryLocalInterface(String)>
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
		//   19   36:invokespecial   #32  <Method void IResultReceiver$Stub$Proxy(IBinder)>
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
			if(i != 1)
		//*   0    0:iload_1         
		//*   1    1:iconst_1        
		//*   2    2:icmpeq          29
				if(i != 0x5f4e5446)
		//*   3    5:iload_1         
		//*   4    6:ldc1            #39  <Int 0x5f4e5446>
		//*   5    8:icmpeq          21
				{
					return super.onTransact(i, parcel, parcel1, j);
		//    6   11:aload_0         
		//    7   12:iload_1         
		//    8   13:aload_2         
		//    9   14:aload_3         
		//   10   15:iload           4
		//   11   17:invokespecial   #41  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   12   20:ireturn         
				} else
				{
					parcel1.writeString("android.support.v4.os.IResultReceiver");
		//   13   21:aload_3         
		//   14   22:ldc1            #16  <String "android.support.v4.os.IResultReceiver">
		//   15   24:invokevirtual   #47  <Method void Parcel.writeString(String)>
					return true;
		//   16   27:iconst_1        
		//   17   28:ireturn         
				}
			parcel.enforceInterface("android.support.v4.os.IResultReceiver");
		//   18   29:aload_2         
		//   19   30:ldc1            #16  <String "android.support.v4.os.IResultReceiver">
		//   20   32:invokevirtual   #50  <Method void Parcel.enforceInterface(String)>
			i = parcel.readInt();
		//   21   35:aload_2         
		//   22   36:invokevirtual   #54  <Method int Parcel.readInt()>
		//   23   39:istore_1        
			if(parcel.readInt() != 0)
		//*  24   40:aload_2         
		//*  25   41:invokevirtual   #54  <Method int Parcel.readInt()>
		//*  26   44:ifeq            63
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   27   47:getstatic       #60  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   28   50:aload_2         
		//   29   51:invokeinterface #66  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   30   56:checkcast       #56  <Class Bundle>
		//   31   59:astore_2        
			else
		//*  32   60:goto            65
				parcel = null;
		//   33   63:aconst_null     
		//   34   64:astore_2        
			send(i, ((Bundle) (parcel)));
		//   35   65:aload_0         
		//   36   66:iload_1         
		//   37   67:aload_2         
		//   38   68:invokevirtual   #70  <Method void send(int, Bundle)>
			return true;
		//   39   71:iconst_1        
		//   40   72:ireturn         
		}

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Binder()>
			attachInterface(((IInterface) (this)), "android.support.v4.os.IResultReceiver");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #16  <String "android.support.v4.os.IResultReceiver">
		//    5    8:invokevirtual   #20  <Method void attachInterface(IInterface, String)>
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

		public void send(int i, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel.writeInterfaceToken("android.support.v4.os.IResultReceiver");
		//    2    4:aload_3         
		//    3    5:ldc1            #34  <String "android.support.v4.os.IResultReceiver">
		//    4    7:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    5   10:aload_3         
		//    6   11:iload_1         
		//    7   12:invokevirtual   #42  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_33;
		//    8   15:aload_2         
		//    9   16:ifnull          33
			parcel.writeInt(1);
		//   10   19:aload_3         
		//   11   20:iconst_1        
		//   12   21:invokevirtual   #42  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokevirtual   #48  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   17   30:goto            38
			parcel.writeInt(0);
		//   18   33:aload_3         
		//   19   34:iconst_0        
		//   20   35:invokevirtual   #42  <Method void Parcel.writeInt(int)>
			mRemote.transact(1, parcel, ((Parcel) (null)), 1);
		//   21   38:aload_0         
		//   22   39:getfield        #19  <Field IBinder mRemote>
		//   23   42:iconst_1        
		//   24   43:aload_3         
		//   25   44:aconst_null     
		//   26   45:iconst_1        
		//   27   46:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   28   51:pop             
			parcel.recycle();
		//   29   52:aload_3         
		//   30   53:invokevirtual   #57  <Method void Parcel.recycle()>
			return;
		//   31   56:return          
			bundle;
		//   32   57:astore_2        
			parcel.recycle();
		//   33   58:aload_3         
		//   34   59:invokevirtual   #57  <Method void Parcel.recycle()>
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
