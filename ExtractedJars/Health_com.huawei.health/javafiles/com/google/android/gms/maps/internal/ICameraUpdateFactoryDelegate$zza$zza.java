// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.*;

// Referenced classes of package com.google.android.gms.maps.internal:
//			ICameraUpdateFactoryDelegate

static class ICameraUpdateFactoryDelegate$zza$zza
	implements ICameraUpdateFactoryDelegate
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public IObjectWrapper newCameraPosition(CameraPosition cameraposition)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(cameraposition == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		cameraposition.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #47  <Method void CameraPosition.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		zzrk.transact(7, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:bipush          7
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #56  <Method void Parcel.readException()>
		cameraposition = ((CameraPosition) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
	//   30   56:aload_3         
	//   31   57:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   32   60:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   33   63:astore_1        
		parcel1.recycle();
	//   34   64:aload_3         
	//   35   65:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   68:aload_2         
	//   37   69:invokevirtual   #68  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (cameraposition));
	//   38   72:aload_1         
	//   39   73:areturn         
		cameraposition;
	//   40   74:astore_1        
		parcel1.recycle();
	//   41   75:aload_3         
	//   42   76:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   43   79:aload_2         
	//   44   80:invokevirtual   #68  <Method void Parcel.recycle()>
		throw cameraposition;
	//   45   83:aload_1         
	//   46   84:athrow          
	}

	public IObjectWrapper newLatLng(LatLng latlng)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(latlng == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		latlng.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #74  <Method void LatLng.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		zzrk.transact(8, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:bipush          8
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #56  <Method void Parcel.readException()>
		latlng = ((LatLng) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
	//   30   56:aload_3         
	//   31   57:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   32   60:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   33   63:astore_1        
		parcel1.recycle();
	//   34   64:aload_3         
	//   35   65:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   68:aload_2         
	//   37   69:invokevirtual   #68  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (latlng));
	//   38   72:aload_1         
	//   39   73:areturn         
		latlng;
	//   40   74:astore_1        
		parcel1.recycle();
	//   41   75:aload_3         
	//   42   76:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   43   79:aload_2         
	//   44   80:invokevirtual   #68  <Method void Parcel.recycle()>
		throw latlng;
	//   45   83:aload_1         
	//   46   84:athrow          
	}

	public IObjectWrapper newLatLngBounds(LatLngBounds latlngbounds, int i)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(latlngbounds == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		latlngbounds.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #79  <Method void LatLngBounds.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   20   38:aload_3         
	//   21   39:iload_2         
	//   22   40:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		zzrk.transact(10, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #18  <Field IBinder zzrk>
	//   25   47:bipush          10
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:iconst_0        
	//   29   53:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   58:pop             
		parcel1.readException();
	//   31   59:aload           4
	//   32   61:invokevirtual   #56  <Method void Parcel.readException()>
		latlngbounds = ((LatLngBounds) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
	//   33   64:aload           4
	//   34   66:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   35   69:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   36   72:astore_1        
		parcel1.recycle();
	//   37   73:aload           4
	//   38   75:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   78:aload_3         
	//   40   79:invokevirtual   #68  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (latlngbounds));
	//   41   82:aload_1         
	//   42   83:areturn         
		latlngbounds;
	//   43   84:astore_1        
		parcel1.recycle();
	//   44   85:aload           4
	//   45   87:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   46   90:aload_3         
	//   47   91:invokevirtual   #68  <Method void Parcel.recycle()>
		throw latlngbounds;
	//   48   94:aload_1         
	//   49   95:athrow          
	}

	public IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latlngbounds, int i, int j, int k)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore          5
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    8:astore          6
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4   10:aload           5
	//    5   12:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(latlngbounds == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           5
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		latlngbounds.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           5
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #79  <Method void LatLngBounds.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           5
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   20   43:aload           5
	//   21   45:iload_2         
	//   22   46:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   23   49:aload           5
	//   24   51:iload_3         
	//   25   52:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		parcel.writeInt(k);
	//   26   55:aload           5
	//   27   57:iload           4
	//   28   59:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		zzrk.transact(11, parcel, parcel1, 0);
	//   29   62:aload_0         
	//   30   63:getfield        #18  <Field IBinder zzrk>
	//   31   66:bipush          11
	//   32   68:aload           5
	//   33   70:aload           6
	//   34   72:iconst_0        
	//   35   73:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   36   78:pop             
		parcel1.readException();
	//   37   79:aload           6
	//   38   81:invokevirtual   #56  <Method void Parcel.readException()>
		latlngbounds = ((LatLngBounds) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
	//   39   84:aload           6
	//   40   86:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   41   89:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   42   92:astore_1        
		parcel1.recycle();
	//   43   93:aload           6
	//   44   95:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   98:aload           5
	//   46  100:invokevirtual   #68  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (latlngbounds));
	//   47  103:aload_1         
	//   48  104:areturn         
		latlngbounds;
	//   49  105:astore_1        
		parcel1.recycle();
	//   50  106:aload           6
	//   51  108:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   52  111:aload           5
	//   53  113:invokevirtual   #68  <Method void Parcel.recycle()>
		throw latlngbounds;
	//   54  116:aload_1         
	//   55  117:athrow          
	}

	public IObjectWrapper newLatLngZoom(LatLng latlng, float f)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(latlng == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		latlng.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #74  <Method void LatLng.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		parcel.writeFloat(f);
	//   20   38:aload_3         
	//   21   39:fload_2         
	//   22   40:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
		zzrk.transact(9, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #18  <Field IBinder zzrk>
	//   25   47:bipush          9
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:iconst_0        
	//   29   53:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   58:pop             
		parcel1.readException();
	//   31   59:aload           4
	//   32   61:invokevirtual   #56  <Method void Parcel.readException()>
		latlng = ((LatLng) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
	//   33   64:aload           4
	//   34   66:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   35   69:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   36   72:astore_1        
		parcel1.recycle();
	//   37   73:aload           4
	//   38   75:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   78:aload_3         
	//   40   79:invokevirtual   #68  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (latlng));
	//   41   82:aload_1         
	//   42   83:areturn         
		latlng;
	//   43   84:astore_1        
		parcel1.recycle();
	//   44   85:aload           4
	//   45   87:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   46   90:aload_3         
	//   47   91:invokevirtual   #68  <Method void Parcel.recycle()>
		throw latlng;
	//   48   94:aload_1         
	//   49   95:athrow          
	}

	public IObjectWrapper scrollBy(float f, float f1)
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
		IObjectWrapper iobjectwrapper;
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   15:aload_3         
	//    8   16:fload_1         
	//    9   17:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
		parcel.writeFloat(f1);
	//   10   20:aload_3         
	//   11   21:fload_2         
	//   12   22:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
		zzrk.transact(3, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #18  <Field IBinder zzrk>
	//   15   29:iconst_3        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #56  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
	//   23   45:aload           4
	//   24   47:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   25   50:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   26   53:astore          5
		parcel1.recycle();
	//   27   55:aload           4
	//   28   57:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   60:aload_3         
	//   30   61:invokevirtual   #68  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   31   64:aload           5
	//   32   66:areturn         
		Exception exception;
		exception;
	//   33   67:astore          5
		parcel1.recycle();
	//   34   69:aload           4
	//   35   71:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   74:aload_3         
	//   37   75:invokevirtual   #68  <Method void Parcel.recycle()>
		throw exception;
	//   38   78:aload           5
	//   39   80:athrow          
	}

	public IObjectWrapper zoomBy(float f)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   14:aload_2         
	//    8   15:fload_1         
	//    9   16:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
		zzrk.transact(5, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:iconst_5        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #56  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
	//   20   37:aload_3         
	//   21   38:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   22   41:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   23   44:astore          4
		parcel1.recycle();
	//   24   46:aload_3         
	//   25   47:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   26   50:aload_2         
	//   27   51:invokevirtual   #68  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   28   54:aload           4
	//   29   56:areturn         
		Exception exception;
		exception;
	//   30   57:astore          4
		parcel1.recycle();
	//   31   59:aload_3         
	//   32   60:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   63:aload_2         
	//   34   64:invokevirtual   #68  <Method void Parcel.recycle()>
		throw exception;
	//   35   67:aload           4
	//   36   69:athrow          
	}

	public IObjectWrapper zoomByWithFocus(float f, int i, int j)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		IObjectWrapper iobjectwrapper;
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4   10:aload           4
	//    5   12:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   17:aload           4
	//    8   19:fload_1         
	//    9   20:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
		parcel.writeInt(i);
	//   10   23:aload           4
	//   11   25:iload_2         
	//   12   26:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   13   29:aload           4
	//   14   31:iload_3         
	//   15   32:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		zzrk.transact(6, parcel, parcel1, 0);
	//   16   35:aload_0         
	//   17   36:getfield        #18  <Field IBinder zzrk>
	//   18   39:bipush          6
	//   19   41:aload           4
	//   20   43:aload           5
	//   21   45:iconst_0        
	//   22   46:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   51:pop             
		parcel1.readException();
	//   24   52:aload           5
	//   25   54:invokevirtual   #56  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
	//   26   57:aload           5
	//   27   59:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   28   62:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   29   65:astore          6
		parcel1.recycle();
	//   30   67:aload           5
	//   31   69:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   72:aload           4
	//   33   74:invokevirtual   #68  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   34   77:aload           6
	//   35   79:areturn         
		Exception exception;
		exception;
	//   36   80:astore          6
		parcel1.recycle();
	//   37   82:aload           5
	//   38   84:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   87:aload           4
	//   40   89:invokevirtual   #68  <Method void Parcel.recycle()>
		throw exception;
	//   41   92:aload           6
	//   42   94:athrow          
	}

	public IObjectWrapper zoomIn()
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(1, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_1        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #56  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
	//   17   32:aload_2         
	//   18   33:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   19   36:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   20   39:astore_3        
		parcel1.recycle();
	//   21   40:aload_2         
	//   22   41:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #68  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   25   48:aload_3         
	//   26   49:areturn         
		Exception exception;
		exception;
	//   27   50:astore_3        
		parcel1.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #68  <Method void Parcel.recycle()>
		throw exception;
	//   32   59:aload_3         
	//   33   60:athrow          
	}

	public IObjectWrapper zoomOut()
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(2, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_2        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #56  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
	//   17   32:aload_2         
	//   18   33:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   19   36:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   20   39:astore_3        
		parcel1.recycle();
	//   21   40:aload_2         
	//   22   41:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #68  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   25   48:aload_3         
	//   26   49:areturn         
		Exception exception;
		exception;
	//   27   50:astore_3        
		parcel1.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #68  <Method void Parcel.recycle()>
		throw exception;
	//   32   59:aload_3         
	//   33   60:athrow          
	}

	public IObjectWrapper zoomTo(float f)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   14:aload_2         
	//    8   15:fload_1         
	//    9   16:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
		zzrk.transact(4, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:iconst_4        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #56  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
	//   20   37:aload_3         
	//   21   38:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
	//   22   41:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   23   44:astore          4
		parcel1.recycle();
	//   24   46:aload_3         
	//   25   47:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   26   50:aload_2         
	//   27   51:invokevirtual   #68  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   28   54:aload           4
	//   29   56:areturn         
		Exception exception;
		exception;
	//   30   57:astore          4
		parcel1.recycle();
	//   31   59:aload_3         
	//   32   60:invokevirtual   #68  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   63:aload_2         
	//   34   64:invokevirtual   #68  <Method void Parcel.recycle()>
		throw exception;
	//   35   67:aload           4
	//   36   69:athrow          
	}

	private IBinder zzrk;

	ICameraUpdateFactoryDelegate$zza$zza(IBinder ibinder)
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
