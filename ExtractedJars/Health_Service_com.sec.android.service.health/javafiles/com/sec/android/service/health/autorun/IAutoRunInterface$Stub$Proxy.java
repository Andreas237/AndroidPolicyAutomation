// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.autorun;

import android.os.*;

// Referenced classes of package com.sec.android.service.health.autorun:
//			IAutoRunInterface

private static class IAutoRunInterface$Stub$Proxy
	implements IAutoRunInterface
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
		return "com.sec.android.service.health.autorun.IAutoRunInterface";
	//    0    0:ldc1            #26  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
	//    1    2:areturn         
	}

	public int isAutoRunModeEnabled(String s)
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
		int i;
		parcel.writeInterfaceToken("com.sec.android.service.health.autorun.IAutoRunInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #43  <Method void Parcel.writeString(String)>
		mRemote.transact(2, parcel, parcel1, 0);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field IBinder mRemote>
	//   12   24:iconst_2        
	//   13   25:aload_3         
	//   14   26:aload           4
	//   15   28:iconst_0        
	//   16   29:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   34:pop             
		parcel1.readException();
	//   18   35:aload           4
	//   19   37:invokevirtual   #52  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   20   40:aload           4
	//   21   42:invokevirtual   #56  <Method int Parcel.readInt()>
	//   22   45:istore_2        
		parcel1.recycle();
	//   23   46:aload           4
	//   24   48:invokevirtual   #59  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   51:aload_3         
	//   26   52:invokevirtual   #59  <Method void Parcel.recycle()>
		return i;
	//   27   55:iload_2         
	//   28   56:ireturn         
		s;
	//   29   57:astore_1        
		parcel1.recycle();
	//   30   58:aload           4
	//   31   60:invokevirtual   #59  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   63:aload_3         
	//   33   64:invokevirtual   #59  <Method void Parcel.recycle()>
		throw s;
	//   34   67:aload_1         
	//   35   68:athrow          
	}

	public int setAutoRunMode(String s, int i)
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
		parcel.writeInterfaceToken("com.sec.android.service.health.autorun.IAutoRunInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #43  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//   10   20:aload_3         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #66  <Method void Parcel.writeInt(int)>
		mRemote.transact(1, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field IBinder mRemote>
	//   15   29:iconst_1        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #52  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   23   45:aload           4
	//   24   47:invokevirtual   #56  <Method int Parcel.readInt()>
	//   25   50:istore_2        
		parcel1.recycle();
	//   26   51:aload           4
	//   27   53:invokevirtual   #59  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   56:aload_3         
	//   29   57:invokevirtual   #59  <Method void Parcel.recycle()>
		return i;
	//   30   60:iload_2         
	//   31   61:ireturn         
		s;
	//   32   62:astore_1        
		parcel1.recycle();
	//   33   63:aload           4
	//   34   65:invokevirtual   #59  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   68:aload_3         
	//   36   69:invokevirtual   #59  <Method void Parcel.recycle()>
		throw s;
	//   37   72:aload_1         
	//   38   73:athrow          
	}

	private IBinder mRemote;

	IAutoRunInterface$Stub$Proxy(IBinder ibinder)
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
