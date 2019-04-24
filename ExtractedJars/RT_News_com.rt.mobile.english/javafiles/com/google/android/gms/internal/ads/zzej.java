// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

public class zzej
	implements IInterface
{

	protected zzej(IBinder ibinder, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzuf = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field IBinder zzuf>
		zzug = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String zzug>
	//    8   14:return          
	}

	public IBinder asBinder()
	{
		return zzuf;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field IBinder zzuf>
	//    2    4:areturn         
	}

	protected final Parcel obtainAndWriteInterfaceToken()
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel.writeInterfaceToken(zzug);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field String zzug>
	//    5    9:invokevirtual   #33  <Method void Parcel.writeInterfaceToken(String)>
		return parcel;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	protected final Parcel transactAndReadException(int i, Parcel parcel)
		throws RemoteException
	{
		Object obj = ((Object) (Parcel.obtain()));
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		zzuf.transact(i, parcel, ((Parcel) (obj)), 0);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field IBinder zzuf>
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iconst_0        
	//    8   12:invokeinterface #45  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//    9   17:pop             
		((Parcel) (obj)).readException();
	//   10   18:aload_3         
	//   11   19:invokevirtual   #48  <Method void Parcel.readException()>
		parcel.recycle();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #51  <Method void Parcel.recycle()>
		return ((Parcel) (obj));
	//   14   26:aload_3         
	//   15   27:areturn         
		obj;
	//   16   28:astore_3        
		break MISSING_BLOCK_LABEL_41;
	//   17   29:goto            41
		RuntimeException runtimeexception;
		runtimeexception;
	//   18   32:astore          4
		((Parcel) (obj)).recycle();
	//   19   34:aload_3         
	//   20   35:invokevirtual   #51  <Method void Parcel.recycle()>
		throw runtimeexception;
	//   21   38:aload           4
	//   22   40:athrow          
		parcel.recycle();
	//   23   41:aload_2         
	//   24   42:invokevirtual   #51  <Method void Parcel.recycle()>
		throw obj;
	//   25   45:aload_3         
	//   26   46:athrow          
	}

	protected final void transactAndReadExceptionReturnVoid(int i, Parcel parcel)
		throws RemoteException
	{
		Parcel parcel1 = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		zzuf.transact(i, parcel, parcel1, 0);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field IBinder zzuf>
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iconst_0        
	//    8   12:invokeinterface #45  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//    9   17:pop             
		parcel1.readException();
	//   10   18:aload_3         
	//   11   19:invokevirtual   #48  <Method void Parcel.readException()>
		parcel.recycle();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #51  <Method void Parcel.recycle()>
		parcel1.recycle();
	//   14   26:aload_3         
	//   15   27:invokevirtual   #51  <Method void Parcel.recycle()>
		return;
	//   16   30:return          
		Exception exception;
		exception;
	//   17   31:astore          4
		parcel.recycle();
	//   18   33:aload_2         
	//   19   34:invokevirtual   #51  <Method void Parcel.recycle()>
		parcel1.recycle();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #51  <Method void Parcel.recycle()>
		throw exception;
	//   22   41:aload           4
	//   23   43:athrow          
	}

	private final IBinder zzuf;
	private final String zzug;
}
