// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//			zza

static class zza$zza$zza
	implements zza
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public IObjectWrapper zzJR()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		IObjectWrapper iobjectwrapper;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(4, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_4        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.er.zza.zzcd(parcel1.readStrongBinder());
	//   17   32:aload_2         
	//   18   33:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   19   36:invokestatic    #55  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   20   39:astore_3        
		parcel1.recycle();
	//   21   40:aload_2         
	//   22   41:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #58  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   25   48:aload_3         
	//   26   49:areturn         
		Exception exception;
		exception;
	//   27   50:astore_3        
		parcel1.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   32   59:aload_3         
	//   33   60:athrow          
	}

	public IObjectWrapper zze(Bitmap bitmap)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #65  <Method void Parcel.writeInt(int)>
		bitmap.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #71  <Method void Bitmap.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #65  <Method void Parcel.writeInt(int)>
		zzrk.transact(6, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:bipush          6
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #46  <Method void Parcel.readException()>
		bitmap = ((Bitmap) (com.google.android.gms.dynamic.er.zza.zzcd(parcel1.readStrongBinder())));
	//   30   56:aload_3         
	//   31   57:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   32   60:invokestatic    #55  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   33   63:astore_1        
		parcel1.recycle();
	//   34   64:aload_3         
	//   35   65:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   68:aload_2         
	//   37   69:invokevirtual   #58  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (bitmap));
	//   38   72:aload_1         
	//   39   73:areturn         
		bitmap;
	//   40   74:astore_1        
		parcel1.recycle();
	//   41   75:aload_3         
	//   42   76:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   43   79:aload_2         
	//   44   80:invokevirtual   #58  <Method void Parcel.recycle()>
		throw bitmap;
	//   45   83:aload_1         
	//   46   84:athrow          
	}

	public IObjectWrapper zzfa(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #76  <Method void Parcel.writeString(String)>
		zzrk.transact(2, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:iconst_2        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #46  <Method void Parcel.readException()>
		s = ((String) (com.google.android.gms.dynamic.er.zza.zzcd(parcel1.readStrongBinder())));
	//   20   37:aload_3         
	//   21   38:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   22   41:invokestatic    #55  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   23   44:astore_1        
		parcel1.recycle();
	//   24   45:aload_3         
	//   25   46:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   26   49:aload_2         
	//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (s));
	//   28   53:aload_1         
	//   29   54:areturn         
		s;
	//   30   55:astore_1        
		parcel1.recycle();
	//   31   56:aload_3         
	//   32   57:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   60:aload_2         
	//   34   61:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   35   64:aload_1         
	//   36   65:athrow          
	}

	public IObjectWrapper zzfb(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #76  <Method void Parcel.writeString(String)>
		zzrk.transact(3, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:iconst_3        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #46  <Method void Parcel.readException()>
		s = ((String) (com.google.android.gms.dynamic.er.zza.zzcd(parcel1.readStrongBinder())));
	//   20   37:aload_3         
	//   21   38:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   22   41:invokestatic    #55  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   23   44:astore_1        
		parcel1.recycle();
	//   24   45:aload_3         
	//   25   46:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   26   49:aload_2         
	//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (s));
	//   28   53:aload_1         
	//   29   54:areturn         
		s;
	//   30   55:astore_1        
		parcel1.recycle();
	//   31   56:aload_3         
	//   32   57:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   60:aload_2         
	//   34   61:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   35   64:aload_1         
	//   36   65:athrow          
	}

	public IObjectWrapper zzfc(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #76  <Method void Parcel.writeString(String)>
		zzrk.transact(7, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          7
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		s = ((String) (com.google.android.gms.dynamic.er.zza.zzcd(parcel1.readStrongBinder())));
	//   20   38:aload_3         
	//   21   39:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   22   42:invokestatic    #55  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   23   45:astore_1        
		parcel1.recycle();
	//   24   46:aload_3         
	//   25   47:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   26   50:aload_2         
	//   27   51:invokevirtual   #58  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (s));
	//   28   54:aload_1         
	//   29   55:areturn         
		s;
	//   30   56:astore_1        
		parcel1.recycle();
	//   31   57:aload_3         
	//   32   58:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   61:aload_2         
	//   34   62:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   35   65:aload_1         
	//   36   66:athrow          
	}

	public IObjectWrapper zzi(float f)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		IObjectWrapper iobjectwrapper;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   14:aload_2         
	//    8   15:fload_1         
	//    9   16:invokevirtual   #84  <Method void Parcel.writeFloat(float)>
		zzrk.transact(5, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:iconst_5        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #46  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.er.zza.zzcd(parcel1.readStrongBinder());
	//   20   37:aload_3         
	//   21   38:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   22   41:invokestatic    #55  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   23   44:astore          4
		parcel1.recycle();
	//   24   46:aload_3         
	//   25   47:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   26   50:aload_2         
	//   27   51:invokevirtual   #58  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   28   54:aload           4
	//   29   56:areturn         
		Exception exception;
		exception;
	//   30   57:astore          4
		parcel1.recycle();
	//   31   59:aload_3         
	//   32   60:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   63:aload_2         
	//   34   64:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   35   67:aload           4
	//   36   69:athrow          
	}

	public IObjectWrapper zzly(int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		IObjectWrapper iobjectwrapper;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #65  <Method void Parcel.writeInt(int)>
		zzrk.transact(1, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:iconst_1        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #46  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.er.zza.zzcd(parcel1.readStrongBinder());
	//   20   37:aload_3         
	//   21   38:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   22   41:invokestatic    #55  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   23   44:astore          4
		parcel1.recycle();
	//   24   46:aload_3         
	//   25   47:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   26   50:aload_2         
	//   27   51:invokevirtual   #58  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   28   54:aload           4
	//   29   56:areturn         
		Exception exception;
		exception;
	//   30   57:astore          4
		parcel1.recycle();
	//   31   59:aload_3         
	//   32   60:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   63:aload_2         
	//   34   64:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   35   67:aload           4
	//   36   69:athrow          
	}

	private IBinder zzrk;

	zza$zza$zza(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzrk = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field IBinder zzrk>
	//    5    9:return          
	}
}
