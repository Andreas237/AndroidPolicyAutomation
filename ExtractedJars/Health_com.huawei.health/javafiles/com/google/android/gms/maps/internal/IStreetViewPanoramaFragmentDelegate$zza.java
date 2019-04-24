// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IStreetViewPanoramaFragmentDelegate, IStreetViewPanoramaDelegate, zzaf

public static abstract class IStreetViewPanoramaFragmentDelegate$zza extends Binder
	implements IStreetViewPanoramaFragmentDelegate
{
	static class zza
		implements IStreetViewPanoramaFragmentDelegate
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
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
			zzrk.transact(12, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:bipush          12
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

		public boolean isReady()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(11, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          11
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
		//   18   38:invokevirtual   #74  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #80  <Method void Parcel.writeInt(int)>
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

		public IObjectWrapper onCreateView(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4   10:aload           4
		//    5   12:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
		//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(iobjectwrapper == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          138
_L1:
			iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #91  <Method IBinder IObjectWrapper.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L3:
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
		//   13   31:aload           4
		//   14   33:aload_1         
		//   15   34:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
			if(iobjectwrapper1 == null)
				break MISSING_BLOCK_LABEL_143;
		//   16   37:aload_2         
		//   17   38:ifnull          143
			iobjectwrapper = ((IObjectWrapper) (iobjectwrapper1.asBinder()));
		//   18   41:aload_2         
		//   19   42:invokeinterface #91  <Method IBinder IObjectWrapper.asBinder()>
		//   20   47:astore_1        
		//*  21   48:goto            51
_L4:
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
		//   22   51:aload           4
		//   23   53:aload_1         
		//   24   54:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_77;
		//   25   57:aload_3         
		//   26   58:ifnull          77
			parcel.writeInt(1);
		//   27   61:aload           4
		//   28   63:iconst_1        
		//   29   64:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   30   67:aload_3         
		//   31   68:aload           4
		//   32   70:iconst_0        
		//   33   71:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_83;
		//   34   74:goto            83
			parcel.writeInt(0);
		//   35   77:aload           4
		//   36   79:iconst_0        
		//   37   80:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			zzrk.transact(4, parcel, parcel1, 0);
		//   38   83:aload_0         
		//   39   84:getfield        #18  <Field IBinder zzrk>
		//   40   87:iconst_4        
		//   41   88:aload           4
		//   42   90:aload           5
		//   43   92:iconst_0        
		//   44   93:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   45   98:pop             
			parcel1.readException();
		//   46   99:aload           5
		//   47  101:invokevirtual   #46  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   48  104:aload           5
		//   49  106:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   50  109:invokestatic    #97  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   51  112:astore_1        
			parcel1.recycle();
		//   52  113:aload           5
		//   53  115:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   54  118:aload           4
		//   55  120:invokevirtual   #58  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   56  123:aload_1         
		//   57  124:areturn         
			iobjectwrapper;
		//   58  125:astore_1        
			parcel1.recycle();
		//   59  126:aload           5
		//   60  128:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   61  131:aload           4
		//   62  133:invokevirtual   #58  <Method void Parcel.recycle()>
			throw iobjectwrapper;
		//   63  136:aload_1         
		//   64  137:athrow          
_L2:
			iobjectwrapper = null;
		//   65  138:aconst_null     
		//   66  139:astore_1        
			  goto _L3
		//*  67  140:goto            31
			iobjectwrapper = null;
		//   68  143:aconst_null     
		//   69  144:astore_1        
			  goto _L4
		//*  70  145:goto            51
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
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

		public void onDestroyView()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(7, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          7
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

		public void onInflate(IObjectWrapper iobjectwrapper, StreetViewPanoramaOptions streetviewpanoramaoptions, Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4   10:aload           4
		//    5   12:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
		//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(iobjectwrapper == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          134
_L1:
			iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #91  <Method IBinder IObjectWrapper.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
		//   13   31:aload           4
		//   14   33:aload_1         
		//   15   34:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
			if(streetviewpanoramaoptions == null)
				break MISSING_BLOCK_LABEL_57;
		//   16   37:aload_2         
		//   17   38:ifnull          57
			parcel.writeInt(1);
		//   18   41:aload           4
		//   19   43:iconst_1        
		//   20   44:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			streetviewpanoramaoptions.writeToParcel(parcel, 0);
		//   21   47:aload_2         
		//   22   48:aload           4
		//   23   50:iconst_0        
		//   24   51:invokevirtual   #104 <Method void StreetViewPanoramaOptions.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_63;
		//   25   54:goto            63
			parcel.writeInt(0);
		//   26   57:aload           4
		//   27   59:iconst_0        
		//   28   60:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_83;
		//   29   63:aload_3         
		//   30   64:ifnull          83
			parcel.writeInt(1);
		//   31   67:aload           4
		//   32   69:iconst_1        
		//   33   70:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   34   73:aload_3         
		//   35   74:aload           4
		//   36   76:iconst_0        
		//   37   77:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_89;
		//   38   80:goto            89
			parcel.writeInt(0);
		//   39   83:aload           4
		//   40   85:iconst_0        
		//   41   86:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			zzrk.transact(2, parcel, parcel1, 0);
		//   42   89:aload_0         
		//   43   90:getfield        #18  <Field IBinder zzrk>
		//   44   93:iconst_2        
		//   45   94:aload           4
		//   46   96:aload           5
		//   47   98:iconst_0        
		//   48   99:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   49  104:pop             
			parcel1.readException();
		//   50  105:aload           5
		//   51  107:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   52  110:aload           5
		//   53  112:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   54  115:aload           4
		//   55  117:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   56  120:return          
			iobjectwrapper;
		//   57  121:astore_1        
			parcel1.recycle();
		//   58  122:aload           5
		//   59  124:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   60  127:aload           4
		//   61  129:invokevirtual   #58  <Method void Parcel.recycle()>
			throw iobjectwrapper;
		//   62  132:aload_1         
		//   63  133:athrow          
_L2:
			iobjectwrapper = null;
		//   64  134:aconst_null     
		//   65  135:astore_1        
			if(true) goto _L4; else goto _L3
		//   66  136:goto            31
_L3:
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(9, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          9
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			zzrk.transact(10, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          10
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
		//*  31   57:invokevirtual   #74  <Method int Parcel.readInt()>
		//*  32   60:ifeq            68
				bundle.readFromParcel(parcel1);
		//   33   63:aload_1         
		//   34   64:aload_3         
		//   35   65:invokevirtual   #112 <Method void Bundle.readFromParcel(Parcel)>
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


	public static IStreetViewPanoramaFragmentDelegate zzee(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IStreetViewPanoramaFragmentDelegate))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IStreetViewPanoramaFragmentDelegate>
	//*  12   23:ifeq            31
			return (IStreetViewPanoramaFragmentDelegate)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IStreetViewPanoramaFragmentDelegate>
	//   15   30:areturn         
		else
			return ((IStreetViewPanoramaFragmentDelegate) (new zza(ibinder)));
	//   16   31:new             #9   <Class IStreetViewPanoramaFragmentDelegate$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void IStreetViewPanoramaFragmentDelegate$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    13: default 116
	//	               1: 127
	//	               2: 165
	//	               3: 247
	//	               4: 289
	//	               5: 375
	//	               6: 391
	//	               7: 407
	//	               8: 423
	//	               9: 439
	//	               10: 455
	//	               11: 520
	//	               12: 555
	//	               1598968902: 119
	//*   2  116:goto            578
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//    3  119:aload_3         
	//    4  120:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//    5  122:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6  125:iconst_1        
	//    7  126:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//    8  127:aload_2         
	//    9  128:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//   10  130:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getStreetViewPanorama()));
	//   11  133:aload_0         
	//   12  134:invokevirtual   #41  <Method IStreetViewPanoramaDelegate getStreetViewPanorama()>
	//   13  137:astore_2        
			parcel1.writeNoException();
	//   14  138:aload_3         
	//   15  139:invokevirtual   #45  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  16  142:aload_2         
	//*  17  143:ifnull          156
				parcel = ((Parcel) (((IStreetViewPanoramaDelegate) (parcel)).asBinder()));
	//   18  146:aload_2         
	//   19  147:invokeinterface #51  <Method IBinder IStreetViewPanoramaDelegate.asBinder()>
	//   20  152:astore_2        
			else
	//*  21  153:goto            158
				parcel = null;
	//   22  156:aconst_null     
	//   23  157:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//   24  158:aload_3         
	//   25  159:aload_2         
	//   26  160:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//   27  163:iconst_1        
	//   28  164:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//   29  165:aload_2         
	//   30  166:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//   31  168:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			IObjectWrapper iobjectwrapper1 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder());
	//   32  171:aload_2         
	//   33  172:invokevirtual   #57  <Method IBinder Parcel.readStrongBinder()>
	//   34  175:invokestatic    #63  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   35  178:astore          7
			StreetViewPanoramaOptions streetviewpanoramaoptions;
			if(parcel.readInt() != 0)
	//*  36  180:aload_2         
	//*  37  181:invokevirtual   #67  <Method int Parcel.readInt()>
	//*  38  184:ifeq            204
				streetviewpanoramaoptions = (StreetViewPanoramaOptions)StreetViewPanoramaOptions.CREATOR.createFromParcel(parcel);
	//   39  187:getstatic       #73  <Field android.os.Parcelable$Creator StreetViewPanoramaOptions.CREATOR>
	//   40  190:aload_2         
	//   41  191:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   42  196:checkcast       #69  <Class StreetViewPanoramaOptions>
	//   43  199:astore          6
			else
	//*  44  201:goto            207
				streetviewpanoramaoptions = null;
	//   45  204:aconst_null     
	//   46  205:astore          6
			if(parcel.readInt() != 0)
	//*  47  207:aload_2         
	//*  48  208:invokevirtual   #67  <Method int Parcel.readInt()>
	//*  49  211:ifeq            230
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   50  214:getstatic       #82  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   51  217:aload_2         
	//   52  218:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   53  223:checkcast       #81  <Class Bundle>
	//   54  226:astore_2        
			else
	//*  55  227:goto            232
				parcel = null;
	//   56  230:aconst_null     
	//   57  231:astore_2        
			onInflate(iobjectwrapper1, streetviewpanoramaoptions, ((Bundle) (parcel)));
	//   58  232:aload_0         
	//   59  233:aload           7
	//   60  235:aload           6
	//   61  237:aload_2         
	//   62  238:invokevirtual   #86  <Method void onInflate(IObjectWrapper, StreetViewPanoramaOptions, Bundle)>
			parcel1.writeNoException();
	//   63  241:aload_3         
	//   64  242:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//   65  245:iconst_1        
	//   66  246:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//   67  247:aload_2         
	//   68  248:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//   69  250:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  70  253:aload_2         
	//*  71  254:invokevirtual   #67  <Method int Parcel.readInt()>
	//*  72  257:ifeq            276
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   73  260:getstatic       #82  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   74  263:aload_2         
	//   75  264:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   76  269:checkcast       #81  <Class Bundle>
	//   77  272:astore_2        
			else
	//*  78  273:goto            278
				parcel = null;
	//   79  276:aconst_null     
	//   80  277:astore_2        
			onCreate(((Bundle) (parcel)));
	//   81  278:aload_0         
	//   82  279:aload_2         
	//   83  280:invokevirtual   #90  <Method void onCreate(Bundle)>
			parcel1.writeNoException();
	//   84  283:aload_3         
	//   85  284:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//   86  287:iconst_1        
	//   87  288:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//   88  289:aload_2         
	//   89  290:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//   90  292:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder());
	//   91  295:aload_2         
	//   92  296:invokevirtual   #57  <Method IBinder Parcel.readStrongBinder()>
	//   93  299:invokestatic    #63  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   94  302:astore          6
			IObjectWrapper iobjectwrapper2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder());
	//   95  304:aload_2         
	//   96  305:invokevirtual   #57  <Method IBinder Parcel.readStrongBinder()>
	//   97  308:invokestatic    #63  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   98  311:astore          7
			if(parcel.readInt() != 0)
	//*  99  313:aload_2         
	//* 100  314:invokevirtual   #67  <Method int Parcel.readInt()>
	//* 101  317:ifeq            336
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//  102  320:getstatic       #82  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  103  323:aload_2         
	//  104  324:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  105  329:checkcast       #81  <Class Bundle>
	//  106  332:astore_2        
			else
	//* 107  333:goto            338
				parcel = null;
	//  108  336:aconst_null     
	//  109  337:astore_2        
			parcel = ((Parcel) (onCreateView(iobjectwrapper, iobjectwrapper2, ((Bundle) (parcel)))));
	//  110  338:aload_0         
	//  111  339:aload           6
	//  112  341:aload           7
	//  113  343:aload_2         
	//  114  344:invokevirtual   #94  <Method IObjectWrapper onCreateView(IObjectWrapper, IObjectWrapper, Bundle)>
	//  115  347:astore_2        
			parcel1.writeNoException();
	//  116  348:aload_3         
	//  117  349:invokevirtual   #45  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 118  352:aload_2         
	//* 119  353:ifnull          366
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//  120  356:aload_2         
	//  121  357:invokeinterface #97  <Method IBinder IObjectWrapper.asBinder()>
	//  122  362:astore_2        
			else
	//* 123  363:goto            368
				parcel = null;
	//  124  366:aconst_null     
	//  125  367:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//  126  368:aload_3         
	//  127  369:aload_2         
	//  128  370:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//  129  373:iconst_1        
	//  130  374:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//  131  375:aload_2         
	//  132  376:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//  133  378:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			onResume();
	//  134  381:aload_0         
	//  135  382:invokevirtual   #100 <Method void onResume()>
			parcel1.writeNoException();
	//  136  385:aload_3         
	//  137  386:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//  138  389:iconst_1        
	//  139  390:ireturn         

		case 6: // '\006'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//  140  391:aload_2         
	//  141  392:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//  142  394:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			onPause();
	//  143  397:aload_0         
	//  144  398:invokevirtual   #103 <Method void onPause()>
			parcel1.writeNoException();
	//  145  401:aload_3         
	//  146  402:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//  147  405:iconst_1        
	//  148  406:ireturn         

		case 7: // '\007'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//  149  407:aload_2         
	//  150  408:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//  151  410:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			onDestroyView();
	//  152  413:aload_0         
	//  153  414:invokevirtual   #106 <Method void onDestroyView()>
			parcel1.writeNoException();
	//  154  417:aload_3         
	//  155  418:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//  156  421:iconst_1        
	//  157  422:ireturn         

		case 8: // '\b'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//  158  423:aload_2         
	//  159  424:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//  160  426:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			onDestroy();
	//  161  429:aload_0         
	//  162  430:invokevirtual   #109 <Method void onDestroy()>
			parcel1.writeNoException();
	//  163  433:aload_3         
	//  164  434:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//  165  437:iconst_1        
	//  166  438:ireturn         

		case 9: // '\t'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//  167  439:aload_2         
	//  168  440:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//  169  442:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			onLowMemory();
	//  170  445:aload_0         
	//  171  446:invokevirtual   #112 <Method void onLowMemory()>
			parcel1.writeNoException();
	//  172  449:aload_3         
	//  173  450:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//  174  453:iconst_1        
	//  175  454:ireturn         

		case 10: // '\n'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//  176  455:aload_2         
	//  177  456:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//  178  458:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 179  461:aload_2         
	//* 180  462:invokevirtual   #67  <Method int Parcel.readInt()>
	//* 181  465:ifeq            484
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//  182  468:getstatic       #82  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  183  471:aload_2         
	//  184  472:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  185  477:checkcast       #81  <Class Bundle>
	//  186  480:astore_2        
			else
	//* 187  481:goto            486
				parcel = null;
	//  188  484:aconst_null     
	//  189  485:astore_2        
			onSaveInstanceState(((Bundle) (parcel)));
	//  190  486:aload_0         
	//  191  487:aload_2         
	//  192  488:invokevirtual   #115 <Method void onSaveInstanceState(Bundle)>
			parcel1.writeNoException();
	//  193  491:aload_3         
	//  194  492:invokevirtual   #45  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 195  495:aload_2         
	//* 196  496:ifnull          513
			{
				parcel1.writeInt(1);
	//  197  499:aload_3         
	//  198  500:iconst_1        
	//  199  501:invokevirtual   #119 <Method void Parcel.writeInt(int)>
				((Bundle) (parcel)).writeToParcel(parcel1, 1);
	//  200  504:aload_2         
	//  201  505:aload_3         
	//  202  506:iconst_1        
	//  203  507:invokevirtual   #123 <Method void Bundle.writeToParcel(Parcel, int)>
			} else
	//* 204  510:goto            518
			{
				parcel1.writeInt(0);
	//  205  513:aload_3         
	//  206  514:iconst_0        
	//  207  515:invokevirtual   #119 <Method void Parcel.writeInt(int)>
			}
			return true;
	//  208  518:iconst_1        
	//  209  519:ireturn         

		case 11: // '\013'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//  210  520:aload_2         
	//  211  521:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//  212  523:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag = isReady();
	//  213  526:aload_0         
	//  214  527:invokevirtual   #127 <Method boolean isReady()>
	//  215  530:istore          5
			parcel1.writeNoException();
	//  216  532:aload_3         
	//  217  533:invokevirtual   #45  <Method void Parcel.writeNoException()>
			if(flag)
	//* 218  536:iload           5
	//* 219  538:ifeq            546
				i = 1;
	//  220  541:iconst_1        
	//  221  542:istore_1        
			else
	//* 222  543:goto            548
				i = 0;
	//  223  546:iconst_0        
	//  224  547:istore_1        
			parcel1.writeInt(i);
	//  225  548:aload_3         
	//  226  549:iload_1         
	//  227  550:invokevirtual   #119 <Method void Parcel.writeInt(int)>
			return true;
	//  228  553:iconst_1        
	//  229  554:ireturn         

		case 12: // '\f'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
	//  230  555:aload_2         
	//  231  556:ldc1            #13  <String "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate">
	//  232  558:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			getStreetViewPanoramaAsync(zzaf.zza.zzea(parcel.readStrongBinder()));
	//  233  561:aload_0         
	//  234  562:aload_2         
	//  235  563:invokevirtual   #57  <Method IBinder Parcel.readStrongBinder()>
	//  236  566:invokestatic    #133 <Method zzaf zzaf$zza.zzea(IBinder)>
	//  237  569:invokevirtual   #137 <Method void getStreetViewPanoramaAsync(zzaf)>
			parcel1.writeNoException();
	//  238  572:aload_3         
	//  239  573:invokevirtual   #45  <Method void Parcel.writeNoException()>
			return true;
	//  240  576:iconst_1        
	//  241  577:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//  242  578:aload_0         
	//  243  579:iload_1         
	//  244  580:aload_2         
	//  245  581:aload_3         
	//  246  582:iload           4
	//  247  584:invokespecial   #139 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//  248  587:ireturn         
	}
}
