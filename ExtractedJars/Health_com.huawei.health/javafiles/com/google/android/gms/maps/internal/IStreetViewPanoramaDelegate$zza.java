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

public static abstract class IStreetViewPanoramaDelegate$zza extends Binder
	implements IStreetViewPanoramaDelegate
{
	static class zza
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


	public static IStreetViewPanoramaDelegate zzed(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IStreetViewPanoramaDelegate))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IStreetViewPanoramaDelegate>
	//*  12   23:ifeq            31
			return (IStreetViewPanoramaDelegate)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IStreetViewPanoramaDelegate>
	//   15   30:areturn         
		else
			return ((IStreetViewPanoramaDelegate) (new zza(ibinder)));
	//   16   31:new             #9   <Class IStreetViewPanoramaDelegate$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void IStreetViewPanoramaDelegate$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    21: default 180
	//	               1: 191
	//	               2: 225
	//	               3: 259
	//	               4: 293
	//	               5: 327
	//	               6: 362
	//	               7: 397
	//	               8: 432
	//	               9: 467
	//	               10: 516
	//	               11: 556
	//	               12: 576
	//	               13: 618
	//	               14: 667
	//	               15: 707
	//	               16: 730
	//	               17: 753
	//	               18: 776
	//	               19: 823
	//	               20: 887
	//	               1598968902: 183
	//*   2  180:goto            910
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    3  183:aload_3         
	//    4  184:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//    5  186:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6  189:iconst_1        
	//    7  190:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//    8  191:aload_2         
	//    9  192:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//   10  194:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag;
			if(parcel.readInt() != 0)
	//*  11  197:aload_2         
	//*  12  198:invokevirtual   #41  <Method int Parcel.readInt()>
	//*  13  201:ifeq            210
				flag = true;
	//   14  204:iconst_1        
	//   15  205:istore          5
			else
	//*  16  207:goto            213
				flag = false;
	//   17  210:iconst_0        
	//   18  211:istore          5
			enableZoom(flag);
	//   19  213:aload_0         
	//   20  214:iload           5
	//   21  216:invokevirtual   #45  <Method void enableZoom(boolean)>
			parcel1.writeNoException();
	//   22  219:aload_3         
	//   23  220:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//   24  223:iconst_1        
	//   25  224:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//   26  225:aload_2         
	//   27  226:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//   28  228:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag1;
			if(parcel.readInt() != 0)
	//*  29  231:aload_2         
	//*  30  232:invokevirtual   #41  <Method int Parcel.readInt()>
	//*  31  235:ifeq            244
				flag1 = true;
	//   32  238:iconst_1        
	//   33  239:istore          5
			else
	//*  34  241:goto            247
				flag1 = false;
	//   35  244:iconst_0        
	//   36  245:istore          5
			enablePanning(flag1);
	//   37  247:aload_0         
	//   38  248:iload           5
	//   39  250:invokevirtual   #52  <Method void enablePanning(boolean)>
			parcel1.writeNoException();
	//   40  253:aload_3         
	//   41  254:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//   42  257:iconst_1        
	//   43  258:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//   44  259:aload_2         
	//   45  260:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//   46  262:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag2;
			if(parcel.readInt() != 0)
	//*  47  265:aload_2         
	//*  48  266:invokevirtual   #41  <Method int Parcel.readInt()>
	//*  49  269:ifeq            278
				flag2 = true;
	//   50  272:iconst_1        
	//   51  273:istore          5
			else
	//*  52  275:goto            281
				flag2 = false;
	//   53  278:iconst_0        
	//   54  279:istore          5
			enableUserNavigation(flag2);
	//   55  281:aload_0         
	//   56  282:iload           5
	//   57  284:invokevirtual   #55  <Method void enableUserNavigation(boolean)>
			parcel1.writeNoException();
	//   58  287:aload_3         
	//   59  288:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//   60  291:iconst_1        
	//   61  292:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//   62  293:aload_2         
	//   63  294:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//   64  296:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag3;
			if(parcel.readInt() != 0)
	//*  65  299:aload_2         
	//*  66  300:invokevirtual   #41  <Method int Parcel.readInt()>
	//*  67  303:ifeq            312
				flag3 = true;
	//   68  306:iconst_1        
	//   69  307:istore          5
			else
	//*  70  309:goto            315
				flag3 = false;
	//   71  312:iconst_0        
	//   72  313:istore          5
			enableStreetNames(flag3);
	//   73  315:aload_0         
	//   74  316:iload           5
	//   75  318:invokevirtual   #58  <Method void enableStreetNames(boolean)>
			parcel1.writeNoException();
	//   76  321:aload_3         
	//   77  322:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//   78  325:iconst_1        
	//   79  326:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//   80  327:aload_2         
	//   81  328:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//   82  330:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag4 = isZoomGesturesEnabled();
	//   83  333:aload_0         
	//   84  334:invokevirtual   #62  <Method boolean isZoomGesturesEnabled()>
	//   85  337:istore          5
			parcel1.writeNoException();
	//   86  339:aload_3         
	//   87  340:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(flag4)
	//*  88  343:iload           5
	//*  89  345:ifeq            353
				i = 1;
	//   90  348:iconst_1        
	//   91  349:istore_1        
			else
	//*  92  350:goto            355
				i = 0;
	//   93  353:iconst_0        
	//   94  354:istore_1        
			parcel1.writeInt(i);
	//   95  355:aload_3         
	//   96  356:iload_1         
	//   97  357:invokevirtual   #66  <Method void Parcel.writeInt(int)>
			return true;
	//   98  360:iconst_1        
	//   99  361:ireturn         

		case 6: // '\006'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  100  362:aload_2         
	//  101  363:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  102  365:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag5 = isPanningGesturesEnabled();
	//  103  368:aload_0         
	//  104  369:invokevirtual   #69  <Method boolean isPanningGesturesEnabled()>
	//  105  372:istore          5
			parcel1.writeNoException();
	//  106  374:aload_3         
	//  107  375:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(flag5)
	//* 108  378:iload           5
	//* 109  380:ifeq            388
				i = 1;
	//  110  383:iconst_1        
	//  111  384:istore_1        
			else
	//* 112  385:goto            390
				i = 0;
	//  113  388:iconst_0        
	//  114  389:istore_1        
			parcel1.writeInt(i);
	//  115  390:aload_3         
	//  116  391:iload_1         
	//  117  392:invokevirtual   #66  <Method void Parcel.writeInt(int)>
			return true;
	//  118  395:iconst_1        
	//  119  396:ireturn         

		case 7: // '\007'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  120  397:aload_2         
	//  121  398:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  122  400:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag6 = isUserNavigationEnabled();
	//  123  403:aload_0         
	//  124  404:invokevirtual   #72  <Method boolean isUserNavigationEnabled()>
	//  125  407:istore          5
			parcel1.writeNoException();
	//  126  409:aload_3         
	//  127  410:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(flag6)
	//* 128  413:iload           5
	//* 129  415:ifeq            423
				i = 1;
	//  130  418:iconst_1        
	//  131  419:istore_1        
			else
	//* 132  420:goto            425
				i = 0;
	//  133  423:iconst_0        
	//  134  424:istore_1        
			parcel1.writeInt(i);
	//  135  425:aload_3         
	//  136  426:iload_1         
	//  137  427:invokevirtual   #66  <Method void Parcel.writeInt(int)>
			return true;
	//  138  430:iconst_1        
	//  139  431:ireturn         

		case 8: // '\b'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  140  432:aload_2         
	//  141  433:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  142  435:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag7 = isStreetNamesEnabled();
	//  143  438:aload_0         
	//  144  439:invokevirtual   #75  <Method boolean isStreetNamesEnabled()>
	//  145  442:istore          5
			parcel1.writeNoException();
	//  146  444:aload_3         
	//  147  445:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(flag7)
	//* 148  448:iload           5
	//* 149  450:ifeq            458
				i = 1;
	//  150  453:iconst_1        
	//  151  454:istore_1        
			else
	//* 152  455:goto            460
				i = 0;
	//  153  458:iconst_0        
	//  154  459:istore_1        
			parcel1.writeInt(i);
	//  155  460:aload_3         
	//  156  461:iload_1         
	//  157  462:invokevirtual   #66  <Method void Parcel.writeInt(int)>
			return true;
	//  158  465:iconst_1        
	//  159  466:ireturn         

		case 9: // '\t'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  160  467:aload_2         
	//  161  468:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  162  470:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			StreetViewPanoramaCamera streetviewpanoramacamera;
			if(parcel.readInt() != 0)
	//* 163  473:aload_2         
	//* 164  474:invokevirtual   #41  <Method int Parcel.readInt()>
	//* 165  477:ifeq            497
				streetviewpanoramacamera = (StreetViewPanoramaCamera)StreetViewPanoramaCamera.CREATOR.createFromParcel(parcel);
	//  166  480:getstatic       #81  <Field android.os.Parcelable$Creator StreetViewPanoramaCamera.CREATOR>
	//  167  483:aload_2         
	//  168  484:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  169  489:checkcast       #77  <Class StreetViewPanoramaCamera>
	//  170  492:astore          6
			else
	//* 171  494:goto            500
				streetviewpanoramacamera = null;
	//  172  497:aconst_null     
	//  173  498:astore          6
			animateTo(streetviewpanoramacamera, parcel.readLong());
	//  174  500:aload_0         
	//  175  501:aload           6
	//  176  503:aload_2         
	//  177  504:invokevirtual   #91  <Method long Parcel.readLong()>
	//  178  507:invokevirtual   #95  <Method void animateTo(StreetViewPanoramaCamera, long)>
			parcel1.writeNoException();
	//  179  510:aload_3         
	//  180  511:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//  181  514:iconst_1        
	//  182  515:ireturn         

		case 10: // '\n'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  183  516:aload_2         
	//  184  517:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  185  519:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getPanoramaCamera()));
	//  186  522:aload_0         
	//  187  523:invokevirtual   #99  <Method StreetViewPanoramaCamera getPanoramaCamera()>
	//  188  526:astore_2        
			parcel1.writeNoException();
	//  189  527:aload_3         
	//  190  528:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 191  531:aload_2         
	//* 192  532:ifnull          549
			{
				parcel1.writeInt(1);
	//  193  535:aload_3         
	//  194  536:iconst_1        
	//  195  537:invokevirtual   #66  <Method void Parcel.writeInt(int)>
				((StreetViewPanoramaCamera) (parcel)).writeToParcel(parcel1, 1);
	//  196  540:aload_2         
	//  197  541:aload_3         
	//  198  542:iconst_1        
	//  199  543:invokevirtual   #103 <Method void StreetViewPanoramaCamera.writeToParcel(Parcel, int)>
			} else
	//* 200  546:goto            554
			{
				parcel1.writeInt(0);
	//  201  549:aload_3         
	//  202  550:iconst_0        
	//  203  551:invokevirtual   #66  <Method void Parcel.writeInt(int)>
			}
			return true;
	//  204  554:iconst_1        
	//  205  555:ireturn         

		case 11: // '\013'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  206  556:aload_2         
	//  207  557:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  208  559:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			setPositionWithID(parcel.readString());
	//  209  562:aload_0         
	//  210  563:aload_2         
	//  211  564:invokevirtual   #107 <Method String Parcel.readString()>
	//  212  567:invokevirtual   #110 <Method void setPositionWithID(String)>
			parcel1.writeNoException();
	//  213  570:aload_3         
	//  214  571:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//  215  574:iconst_1        
	//  216  575:ireturn         

		case 12: // '\f'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  217  576:aload_2         
	//  218  577:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  219  579:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 220  582:aload_2         
	//* 221  583:invokevirtual   #41  <Method int Parcel.readInt()>
	//* 222  586:ifeq            605
				parcel = ((Parcel) ((LatLng)LatLng.CREATOR.createFromParcel(parcel)));
	//  223  589:getstatic       #113 <Field android.os.Parcelable$Creator LatLng.CREATOR>
	//  224  592:aload_2         
	//  225  593:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  226  598:checkcast       #112 <Class LatLng>
	//  227  601:astore_2        
			else
	//* 228  602:goto            607
				parcel = null;
	//  229  605:aconst_null     
	//  230  606:astore_2        
			setPosition(((LatLng) (parcel)));
	//  231  607:aload_0         
	//  232  608:aload_2         
	//  233  609:invokevirtual   #117 <Method void setPosition(LatLng)>
			parcel1.writeNoException();
	//  234  612:aload_3         
	//  235  613:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//  236  616:iconst_1        
	//  237  617:ireturn         

		case 13: // '\r'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  238  618:aload_2         
	//  239  619:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  240  621:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			LatLng latlng;
			if(parcel.readInt() != 0)
	//* 241  624:aload_2         
	//* 242  625:invokevirtual   #41  <Method int Parcel.readInt()>
	//* 243  628:ifeq            648
				latlng = (LatLng)LatLng.CREATOR.createFromParcel(parcel);
	//  244  631:getstatic       #113 <Field android.os.Parcelable$Creator LatLng.CREATOR>
	//  245  634:aload_2         
	//  246  635:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  247  640:checkcast       #112 <Class LatLng>
	//  248  643:astore          6
			else
	//* 249  645:goto            651
				latlng = null;
	//  250  648:aconst_null     
	//  251  649:astore          6
			setPositionWithRadius(latlng, parcel.readInt());
	//  252  651:aload_0         
	//  253  652:aload           6
	//  254  654:aload_2         
	//  255  655:invokevirtual   #41  <Method int Parcel.readInt()>
	//  256  658:invokevirtual   #121 <Method void setPositionWithRadius(LatLng, int)>
			parcel1.writeNoException();
	//  257  661:aload_3         
	//  258  662:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//  259  665:iconst_1        
	//  260  666:ireturn         

		case 14: // '\016'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  261  667:aload_2         
	//  262  668:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  263  670:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getStreetViewPanoramaLocation()));
	//  264  673:aload_0         
	//  265  674:invokevirtual   #125 <Method StreetViewPanoramaLocation getStreetViewPanoramaLocation()>
	//  266  677:astore_2        
			parcel1.writeNoException();
	//  267  678:aload_3         
	//  268  679:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 269  682:aload_2         
	//* 270  683:ifnull          700
			{
				parcel1.writeInt(1);
	//  271  686:aload_3         
	//  272  687:iconst_1        
	//  273  688:invokevirtual   #66  <Method void Parcel.writeInt(int)>
				((StreetViewPanoramaLocation) (parcel)).writeToParcel(parcel1, 1);
	//  274  691:aload_2         
	//  275  692:aload_3         
	//  276  693:iconst_1        
	//  277  694:invokevirtual   #128 <Method void StreetViewPanoramaLocation.writeToParcel(Parcel, int)>
			} else
	//* 278  697:goto            705
			{
				parcel1.writeInt(0);
	//  279  700:aload_3         
	//  280  701:iconst_0        
	//  281  702:invokevirtual   #66  <Method void Parcel.writeInt(int)>
			}
			return true;
	//  282  705:iconst_1        
	//  283  706:ireturn         

		case 15: // '\017'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  284  707:aload_2         
	//  285  708:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  286  710:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			setOnStreetViewPanoramaChangeListener(zzac.zza.zzdX(parcel.readStrongBinder()));
	//  287  713:aload_0         
	//  288  714:aload_2         
	//  289  715:invokevirtual   #132 <Method IBinder Parcel.readStrongBinder()>
	//  290  718:invokestatic    #138 <Method zzac zzac$zza.zzdX(IBinder)>
	//  291  721:invokevirtual   #142 <Method void setOnStreetViewPanoramaChangeListener(zzac)>
			parcel1.writeNoException();
	//  292  724:aload_3         
	//  293  725:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//  294  728:iconst_1        
	//  295  729:ireturn         

		case 16: // '\020'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  296  730:aload_2         
	//  297  731:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  298  733:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			setOnStreetViewPanoramaCameraChangeListener(zzab.zza.zzdW(parcel.readStrongBinder()));
	//  299  736:aload_0         
	//  300  737:aload_2         
	//  301  738:invokevirtual   #132 <Method IBinder Parcel.readStrongBinder()>
	//  302  741:invokestatic    #148 <Method zzab zzab$zza.zzdW(IBinder)>
	//  303  744:invokevirtual   #152 <Method void setOnStreetViewPanoramaCameraChangeListener(zzab)>
			parcel1.writeNoException();
	//  304  747:aload_3         
	//  305  748:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//  306  751:iconst_1        
	//  307  752:ireturn         

		case 17: // '\021'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  308  753:aload_2         
	//  309  754:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  310  756:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			setOnStreetViewPanoramaClickListener(zzad.zza.zzdY(parcel.readStrongBinder()));
	//  311  759:aload_0         
	//  312  760:aload_2         
	//  313  761:invokevirtual   #132 <Method IBinder Parcel.readStrongBinder()>
	//  314  764:invokestatic    #158 <Method zzad zzad$zza.zzdY(IBinder)>
	//  315  767:invokevirtual   #162 <Method void setOnStreetViewPanoramaClickListener(zzad)>
			parcel1.writeNoException();
	//  316  770:aload_3         
	//  317  771:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//  318  774:iconst_1        
	//  319  775:ireturn         

		case 18: // '\022'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  320  776:aload_2         
	//  321  777:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  322  779:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (pointToOrientation(com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder()))));
	//  323  782:aload_0         
	//  324  783:aload_2         
	//  325  784:invokevirtual   #132 <Method IBinder Parcel.readStrongBinder()>
	//  326  787:invokestatic    #168 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//  327  790:invokevirtual   #172 <Method StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper)>
	//  328  793:astore_2        
			parcel1.writeNoException();
	//  329  794:aload_3         
	//  330  795:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 331  798:aload_2         
	//* 332  799:ifnull          816
			{
				parcel1.writeInt(1);
	//  333  802:aload_3         
	//  334  803:iconst_1        
	//  335  804:invokevirtual   #66  <Method void Parcel.writeInt(int)>
				((StreetViewPanoramaOrientation) (parcel)).writeToParcel(parcel1, 1);
	//  336  807:aload_2         
	//  337  808:aload_3         
	//  338  809:iconst_1        
	//  339  810:invokevirtual   #175 <Method void StreetViewPanoramaOrientation.writeToParcel(Parcel, int)>
			} else
	//* 340  813:goto            821
			{
				parcel1.writeInt(0);
	//  341  816:aload_3         
	//  342  817:iconst_0        
	//  343  818:invokevirtual   #66  <Method void Parcel.writeInt(int)>
			}
			return true;
	//  344  821:iconst_1        
	//  345  822:ireturn         

		case 19: // '\023'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  346  823:aload_2         
	//  347  824:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  348  826:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 349  829:aload_2         
	//* 350  830:invokevirtual   #41  <Method int Parcel.readInt()>
	//* 351  833:ifeq            852
				parcel = ((Parcel) ((StreetViewPanoramaOrientation)StreetViewPanoramaOrientation.CREATOR.createFromParcel(parcel)));
	//  352  836:getstatic       #176 <Field android.os.Parcelable$Creator StreetViewPanoramaOrientation.CREATOR>
	//  353  839:aload_2         
	//  354  840:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  355  845:checkcast       #174 <Class StreetViewPanoramaOrientation>
	//  356  848:astore_2        
			else
	//* 357  849:goto            854
				parcel = null;
	//  358  852:aconst_null     
	//  359  853:astore_2        
			parcel = ((Parcel) (orientationToPoint(((StreetViewPanoramaOrientation) (parcel)))));
	//  360  854:aload_0         
	//  361  855:aload_2         
	//  362  856:invokevirtual   #180 <Method IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation)>
	//  363  859:astore_2        
			parcel1.writeNoException();
	//  364  860:aload_3         
	//  365  861:invokevirtual   #49  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 366  864:aload_2         
	//* 367  865:ifnull          878
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//  368  868:aload_2         
	//  369  869:invokeinterface #185 <Method IBinder IObjectWrapper.asBinder()>
	//  370  874:astore_2        
			else
	//* 371  875:goto            880
				parcel = null;
	//  372  878:aconst_null     
	//  373  879:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//  374  880:aload_3         
	//  375  881:aload_2         
	//  376  882:invokevirtual   #188 <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//  377  885:iconst_1        
	//  378  886:ireturn         

		case 20: // '\024'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
	//  379  887:aload_2         
	//  380  888:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate">
	//  381  890:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			setOnStreetViewPanoramaLongClickListener(zzae.zza.zzdZ(parcel.readStrongBinder()));
	//  382  893:aload_0         
	//  383  894:aload_2         
	//  384  895:invokevirtual   #132 <Method IBinder Parcel.readStrongBinder()>
	//  385  898:invokestatic    #194 <Method zzae zzae$zza.zzdZ(IBinder)>
	//  386  901:invokevirtual   #198 <Method void setOnStreetViewPanoramaLongClickListener(zzae)>
			parcel1.writeNoException();
	//  387  904:aload_3         
	//  388  905:invokevirtual   #49  <Method void Parcel.writeNoException()>
			return true;
	//  389  908:iconst_1        
	//  390  909:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//  391  910:aload_0         
	//  392  911:iload_1         
	//  393  912:aload_2         
	//  394  913:aload_3         
	//  395  914:iload           4
	//  396  916:invokespecial   #200 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//  397  919:ireturn         
	}
}
