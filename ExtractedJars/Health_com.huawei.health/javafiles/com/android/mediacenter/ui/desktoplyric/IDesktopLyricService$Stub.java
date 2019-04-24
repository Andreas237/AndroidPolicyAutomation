// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.mediacenter.ui.desktoplyric;

import android.os.*;

// Referenced classes of package com.android.mediacenter.ui.desktoplyric:
//			IDesktopLyricService

public static abstract class IDesktopLyricService$Stub extends Binder
	implements IDesktopLyricService
{
	static class Proxy
		implements IDesktopLyricService
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
			return "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService";
		//    0    0:ldc1            #26  <String "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService">
		//    1    2:areturn         
		}

		public void startDesktopLyric(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.android.mediacenter.ui.desktoplyric.IDesktopLyricService");
		//    4    9:aload_3         
		//    5   10:ldc1            #26  <String "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService">
		//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            73
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #19  <Field IBinder mRemote>
		//*  17   33:iconst_1        
		//*  18   34:aload_3         
		//*  19   35:aload           4
		//*  20   37:iconst_0        
		//*  21   38:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   43:pop             
		//*  23   44:aload           4
		//*  24   46:invokevirtual   #53  <Method void Parcel.readException()>
		//*  25   49:aload           4
		//*  26   51:invokevirtual   #56  <Method void Parcel.recycle()>
		//*  27   54:aload_3         
		//*  28   55:invokevirtual   #56  <Method void Parcel.recycle()>
		//*  29   58:return          
		//*  30   59:astore          5
		//*  31   61:aload           4
		//*  32   63:invokevirtual   #56  <Method void Parcel.recycle()>
		//*  33   66:aload_3         
		//*  34   67:invokevirtual   #56  <Method void Parcel.recycle()>
		//*  35   70:aload           5
		//*  36   72:athrow          
				i = 0;
		//   37   73:iconst_0        
		//   38   74:istore_2        
			parcel.writeInt(i);
			mRemote.transact(1, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   75:goto            24
		}

		public void stopDesktopLyric()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.android.mediacenter.ui.desktoplyric.IDesktopLyricService");
		//    4    8:aload_1         
		//    5    9:ldc1            #26  <String "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService">
		//    6   11:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(2, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:iconst_2        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #53  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #56  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #56  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #56  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #56  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		private IBinder mRemote;

		Proxy(IBinder ibinder)
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


	public static IDesktopLyricService asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.android.mediacenter.ui.desktoplyric.IDesktopLyricService");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService">
	//    6    9:invokeinterface #36  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IDesktopLyricService))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IDesktopLyricService>
	//*  12   23:ifeq            31
			return (IDesktopLyricService)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IDesktopLyricService>
	//   15   30:areturn         
		else
			return ((IDesktopLyricService) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class IDesktopLyricService$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #39  <Method void IDesktopLyricService$Stub$Proxy(IBinder)>
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
	//*   1    1:lookupswitch    3: default 36
	//	               1: 47
	//	               2: 81
	//	               1598968902: 39
	//*   2   36:goto            97
		case 1598968902: 
			parcel1.writeString("com.android.mediacenter.ui.desktoplyric.IDesktopLyricService");
	//    3   39:aload_3         
	//    4   40:ldc1            #14  <String "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService">
	//    5   42:invokevirtual   #51  <Method void Parcel.writeString(String)>
			return true;
	//    6   45:iconst_1        
	//    7   46:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.android.mediacenter.ui.desktoplyric.IDesktopLyricService");
	//    8   47:aload_2         
	//    9   48:ldc1            #14  <String "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService">
	//   10   50:invokevirtual   #54  <Method void Parcel.enforceInterface(String)>
			boolean flag;
			if(parcel.readInt() != 0)
	//*  11   53:aload_2         
	//*  12   54:invokevirtual   #58  <Method int Parcel.readInt()>
	//*  13   57:ifeq            66
				flag = true;
	//   14   60:iconst_1        
	//   15   61:istore          5
			else
	//*  16   63:goto            69
				flag = false;
	//   17   66:iconst_0        
	//   18   67:istore          5
			startDesktopLyric(flag);
	//   19   69:aload_0         
	//   20   70:iload           5
	//   21   72:invokevirtual   #62  <Method void startDesktopLyric(boolean)>
			parcel1.writeNoException();
	//   22   75:aload_3         
	//   23   76:invokevirtual   #65  <Method void Parcel.writeNoException()>
			return true;
	//   24   79:iconst_1        
	//   25   80:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.android.mediacenter.ui.desktoplyric.IDesktopLyricService");
	//   26   81:aload_2         
	//   27   82:ldc1            #14  <String "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService">
	//   28   84:invokevirtual   #54  <Method void Parcel.enforceInterface(String)>
			stopDesktopLyric();
	//   29   87:aload_0         
	//   30   88:invokevirtual   #68  <Method void stopDesktopLyric()>
			parcel1.writeNoException();
	//   31   91:aload_3         
	//   32   92:invokevirtual   #65  <Method void Parcel.writeNoException()>
			return true;
	//   33   95:iconst_1        
	//   34   96:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   35   97:aload_0         
	//   36   98:iload_1         
	//   37   99:aload_2         
	//   38  100:aload_3         
	//   39  101:iload           4
	//   40  103:invokespecial   #70  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   41  106:ireturn         
	}

	private static final String DESCRIPTOR = "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService";
	static final int TRANSACTION_startDesktopLyric = 1;
	static final int TRANSACTION_stopDesktopLyric = 2;

	public IDesktopLyricService$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "com.android.mediacenter.ui.desktoplyric.IDesktopLyricService">
	//    5    8:invokevirtual   #27  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
