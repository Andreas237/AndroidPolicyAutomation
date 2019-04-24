// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.*;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IStreetViewPanoramaDelegate, zzab, zzac, zzad, 
//			zzae

static class IStreetViewPanoramaDelegate$zza$zza
	implements IStreetViewPanoramaDelegate
{

	public void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4   10:aload           4
	//    5   12:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   14:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(streetviewpanoramacamera == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           4
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		streetviewpanoramacamera.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #45  <Method void StreetViewPanoramaCamera.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           4
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		parcel.writeLong(l);
	//   20   43:aload           4
	//   21   45:lload_2         
	//   22   46:invokevirtual   #49  <Method void Parcel.writeLong(long)>
		zzrk.transact(9, parcel, parcel1, 0);
	//   23   49:aload_0         
	//   24   50:getfield        #18  <Field IBinder zzrk>
	//   25   53:bipush          9
	//   26   55:aload           4
	//   27   57:aload           5
	//   28   59:iconst_0        
	//   29   60:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   65:pop             
		parcel1.readException();
	//   31   66:aload           5
	//   32   68:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   71:aload           5
	//   34   73:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   76:aload           4
	//   36   78:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   37   81:return          
		streetviewpanoramacamera;
	//   38   82:astore_1        
		parcel1.recycle();
	//   39   83:aload           5
	//   40   85:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   88:aload           4
	//   42   90:invokevirtual   #61  <Method void Parcel.recycle()>
		throw streetviewpanoramacamera;
	//   43   93:aload_1         
	//   44   94:athrow          
	}

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void enablePanning(boolean flag)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            73
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #39  <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:iconst_2        
	//*  18   34:aload_3         
	//*  19   35:aload           4
	//*  20   37:iconst_0        
	//*  21   38:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   43:pop             
	//*  23   44:aload           4
	//*  24   46:invokevirtual   #58  <Method void Parcel.readException()>
	//*  25   49:aload           4
	//*  26   51:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  27   54:aload_3         
	//*  28   55:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  29   58:return          
	//*  30   59:astore          5
	//*  31   61:aload           4
	//*  32   63:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  33   66:aload_3         
	//*  34   67:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  35   70:aload           5
	//*  36   72:athrow          
			i = 0;
	//   37   73:iconst_0        
	//   38   74:istore_2        
		parcel.writeInt(i);
		zzrk.transact(2, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  39   75:goto            24
	}

	public void enableStreetNames(boolean flag)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            73
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #39  <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:iconst_4        
	//*  18   34:aload_3         
	//*  19   35:aload           4
	//*  20   37:iconst_0        
	//*  21   38:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   43:pop             
	//*  23   44:aload           4
	//*  24   46:invokevirtual   #58  <Method void Parcel.readException()>
	//*  25   49:aload           4
	//*  26   51:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  27   54:aload_3         
	//*  28   55:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  29   58:return          
	//*  30   59:astore          5
	//*  31   61:aload           4
	//*  32   63:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  33   66:aload_3         
	//*  34   67:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  35   70:aload           5
	//*  36   72:athrow          
			i = 0;
	//   37   73:iconst_0        
	//   38   74:istore_2        
		parcel.writeInt(i);
		zzrk.transact(4, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  39   75:goto            24
	}

	public void enableUserNavigation(boolean flag)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            73
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #39  <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:iconst_3        
	//*  18   34:aload_3         
	//*  19   35:aload           4
	//*  20   37:iconst_0        
	//*  21   38:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   43:pop             
	//*  23   44:aload           4
	//*  24   46:invokevirtual   #58  <Method void Parcel.readException()>
	//*  25   49:aload           4
	//*  26   51:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  27   54:aload_3         
	//*  28   55:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  29   58:return          
	//*  30   59:astore          5
	//*  31   61:aload           4
	//*  32   63:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  33   66:aload_3         
	//*  34   67:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  35   70:aload           5
	//*  36   72:athrow          
			i = 0;
	//   37   73:iconst_0        
	//   38   74:istore_2        
		parcel.writeInt(i);
		zzrk.transact(3, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  39   75:goto            24
	}

	public void enableZoom(boolean flag)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            73
			i = 1;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            24
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #39  <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:iconst_1        
	//*  18   34:aload_3         
	//*  19   35:aload           4
	//*  20   37:iconst_0        
	//*  21   38:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   43:pop             
	//*  23   44:aload           4
	//*  24   46:invokevirtual   #58  <Method void Parcel.readException()>
	//*  25   49:aload           4
	//*  26   51:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  27   54:aload_3         
	//*  28   55:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  29   58:return          
	//*  30   59:astore          5
	//*  31   61:aload           4
	//*  32   63:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  33   66:aload_3         
	//*  34   67:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  35   70:aload           5
	//*  36   72:athrow          
			i = 0;
	//   37   73:iconst_0        
	//   38   74:istore_2        
		parcel.writeInt(i);
		zzrk.transact(1, parcel, parcel1, 0);
		parcel1.readException();
		parcel1.recycle();
		parcel.recycle();
		return;
		exception;
		parcel1.recycle();
		parcel.recycle();
		throw exception;
	//*  39   75:goto            24
	}

	public StreetViewPanoramaCamera getPanoramaCamera()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		StreetViewPanoramaCamera streetviewpanoramacamera;
