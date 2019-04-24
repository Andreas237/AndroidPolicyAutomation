// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//			zzc

static class zzc$zza$zza
	implements zzc
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public float getBearing()
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
		float f;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(12, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          12
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		f = parcel1.readFloat();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #49  <Method float Parcel.readFloat()>
	//   19   37:fstore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return f;
	//   24   46:fload_1         
	//   25   47:freturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public LatLngBounds getBounds()
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
		LatLngBounds latlngbounds;
label0:
		{
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(10, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          10
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #59  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				latlngbounds = (LatLngBounds)LatLngBounds.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #65  <Field android.os.Parcelable$Creator LatLngBounds.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #71  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #61  <Class LatLngBounds>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			latlngbounds = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #52  <Method void Parcel.recycle()>
		return latlngbounds;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public float getHeight()
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
		float f;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(8, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          8
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		f = parcel1.readFloat();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #49  <Method float Parcel.readFloat()>
	//   19   37:fstore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return f;
	//   24   46:fload_1         
	//   25   47:freturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public String getId()
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
		String s;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(2, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_2        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #77  <Method String Parcel.readString()>
	//   19   36:astore_3        
		parcel1.recycle();
	//   20   37:aload_2         
	//   21   38:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_1         
	//   23   42:invokevirtual   #52  <Method void Parcel.recycle()>
		return s;
	//   24   45:aload_3         
	//   25   46:areturn         
		Exception exception;
		exception;
	//   26   47:astore_3        
		parcel1.recycle();
	//   27   48:aload_2         
	//   28   49:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   52:aload_1         
	//   30   53:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   56:aload_3         
	//   32   57:athrow          
	}

	public LatLng getPosition()
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
		LatLng latlng;
label0:
		{
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(4, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_4        
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
			parcel1.readException();
	//   15   28:aload_3         
	//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   32:aload_3         
	//*  18   33:invokevirtual   #59  <Method int Parcel.readInt()>
	//*  19   36:ifeq            55
			{
				latlng = (LatLng)LatLng.CREATOR.createFromParcel(parcel1);
	//   20   39:getstatic       #82  <Field android.os.Parcelable$Creator LatLng.CREATOR>
	//   21   42:aload_3         
	//   22   43:invokeinterface #71  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   48:checkcast       #81  <Class LatLng>
	//   24   51:astore_1        
				break label0;
	//   25   52:goto            57
			}
			latlng = null;
	//   26   55:aconst_null     
	//   27   56:astore_1        
		}
		parcel1.recycle();
	//   28   57:aload_3         
	//   29   58:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   61:aload_2         
	//   31   62:invokevirtual   #52  <Method void Parcel.recycle()>
		return latlng;
	//   32   65:aload_1         
	//   33   66:areturn         
		Exception exception;
		exception;
	//   34   67:astore_1        
		parcel1.recycle();
	//   35   68:aload_3         
	//   36   69:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   72:aload_2         
	//   38   73:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   39   76:aload_1         
	//   40   77:athrow          
	}

	public IObjectWrapper getTag()
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(25, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          25
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.er.zza.zzcd(parcel1.readStrongBinder());
	//   17   33:aload_2         
	//   18   34:invokevirtual   #87  <Method IBinder Parcel.readStrongBinder()>
	//   19   37:invokestatic    #93  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   20   40:astore_3        
		parcel1.recycle();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #52  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   25   49:aload_3         
	//   26   50:areturn         
		Exception exception;
		exception;
	//   27   51:astore_3        
		parcel1.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   56:aload_1         
	//   31   57:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   32   60:aload_3         
	//   33   61:athrow          
	}

	public float getTransparency()
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
		float f;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(18, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          18
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		f = parcel1.readFloat();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #49  <Method float Parcel.readFloat()>
	//   19   37:fstore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return f;
	//   24   46:fload_1         
	//   25   47:freturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public float getWidth()
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
		float f;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(7, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          7
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		f = parcel1.readFloat();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #49  <Method float Parcel.readFloat()>
	//   19   37:fstore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return f;
	//   24   46:fload_1         
	//   25   47:freturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public float getZIndex()
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
		float f;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(14, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          14
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		f = parcel1.readFloat();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #49  <Method float Parcel.readFloat()>
	//   19   37:fstore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return f;
	//   24   46:fload_1         
	//   25   47:freturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int hashCodeRemote()
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
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(20, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          20
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #59  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public boolean isClickable()
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
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(23, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field IBinder zzrk>
	//    9   19:bipush          23
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #59  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #52  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isVisible()
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
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(16, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field IBinder zzrk>
	//    9   19:bipush          16
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #59  <Method int Parcel.readInt()>
	//   19   41:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   42:iload_1         
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_2        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_2        
		parcel1.recycle();
	//   27   53:aload           4
	//   28   55:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #52  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public void remove()
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(1, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_1        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   21   40:return          
		Exception exception;
		exception;
	//   22   41:astore_3        
		parcel1.recycle();
	//   23   42:aload_2         
	//   24   43:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   46:aload_1         
	//   26   47:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   27   50:aload_3         
	//   28   51:athrow          
	}

	public void setBearing(float f)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   14:aload_2         
	//    8   15:fload_1         
	//    9   16:invokevirtual   #106 <Method void Parcel.writeFloat(float)>
		zzrk.transact(11, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          11
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void setClickable(boolean flag)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            74
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #112 <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:bipush          22
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:iconst_0        
	//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   44:pop             
	//*  23   45:aload           4
	//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  27   55:aload_3         
	//*  28   56:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  29   59:return          
	//*  30   60:astore          5
	//*  31   62:aload           4
	//*  32   64:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  33   67:aload_3         
	//*  34   68:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  35   71:aload           5
	//*  36   73:athrow          
			i = 0;
	//   37   74:iconst_0        
	//   38   75:istore_2        
		parcel.writeInt(i);
		zzrk.transact(22, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  39   76:goto            24
	}

	public void setDimensions(float f)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   14:aload_2         
	//    8   15:fload_1         
	//    9   16:invokevirtual   #106 <Method void Parcel.writeFloat(float)>
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
		parcel1.recycle();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_2         
	//   23   42:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   45:return          
		Exception exception;
		exception;
	//   25   46:astore          4
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   56:aload           4
	//   31   58:athrow          
	}

	public void setPosition(LatLng latlng)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(latlng == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #112 <Method void Parcel.writeInt(int)>
		latlng.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #119 <Method void LatLng.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #112 <Method void Parcel.writeInt(int)>
		zzrk.transact(3, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:iconst_3        
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:iconst_0        
	//   26   45:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   50:pop             
		parcel1.readException();
	//   28   51:aload_3         
	//   29   52:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   55:aload_3         
	//   31   56:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   59:aload_2         
	//   33   60:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   34   63:return          
		latlng;
	//   35   64:astore_1        
		parcel1.recycle();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #52  <Method void Parcel.recycle()>
		throw latlng;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	public void setPositionFromBounds(LatLngBounds latlngbounds)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(latlngbounds == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #112 <Method void Parcel.writeInt(int)>
		latlngbounds.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #122 <Method void LatLngBounds.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #112 <Method void Parcel.writeInt(int)>
		zzrk.transact(9, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:bipush          9
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   56:aload_3         
	//   31   57:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   34   64:return          
		latlngbounds;
	//   35   65:astore_1        
		parcel1.recycle();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #52  <Method void Parcel.recycle()>
		throw latlngbounds;
	//   40   74:aload_1         
	//   41   75:athrow          
	}

	public void setTag(IObjectWrapper iobjectwrapper)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(iobjectwrapper == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          72
_L1:
		iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #128 <Method IBinder IObjectWrapper.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #131 <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(24, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:bipush          24
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:iconst_0        
	//   22   42:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   47:pop             
		parcel1.readException();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   52:aload_3         
	//   27   53:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   56:aload_2         
	//   29   57:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   30   60:return          
		iobjectwrapper;
	//   31   61:astore_1        
		parcel1.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_2         
	//   35   67:invokevirtual   #52  <Method void Parcel.recycle()>
		throw iobjectwrapper;
	//   36   70:aload_1         
	//   37   71:athrow          
_L2:
		iobjectwrapper = null;
	//   38   72:aconst_null     
	//   39   73:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   74:goto            28
_L3:
	}

	public void setTransparency(float f)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   14:aload_2         
	//    8   15:fload_1         
	//    9   16:invokevirtual   #106 <Method void Parcel.writeFloat(float)>
		zzrk.transact(17, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          17
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void setVisible(boolean flag)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            74
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #112 <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:bipush          15
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:iconst_0        
	//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   44:pop             
	//*  23   45:aload           4
	//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  27   55:aload_3         
	//*  28   56:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  29   59:return          
	//*  30   60:astore          5
	//*  31   62:aload           4
	//*  32   64:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  33   67:aload_3         
	//*  34   68:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  35   71:aload           5
	//*  36   73:athrow          
			i = 0;
	//   37   74:iconst_0        
	//   38   75:istore_2        
		parcel.writeInt(i);
		zzrk.transact(15, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  39   76:goto            24
	}

	public void setZIndex(float f)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   14:aload_2         
	//    8   15:fload_1         
	//    9   16:invokevirtual   #106 <Method void Parcel.writeFloat(float)>
		zzrk.transact(13, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          13
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void zzL(IObjectWrapper iobjectwrapper)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(iobjectwrapper == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          72
_L1:
		iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #128 <Method IBinder IObjectWrapper.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #131 <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(21, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:bipush          21
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:iconst_0        
	//   22   42:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   47:pop             
		parcel1.readException();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   52:aload_3         
	//   27   53:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   56:aload_2         
	//   29   57:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   30   60:return          
		iobjectwrapper;
	//   31   61:astore_1        
		parcel1.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_2         
	//   35   67:invokevirtual   #52  <Method void Parcel.recycle()>
		throw iobjectwrapper;
	//   36   70:aload_1         
	//   37   71:athrow          
_L2:
		iobjectwrapper = null;
	//   38   72:aconst_null     
	//   39   73:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   74:goto            28
_L3:
	}

	public boolean zzb(zzc zzc1)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4   10:aload           4
	//    5   12:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(zzc1 == null) goto _L2; else goto _L1
	//    7   17:aload_1         
	//    8   18:ifnull          101
_L1:
		zzc1 = ((zzc) (zzc1.asBinder()));
	//    9   21:aload_1         
	//   10   22:invokeinterface #138 <Method IBinder zzc.asBinder()>
	//   11   27:astore_1        
	//*  12   28:goto            31
_L4:
		int i;
		parcel.writeStrongBinder(((IBinder) (zzc1)));
	//   13   31:aload           4
	//   14   33:aload_1         
	//   15   34:invokevirtual   #131 <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(19, parcel, parcel1, 0);
	//   16   37:aload_0         
	//   17   38:getfield        #18  <Field IBinder zzrk>
	//   18   41:bipush          19
	//   19   43:aload           4
	//   20   45:aload           5
	//   21   47:iconst_0        
	//   22   48:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   53:pop             
		parcel1.readException();
	//   24   54:aload           5
	//   25   56:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   26   59:aload           5
	//   27   61:invokevirtual   #59  <Method int Parcel.readInt()>
	//   28   64:istore_2        
		boolean flag;
		if(i != 0)
	//*  29   65:iload_2         
	//*  30   66:ifeq            74
			flag = true;
	//   31   69:iconst_1        
	//   32   70:istore_3        
		else
	//*  33   71:goto            76
			flag = false;
	//   34   74:iconst_0        
	//   35   75:istore_3        
		parcel1.recycle();
	//   36   76:aload           5
	//   37   78:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   81:aload           4
	//   39   83:invokevirtual   #52  <Method void Parcel.recycle()>
		return flag;
	//   40   86:iload_3         
	//   41   87:ireturn         
		zzc1;
	//   42   88:astore_1        
		parcel1.recycle();
	//   43   89:aload           5
	//   44   91:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   94:aload           4
	//   46   96:invokevirtual   #52  <Method void Parcel.recycle()>
		throw zzc1;
	//   47   99:aload_1         
	//   48  100:athrow          
_L2:
		zzc1 = null;
	//   49  101:aconst_null     
	//   50  102:astore_1        
		if(true) goto _L4; else goto _L3
	//   51  103:goto            31
_L3:
	}

	public void zzg(float f, float f1)
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
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   15:aload_3         
	//    8   16:fload_1         
	//    9   17:invokevirtual   #106 <Method void Parcel.writeFloat(float)>
		parcel.writeFloat(f1);
	//   10   20:aload_3         
	//   11   21:fload_2         
	//   12   22:invokevirtual   #106 <Method void Parcel.writeFloat(float)>
		zzrk.transact(6, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #18  <Field IBinder zzrk>
	//   15   29:bipush          6
	//   16   31:aload_3         
	//   17   32:aload           4
	//   18   34:iconst_0        
	//   19   35:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   40:pop             
		parcel1.readException();
	//   21   41:aload           4
	//   22   43:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   46:aload           4
	//   24   48:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   51:aload_3         
	//   26   52:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   27   55:return          
		Exception exception;
		exception;
	//   28   56:astore          5
		parcel1.recycle();
	//   29   58:aload           4
	//   30   60:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   63:aload_3         
	//   32   64:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   33   67:aload           5
	//   34   69:athrow          
	}

	private IBinder zzrk;

	zzc$zza$zza(IBinder ibinder)
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
