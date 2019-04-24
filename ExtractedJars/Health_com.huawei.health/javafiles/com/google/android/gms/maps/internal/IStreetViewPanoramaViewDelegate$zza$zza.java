// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IStreetViewPanoramaViewDelegate, zzaf, IStreetViewPanoramaDelegate

static class IStreetViewPanoramaViewDelegate$zza$zza
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

	IStreetViewPanoramaViewDelegate$zza$zza(IBinder ibinder)
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
