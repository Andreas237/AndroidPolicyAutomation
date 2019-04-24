// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzem

public class zzek extends Binder
	implements IInterface
{

	protected zzek(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Binder()>
		attachInterface(((IInterface) (this)), s);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #19  <Method void attachInterface(IInterface, String)>
	//    6   10:return          
	}

	public IBinder asBinder()
	{
		return ((IBinder) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		boolean flag;
		if(i > 0xffffff)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #28  <Int 0xffffff>
	//*   2    3:icmple          20
		{
			flag = super.onTransact(i, parcel, parcel1, j);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:iload           4
	//    8   12:invokespecial   #30  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    9   15:istore          5
		} else
	//*  10   17:goto            31
		{
			parcel.enforceInterface(getInterfaceDescriptor());
	//   11   20:aload_2         
	//   12   21:aload_0         
	//   13   22:invokevirtual   #34  <Method String getInterfaceDescriptor()>
	//   14   25:invokevirtual   #39  <Method void Parcel.enforceInterface(String)>
			flag = false;
	//   15   28:iconst_0        
	//   16   29:istore          5
		}
		if(flag)
	//*  17   31:iload           5
	//*  18   33:ifeq            38
			return true;
	//   19   36:iconst_1        
	//   20   37:ireturn         
		else
			return dispatchTransaction(i, parcel, parcel1, j);
	//   21   38:aload_0         
	//   22   39:iload_1         
	//   23   40:aload_2         
	//   24   41:aload_3         
	//   25   42:iload           4
	//   26   44:invokevirtual   #41  <Method boolean dispatchTransaction(int, Parcel, Parcel, int)>
	//   27   47:ireturn         
	}

	private static zzem zzuh;

	static 
	{
	//    0    0:return          
	}
}
