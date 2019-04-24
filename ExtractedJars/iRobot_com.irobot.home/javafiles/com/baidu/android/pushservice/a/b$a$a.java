// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.a;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.baidu.android.pushservice.a:
//			b

private static class b$a$a
	implements b
{

	public void a(int i, String s)
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #25  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #25  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.baidu.android.pushservice.aidl.IPushServiceListener");
	//    4    9:aload_3         
	//    5   10:ldc1            #27  <String "com.baidu.android.pushservice.aidl.IPushServiceListener">
	//    6   12:invokevirtual   #31  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #35  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   10   20:aload_3         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #38  <Method void Parcel.writeString(String)>
		a.transact(1, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field IBinder a>
	//   15   29:iconst_1        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #44  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #47  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   45:aload           4
	//   24   47:invokevirtual   #50  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #50  <Method void Parcel.recycle()>
		return;
	//   27   54:return          
		s;
	//   28   55:astore_2        
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #50  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #50  <Method void Parcel.recycle()>
		throw s;
	//   33   65:aload_2         
	//   34   66:athrow          
	}

	public IBinder asBinder()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field IBinder a>
	//    2    4:areturn         
	}

	public void b(int i, String s)
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #25  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #25  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.baidu.android.pushservice.aidl.IPushServiceListener");
	//    4    9:aload_3         
	//    5   10:ldc1            #27  <String "com.baidu.android.pushservice.aidl.IPushServiceListener">
	//    6   12:invokevirtual   #31  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #35  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   10   20:aload_3         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #38  <Method void Parcel.writeString(String)>
		a.transact(2, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field IBinder a>
	//   15   29:iconst_2        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #44  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #47  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   45:aload           4
	//   24   47:invokevirtual   #50  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #50  <Method void Parcel.recycle()>
		return;
	//   27   54:return          
		s;
	//   28   55:astore_2        
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #50  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #50  <Method void Parcel.recycle()>
		throw s;
	//   33   65:aload_2         
	//   34   66:athrow          
	}

	public void c(int i, String s)
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #25  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #25  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.baidu.android.pushservice.aidl.IPushServiceListener");
	//    4    9:aload_3         
	//    5   10:ldc1            #27  <String "com.baidu.android.pushservice.aidl.IPushServiceListener">
	//    6   12:invokevirtual   #31  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #35  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   10   20:aload_3         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #38  <Method void Parcel.writeString(String)>
		a.transact(3, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field IBinder a>
	//   15   29:iconst_3        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #44  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #47  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   45:aload           4
	//   24   47:invokevirtual   #50  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #50  <Method void Parcel.recycle()>
		return;
	//   27   54:return          
		s;
	//   28   55:astore_2        
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #50  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #50  <Method void Parcel.recycle()>
		throw s;
	//   33   65:aload_2         
	//   34   66:athrow          
	}

	private IBinder a;

	b$a$a(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field IBinder a>
	//    5    9:return          
	}
}
