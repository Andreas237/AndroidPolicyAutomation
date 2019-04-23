// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			IJobCallback

public interface IRemoteJobService
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements IRemoteJobService
	{

		public static IRemoteJobService asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.firebase.jobdispatcher.IRemoteJobService");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.firebase.jobdispatcher.IRemoteJobService">
		//    6    9:invokeinterface #36  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IRemoteJobService))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IRemoteJobService>
		//*  12   23:ifeq            31
				return (IRemoteJobService)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IRemoteJobService>
		//   15   30:areturn         
			else
				return ((IRemoteJobService) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class IRemoteJobService$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #39  <Method void IRemoteJobService$Stub$Proxy(IBinder)>
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
		//*   1    1:ldc1            #46  <Int 0x5f4e5446>
		//*   2    3:icmpeq          143
			{
				Object obj1 = null;
		//    3    6:aconst_null     
		//    4    7:astore          7
				Object obj = null;
		//    5    9:aconst_null     
		//    6   10:astore          6
				switch(i)
		//*   7   12:iload_1         
				{
		//*   8   13:tableswitch     1 2: default 36
		//		               1 100
		//		               2 46
				default:
					return super.onTransact(i, parcel, parcel1, j);
		//    9   36:aload_0         
		//   10   37:iload_1         
		//   11   38:aload_2         
		//   12   39:aload_3         
		//   13   40:iload           4
		//   14   42:invokespecial   #48  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   15   45:ireturn         

				case 2: // '\002'
					parcel.enforceInterface("com.firebase.jobdispatcher.IRemoteJobService");
		//   16   46:aload_2         
		//   17   47:ldc1            #14  <String "com.firebase.jobdispatcher.IRemoteJobService">
		//   18   49:invokevirtual   #54  <Method void Parcel.enforceInterface(String)>
					parcel1 = ((Parcel) (obj));
		//   19   52:aload           6
		//   20   54:astore_3        
					if(parcel.readInt() != 0)
		//*  21   55:aload_2         
		//*  22   56:invokevirtual   #58  <Method int Parcel.readInt()>
		//*  23   59:ifeq            75
						parcel1 = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   24   62:getstatic       #64  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   25   65:aload_2         
		//   26   66:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   27   71:checkcast       #60  <Class Bundle>
		//   28   74:astore_3        
					boolean flag;
					if(parcel.readInt() != 0)
		//*  29   75:aload_2         
		//*  30   76:invokevirtual   #58  <Method int Parcel.readInt()>
		//*  31   79:ifeq            88
						flag = true;
		//   32   82:iconst_1        
		//   33   83:istore          5
					else
		//*  34   85:goto            91
						flag = false;
		//   35   88:iconst_0        
		//   36   89:istore          5
					stop(((Bundle) (parcel1)), flag);
		//   37   91:aload_0         
		//   38   92:aload_3         
		//   39   93:iload           5
		//   40   95:invokevirtual   #74  <Method void stop(Bundle, boolean)>
					return true;
		//   41   98:iconst_1        
		//   42   99:ireturn         

				case 1: // '\001'
					parcel.enforceInterface("com.firebase.jobdispatcher.IRemoteJobService");
		//   43  100:aload_2         
		//   44  101:ldc1            #14  <String "com.firebase.jobdispatcher.IRemoteJobService">
		//   45  103:invokevirtual   #54  <Method void Parcel.enforceInterface(String)>
					parcel1 = ((Parcel) (obj1));
		//   46  106:aload           7
		//   47  108:astore_3        
					break;
				}
				if(parcel.readInt() != 0)
		//*  48  109:aload_2         
		//*  49  110:invokevirtual   #58  <Method int Parcel.readInt()>
		//*  50  113:ifeq            129
					parcel1 = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   51  116:getstatic       #64  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   52  119:aload_2         
		//   53  120:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   54  125:checkcast       #60  <Class Bundle>
		//   55  128:astore_3        
				start(((Bundle) (parcel1)), IJobCallback.Stub.asInterface(parcel.readStrongBinder()));
		//   56  129:aload_0         
		//   57  130:aload_3         
		//   58  131:aload_2         
		//   59  132:invokevirtual   #77  <Method IBinder Parcel.readStrongBinder()>
		//   60  135:invokestatic    #82  <Method IJobCallback IJobCallback$Stub.asInterface(IBinder)>
		//   61  138:invokevirtual   #86  <Method void start(Bundle, IJobCallback)>
				return true;
		//   62  141:iconst_1        
		//   63  142:ireturn         
			} else
			{
				parcel1.writeString("com.firebase.jobdispatcher.IRemoteJobService");
		//   64  143:aload_3         
		//   65  144:ldc1            #14  <String "com.firebase.jobdispatcher.IRemoteJobService">
		//   66  146:invokevirtual   #89  <Method void Parcel.writeString(String)>
				return true;
		//   67  149:iconst_1        
		//   68  150:ireturn         
			}
		}

		private static final String DESCRIPTOR = "com.firebase.jobdispatcher.IRemoteJobService";
		static final int TRANSACTION_start = 1;
		static final int TRANSACTION_stop = 2;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.firebase.jobdispatcher.IRemoteJobService");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "com.firebase.jobdispatcher.IRemoteJobService">
		//    5    8:invokevirtual   #27  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	private static class Stub.Proxy
		implements IRemoteJobService
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
			return "com.firebase.jobdispatcher.IRemoteJobService";
		//    0    0:ldc1            #26  <String "com.firebase.jobdispatcher.IRemoteJobService">
		//    1    2:areturn         
		}

		public void start(Bundle bundle, IJobCallback ijobcallback)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
		//    2    4:aload_3         
		//    3    5:ldc1            #26  <String "com.firebase.jobdispatcher.IRemoteJobService">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_28;
		//    5   10:aload_1         
		//    6   11:ifnull          28
			parcel.writeInt(1);
		//    7   14:aload_3         
		//    8   15:iconst_1        
		//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_3         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #50  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_3         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			if(ijobcallback == null) goto _L2; else goto _L1
		//   18   33:aload_2         
		//   19   34:ifnull          78
