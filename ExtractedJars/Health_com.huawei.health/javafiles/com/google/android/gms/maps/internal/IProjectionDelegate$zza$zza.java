// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IProjectionDelegate

static class IProjectionDelegate$zza$zza
	implements IProjectionDelegate
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public LatLng fromScreenLocation(IObjectWrapper iobjectwrapper)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IProjectionDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(iobjectwrapper == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          97
_L1:
		iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #41  <Method IBinder IObjectWrapper.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
label0:
		{
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #44  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(1, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:iconst_1        
	//   19   38:aload_2         
	//   20   39:aload_3         
	//   21   40:iconst_0        
	//   22   41:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   46:pop             
			parcel1.readException();
	//   24   47:aload_3         
	//   25   48:invokevirtual   #53  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  26   51:aload_3         
	//*  27   52:invokevirtual   #57  <Method int Parcel.readInt()>
	//*  28   55:ifeq            74
			{
				iobjectwrapper = ((IObjectWrapper) ((LatLng)LatLng.CREATOR.createFromParcel(parcel1)));
	//   29   58:getstatic       #63  <Field android.os.Parcelable$Creator LatLng.CREATOR>
	//   30   61:aload_3         
	//   31   62:invokeinterface #69  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   32   67:checkcast       #59  <Class LatLng>
	//   33   70:astore_1        
				break label0;
	//   34   71:goto            76
			}
			iobjectwrapper = null;
	//   35   74:aconst_null     
	//   36   75:astore_1        
		}
		parcel1.recycle();
	//   37   76:aload_3         
	//   38   77:invokevirtual   #72  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   80:aload_2         
	//   40   81:invokevirtual   #72  <Method void Parcel.recycle()>
		return ((LatLng) (iobjectwrapper));
	//   41   84:aload_1         
	//   42   85:areturn         
		iobjectwrapper;
	//   43   86:astore_1        
		parcel1.recycle();
	//   44   87:aload_3         
	//   45   88:invokevirtual   #72  <Method void Parcel.recycle()>
		parcel.recycle();
	//   46   91:aload_2         
	//   47   92:invokevirtual   #72  <Method void Parcel.recycle()>
		throw iobjectwrapper;
	//   48   95:aload_1         
	//   49   96:athrow          
_L2:
		iobjectwrapper = null;
	//   50   97:aconst_null     
	//   51   98:astore_1        
		if(true) goto _L4; else goto _L3
	//   52   99:goto            28
_L3:
	}

	public VisibleRegion getVisibleRegion()
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
		VisibleRegion visibleregion;
label0:
		{
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IProjectionDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(3, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_3        
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
			parcel1.readException();
	//   15   28:aload_3         
	//   16   29:invokevirtual   #53  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   32:aload_3         
	//*  18   33:invokevirtual   #57  <Method int Parcel.readInt()>
	//*  19   36:ifeq            55
			{
				visibleregion = (VisibleRegion)VisibleRegion.CREATOR.createFromParcel(parcel1);
	//   20   39:getstatic       #78  <Field android.os.Parcelable$Creator VisibleRegion.CREATOR>
	//   21   42:aload_3         
	//   22   43:invokeinterface #69  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   48:checkcast       #77  <Class VisibleRegion>
	//   24   51:astore_1        
				break label0;
	//   25   52:goto            57
			}
			visibleregion = null;
	//   26   55:aconst_null     
	//   27   56:astore_1        
		}
		parcel1.recycle();
	//   28   57:aload_3         
	//   29   58:invokevirtual   #72  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   61:aload_2         
	//   31   62:invokevirtual   #72  <Method void Parcel.recycle()>
		return visibleregion;
	//   32   65:aload_1         
	//   33   66:areturn         
		Exception exception;
		exception;
	//   34   67:astore_1        
		parcel1.recycle();
	//   35   68:aload_3         
	//   36   69:invokevirtual   #72  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   72:aload_2         
	//   38   73:invokevirtual   #72  <Method void Parcel.recycle()>
		throw exception;
	//   39   76:aload_1         
	//   40   77:athrow          
	}

	public IObjectWrapper toScreenLocation(LatLng latlng)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IProjectionDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(latlng == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #84  <Method void Parcel.writeInt(int)>
		latlng.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #88  <Method void LatLng.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #84  <Method void Parcel.writeInt(int)>
		zzrk.transact(2, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:iconst_2        
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:iconst_0        
	//   26   45:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   50:pop             
		parcel1.readException();
	//   28   51:aload_3         
	//   29   52:invokevirtual   #53  <Method void Parcel.readException()>
		latlng = ((LatLng) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
	//   30   55:aload_3         
	//   31   56:invokevirtual   #91  <Method IBinder Parcel.readStrongBinder()>
	//   32   59:invokestatic    #97  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   33   62:astore_1        
		parcel1.recycle();
	//   34   63:aload_3         
	//   35   64:invokevirtual   #72  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   67:aload_2         
	//   37   68:invokevirtual   #72  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (latlng));
	//   38   71:aload_1         
	//   39   72:areturn         
		latlng;
	//   40   73:astore_1        
		parcel1.recycle();
	//   41   74:aload_3         
	//   42   75:invokevirtual   #72  <Method void Parcel.recycle()>
		parcel.recycle();
	//   43   78:aload_2         
	//   44   79:invokevirtual   #72  <Method void Parcel.recycle()>
		throw latlng;
	//   45   82:aload_1         
	//   46   83:athrow          
	}

	private IBinder zzrk;

	IProjectionDelegate$zza$zza(IBinder ibinder)
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
