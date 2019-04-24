// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;

public interface bc
	extends IInterface
{
	public static abstract class e extends Binder
		implements bc
	{

		public static bc b(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.uodis.opendevice.aidl.OpenDeviceIdentifierService">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof bc))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class bc>
		//*  12   23:ifeq            31
				return (bc)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class bc>
		//   15   30:areturn         
			else
				return ((bc) (new e(ibinder)));
		//   16   31:new             #9   <Class bc$e$e>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void bc$e$e(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    3: default 36
		//		               1: 47
		//		               2: 69
		//		               1598968902: 39
		//*   2   36:goto            104
			case 1598968902: 
				parcel1.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
		//    3   39:aload_3         
		//    4   40:ldc1            #13  <String "com.uodis.opendevice.aidl.OpenDeviceIdentifierService">
		//    5   42:invokevirtual   #32  <Method void Parcel.writeString(String)>
				return true;
		//    6   45:iconst_1        
		//    7   46:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
		//    8   47:aload_2         
		//    9   48:ldc1            #13  <String "com.uodis.opendevice.aidl.OpenDeviceIdentifierService">
		//   10   50:invokevirtual   #35  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (a()));
		//   11   53:aload_0         
		//   12   54:invokevirtual   #39  <Method String a()>
		//   13   57:astore_2        
				parcel1.writeNoException();
		//   14   58:aload_3         
		//   15   59:invokevirtual   #43  <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//   16   62:aload_3         
		//   17   63:aload_2         
		//   18   64:invokevirtual   #32  <Method void Parcel.writeString(String)>
				return true;
		//   19   67:iconst_1        
		//   20   68:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
		//   21   69:aload_2         
		//   22   70:ldc1            #13  <String "com.uodis.opendevice.aidl.OpenDeviceIdentifierService">
		//   23   72:invokevirtual   #35  <Method void Parcel.enforceInterface(String)>
				boolean flag = c();
		//   24   75:aload_0         
		//   25   76:invokevirtual   #47  <Method boolean c()>
		//   26   79:istore          5
				parcel1.writeNoException();
		//   27   81:aload_3         
		//   28   82:invokevirtual   #43  <Method void Parcel.writeNoException()>
				if(flag)
		//*  29   85:iload           5
		//*  30   87:ifeq            95
					i = 1;
		//   31   90:iconst_1        
		//   32   91:istore_1        
				else
		//*  33   92:goto            97
					i = 0;
		//   34   95:iconst_0        
		//   35   96:istore_1        
				parcel1.writeInt(i);
		//   36   97:aload_3         
		//   37   98:iload_1         
		//   38   99:invokevirtual   #51  <Method void Parcel.writeInt(int)>
				return true;
		//   39  102:iconst_1        
		//   40  103:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   41  104:aload_0         
		//   42  105:iload_1         
		//   43  106:aload_2         
		//   44  107:aload_3         
		//   45  108:iload           4
		//   46  110:invokespecial   #53  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   47  113:ireturn         
		}
	}

	static class e.e
		implements bc
	{

		public String a()
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #27  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #27  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			String s;
			parcel.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
		//    4    8:aload_1         
		//    5    9:ldc1            #29  <String "com.uodis.opendevice.aidl.OpenDeviceIdentifierService">
		//    6   11:invokevirtual   #33  <Method void Parcel.writeInterfaceToken(String)>
			d.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder d>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #39  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #42  <Method void Parcel.readException()>
			s = parcel1.readString();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #45  <Method String Parcel.readString()>
		//   19   36:astore_3        
			parcel1.recycle();
		//   20   37:aload_2         
		//   21   38:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_1         
		//   23   42:invokevirtual   #48  <Method void Parcel.recycle()>
			return s;
		//   24   45:aload_3         
		//   25   46:areturn         
			Exception exception;
			exception;
		//   26   47:astore_3        
			parcel1.recycle();
		//   27   48:aload_2         
		//   28   49:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   52:aload_1         
		//   30   53:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   31   56:aload_3         
		//   32   57:athrow          
		}

		public IBinder asBinder()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder d>
		//    2    4:areturn         
		}

		public boolean c()
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #27  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #27  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
		//    4    9:aload_3         
		//    5   10:ldc1            #29  <String "com.uodis.opendevice.aidl.OpenDeviceIdentifierService">
		//    6   12:invokevirtual   #33  <Method void Parcel.writeInterfaceToken(String)>
			d.transact(2, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder d>
		//    9   19:iconst_2        
		//   10   20:aload_3         
		//   11   21:aload           4
		//   12   23:iconst_0        
		//   13   24:invokeinterface #39  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   29:pop             
			parcel1.readException();
		//   15   30:aload           4
		//   16   32:invokevirtual   #42  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   35:aload           4
		//   18   37:invokevirtual   #56  <Method int Parcel.readInt()>
		//   19   40:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   41:iload_1         
		//*  21   42:ifeq            50
				flag = true;
		//   22   45:iconst_1        
		//   23   46:istore_2        
			else
		//*  24   47:goto            52
				flag = false;
		//   25   50:iconst_0        
		//   26   51:istore_2        
			parcel1.recycle();
		//   27   52:aload           4
		//   28   54:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   57:aload_3         
		//   30   58:invokevirtual   #48  <Method void Parcel.recycle()>
			return flag;
		//   31   61:iload_2         
		//   32   62:ireturn         
			Exception exception;
			exception;
		//   33   63:astore          5
			parcel1.recycle();
		//   34   65:aload           4
		//   35   67:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   70:aload_3         
		//   37   71:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   38   74:aload           5
		//   39   76:athrow          
		}

		private IBinder d;

		e.e(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			d = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder d>
		//    5    9:return          
		}
	}


	public abstract String a();

	public abstract boolean c();
}