_L1:
			bundle = ((Bundle) (ijobcallback.asBinder()));
		//   20   37:aload_2         
		//   21   38:invokeinterface #54  <Method IBinder IJobCallback.asBinder()>
		//   22   43:astore_1        
		//*  23   44:goto            47
_L4:
			parcel.writeStrongBinder(((IBinder) (bundle)));
		//   24   47:aload_3         
		//   25   48:aload_1         
		//   26   49:invokevirtual   #57  <Method void Parcel.writeStrongBinder(IBinder)>
			mRemote.transact(1, parcel, ((Parcel) (null)), 1);
		//   27   52:aload_0         
		//   28   53:getfield        #19  <Field IBinder mRemote>
		//   29   56:iconst_1        
		//   30   57:aload_3         
		//   31   58:aconst_null     
		//   32   59:iconst_1        
		//   33   60:invokeinterface #63  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   34   65:pop             
			parcel.recycle();
		//   35   66:aload_3         
		//   36   67:invokevirtual   #66  <Method void Parcel.recycle()>
			return;
		//   37   70:return          
			bundle;
		//   38   71:astore_1        
			parcel.recycle();
		//   39   72:aload_3         
		//   40   73:invokevirtual   #66  <Method void Parcel.recycle()>
			throw bundle;
		//   41   76:aload_1         
		//   42   77:athrow          
_L2:
			bundle = null;
		//   43   78:aconst_null     
		//   44   79:astore_1        
			if(true) goto _L4; else goto _L3
		//   45   80:goto            47
_L3:
		}

		public void stop(Bundle bundle, boolean flag)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
		//    2    5:aload           4
		//    3    7:ldc1            #26  <String "com.firebase.jobdispatcher.IRemoteJobService">
		//    4    9:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			int i = 0;
		//    5   12:iconst_0        
		//    6   13:istore_3        
			if(bundle == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          34
_L1:
			parcel.writeInt(1);
		//    9   18:aload           4
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload           4
		//   14   27:iconst_0        
		//   15   28:invokevirtual   #50  <Method void Bundle.writeToParcel(Parcel, int)>
			  goto _L3
		//*  16   31:goto            78
_L2:
			parcel.writeInt(0);
		//   17   34:aload           4
		//   18   36:iconst_0        
		//   19   37:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  20   40:goto            78
_L5:
			parcel.writeInt(i);
		//   21   43:aload           4
		//   22   45:iload_3         
		//   23   46:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(2, parcel, ((Parcel) (null)), 1);
		//   24   49:aload_0         
		//   25   50:getfield        #19  <Field IBinder mRemote>
		//   26   53:iconst_2        
		//   27   54:aload           4
		//   28   56:aconst_null     
		//   29   57:iconst_1        
		//   30   58:invokeinterface #63  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   31   63:pop             
			parcel.recycle();
		//   32   64:aload           4
		//   33   66:invokevirtual   #66  <Method void Parcel.recycle()>
			return;
		//   34   69:return          
			bundle;
		//   35   70:astore_1        
			parcel.recycle();
		//   36   71:aload           4
		//   37   73:invokevirtual   #66  <Method void Parcel.recycle()>
			throw bundle;
		//   38   76:aload_1         
		//   39   77:athrow          
_L3:
			if(flag)
		//*  40   78:iload_2         
		//*  41   79:ifeq            43
				i = 1;
		//   42   82:iconst_1        
		//   43   83:istore_3        
			if(true) goto _L5; else goto _L4
		//   44   84:goto            43
_L4:
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


	public abstract void start(Bundle bundle, IJobCallback ijobcallback)
		throws RemoteException;

	public abstract void stop(Bundle bundle, boolean flag)
		throws RemoteException;
}
