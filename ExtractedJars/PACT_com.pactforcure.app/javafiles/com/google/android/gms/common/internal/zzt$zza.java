// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzt

public static abstract class zzt$zza extends Binder
	implements zzt
{

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
	//	               1: 54
	//	               2: 92
	//	               1598968902: 46
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    2   36:aload_0         
	//    3   37:iload_1         
	//    4   38:aload_2         
	//    5   39:aload_3         
	//    6   40:iload           4
	//    7   42:invokespecial   #26  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    8   45:ireturn         

		case 1598968902: 
			parcel1.writeString("com.google.android.gms.common.internal.ICertData");
	//    9   46:aload_3         
	//   10   47:ldc1            #13  <String "com.google.android.gms.common.internal.ICertData">
	//   11   49:invokevirtual   #32  <Method void Parcel.writeString(String)>
			return true;
	//   12   52:iconst_1        
	//   13   53:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.common.internal.ICertData");
	//   14   54:aload_2         
	//   15   55:ldc1            #13  <String "com.google.android.gms.common.internal.ICertData">
	//   16   57:invokevirtual   #35  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (zzuB()));
	//   17   60:aload_0         
	//   18   61:invokevirtual   #39  <Method zzd zzuB()>
	//   19   64:astore_2        
			parcel1.writeNoException();
	//   20   65:aload_3         
	//   21   66:invokevirtual   #42  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  22   69:aload_2         
	//*  23   70:ifnull          87
				parcel = ((Parcel) (((zzd) (parcel)).asBinder()));
	//   24   73:aload_2         
	//   25   74:invokeinterface #46  <Method IBinder zzd.asBinder()>
	//   26   79:astore_2        
			else
	//*  27   80:aload_3         
	//*  28   81:aload_2         
	//*  29   82:invokevirtual   #50  <Method void Parcel.writeStrongBinder(IBinder)>
	//*  30   85:iconst_1        
	//*  31   86:ireturn         
				parcel = null;
	//   32   87:aconst_null     
	//   33   88:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
			return true;

	//*  34   89:goto            80
		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.common.internal.ICertData");
	//   35   92:aload_2         
	//   36   93:ldc1            #13  <String "com.google.android.gms.common.internal.ICertData">
	//   37   95:invokevirtual   #35  <Method void Parcel.enforceInterface(String)>
			i = zzuC();
	//   38   98:aload_0         
	//   39   99:invokevirtual   #54  <Method int zzuC()>
	//   40  102:istore_1        
			parcel1.writeNoException();
	//   41  103:aload_3         
	//   42  104:invokevirtual   #42  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//   43  107:aload_3         
	//   44  108:iload_1         
	//   45  109:invokevirtual   #58  <Method void Parcel.writeInt(int)>
			return true;
	//   46  112:iconst_1        
	//   47  113:ireturn         
		}
	}

	public zzt$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.common.internal.ICertData");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #13  <String "com.google.android.gms.common.internal.ICertData">
	//    5    8:invokevirtual   #17  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
