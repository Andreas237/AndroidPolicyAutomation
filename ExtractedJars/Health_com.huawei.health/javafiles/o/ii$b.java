// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;

// Referenced classes of package o:
//			ii

public static abstract class ii$b extends Binder
	implements ii
{
	static class c
		implements ii
	{

		public IBinder asBinder()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder d>
		//    2    4:areturn         
		}

		public int b(Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.amap.api.service.locationprovider.ILocationProviderService");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.amap.api.service.locationprovider.ILocationProviderService">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_33;
		//    7   15:aload_1         
		//    8   16:ifnull          33
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #47  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   16   30:goto            38
			parcel.writeInt(0);
		//   17   33:aload_3         
		//   18   34:iconst_0        
		//   19   35:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			int i;
			d.transact(1, parcel, parcel1, 0);
		//   20   38:aload_0         
		//   21   39:getfield        #19  <Field IBinder d>
		//   22   42:iconst_1        
		//   23   43:aload_3         
		//   24   44:aload           4
		//   25   46:iconst_0        
		//   26   47:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   52:pop             
			parcel1.readException();
		//   28   53:aload           4
		//   29   55:invokevirtual   #56  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   30   58:aload           4
		//   31   60:invokevirtual   #60  <Method int Parcel.readInt()>
		//   32   63:istore_2        
			if(parcel1.readInt() != 0)
		//*  33   64:aload           4
		//*  34   66:invokevirtual   #60  <Method int Parcel.readInt()>
		//*  35   69:ifeq            78
				bundle.readFromParcel(parcel1);
		//   36   72:aload_1         
		//   37   73:aload           4
		//   38   75:invokevirtual   #64  <Method void Bundle.readFromParcel(Parcel)>
			parcel1.recycle();
		//   39   78:aload           4
		//   40   80:invokevirtual   #67  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   83:aload_3         
		//   42   84:invokevirtual   #67  <Method void Parcel.recycle()>
			return i;
		//   43   87:iload_2         
		//   44   88:ireturn         
			bundle;
		//   45   89:astore_1        
			parcel1.recycle();
		//   46   90:aload           4
		//   47   92:invokevirtual   #67  <Method void Parcel.recycle()>
			parcel.recycle();
		//   48   95:aload_3         
		//   49   96:invokevirtual   #67  <Method void Parcel.recycle()>
			throw bundle;
		//   50   99:aload_1         
		//   51  100:athrow          
		}

		private IBinder d;

		c(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			d = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field IBinder d>
		//    5    9:return          
		}
	}


	public static ii c(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.amap.api.service.locationprovider.ILocationProviderService");
	//    4    6:aload_0         
	//    5    7:ldc1            #16  <String "com.amap.api.service.locationprovider.ILocationProviderService">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof ii))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class ii>
	//*  12   23:ifeq            31
			return (ii)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class ii>
	//   15   30:areturn         
		else
			return ((ii) (new c(ibinder)));
	//   16   31:new             #9   <Class ii$b$c>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void ii$b$c(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               1: 39
	//	               1598968902: 31
	//*   2   28:goto            110
		case 1598968902: 
			parcel1.writeString("com.amap.api.service.locationprovider.ILocationProviderService");
	//    3   31:aload_3         
	//    4   32:ldc1            #16  <String "com.amap.api.service.locationprovider.ILocationProviderService">
	//    5   34:invokevirtual   #41  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.amap.api.service.locationprovider.ILocationProviderService");
	//    8   39:aload_2         
	//    9   40:ldc1            #16  <String "com.amap.api.service.locationprovider.ILocationProviderService">
	//   10   42:invokevirtual   #44  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  11   45:aload_2         
	//*  12   46:invokevirtual   #48  <Method int Parcel.readInt()>
	//*  13   49:ifeq            68
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   14   52:getstatic       #54  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   15   55:aload_2         
	//   16   56:invokeinterface #60  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17   61:checkcast       #50  <Class Bundle>
	//   18   64:astore_2        
			else
	//*  19   65:goto            70
				parcel = null;
	//   20   68:aconst_null     
	//   21   69:astore_2        
			i = b(((Bundle) (parcel)));
	//   22   70:aload_0         
	//   23   71:aload_2         
	//   24   72:invokevirtual   #63  <Method int b(Bundle)>
	//   25   75:istore_1        
			parcel1.writeNoException();
	//   26   76:aload_3         
	//   27   77:invokevirtual   #66  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//   28   80:aload_3         
	//   29   81:iload_1         
	//   30   82:invokevirtual   #70  <Method void Parcel.writeInt(int)>
			if(parcel != null)
	//*  31   85:aload_2         
	//*  32   86:ifnull          103
			{
				parcel1.writeInt(1);
	//   33   89:aload_3         
	//   34   90:iconst_1        
	//   35   91:invokevirtual   #70  <Method void Parcel.writeInt(int)>
				((Bundle) (parcel)).writeToParcel(parcel1, 1);
	//   36   94:aload_2         
	//   37   95:aload_3         
	//   38   96:iconst_1        
	//   39   97:invokevirtual   #74  <Method void Bundle.writeToParcel(Parcel, int)>
			} else
	//*  40  100:goto            108
			{
				parcel1.writeInt(0);
	//   41  103:aload_3         
	//   42  104:iconst_0        
	//   43  105:invokevirtual   #70  <Method void Parcel.writeInt(int)>
			}
			return true;
	//   44  108:iconst_1        
	//   45  109:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   46  110:aload_0         
	//   47  111:iload_1         
	//   48  112:aload_2         
	//   49  113:aload_3         
	//   50  114:iload           4
	//   51  116:invokespecial   #76  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   52  119:ireturn         
	}

	public ii$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.amap.api.service.locationprovider.ILocationProviderService");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #16  <String "com.amap.api.service.locationprovider.ILocationProviderService">
	//    5    8:invokevirtual   #20  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
