// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//			zza

public static abstract class zza$zza extends Binder
	implements com.google.android.gms.maps.model.internal.zza
{
	static class zza
		implements com.google.android.gms.maps.model.internal.zza
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
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
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
			bitmap = ((Bitmap) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
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
			s = ((String) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
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
			s = ((String) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
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
			s = ((String) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
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
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
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
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
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

		zza(IBinder ibinder)
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


	public static com.google.android.gms.maps.model.internal.zza zzei(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof com.google.android.gms.maps.model.internal.zza))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zza>
	//*  12   23:ifeq            31
			return (com.google.android.gms.maps.model.internal.zza)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zza>
	//   15   30:areturn         
		else
			return ((com.google.android.gms.maps.model.internal.zza) (new zza(ibinder)));
	//   16   31:new             #9   <Class zza$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void zza$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    8: default 76
	//	               1: 87
	//	               2: 129
	//	               3: 171
	//	               4: 213
	//	               5: 251
	//	               6: 293
	//	               7: 357
	//	               1598968902: 79
	//*   2   76:goto            399
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    3   79:aload_3         
	//    4   80:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//    5   82:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6   85:iconst_1        
	//    7   86:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//    8   87:aload_2         
	//    9   88:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//   10   90:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (zzly(parcel.readInt())));
	//   11   93:aload_0         
	//   12   94:aload_2         
	//   13   95:invokevirtual   #41  <Method int Parcel.readInt()>
	//   14   98:invokevirtual   #45  <Method IObjectWrapper zzly(int)>
	//   15  101:astore_2        
			parcel1.writeNoException();
	//   16  102:aload_3         
	//   17  103:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  18  106:aload_2         
	//*  19  107:ifnull          120
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//   20  110:aload_2         
	//   21  111:invokeinterface #55  <Method IBinder IObjectWrapper.asBinder()>
	//   22  116:astore_2        
			else
	//*  23  117:goto            122
				parcel = null;
	//   24  120:aconst_null     
	//   25  121:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//   26  122:aload_3         
	//   27  123:aload_2         
	//   28  124:invokevirtual   #58  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//   29  127:iconst_1        
	//   30  128:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//   31  129:aload_2         
	//   32  130:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//   33  132:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (zzfa(parcel.readString())));
	//   34  135:aload_0         
	//   35  136:aload_2         
	//   36  137:invokevirtual   #62  <Method String Parcel.readString()>
	//   37  140:invokevirtual   #66  <Method IObjectWrapper zzfa(String)>
	//   38  143:astore_2        
			parcel1.writeNoException();
	//   39  144:aload_3         
	//   40  145:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  41  148:aload_2         
	//*  42  149:ifnull          162
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//   43  152:aload_2         
	//   44  153:invokeinterface #55  <Method IBinder IObjectWrapper.asBinder()>
	//   45  158:astore_2        
			else
	//*  46  159:goto            164
				parcel = null;
	//   47  162:aconst_null     
	//   48  163:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//   49  164:aload_3         
	//   50  165:aload_2         
	//   51  166:invokevirtual   #58  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//   52  169:iconst_1        
	//   53  170:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//   54  171:aload_2         
	//   55  172:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//   56  174:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (zzfb(parcel.readString())));
	//   57  177:aload_0         
	//   58  178:aload_2         
	//   59  179:invokevirtual   #62  <Method String Parcel.readString()>
	//   60  182:invokevirtual   #69  <Method IObjectWrapper zzfb(String)>
	//   61  185:astore_2        
			parcel1.writeNoException();
	//   62  186:aload_3         
	//   63  187:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  64  190:aload_2         
	//*  65  191:ifnull          204
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//   66  194:aload_2         
	//   67  195:invokeinterface #55  <Method IBinder IObjectWrapper.asBinder()>
	//   68  200:astore_2        
			else
	//*  69  201:goto            206
				parcel = null;
	//   70  204:aconst_null     
	//   71  205:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//   72  206:aload_3         
	//   73  207:aload_2         
	//   74  208:invokevirtual   #58  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//   75  211:iconst_1        
	//   76  212:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//   77  213:aload_2         
	//   78  214:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//   79  216:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (zzJR()));
	//   80  219:aload_0         
	//   81  220:invokevirtual   #73  <Method IObjectWrapper zzJR()>
	//   82  223:astore_2        
			parcel1.writeNoException();
	//   83  224:aload_3         
	//   84  225:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  85  228:aload_2         
	//*  86  229:ifnull          242
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//   87  232:aload_2         
	//   88  233:invokeinterface #55  <Method IBinder IObjectWrapper.asBinder()>
	//   89  238:astore_2        
			else
	//*  90  239:goto            244
				parcel = null;
	//   91  242:aconst_null     
	//   92  243:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//   93  244:aload_3         
	//   94  245:aload_2         
	//   95  246:invokevirtual   #58  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//   96  249:iconst_1        
	//   97  250:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//   98  251:aload_2         
	//   99  252:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//  100  254:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (zzi(parcel.readFloat())));
	//  101  257:aload_0         
	//  102  258:aload_2         
	//  103  259:invokevirtual   #77  <Method float Parcel.readFloat()>
	//  104  262:invokevirtual   #81  <Method IObjectWrapper zzi(float)>
	//  105  265:astore_2        
			parcel1.writeNoException();
	//  106  266:aload_3         
	//  107  267:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 108  270:aload_2         
	//* 109  271:ifnull          284
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//  110  274:aload_2         
	//  111  275:invokeinterface #55  <Method IBinder IObjectWrapper.asBinder()>
	//  112  280:astore_2        
			else
	//* 113  281:goto            286
				parcel = null;
	//  114  284:aconst_null     
	//  115  285:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//  116  286:aload_3         
	//  117  287:aload_2         
	//  118  288:invokevirtual   #58  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//  119  291:iconst_1        
	//  120  292:ireturn         

		case 6: // '\006'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//  121  293:aload_2         
	//  122  294:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//  123  296:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 124  299:aload_2         
	//* 125  300:invokevirtual   #41  <Method int Parcel.readInt()>
	//* 126  303:ifeq            322
				parcel = ((Parcel) ((Bitmap)Bitmap.CREATOR.createFromParcel(parcel)));
	//  127  306:getstatic       #87  <Field android.os.Parcelable$Creator Bitmap.CREATOR>
	//  128  309:aload_2         
	//  129  310:invokeinterface #93  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  130  315:checkcast       #83  <Class Bitmap>
	//  131  318:astore_2        
			else
	//* 132  319:goto            324
				parcel = null;
	//  133  322:aconst_null     
	//  134  323:astore_2        
			parcel = ((Parcel) (zze(((Bitmap) (parcel)))));
	//  135  324:aload_0         
	//  136  325:aload_2         
	//  137  326:invokevirtual   #97  <Method IObjectWrapper zze(Bitmap)>
	//  138  329:astore_2        
			parcel1.writeNoException();
	//  139  330:aload_3         
	//  140  331:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 141  334:aload_2         
	//* 142  335:ifnull          348
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//  143  338:aload_2         
	//  144  339:invokeinterface #55  <Method IBinder IObjectWrapper.asBinder()>
	//  145  344:astore_2        
			else
	//* 146  345:goto            350
				parcel = null;
	//  147  348:aconst_null     
	//  148  349:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//  149  350:aload_3         
	//  150  351:aload_2         
	//  151  352:invokevirtual   #58  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//  152  355:iconst_1        
	//  153  356:ireturn         

		case 7: // '\007'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
	//  154  357:aload_2         
	//  155  358:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate">
	//  156  360:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (zzfc(parcel.readString())));
	//  157  363:aload_0         
	//  158  364:aload_2         
	//  159  365:invokevirtual   #62  <Method String Parcel.readString()>
	//  160  368:invokevirtual   #100 <Method IObjectWrapper zzfc(String)>
	//  161  371:astore_2        
			parcel1.writeNoException();
	//  162  372:aload_3         
	//  163  373:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 164  376:aload_2         
	//* 165  377:ifnull          390
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//  166  380:aload_2         
	//  167  381:invokeinterface #55  <Method IBinder IObjectWrapper.asBinder()>
	//  168  386:astore_2        
			else
	//* 169  387:goto            392
				parcel = null;
	//  170  390:aconst_null     
	//  171  391:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//  172  392:aload_3         
	//  173  393:aload_2         
	//  174  394:invokevirtual   #58  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//  175  397:iconst_1        
	//  176  398:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//  177  399:aload_0         
	//  178  400:iload_1         
	//  179  401:aload_2         
	//  180  402:aload_3         
	//  181  403:iload           4
	//  182  405:invokespecial   #102 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//  183  408:ireturn         
	}
}