label0:
		{
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(10, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          10
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #58  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				streetviewpanoramacamera = (StreetViewPanoramaCamera)StreetViewPanoramaCamera.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #79  <Field android.os.Parcelable$Creator StreetViewPanoramaCamera.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #85  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #41  <Class StreetViewPanoramaCamera>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			streetviewpanoramacamera = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #61  <Method void Parcel.recycle()>
		return streetviewpanoramacamera;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public StreetViewPanoramaLocation getStreetViewPanoramaLocation()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		StreetViewPanoramaLocation streetviewpanoramalocation;
label0:
		{
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(14, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          14
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #58  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				streetviewpanoramalocation = (StreetViewPanoramaLocation)StreetViewPanoramaLocation.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #90  <Field android.os.Parcelable$Creator StreetViewPanoramaLocation.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #85  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #89  <Class StreetViewPanoramaLocation>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			streetviewpanoramalocation = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #61  <Method void Parcel.recycle()>
		return streetviewpanoramalocation;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public boolean isPanningGesturesEnabled()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(6, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field IBinder zzrk>
	//    9   19:bipush          6
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #58  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #75  <Method int Parcel.readInt()>
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
	//   28   55:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #61  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isStreetNamesEnabled()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(8, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field IBinder zzrk>
	//    9   19:bipush          8
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #58  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #75  <Method int Parcel.readInt()>
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
	//   28   55:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #61  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isUserNavigationEnabled()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(7, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field IBinder zzrk>
	//    9   19:bipush          7
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #58  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #75  <Method int Parcel.readInt()>
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
	//   28   55:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #61  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isZoomGesturesEnabled()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(5, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field IBinder zzrk>
	//    9   19:iconst_5        
	//   10   20:aload_3         
	//   11   21:aload           4
	//   12   23:iconst_0        
	//   13   24:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   29:pop             
		parcel1.readException();
	//   15   30:aload           4
	//   16   32:invokevirtual   #58  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   35:aload           4
	//   18   37:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   40:istore_1        
		boolean flag;
		if(i != 0)
	//*  20   41:iload_1         
	//*  21   42:ifeq            50
			flag = true;
	//   22   45:iconst_1        
	//   23   46:istore_2        
		else
	//*  24   47:goto            52
			flag = false;
	//   25   50:iconst_0        
	//   26   51:istore_2        
		parcel1.recycle();
	//   27   52:aload           4
	//   28   54:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   57:aload_3         
	//   30   58:invokevirtual   #61  <Method void Parcel.recycle()>
		return flag;
	//   31   61:iload_2         
	//   32   62:ireturn         
		Exception exception;
		exception;
	//   33   63:astore          5
		parcel1.recycle();
	//   34   65:aload           4
	//   35   67:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   70:aload_3         
	//   37   71:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   38   74:aload           5
	//   39   76:athrow          
	}

	public IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(streetviewpanoramaorientation == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		streetviewpanoramaorientation.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #100 <Method void StreetViewPanoramaOrientation.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		zzrk.transact(19, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:bipush          19
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #58  <Method void Parcel.readException()>
		streetviewpanoramaorientation = ((StreetViewPanoramaOrientation) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
	//   30   56:aload_3         
	//   31   57:invokevirtual   #103 <Method IBinder Parcel.readStrongBinder()>
	//   32   60:invokestatic    #109 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   33   63:astore_1        
		parcel1.recycle();
	//   34   64:aload_3         
	//   35   65:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   68:aload_2         
	//   37   69:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (streetviewpanoramaorientation));
	//   38   72:aload_1         
	//   39   73:areturn         
		streetviewpanoramaorientation;
	//   40   74:astore_1        
		parcel1.recycle();
	//   41   75:aload_3         
	//   42   76:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   43   79:aload_2         
	//   44   80:invokevirtual   #61  <Method void Parcel.recycle()>
		throw streetviewpanoramaorientation;
	//   45   83:aload_1         
	//   46   84:athrow          
	}

	public StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(iobjectwrapper == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          98
_L1:
		iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #115 <Method IBinder IObjectWrapper.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
label0:
		{
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #118 <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(18, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:bipush          18
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:iconst_0        
	//   22   42:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   47:pop             
			parcel1.readException();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #58  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  26   52:aload_3         
	//*  27   53:invokevirtual   #75  <Method int Parcel.readInt()>
	//*  28   56:ifeq            75
			{
				iobjectwrapper = ((IObjectWrapper) ((StreetViewPanoramaOrientation)StreetViewPanoramaOrientation.CREATOR.createFromParcel(parcel1)));
	//   29   59:getstatic       #119 <Field android.os.Parcelable$Creator StreetViewPanoramaOrientation.CREATOR>
	//   30   62:aload_3         
	//   31   63:invokeinterface #85  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   32   68:checkcast       #99  <Class StreetViewPanoramaOrientation>
	//   33   71:astore_1        
				break label0;
	//   34   72:goto            77
			}
			iobjectwrapper = null;
	//   35   75:aconst_null     
	//   36   76:astore_1        
		}
		parcel1.recycle();
	//   37   77:aload_3         
	//   38   78:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   81:aload_2         
	//   40   82:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((StreetViewPanoramaOrientation) (iobjectwrapper));
	//   41   85:aload_1         
	//   42   86:areturn         
		iobjectwrapper;
	//   43   87:astore_1        
		parcel1.recycle();
	//   44   88:aload_3         
	//   45   89:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   46   92:aload_2         
	//   47   93:invokevirtual   #61  <Method void Parcel.recycle()>
		throw iobjectwrapper;
	//   48   96:aload_1         
	//   49   97:athrow          
_L2:
		iobjectwrapper = null;
	//   50   98:aconst_null     
	//   51   99:astore_1        
		if(true) goto _L4; else goto _L3
	//   52  100:goto            28
_L3:
	}

	public void setOnStreetViewPanoramaCameraChangeListener(zzab zzab1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(zzab1 == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          72
_L1:
		zzab1 = ((zzab) (zzab1.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #124 <Method IBinder zzab.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (zzab1)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #118 <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(16, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:bipush          16
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:iconst_0        
	//   22   42:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   47:pop             
		parcel1.readException();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   52:aload_3         
	//   27   53:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   56:aload_2         
	//   29   57:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   30   60:return          
		zzab1;
	//   31   61:astore_1        
		parcel1.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_2         
	//   35   67:invokevirtual   #61  <Method void Parcel.recycle()>
		throw zzab1;
	//   36   70:aload_1         
	//   37   71:athrow          
_L2:
		zzab1 = null;
	//   38   72:aconst_null     
	//   39   73:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   74:goto            28
_L3:
	}

	public void setOnStreetViewPanoramaChangeListener(zzac zzac1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(zzac1 == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          72
_L1:
		zzac1 = ((zzac) (zzac1.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #129 <Method IBinder zzac.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (zzac1)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #118 <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(15, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:bipush          15
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:iconst_0        
	//   22   42:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   47:pop             
		parcel1.readException();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   52:aload_3         
	//   27   53:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   56:aload_2         
	//   29   57:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   30   60:return          
		zzac1;
	//   31   61:astore_1        
		parcel1.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_2         
	//   35   67:invokevirtual   #61  <Method void Parcel.recycle()>
		throw zzac1;
	//   36   70:aload_1         
	//   37   71:athrow          
_L2:
		zzac1 = null;
	//   38   72:aconst_null     
	//   39   73:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   74:goto            28
_L3:
	}

	public void setOnStreetViewPanoramaClickListener(zzad zzad1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(zzad1 == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          72
_L1:
		zzad1 = ((zzad) (zzad1.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #134 <Method IBinder zzad.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (zzad1)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #118 <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(17, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:bipush          17
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:iconst_0        
	//   22   42:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   47:pop             
		parcel1.readException();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   52:aload_3         
	//   27   53:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   56:aload_2         
	//   29   57:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   30   60:return          
		zzad1;
	//   31   61:astore_1        
		parcel1.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_2         
	//   35   67:invokevirtual   #61  <Method void Parcel.recycle()>
		throw zzad1;
	//   36   70:aload_1         
	//   37   71:athrow          
_L2:
		zzad1 = null;
	//   38   72:aconst_null     
	//   39   73:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   74:goto            28
_L3:
	}

	public void setOnStreetViewPanoramaLongClickListener(zzae zzae1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(zzae1 == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          72
_L1:
		zzae1 = ((zzae) (zzae1.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #139 <Method IBinder zzae.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (zzae1)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #118 <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(20, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:bipush          20
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:iconst_0        
	//   22   42:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   47:pop             
		parcel1.readException();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   52:aload_3         
	//   27   53:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   56:aload_2         
	//   29   57:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   30   60:return          
		zzae1;
	//   31   61:astore_1        
		parcel1.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_2         
	//   35   67:invokevirtual   #61  <Method void Parcel.recycle()>
		throw zzae1;
	//   36   70:aload_1         
	//   37   71:athrow          
_L2:
		zzae1 = null;
	//   38   72:aconst_null     
	//   39   73:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   74:goto            28
_L3:
	}

	public void setPosition(LatLng latlng)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(latlng == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		latlng.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #144 <Method void LatLng.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		zzrk.transact(12, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:bipush          12
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   56:aload_3         
	//   31   57:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   34   64:return          
		latlng;
	//   35   65:astore_1        
		parcel1.recycle();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #61  <Method void Parcel.recycle()>
		throw latlng;
	//   40   74:aload_1         
	//   41   75:athrow          
	}

	public void setPositionWithID(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #148 <Method void Parcel.writeString(String)>
		zzrk.transact(11, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          11
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		s;
	//   25   47:astore_1        
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #61  <Method void Parcel.recycle()>
		throw s;
	//   30   56:aload_1         
	//   31   57:athrow          
	}

	public void setPositionWithRadius(LatLng latlng, int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(latlng == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		latlng.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #144 <Method void LatLng.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   20   38:aload_3         
	//   21   39:iload_2         
	//   22   40:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		zzrk.transact(13, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #18  <Field IBinder zzrk>
	//   25   47:bipush          13
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:iconst_0        
	//   29   53:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   58:pop             
		parcel1.readException();
	//   31   59:aload           4
	//   32   61:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   64:aload           4
	//   34   66:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   37   73:return          
		latlng;
	//   38   74:astore_1        
		parcel1.recycle();
	//   39   75:aload           4
	//   40   77:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   80:aload_3         
	//   42   81:invokevirtual   #61  <Method void Parcel.recycle()>
		throw latlng;
	//   43   84:aload_1         
	//   44   85:athrow          
	}

	private IBinder zzrk;

	IStreetViewPanoramaDelegate$zza$zza(IBinder ibinder)
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
