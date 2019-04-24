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

public static abstract class IProjectionDelegate$zza extends Binder
	implements IProjectionDelegate
{
	static class zza
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


	public static IProjectionDelegate zzeb(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.maps.internal.IProjectionDelegate">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IProjectionDelegate))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IProjectionDelegate>
	//*  12   23:ifeq            31
			return (IProjectionDelegate)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IProjectionDelegate>
	//   15   30:areturn         
		else
			return ((IProjectionDelegate) (new zza(ibinder)));
	//   16   31:new             #9   <Class IProjectionDelegate$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void IProjectionDelegate$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               1: 55
	//	               2: 102
	//	               3: 166
	//	               1598968902: 47
	//*   2   44:goto            206
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
	//    3   47:aload_3         
	//    4   48:ldc1            #13  <String "com.google.android.gms.maps.internal.IProjectionDelegate">
	//    5   50:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6   53:iconst_1        
	//    7   54:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
	//    8   55:aload_2         
	//    9   56:ldc1            #13  <String "com.google.android.gms.maps.internal.IProjectionDelegate">
	//   10   58:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (fromScreenLocation(com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder()))));
	//   11   61:aload_0         
	//   12   62:aload_2         
	//   13   63:invokevirtual   #41  <Method IBinder Parcel.readStrongBinder()>
	//   14   66:invokestatic    #47  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   15   69:invokevirtual   #51  <Method LatLng fromScreenLocation(IObjectWrapper)>
	//   16   72:astore_2        
			parcel1.writeNoException();
	//   17   73:aload_3         
	//   18   74:invokevirtual   #55  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  19   77:aload_2         
	//*  20   78:ifnull          95
			{
				parcel1.writeInt(1);
	//   21   81:aload_3         
	//   22   82:iconst_1        
	//   23   83:invokevirtual   #59  <Method void Parcel.writeInt(int)>
				((LatLng) (parcel)).writeToParcel(parcel1, 1);
	//   24   86:aload_2         
	//   25   87:aload_3         
	//   26   88:iconst_1        
	//   27   89:invokevirtual   #65  <Method void LatLng.writeToParcel(Parcel, int)>
			} else
	//*  28   92:goto            100
			{
				parcel1.writeInt(0);
	//   29   95:aload_3         
	//   30   96:iconst_0        
	//   31   97:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			}
			return true;
	//   32  100:iconst_1        
	//   33  101:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
	//   34  102:aload_2         
	//   35  103:ldc1            #13  <String "com.google.android.gms.maps.internal.IProjectionDelegate">
	//   36  105:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  37  108:aload_2         
	//*  38  109:invokevirtual   #69  <Method int Parcel.readInt()>
	//*  39  112:ifeq            131
				parcel = ((Parcel) ((LatLng)LatLng.CREATOR.createFromParcel(parcel)));
	//   40  115:getstatic       #73  <Field android.os.Parcelable$Creator LatLng.CREATOR>
	//   41  118:aload_2         
	//   42  119:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   43  124:checkcast       #61  <Class LatLng>
	//   44  127:astore_2        
			else
	//*  45  128:goto            133
				parcel = null;
	//   46  131:aconst_null     
	//   47  132:astore_2        
			parcel = ((Parcel) (toScreenLocation(((LatLng) (parcel)))));
	//   48  133:aload_0         
	//   49  134:aload_2         
	//   50  135:invokevirtual   #83  <Method IObjectWrapper toScreenLocation(LatLng)>
	//   51  138:astore_2        
			parcel1.writeNoException();
	//   52  139:aload_3         
	//   53  140:invokevirtual   #55  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  54  143:aload_2         
	//*  55  144:ifnull          157
				parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
	//   56  147:aload_2         
	//   57  148:invokeinterface #88  <Method IBinder IObjectWrapper.asBinder()>
	//   58  153:astore_2        
			else
	//*  59  154:goto            159
				parcel = null;
	//   60  157:aconst_null     
	//   61  158:astore_2        
			parcel1.writeStrongBinder(((IBinder) (parcel)));
	//   62  159:aload_3         
	//   63  160:aload_2         
	//   64  161:invokevirtual   #91  <Method void Parcel.writeStrongBinder(IBinder)>
			return true;
	//   65  164:iconst_1        
	//   66  165:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
	//   67  166:aload_2         
	//   68  167:ldc1            #13  <String "com.google.android.gms.maps.internal.IProjectionDelegate">
	//   69  169:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getVisibleRegion()));
	//   70  172:aload_0         
	//   71  173:invokevirtual   #95  <Method VisibleRegion getVisibleRegion()>
	//   72  176:astore_2        
			parcel1.writeNoException();
	//   73  177:aload_3         
	//   74  178:invokevirtual   #55  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  75  181:aload_2         
	//*  76  182:ifnull          199
			{
				parcel1.writeInt(1);
	//   77  185:aload_3         
	//   78  186:iconst_1        
	//   79  187:invokevirtual   #59  <Method void Parcel.writeInt(int)>
				((VisibleRegion) (parcel)).writeToParcel(parcel1, 1);
	//   80  190:aload_2         
	//   81  191:aload_3         
	//   82  192:iconst_1        
	//   83  193:invokevirtual   #98  <Method void VisibleRegion.writeToParcel(Parcel, int)>
			} else
	//*  84  196:goto            204
			{
				parcel1.writeInt(0);
	//   85  199:aload_3         
	//   86  200:iconst_0        
	//   87  201:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			}
			return true;
	//   88  204:iconst_1        
	//   89  205:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   90  206:aload_0         
	//   91  207:iload_1         
	//   92  208:aload_2         
	//   93  209:aload_3         
	//   94  210:iload           4
	//   95  212:invokespecial   #100 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   96  215:ireturn         
	}
}
