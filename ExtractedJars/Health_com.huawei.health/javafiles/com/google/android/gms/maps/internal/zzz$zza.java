// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.maps.model.internal.zzg;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzz

public static abstract class zzz$zza extends Binder
	implements zzz
{
	static class zza
		implements zzz
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zza(zzg zzg1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPolygonClickListener");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.internal.IOnPolygonClickListener">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzg1 == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			zzg1 = ((zzg) (zzg1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #40  <Method IBinder zzg.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (zzg1)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(1, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:iconst_1        
		//   19   38:aload_2         
		//   20   39:aload_3         
		//   21   40:iconst_0        
		//   22   41:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   46:pop             
			parcel1.readException();
		//   24   47:aload_3         
		//   25   48:invokevirtual   #52  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   51:aload_3         
		//   27   52:invokevirtual   #55  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   55:aload_2         
		//   29   56:invokevirtual   #55  <Method void Parcel.recycle()>
			return;
		//   30   59:return          
			zzg1;
		//   31   60:astore_1        
			parcel1.recycle();
		//   32   61:aload_3         
		//   33   62:invokevirtual   #55  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   65:aload_2         
		//   35   66:invokevirtual   #55  <Method void Parcel.recycle()>
			throw zzg1;
		//   36   69:aload_1         
		//   37   70:athrow          
_L2:
			zzg1 = null;
		//   38   71:aconst_null     
		//   39   72:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   73:goto            28
_L3:
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


	public static zzz zzdU(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnPolygonClickListener">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzz))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzz>
	//*  12   23:ifeq            31
			return (zzz)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzz>
	//   15   30:areturn         
		else
			return ((zzz) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzz$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzz$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public IBinder asBinder()
	{
		return ((IBinder) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               1: 39
	//	               1598968902: 31
	//*   2   28:goto            62
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IOnPolygonClickListener");
	//    3   31:aload_3         
	//    4   32:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnPolygonClickListener">
	//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
	//    8   39:aload_2         
	//    9   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnPolygonClickListener">
	//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			zza(com.google.android.gms.maps.model.internal.zzg$zza.zzeo(parcel.readStrongBinder()));
	//   11   45:aload_0         
	//   12   46:aload_2         
	//   13   47:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   14   50:invokestatic    #55  <Method zzg com.google.android.gms.maps.model.internal.zzg$zza.zzeo(IBinder)>
	//   15   53:invokevirtual   #58  <Method void zza(zzg)>
			parcel1.writeNoException();
	//   16   56:aload_3         
	//   17   57:invokevirtual   #61  <Method void Parcel.writeNoException()>
			return true;
	//   18   60:iconst_1        
	//   19   61:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   20   62:aload_0         
	//   21   63:iload_1         
	//   22   64:aload_2         
	//   23   65:aload_3         
	//   24   66:iload           4
	//   25   68:invokespecial   #63  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   26   71:ireturn         
	}

	public zzz$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnPolygonClickListener");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnPolygonClickListener">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
