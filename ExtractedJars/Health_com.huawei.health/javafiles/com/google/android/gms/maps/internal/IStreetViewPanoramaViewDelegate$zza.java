// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IStreetViewPanoramaViewDelegate, IStreetViewPanoramaDelegate, zzaf

public static abstract class IStreetViewPanoramaViewDelegate$zza extends Binder
	implements IStreetViewPanoramaViewDelegate
{
	static class zza
		implements IStreetViewPanoramaViewDelegate
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public IStreetViewPanoramaDelegate getStreetViewPanorama()
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
			IStreetViewPanoramaDelegate istreetviewpanoramadelegate;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
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
			istreetviewpanoramadelegate = IStreetViewPanoramaDelegate.zza.zzed(parcel1.readStrongBinder());
		//   17   32:aload_2         
		//   18   33:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   19   36:invokestatic    #55  <Method IStreetViewPanoramaDelegate IStreetViewPanoramaDelegate$zza.zzed(IBinder)>
		//   20   39:astore_3        
			parcel1.recycle();
		//   21   40:aload_2         
		//   22   41:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   44:aload_1         
		//   24   45:invokevirtual   #58  <Method void Parcel.recycle()>
			return istreetviewpanoramadelegate;
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

		public void getStreetViewPanoramaAsync(zzaf zzaf1)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(zzaf1 == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          72
_L1:
			zzaf1 = ((zzaf) (zzaf1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #65  <Method IBinder zzaf.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (zzaf1)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(9, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:bipush          9
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
		//   27   53:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   56:aload_2         
		//   29   57:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   60:return          
			zzaf1;
		//   31   61:astore_1        
			parcel1.recycle();
		//   32   62:aload_3         
		//   33   63:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   66:aload_2         
		//   35   67:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzaf1;
		//   36   70:aload_1         
		//   37   71:athrow          
_L2:
			zzaf1 = null;
		//   38   72:aconst_null     
		//   39   73:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   74:goto            28
_L3:
		}

		public IObjectWrapper getView()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(8, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          8
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   17   33:aload_2         
		//   18   34:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   19   37:invokestatic    #76  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   20   40:astore_3        
			parcel1.recycle();
		//   21   41:aload_2         
		//   22   42:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   45:aload_1         
		//   24   46:invokevirtual   #58  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   25   49:aload_3         
		//   26   50:areturn         
			Exception exception;
			exception;
		//   27   51:astore_3        
			parcel1.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   56:aload_1         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   32   60:aload_3         
		//   33   61:athrow          
		}

		public void onCreate(Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #88  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			zzrk.transact(2, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:iconst_2        
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
		//   31   56:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   59:aload_2         
		//   33   60:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   63:return          
			bundle;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw bundle;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void onDestroy()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(5, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_5        
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
		//   18   33:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public void onLowMemory()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(6, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          6
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void onPause()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
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
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public void onResume()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(3, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_3        
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
		//   18   33:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public void onSaveInstanceState(Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #88  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			zzrk.transact(7, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          7
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #46  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
		//*  30   56:aload_3         
		//*  31   57:invokevirtual   #97  <Method int Parcel.readInt()>
		//*  32   60:ifeq            68
				bundle.readFromParcel(parcel1);
		//   33   63:aload_1         
		//   34   64:aload_3         
		//   35   65:invokevirtual   #101 <Method void Bundle.readFromParcel(Parcel)>
			parcel1.recycle();
		//   36   68:aload_3         
		//   37   69:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   72:aload_2         
		//   39   73:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   40   76:return          
			bundle;
		//   41   77:astore_1        
			parcel1.recycle();
		//   42   78:aload_3         
		//   43   79:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   44   82:aload_2         
		//   45   83:invokevirtual   #58  <Method void Parcel.recycle()>
			throw bundle;
		//   46   86:aload_1         
		//   47   87:athrow          
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


	public static IStreetViewPanoramaViewDelegate zzef(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IStreetViewPanoramaViewDelegate))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IStreetViewPanoramaViewDelegate>
	//*  12   23:ifeq            31
			return (IStreetViewPanoramaViewDelegate)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IStreetViewPanoramaViewDelegate>
	//   15   30:areturn         
		else
			return ((IStreetViewPanoramaViewDelegate) (new zza(ibinder)));
	//   16   31:new             #9   <Class IStreetViewPanoramaViewDelegate$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void IStreetViewPanoramaViewDelegate$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    10: default 92
	//	               1: 103
	//	               2: 141
	//	               3: 183
	//	               4: 199
	//	               5: 215
	//	               6: 231
	//	               7: 247
	//	               8: 312
	//	               9: 350
	//	               1598968902: 95
	//*   2   92:goto            373
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//    3   95:aload_3         
	//    4   96:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//    5   98:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6  101:iconst_1        
	//    7  102:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//    8  103:aload_2         
	//    9  104:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//   10  106:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getStreetViewPanorama()));
	//   11  109:aload_0         
	//   12  110:invokevirtual   #41  <Method IStreetViewPanoramaDelegate getStreetViewPanorama()>
	//   13  113:astore_2        
			parcel1.writeNoException();
	//   14  114:aload_3         
	//   15  115:invokevirtual   #45  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  16  118:aload_2         
	//*  17  119:ifnull          132
				parcel = ((Parcel) (((IStreetViewPanoramaDelegate) (parcel)).asBinder()));
	//   18  122:aload_2         
	//   19  123:invokeinterface #51  <Method IBinder IStreetViewPanoramaDelegate.asBinder()>
	//   20  128:astore_2        
			else
	//*  21  129:goto            134
				parcel = null;
	//   22  132:aconst_null     
	//   23  133:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//   24  134:aload_3         
	//   25  135:aload_2         
	//   26  136:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//   27  139:iconst_1        
	//   28  140:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//   29  141:aload_2         
	//   30  142:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//   31  144:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  32  147:aload_2         
	//*  33  148:invokevirtual   #58  <Method int Parcel.readInt()>
	//*  34  151:ifeq            170
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   35  154:getstatic       #64  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   36  157:aload_2         
	//   37  158:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   38  163:checkcast       #60  <Class Bundle>
	//   39  166:astore_2        
			else
	//*  40  167:goto            172
				parcel = null;
	//   41  170:aconst_null     
	//   42  171:astore_2        
			onCreate(((Bundle) (parcel)));
	//   43  172:aload_0         
	//   44  173:aload_2         
	//   45  174:invokevirtual   #74  <Method void onCreate(Bundle)>
			parcel1.writeNoException();
	//   46  177:aload_3         
	//   47  178:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//   48  181:iconst_1        
	//   49  182:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//   50  183:aload_2         
	//   51  184:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//   52  186:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			onResume();
	//   53  189:aload_0         
	//   54  190:invokevirtual   #77  <Method void onResume()>
			parcel1.writeNoException();
	//   55  193:aload_3         
	//   56  194:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//   57  197:iconst_1        
	//   58  198:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//   59  199:aload_2         
	//   60  200:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//   61  202:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			onPause();
	//   62  205:aload_0         
	//   63  206:invokevirtual   #80  <Method void onPause()>
			parcel1.writeNoException();
	//   64  209:aload_3         
	//   65  210:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//   66  213:iconst_1        
	//   67  214:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//   68  215:aload_2         
	//   69  216:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//   70  218:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			onDestroy();
	//   71  221:aload_0         
	//   72  222:invokevirtual   #83  <Method void onDestroy()>
			parcel1.writeNoException();
	//   73  225:aload_3         
	//   74  226:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//   75  229:iconst_1        
	//   76  230:ireturn         

		case 6: // '\006'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//   77  231:aload_2         
	//   78  232:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//   79  234:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			onLowMemory();
	//   80  237:aload_0         
	//   81  238:invokevirtual   #86  <Method void onLowMemory()>
			parcel1.writeNoException();
	//   82  241:aload_3         
	//   83  242:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//   84  245:iconst_1        
	//   85  246:ireturn         

		case 7: // '\007'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//   86  247:aload_2         
	//   87  248:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//   88  250:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  89  253:aload_2         
	//*  90  254:invokevirtual   #58  <Method int Parcel.readInt()>
	//*  91  257:ifeq            276
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   92  260:getstatic       #64  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   93  263:aload_2         
	//   94  264:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   95  269:checkcast       #60  <Class Bundle>
	//   96  272:astore_2        
			else
	//*  97  273:goto            278
				parcel = null;
	//   98  276:aconst_null     
	//   99  277:astore_2        
			onSaveInstanceState(((Bundle) (parcel)));
	//  100  278:aload_0         
	//  101  279:aload_2         
	//  102  280:invokevirtual   #89  <Method void onSaveInstanceState(Bundle)>
			parcel1.writeNoException();
	//  103  283:aload_3         
	//  104  284:invokevirtual   #45  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 105  287:aload_2         
	//* 106  288:ifnull          305
			{
				parcel1.writeInt(1);
	//  107  291:aload_3         
	//  108  292:iconst_1        
	//  109  293:invokevirtual   #93  <Method void Parcel.writeInt(int)>
				((Bundle) (parcel)).writeToParcel(parcel1, 1);
	//  110  296:aload_2         
	//  111  297:aload_3         
	//  112  298:iconst_1        
	//  113  299:invokevirtual   #97  <Method void Bundle.writeToParcel(Parcel, int)>
			} else
	//* 114  302:goto            310
			{
				parcel1.writeInt(0);
	//  115  305:aload_3         
	//  116  306:iconst_0        
	//  117  307:invokevirtual   #93  <Method void Parcel.writeInt(int)>
			}
			return true;
	//  118  310:iconst_1        
	//  119  311:ireturn         

		case 8: // '\b'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//  120  312:aload_2         
	//  121  313:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//  122  315:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getView()));
	//  123  318:aload_0         
	//  124  319:invokevirtual   #101 <Method IObjectWrapper getView()>
	//  125  322:astore_2        
			parcel1.writeNoException();
	//  126  323:aload_3         
	//  127  324:invokevirtual   #45  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 128  327:aload_2         
	//* 129  328:ifnull          341
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//  130  331:aload_2         
	//  131  332:invokeinterface #104 <Method IBinder IObjectWrapper.asBinder()>
	//  132  337:astore_2        
			else
	//* 133  338:goto            343
				parcel = null;
	//  134  341:aconst_null     
	//  135  342:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//  136  343:aload_3         
	//  137  344:aload_2         
	//  138  345:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//  139  348:iconst_1        
	//  140  349:ireturn         

		case 9: // '\t'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
	//  141  350:aload_2         
	//  142  351:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate">
	//  143  353:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			getStreetViewPanoramaAsync(zzaf.zza.zzea(parcel.readStrongBinder()));
	//  144  356:aload_0         
	//  145  357:aload_2         
	//  146  358:invokevirtual   #107 <Method IBinder Parcel.readStrongBinder()>
	//  147  361:invokestatic    #113 <Method zzaf zzaf$zza.zzea(IBinder)>
	//  148  364:invokevirtual   #117 <Method void getStreetViewPanoramaAsync(zzaf)>
			parcel1.writeNoException();
	//  149  367:aload_3         
	//  150  368:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//  151  371:iconst_1        
	//  152  372:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//  153  373:aload_0         
	//  154  374:iload_1         
	//  155  375:aload_2         
	//  156  376:aload_3         
	//  157  377:iload           4
	//  158  379:invokespecial   #119 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//  159  382:ireturn         
	}
}
